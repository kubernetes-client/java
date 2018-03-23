
# V1beta1NetworkPolicyPort

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**port** | [**IntOrString**](IntOrString.md) | If specified, the port on the given protocol.  This can either be a numerical or named port on a pod.  If this field is not provided, this matches all port names and numbers. If present, only traffic on the specified protocol AND port will be matched. |  [optional]
**protocol** | **String** | Optional.  The protocol (TCP or UDP) which traffic must match. If not specified, this field defaults to TCP. |  [optional]



