

# V1alpha1MutatingAdmissionPolicyBindingSpec

MutatingAdmissionPolicyBindingSpec is the specification of the MutatingAdmissionPolicyBinding.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**matchResources** | [**V1alpha1MatchResources**](V1alpha1MatchResources.md) |  |  [optional] |
|**paramRef** | [**V1alpha1ParamRef**](V1alpha1ParamRef.md) |  |  [optional] |
|**policyName** | **String** | policyName references a MutatingAdmissionPolicy name which the MutatingAdmissionPolicyBinding binds to. If the referenced resource does not exist, this binding is considered invalid and will be ignored Required. |  [optional] |



