
# V1ResourceQuotaStatus

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**hard** | **Map&lt;String, String&gt;** | Hard is the set of enforced hard limits for each named resource. More info: https://git.k8s.io/community/contributors/design-proposals/admission_control_resource_quota.md |  [optional]
**used** | **Map&lt;String, String&gt;** | Used is the current observed total usage of the resource in the namespace. |  [optional]



