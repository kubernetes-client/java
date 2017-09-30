
# V1beta1CustomResourceDefinitionNames

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**kind** | **String** | Kind is the serialized kind of the resource.  It is normally CamelCase and singular. | 
**listKind** | **String** | ListKind is the serialized kind of the list for this resource.  Defaults to &lt;kind&gt;List. |  [optional]
**plural** | **String** | Plural is the plural name of the resource to serve.  It must match the name of the CustomResourceDefinition-registration too: plural.group and it must be all lowercase. | 
**shortNames** | **List&lt;String&gt;** | ShortNames are short names for the resource.  It must be all lowercase. |  [optional]
**singular** | **String** | Singular is the singular name of the resource.  It must be all lowercase  Defaults to lowercased &lt;kind&gt; |  [optional]



