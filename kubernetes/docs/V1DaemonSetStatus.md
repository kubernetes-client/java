

# V1DaemonSetStatus

DaemonSetStatus represents the current status of a daemon set.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**collisionCount** | **Integer** | Count of hash collisions for the DaemonSet. The DaemonSet controller uses this field as a collision avoidance mechanism when it needs to create the name for the newest ControllerRevision. |  [optional] |
|**conditions** | [**List&lt;V1DaemonSetCondition&gt;**](V1DaemonSetCondition.md) | Represents the latest available observations of a DaemonSet&#39;s current state. |  [optional] |
|**currentNumberScheduled** | **Integer** | The number of nodes that are running at least 1 daemon pod and are supposed to run the daemon pod. More info: https://kubernetes.io/docs/concepts/workloads/controllers/daemonset/ |  |
|**desiredNumberScheduled** | **Integer** | The total number of nodes that should be running the daemon pod (including nodes correctly running the daemon pod). More info: https://kubernetes.io/docs/concepts/workloads/controllers/daemonset/ |  |
|**numberAvailable** | **Integer** | The number of nodes that should be running the daemon pod and have one or more of the daemon pod running and available (ready for at least spec.minReadySeconds) |  [optional] |
|**numberMisscheduled** | **Integer** | The number of nodes that are running the daemon pod, but are not supposed to run the daemon pod. More info: https://kubernetes.io/docs/concepts/workloads/controllers/daemonset/ |  |
|**numberReady** | **Integer** | numberReady is the number of nodes that should be running the daemon pod and have one or more of the daemon pod running with a Ready Condition. |  |
|**numberUnavailable** | **Integer** | The number of nodes that should be running the daemon pod and have none of the daemon pod running and available (ready for at least spec.minReadySeconds) |  [optional] |
|**observedGeneration** | **Long** | The most recent generation observed by the daemon set controller. |  [optional] |
|**updatedNumberScheduled** | **Integer** | The total number of nodes that are running updated daemon pod |  [optional] |



