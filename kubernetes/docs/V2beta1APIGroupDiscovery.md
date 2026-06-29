

# V2beta1APIGroupDiscovery

APIGroupDiscovery holds information about which resources are being served for all version of the API Group. It contains a list of APIVersionDiscovery that holds a list of APIResourceDiscovery types served for a version. Versions are in descending order of preference, with the first version being the preferred entry.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**apiVersion** | **String** |  |  [optional] |
|**kind** | **String** |  |  [optional] |
|**metadata** | [**V1ObjectMeta**](V1ObjectMeta.md) |  |  [optional] |
|**versions** | [**List&lt;V2beta1APIVersionDiscovery&gt;**](V2beta1APIVersionDiscovery.md) |  |  [optional] |


## Implemented Interfaces

* io.kubernetes.client.common.KubernetesObject


