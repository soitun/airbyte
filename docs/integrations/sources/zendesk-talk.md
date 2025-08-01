# Zendesk Talk

## Prerequisites

- Zendesk API Token or Zendesk OAuth Client
- Zendesk Email (For API Token authentication)
- Zendesk Subdomain

## Setup guide

### Step 1: Set up Zendesk

Generate an API access token as described in [Zendesk docs](https://support.zendesk.com/hc/en-us/articles/226022787-Generating-a-new-API-token-)

We recommend creating a restricted, read-only key specifically for Airbyte access. This will allow you to control which resources Airbyte is able to access.

Another option is to use OAuth2.0 for authentication. See [Zendesk docs](https://support.zendesk.com/hc/en-us/articles/4408845965210-Using-OAuth-authentication-with-your-application) for details.

<!-- env:cloud -->

### Step 2: Set up the Zendesk Talk connector in Airbyte

**For Airbyte Cloud:**

1. [Log into your Airbyte Cloud](https://cloud.airbyte.com/workspaces) account.
2. In the left navigation bar, click **Sources**. In the top-right corner, click **+new source**.
3. On the Set up the source page, enter the name for the Zendesk Talk connector and select **Zendesk Talk** from the Source type dropdown.
4. Fill in the rest of the fields:
   - _Subdomain_
   - _Authentication (API Token / OAuth2.0)_
   - _Start Date_
5. Click **Set up source**
<!-- /env:cloud -->

## Supported sync modes

The **Zendesk Talk** source connector supports the following [sync modes](https://docs.airbyte.com/cloud/core-concepts#connection-sync-modes):

- Full Refresh
- Incremental Sync

## Supported Streams

This Source is capable of syncing the following core Streams:

- [Account Overview](https://developer.zendesk.com/rest_api/docs/voice-api/stats#show-account-overview)
- [Addresses](https://developer.zendesk.com/rest_api/docs/voice-api/phone_numbers#list-phone-numbers)
- [Agents Activity](https://developer.zendesk.com/rest_api/docs/voice-api/stats#list-agents-activity)
- [Agents Overview](https://developer.zendesk.com/rest_api/docs/voice-api/stats#show-agents-overview)
- [Calls](https://developer.zendesk.com/rest_api/docs/voice-api/incremental_exports#incremental-calls-export) \(Incremental sync\)
- [Call Legs](https://developer.zendesk.com/rest_api/docs/voice-api/incremental_exports#incremental-call-legs-export) \(Incremental sync\)
- [Current Queue Activity](https://developer.zendesk.com/rest_api/docs/voice-api/stats#show-current-queue-activity)
- [Greeting Categories](https://developer.zendesk.com/rest_api/docs/voice-api/greetings#list-greeting-categories)
- [Greetings](https://developer.zendesk.com/rest_api/docs/voice-api/greetings#list-greetings)
- [IVRs](https://developer.zendesk.com/rest_api/docs/voice-api/ivrs#list-ivrs)
- [IVR Menus](https://developer.zendesk.com/rest_api/docs/voice-api/ivrs#list-ivrs)
- [IVR Routes](https://developer.zendesk.com/rest_api/docs/voice-api/ivr_routes#list-ivr-routes)
- [Phone Numbers](https://developer.zendesk.com/rest_api/docs/voice-api/phone_numbers#list-phone-numbers)

## Performance considerations

The connector is restricted by normal Zendesk [requests limitation](https://developer.zendesk.com/rest_api/docs/voice-api/introduction#rate-limits).

The Zendesk connector should not run into Zendesk API limitations under normal usage. Please [create an issue](https://github.com/airbytehq/airbyte/issues) if you see any rate limit issues that are not automatically retried successfully.

## Data type map

| Integration Type | Airbyte Type |
|:-----------------|:-------------|
| `string`         | `string`     |
| `number`         | `number`     |
| `array`          | `array`      |
| `object`         | `object`     |

## Changelog

<details>
  <summary>Expand to review</summary>

| Version | Date       | Pull Request                                             | Subject                                                                     |
|:--------|:-----------|:---------------------------------------------------------|:----------------------------------------------------------------------------|
| 1.2.14 | 2025-07-26 | [64081](https://github.com/airbytehq/airbyte/pull/64081) | Update dependencies |
| 1.2.13 | 2025-07-19 | [63611](https://github.com/airbytehq/airbyte/pull/63611) | Update dependencies |
| 1.2.12 | 2025-07-12 | [63180](https://github.com/airbytehq/airbyte/pull/63180) | Update dependencies |
| 1.2.11 | 2025-07-05 | [62730](https://github.com/airbytehq/airbyte/pull/62730) | Update dependencies |
| 1.2.10 | 2025-06-28 | [62224](https://github.com/airbytehq/airbyte/pull/62224) | Update dependencies |
| 1.2.9 | 2025-06-21 | [61753](https://github.com/airbytehq/airbyte/pull/61753) | Update dependencies |
| 1.2.8 | 2025-06-15 | [61223](https://github.com/airbytehq/airbyte/pull/61223) | Update dependencies |
| 1.2.7 | 2025-05-24 | [60770](https://github.com/airbytehq/airbyte/pull/60770) | Update dependencies |
| 1.2.6 | 2025-05-10 | [59917](https://github.com/airbytehq/airbyte/pull/59917) | Update dependencies |
| 1.2.5 | 2025-05-04 | [58933](https://github.com/airbytehq/airbyte/pull/58933) | Update dependencies |
| 1.2.4 | 2025-04-19 | [58541](https://github.com/airbytehq/airbyte/pull/58541) | Update dependencies |
| 1.2.3 | 2025-04-13 | [58053](https://github.com/airbytehq/airbyte/pull/58053) | Update dependencies |
| 1.2.2 | 2025-04-05 | [56838](https://github.com/airbytehq/airbyte/pull/56838) | Update dependencies |
| 1.2.1 | 2025-03-22 | [48245](https://github.com/airbytehq/airbyte/pull/48245) | Update dependencies |
| 1.2.0 | 2025-02-07 | [50956](https://github.com/airbytehq/airbyte/pull/50956) | Restore Unit Test |
| 1.1.0-rc.1  | 2024-10-31 | [47313](https://github.com/airbytehq/airbyte/pull/47313) | Migrate to Manifest-only |
| 1.0.21 | 2024-10-29 | [47082](https://github.com/airbytehq/airbyte/pull/47082) | Update dependencies |
| 1.0.20 | 2024-10-12 | [46861](https://github.com/airbytehq/airbyte/pull/46861) | Update dependencies |
| 1.0.19 | 2024-10-05 | [46394](https://github.com/airbytehq/airbyte/pull/46394) | Update dependencies |
| 1.0.18 | 2024-09-28 | [46149](https://github.com/airbytehq/airbyte/pull/46149) | Update dependencies |
| 1.0.17 | 2024-09-21 | [45783](https://github.com/airbytehq/airbyte/pull/45783) | Update dependencies |
| 1.0.16 | 2024-09-14 | [45524](https://github.com/airbytehq/airbyte/pull/45524) | Update dependencies |
| 1.0.15 | 2024-09-07 | [45301](https://github.com/airbytehq/airbyte/pull/45301) | Update dependencies |
| 1.0.14 | 2024-08-31 | [45019](https://github.com/airbytehq/airbyte/pull/45019) | Update dependencies |
| 1.0.13 | 2024-08-24 | [44624](https://github.com/airbytehq/airbyte/pull/44624) | Update dependencies |
| 1.0.12 | 2024-08-17 | [44214](https://github.com/airbytehq/airbyte/pull/44214) | Update dependencies |
| 1.0.11 | 2024-08-10 | [43558](https://github.com/airbytehq/airbyte/pull/43558) | Update dependencies |
| 1.0.10 | 2024-08-03 | [43203](https://github.com/airbytehq/airbyte/pull/43203) | Update dependencies |
| 1.0.9 | 2024-07-27 | [42669](https://github.com/airbytehq/airbyte/pull/42669) | Update dependencies |
| 1.0.8 | 2024-07-20 | [42328](https://github.com/airbytehq/airbyte/pull/42328) | Update dependencies |
| 1.0.7 | 2024-07-13 | [41727](https://github.com/airbytehq/airbyte/pull/41727) | Update dependencies |
| 1.0.6 | 2024-07-10 | [41350](https://github.com/airbytehq/airbyte/pull/41350) | Update dependencies |
| 1.0.5 | 2024-07-09 | [41119](https://github.com/airbytehq/airbyte/pull/41119) | Update dependencies |
| 1.0.4 | 2024-07-06 | [40855](https://github.com/airbytehq/airbyte/pull/40855) | Update dependencies |
| 1.0.3 | 2024-06-25 | [40278](https://github.com/airbytehq/airbyte/pull/40278) | Update dependencies |
| 1.0.2 | 2024-06-22 | [40056](https://github.com/airbytehq/airbyte/pull/40056) | Update dependencies |
| 1.0.1 | 2024-06-04 | [39036](https://github.com/airbytehq/airbyte/pull/39036) | [autopull] Upgrade base image to v1.2.1 |
| 1.0.0 | 2024-05-06 | [35780](https://github.com/airbytehq/airbyte/pull/35780) | Migrate implementation to low-code CDK |
| 0.2.1 | 2024-05-02 | [36625](https://github.com/airbytehq/airbyte/pull/36625) | Schema descriptions and CDK 0.80.0 |
| 0.2.0 | 2024-03-25 | [36459](https://github.com/airbytehq/airbyte/pull/36459) | Unpin CDK version, add record counts in state messages |
| 0.1.13 | 2024-03-04 | [35783](https://github.com/airbytehq/airbyte/pull/35783) | Change order of authentication methods in spec |
| 0.1.12 | 2024-02-12 | [35156](https://github.com/airbytehq/airbyte/pull/35156) | Manage dependencies with Poetry. |
| 0.1.11 | 2024-01-12 | [34204](https://github.com/airbytehq/airbyte/pull/34204) | Prepare for airbyte-lib |
| 0.1.10 | 2023-12-04 | [33030](https://github.com/airbytehq/airbyte/pull/33030) | Base image migration: remove Dockerfile and use python-connector-base image |
| 0.1.9 | 2023-08-03 | [29031](https://github.com/airbytehq/airbyte/pull/29031) | Reverted `advancedAuth` spec changes |
| 0.1.8 | 2023-08-01 | [28910](https://github.com/airbytehq/airbyte/pull/28910) | Updated `advancedAuth` broken references |
| 0.1.7 | 2023-02-10 | [22815](https://github.com/airbytehq/airbyte/pull/22815) | Specified date formatting in specification |
| 0.1.6 | 2023-01-27 | [22028](https://github.com/airbytehq/airbyte/pull/22028) | Set `AvailabilityStrategy` for streams explicitly to `None` |
| 0.1.5 | 2022-09-29 | [17362](https://github.com/airbytehq/airbyte/pull/17362) | always use the latest CDK version |
| 0.1.4 | 2022-08-19 | [15764](https://github.com/airbytehq/airbyte/pull/15764) | Support OAuth2.0 |
| 0.1.3 | 2021-11-11 | [7173](https://github.com/airbytehq/airbyte/pull/7173) | Fix pagination and migrate to CDK |

</details>
