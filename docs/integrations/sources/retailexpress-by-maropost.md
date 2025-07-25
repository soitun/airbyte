# Retail Express by Maropost
Retail Express by Maropost is an Australian retail point-of-sale, inventory management, fulfilment and multichannel ecommerce platform.

## Getting Started

### Prerequisites
You will need to create an API key before configuring this connector. Log into your Retail Express account and navigate to Settings→Integrations→Api Management, set an API Key Name and click Generate Keys, copy either the Primary Key or Secondary Key (both keys are functionally identical).

### Performance Considerations
Retail Express has restrictive API limits, it is strongly recommended to limit the number of active streams to only the essential data.

The API is limited to a maximum of 100,000 requests per 24 hour period and 300 requests per minute (approximately 5 requests per second).

If a live feed of data is required, it is recommended to connect those individual streams in a separate connection instance to avoid rate limit saturation.

### Known Issues

#### Incremental Sync
Due to upstream API bugs causing records to have null values in `modified_on` timestamps, certain streams are unable to take advantage of incremental sync despite the availability of timestamp filters. 

In some circumstances this only affects historical records prior to a certain date, where known these have been noted in the "Special Considerations" column of the [Streams](#Streams) table.

The streams with known issues have been configured by default to avoid potential data loss, however you may choose to customize these streams to enable or disable incremental sync.

#### Epoch timestamp for `modified_on` or `created_on`
In relation to the aforementioned bug, in some circumstances the API returns null or entirely excludes `created_on` and `modified_on` attributes from the response. Transformations have been configured to:

1. If `created_on` is present, use this value for a missing `modified_on`
2. If neither value is present, inject Unix epoch timestamps (`1970-01-01T00:00:00Z`)

#### Ephemeral order item records returned
Due to an upstream API bug, the `order_item` stream can return ephemeral records for line items that are actively being edited in POS - these records are deleted but may result in inaccurate information being captured. There is currently no way to filter out or ascertain if a record is ephemeral except for performing a full sync.

#### Missing endpoint `/producteta`
There are no plans to support this endpoint as it relies on a separate license and connecting RetailExpress to Shopify and using a specific configuration.

#### Missing endpoint `/fulfilmentorders`
It is unclear what populates this API and the sandbox environment does not provide any data for this API, preventing it from being tested for inclusion in this connector.

## Configuration

| Input | Type | Description |
|-------|------|-------------|
| `api_key` | `string` | API Key.  |
| `start_date` | `string` | Start date.  |

## Streams
| Stream Name | Incremental | Special Considerations |
|-------------|-------------|------------------------|
| countries |  ✅  |
| credit_notes |  ✅  |
| credit_note_items |  ✅  |
| currencies |  ✅  |
| customer_logs |  ✅  |
| customers |  ✅  |
| customer_delivery_addresses |  ✅  |
| customer_types |  ✅  |
| freight_types |  ❌  |
| orders |  ✅  |
| order_items |  ❌  | Returns null values for `modified_on`. Returns ephemeral records.
| order_fulfilments |  ✅  |
| order_payments |  ✅  |
| outlets |  ❌  |
| product_attributes |  ❌  | Returns null values for `modified_on`.
| product_attribute_values |  ❌  | Depends on non-incremental parent stream `product_attributes`.
| product_replenishment_methods |  ❌  |
| products |  ✅  |
| product_types |  ❌  | Returns null values for `modified_on` (historical records).
| purchase_orders |  ✅  |
| purchase_order_items |  ✅  |
| transfers |  ✅  |
| transfer_items |  ✅  |
| receipt_variance_reasons |  ✅  |
| shipment_types |  ❌  |
| shipping_ports |  ❌  |
| shipping_status |  ❌  |
| stock_receipts |  ✅  |
| supplier_invoices |  ✅  |
| supplier_return_item_source |  ❌  |
| supplier_return_item_status |  ❌  |
| supplier_return_reasons |  ✅  |
| supplier_return_status |  ❌  |
| supplier_returns |  ✅  |
| suppliers |  ✅  |
| users |  ❌  |
| vouchers |  ❌  |
| voucher_types |  ❌  |
| inventory |  ✅  |
| inventory_movement_logs |  ✅  | Provides a high volume of data that may rapidly exhaust API allowance.
| customer_survey_segments |  ❌  |
| loyalty_adjustment_reasons |  ❌  |
| max_discount_rules |  ✅  |
| price_groups_fixed |  ❌  |
| price_groups_standard |  ❌  |
| product_barcodes |  ✅  |
| product_details_log |  ❌  |
| product_prices |  ❌  |
| return_reasons |  ✅  |
| stock_adjustment_reasons |  ✅  |
| transfer_status |  ❌  |
| transfer_types |  ❌  |


## Changelog

<details>
  <summary>Expand to review</summary>

| Version          | Date              | Pull Request | Subject        |
|------------------|-------------------|--------------|----------------|
| 0.0.20 | 2025-07-20 | [63655](https://github.com/airbytehq/airbyte/pull/63655) | Update dependencies |
| 0.0.19 | 2025-06-14 | [61300](https://github.com/airbytehq/airbyte/pull/61300) | Update dependencies |
| 0.0.18 | 2025-05-24 | [60459](https://github.com/airbytehq/airbyte/pull/60459) | Update dependencies |
| 0.0.17 | 2025-05-10 | [60149](https://github.com/airbytehq/airbyte/pull/60149) | Update dependencies |
| 0.0.16 | 2025-05-04 | [59615](https://github.com/airbytehq/airbyte/pull/59615) | Update dependencies |
| 0.0.15 | 2025-04-27 | [59025](https://github.com/airbytehq/airbyte/pull/59025) | Update dependencies |
| 0.0.14 | 2025-04-19 | [58390](https://github.com/airbytehq/airbyte/pull/58390) | Update dependencies |
| 0.0.13 | 2025-04-12 | [58007](https://github.com/airbytehq/airbyte/pull/58007) | Update dependencies |
| 0.0.12 | 2025-04-05 | [57361](https://github.com/airbytehq/airbyte/pull/57361) | Update dependencies |
| 0.0.11 | 2025-03-29 | [56737](https://github.com/airbytehq/airbyte/pull/56737) | Update dependencies |
| 0.0.10 | 2025-03-22 | [56175](https://github.com/airbytehq/airbyte/pull/56175) | Update dependencies |
| 0.0.9 | 2025-03-14 | [55765](https://github.com/airbytehq/airbyte/pull/55765) | Update dependencies |
| 0.0.8 | 2025-03-08 | [55557](https://github.com/airbytehq/airbyte/pull/55557) | Update dependencies |
| 0.0.7 | 2025-03-01 | [54997](https://github.com/airbytehq/airbyte/pull/54997) | Update dependencies |
| 0.0.6 | 2025-02-23 | [54588](https://github.com/airbytehq/airbyte/pull/54588) | Update dependencies |
| 0.0.5 | 2025-02-15 | [54008](https://github.com/airbytehq/airbyte/pull/54008) | Update dependencies |
| 0.0.4 | 2025-02-08 | [53484](https://github.com/airbytehq/airbyte/pull/53484) | Update dependencies |
| 0.0.3 | 2025-02-01 | [53016](https://github.com/airbytehq/airbyte/pull/53016) | Update dependencies |
| 0.0.2 | 2025-01-25 | [52467](https://github.com/airbytehq/airbyte/pull/52467) | Update dependencies |
| 0.0.1 | 2025-01-17 | | Initial release by [@GamesmenJordan](https://github.com/GamesmenJordan) via Connector Builder |

</details>

## Official Documentation
The official documentation can be found [here](https://developer.retailexpress.com.au/getting-started).
