/*
 * Copyright (c) 2025 Airbyte, Inc., all rights reserved.
 */

package io.airbyte.integrations.destination.bigquery.write.typing_deduping

import com.google.cloud.bigquery.TableId
import io.airbyte.cdk.load.command.DestinationStream
import io.airbyte.cdk.load.orchestration.db.ColumnNameGenerator
import io.airbyte.cdk.load.orchestration.db.FinalTableNameGenerator
import io.airbyte.cdk.load.orchestration.db.RawTableNameGenerator
import io.airbyte.cdk.load.orchestration.db.TableName
import io.airbyte.cdk.load.orchestration.db.legacy_typing_deduping.TypingDedupingUtil
import io.airbyte.integrations.destination.bigquery.BigQuerySQLNameTransformer
import io.airbyte.integrations.destination.bigquery.spec.BigqueryConfiguration
import java.util.Locale
import javax.inject.Singleton

private val nameTransformer = BigQuerySQLNameTransformer()

@Singleton
class BigqueryRawTableNameGenerator(val config: BigqueryConfiguration) : RawTableNameGenerator {
    override fun getTableName(streamDescriptor: DestinationStream.Descriptor) =
        TableName(
            nameTransformer.getNamespace(config.internalTableDataset),
            nameTransformer.convertStreamName(
                TypingDedupingUtil.concatenateRawTableName(
                    streamDescriptor.namespace ?: config.datasetId,
                    streamDescriptor.name,
                )
            ),
        )
}

@Singleton
class BigqueryFinalTableNameGenerator(val config: BigqueryConfiguration) : FinalTableNameGenerator {
    override fun getTableName(streamDescriptor: DestinationStream.Descriptor) =
        TableName(
            nameTransformer.getNamespace(streamDescriptor.namespace ?: config.datasetId),
            nameTransformer.convertStreamName(streamDescriptor.name),
        )
}

@Singleton
class BigqueryColumnNameGenerator : ColumnNameGenerator {
    override fun getColumnName(column: String): ColumnNameGenerator.ColumnName {
        return ColumnNameGenerator.ColumnName(
            nameTransformer.convertStreamName(column),
            // Bigquery columns are case-insensitive, so do all our validation on the
            // lowercased name
            nameTransformer.convertStreamName(column.lowercase(Locale.getDefault())),
        )
    }
}

fun TableName.toTableId(): TableId = TableId.of(this.namespace, this.name)
