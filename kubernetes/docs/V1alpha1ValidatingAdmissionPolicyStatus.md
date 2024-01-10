

# V1alpha1ValidatingAdmissionPolicyStatus

ValidatingAdmissionPolicyStatus represents the status of a ValidatingAdmissionPolicy.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**conditions** | [**List&lt;V1Condition&gt;**](V1Condition.md) | The conditions represent the latest available observations of a policy&#39;s current state. |  [optional] |
|**observedGeneration** | **Long** | The generation observed by the controller. |  [optional] |
|**typeChecking** | [**V1alpha1TypeChecking**](V1alpha1TypeChecking.md) |  |  [optional] |



