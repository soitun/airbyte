# Planhat

This source can sync data for the [general Planhat API](https://docs.planhat.com/).

This Source is capable of syncing the following core Streams:

- [companies](https://docs.planhat.com/#companies)
- [conversations](https://docs.planhat.com/#conversations)
- [custom_fields](https://docs.planhat.com/#custom_fields)
- [endusers](https://docs.planhat.com/#endusers)
- [invoices](https://docs.planhat.com/#invoices)
- [issues](https://docs.planhat.com/#issues)
- [licenses](https://docs.planhat.com/#licenses)
- [nps](https://docs.planhat.com/#nps)
- [opportunities](https://docs.planhat.com/#opportunities)
- [objectives](https://docs.planhat.com/#objectives)
- [sales](https://docs.planhat.com/#sales)
- [tasks](https://docs.planhat.com/#tasks)
- [tickets](https://docs.planhat.com/#tickets)
- [users](https://docs.planhat.com/#users)

## Configuration

| Input       | Type     | Description                                                                          | Default Value |
| ----------- | -------- | ------------------------------------------------------------------------------------ | ------------- |
| `api_token` | `string` | API Token. Your Planhat [API Access Token](https://docs.planhat.com/#authentication) |               |

## Streams

| Stream Name     | Primary Key | Pagination       | Supports Full Sync | Supports Incremental |
| --------------- | ----------- | ---------------- | ------------------ | -------------------- |
| `assets`        | `_id`       | DefaultPaginator | ✅                 | ❌                   |
| `churn`         | `_id`       | DefaultPaginator | ✅                 | ❌                   |
| `companies`     | `_id`       | DefaultPaginator | ✅                 | ❌                   |
| `conversations` | `_id`       | DefaultPaginator | ✅                 | ❌                   |
| `custom_fields` | `_id`       | DefaultPaginator | ✅                 | ❌                   |
| `endusers`      | `_id`       | DefaultPaginator | ✅                 | ❌                   |
| `invoices`      | `_id`       | DefaultPaginator | ✅                 | ❌                   |
| `issues`        | `_id`       | DefaultPaginator | ✅                 | ❌                   |
| `licenses`      | `_id`       | DefaultPaginator | ✅                 | ❌                   |
| `nps`           | `_id`       | DefaultPaginator | ✅                 | ❌                   |
| `workflows`     | `_id`       | DefaultPaginator | ✅                 | ❌                   |
| `opportunities` | `_id`       | DefaultPaginator | ✅                 | ❌                   |
| `objectives`    | `_id`       | DefaultPaginator | ✅                 | ❌                   |
| `sales`         | `_id`       | DefaultPaginator | ✅                 | ❌                   |
| `tasks`         | `_id`       | DefaultPaginator | ✅                 | ❌                   |
| `tickets`       | `_id`       | DefaultPaginator | ✅                 | ❌                   |
| `users`         | `_id`       | DefaultPaginator | ✅                 | ❌                   |

## Changelog

<details>
  <summary>Expand to review</summary>

| Version | Date       | Pull Request | Subject                                              |
| ------- | ---------- | ------------ | ---------------------------------------------------- |
| 0.0.33 | 2025-07-26 | [63867](https://github.com/airbytehq/airbyte/pull/63867) | Update dependencies |
| 0.0.32 | 2025-07-19 | [63401](https://github.com/airbytehq/airbyte/pull/63401) | Update dependencies |
| 0.0.31 | 2025-07-12 | [63222](https://github.com/airbytehq/airbyte/pull/63222) | Update dependencies |
| 0.0.30 | 2025-07-05 | [62605](https://github.com/airbytehq/airbyte/pull/62605) | Update dependencies |
| 0.0.29 | 2025-06-28 | [62297](https://github.com/airbytehq/airbyte/pull/62297) | Update dependencies |
| 0.0.28 | 2025-06-21 | [61909](https://github.com/airbytehq/airbyte/pull/61909) | Update dependencies |
| 0.0.27 | 2025-06-14 | [61071](https://github.com/airbytehq/airbyte/pull/61071) | Update dependencies |
| 0.0.26 | 2025-05-24 | [60451](https://github.com/airbytehq/airbyte/pull/60451) | Update dependencies |
| 0.0.25 | 2025-05-10 | [60101](https://github.com/airbytehq/airbyte/pull/60101) | Update dependencies |
| 0.0.24 | 2025-05-03 | [59494](https://github.com/airbytehq/airbyte/pull/59494) | Update dependencies |
| 0.0.23 | 2025-04-27 | [59111](https://github.com/airbytehq/airbyte/pull/59111) | Update dependencies |
| 0.0.22 | 2025-04-19 | [58473](https://github.com/airbytehq/airbyte/pull/58473) | Update dependencies |
| 0.0.21 | 2025-04-12 | [57865](https://github.com/airbytehq/airbyte/pull/57865) | Update dependencies |
| 0.0.20 | 2025-04-05 | [57352](https://github.com/airbytehq/airbyte/pull/57352) | Update dependencies |
| 0.0.19 | 2025-03-29 | [56761](https://github.com/airbytehq/airbyte/pull/56761) | Update dependencies |
| 0.0.18 | 2025-03-22 | [56176](https://github.com/airbytehq/airbyte/pull/56176) | Update dependencies |
| 0.0.17 | 2025-03-08 | [55542](https://github.com/airbytehq/airbyte/pull/55542) | Update dependencies |
| 0.0.16 | 2025-03-01 | [55008](https://github.com/airbytehq/airbyte/pull/55008) | Update dependencies |
| 0.0.15 | 2025-02-23 | [54583](https://github.com/airbytehq/airbyte/pull/54583) | Update dependencies |
| 0.0.14 | 2025-02-15 | [53464](https://github.com/airbytehq/airbyte/pull/53464) | Update dependencies |
| 0.0.13 | 2025-02-01 | [52496](https://github.com/airbytehq/airbyte/pull/52496) | Update dependencies |
| 0.0.12 | 2025-01-18 | [51857](https://github.com/airbytehq/airbyte/pull/51857) | Update dependencies |
| 0.0.11 | 2025-01-11 | [51345](https://github.com/airbytehq/airbyte/pull/51345) | Update dependencies |
| 0.0.10 | 2024-12-28 | [50675](https://github.com/airbytehq/airbyte/pull/50675) | Update dependencies |
| 0.0.9 | 2024-12-21 | [50270](https://github.com/airbytehq/airbyte/pull/50270) | Update dependencies |
| 0.0.8 | 2024-12-14 | [49672](https://github.com/airbytehq/airbyte/pull/49672) | Update dependencies |
| 0.0.7 | 2024-12-12 | [49347](https://github.com/airbytehq/airbyte/pull/49347) | Update dependencies |
| 0.0.6 | 2024-12-11 | [49102](https://github.com/airbytehq/airbyte/pull/49102) | Starting with this version, the Docker image is now rootless. Please note that this and future versions will not be compatible with Airbyte versions earlier than 0.64 |
| 0.0.5 | 2024-11-04 | [48157](https://github.com/airbytehq/airbyte/pull/48157) | Update dependencies |
| 0.0.4 | 2024-10-29 | [47778](https://github.com/airbytehq/airbyte/pull/47778) | Update dependencies |
| 0.0.3 | 2024-10-28 | [47625](https://github.com/airbytehq/airbyte/pull/47625) | Update dependencies |
| 0.0.2 | 2024-09-30 | [46271](https://github.com/airbytehq/airbyte/pull/46271) | Documentation update |
| 0.0.1   | 2024-08-22 |              | Initial release by natikgadzhi via Connector Builder |

</details>
