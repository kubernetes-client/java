

# V1EndpointConditions

EndpointConditions represents the current condition of an endpoint.
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ready** | **Boolean** | ready indicates that this endpoint is ready to receive traffic, according to whatever system is managing the endpoint. A nil value should be interpreted as \&quot;true\&quot;. In general, an endpoint should be marked ready if it is serving and not terminating, though this can be overridden in some cases, such as when the associated Service has set the publishNotReadyAddresses flag. |  [optional]
**serving** | **Boolean** | serving indicates that this endpoint is able to receive traffic, according to whatever system is managing the endpoint. For endpoints backed by pods, the EndpointSlice controller will mark the endpoint as serving if the pod&#39;s Ready condition is True. A nil value should be interpreted as \&quot;true\&quot;. |  [optional]
**terminating** | **Boolean** | terminating indicates that this endpoint is terminating. A nil value should be interpreted as \&quot;false\&quot;. |  [optional]



