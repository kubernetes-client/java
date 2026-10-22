

# V1alpha3CompositePodGroupSpec

CompositePodGroupSpec defines the desired state of CompositePodGroup.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**disruptionMode** | [**V1alpha3CompositeDisruptionMode**](V1alpha3CompositeDisruptionMode.md) |  |  [optional] |
|**parentCompositePodGroupName** | **String** | parentCompositePodGroupName contains the name of the parent composite pod group within the same namespace as this composite pod group. It must be a DNS name. If it&#39;s nil, then this composite pod group is a root of a workload&#39;s hierarchy. This field is immutable. |  [optional] |
|**preemptionPolicy** | **String** | preemptionPolicy is the Policy for preempting pods/podgroups with lower priority. One of Never, PreemptLowerPriority. Defaults to PreemptLowerPriority if unset. When Priority Admission Controller is enabled, it populates this field from PriorityClassName, and defaults to PreemptLowerPriority if value is unset in PriorityClass. This field is immutable. This field is available only when the PodGroupPreemptionPolicy feature gate is enabled. |  [optional] |
|**priority** | **Integer** | priority is the value of priority of this composite pod group. Various system components use this field to find the priority of the composite pod group. When Priority Admission Controller is enabled, it prevents users from setting this field. The admission controller populates this field from PriorityClassName. The higher the value, the higher the priority. This field is immutable. |  [optional] |
|**priorityClassName** | **String** | priorityClassName defines the priority that should be considered when scheduling this CompositePodGroup. Controllers are expected to fill this field by copying it from a CompositePodGroupTemplate. If left unspecified, it is validated and resolved similarly to the PriorityClassName field in Pods (i.e. if no priority class is specified, admission control can set this to the global default priority class if it exists. Otherwise, the composite pod group&#39;s priority will be zero). This field is immutable. |  [optional] |
|**schedulingConstraints** | [**V1alpha3CompositePodGroupSchedulingConstraints**](V1alpha3CompositePodGroupSchedulingConstraints.md) |  |  [optional] |
|**schedulingPolicy** | [**V1alpha3CompositePodGroupSchedulingPolicy**](V1alpha3CompositePodGroupSchedulingPolicy.md) |  |  |
|**workloadRef** | [**V1alpha3WorkloadReference**](V1alpha3WorkloadReference.md) |  |  |



