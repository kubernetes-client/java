

# V1alpha1EndpointSlice

EndpointSlice represents a subset of the endpoints that implement a service. For a given service there may be multiple EndpointSlice objects, selected by labels, which must be joined to produce the full set of endpoints.
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**addressType** | **String** | addressType specifies the type of address carried by this EndpointSlice. All addresses in this slice must be the same type. Default is IP |  [optional]
**apiVersion** | **String** | APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources |  [optional]
**endpoints** | [**List&lt;V1alpha1Endpoint&gt;**](V1alpha1Endpoint.md) | endpoints is a list of unique endpoints in this slice. Each slice may include a maximum of 1000 endpoints. | 
**kind** | **String** | Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds |  [optional]
**metadata** | [**V1ObjectMeta**](V1ObjectMeta.md) |  |  [optional]
**ports** | [**List&lt;V1alpha1EndpointPort&gt;**](V1alpha1EndpointPort.md) | ports specifies the list of network ports exposed by each endpoint in this slice. Each port must have a unique name. When ports is empty, it indicates that there are no defined ports. When a port is defined with a nil port value, it indicates \&quot;all ports\&quot;. Each slice may include a maximum of 100 ports. |  [optional]



