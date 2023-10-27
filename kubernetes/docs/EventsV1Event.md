

# EventsV1Event

Event is a report of an event somewhere in the cluster. It generally denotes some state change in the system. Events have a limited retention time and triggers and messages may evolve with time.  Event consumers should not rely on the timing of an event with a given Reason reflecting a consistent underlying trigger, or the continued existence of events with that Reason.  Events should be treated as informative, best-effort, supplemental data.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**action** | **String** | action is what action was taken/failed regarding to the regarding object. It is machine-readable. This field cannot be empty for new Events and it can have at most 128 characters. |  [optional] |
|**apiVersion** | **String** | APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources |  [optional] |
|**deprecatedCount** | **Integer** | deprecatedCount is the deprecated field assuring backward compatibility with core.v1 Event type. |  [optional] |
|**deprecatedFirstTimestamp** | **OffsetDateTime** | deprecatedFirstTimestamp is the deprecated field assuring backward compatibility with core.v1 Event type. |  [optional] |
|**deprecatedLastTimestamp** | **OffsetDateTime** | deprecatedLastTimestamp is the deprecated field assuring backward compatibility with core.v1 Event type. |  [optional] |
|**deprecatedSource** | [**V1EventSource**](V1EventSource.md) |  |  [optional] |
|**eventTime** | **OffsetDateTime** | eventTime is the time when this Event was first observed. It is required. |  |
|**kind** | **String** | Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds |  [optional] |
|**metadata** | [**V1ObjectMeta**](V1ObjectMeta.md) |  |  [optional] |
|**note** | **String** | note is a human-readable description of the status of this operation. Maximal length of the note is 1kB, but libraries should be prepared to handle values up to 64kB. |  [optional] |
|**reason** | **String** | reason is why the action was taken. It is human-readable. This field cannot be empty for new Events and it can have at most 128 characters. |  [optional] |
|**regarding** | [**V1ObjectReference**](V1ObjectReference.md) |  |  [optional] |
|**related** | [**V1ObjectReference**](V1ObjectReference.md) |  |  [optional] |
|**reportingController** | **String** | reportingController is the name of the controller that emitted this Event, e.g. &#x60;kubernetes.io/kubelet&#x60;. This field cannot be empty for new Events. |  [optional] |
|**reportingInstance** | **String** | reportingInstance is the ID of the controller instance, e.g. &#x60;kubelet-xyzf&#x60;. This field cannot be empty for new Events and it can have at most 128 characters. |  [optional] |
|**series** | [**EventsV1EventSeries**](EventsV1EventSeries.md) |  |  [optional] |
|**type** | **String** | type is the type of this event (Normal, Warning), new types could be added in the future. It is machine-readable. This field cannot be empty for new Events. |  [optional] |


## Implemented Interfaces

* io.kubernetes.client.common.KubernetesObject


