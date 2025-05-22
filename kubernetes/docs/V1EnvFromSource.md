

# V1EnvFromSource

EnvFromSource represents the source of a set of ConfigMaps or Secrets
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**configMapRef** | [**V1ConfigMapEnvSource**](V1ConfigMapEnvSource.md) |  |  [optional]
**prefix** | **String** | Optional text to prepend to the name of each environment variable. Must be a C_IDENTIFIER. |  [optional]
**secretRef** | [**V1SecretEnvSource**](V1SecretEnvSource.md) |  |  [optional]



