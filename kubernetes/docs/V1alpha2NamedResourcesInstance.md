

# V1alpha2NamedResourcesInstance

NamedResourcesInstance represents one individual hardware instance that can be selected based on its attributes.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**attributes** | [**List&lt;V1alpha2NamedResourcesAttribute&gt;**](V1alpha2NamedResourcesAttribute.md) | Attributes defines the attributes of this resource instance. The name of each attribute must be unique. |  [optional] |
|**name** | **String** | Name is unique identifier among all resource instances managed by the driver on the node. It must be a DNS subdomain. |  |



