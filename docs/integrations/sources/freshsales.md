# Freshsales

This page contains the setup guide and reference information for the Freshsales source connector.

## Prerequisites

- Freshsales Account
- Freshsales API Key
- Freshsales Domain Name

Please read [How to find your API key](https://crmsupport.freshworks.com/support/solutions/articles/50000002503-how-to-find-my-api-key-).

## Setup guide

## Step 1: Set up the Freshsales connector in Airbyte

### For Airbyte Cloud:

1. [Log into your Airbyte Cloud](https://cloud.airbyte.com/workspaces) account.
2. In the left navigation bar, click **Sources**. In the top-right corner, click **+new source**.
3. Set the name for your source
4. Enter your `Domain Name`
5. Enter your `API Key` obtained from [these steps](https://crmsupport.freshworks.com/support/solutions/articles/50000002503-how-to-find-my-api-key-)
6. Click **Set up source**

### For Airbyte OSS:

1. Navigate to the Airbyte Open Source dashboard
2. In the left navigation bar, click **Sources**. In the top-right corner, click **+new source**.
3. Set the name for your source
4. Enter your `Domain Name`
5. Enter your `API Key` obtained from [these steps](https://crmsupport.freshworks.com/support/solutions/articles/50000002503-how-to-find-my-api-key-)
6. Click **Set up source**

## Supported sync modes

| Feature           | Supported? |
| :---------------- | :--------- |
| Full Refresh Sync | Yes        |
| Incremental Sync  | No         |
| SSL connection    | No         |
| Namespaces        | No         |

## Supported Streams

Several output streams are available from this source:

- [Contacts](https://developers.freshworks.com/crm/api/#contacts)
- [Accounts](https://developers.freshworks.com/crm/api/#accounts)
- [Open Deals](https://developers.freshworks.com/crm/api/#deals)
- [Won Deals](https://developers.freshworks.com/crm/api/#deals)
- [Lost Deals](https://developers.freshworks.com/crm/api/#deals)
- [Open Tasks](https://developers.freshworks.com/crm/api/#tasks)
- [Completed Tasks](https://developers.freshworks.com/crm/api/#tasks)
- [Past appointments](https://developers.freshworks.com/crm/api/#appointments)
- [Upcoming appointments](https://developers.freshworks.com/crm/api/#appointments)

If there are more endpoints you'd like Airbyte to support, please [create an issue.](https://github.com/airbytehq/airbyte/issues/new/choose)

### Performance considerations

The Freshsales connector should not run into Freshsales API limitations under normal usage. Please [create an issue](https://github.com/airbytehq/airbyte/issues) if you see any rate limit issues that are not automatically retried successfully.

## Changelog

<details>
  <summary>Expand to review</summary>

| Version | Date       | Pull Request                                             | Subject                                                      |
| :------ | :--------- | :------------------------------------------------------- | :----------------------------------------------------------- |
| 1.1.29 | 2025-07-26 | [63971](https://github.com/airbytehq/airbyte/pull/63971) | Update dependencies |
| 1.1.28 | 2025-07-19 | [63543](https://github.com/airbytehq/airbyte/pull/63543) | Update dependencies |
| 1.1.27 | 2025-07-12 | [62972](https://github.com/airbytehq/airbyte/pull/62972) | Update dependencies |
| 1.1.26 | 2025-07-05 | [62782](https://github.com/airbytehq/airbyte/pull/62782) | Update dependencies |
| 1.1.25 | 2025-06-28 | [62427](https://github.com/airbytehq/airbyte/pull/62427) | Update dependencies |
| 1.1.24 | 2025-06-22 | [61994](https://github.com/airbytehq/airbyte/pull/61994) | Update dependencies |
| 1.1.23 | 2025-06-14 | [61289](https://github.com/airbytehq/airbyte/pull/61289) | Update dependencies |
| 1.1.22 | 2025-05-24 | [59971](https://github.com/airbytehq/airbyte/pull/59971) | Update dependencies |
| 1.1.21 | 2025-05-03 | [59398](https://github.com/airbytehq/airbyte/pull/59398) | Update dependencies |
| 1.1.20 | 2025-04-26 | [58907](https://github.com/airbytehq/airbyte/pull/58907) | Update dependencies |
| 1.1.19 | 2025-04-19 | [58317](https://github.com/airbytehq/airbyte/pull/58317) | Update dependencies |
| 1.1.18 | 2025-04-12 | [57788](https://github.com/airbytehq/airbyte/pull/57788) | Update dependencies |
| 1.1.17 | 2025-04-05 | [57193](https://github.com/airbytehq/airbyte/pull/57193) | Update dependencies |
| 1.1.16 | 2025-03-29 | [56514](https://github.com/airbytehq/airbyte/pull/56514) | Update dependencies |
| 1.1.15 | 2025-03-22 | [55995](https://github.com/airbytehq/airbyte/pull/55995) | Update dependencies |
| 1.1.14 | 2025-03-08 | [55304](https://github.com/airbytehq/airbyte/pull/55304) | Update dependencies |
| 1.1.13 | 2025-03-01 | [54913](https://github.com/airbytehq/airbyte/pull/54913) | Update dependencies |
| 1.1.12 | 2025-02-22 | [54401](https://github.com/airbytehq/airbyte/pull/54401) | Update dependencies |
| 1.1.11 | 2025-02-15 | [53708](https://github.com/airbytehq/airbyte/pull/53708) | Update dependencies |
| 1.1.10 | 2025-02-08 | [53368](https://github.com/airbytehq/airbyte/pull/53368) | Update dependencies |
| 1.1.9 | 2025-02-01 | [52852](https://github.com/airbytehq/airbyte/pull/52852) | Update dependencies |
| 1.1.8 | 2025-01-25 | [52300](https://github.com/airbytehq/airbyte/pull/52300) | Update dependencies |
| 1.1.7 | 2025-01-18 | [51688](https://github.com/airbytehq/airbyte/pull/51688) | Update dependencies |
| 1.1.6 | 2025-01-11 | [51070](https://github.com/airbytehq/airbyte/pull/51070) | Update dependencies |
| 1.1.5 | 2024-12-28 | [50527](https://github.com/airbytehq/airbyte/pull/50527) | Update dependencies |
| 1.1.4 | 2024-12-21 | [50004](https://github.com/airbytehq/airbyte/pull/50004) | Update dependencies |
| 1.1.3 | 2024-12-14 | [49473](https://github.com/airbytehq/airbyte/pull/49473) | Update dependencies |
| 1.1.2 | 2024-12-12 | [49203](https://github.com/airbytehq/airbyte/pull/49203) | Update dependencies |
| 1.1.1 | 2024-10-28 | [44277](https://github.com/airbytehq/airbyte/pull/44277) | Update dependencies |
| 1.1.0 | 2024-08-15 | [44149](https://github.com/airbytehq/airbyte/pull/44149) | Refactor connector to manifest-only format |
| 1.0.14 | 2024-08-12 | [43904](https://github.com/airbytehq/airbyte/pull/43904) | Update dependencies |
| 1.0.13 | 2024-08-10 | [43678](https://github.com/airbytehq/airbyte/pull/43678) | Update dependencies |
| 1.0.12 | 2024-08-03 | [43192](https://github.com/airbytehq/airbyte/pull/43192) | Update dependencies |
| 1.0.11 | 2024-07-27 | [42744](https://github.com/airbytehq/airbyte/pull/42744) | Update dependencies |
| 1.0.10 | 2024-07-20 | [42277](https://github.com/airbytehq/airbyte/pull/42277) | Update dependencies |
| 1.0.9 | 2024-07-13 | [41709](https://github.com/airbytehq/airbyte/pull/41709) | Update dependencies |
| 1.0.8 | 2024-07-10 | [41494](https://github.com/airbytehq/airbyte/pull/41494) | Update dependencies |
| 1.0.7 | 2024-07-09 | [41226](https://github.com/airbytehq/airbyte/pull/41226) | Update dependencies |
| 1.0.6 | 2024-07-06 | [40851](https://github.com/airbytehq/airbyte/pull/40851) | Update dependencies |
| 1.0.5 | 2024-06-25 | [40304](https://github.com/airbytehq/airbyte/pull/40304) | Update dependencies |
| 1.0.4 | 2024-06-21 | [39925](https://github.com/airbytehq/airbyte/pull/39925) | Update dependencies |
| 1.0.3 | 2024-06-04 | [39065](https://github.com/airbytehq/airbyte/pull/39065) | [autopull] Upgrade base image to v1.2.1 |
| 1.0.2 | 2024-05-21 | [38548](https://github.com/airbytehq/airbyte/pull/38548) | Upgrade to CDK 1.0.0 |
| 1.0.1 | 2024-05-28 | [38153](https://github.com/airbytehq/airbyte/pull/38153) | Make connector compatible with builder |
| 1.0.0 | 2023-10-21 | [31685](https://github.com/airbytehq/airbyte/pull/31685) | Migrate to Low-Code CDK |
| 0.1.4 | 2023-03-23 | [24396](https://github.com/airbytehq/airbyte/pull/24396) | Certify to Beta |
| 0.1.3 | 2023-03-16 | [24155](https://github.com/airbytehq/airbyte/pull/24155) | Set `additionalProperties` to `True` in `spec` to support BC |
| 0.1.2 | 2022-07-14 | [0](https://github.com/airbytehq/airbyte/pull/0) | Tune the `get_view_id` function |
| 0.1.1 | 2021-12-24 | [9101](https://github.com/airbytehq/airbyte/pull/9101) | Update fields and descriptions |
| 0.1.0 | 2021-11-03 | [6963](https://github.com/airbytehq/airbyte/pull/6963) | 🎉 New Source: Freshsales |


</details>
