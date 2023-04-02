

# V1VolumeAttachmentSource

VolumeAttachmentSource represents a volume that should be attached. Right now only PersistenVolumes can be attached via external attacher, in future we may allow also inline volumes in pods. Exactly one member can be set.
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**inlineVolumeSpec** | [**V1PersistentVolumeSpec**](V1PersistentVolumeSpec.md) |  |  [optional]
**persistentVolumeName** | **String** | Name of the persistent volume to attach. |  [optional]



