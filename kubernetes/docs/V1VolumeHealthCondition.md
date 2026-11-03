

# V1VolumeHealthCondition

VolumeHealthCondition represents an adverse health condition reported for a volume.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**message** | **String** | message is a human-readable description. Maximum permitted length of a message is 1024 bytes. |  [optional] |
|**reason** | **String** | reason is a brief CamelCase machine-parseable reason. Together with status it forms the unique identity of a condition entry. Maximum permitted length of a reason is 256 bytes. |  |
|**status** | **String** | status is the machine-parseable health category. Possible values: - \&quot;Inaccessible\&quot;: the volume cannot be accessed. - \&quot;DataLoss\&quot;: data loss has been detected on the volume. - \&quot;Degraded\&quot;: the volume is functioning with reduced capability. |  |



