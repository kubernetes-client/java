

# V1JobCondition

JobCondition describes current state of a job.
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**lastProbeTime** | [**OffsetDateTime**](OffsetDateTime.md) | Last time the condition was checked. |  [optional]
**lastTransitionTime** | [**OffsetDateTime**](OffsetDateTime.md) | Last time the condition transit from one status to another. |  [optional]
**message** | **String** | Human readable message indicating details about last transition. |  [optional]
**reason** | **String** | (brief) reason for the condition&#39;s last transition. |  [optional]
**status** | **String** | Status of the condition, one of True, False, Unknown. | 
**type** | [**TypeEnum**](#TypeEnum) | Type of job condition, Complete or Failed.  Possible enum values:  - &#x60;\&quot;Complete\&quot;&#x60; means the job has completed its execution.  - &#x60;\&quot;Failed\&quot;&#x60; means the job has failed its execution.  - &#x60;\&quot;Suspended\&quot;&#x60; means the job has been suspended. | 



## Enum: TypeEnum

Name | Value
---- | -----
COMPLETE | &quot;Complete&quot;
FAILED | &quot;Failed&quot;
SUSPENDED | &quot;Suspended&quot;



