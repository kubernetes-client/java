

# V1PersistentVolumeSpec

PersistentVolumeSpec is the specification of a persistent volume.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**accessModes** | **List&lt;String&gt;** | accessModes contains all ways the volume can be mounted. More info: https://kubernetes.io/docs/concepts/storage/persistent-volumes#access-modes |  [optional] |
|**awsElasticBlockStore** | [**V1AWSElasticBlockStoreVolumeSource**](V1AWSElasticBlockStoreVolumeSource.md) |  |  [optional] |
|**azureDisk** | [**V1AzureDiskVolumeSource**](V1AzureDiskVolumeSource.md) |  |  [optional] |
|**azureFile** | [**V1AzureFilePersistentVolumeSource**](V1AzureFilePersistentVolumeSource.md) |  |  [optional] |
|**capacity** | **Map&lt;String, Quantity&gt;** | capacity is the description of the persistent volume&#39;s resources and capacity. More info: https://kubernetes.io/docs/concepts/storage/persistent-volumes#capacity |  [optional] |
|**cephfs** | [**V1CephFSPersistentVolumeSource**](V1CephFSPersistentVolumeSource.md) |  |  [optional] |
|**cinder** | [**V1CinderPersistentVolumeSource**](V1CinderPersistentVolumeSource.md) |  |  [optional] |
|**claimRef** | [**V1ObjectReference**](V1ObjectReference.md) |  |  [optional] |
|**csi** | [**V1CSIPersistentVolumeSource**](V1CSIPersistentVolumeSource.md) |  |  [optional] |
|**fc** | [**V1FCVolumeSource**](V1FCVolumeSource.md) |  |  [optional] |
|**flexVolume** | [**V1FlexPersistentVolumeSource**](V1FlexPersistentVolumeSource.md) |  |  [optional] |
|**flocker** | [**V1FlockerVolumeSource**](V1FlockerVolumeSource.md) |  |  [optional] |
|**gcePersistentDisk** | [**V1GCEPersistentDiskVolumeSource**](V1GCEPersistentDiskVolumeSource.md) |  |  [optional] |
|**glusterfs** | [**V1GlusterfsPersistentVolumeSource**](V1GlusterfsPersistentVolumeSource.md) |  |  [optional] |
|**hostPath** | [**V1HostPathVolumeSource**](V1HostPathVolumeSource.md) |  |  [optional] |
|**iscsi** | [**V1ISCSIPersistentVolumeSource**](V1ISCSIPersistentVolumeSource.md) |  |  [optional] |
|**local** | [**V1LocalVolumeSource**](V1LocalVolumeSource.md) |  |  [optional] |
|**mountOptions** | **List&lt;String&gt;** | mountOptions is the list of mount options, e.g. [\&quot;ro\&quot;, \&quot;soft\&quot;]. Not validated - mount will simply fail if one is invalid. More info: https://kubernetes.io/docs/concepts/storage/persistent-volumes/#mount-options |  [optional] |
|**nfs** | [**V1NFSVolumeSource**](V1NFSVolumeSource.md) |  |  [optional] |
|**nodeAffinity** | [**V1VolumeNodeAffinity**](V1VolumeNodeAffinity.md) |  |  [optional] |
|**persistentVolumeReclaimPolicy** | **String** | persistentVolumeReclaimPolicy defines what happens to a persistent volume when released from its claim. Valid options are Retain (default for manually created PersistentVolumes), Delete (default for dynamically provisioned PersistentVolumes), and Recycle (deprecated). Recycle must be supported by the volume plugin underlying this PersistentVolume. More info: https://kubernetes.io/docs/concepts/storage/persistent-volumes#reclaiming |  [optional] |
|**photonPersistentDisk** | [**V1PhotonPersistentDiskVolumeSource**](V1PhotonPersistentDiskVolumeSource.md) |  |  [optional] |
|**portworxVolume** | [**V1PortworxVolumeSource**](V1PortworxVolumeSource.md) |  |  [optional] |
|**quobyte** | [**V1QuobyteVolumeSource**](V1QuobyteVolumeSource.md) |  |  [optional] |
|**rbd** | [**V1RBDPersistentVolumeSource**](V1RBDPersistentVolumeSource.md) |  |  [optional] |
|**scaleIO** | [**V1ScaleIOPersistentVolumeSource**](V1ScaleIOPersistentVolumeSource.md) |  |  [optional] |
|**storageClassName** | **String** | storageClassName is the name of StorageClass to which this persistent volume belongs. Empty value means that this volume does not belong to any StorageClass. |  [optional] |
|**storageos** | [**V1StorageOSPersistentVolumeSource**](V1StorageOSPersistentVolumeSource.md) |  |  [optional] |
|**volumeAttributesClassName** | **String** | Name of VolumeAttributesClass to which this persistent volume belongs. Empty value is not allowed. When this field is not set, it indicates that this volume does not belong to any VolumeAttributesClass. This field is mutable and can be changed by the CSI driver after a volume has been updated successfully to a new class. For an unbound PersistentVolume, the volumeAttributesClassName will be matched with unbound PersistentVolumeClaims during the binding process. This is an alpha field and requires enabling VolumeAttributesClass feature. |  [optional] |
|**volumeMode** | **String** | volumeMode defines if a volume is intended to be used with a formatted filesystem or to remain in raw block state. Value of Filesystem is implied when not included in spec. |  [optional] |
|**vsphereVolume** | [**V1VsphereVirtualDiskVolumeSource**](V1VsphereVirtualDiskVolumeSource.md) |  |  [optional] |



