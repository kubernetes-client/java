

# V1alpha2ResourceClassParametersReference

ResourceClassParametersReference contains enough information to let you locate the parameters for a ResourceClass.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**apiGroup** | **String** | APIGroup is the group for the resource being referenced. It is empty for the core API. This matches the group in the APIVersion that is used when creating the resources. |  [optional] |
|**kind** | **String** | Kind is the type of resource being referenced. This is the same value as in the parameter object&#39;s metadata. |  |
|**name** | **String** | Name is the name of resource being referenced. |  |
|**namespace** | **String** | Namespace that contains the referenced resource. Must be empty for cluster-scoped resources and non-empty for namespaced resources. |  [optional] |



