

# V2beta1APIResourceDiscovery

APIResourceDiscovery provides information about an API resource for discovery.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**resource** | **String** | resource is the plural name of the resource. |  |
|**responseKind** | [**V1GroupVersionKind**](V1GroupVersionKind.md) |  |  [optional] |
|**scope** | **String** | scope indicates the scope of a resource, either Cluster or Namespaced |  |
|**singularResource** | **String** | singularResource is the singular name of the resource. |  |
|**verbs** | **List&lt;String&gt;** | verbs is a list of supported API operation types |  |
|**shortNames** | **List&lt;String&gt;** | shortNames is a list of suggested short names of the resource. |  [optional] |
|**categories** | **List&lt;String&gt;** | categories is a list of the grouped resources this resource belongs to. |  [optional] |
|**subresources** | [**List&lt;V2beta1APISubresourceDiscovery&gt;**](V2beta1APISubresourceDiscovery.md) |  |  [optional] |



