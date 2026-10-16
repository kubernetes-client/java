

# V1alpha3WorkloadPodGroupDisruptionMode

WorkloadPodGroupDisruptionMode defines how individual pods within a group can be disrupted. Exactly one mode must be set.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**all** | **Object** | all specifies that all pods in the group must be disrupted together. |  [optional] |
|**single** | **Object** | single specifies that pods can be disrupted independently from each other. |  [optional] |



