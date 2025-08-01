# Sample Data

## Sync overview

The Sample Data source generates sample data using the python
[`mimesis`](https://mimesis.name/en/master/) package.

### Output schema

This source will generate an "e-commerce-like" dataset with users, products, and purchases. Here's
what is produced at a Postgres destination connected to this source:

```sql
CREATE TABLE "public"."users" (
    "address" jsonb,
    "occupation" text,
    "gender" text,
    "academic_degree" text,
    "weight" int8,
    "created_at" timestamptz,
    "language" text,
    "telephone" text,
    "title" text,
    "updated_at" timestamptz,
    "nationality" text,
    "blood_type" text,
    "name" text,
    "id" float8,
    "age" int8,
    "email" text,
    "height" text,
    -- "_airbyte_ab_id" varchar,
    -- "_airbyte_emitted_at" timestamptz,
    -- "_airbyte_normalized_at" timestamptz,
    -- "_airbyte_users_hashid" text
);

CREATE TABLE "public"."users_address" (
    "_airbyte_users_hashid" text,
    "country_code" text,
    "province" text,
    "city" text,
    "street_number" text,
    "state" text,
    "postal_code" text,
    "street_name" text,
    -- "_airbyte_ab_id" varchar,
    -- "_airbyte_emitted_at" timestamptz,
    -- "_airbyte_normalized_at" timestamptz,
    -- "_airbyte_address_hashid" text
);

CREATE TABLE "public"."products" (
    "id" float8,
    "make" text,
    "year" float8,
    "model" text,
    "price" float8,
    "created_at" timestamptz,
    -- "_airbyte_ab_id" varchar,
    -- "_airbyte_emitted_at" timestamptz,
    -- "_airbyte_normalized_at" timestamptz,
    -- "_airbyte_dev_products_hashid" text,
);

CREATE TABLE "public"."purchases" (
    "id" float8,
    "user_id" float8,
    "product_id" float8,
    "purchased_at" timestamptz,
    "added_to_cart_at" timestamptz,
    "returned_at" timestamptz,
    -- "_airbyte_ab_id" varchar,
    -- "_airbyte_emitted_at" timestamptz,
    -- "_airbyte_normalized_at" timestamptz,
    -- "_airbyte_dev_purchases_hashid" text,
);

```

### Features

| Feature           | Supported?\(Yes/No\) | Notes |
| :---------------- | :------------------- | :---- |
| Full Refresh Sync | Yes                  |       |
| Incremental Sync  | Yes                  |       |
| Namespaces        | No                   |       |

Of note, if you choose `Incremental Sync`, state will be maintained between syncs, and once you hit
`count` records, no new records will be added.

You can choose a specific `seed` (integer) as an option for this connector which will guarantee that
the same fake records are generated each time. Otherwise, random data will be created on each
subsequent sync.

### Requirements

None!

## Changelog

<details>
  <summary>Expand to review</summary>

| Version     | Date       | Pull Request                                                                                                          | Subject                                                                                                         |
|:------------|:-----------| :-------------------------------------------------------------------------------------------------------------------- |:----------------------------------------------------------------------------------------------------------------|
| 6.2.29 | 2025-07-26 | [63953](https://github.com/airbytehq/airbyte/pull/63953) | Update dependencies |
| 6.2.28 | 2025-07-19 | [63534](https://github.com/airbytehq/airbyte/pull/63534) | Update dependencies |
| 6.2.27 | 2025-07-17 | [63354](https://github.com/airbytehq/airbyte/pull/63354) | Updated icon |
| 6.2.26 | 2025-07-16 | [63342](https://github.com/airbytehq/airbyte/pull/63342) | Rendered name changed to `Sample Data` |
| 6.2.26-rc.1 | 2025-06-16 | [61645](https://github.com/airbytehq/airbyte/pull/61645) | Update for testing                                                                                              |
| 6.2.25-rc.1 | 2025-04-07 | [57500](https://github.com/airbytehq/airbyte/pull/57500) | Update for testing                                                                                              |
| 6.2.24      | 2025-04-05 | [57263](https://github.com/airbytehq/airbyte/pull/57263) | Update dependencies                                                                                             |
| 6.2.23      | 2025-03-29 | [56502](https://github.com/airbytehq/airbyte/pull/56502) | Update dependencies                                                                                             |
| 6.2.22      | 2025-03-22 | [46821](https://github.com/airbytehq/airbyte/pull/46821) | Update dependencies                                                                                             |
| 6.2.21      | 2025-03-11 | [55705](https://github.com/airbytehq/airbyte/pull/55705) | Promoting release candidate 6.2.21-rc.1 to a main version.                                                      |
| 6.2.21-rc.1 | 2024-11-13 | [48013](https://github.com/airbytehq/airbyte/pull/48013) | Update for testing.                                                                                             |
| 6.2.20      | 2024-10-30 | [48013](https://github.com/airbytehq/airbyte/pull/48013) | Promoting release candidate 6.2.20-rc.1 to a main version.                                                      |
| 6.2.20-rc.1 | 2024-10-21 | [47221](https://github.com/airbytehq/airbyte/pull/46678)                                                              | Testing release candidate with RC suffix versioning.                                                            |
| 6.2.19-rc.1 | 2024-10-21 | [47221](https://github.com/airbytehq/airbyte/pull/47221)                                                              | Testing release candidate with RC suffix versioning.                                                            |
| 6.2.18-rc.1 | 2024-10-09 | [46678](https://github.com/airbytehq/airbyte/pull/46678)                                                              | Testing release candidate with RC suffix versioning.                                                            |
| 6.2.17      | 2024-10-05 | [46398](https://github.com/airbytehq/airbyte/pull/46398)                                                              | Update dependencies                                                                                             |
| 6.2.16      | 2024-09-28 | [46207](https://github.com/airbytehq/airbyte/pull/46207)                                                              | Update dependencies                                                                                             |
| 6.2.15      | 2024-09-21 | [45740](https://github.com/airbytehq/airbyte/pull/45740)                                                              | Update dependencies                                                                                             |
| 6.2.14      | 2024-09-14 | [45567](https://github.com/airbytehq/airbyte/pull/45567)                                                              | Update dependencies                                                                                             |
| 6.2.13      | 2024-09-07 | [45327](https://github.com/airbytehq/airbyte/pull/45327)                                                              | Update dependencies                                                                                             |
| 6.2.12      | 2024-09-04 | [45126](https://github.com/airbytehq/airbyte/pull/45126)                                                              | Test a release candidate release                                                                                |
| 6.2.11      | 2024-08-31 | [45025](https://github.com/airbytehq/airbyte/pull/45025)                                                              | Update dependencies                                                                                             |
| 6.2.10      | 2024-08-24 | [44659](https://github.com/airbytehq/airbyte/pull/44659)                                                              | Update dependencies                                                                                             |
| 6.2.9       | 2024-08-17 | [44221](https://github.com/airbytehq/airbyte/pull/44221)                                                              | Update dependencies                                                                                             |
| 6.2.8       | 2024-08-12 | [43753](https://github.com/airbytehq/airbyte/pull/43753)                                                              | Update dependencies                                                                                             |
| 6.2.7       | 2024-08-10 | [43570](https://github.com/airbytehq/airbyte/pull/43570)                                                              | Update dependencies                                                                                             |
| 6.2.6       | 2024-08-03 | [43102](https://github.com/airbytehq/airbyte/pull/43102)                                                              | Update dependencies                                                                                             |
| 6.2.5       | 2024-07-27 | [42682](https://github.com/airbytehq/airbyte/pull/42682)                                                              | Update dependencies                                                                                             |
| 6.2.4       | 2024-07-20 | [42367](https://github.com/airbytehq/airbyte/pull/42367)                                                              | Update dependencies                                                                                             |
| 6.2.3       | 2024-07-13 | [41848](https://github.com/airbytehq/airbyte/pull/41848)                                                              | Update dependencies                                                                                             |
| 6.2.2       | 2024-07-10 | [41467](https://github.com/airbytehq/airbyte/pull/41467)                                                              | Update dependencies                                                                                             |
| 6.2.1       | 2024-07-09 | [41180](https://github.com/airbytehq/airbyte/pull/41180)                                                              | Update dependencies                                                                                             |
| 6.2.0       | 2024-07-07 | [39935](https://github.com/airbytehq/airbyte/pull/39935)                                                              | Update CDK to 2.0.                                                                                              |
| 6.1.6       | 2024-07-06 | [40956](https://github.com/airbytehq/airbyte/pull/40956)                                                              | Update dependencies                                                                                             |
| 6.1.5       | 2024-06-25 | [40426](https://github.com/airbytehq/airbyte/pull/40426)                                                              | Update dependencies                                                                                             |
| 6.1.4       | 2024-06-21 | [39935](https://github.com/airbytehq/airbyte/pull/39935)                                                              | Update dependencies                                                                                             |
| 6.1.3       | 2024-06-04 | [39029](https://github.com/airbytehq/airbyte/pull/39029)                                                              | [autopull] Upgrade base image to v1.2.1                                                                         |
| 6.1.2       | 2024-06-03 | [38831](https://github.com/airbytehq/airbyte/pull/38831)                                                              | Bump CDK to allow and prefer versions `1.x`                                                                     |
| 6.1.1       | 2024-05-20 | [38256](https://github.com/airbytehq/airbyte/pull/38256)                                                              | Replace AirbyteLogger with logging.Logger                                                                       |
| 6.1.0       | 2024-04-08 | [36898](https://github.com/airbytehq/airbyte/pull/36898)                                                              | Update car prices and years                                                                                     |
| 6.0.3       | 2024-03-15 | [36167](https://github.com/airbytehq/airbyte/pull/36167)                                                              | Make 'count' an optional config parameter.                                                                      |
| 6.0.2       | 2024-02-12 | [35174](https://github.com/airbytehq/airbyte/pull/35174)                                                              | Manage dependencies with Poetry.                                                                                |
| 6.0.1       | 2024-02-12 | [35172](https://github.com/airbytehq/airbyte/pull/35172)                                                              | Base image migration: remove Dockerfile and use the python-connector-base image                                 |
| 6.0.0       | 2024-01-30 | [34644](https://github.com/airbytehq/airbyte/pull/34644)                                                              | Declare 'id' columns as primary keys.                                                                           |
| 5.0.2       | 2024-01-17 | [34344](https://github.com/airbytehq/airbyte/pull/34344)                                                              | Ensure unique state messages                                                                                    |
| 5.0.1       | 2023-01-08 | [34033](https://github.com/airbytehq/airbyte/pull/34033)                                                              | Add standard entrypoints for usage with AirbyteLib                                                              |
| 5.0.0       | 2023-08-08 | [29213](https://github.com/airbytehq/airbyte/pull/29213)                                                              | Change all `*id` fields and `products.year` to be integer                                                       |
| 4.0.0       | 2023-07-19 | [28485](https://github.com/airbytehq/airbyte/pull/28485)                                                              | Bump to test publication                                                                                        |
| 3.0.2       | 2023-07-07 | [27807](https://github.com/airbytehq/airbyte/pull/28060)                                                              | Bump to test publication                                                                                        |
| 3.0.1       | 2023-06-28 | [27807](https://github.com/airbytehq/airbyte/pull/27807)                                                              | Fix bug with purchase stream updated_at                                                                         |
| 3.0.0       | 2023-06-23 | [27684](https://github.com/airbytehq/airbyte/pull/27684)                                                              | Stream cursor is now `updated_at` & remove `records_per_sync` option                                            |
| 2.1.0       | 2023-05-08 | [25903](https://github.com/airbytehq/airbyte/pull/25903)                                                              | Add user.address (object)                                                                                       |
| 2.0.3       | 2023-02-20 | [23259](https://github.com/airbytehq/airbyte/pull/23259)                                                              | bump to test publication                                                                                        |
| 2.0.2       | 2023-02-20 | [23259](https://github.com/airbytehq/airbyte/pull/23259)                                                              | bump to test publication                                                                                        |
| 2.0.1       | 2023-01-30 | [22117](https://github.com/airbytehq/airbyte/pull/22117)                                                              | `source-faker` goes beta                                                                                        |
| 2.0.0       | 2022-12-14 | [20492](https://github.com/airbytehq/airbyte/pull/20492) and [20741](https://github.com/airbytehq/airbyte/pull/20741) | Decouple stream states for better parallelism                                                                   |
| 1.0.0       | 2022-11-28 | [19490](https://github.com/airbytehq/airbyte/pull/19490)                                                              | Faker uses the CDK; rename streams to be lower-case (breaking), add determinism to random purchases, and rename |
| 0.2.1       | 2022-10-14 | [19197](https://github.com/airbytehq/airbyte/pull/19197)                                                              | Emit `AirbyteEstimateTraceMessage`                                                                              |
| 0.2.0       | 2022-10-14 | [18021](https://github.com/airbytehq/airbyte/pull/18021)                                                              | Move to mimesis for speed!                                                                                      |
| 0.1.8       | 2022-10-12 | [17889](https://github.com/airbytehq/airbyte/pull/17889)                                                              | Bump to test publish command (2)                                                                                |
| 0.1.7       | 2022-10-11 | [17848](https://github.com/airbytehq/airbyte/pull/17848)                                                              | Bump to test publish command                                                                                    |
| 0.1.6       | 2022-09-07 | [16418](https://github.com/airbytehq/airbyte/pull/16418)                                                              | Log start of each stream                                                                                        |
| 0.1.5       | 2022-06-10 | [13695](https://github.com/airbytehq/airbyte/pull/13695)                                                              | Emit timestamps in the proper ISO format                                                                        |
| 0.1.4       | 2022-05-27 | [13298](https://github.com/airbytehq/airbyte/pull/13298)                                                              | Test publication flow                                                                                           |
| 0.1.3       | 2022-05-27 | [13248](https://github.com/airbytehq/airbyte/pull/13248)                                                              | Add options for records_per_sync and page_size                                                                  |
| 0.1.2       | 2022-05-26 | [13248](https://github.com/airbytehq/airbyte/pull/13293)                                                              | Test publication flow                                                                                           |
| 0.1.1       | 2022-05-26 | [13235](https://github.com/airbytehq/airbyte/pull/13235)                                                              | Publish for AMD and ARM (M1 Macs) & remove User.birthdate                                                       |
| 0.1.0       | 2022-04-12 | [11738](https://github.com/airbytehq/airbyte/pull/11738)                                                              | The Faker Source is created                                                                                     |

</details>
