

# V1IngressServiceBackend

IngressServiceBackend references a Kubernetes Service as a Backend.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**name** | **String** | name is the referenced service. The service must exist in the same namespace as the Ingress object. |  |
|**port** | [**V1ServiceBackendPort**](V1ServiceBackendPort.md) |  |  [optional] |



