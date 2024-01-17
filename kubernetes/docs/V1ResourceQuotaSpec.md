

# V1ResourceQuotaSpec

ResourceQuotaSpec defines the desired hard limits to enforce for Quota.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**hard** | **Map&lt;String, Quantity&gt;** | hard is the set of desired hard limits for each named resource. More info: https://kubernetes.io/docs/concepts/policy/resource-quotas/ |  [optional] |
|**scopeSelector** | [**V1ScopeSelector**](V1ScopeSelector.md) |  |  [optional] |
|**scopes** | **List&lt;String&gt;** | A collection of filters that must match each object tracked by a quota. If not specified, the quota matches all objects. |  [optional] |



