

# V1alpha3WorkloadPodGroupGangSchedulingPolicy

WorkloadPodGroupGangSchedulingPolicy defines the parameters for gang (all-or-nothing) scheduling.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**minCount** | **Integer** | minCount is the minimum number of pods that must be scheduled at the same time for the scheduler to admit the entire group. This field is optional. If it is not specified, the controller should inject a context-specific sane default (e.g., parallelism for a Job). If set, it must be a positive integer. |  [optional] |



