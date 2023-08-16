

# ApiextensionsV1ServiceReference

ServiceReference holds a reference to Service.legacy.k8s.io

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**name** | **String** | name is the name of the service. Required |  |
|**namespace** | **String** | namespace is the namespace of the service. Required |  |
|**path** | **String** | path is an optional URL path at which the webhook will be contacted. |  [optional] |
|**port** | **Integer** | port is an optional service port at which the webhook will be contacted. &#x60;port&#x60; should be a valid port number (1-65535, inclusive). Defaults to 443 for backward compatibility. |  [optional] |



