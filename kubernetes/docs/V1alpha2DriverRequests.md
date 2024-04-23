

# V1alpha2DriverRequests

DriverRequests describes all resources that are needed from one particular driver.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**driverName** | **String** | DriverName is the name used by the DRA driver kubelet plugin. |  [optional] |
|**requests** | [**List&lt;V1alpha2ResourceRequest&gt;**](V1alpha2ResourceRequest.md) | Requests describes all resources that are needed from the driver. |  [optional] |
|**vendorParameters** | **Object** | VendorParameters are arbitrary setup parameters for all requests of the claim. They are ignored while allocating the claim. |  [optional] |



