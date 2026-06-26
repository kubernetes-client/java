

# AdmissionregistrationV1ServiceReference

ServiceReference holds a reference to Service.legacy.k8s.io

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**name** | **String** | name is the name of the service. Required |  |
|**namespace** | **String** | namespace is the namespace of the service. Required |  |
|**path** | **String** | path is an optional URL path which will be sent in any request to this service. |  [optional] |
|**port** | **Integer** | port is the port on the service that hosts the webhook. Default to 443 for backward compatibility. &#x60;port&#x60; should be a valid port number (1-65535, inclusive). |  [optional] |



