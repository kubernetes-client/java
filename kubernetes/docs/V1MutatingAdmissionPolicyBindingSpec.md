

# V1MutatingAdmissionPolicyBindingSpec

MutatingAdmissionPolicyBindingSpec defines the specification of the MutatingAdmissionPolicyBinding.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**matchResources** | [**V1MatchResources**](V1MatchResources.md) |  |  [optional] |
|**paramRef** | [**V1ParamRef**](V1ParamRef.md) |  |  [optional] |
|**policyName** | **String** | policyName references a MutatingAdmissionPolicy name which the MutatingAdmissionPolicyBinding binds to. If the referenced resource does not exist, this binding is considered invalid and will be ignored Required. |  [optional] |



