

# V1ContainerState

ContainerState holds a possible state of container. Only one of its members may be specified. If none of them is specified, the default one is ContainerStateWaiting.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**running** | [**V1ContainerStateRunning**](V1ContainerStateRunning.md) |  |  [optional] |
|**terminated** | [**V1ContainerStateTerminated**](V1ContainerStateTerminated.md) |  |  [optional] |
|**waiting** | [**V1ContainerStateWaiting**](V1ContainerStateWaiting.md) |  |  [optional] |



