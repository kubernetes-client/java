

# V1alpha2ResourceClaimConsumerReference

ResourceClaimConsumerReference contains enough information to let you locate the consumer of a ResourceClaim. The user must be a resource in the same namespace as the ResourceClaim.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**apiGroup** | **String** | APIGroup is the group for the resource being referenced. It is empty for the core API. This matches the group in the APIVersion that is used when creating the resources. |  [optional] |
|**name** | **String** | Name is the name of resource being referenced. |  |
|**resource** | **String** | Resource is the type of resource being referenced, for example \&quot;pods\&quot;. |  |
|**uid** | **String** | UID identifies exactly one incarnation of the resource. |  |



