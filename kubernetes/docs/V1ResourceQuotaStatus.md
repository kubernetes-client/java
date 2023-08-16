

# V1ResourceQuotaStatus

ResourceQuotaStatus defines the enforced hard limits and observed use.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**hard** | **Map&lt;String, Quantity&gt;** | Hard is the set of enforced hard limits for each named resource. More info: https://kubernetes.io/docs/concepts/policy/resource-quotas/ |  [optional] |
|**used** | **Map&lt;String, Quantity&gt;** | Used is the current observed total usage of the resource in the namespace. |  [optional] |



