

# V1CustomResourceDefinitionVersion

CustomResourceDefinitionVersion describes a version for CRD.
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**additionalPrinterColumns** | [**List&lt;V1CustomResourceColumnDefinition&gt;**](V1CustomResourceColumnDefinition.md) | additionalPrinterColumns specifies additional columns returned in Table output. See https://kubernetes.io/docs/reference/using-api/api-concepts/#receiving-resources-as-tables for details. If no columns are specified, a single column displaying the age of the custom resource is used. |  [optional]
**name** | **String** | name is the version name, e.g. “v1”, “v2beta1”, etc. The custom resources are served under this version at &#x60;/apis/&lt;group&gt;/&lt;version&gt;/...&#x60; if &#x60;served&#x60; is true. | 
**schema** | [**V1CustomResourceValidation**](V1CustomResourceValidation.md) |  |  [optional]
**served** | **Boolean** | served is a flag enabling/disabling this version from being served via REST APIs | 
**storage** | **Boolean** | storage indicates this version should be used when persisting custom resources to storage. There must be exactly one version with storage&#x3D;true. | 
**subresources** | [**V1CustomResourceSubresources**](V1CustomResourceSubresources.md) |  |  [optional]



