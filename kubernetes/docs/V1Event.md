
# V1Event

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**apiVersion** | **String** | APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: http://releases.k8s.io/HEAD/docs/devel/api-conventions.md#resources |  [optional]
**count** | **Integer** | The number of times this event has occurred. |  [optional]
**firstTimestamp** | [**DateTime**](DateTime.md) | The time at which the event was first recorded. (Time of server receipt is in TypeMeta.) |  [optional]
**involvedObject** | [**V1ObjectReference**](V1ObjectReference.md) | The object that this event is about. | 
**kind** | **String** | Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: http://releases.k8s.io/HEAD/docs/devel/api-conventions.md#types-kinds |  [optional]
**lastTimestamp** | [**DateTime**](DateTime.md) | The time at which the most recent occurrence of this event was recorded. |  [optional]
**message** | **String** | A human-readable description of the status of this operation. |  [optional]
**metadata** | [**V1ObjectMeta**](V1ObjectMeta.md) | Standard object&#39;s metadata. More info: http://releases.k8s.io/HEAD/docs/devel/api-conventions.md#metadata | 
**reason** | **String** | This should be a short, machine understandable string that gives the reason for the transition into the object&#39;s current status. |  [optional]
**source** | [**V1EventSource**](V1EventSource.md) | The component reporting this event. Should be a short machine understandable string. |  [optional]
**type** | **String** | Type of this event (Normal, Warning), new types could be added in the future |  [optional]



