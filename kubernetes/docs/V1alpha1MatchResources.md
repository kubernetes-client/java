

# V1alpha1MatchResources

MatchResources decides whether to run the admission control policy on an object based on whether it meets the match criteria. The exclude rules take precedence over include rules (if a resource matches both, it is excluded)
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**excludeResourceRules** | [**List&lt;V1alpha1NamedRuleWithOperations&gt;**](V1alpha1NamedRuleWithOperations.md) | ExcludeResourceRules describes what operations on what resources/subresources the policy should not care about. The exclude rules take precedence over include rules (if a resource matches both, it is excluded) |  [optional]
**matchPolicy** | **String** | matchPolicy defines how the \&quot;MatchResources\&quot; list is used to match incoming requests. Allowed values are \&quot;Exact\&quot; or \&quot;Equivalent\&quot;.  - Exact: match a request only if it exactly matches a specified rule. For example, if deployments can be modified via apps/v1, apps/v1beta1, and extensions/v1beta1, but \&quot;rules\&quot; only included &#x60;apiGroups:[\&quot;apps\&quot;], apiVersions:[\&quot;v1\&quot;], resources: [\&quot;deployments\&quot;]&#x60;, the admission policy does not consider requests to apps/v1beta1 or extensions/v1beta1 API groups.  - Equivalent: match a request if modifies a resource listed in rules, even via another API group or version. For example, if deployments can be modified via apps/v1, apps/v1beta1, and extensions/v1beta1, and \&quot;rules\&quot; only included &#x60;apiGroups:[\&quot;apps\&quot;], apiVersions:[\&quot;v1\&quot;], resources: [\&quot;deployments\&quot;]&#x60;, the admission policy **does** consider requests made to apps/v1beta1 or extensions/v1beta1 API groups. The API server translates the request to a matched resource API if necessary.  Defaults to \&quot;Equivalent\&quot; |  [optional]
**namespaceSelector** | [**V1LabelSelector**](V1LabelSelector.md) |  |  [optional]
**objectSelector** | [**V1LabelSelector**](V1LabelSelector.md) |  |  [optional]
**resourceRules** | [**List&lt;V1alpha1NamedRuleWithOperations&gt;**](V1alpha1NamedRuleWithOperations.md) | ResourceRules describes what operations on what resources/subresources the admission policy matches. The policy cares about an operation if it matches _any_ Rule. |  [optional]



