

# V1beta1PodGroupSchedulingPolicy

PodGroupSchedulingPolicy defines the scheduling configuration for a PodGroup. Exactly one policy must be set. The policy is chosen at creation time by setting either the Basic or Gang field. The PodGroup may not change policy after creation. Fields within chosen policy may be updated after creation when their individual fields allow it.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**basic** | **Object** | basic specifies that the pods in this group should be scheduled using standard Kubernetes scheduling behavior. Setting this field at group creation time opts this group to basic scheduling; this field cannot be changed afterward. |  [optional] |
|**gang** | [**V1beta1GangSchedulingPolicy**](V1beta1GangSchedulingPolicy.md) |  |  [optional] |



