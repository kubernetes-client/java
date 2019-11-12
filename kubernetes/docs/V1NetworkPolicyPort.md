

# V1NetworkPolicyPort

NetworkPolicyPort describes a port to allow traffic on
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**port** | [**IntOrString**](IntOrString.md) | IntOrString is a type that can hold an int32 or a string.  When used in JSON or YAML marshalling and unmarshalling, it produces or consumes the inner type.  This allows you to have, for example, a JSON field that can accept a name or number. |  [optional]
**protocol** | **String** | The protocol (TCP, UDP, or SCTP) which traffic must match. If not specified, this field defaults to TCP. |  [optional]



