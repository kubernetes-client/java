

# V1alpha3ResourcePoolStatusRequestSpec

ResourcePoolStatusRequestSpec defines the filters for the pool status request.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**driver** | **String** | Driver specifies the DRA driver name to filter pools. Only pools from ResourceSlices with this driver will be included. Must be a DNS subdomain (e.g., \&quot;gpu.example.com\&quot;). |  |
|**limit** | **Integer** | Limit optionally specifies the maximum number of pools to return in the status. If more pools match the filter criteria, the response will be truncated (i.e., len(status.pools) &lt; status.poolCount).  Default: 100 Minimum: 1 Maximum: 1000 |  [optional] |
|**poolName** | **String** | PoolName optionally filters to a specific pool name. If not specified, all pools from the specified driver are included. When specified, must be a non-empty valid resource pool name (DNS subdomains separated by \&quot;/\&quot;). |  [optional] |



