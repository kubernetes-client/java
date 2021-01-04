

# V1beta1EndpointConditions

EndpointConditions represents the current condition of an endpoint.
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ready** | **Boolean** | ready indicates that this endpoint is prepared to receive traffic, according to whatever system is managing the endpoint. A nil value indicates an unknown state. In most cases consumers should interpret this unknown state as ready. For compatibility reasons, ready should never be \&quot;true\&quot; for terminating endpoints. |  [optional]
**serving** | **Boolean** | serving is identical to ready except that it is set regardless of the terminating state of endpoints. This condition should be set to true for a ready endpoint that is terminating. If nil, consumers should defer to the ready condition. This field can be enabled with the EndpointSliceTerminatingCondition feature gate. |  [optional]
**terminating** | **Boolean** | terminating indicates that this endpoint is terminating. A nil value indicates an unknown state. Consumers should interpret this unknown state to mean that the endpoint is not terminating. This field can be enabled with the EndpointSliceTerminatingCondition feature gate. |  [optional]



