

# V2beta1APIGroupDiscoveryList

APIGroupDiscoveryList is a resource containing a list of APIGroupDiscovery. This is one of the types able to be returned from the /api and /apis endpoint and contains an aggregated list of API resources (built-ins, Custom Resource Definitions, resources from aggregated servers) that a cluster supports.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**apiVersion** | **String** |  |  [optional] |
|**kind** | **String** |  |  [optional] |
|**metadata** | [**V1ListMeta**](V1ListMeta.md) |  |  [optional] |
|**items** | [**List&lt;V2beta1APIGroupDiscovery&gt;**](V2beta1APIGroupDiscovery.md) |  |  |


## Implemented Interfaces

* io.kubernetes.client.common.KubernetesListObject


