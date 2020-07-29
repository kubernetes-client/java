

# V1EndpointPort

EndpointPort is a tuple that describes a single port.
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**appProtocol** | **String** | The application protocol for this port. This field follows standard Kubernetes label syntax. Un-prefixed names are reserved for IANA standard service names (as per RFC-6335 and http://www.iana.org/assignments/service-names). Non-standard protocols should use prefixed names such as mycompany.com/my-custom-protocol. Field can be enabled with ServiceAppProtocol feature gate. |  [optional]
**name** | **String** | The name of this port.  This must match the &#39;name&#39; field in the corresponding ServicePort. Must be a DNS_LABEL. Optional only if one port is defined. |  [optional]
**port** | **Integer** | The port number of the endpoint. | 
**protocol** | **String** | The IP protocol for this port. Must be UDP, TCP, or SCTP. Default is TCP. |  [optional]



