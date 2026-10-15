

# V1alpha1EvictionStatus

EvictionStatus represents the last observed status of the eviction request.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**conditions** | [**List&lt;V1Condition&gt;**](V1Condition.md) | conditions contain information about the eviction request.  Eviction specific conditions are: TargetEvicted or Failed (managed by evictionrequest-controller). - Failed means that the eviction request is no longer being processed   by any eviction responder. This can happen if the request is canceled or if no responder   managed to evict the target (e.g. terminate or delete a pod). - TargetEvicted means that the target has been evicted (e.g. a pod has been terminated or deleted).   The maximum length of the conditions list is 100. |  [optional] |
|**observedGeneration** | **Long** | observedGeneration is Eviction&#39;s .metadata.generation observed by the evictionrequest-controller. The observed generation value cannot be negative and can only be incremented. The minimum value is 1. This field is managed by evictionrequest-controller. |  [optional] |
|**requesters** | [**List&lt;V1alpha1Requester&gt;**](V1alpha1Requester.md) | requesters allow you to identify the entities, that requested the eviction of the target. If all the requesters withdraw their eviction intent, the eviction will be canceled.  The maximum length of the requesters list is 100. If this limit is exceeded, requesters with Withdrawn intent should be dropped first. |  [optional] |
|**responders** | [**List&lt;V1alpha1ResponderStatus&gt;**](V1alpha1ResponderStatus.md) | responders represents the eviction process status of each declared responder.  The responder list should be the same length and have the same .name fields as .status.targetResponders. Only responders with .name that have Active state in .targetResponders[].state should be updated and can be mutated. First initialization of the list is allowed.  Each ResponderStatus is initialized by evictionrequest-controller and then managed by the designated responder. |  [optional] |
|**targetResponders** | [**List&lt;V1alpha1TargetResponder&gt;**](V1alpha1TargetResponder.md) | targetResponders reference responders that should eventually respond to this eviction to help with the graceful eviction of a target. These responders are selected sequentially, according to their specified priority by setting the Active state to the TargetResponder .state field. The maximum number of active responders allowed is 1. Eventually each responder can end up in an Interrupted, Canceled or, Completed state. Responders should observe these states in order to navigate their lifecycle.  If the target is a pod, the field is populated from Pod&#39;s .spec.evictionResponders. Default responders may be added to the list according to the target.  Default responders: - imperative-eviction.k8s.io/evictor responder with a priority of 100 is added to the list if the   target is a pod. It will call the imperative Eviction API (pods/&lt;name&gt;/eviction subresource).   This call may not succeed due to PodDisruptionBudgets, which may block the pod termination.   It will update the responder message and try again with a backoff.  The maximum length of the responders list is 11. The length and keys of the list cannot change once set. This field is managed by evictionrequest-controller. |  [optional] |



