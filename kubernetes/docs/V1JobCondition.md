

# V1JobCondition

JobCondition describes current state of a job.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**lastProbeTime** | **OffsetDateTime** | Last time the condition was checked. |  [optional] |
|**lastTransitionTime** | **OffsetDateTime** | Last time the condition transit from one status to another. |  [optional] |
|**message** | **String** | Human readable message indicating details about last transition. |  [optional] |
|**reason** | **String** | (brief) reason for the condition&#39;s last transition. |  [optional] |
|**status** | **String** | Status of the condition, one of True, False, Unknown. |  |
|**type** | **String** | Type of job condition, Complete or Failed. |  |



