
# V1ResourceQuotaSpec

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**hard** | **Map&lt;String, String&gt;** | Hard is the set of desired hard limits for each named resource. More info: https://git.k8s.io/community/contributors/design-proposals/admission_control_resource_quota.md |  [optional]
**scopes** | **List&lt;String&gt;** | A collection of filters that must match each object tracked by a quota. If not specified, the quota matches all objects. |  [optional]



