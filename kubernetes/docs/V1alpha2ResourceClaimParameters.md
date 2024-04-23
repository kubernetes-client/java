

# V1alpha2ResourceClaimParameters

ResourceClaimParameters defines resource requests for a ResourceClaim in an in-tree format understood by Kubernetes.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**apiVersion** | **String** | APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources |  [optional] |
|**driverRequests** | [**List&lt;V1alpha2DriverRequests&gt;**](V1alpha2DriverRequests.md) | DriverRequests describes all resources that are needed for the allocated claim. A single claim may use resources coming from different drivers. For each driver, this array has at most one entry which then may have one or more per-driver requests.  May be empty, in which case the claim can always be allocated. |  [optional] |
|**generatedFrom** | [**V1alpha2ResourceClaimParametersReference**](V1alpha2ResourceClaimParametersReference.md) |  |  [optional] |
|**kind** | **String** | Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds |  [optional] |
|**metadata** | [**V1ObjectMeta**](V1ObjectMeta.md) |  |  [optional] |
|**shareable** | **Boolean** | Shareable indicates whether the allocated claim is meant to be shareable by multiple consumers at the same time. |  [optional] |


## Implemented Interfaces

* io.kubernetes.client.common.KubernetesObject


