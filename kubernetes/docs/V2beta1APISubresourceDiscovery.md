

# V2beta1APISubresourceDiscovery

APISubresourceDiscovery provides information about an API subresource for discovery.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**subresource** | **String** | subresource is the name of the subresource. |  |
|**responseKind** | [**V1GroupVersionKind**](V1GroupVersionKind.md) |  |  [optional] |
|**verbs** | **List&lt;String&gt;** | verbs is a list of supported API operation types |  |
|**acceptedTypes** | [**List&lt;V1GroupVersionKind&gt;**](V1GroupVersionKind.md) |  |  [optional] |



