

# V1ResourceAttributes

ResourceAttributes includes the authorization attributes available for resource requests to the Authorizer interface

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**group** | **String** | Group is the API Group of the Resource.  \&quot;*\&quot; means all. |  [optional] |
|**name** | **String** | Name is the name of the resource being requested for a \&quot;get\&quot; or deleted for a \&quot;delete\&quot;. \&quot;\&quot; (empty) means all. |  [optional] |
|**namespace** | **String** | Namespace is the namespace of the action being requested.  Currently, there is no distinction between no namespace and all namespaces \&quot;\&quot; (empty) is defaulted for LocalSubjectAccessReviews \&quot;\&quot; (empty) is empty for cluster-scoped resources \&quot;\&quot; (empty) means \&quot;all\&quot; for namespace scoped resources from a SubjectAccessReview or SelfSubjectAccessReview |  [optional] |
|**resource** | **String** | Resource is one of the existing resource types.  \&quot;*\&quot; means all. |  [optional] |
|**subresource** | **String** | Subresource is one of the existing resource types.  \&quot;\&quot; means none. |  [optional] |
|**verb** | **String** | Verb is a kubernetes resource API verb, like: get, list, watch, create, update, delete, proxy.  \&quot;*\&quot; means all. |  [optional] |
|**version** | **String** | Version is the API Version of the Resource.  \&quot;*\&quot; means all. |  [optional] |



