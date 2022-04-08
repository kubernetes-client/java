

# V1PersistentVolumeClaimCondition

PersistentVolumeClaimCondition contails details about state of pvc
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**lastProbeTime** | [**OffsetDateTime**](OffsetDateTime.md) | Last time we probed the condition. |  [optional]
**lastTransitionTime** | [**OffsetDateTime**](OffsetDateTime.md) | Last time the condition transitioned from one status to another. |  [optional]
**message** | **String** | Human-readable message indicating details about last transition. |  [optional]
**reason** | **String** | Unique, this should be a short, machine understandable string that gives the reason for condition&#39;s last transition. If it reports \&quot;ResizeStarted\&quot; that means the underlying persistent volume is being resized. |  [optional]
**status** | **String** |  | 
**type** | **String** |  | 



