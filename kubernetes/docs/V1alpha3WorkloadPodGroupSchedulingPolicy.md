

# V1alpha3WorkloadPodGroupSchedulingPolicy

WorkloadPodGroupSchedulingPolicy defines the scheduling policy for a group of pods managed by a workload controller. Exactly one policy must be set.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**basic** | **Object** | basic specifies that standard, pod-by-pod Kubernetes scheduling behavior should be used. |  [optional] |
|**gang** | [**V1alpha3WorkloadPodGroupGangSchedulingPolicy**](V1alpha3WorkloadPodGroupGangSchedulingPolicy.md) |  |  [optional] |



