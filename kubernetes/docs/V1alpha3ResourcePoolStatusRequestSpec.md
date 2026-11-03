

# V1alpha3ResourcePoolStatusRequestSpec

ResourcePoolStatusRequestSpec defines the filters for the pool status request.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**defaultPartitionTypeAttribute** | **String** | DefaultPartitionTypeAttribute optionally names a device attribute (by its fully qualified name, e.g. \&quot;gpu.example.com/profile\&quot;) to use as the default grouping attribute for partitionable devices whose slice has not declared one themselves.  A slice&#39;s own PartitionTypeAttribute always takes precedence. This default applies only to devices whose slice does not declare one, so that a request can still get an accurate partitionSummary from a driver that has not been updated to declare it. When neither the slice nor this default names an attribute, a partitionable pool reports no partitionSummary.  Must include the domain qualifier. |  [optional] |
|**driver** | **String** | Driver specifies the DRA driver name to filter pools. Only pools from ResourceSlices with this driver will be included. Must be a DNS subdomain (e.g., \&quot;gpu.example.com\&quot;). |  |
|**limit** | **Integer** | Limit optionally specifies the maximum number of pools to return in the status. If more pools match the filter criteria, the response will be truncated (i.e., len(status.pools) &lt; status.poolCount).  Default: 100 Minimum: 1 Maximum: 1000 |  [optional] |
|**poolName** | **String** | PoolName optionally filters to a specific pool name. If not specified, all pools from the specified driver are included. When specified, must be a non-empty valid resource pool name (DNS subdomains separated by \&quot;/\&quot;). |  [optional] |



