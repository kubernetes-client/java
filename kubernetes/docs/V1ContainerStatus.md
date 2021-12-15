

# V1ContainerStatus

ContainerStatus contains details for the current status of this container.
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**containerID** | **String** | Container&#39;s ID in the format &#39;docker://&lt;container_id&gt;&#39;. |  [optional]
**image** | **String** | The image the container is running. More info: https://kubernetes.io/docs/concepts/containers/images. | 
**imageID** | **String** | ImageID of the container&#39;s image. | 
**lastState** | [**V1ContainerState**](V1ContainerState.md) |  |  [optional]
**name** | **String** | This must be a DNS_LABEL. Each container in a pod must have a unique name. Cannot be updated. | 
**ready** | **Boolean** | Specifies whether the container has passed its readiness probe. | 
**restartCount** | **Integer** | The number of times the container has been restarted. | 
**started** | **Boolean** | Specifies whether the container has passed its startup probe. Initialized as false, becomes true after startupProbe is considered successful. Resets to false when the container is restarted, or if kubelet loses state temporarily. Is always true when no startupProbe is defined. |  [optional]
**state** | [**V1ContainerState**](V1ContainerState.md) |  |  [optional]



