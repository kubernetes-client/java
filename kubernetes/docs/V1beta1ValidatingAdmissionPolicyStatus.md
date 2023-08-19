

# V1beta1ValidatingAdmissionPolicyStatus

ValidatingAdmissionPolicyStatus represents the status of an admission validation policy.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**conditions** | [**List&lt;V1Condition&gt;**](V1Condition.md) | The conditions represent the latest available observations of a policy&#39;s current state. |  [optional] |
|**observedGeneration** | **Long** | The generation observed by the controller. |  [optional] |
|**typeChecking** | [**V1beta1TypeChecking**](V1beta1TypeChecking.md) |  |  [optional] |



