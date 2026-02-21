

# V1alpha1TypedLocalObjectReference

TypedLocalObjectReference allows to reference typed object inside the same namespace.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**apiGroup** | **String** | APIGroup is the group for the resource being referenced. If APIGroup is empty, the specified Kind must be in the core API group. For any other third-party types, setting APIGroup is required. It must be a DNS subdomain. |  [optional] |
|**kind** | **String** | Kind is the type of resource being referenced. It must be a path segment name. |  |
|**name** | **String** | Name is the name of resource being referenced. It must be a path segment name. |  |



