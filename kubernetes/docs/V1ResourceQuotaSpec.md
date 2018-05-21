
# V1ResourceQuotaSpec

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**hard** | [**Map&lt;String, Quantity&gt;**](Quantity.md) | Hard is the set of desired hard limits for each named resource. More info: https://kubernetes.io/docs/concepts/policy/resource-quotas/ |  [optional]
**scopes** | **List&lt;String&gt;** | A collection of filters that must match each object tracked by a quota. If not specified, the quota matches all objects. |  [optional]



