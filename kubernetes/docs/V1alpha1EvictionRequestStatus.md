

# V1alpha1EvictionRequestStatus

EvictionRequestStatus represents the last observed status of the eviction request.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**conditions** | [**List&lt;V1Condition&gt;**](V1Condition.md) | conditions contain information about the eviction request.  EvictionRequest specific conditions are: TargetEvicted or Failed (managed by evictionrequest-controller). - Failed means that the eviction request is no longer being processed   by any eviction responder. This can happen if the request is canceled or if no responder   managed to evict the target (e.g. terminate or delete a pod). - TargetEvicted means that the target has been evicted (e.g. a pod has been terminated or deleted).  These conditions can be reset if the eviction was unsuccessful and a new Eviction intent has been submitted.  The maximum length of the conditions list is 100. |  [optional] |
|**observedGeneration** | **Long** | observedGeneration is EvictionRequest&#39;s .metadata.generation observed by the evictionrequest-controller. The observed generation value cannot be negative and can only be incremented. The minimum value is 1. This field is managed by evictionrequest-controller. |  [optional] |



