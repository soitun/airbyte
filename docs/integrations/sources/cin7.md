# Cin7 Inventory API
This is the Cin7 source that ingests data from the Cin7 API.

Cin7 (Connector Inventory Performance), If you’re a business that wants to grow, you need an inventory solution you can count on - both now and in the future. With Cin7 you get a real-time picture of your products across systems, channels, marketplaces and regions, plus NEW ForesightAI advanced inventory forecasting that empowers you to see around corners and stay three steps ahead of demand! https://www.cin7.com/

To use this source, you must first create an account. Once logged in, head to Integrations -&gt; API -&gt; Cin7 Core API.
Create an application and note down the Account Id and the API key, you will need to enter these in the input fields. You can find more information about the [API Documentation](https://dearinventory.docs.apiary.io/#reference)


## Configuration

| Input | Type | Description | Default Value |
|-------|------|-------------|---------------|
| `accountid` | `string` | AccountID. The ID associated with your account. |  |
| `api_key` | `string` | API Key. The API key associated with your account. |  |

## Streams
| Stream Name | Primary Key | Pagination | Supports Full Sync | Supports Incremental |
|-------------|-------------|------------|---------------------|----------------------|
| bank_accounts | AccountID | DefaultPaginator | ✅ |  ❌  |
| attribute_sets | ID | DefaultPaginator | ✅ |  ❌  |
| accounts | Code | DefaultPaginator | ✅ |  ❌  |
| brands | ID | DefaultPaginator | ✅ |  ❌  |
| carriers | CarrierID | DefaultPaginator | ✅ |  ❌  |
| customers | ID | DefaultPaginator | ✅ |  ❌  |
| deals | ID | No pagination | ✅ |  ❌  |
| locations |  | DefaultPaginator | ✅ |  ❌  |
| products | ID | DefaultPaginator | ✅ |  ❌  |
| purchases | ID | DefaultPaginator | ✅ |  ❌  |
| suppliers | ID | DefaultPaginator | ✅ |  ❌  |
| product_categories | ID | DefaultPaginator | ✅ |  ❌  |
| sale_lists | ID | DefaultPaginator | ✅ |  ❌  |
| product_families | ID | DefaultPaginator | ✅ |  ❌  |

## Changelog

<details>
  <summary>Expand to review</summary>

| Version          | Date              | Pull Request | Subject        |
|------------------|-------------------|--------------|----------------|
| 0.3.10 | 2025-07-26 | [64046](https://github.com/airbytehq/airbyte/pull/64046) | Update dependencies |
| 0.3.9 | 2025-07-19 | [63536](https://github.com/airbytehq/airbyte/pull/63536) | Update dependencies |
| 0.3.8 | 2025-07-12 | [62997](https://github.com/airbytehq/airbyte/pull/62997) | Update dependencies |
| 0.3.7 | 2025-07-05 | [62760](https://github.com/airbytehq/airbyte/pull/62760) | Update dependencies |
| 0.3.6 | 2025-06-28 | [62305](https://github.com/airbytehq/airbyte/pull/62305) | Update dependencies |
| 0.3.5 | 2025-06-22 | [61988](https://github.com/airbytehq/airbyte/pull/61988) | Update dependencies |
| 0.3.4 | 2025-06-14 | [61252](https://github.com/airbytehq/airbyte/pull/61252) | Update dependencies |
| 0.3.3 | 2025-05-24 | [60378](https://github.com/airbytehq/airbyte/pull/60378) | Update dependencies |
| 0.3.2 | 2025-05-10 | [59985](https://github.com/airbytehq/airbyte/pull/59985) | Update dependencies |
| 0.3.1 | 2025-05-03 | [59392](https://github.com/airbytehq/airbyte/pull/59392) | Update dependencies |
| 0.3.0 | 2025-04-28 | [58631](https://github.com/airbytehq/airbyte/pull/58631) | add  stream |
| 0.2.3 | 2025-04-26 | [58885](https://github.com/airbytehq/airbyte/pull/58885) | Update dependencies |
| 0.2.2 | 2025-04-19 | [58350](https://github.com/airbytehq/airbyte/pull/58350) | Update dependencies |
| 0.2.1 | 2025-04-12 | [57816](https://github.com/airbytehq/airbyte/pull/57816) | Update dependencies |
| 0.2.0 | 2025-04-07 | [56931](https://github.com/airbytehq/airbyte/pull/56931) | removed incremental from unordered streams |
| 0.1.2 | 2025-04-05 | [57183](https://github.com/airbytehq/airbyte/pull/57183) | Update dependencies |
| 0.1.1 | 2025-03-29 | [56590](https://github.com/airbytehq/airbyte/pull/56590) | Update dependencies |
| 0.1.0 | 2025-03-27 | [56429](https://github.com/airbytehq/airbyte/pull/56429) | refactor connector, add backoff and fix endpoints |
| 0.0.16 | 2025-03-22 | [56121](https://github.com/airbytehq/airbyte/pull/56121) | Update dependencies |
| 0.0.15 | 2025-03-08 | [55421](https://github.com/airbytehq/airbyte/pull/55421) | Update dependencies |
| 0.0.14 | 2025-03-01 | [54886](https://github.com/airbytehq/airbyte/pull/54886) | Update dependencies |
| 0.0.13 | 2025-02-22 | [54257](https://github.com/airbytehq/airbyte/pull/54257) | Update dependencies |
| 0.0.12 | 2025-02-15 | [53934](https://github.com/airbytehq/airbyte/pull/53934) | Update dependencies |
| 0.0.11 | 2025-02-08 | [53393](https://github.com/airbytehq/airbyte/pull/53393) | Update dependencies |
| 0.0.10 | 2025-02-01 | [52880](https://github.com/airbytehq/airbyte/pull/52880) | Update dependencies |
| 0.0.9 | 2025-01-25 | [52177](https://github.com/airbytehq/airbyte/pull/52177) | Update dependencies |
| 0.0.8 | 2025-01-18 | [51718](https://github.com/airbytehq/airbyte/pull/51718) | Update dependencies |
| 0.0.7 | 2025-01-11 | [51227](https://github.com/airbytehq/airbyte/pull/51227) | Update dependencies |
| 0.0.6 | 2024-12-28 | [50466](https://github.com/airbytehq/airbyte/pull/50466) | Update dependencies |
| 0.0.5 | 2024-12-21 | [50191](https://github.com/airbytehq/airbyte/pull/50191) | Update dependencies |
| 0.0.4 | 2024-12-14 | [49576](https://github.com/airbytehq/airbyte/pull/49576) | Update dependencies |
| 0.0.3 | 2024-12-12 | [49284](https://github.com/airbytehq/airbyte/pull/49284) | Update dependencies |
| 0.0.2 | 2024-12-11 | [48950](https://github.com/airbytehq/airbyte/pull/48950) | Starting with this version, the Docker image is now rootless. Please note that this and future versions will not be compatible with Airbyte versions earlier than 0.64 |
| 0.0.1 | 2024-10-30 | | Initial release by [@aazam-gh](https://github.com/aazam-gh) via Connector Builder |

</details>
