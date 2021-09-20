

# V1NetworkPolicyPort

NetworkPolicyPort describes a port to allow traffic on
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**endPort** | **Integer** | If set, indicates that the range of ports from port to endPort, inclusive, should be allowed by the policy. This field cannot be defined if the port field is not defined or if the port field is defined as a named (string) port. The endPort must be equal or greater than port. This feature is in Beta state and is enabled by default. It can be disabled using the Feature Gate \&quot;NetworkPolicyEndPort\&quot;. |  [optional]
**port** | [**IntOrString**](IntOrString.md) | IntOrString is a type that can hold an int32 or a string.  When used in JSON or YAML marshalling and unmarshalling, it produces or consumes the inner type.  This allows you to have, for example, a JSON field that can accept a name or number. |  [optional]
**protocol** | **String** | The protocol (TCP, UDP, or SCTP) which traffic must match. If not specified, this field defaults to TCP. |  [optional]



