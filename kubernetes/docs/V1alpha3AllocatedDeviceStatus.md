

# V1alpha3AllocatedDeviceStatus

AllocatedDeviceStatus contains the status of an allocated device, if the driver chooses to report it. This may include driver-specific information.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**conditions** | [**List&lt;V1Condition&gt;**](V1Condition.md) | Conditions contains the latest observation of the device&#39;s state. If the device has been configured according to the class and claim config references, the &#x60;Ready&#x60; condition should be True. |  [optional] |
|**data** | **Object** | Data contains arbitrary driver-specific data.  The length of the raw data must be smaller or equal to 10 Ki. |  [optional] |
|**device** | **String** | Device references one device instance via its name in the driver&#39;s resource pool. It must be a DNS label. |  |
|**driver** | **String** | Driver specifies the name of the DRA driver whose kubelet plugin should be invoked to process the allocation once the claim is needed on a node.  Must be a DNS subdomain and should end with a DNS domain owned by the vendor of the driver. |  |
|**networkData** | [**V1alpha3NetworkDeviceData**](V1alpha3NetworkDeviceData.md) |  |  [optional] |
|**pool** | **String** | This name together with the driver name and the device name field identify which device was allocated (&#x60;&lt;driver name&gt;/&lt;pool name&gt;/&lt;device name&gt;&#x60;).  Must not be longer than 253 characters and may contain one or more DNS sub-domains separated by slashes. |  |



