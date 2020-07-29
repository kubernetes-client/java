

# ExtensionsV1beta1IngressBackend

IngressBackend describes all endpoints for a given service and port.
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**resource** | [**V1TypedLocalObjectReference**](V1TypedLocalObjectReference.md) |  |  [optional]
**serviceName** | **String** | Specifies the name of the referenced service. |  [optional]
**servicePort** | [**IntOrString**](IntOrString.md) | IntOrString is a type that can hold an int32 or a string.  When used in JSON or YAML marshalling and unmarshalling, it produces or consumes the inner type.  This allows you to have, for example, a JSON field that can accept a name or number. |  [optional]



