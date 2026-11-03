

# V1beta1WorkloadReference

WorkloadReference references the Workload object together with the template that was used to create a particular PodGroup.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**templateName** | **String** | templateName is the name of a template within the Workload object that was used to create a pod group. It must be a DNS label. This field is required. |  |
|**workloadName** | **String** | workloadName is the name of the Workload object that contains a template that was used when creating a pod group. It must be a DNS name. This field is required. |  |



