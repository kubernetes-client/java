
# V1beta1Event

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**action** | **String** | What action was taken/failed regarding to the regarding object. |  [optional]
**apiVersion** | **String** | APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/api-conventions.md#resources |  [optional]
**deprecatedCount** | **Integer** | Deprecated field assuring backward compatibility with core.v1 Event type |  [optional]
**deprecatedFirstTimestamp** | [**DateTime**](DateTime.md) | Deprecated field assuring backward compatibility with core.v1 Event type |  [optional]
**deprecatedLastTimestamp** | [**DateTime**](DateTime.md) | Deprecated field assuring backward compatibility with core.v1 Event type |  [optional]
**deprecatedSource** | [**V1EventSource**](V1EventSource.md) | Deprecated field assuring backward compatibility with core.v1 Event type |  [optional]
**eventTime** | [**DateTime**](DateTime.md) | Required. Time when this Event was first observed. | 
**kind** | **String** | Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds |  [optional]
**metadata** | [**V1ObjectMeta**](V1ObjectMeta.md) |  |  [optional]
**note** | **String** | Optional. A human-readable description of the status of this operation. Maximal length of the note is 1kB, but libraries should be prepared to handle values up to 64kB. |  [optional]
**reason** | **String** | Why the action was taken. |  [optional]
**regarding** | [**V1ObjectReference**](V1ObjectReference.md) | The object this Event is about. In most cases it&#39;s an Object reporting controller implements. E.g. ReplicaSetController implements ReplicaSets and this event is emitted because it acts on some changes in a ReplicaSet object. |  [optional]
**related** | [**V1ObjectReference**](V1ObjectReference.md) | Optional secondary object for more complex actions. E.g. when regarding object triggers a creation or deletion of related object. |  [optional]
**reportingController** | **String** | Name of the controller that emitted this Event, e.g. &#x60;kubernetes.io/kubelet&#x60;. |  [optional]
**reportingInstance** | **String** | ID of the controller instance, e.g. &#x60;kubelet-xyzf&#x60;. |  [optional]
**series** | [**V1beta1EventSeries**](V1beta1EventSeries.md) | Data about the Event series this event represents or nil if it&#39;s a singleton Event. |  [optional]
**type** | **String** | Type of this event (Normal, Warning), new types could be added in the future. |  [optional]



