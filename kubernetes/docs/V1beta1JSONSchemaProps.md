

# V1beta1JSONSchemaProps

JSONSchemaProps is a JSON-Schema following Specification Draft 4 (http://json-schema.org/).
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**$ref** | **String** |  |  [optional]
**$schema** | **String** |  |  [optional]
**additionalItems** | [**Object**](.md) | JSONSchemaPropsOrBool represents JSONSchemaProps or a boolean value. Defaults to true for the boolean property. |  [optional]
**additionalProperties** | [**Object**](.md) | JSONSchemaPropsOrBool represents JSONSchemaProps or a boolean value. Defaults to true for the boolean property. |  [optional]
**allOf** | [**List&lt;V1beta1JSONSchemaProps&gt;**](V1beta1JSONSchemaProps.md) |  |  [optional]
**anyOf** | [**List&lt;V1beta1JSONSchemaProps&gt;**](V1beta1JSONSchemaProps.md) |  |  [optional]
**_default** | [**Object**](.md) | default is a default value for undefined object fields. Defaulting is an alpha feature under the CustomResourceDefaulting feature gate. Defaulting requires spec.preserveUnknownFields to be false. |  [optional]
**definitions** | [**Map&lt;String, V1beta1JSONSchemaProps&gt;**](V1beta1JSONSchemaProps.md) |  |  [optional]
**dependencies** | **Map&lt;String, Object&gt;** |  |  [optional]
**description** | **String** |  |  [optional]
**_enum** | **List&lt;Object&gt;** |  |  [optional]
**example** | [**Object**](.md) | JSON represents any valid JSON value. These types are supported: bool, int64, float64, string, []interface{}, map[string]interface{} and nil. |  [optional]
**exclusiveMaximum** | **Boolean** |  |  [optional]
**exclusiveMinimum** | **Boolean** |  |  [optional]
**externalDocs** | [**V1beta1ExternalDocumentation**](V1beta1ExternalDocumentation.md) |  |  [optional]
**format** | **String** |  |  [optional]
**id** | **String** |  |  [optional]
**items** | [**Object**](.md) | JSONSchemaPropsOrArray represents a value that can either be a JSONSchemaProps or an array of JSONSchemaProps. Mainly here for serialization purposes. |  [optional]
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
**nullable** | **Boolean** |  |  [optional]
**oneOf** | [**List&lt;V1beta1JSONSchemaProps&gt;**](V1beta1JSONSchemaProps.md) |  |  [optional]
**pattern** | **String** |  |  [optional]
**patternProperties** | [**Map&lt;String, V1beta1JSONSchemaProps&gt;**](V1beta1JSONSchemaProps.md) |  |  [optional]
**properties** | [**Map&lt;String, V1beta1JSONSchemaProps&gt;**](V1beta1JSONSchemaProps.md) |  |  [optional]
**required** | **List&lt;String&gt;** |  |  [optional]
**title** | **String** |  |  [optional]
**type** | **String** |  |  [optional]
**uniqueItems** | **Boolean** |  |  [optional]
**xKubernetesEmbeddedResource** | **Boolean** | x-kubernetes-embedded-resource defines that the value is an embedded Kubernetes runtime.Object, with TypeMeta and ObjectMeta. The type must be object. It is allowed to further restrict the embedded object. kind, apiVersion and metadata are validated automatically. x-kubernetes-preserve-unknown-fields is allowed to be true, but does not have to be if the object is fully specified (up to kind, apiVersion, metadata). |  [optional]
**xKubernetesIntOrString** | **Boolean** | x-kubernetes-int-or-string specifies that this value is either an integer or a string. If this is true, an empty type is allowed and type as child of anyOf is permitted if following one of the following patterns:  1) anyOf:    - type: integer    - type: string 2) allOf:    - anyOf:      - type: integer      - type: string    - ... zero or more |  [optional]
**xKubernetesPreserveUnknownFields** | **Boolean** | x-kubernetes-preserve-unknown-fields stops the API server decoding step from pruning fields which are not specified in the validation schema. This affects fields recursively, but switches back to normal pruning behaviour if nested properties or additionalProperties are specified in the schema. This can either be true or undefined. False is forbidden. |  [optional]



