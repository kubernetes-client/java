

# V1CustomResourceDefinitionCondition

CustomResourceDefinitionCondition contains details for the current condition of this pod.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**lastTransitionTime** | **OffsetDateTime** | lastTransitionTime last time the condition transitioned from one status to another. |  [optional] |
|**message** | **String** | message is a human-readable message indicating details about last transition. |  [optional] |
|**observedGeneration** | **Long** | observedGeneration represents the .metadata.generation that the condition was set based upon. For instance, if .metadata.generation is currently 12, but the .status.conditions[x].observedGeneration is 9, the condition is out of date with respect to the current state of the instance. |  [optional] |
|**reason** | **String** | reason is a unique, one-word, CamelCase reason for the condition&#39;s last transition. |  [optional] |
|**status** | **String** | status is the status of the condition. Can be True, False, Unknown. |  |
|**type** | **String** | type is the type of the condition. Types include Established, NamesAccepted and Terminating. |  |



