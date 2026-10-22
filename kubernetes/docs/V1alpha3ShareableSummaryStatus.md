

# V1alpha3ShareableSummaryStatus

ShareableSummaryStatus reports aggregate capacity for a pool that contains devices with AllowMultipleAllocations.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**capacity** | [**List&lt;V1alpha3ShareableCapacityStatus&gt;**](V1alpha3ShareableCapacityStatus.md) | Capacity reports aggregate total, consumed, and available amounts per shareable capacity key across the pool. |  [optional] |
|**fullyAvailableDevices** | **Integer** | FullyAvailableDevices is the number of shareable devices with no capacity consumed. |  |
|**partiallyAvailableDevices** | **Integer** | PartiallyAvailableDevices is the number of shareable devices with some but not all capacity consumed. |  |



