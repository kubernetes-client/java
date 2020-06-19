

# V1beta1ClusterRole

ClusterRole is a cluster level, logical grouping of PolicyRules that can be referenced as a unit by a RoleBinding or ClusterRoleBinding. Deprecated in v1.17 in favor of rbac.authorization.k8s.io/v1 ClusterRole, and will no longer be served in v1.20.
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**aggregationRule** | [**V1beta1AggregationRule**](V1beta1AggregationRule.md) |  |  [optional]
**apiVersion** | **String** | APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources |  [optional]
**kind** | **String** | Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds |  [optional]
**metadata** | [**V1ObjectMeta**](V1ObjectMeta.md) |  |  [optional]
**rules** | [**List&lt;V1beta1PolicyRule&gt;**](V1beta1PolicyRule.md) | Rules holds all the PolicyRules for this ClusterRole |  [optional]


## Implemented Interfaces

* io.kubernetes.client.common.KubernetesObject


