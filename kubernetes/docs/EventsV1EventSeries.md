

# EventsV1EventSeries

EventSeries contain information on series of events, i.e. thing that was/is happening continuously for some time. How often to update the EventSeries is up to the event reporters. The default event reporter in \"k8s.io/client-go/tools/events/event_broadcaster.go\" shows how this struct is updated on heartbeats and can guide customized reporter implementations.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**count** | **Integer** | count is the number of occurrences in this series up to the last heartbeat time. |  |
|**lastObservedTime** | **OffsetDateTime** | lastObservedTime is the time when last Event from the series was seen before last heartbeat. |  |



