

# V1NodeList

NodeList is the whole list of all Nodes which have been registered with master.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**apiVersion** | **String** | APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources |  [optional] |
|**items** | [**List&lt;V1Node&gt;**](V1Node.md) | List of nodes |  |
|**kind** | **String** | Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds |  [optional] |
|**metadata** | [**V1ListMeta**](V1ListMeta.md) |  |  [optional] |


## Implemented Interfaces

* io.kubernetes.client.common.KubernetesListObject


