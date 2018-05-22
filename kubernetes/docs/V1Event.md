
# V1Event

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**action** | **String** | What action was taken/failed regarding to the Regarding object. |  [optional]
**apiVersion** | **String** | APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/api-conventions.md#resources |  [optional]
**count** | **Integer** | The number of times this event has occurred. |  [optional]
**eventTime** | [**DateTime**](DateTime.md) | Time when this Event was first observed. |  [optional]
**firstTimestamp** | [**DateTime**](DateTime.md) | The time at which the event was first recorded. (Time of server receipt is in TypeMeta.) |  [optional]
**involvedObject** | [**V1ObjectReference**](V1ObjectReference.md) | The object that this event is about. | 
**kind** | **String** | Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds |  [optional]
**lastTimestamp** | [**DateTime**](DateTime.md) | The time at which the most recent occurrence of this event was recorded. |  [optional]
**message** | **String** | A human-readable description of the status of this operation. |  [optional]
**metadata** | [**V1ObjectMeta**](V1ObjectMeta.md) | Standard object&#39;s metadata. More info: https://git.k8s.io/community/contributors/devel/api-conventions.md#metadata | 
**reason** | **String** | This should be a short, machine understandable string that gives the reason for the transition into the object&#39;s current status. |  [optional]
**related** | [**V1ObjectReference**](V1ObjectReference.md) | Optional secondary object for more complex actions. |  [optional]
**reportingComponent** | **String** | Name of the controller that emitted this Event, e.g. &#x60;kubernetes.io/kubelet&#x60;. |  [optional]
**reportingInstance** | **String** | ID of the controller instance, e.g. &#x60;kubelet-xyzf&#x60;. |  [optional]
**series** | [**V1EventSeries**](V1EventSeries.md) | Data about the Event series this event represents or nil if it&#39;s a singleton Event. |  [optional]
**source** | [**V1EventSource**](V1EventSource.md) | The component reporting this event. Should be a short machine understandable string. |  [optional]
**type** | **String** | Type of this event (Normal, Warning), new types could be added in the future |  [optional]



