
# V1beta1CustomResourceDefinitionSpec

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**group** | **String** | Group is the group this resource belongs in | 
**names** | [**V1beta1CustomResourceDefinitionNames**](V1beta1CustomResourceDefinitionNames.md) | Names are the names used to describe this custom resource | 
**scope** | **String** | Scope indicates whether this resource is cluster or namespace scoped.  Default is namespaced | 
**subresources** | [**V1beta1CustomResourceSubresources**](V1beta1CustomResourceSubresources.md) | Subresources describes the subresources for CustomResources This field is alpha-level and should only be sent to servers that enable subresources via the CustomResourceSubresources feature gate. |  [optional]
**validation** | [**V1beta1CustomResourceValidation**](V1beta1CustomResourceValidation.md) | Validation describes the validation methods for CustomResources |  [optional]
**version** | **String** | Version is the version this resource belongs in | 



