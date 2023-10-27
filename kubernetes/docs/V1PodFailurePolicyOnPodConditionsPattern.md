

# V1PodFailurePolicyOnPodConditionsPattern

PodFailurePolicyOnPodConditionsPattern describes a pattern for matching an actual pod condition type.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**status** | **String** | Specifies the required Pod condition status. To match a pod condition it is required that the specified status equals the pod condition status. Defaults to True. |  |
|**type** | **String** | Specifies the required Pod condition type. To match a pod condition it is required that specified type equals the pod condition type. |  |



