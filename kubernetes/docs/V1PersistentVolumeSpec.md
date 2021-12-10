

# V1PersistentVolumeSpec

PersistentVolumeSpec is the specification of a persistent volume.
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**accessModes** | **List&lt;String&gt;** | AccessModes contains all ways the volume can be mounted. More info: https://kubernetes.io/docs/concepts/storage/persistent-volumes#access-modes |  [optional]
**awsElasticBlockStore** | [**V1AWSElasticBlockStoreVolumeSource**](V1AWSElasticBlockStoreVolumeSource.md) |  |  [optional]
**azureDisk** | [**V1AzureDiskVolumeSource**](V1AzureDiskVolumeSource.md) |  |  [optional]
**azureFile** | [**V1AzureFilePersistentVolumeSource**](V1AzureFilePersistentVolumeSource.md) |  |  [optional]
**capacity** | [**Map&lt;String, Quantity&gt;**](Quantity.md) | A description of the persistent volume&#39;s resources and capacity. More info: https://kubernetes.io/docs/concepts/storage/persistent-volumes#capacity |  [optional]
**cephfs** | [**V1CephFSPersistentVolumeSource**](V1CephFSPersistentVolumeSource.md) |  |  [optional]
**cinder** | [**V1CinderPersistentVolumeSource**](V1CinderPersistentVolumeSource.md) |  |  [optional]
**claimRef** | [**V1ObjectReference**](V1ObjectReference.md) |  |  [optional]
**csi** | [**V1CSIPersistentVolumeSource**](V1CSIPersistentVolumeSource.md) |  |  [optional]
**fc** | [**V1FCVolumeSource**](V1FCVolumeSource.md) |  |  [optional]
**flexVolume** | [**V1FlexPersistentVolumeSource**](V1FlexPersistentVolumeSource.md) |  |  [optional]
**flocker** | [**V1FlockerVolumeSource**](V1FlockerVolumeSource.md) |  |  [optional]
**gcePersistentDisk** | [**V1GCEPersistentDiskVolumeSource**](V1GCEPersistentDiskVolumeSource.md) |  |  [optional]
**glusterfs** | [**V1GlusterfsPersistentVolumeSource**](V1GlusterfsPersistentVolumeSource.md) |  |  [optional]
**hostPath** | [**V1HostPathVolumeSource**](V1HostPathVolumeSource.md) |  |  [optional]
**iscsi** | [**V1ISCSIPersistentVolumeSource**](V1ISCSIPersistentVolumeSource.md) |  |  [optional]
**local** | [**V1LocalVolumeSource**](V1LocalVolumeSource.md) |  |  [optional]
**mountOptions** | **List&lt;String&gt;** | A list of mount options, e.g. [\&quot;ro\&quot;, \&quot;soft\&quot;]. Not validated - mount will simply fail if one is invalid. More info: https://kubernetes.io/docs/concepts/storage/persistent-volumes/#mount-options |  [optional]
**nfs** | [**V1NFSVolumeSource**](V1NFSVolumeSource.md) |  |  [optional]
**nodeAffinity** | [**V1VolumeNodeAffinity**](V1VolumeNodeAffinity.md) |  |  [optional]
**persistentVolumeReclaimPolicy** | [**PersistentVolumeReclaimPolicyEnum**](#PersistentVolumeReclaimPolicyEnum) | What happens to a persistent volume when released from its claim. Valid options are Retain (default for manually created PersistentVolumes), Delete (default for dynamically provisioned PersistentVolumes), and Recycle (deprecated). Recycle must be supported by the volume plugin underlying this PersistentVolume. More info: https://kubernetes.io/docs/concepts/storage/persistent-volumes#reclaiming  Possible enum values:  - &#x60;\&quot;Delete\&quot;&#x60; means the volume will be deleted from Kubernetes on release from its claim. The volume plugin must support Deletion.  - &#x60;\&quot;Recycle\&quot;&#x60; means the volume will be recycled back into the pool of unbound persistent volumes on release from its claim. The volume plugin must support Recycling.  - &#x60;\&quot;Retain\&quot;&#x60; means the volume will be left in its current phase (Released) for manual reclamation by the administrator. The default policy is Retain. |  [optional]
**photonPersistentDisk** | [**V1PhotonPersistentDiskVolumeSource**](V1PhotonPersistentDiskVolumeSource.md) |  |  [optional]
**portworxVolume** | [**V1PortworxVolumeSource**](V1PortworxVolumeSource.md) |  |  [optional]
**quobyte** | [**V1QuobyteVolumeSource**](V1QuobyteVolumeSource.md) |  |  [optional]
**rbd** | [**V1RBDPersistentVolumeSource**](V1RBDPersistentVolumeSource.md) |  |  [optional]
**scaleIO** | [**V1ScaleIOPersistentVolumeSource**](V1ScaleIOPersistentVolumeSource.md) |  |  [optional]
**storageClassName** | **String** | Name of StorageClass to which this persistent volume belongs. Empty value means that this volume does not belong to any StorageClass. |  [optional]
**storageos** | [**V1StorageOSPersistentVolumeSource**](V1StorageOSPersistentVolumeSource.md) |  |  [optional]
**volumeMode** | **String** | volumeMode defines if a volume is intended to be used with a formatted filesystem or to remain in raw block state. Value of Filesystem is implied when not included in spec. |  [optional]
**vsphereVolume** | [**V1VsphereVirtualDiskVolumeSource**](V1VsphereVirtualDiskVolumeSource.md) |  |  [optional]



## Enum: PersistentVolumeReclaimPolicyEnum

Name | Value
---- | -----
DELETE | &quot;Delete&quot;
RECYCLE | &quot;Recycle&quot;
RETAIN | &quot;Retain&quot;



