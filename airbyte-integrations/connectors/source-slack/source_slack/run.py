#
# Copyright (c) 2023 Airbyte, Inc., all rights reserved.
#


import sys
import traceback
from datetime import datetime
from typing import List

from orjson import orjson

from airbyte_cdk.entrypoint import AirbyteEntrypoint, launch, logger
from airbyte_cdk.exception_handler import init_uncaught_exception_handler
from airbyte_cdk.models import AirbyteErrorTraceMessage, AirbyteMessage, AirbyteMessageSerializer, AirbyteTraceMessage, TraceType, Type
from source_slack import SourceSlack
from source_slack.config_migrations import MigrateLegacyConfig


def _get_source(args: List[str]):
    catalog_path = AirbyteEntrypoint.extract_catalog(args)
    config_path = AirbyteEntrypoint.extract_config(args)
    state_path = AirbyteEntrypoint.extract_state(args)
    try:
        return SourceSlack(
            SourceSlack.read_catalog(catalog_path) if catalog_path else None,
            SourceSlack.read_config(config_path) if config_path else None,
            SourceSlack.read_state(state_path) if state_path else None,
        )
    except Exception as error:
        print(
            orjson.dumps(
                AirbyteMessageSerializer.dump(
                    AirbyteMessage(
                        type=Type.TRACE,
                        trace=AirbyteTraceMessage(
                            type=TraceType.ERROR,
                            emitted_at=int(datetime.now().timestamp() * 1000),
                            error=AirbyteErrorTraceMessage(
                                message=f"Error starting the sync. This could be due to an invalid configuration or catalog. Please contact Support for assistance. Error: {error}",
                                stack_trace=traceback.format_exc(),
                            ),
                        ),
                    )
                )
            ).decode()
        )
        return None


def run():
    init_uncaught_exception_handler(logger)
    _args = sys.argv[1:]
    source = _get_source(_args)
    MigrateLegacyConfig.migrate(sys.argv[1:], source)
    if source:
        launch(source, _args)
