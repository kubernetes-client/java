

# V1CustomResourceDefinitionCondition

CustomResourceDefinitionCondition contains details for the current condition of this pod.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**lastTransitionTime** | **OffsetDateTime** | lastTransitionTime last time the condition transitioned from one status to another. |  [optional] |
|**message** | **String** | message is a human-readable message indicating details about last transition. |  [optional] |
|**reason** | **String** | reason is a unique, one-word, CamelCase reason for the condition&#39;s last transition. |  [optional] |
|**status** | **String** | status is the status of the condition. Can be True, False, Unknown. |  |
|**type** | **String** | type is the type of the condition. Types include Established, NamesAccepted and Terminating. |  |



