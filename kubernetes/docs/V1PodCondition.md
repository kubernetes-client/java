

# V1PodCondition

PodCondition contains details for the current condition of this pod.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**lastProbeTime** | **OffsetDateTime** | Last time we probed the condition. |  [optional] |
|**lastTransitionTime** | **OffsetDateTime** | Last time the condition transitioned from one status to another. |  [optional] |
|**message** | **String** | Human-readable message indicating details about last transition. |  [optional] |
|**reason** | **String** | Unique, one-word, CamelCase reason for the condition&#39;s last transition. |  [optional] |
|**status** | **String** | Status is the status of the condition. Can be True, False, Unknown. More info: https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle#pod-conditions |  |
|**type** | **String** | Type is the type of the condition. More info: https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle#pod-conditions |  |



