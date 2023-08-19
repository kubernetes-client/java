

# V2HorizontalPodAutoscalerCondition

HorizontalPodAutoscalerCondition describes the state of a HorizontalPodAutoscaler at a certain point.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**lastTransitionTime** | **OffsetDateTime** | lastTransitionTime is the last time the condition transitioned from one status to another |  [optional] |
|**message** | **String** | message is a human-readable explanation containing details about the transition |  [optional] |
|**reason** | **String** | reason is the reason for the condition&#39;s last transition. |  [optional] |
|**status** | **String** | status is the status of the condition (True, False, Unknown) |  |
|**type** | **String** | type describes the current condition |  |



