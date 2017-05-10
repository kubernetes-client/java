
# V1beta1DaemonSetStatus

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**currentNumberScheduled** | **Integer** | The number of nodes that are running at least 1 daemon pod and are supposed to run the daemon pod. More info: http://releases.k8s.io/HEAD/docs/admin/daemons.md | 
**desiredNumberScheduled** | **Integer** | The total number of nodes that should be running the daemon pod (including nodes correctly running the daemon pod). More info: http://releases.k8s.io/HEAD/docs/admin/daemons.md | 
**numberAvailable** | **Integer** | The number of nodes that should be running the daemon pod and have one or more of the daemon pod running and available (ready for at least spec.minReadySeconds) |  [optional]
**numberMisscheduled** | **Integer** | The number of nodes that are running the daemon pod, but are not supposed to run the daemon pod. More info: http://releases.k8s.io/HEAD/docs/admin/daemons.md | 
**numberReady** | **Integer** | The number of nodes that should be running the daemon pod and have one or more of the daemon pod running and ready. | 
**numberUnavailable** | **Integer** | The number of nodes that should be running the daemon pod and have none of the daemon pod running and available (ready for at least spec.minReadySeconds) |  [optional]
**observedGeneration** | **Long** | The most recent generation observed by the daemon set controller. |  [optional]
**updatedNumberScheduled** | **Integer** | The total number of nodes that are running updated daemon pod |  [optional]



