

# V1CustomResourceColumnDefinition

CustomResourceColumnDefinition specifies a column for server side printing.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**description** | **String** | description is a human readable description of this column. |  [optional] |
|**format** | **String** | format is an optional OpenAPI type definition for this column. The &#39;name&#39; format is applied to the primary identifier column to assist in clients identifying column is the resource name. See https://github.com/OAI/OpenAPI-Specification/blob/master/versions/2.0.md#data-types for details. |  [optional] |
|**jsonPath** | **String** | jsonPath is a simple JSON path (i.e. with array notation) which is evaluated against each custom resource to produce the value for this column. |  |
|**name** | **String** | name is a human readable name for the column. |  |
|**priority** | **Integer** | priority is an integer defining the relative importance of this column compared to others. Lower numbers are considered higher priority. Columns that may be omitted in limited space scenarios should be given a priority greater than 0. |  [optional] |
|**type** | **String** | type is an OpenAPI type definition for this column. See https://github.com/OAI/OpenAPI-Specification/blob/master/versions/2.0.md#data-types for details. |  |



