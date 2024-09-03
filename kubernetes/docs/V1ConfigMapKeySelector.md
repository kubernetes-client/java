

# V1ConfigMapKeySelector

Selects a key from a ConfigMap.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**key** | **String** | The key to select. |  |
|**name** | **String** | Name of the referent. This field is effectively required, but due to backwards compatibility is allowed to be empty. Instances of this type with an empty value here are almost certainly wrong. More info: https://kubernetes.io/docs/concepts/overview/working-with-objects/names/#names |  [optional] |
|**optional** | **Boolean** | Specify whether the ConfigMap or its key must be defined |  [optional] |



