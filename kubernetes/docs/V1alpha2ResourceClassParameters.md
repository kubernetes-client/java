

# V1alpha2ResourceClassParameters

ResourceClassParameters defines resource requests for a ResourceClass in an in-tree format understood by Kubernetes.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**apiVersion** | **String** | APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources |  [optional] |
|**filters** | [**List&lt;V1alpha2ResourceFilter&gt;**](V1alpha2ResourceFilter.md) | Filters describes additional contraints that must be met when using the class. |  [optional] |
|**generatedFrom** | [**V1alpha2ResourceClassParametersReference**](V1alpha2ResourceClassParametersReference.md) |  |  [optional] |
|**kind** | **String** | Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds |  [optional] |
|**metadata** | [**V1ObjectMeta**](V1ObjectMeta.md) |  |  [optional] |
|**vendorParameters** | [**List&lt;V1alpha2VendorParameters&gt;**](V1alpha2VendorParameters.md) | VendorParameters are arbitrary setup parameters for all claims using this class. They are ignored while allocating the claim. There must not be more than one entry per driver. |  [optional] |


## Implemented Interfaces

* io.kubernetes.client.common.KubernetesObject


