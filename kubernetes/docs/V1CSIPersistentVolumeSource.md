

# V1CSIPersistentVolumeSource

Represents storage that is managed by an external CSI volume driver (Beta feature)
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**controllerExpandSecretRef** | [**V1SecretReference**](V1SecretReference.md) |  |  [optional]
**controllerPublishSecretRef** | [**V1SecretReference**](V1SecretReference.md) |  |  [optional]
**driver** | **String** | Driver is the name of the driver to use for this volume. Required. | 
**fsType** | **String** | Filesystem type to mount. Must be a filesystem type supported by the host operating system. Ex. \&quot;ext4\&quot;, \&quot;xfs\&quot;, \&quot;ntfs\&quot;. |  [optional]
**nodePublishSecretRef** | [**V1SecretReference**](V1SecretReference.md) |  |  [optional]
**nodeStageSecretRef** | [**V1SecretReference**](V1SecretReference.md) |  |  [optional]
**readOnly** | **Boolean** | Optional: The value to pass to ControllerPublishVolumeRequest. Defaults to false (read/write). |  [optional]
**volumeAttributes** | **Map&lt;String, String&gt;** | Attributes of the volume to publish. |  [optional]
**volumeHandle** | **String** | VolumeHandle is the unique volume name returned by the CSI volume plugin’s CreateVolume to refer to the volume on all subsequent calls. Required. | 



