

# V1alpha3WorkloadSpec

WorkloadSpec defines the desired state of a Workload.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**compositePodGroupTemplates** | [**List&lt;V1alpha3CompositePodGroupTemplate&gt;**](V1alpha3CompositePodGroupTemplate.md) | compositePodGroupTemplates is the list of CompositePodGroup templates that make up the Workload. The maximum number of templates is 8. This field is immutable. Exactly one of CompositePodGroupTemplates and PodGroupTemplates must be set.  This field is used only when the CompositePodGroup feature gate is enabled. |  [optional] |
|**controllerRef** | [**V1alpha3TypedLocalObjectReference**](V1alpha3TypedLocalObjectReference.md) |  |  [optional] |
|**podGroupTemplates** | [**List&lt;V1alpha3PodGroupTemplate&gt;**](V1alpha3PodGroupTemplate.md) | podGroupTemplates is the list of templates that make up the Workload. The maximum number of templates is 8. Templates cannot be added or removed after the workload is created. Existing templates may still be updated where their individual fields allow it. Exactly one of CompositePodGroupTemplates and PodGroupTemplates must be set. |  [optional] |



