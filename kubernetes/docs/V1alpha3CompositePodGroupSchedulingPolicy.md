

# V1alpha3CompositePodGroupSchedulingPolicy

CompositePodGroupSchedulingPolicy defines the scheduling configuration for a CompositePodGroup. Exactly one policy must be set.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**basic** | **Object** | basic specifies that the groups of this composite group should be scheduled independently. This field is immutable. |  [optional] |
|**gang** | [**V1alpha3CompositeGangSchedulingPolicy**](V1alpha3CompositeGangSchedulingPolicy.md) |  |  [optional] |



