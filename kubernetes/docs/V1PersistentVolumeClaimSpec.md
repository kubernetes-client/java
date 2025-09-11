

# V1PersistentVolumeClaimSpec

PersistentVolumeClaimSpec describes the common attributes of storage devices and allows a Source for provider-specific attributes

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**accessModes** | **List&lt;String&gt;** | accessModes contains the desired access modes the volume should have. More info: https://kubernetes.io/docs/concepts/storage/persistent-volumes#access-modes-1 |  [optional] |
|**dataSource** | [**V1TypedLocalObjectReference**](V1TypedLocalObjectReference.md) |  |  [optional] |
|**dataSourceRef** | [**V1TypedObjectReference**](V1TypedObjectReference.md) |  |  [optional] |
|**resources** | [**V1VolumeResourceRequirements**](V1VolumeResourceRequirements.md) |  |  [optional] |
|**selector** | [**V1LabelSelector**](V1LabelSelector.md) |  |  [optional] |
|**storageClassName** | **String** | storageClassName is the name of the StorageClass required by the claim. More info: https://kubernetes.io/docs/concepts/storage/persistent-volumes#class-1 |  [optional] |
|**volumeAttributesClassName** | **String** | volumeAttributesClassName may be used to set the VolumeAttributesClass used by this claim. If specified, the CSI driver will create or update the volume with the attributes defined in the corresponding VolumeAttributesClass. This has a different purpose than storageClassName, it can be changed after the claim is created. An empty string or nil value indicates that no VolumeAttributesClass will be applied to the claim. If the claim enters an Infeasible error state, this field can be reset to its previous value (including nil) to cancel the modification. If the resource referred to by volumeAttributesClass does not exist, this PersistentVolumeClaim will be set to a Pending state, as reflected by the modifyVolumeStatus field, until such as a resource exists. More info: https://kubernetes.io/docs/concepts/storage/volume-attributes-classes/ |  [optional] |
|**volumeMode** | **String** | volumeMode defines what type of volume is required by the claim. Value of Filesystem is implied when not included in claim spec. |  [optional] |
|**volumeName** | **String** | volumeName is the binding reference to the PersistentVolume backing this claim. |  [optional] |



