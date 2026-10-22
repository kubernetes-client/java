

# V1alpha3CompositePodGroupTemplate

CompositePodGroupTemplate represents a template for a CompositePodGroup with a scheduling policy.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**compositePodGroupTemplates** | [**List&lt;V1alpha3CompositePodGroupTemplate&gt;**](V1alpha3CompositePodGroupTemplate.md) | compositePodGroupTemplates is the list of templates for children CompositePodGroups. The maximum number of templates is 8. At least one entry in CompositePodGroupTemplates or PodGroupTemplates must be set. |  [optional] |
|**disruptionMode** | [**V1alpha3CompositeDisruptionMode**](V1alpha3CompositeDisruptionMode.md) |  |  [optional] |
|**name** | **String** | name is a unique identifier for the CompositePodGroupTemplate within the Workload. It must be a DNS label. This field is required. |  |
|**podGroupTemplates** | [**List&lt;V1alpha3PodGroupTemplate&gt;**](V1alpha3PodGroupTemplate.md) | podGroupTemplates is the list of templates for children PodGroups. The maximum number of templates is 8. At least one entry in CompositePodGroupTemplates or PodGroupTemplates must be set. |  [optional] |
|**preemptionPolicy** | **String** | preemptionPolicy is the Policy for preempting pods/podgroups with lower priority. One of Never, PreemptLowerPriority. This field is immutable. This field is available only when the PodGroupPreemptionPolicy feature gate is enabled. |  [optional] |
|**priority** | **Integer** | priority is the value of priority of composite pod groups created from this template. Various system components use this field to find the priority of the composite pod group. When Priority Admission Controller is enabled, it prevents users from setting this field. The admission controller populates this field from PriorityClassName. The higher the value, the higher the priority. This field is immutable. |  [optional] |
|**priorityClassName** | **String** | priorityClassName indicates the priority that should be considered when scheduling a composite pod group created from this template. If no priority class is specified, admission control can set this to the global default priority class if it exists. Otherwise, composite pod groups created from this template will have the priority set to zero. This field is immutable. |  [optional] |
|**schedulingConstraints** | [**V1alpha3CompositePodGroupSchedulingConstraints**](V1alpha3CompositePodGroupSchedulingConstraints.md) |  |  [optional] |
|**schedulingPolicy** | [**V1alpha3CompositePodGroupSchedulingPolicy**](V1alpha3CompositePodGroupSchedulingPolicy.md) |  |  |



