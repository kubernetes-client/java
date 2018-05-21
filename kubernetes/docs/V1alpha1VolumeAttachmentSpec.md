
# V1alpha1VolumeAttachmentSpec

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**attacher** | **String** | Attacher indicates the name of the volume driver that MUST handle this request. This is the name returned by GetPluginName(). | 
**nodeName** | **String** | The node that the volume should be attached to. | 
**source** | [**V1alpha1VolumeAttachmentSource**](V1alpha1VolumeAttachmentSource.md) | Source represents the volume that should be attached. | 



