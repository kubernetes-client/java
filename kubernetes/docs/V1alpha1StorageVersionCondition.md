

# V1alpha1StorageVersionCondition

Describes the state of the storageVersion at a certain point.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**lastTransitionTime** | **OffsetDateTime** | lastTransitionTime is the last time the condition transitioned from one status to another. |  [optional] |
|**message** | **String** | message is a human readable string indicating details about the transition. |  |
|**observedGeneration** | **Long** | observedGeneration represents the .metadata.generation that the condition was set based upon, if field is set. |  [optional] |
|**reason** | **String** | reason for the condition&#39;s last transition. |  |
|**status** | **String** | status of the condition, one of True, False, Unknown. |  |
|**type** | **String** | type of the condition. |  |



