

# V1CounterSet

CounterSet defines a named set of counters that are available to be used by devices defined in the ResourceSlice.  The counters are not allocatable by themselves, but can be referenced by devices. When a device is allocated, the portion of counters it uses will no longer be available for use by other devices.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**counters** | [**Map&lt;String, V1Counter&gt;**](V1Counter.md) | Counters defines the set of counters for this CounterSet The name of each counter must be unique in that set and must be a DNS label.  The maximum number of counters in all sets is 32. |  |
|**name** | **String** | Name defines the name of the counter set. It must be a DNS label. |  |



