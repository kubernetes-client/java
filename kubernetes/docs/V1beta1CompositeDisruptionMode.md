

# V1beta1CompositeDisruptionMode

CompositeDisruptionMode defines how individual entities within a composite pod group can be disrupted. Exactly one mode must be set.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**all** | **Object** | all specifies that all children groups can only be disrupted together. |  [optional] |
|**single** | **Object** | single specifies that children groups can be disrupted independently from each other. |  [optional] |



