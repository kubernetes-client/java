

# V1JobStatus

JobStatus represents the current state of a Job.
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**active** | **Integer** | The number of pending and running pods. |  [optional]
**completedIndexes** | **String** | completedIndexes holds the completed indexes when .spec.completionMode &#x3D; \&quot;Indexed\&quot; in a text format. The indexes are represented as decimal integers separated by commas. The numbers are listed in increasing order. Three or more consecutive numbers are compressed and represented by the first and last element of the series, separated by a hyphen. For example, if the completed indexes are 1, 3, 4, 5 and 7, they are represented as \&quot;1,3-5,7\&quot;. |  [optional]
**completionTime** | [**OffsetDateTime**](OffsetDateTime.md) | Represents time when the job was completed. It is not guaranteed to be set in happens-before order across separate operations. It is represented in RFC3339 form and is in UTC. The completion time is only set when the job finishes successfully. |  [optional]
**conditions** | [**List&lt;V1JobCondition&gt;**](V1JobCondition.md) | The latest available observations of an object&#39;s current state. When a Job fails, one of the conditions will have type \&quot;Failed\&quot; and status true. When a Job is suspended, one of the conditions will have type \&quot;Suspended\&quot; and status true; when the Job is resumed, the status of this condition will become false. When a Job is completed, one of the conditions will have type \&quot;Complete\&quot; and status true. More info: https://kubernetes.io/docs/concepts/workloads/controllers/jobs-run-to-completion/ |  [optional]
**failed** | **Integer** | The number of pods which reached phase Failed. |  [optional]
**failedIndexes** | **String** | FailedIndexes holds the failed indexes when backoffLimitPerIndex&#x3D;true. The indexes are represented in the text format analogous as for the &#x60;completedIndexes&#x60; field, ie. they are kept as decimal integers separated by commas. The numbers are listed in increasing order. Three or more consecutive numbers are compressed and represented by the first and last element of the series, separated by a hyphen. For example, if the failed indexes are 1, 3, 4, 5 and 7, they are represented as \&quot;1,3-5,7\&quot;. This field is alpha-level. It can be used when the &#x60;JobBackoffLimitPerIndex&#x60; feature gate is enabled (disabled by default). |  [optional]
**ready** | **Integer** | The number of pods which have a Ready condition.  This field is beta-level. The job controller populates the field when the feature gate JobReadyPods is enabled (enabled by default). |  [optional]
**startTime** | [**OffsetDateTime**](OffsetDateTime.md) | Represents time when the job controller started processing a job. When a Job is created in the suspended state, this field is not set until the first time it is resumed. This field is reset every time a Job is resumed from suspension. It is represented in RFC3339 form and is in UTC. |  [optional]
**succeeded** | **Integer** | The number of pods which reached phase Succeeded. |  [optional]
**terminating** | **Integer** | The number of pods which are terminating (in phase Pending or Running and have a deletionTimestamp).  This field is alpha-level. The job controller populates the field when the feature gate JobPodReplacementPolicy is enabled (disabled by default). |  [optional]
**uncountedTerminatedPods** | [**V1UncountedTerminatedPods**](V1UncountedTerminatedPods.md) |  |  [optional]



