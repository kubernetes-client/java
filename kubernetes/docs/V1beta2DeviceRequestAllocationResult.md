

# V1beta2DeviceRequestAllocationResult

DeviceRequestAllocationResult contains the allocation result for one request.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**adminAccess** | **Boolean** | AdminAccess indicates that this device was allocated for administrative access. See the corresponding request field for a definition of mode.  This is an alpha field and requires enabling the DRAAdminAccess feature gate. Admin access is disabled if this field is unset or set to false, otherwise it is enabled. |  [optional] |
|**bindingConditions** | **List&lt;String&gt;** | BindingConditions contains a copy of the BindingConditions from the corresponding ResourceSlice at the time of allocation.  This is an alpha field and requires enabling the DRADeviceBindingConditions and DRAResourceClaimDeviceStatus feature gates. |  [optional] |
|**bindingFailureConditions** | **List&lt;String&gt;** | BindingFailureConditions contains a copy of the BindingFailureConditions from the corresponding ResourceSlice at the time of allocation.  This is an alpha field and requires enabling the DRADeviceBindingConditions and DRAResourceClaimDeviceStatus feature gates. |  [optional] |
|**consumedCapacity** | **Map&lt;String, Quantity&gt;** | ConsumedCapacity tracks the amount of capacity consumed per device as part of the claim request. The consumed amount may differ from the requested amount: it is rounded up to the nearest valid value based on the device’s requestPolicy if applicable (i.e., may not be less than the requested amount).  The total consumed capacity for each device must not exceed the DeviceCapacity&#39;s Value.  This field is populated only for devices that allow multiple allocations. All capacity entries are included, even if the consumed amount is zero. |  [optional] |
|**device** | **String** | Device references one device instance via its name in the driver&#39;s resource pool. It must be a DNS label. |  |
|**driver** | **String** | Driver specifies the name of the DRA driver whose kubelet plugin should be invoked to process the allocation once the claim is needed on a node.  Must be a DNS subdomain and should end with a DNS domain owned by the vendor of the driver. |  |
|**pool** | **String** | This name together with the driver name and the device name field identify which device was allocated (&#x60;&lt;driver name&gt;/&lt;pool name&gt;/&lt;device name&gt;&#x60;).  Must not be longer than 253 characters and may contain one or more DNS sub-domains separated by slashes. |  |
|**request** | **String** | Request is the name of the request in the claim which caused this device to be allocated. If it references a subrequest in the firstAvailable list on a DeviceRequest, this field must include both the name of the main request and the subrequest using the format &lt;main request&gt;/&lt;subrequest&gt;.  Multiple devices may have been allocated per request. |  |
|**shareID** | **String** | ShareID uniquely identifies an individual allocation share of the device, used when the device supports multiple simultaneous allocations. It serves as an additional map key to differentiate concurrent shares of the same device. |  [optional] |
|**tolerations** | [**List&lt;V1beta2DeviceToleration&gt;**](V1beta2DeviceToleration.md) | A copy of all tolerations specified in the request at the time when the device got allocated.  The maximum number of tolerations is 16.  This is an alpha field and requires enabling the DRADeviceTaints feature gate. |  [optional] |



