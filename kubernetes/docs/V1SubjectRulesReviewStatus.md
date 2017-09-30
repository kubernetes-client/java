
# V1SubjectRulesReviewStatus

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**evaluationError** | **String** | EvaluationError can appear in combination with Rules. It indicates an error occurred during rule evaluation, such as an authorizer that doesn&#39;t support rule evaluation, and that ResourceRules and/or NonResourceRules may be incomplete. |  [optional]
**incomplete** | **Boolean** | Incomplete is true when the rules returned by this call are incomplete. This is most commonly encountered when an authorizer, such as an external authorizer, doesn&#39;t support rules evaluation. | 
**nonResourceRules** | [**List&lt;V1NonResourceRule&gt;**](V1NonResourceRule.md) | NonResourceRules is the list of actions the subject is allowed to perform on non-resources. The list ordering isn&#39;t significant, may contain duplicates, and possibly be incomplete. | 
**resourceRules** | [**List&lt;V1ResourceRule&gt;**](V1ResourceRule.md) | ResourceRules is the list of actions the subject is allowed to perform on resources. The list ordering isn&#39;t significant, may contain duplicates, and possibly be incomplete. | 



