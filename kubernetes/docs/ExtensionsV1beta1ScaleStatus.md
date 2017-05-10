
# ExtensionsV1beta1ScaleStatus

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**replicas** | **Integer** | actual number of observed instances of the scaled object. | 
**selector** | **Map&lt;String, String&gt;** | label query over pods that should match the replicas count. More info: http://kubernetes.io/docs/user-guide/labels#label-selectors |  [optional]
**targetSelector** | **String** | label selector for pods that should match the replicas count. This is a serializated version of both map-based and more expressive set-based selectors. This is done to avoid introspection in the clients. The string will be in the same format as the query-param syntax. If the target type only supports map-based selectors, both this field and map-based selector field are populated. More info: http://kubernetes.io/docs/user-guide/labels#label-selectors |  [optional]



