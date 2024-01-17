

# V1EnvFromSource

EnvFromSource represents the source of a set of ConfigMaps

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**configMapRef** | [**V1ConfigMapEnvSource**](V1ConfigMapEnvSource.md) |  |  [optional] |
|**prefix** | **String** | An optional identifier to prepend to each key in the ConfigMap. Must be a C_IDENTIFIER. |  [optional] |
|**secretRef** | [**V1SecretEnvSource**](V1SecretEnvSource.md) |  |  [optional] |



