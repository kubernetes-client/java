

# V1beta1ValidatingAdmissionPolicy

ValidatingAdmissionPolicy describes the definition of an admission validation policy that accepts or rejects an object without changing it.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**apiVersion** | **String** | APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources |  [optional] |
|**kind** | **String** | Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds |  [optional] |
|**metadata** | [**V1ObjectMeta**](V1ObjectMeta.md) |  |  [optional] |
|**spec** | [**V1beta1ValidatingAdmissionPolicySpec**](V1beta1ValidatingAdmissionPolicySpec.md) |  |  [optional] |
|**status** | [**V1beta1ValidatingAdmissionPolicyStatus**](V1beta1ValidatingAdmissionPolicyStatus.md) |  |  [optional] |


## Implemented Interfaces

* io.kubernetes.client.common.KubernetesObject


