
# V1EndpointSubset

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**addresses** | [**List&lt;V1EndpointAddress&gt;**](V1EndpointAddress.md) | IP addresses which offer the related ports that are marked as ready. These endpoints should be considered safe for load balancers and clients to utilize. |  [optional]
**notReadyAddresses** | [**List&lt;V1EndpointAddress&gt;**](V1EndpointAddress.md) | IP addresses which offer the related ports but are not currently marked as ready because they have not yet finished starting, have recently failed a readiness check, or have recently failed a liveness check. |  [optional]
**ports** | [**List&lt;V1EndpointPort&gt;**](V1EndpointPort.md) | Port numbers available on the related IP addresses. |  [optional]



