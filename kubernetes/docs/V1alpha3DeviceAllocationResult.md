

# V1alpha3DeviceAllocationResult

DeviceAllocationResult is the result of allocating devices.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**config** | [**List&lt;V1alpha3DeviceAllocationConfiguration&gt;**](V1alpha3DeviceAllocationConfiguration.md) | This field is a combination of all the claim and class configuration parameters. Drivers can distinguish between those based on a flag.  This includes configuration parameters for drivers which have no allocated devices in the result because it is up to the drivers which configuration parameters they support. They can silently ignore unknown configuration parameters. |  [optional] |
|**results** | [**List&lt;V1alpha3DeviceRequestAllocationResult&gt;**](V1alpha3DeviceRequestAllocationResult.md) | Results lists all allocated devices. |  [optional] |



