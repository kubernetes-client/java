

# V1ReplicaSetCondition

ReplicaSetCondition describes the state of a replica set at a certain point.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**lastTransitionTime** | **OffsetDateTime** | The last time the condition transitioned from one status to another. |  [optional] |
|**message** | **String** | A human readable message indicating details about the transition. |  [optional] |
|**reason** | **String** | The reason for the condition&#39;s last transition. |  [optional] |
|**status** | **String** | Status of the condition, one of True, False, Unknown. |  |
|**type** | **String** | Type of replica set condition. |  |



