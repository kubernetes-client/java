
# V1VolumeMount

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**mountPath** | **String** | Path within the container at which the volume should be mounted.  Must not contain &#39;:&#39;. | 
**name** | **String** | This must match the Name of a Volume. | 
**readOnly** | **Boolean** | Mounted read-only if true, read-write otherwise (false or unspecified). Defaults to false. |  [optional]
**subPath** | **String** | Path within the volume from which the container&#39;s volume should be mounted. Defaults to \&quot;\&quot; (volume&#39;s root). |  [optional]



