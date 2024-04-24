

# V1PolicyRulesWithSubjects

PolicyRulesWithSubjects prescribes a test that applies to a request to an apiserver. The test considers the subject making the request, the verb being requested, and the resource to be acted upon. This PolicyRulesWithSubjects matches a request if and only if both (a) at least one member of subjects matches the request and (b) at least one member of resourceRules or nonResourceRules matches the request.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**nonResourceRules** | [**List&lt;V1NonResourcePolicyRule&gt;**](V1NonResourcePolicyRule.md) | &#x60;nonResourceRules&#x60; is a list of NonResourcePolicyRules that identify matching requests according to their verb and the target non-resource URL. |  [optional] |
|**resourceRules** | [**List&lt;V1ResourcePolicyRule&gt;**](V1ResourcePolicyRule.md) | &#x60;resourceRules&#x60; is a slice of ResourcePolicyRules that identify matching requests according to their verb and the target resource. At least one of &#x60;resourceRules&#x60; and &#x60;nonResourceRules&#x60; has to be non-empty. |  [optional] |
|**subjects** | [**List&lt;FlowcontrolV1Subject&gt;**](FlowcontrolV1Subject.md) | subjects is the list of normal user, serviceaccount, or group that this rule cares about. There must be at least one member in this slice. A slice that includes both the system:authenticated and system:unauthenticated user groups matches every request. Required. |  |



