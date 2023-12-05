

# V1PersistentVolumeClaimSpec

PersistentVolumeClaimSpec describes the common attributes of storage devices and allows a Source for provider-specific attributes
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**accessModes** | **List&lt;String&gt;** | accessModes contains the desired access modes the volume should have. More info: https://kubernetes.io/docs/concepts/storage/persistent-volumes#access-modes-1 |  [optional]
**dataSource** | [**V1TypedLocalObjectReference**](V1TypedLocalObjectReference.md) |  |  [optional]
**dataSourceRef** | [**V1TypedObjectReference**](V1TypedObjectReference.md) |  |  [optional]
**resources** | [**V1ResourceRequirements**](V1ResourceRequirements.md) |  |  [optional]
**selector** | [**V1LabelSelector**](V1LabelSelector.md) |  |  [optional]
**storageClassName** | **String** | storageClassName is the name of the StorageClass required by the claim. More info: https://kubernetes.io/docs/concepts/storage/persistent-volumes#class-1 |  [optional]
**volumeMode** | **String** | volumeMode defines what type of volume is required by the claim. Value of Filesystem is implied when not included in claim spec. |  [optional]
**volumeName** | **String** | volumeName is the binding reference to the PersistentVolume backing this claim. |  [optional]



