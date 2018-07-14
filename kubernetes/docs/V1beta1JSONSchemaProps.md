
# V1beta1JSONSchemaProps

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ref** | **String** |  |  [optional]
**schema** | **String** |  |  [optional]
**additionalItems** | **Object** | JSONSchemaPropsOrBool represents JSONSchemaProps or a boolean value. Defaults to true for the boolean property. |  [optional]
**additionalProperties** | **Object** | JSONSchemaPropsOrBool represents JSONSchemaProps or a boolean value. Defaults to true for the boolean property. |  [optional]
**allOf** | [**List&lt;V1beta1JSONSchemaProps&gt;**](V1beta1JSONSchemaProps.md) |  |  [optional]
**anyOf** | [**List&lt;V1beta1JSONSchemaProps&gt;**](V1beta1JSONSchemaProps.md) |  |  [optional]
**_default** | **Object** | JSON represents any valid JSON value. These types are supported: bool, int64, float64, string, []interface{}, map[string]interface{} and nil. |  [optional]
**definitions** | [**Map&lt;String, V1beta1JSONSchemaProps&gt;**](V1beta1JSONSchemaProps.md) |  |  [optional]
**dependencies** | **Map&lt;String, Object&gt;** |  |  [optional]
**description** | **String** |  |  [optional]
**_enum** | **List&lt;Object&gt;** |  |  [optional]
**example** | **Object** | JSON represents any valid JSON value. These types are supported: bool, int64, float64, string, []interface{}, map[string]interface{} and nil. |  [optional]
**exclusiveMaximum** | **Boolean** |  |  [optional]
**exclusiveMinimum** | **Boolean** |  |  [optional]
**externalDocs** | [**V1beta1ExternalDocumentation**](V1beta1ExternalDocumentation.md) |  |  [optional]
**format** | **String** |  |  [optional]
**id** | **String** |  |  [optional]
**items** | **Object** | JSONSchemaPropsOrArray represents a value that can either be a JSONSchemaProps or an array of JSONSchemaProps. Mainly here for serialization purposes. |  [optional]
**maxItems** | **Long** |  |  [optional]
**maxLength** | **Long** |  |  [optional]
**maxProperties** | **Long** |  |  [optional]
**maximum** | **Double** |  |  [optional]
**minItems** | **Long** |  |  [optional]
**minLength** | **Long** |  |  [optional]
**minProperties** | **Long** |  |  [optional]
**minimum** | **Double** |  |  [optional]
**multipleOf** | **Double** |  |  [optional]
**not** | [**V1beta1JSONSchemaProps**](V1beta1JSONSchemaProps.md) |  |  [optional]
**oneOf** | [**List&lt;V1beta1JSONSchemaProps&gt;**](V1beta1JSONSchemaProps.md) |  |  [optional]
**pattern** | **String** |  |  [optional]
**patternProperties** | [**Map&lt;String, V1beta1JSONSchemaProps&gt;**](V1beta1JSONSchemaProps.md) |  |  [optional]
**properties** | [**Map&lt;String, V1beta1JSONSchemaProps&gt;**](V1beta1JSONSchemaProps.md) |  |  [optional]
**required** | **List&lt;String&gt;** |  |  [optional]
**title** | **String** |  |  [optional]
**type** | **String** |  |  [optional]
**uniqueItems** | **Boolean** |  |  [optional]



