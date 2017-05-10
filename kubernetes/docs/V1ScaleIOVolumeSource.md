
# V1ScaleIOVolumeSource

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**fsType** | **String** | Filesystem type to mount. Must be a filesystem type supported by the host operating system. Ex. \&quot;ext4\&quot;, \&quot;xfs\&quot;, \&quot;ntfs\&quot;. Implicitly inferred to be \&quot;ext4\&quot; if unspecified. |  [optional]
**gateway** | **String** | The host address of the ScaleIO API Gateway. | 
**protectionDomain** | **String** | The name of the Protection Domain for the configured storage (defaults to \&quot;default\&quot;). |  [optional]
**readOnly** | **Boolean** | Defaults to false (read/write). ReadOnly here will force the ReadOnly setting in VolumeMounts. |  [optional]
**secretRef** | [**V1LocalObjectReference**](V1LocalObjectReference.md) | SecretRef references to the secret for ScaleIO user and other sensitive information. If this is not provided, Login operation will fail. | 
**sslEnabled** | **Boolean** | Flag to enable/disable SSL communication with Gateway, default false |  [optional]
**storageMode** | **String** | Indicates whether the storage for a volume should be thick or thin (defaults to \&quot;thin\&quot;). |  [optional]
**storagePool** | **String** | The Storage Pool associated with the protection domain (defaults to \&quot;default\&quot;). |  [optional]
**system** | **String** | The name of the storage system as configured in ScaleIO. | 
**volumeName** | **String** | The name of a volume already created in the ScaleIO system that is associated with this volume source. |  [optional]



