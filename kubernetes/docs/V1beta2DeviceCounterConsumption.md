

# V1beta2DeviceCounterConsumption

DeviceCounterConsumption defines a set of counters that a device will consume from a CounterSet.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**counterSet** | **String** | CounterSet is the name of the set from which the counters defined will be consumed. |  |
|**counters** | [**Map&lt;String, V1beta2Counter&gt;**](V1beta2Counter.md) | Counters defines the counters that will be consumed by the device.  The maximum number of counters is 32. |  |



