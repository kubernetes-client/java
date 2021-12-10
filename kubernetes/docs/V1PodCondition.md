

# V1PodCondition

PodCondition contains details for the current condition of this pod.
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**lastProbeTime** | [**OffsetDateTime**](OffsetDateTime.md) | Last time we probed the condition. |  [optional]
**lastTransitionTime** | [**OffsetDateTime**](OffsetDateTime.md) | Last time the condition transitioned from one status to another. |  [optional]
**message** | **String** | Human-readable message indicating details about last transition. |  [optional]
**reason** | **String** | Unique, one-word, CamelCase reason for the condition&#39;s last transition. |  [optional]
**status** | **String** | Status is the status of the condition. Can be True, False, Unknown. More info: https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle#pod-conditions | 
**type** | [**TypeEnum**](#TypeEnum) | Type is the type of the condition. More info: https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle#pod-conditions  Possible enum values:  - &#x60;\&quot;ContainersReady\&quot;&#x60; indicates whether all containers in the pod are ready.  - &#x60;\&quot;Initialized\&quot;&#x60; means that all init containers in the pod have started successfully.  - &#x60;\&quot;PodScheduled\&quot;&#x60; represents status of the scheduling process for this pod.  - &#x60;\&quot;Ready\&quot;&#x60; means the pod is able to service requests and should be added to the load balancing pools of all matching services. | 



## Enum: TypeEnum

Name | Value
---- | -----
CONTAINERSREADY | &quot;ContainersReady&quot;
INITIALIZED | &quot;Initialized&quot;
PODSCHEDULED | &quot;PodScheduled&quot;
READY | &quot;Ready&quot;



