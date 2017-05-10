
# V1SubjectAccessReviewStatus

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**allowed** | **Boolean** | Allowed is required.  True if the action would be allowed, false otherwise. | 
**evaluationError** | **String** | EvaluationError is an indication that some error occurred during the authorization check. It is entirely possible to get an error and be able to continue determine authorization status in spite of it. For instance, RBAC can be missing a role, but enough roles are still present and bound to reason about the request. |  [optional]
**reason** | **String** | Reason is optional.  It indicates why a request was allowed or denied. |  [optional]



