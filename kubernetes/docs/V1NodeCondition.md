

# V1NodeCondition

NodeCondition contains condition information for a node.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**lastHeartbeatTime** | **OffsetDateTime** | Last time we got an update on a given condition. |  [optional] |
|**lastTransitionTime** | **OffsetDateTime** | Last time the condition transit from one status to another. |  [optional] |
|**message** | **String** | Human readable message indicating details about last transition. |  [optional] |
|**reason** | **String** | (brief) reason for the condition&#39;s last transition. |  [optional] |
|**status** | **String** | Status of the condition, one of True, False, Unknown. |  |
|**type** | **String** | Type of node condition. |  |



