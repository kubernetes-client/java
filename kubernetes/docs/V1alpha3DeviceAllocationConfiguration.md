

# V1alpha3DeviceAllocationConfiguration

DeviceAllocationConfiguration gets embedded in an AllocationResult.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**opaque** | [**V1alpha3OpaqueDeviceConfiguration**](V1alpha3OpaqueDeviceConfiguration.md) |  |  [optional] |
|**requests** | **List&lt;String&gt;** | Requests lists the names of requests where the configuration applies. If empty, its applies to all requests. |  [optional] |
|**source** | **String** | Source records whether the configuration comes from a class and thus is not something that a normal user would have been able to set or from a claim. |  |



