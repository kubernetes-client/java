

# V1beta1MutatingAdmissionPolicyBindingSpec

MutatingAdmissionPolicyBindingSpec is the specification of the MutatingAdmissionPolicyBinding.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**matchResources** | [**V1beta1MatchResources**](V1beta1MatchResources.md) |  |  [optional] |
|**paramRef** | [**V1beta1ParamRef**](V1beta1ParamRef.md) |  |  [optional] |
|**policyName** | **String** | policyName references a MutatingAdmissionPolicy name which the MutatingAdmissionPolicyBinding binds to. If the referenced resource does not exist, this binding is considered invalid and will be ignored Required. |  [optional] |



