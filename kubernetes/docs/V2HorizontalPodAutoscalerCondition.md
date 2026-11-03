

# V2HorizontalPodAutoscalerCondition

HorizontalPodAutoscalerCondition describes the state of a HorizontalPodAutoscaler at a certain point.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**lastTransitionTime** | **OffsetDateTime** | lastTransitionTime is the last time the condition transitioned from one status to another |  [optional] |
|**message** | **String** | message is a human-readable explanation containing details about the transition |  [optional] |
|**observedGeneration** | **Long** | observedGeneration represents the .metadata.generation that the condition was set based upon. For instance, if .metadata.generation is currently 12, but the .status.conditions[x].observedGeneration is 9, the condition is out of date with respect to the current state of the instance. |  [optional] |
|**reason** | **String** | reason is the reason for the condition&#39;s last transition. |  [optional] |
|**status** | **String** | status is the status of the condition (True, False, Unknown) |  |
|**type** | **String** | type describes the current condition |  |



