

# V1Taint

The node this Taint is attached to has the \"effect\" on any pod that does not tolerate the Taint.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**effect** | **String** | Required. The effect of the taint on pods that do not tolerate the taint. Valid effects are NoSchedule, PreferNoSchedule and NoExecute. |  |
|**key** | **String** | Required. The taint key to be applied to a node. |  |
|**timeAdded** | **OffsetDateTime** | TimeAdded represents the time at which the taint was added. It is only written for NoExecute taints. |  [optional] |
|**value** | **String** | The taint value corresponding to the taint key. |  [optional] |



