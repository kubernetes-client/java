
# V1JobStatus

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**active** | **Integer** | Active is the number of actively running pods. |  [optional]
**completionTime** | [**DateTime**](DateTime.md) | CompletionTime represents time when the job was completed. It is not guaranteed to be set in happens-before order across separate operations. It is represented in RFC3339 form and is in UTC. |  [optional]
**conditions** | [**List&lt;V1JobCondition&gt;**](V1JobCondition.md) | Conditions represent the latest available observations of an object&#39;s current state. More info: http://kubernetes.io/docs/user-guide/jobs |  [optional]
**failed** | **Integer** | Failed is the number of pods which reached Phase Failed. |  [optional]
**startTime** | [**DateTime**](DateTime.md) | StartTime represents time when the job was acknowledged by the Job Manager. It is not guaranteed to be set in happens-before order across separate operations. It is represented in RFC3339 form and is in UTC. |  [optional]
**succeeded** | **Integer** | Succeeded is the number of pods which reached Phase Succeeded. |  [optional]



