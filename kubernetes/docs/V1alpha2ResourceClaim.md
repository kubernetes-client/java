

# V1alpha2ResourceClaim

ResourceClaim describes which resources are needed by a resource consumer. Its status tracks whether the resource has been allocated and what the resulting attributes are.  This is an alpha type and requires enabling the DynamicResourceAllocation feature gate.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**apiVersion** | **String** | APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources |  [optional] |
|**kind** | **String** | Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds |  [optional] |
|**metadata** | [**V1ObjectMeta**](V1ObjectMeta.md) |  |  [optional] |
|**spec** | [**V1alpha2ResourceClaimSpec**](V1alpha2ResourceClaimSpec.md) |  |  |
|**status** | [**V1alpha2ResourceClaimStatus**](V1alpha2ResourceClaimStatus.md) |  |  [optional] |


## Implemented Interfaces

* io.kubernetes.client.common.KubernetesObject


