

# V1PodVolumeHealth

PodVolumeHealth contains health information for a volume used by a pod, reported by the CSI node plugin via the kubelet.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**healthConditions** | [**List&lt;V1VolumeHealthCondition&gt;**](V1VolumeHealthCondition.md) | conditions is the set of adverse conditions reported by the CSI node plugin for this volume on this node. At most 16 conditions may be reported. |  [optional] |
|**lastTransitionTime** | **OffsetDateTime** | lastTransitionTime is when the current set of conditions first appeared. |  [optional] |
|**name** | **String** | name matches an entry in pod.spec.volumes. |  |



