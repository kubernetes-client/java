

# V1alpha1WorkloadSpec

WorkloadSpec defines the desired state of a Workload.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**controllerRef** | [**V1alpha1TypedLocalObjectReference**](V1alpha1TypedLocalObjectReference.md) |  |  [optional] |
|**podGroups** | [**List&lt;V1alpha1PodGroup&gt;**](V1alpha1PodGroup.md) | PodGroups is the list of pod groups that make up the Workload. The maximum number of pod groups is 8. This field is immutable. |  |



