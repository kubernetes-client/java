

# V1alpha1StorageVersionCondition

Describes the state of the storageVersion at a certain point.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**lastTransitionTime** | **OffsetDateTime** | Last time the condition transitioned from one status to another. |  [optional] |
|**message** | **String** | A human readable message indicating details about the transition. |  |
|**observedGeneration** | **Long** | If set, this represents the .metadata.generation that the condition was set based upon. |  [optional] |
|**reason** | **String** | The reason for the condition&#39;s last transition. |  |
|**status** | **String** | Status of the condition, one of True, False, Unknown. |  |
|**type** | **String** | Type of the condition. |  |



