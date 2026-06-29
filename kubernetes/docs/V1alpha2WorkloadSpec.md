

# V1alpha2WorkloadSpec

WorkloadSpec defines the desired state of a Workload.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**controllerRef** | [**V1alpha2TypedLocalObjectReference**](V1alpha2TypedLocalObjectReference.md) |  |  [optional] |
|**podGroupTemplates** | [**List&lt;V1alpha2PodGroupTemplate&gt;**](V1alpha2PodGroupTemplate.md) | PodGroupTemplates is the list of templates that make up the Workload. The maximum number of templates is 8. This field is immutable. |  |



