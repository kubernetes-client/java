
# V1PodStatus

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**conditions** | [**List&lt;V1PodCondition&gt;**](V1PodCondition.md) | Current service state of pod. More info: https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle#pod-conditions |  [optional]
**containerStatuses** | [**List&lt;V1ContainerStatus&gt;**](V1ContainerStatus.md) | The list has one entry per container in the manifest. Each entry is currently the output of &#x60;docker inspect&#x60;. More info: https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle#pod-and-container-status |  [optional]
**hostIP** | **String** | IP address of the host to which the pod is assigned. Empty if not yet scheduled. |  [optional]
**initContainerStatuses** | [**List&lt;V1ContainerStatus&gt;**](V1ContainerStatus.md) | The list has one entry per init container in the manifest. The most recent successful init container will have ready &#x3D; true, the most recently started container will have startTime set. More info: https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle#pod-and-container-status |  [optional]
**message** | **String** | A human readable message indicating details about why the pod is in this condition. |  [optional]
**phase** | **String** | Current condition of the pod. More info: https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle#pod-phase |  [optional]
**podIP** | **String** | IP address allocated to the pod. Routable at least within the cluster. Empty if not yet allocated. |  [optional]
**qosClass** | **String** | The Quality of Service (QOS) classification assigned to the pod based on resource requirements See PodQOSClass type for available QOS classes More info: https://github.com/kubernetes/kubernetes/blob/master/docs/design/resource-qos.md |  [optional]
**reason** | **String** | A brief CamelCase message indicating details about why the pod is in this state. e.g. &#39;Evicted&#39; |  [optional]
**startTime** | [**DateTime**](DateTime.md) | RFC 3339 date and time at which the object was acknowledged by the Kubelet. This is before the Kubelet pulled the container image(s) for the pod. |  [optional]



