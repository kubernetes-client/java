

# V1StorageHealthCondition

StorageHealthCondition represents an adverse health condition reported by a CSI driver for its storage backend on a node.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**accessMode** | **String** | accessMode is the access mode affected. Nil means all access modes are affected. |  [optional] |
|**lastTransitionTime** | **OffsetDateTime** | lastTransitionTime is when this condition first appeared at its current state. |  [optional] |
|**message** | **String** | message is a human-readable description. Maximum permitted length of a message is 1024 characters. |  [optional] |
|**reason** | **String** | reason is a brief CamelCase machine-parseable reason. Maximum permitted length of a reason is 256 characters. |  |
|**status** | **String** | status is the health status category. One of \&quot;StorageUnreachable\&quot;, \&quot;StorageDegraded\&quot;. |  |
|**volumeMode** | **String** | volumeMode is the volume mode affected. Nil means both are affected. |  [optional] |



