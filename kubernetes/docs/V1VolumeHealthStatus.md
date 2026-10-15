

# V1VolumeHealthStatus

VolumeHealthStatus contains health information for a volume reported by the CSI controller plugin.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**healthConditions** | [**List&lt;V1VolumeHealthCondition&gt;**](V1VolumeHealthCondition.md) | conditions is the set of adverse conditions reported by the CSI controller plugin. An empty list means no adverse condition. At most 16 conditions may be reported. |  [optional] |
|**lastTransitionTime** | **OffsetDateTime** | lastTransitionTime is when the current set of conditions first appeared. |  [optional] |



