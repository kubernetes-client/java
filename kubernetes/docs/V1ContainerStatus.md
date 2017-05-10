
# V1ContainerStatus

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**containerID** | **String** | Container&#39;s ID in the format &#39;docker://&lt;container_id&gt;&#39;. More info: http://kubernetes.io/docs/user-guide/container-environment#container-information |  [optional]
**image** | **String** | The image the container is running. More info: http://kubernetes.io/docs/user-guide/images | 
**imageID** | **String** | ImageID of the container&#39;s image. | 
**lastState** | [**V1ContainerState**](V1ContainerState.md) | Details about the container&#39;s last termination condition. |  [optional]
**name** | **String** | This must be a DNS_LABEL. Each container in a pod must have a unique name. Cannot be updated. | 
**ready** | **Boolean** | Specifies whether the container has passed its readiness probe. | 
**restartCount** | **Integer** | The number of times the container has been restarted, currently based on the number of dead containers that have not yet been removed. Note that this is calculated from dead containers. But those containers are subject to garbage collection. This value will get capped at 5 by GC. | 
**state** | [**V1ContainerState**](V1ContainerState.md) | Details about the container&#39;s current condition. |  [optional]



