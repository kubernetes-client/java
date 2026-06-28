

# V1alpha2PodGroupSchedulingPolicy

PodGroupSchedulingPolicy defines the scheduling configuration for a PodGroup. Exactly one policy must be set.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**basic** | **Object** | Basic specifies that the pods in this group should be scheduled using standard Kubernetes scheduling behavior. |  [optional] |
|**gang** | [**V1alpha2GangSchedulingPolicy**](V1alpha2GangSchedulingPolicy.md) |  |  [optional] |



