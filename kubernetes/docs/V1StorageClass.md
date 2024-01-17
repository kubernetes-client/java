

# V1StorageClass

StorageClass describes the parameters for a class of storage for which PersistentVolumes can be dynamically provisioned.  StorageClasses are non-namespaced; the name of the storage class according to etcd is in ObjectMeta.Name.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**allowVolumeExpansion** | **Boolean** | allowVolumeExpansion shows whether the storage class allow volume expand. |  [optional] |
|**allowedTopologies** | [**List&lt;V1TopologySelectorTerm&gt;**](V1TopologySelectorTerm.md) | allowedTopologies restrict the node topologies where volumes can be dynamically provisioned. Each volume plugin defines its own supported topology specifications. An empty TopologySelectorTerm list means there is no topology restriction. This field is only honored by servers that enable the VolumeScheduling feature. |  [optional] |
|**apiVersion** | **String** | APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources |  [optional] |
|**kind** | **String** | Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds |  [optional] |
|**metadata** | [**V1ObjectMeta**](V1ObjectMeta.md) |  |  [optional] |
|**mountOptions** | **List&lt;String&gt;** | mountOptions controls the mountOptions for dynamically provisioned PersistentVolumes of this storage class. e.g. [\&quot;ro\&quot;, \&quot;soft\&quot;]. Not validated - mount of the PVs will simply fail if one is invalid. |  [optional] |
|**parameters** | **Map&lt;String, String&gt;** | parameters holds the parameters for the provisioner that should create volumes of this storage class. |  [optional] |
|**provisioner** | **String** | provisioner indicates the type of the provisioner. |  |
|**reclaimPolicy** | **String** | reclaimPolicy controls the reclaimPolicy for dynamically provisioned PersistentVolumes of this storage class. Defaults to Delete. |  [optional] |
|**volumeBindingMode** | **String** | volumeBindingMode indicates how PersistentVolumeClaims should be provisioned and bound.  When unset, VolumeBindingImmediate is used. This field is only honored by servers that enable the VolumeScheduling feature. |  [optional] |


## Implemented Interfaces

* io.kubernetes.client.common.KubernetesObject


