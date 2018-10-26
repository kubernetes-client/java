
# V1LocalVolumeSource

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**fsType** | **String** | Filesystem type to mount. It applies only when the Path is a block device. Must be a filesystem type supported by the host operating system. Ex. \&quot;ext4\&quot;, \&quot;xfs\&quot;, \&quot;ntfs\&quot;. The default value is to auto-select a fileystem if unspecified. |  [optional]
**path** | **String** | The full path to the volume on the node. It can be either a directory or block device (disk, partition, ...). | 



