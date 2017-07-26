
# V1APIResource

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**categories** | **List&lt;String&gt;** | categories is a list of the grouped resources this resource belongs to (e.g. &#39;all&#39;) |  [optional]
**kind** | **String** | kind is the kind for the resource (e.g. &#39;Foo&#39; is the kind for a resource &#39;foo&#39;) | 
**name** | **String** | name is the plural name of the resource. | 
**namespaced** | **Boolean** | namespaced indicates if a resource is namespaced or not. | 
**shortNames** | **List&lt;String&gt;** | shortNames is a list of suggested short names of the resource. |  [optional]
**singularName** | **String** | singularName is the singular name of the resource.  This allows clients to handle plural and singular opaquely. The singularName is more correct for reporting status on a single item and both singular and plural are allowed from the kubectl CLI interface. | 
**verbs** | **List&lt;String&gt;** | verbs is a list of supported kube verbs (this includes get, list, watch, create, update, patch, delete, deletecollection, and proxy) | 



