

# V1beta1EventSeries

EventSeries contain information on series of events, i.e. thing that was/is happening continuously for some time.
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**count** | **Integer** | Number of occurrences in this series up to the last heartbeat time | 
**lastObservedTime** | [**DateTime**](DateTime.md) | Time when last Event from the series was seen before last heartbeat. | 
**state** | **String** | Information whether this series is ongoing or finished. Deprecated. Planned removal for 1.18 | 



