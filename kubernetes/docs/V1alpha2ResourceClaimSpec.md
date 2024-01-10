

# V1alpha2ResourceClaimSpec

ResourceClaimSpec defines how a resource is to be allocated.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**allocationMode** | **String** | Allocation can start immediately or when a Pod wants to use the resource. \&quot;WaitForFirstConsumer\&quot; is the default. |  [optional] |
|**parametersRef** | [**V1alpha2ResourceClaimParametersReference**](V1alpha2ResourceClaimParametersReference.md) |  |  [optional] |
|**resourceClassName** | **String** | ResourceClassName references the driver and additional parameters via the name of a ResourceClass that was created as part of the driver deployment. |  |



