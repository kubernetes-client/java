

# V1beta1AllocationResult

AllocationResult contains attributes of an allocated resource.
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**allocationTimestamp** | [**OffsetDateTime**](OffsetDateTime.md) | AllocationTimestamp stores the time when the resources were allocated. This field is not guaranteed to be set, in which case that time is unknown.  This is an alpha field and requires enabling the DRADeviceBindingConditions and DRAResourceClaimDeviceStatus feature gate. |  [optional]
**devices** | [**V1beta1DeviceAllocationResult**](V1beta1DeviceAllocationResult.md) |  |  [optional]
**nodeSelector** | [**V1NodeSelector**](V1NodeSelector.md) |  |  [optional]



