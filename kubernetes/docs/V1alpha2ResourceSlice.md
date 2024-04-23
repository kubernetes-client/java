

# V1alpha2ResourceSlice

ResourceSlice provides information about available resources on individual nodes.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**apiVersion** | **String** | APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources |  [optional] |
|**driverName** | **String** | DriverName identifies the DRA driver providing the capacity information. A field selector can be used to list only ResourceSlice objects with a certain driver name. |  |
|**kind** | **String** | Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds |  [optional] |
|**metadata** | [**V1ObjectMeta**](V1ObjectMeta.md) |  |  [optional] |
|**namedResources** | [**V1alpha2NamedResourcesResources**](V1alpha2NamedResourcesResources.md) |  |  [optional] |
|**nodeName** | **String** | NodeName identifies the node which provides the resources if they are local to a node.  A field selector can be used to list only ResourceSlice objects with a certain node name. |  [optional] |


## Implemented Interfaces

* io.kubernetes.client.common.KubernetesObject


