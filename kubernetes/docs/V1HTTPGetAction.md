

# V1HTTPGetAction

HTTPGetAction describes an action based on HTTP Get requests.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**host** | **String** | Host name to connect to, defaults to the pod IP. You probably want to set \&quot;Host\&quot; in httpHeaders instead. |  [optional] |
|**httpHeaders** | [**List&lt;V1HTTPHeader&gt;**](V1HTTPHeader.md) | Custom headers to set in the request. HTTP allows repeated headers. |  [optional] |
|**path** | **String** | Path to access on the HTTP server. |  [optional] |
|**port** | **IntOrString** | IntOrString is a type that can hold an int32 or a string.  When used in JSON or YAML marshalling and unmarshalling, it produces or consumes the inner type.  This allows you to have, for example, a JSON field that can accept a name or number. |  |
|**scheme** | **String** | Scheme to use for connecting to the host. Defaults to HTTP. |  [optional] |



