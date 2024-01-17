

# V1VolumeAttachmentStatus

VolumeAttachmentStatus is the status of a VolumeAttachment request.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**attachError** | [**V1VolumeError**](V1VolumeError.md) |  |  [optional] |
|**attached** | **Boolean** | attached indicates the volume is successfully attached. This field must only be set by the entity completing the attach operation, i.e. the external-attacher. |  |
|**attachmentMetadata** | **Map&lt;String, String&gt;** | attachmentMetadata is populated with any information returned by the attach operation, upon successful attach, that must be passed into subsequent WaitForAttach or Mount calls. This field must only be set by the entity completing the attach operation, i.e. the external-attacher. |  [optional] |
|**detachError** | [**V1VolumeError**](V1VolumeError.md) |  |  [optional] |



