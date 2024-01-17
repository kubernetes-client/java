

# V1IngressClassParametersReference

IngressClassParametersReference identifies an API object. This can be used to specify a cluster or namespace-scoped resource.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**apiGroup** | **String** | apiGroup is the group for the resource being referenced. If APIGroup is not specified, the specified Kind must be in the core API group. For any other third-party types, APIGroup is required. |  [optional] |
|**kind** | **String** | kind is the type of resource being referenced. |  |
|**name** | **String** | name is the name of resource being referenced. |  |
|**namespace** | **String** | namespace is the namespace of the resource being referenced. This field is required when scope is set to \&quot;Namespace\&quot; and must be unset when scope is set to \&quot;Cluster\&quot;. |  [optional] |
|**scope** | **String** | scope represents if this refers to a cluster or namespace scoped resource. This may be set to \&quot;Cluster\&quot; (default) or \&quot;Namespace\&quot;. |  [optional] |



