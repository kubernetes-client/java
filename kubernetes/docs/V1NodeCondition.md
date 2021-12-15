

# V1NodeCondition

NodeCondition contains condition information for a node.
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**lastHeartbeatTime** | [**OffsetDateTime**](OffsetDateTime.md) | Last time we got an update on a given condition. |  [optional]
**lastTransitionTime** | [**OffsetDateTime**](OffsetDateTime.md) | Last time the condition transit from one status to another. |  [optional]
**message** | **String** | Human readable message indicating details about last transition. |  [optional]
**reason** | **String** | (brief) reason for the condition&#39;s last transition. |  [optional]
**status** | **String** | Status of the condition, one of True, False, Unknown. | 
**type** | [**TypeEnum**](#TypeEnum) | Type of node condition.  Possible enum values:  - &#x60;\&quot;DiskPressure\&quot;&#x60; means the kubelet is under pressure due to insufficient available disk.  - &#x60;\&quot;MemoryPressure\&quot;&#x60; means the kubelet is under pressure due to insufficient available memory.  - &#x60;\&quot;NetworkUnavailable\&quot;&#x60; means that network for the node is not correctly configured.  - &#x60;\&quot;PIDPressure\&quot;&#x60; means the kubelet is under pressure due to insufficient available PID.  - &#x60;\&quot;Ready\&quot;&#x60; means kubelet is healthy and ready to accept pods. | 



## Enum: TypeEnum

Name | Value
---- | -----
DISKPRESSURE | &quot;DiskPressure&quot;
MEMORYPRESSURE | &quot;MemoryPressure&quot;
NETWORKUNAVAILABLE | &quot;NetworkUnavailable&quot;
PIDPRESSURE | &quot;PIDPressure&quot;
READY | &quot;Ready&quot;



