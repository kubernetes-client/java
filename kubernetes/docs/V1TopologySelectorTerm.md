

# V1TopologySelectorTerm

A topology selector term represents the result of label queries. A null or empty topology selector term matches no objects. The requirements of them are ANDed. It provides a subset of functionality as NodeSelectorTerm. This is an alpha feature and may change in the future.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**matchLabelExpressions** | [**List&lt;V1TopologySelectorLabelRequirement&gt;**](V1TopologySelectorLabelRequirement.md) | A list of topology selector requirements by labels. |  [optional] |



