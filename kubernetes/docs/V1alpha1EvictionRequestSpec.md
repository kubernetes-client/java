

# V1alpha1EvictionRequestSpec

EvictionRequestSpec is a specification of an EvictionRequest.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**intent** | **String** | intent specifies the action that should be taken for the specified target.  - Eviction means that the requester is interested in the eviction of the target. - Withdrawn means that the requester is no longer interested in the eviction of the target.   If all requesters&#39; intents are withdrawn for a common target, the eviction will be canceled.   Cancellation consequences:   - Inactive responders will never run.   - Active responders are expected to cancel the eviction.   - Completed or Interrupted responders should not take any action. |  |
|**requester** | **String** | requester allows you to identify the entity, that requested the eviction of the target.  It must be a valid domain-prefixed key (such as \&quot;acme.io/foo\&quot;). Domain names *.k8s.io and *.kubernetes.io are reserved. This field is required and immutable. |  |
|**target** | [**V1alpha1EvictionRequestTarget**](V1alpha1EvictionRequestTarget.md) |  |  |



