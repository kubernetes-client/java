

# V1beta3PriorityLevelConfiguration

PriorityLevelConfiguration represents the configuration of a priority level.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**apiVersion** | **String** | APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources |  [optional] |
|**kind** | **String** | Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds |  [optional] |
|**metadata** | [**V1ObjectMeta**](V1ObjectMeta.md) |  |  [optional] |
|**spec** | [**V1beta3PriorityLevelConfigurationSpec**](V1beta3PriorityLevelConfigurationSpec.md) |  |  [optional] |
|**status** | [**V1beta3PriorityLevelConfigurationStatus**](V1beta3PriorityLevelConfigurationStatus.md) |  |  [optional] |


## Implemented Interfaces

* io.kubernetes.client.common.KubernetesObject


