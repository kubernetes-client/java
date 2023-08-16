

# AdmissionregistrationV1ServiceReference

ServiceReference holds a reference to Service.legacy.k8s.io

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**name** | **String** | &#x60;name&#x60; is the name of the service. Required |  |
|**namespace** | **String** | &#x60;namespace&#x60; is the namespace of the service. Required |  |
|**path** | **String** | &#x60;path&#x60; is an optional URL path which will be sent in any request to this service. |  [optional] |
|**port** | **Integer** | If specified, the port on the service that hosting webhook. Default to 443 for backward compatibility. &#x60;port&#x60; should be a valid port number (1-65535, inclusive). |  [optional] |



