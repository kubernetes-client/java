

# V1PersistentVolume

PersistentVolume (PV) is a storage resource provisioned by an administrator. It is analogous to a node. More info: https://kubernetes.io/docs/concepts/storage/persistent-volumes

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**apiVersion** | **String** | APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources |  [optional] |
|**kind** | **String** | Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds |  [optional] |
|**metadata** | [**V1ObjectMeta**](V1ObjectMeta.md) |  |  [optional] |
|**spec** | [**V1PersistentVolumeSpec**](V1PersistentVolumeSpec.md) |  |  [optional] |
|**status** | [**V1PersistentVolumeStatus**](V1PersistentVolumeStatus.md) |  |  [optional] |


## Implemented Interfaces

* io.kubernetes.client.common.KubernetesObject


