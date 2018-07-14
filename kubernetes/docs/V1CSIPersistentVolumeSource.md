
# V1CSIPersistentVolumeSource

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**controllerPublishSecretRef** | [**V1SecretReference**](V1SecretReference.md) | ControllerPublishSecretRef is a reference to the secret object containing sensitive information to pass to the CSI driver to complete the CSI ControllerPublishVolume and ControllerUnpublishVolume calls. This field is optional, and  may be empty if no secret is required. If the secret object contains more than one secret, all secrets are passed. |  [optional]
**driver** | **String** | Driver is the name of the driver to use for this volume. Required. | 
**fsType** | **String** | Filesystem type to mount. Must be a filesystem type supported by the host operating system. Ex. \&quot;ext4\&quot;, \&quot;xfs\&quot;, \&quot;ntfs\&quot;. |  [optional]
**nodePublishSecretRef** | [**V1SecretReference**](V1SecretReference.md) | NodePublishSecretRef is a reference to the secret object containing sensitive information to pass to the CSI driver to complete the CSI NodePublishVolume and NodeUnpublishVolume calls. This field is optional, and  may be empty if no secret is required. If the secret object contains more than one secret, all secrets are passed. |  [optional]
**nodeStageSecretRef** | [**V1SecretReference**](V1SecretReference.md) | NodeStageSecretRef is a reference to the secret object containing sensitive information to pass to the CSI driver to complete the CSI NodeStageVolume and NodeStageVolume and NodeUnstageVolume calls. This field is optional, and  may be empty if no secret is required. If the secret object contains more than one secret, all secrets are passed. |  [optional]
**readOnly** | **Boolean** | Optional: The value to pass to ControllerPublishVolumeRequest. Defaults to false (read/write). |  [optional]
**volumeAttributes** | **Map&lt;String, String&gt;** | Attributes of the volume to publish. |  [optional]
**volumeHandle** | **String** | VolumeHandle is the unique volume name returned by the CSI volume plugin’s CreateVolume to refer to the volume on all subsequent calls. Required. | 



