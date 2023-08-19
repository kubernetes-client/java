

# V1NamespaceCondition

NamespaceCondition contains details about state of namespace.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**lastTransitionTime** | **OffsetDateTime** | Time is a wrapper around time.Time which supports correct marshaling to YAML and JSON.  Wrappers are provided for many of the factory methods that the time package offers. |  [optional] |
|**message** | **String** |  |  [optional] |
|**reason** | **String** |  |  [optional] |
|**status** | **String** | Status of the condition, one of True, False, Unknown. |  |
|**type** | **String** | Type of namespace controller condition. |  |



