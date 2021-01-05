

# V1beta1CertificateSigningRequestCondition

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**lastTransitionTime** | [**OffsetDateTime**](OffsetDateTime.md) | lastTransitionTime is the time the condition last transitioned from one status to another. If unset, when a new condition type is added or an existing condition&#39;s status is changed, the server defaults this to the current time. |  [optional]
**lastUpdateTime** | [**OffsetDateTime**](OffsetDateTime.md) | timestamp for the last update to this condition |  [optional]
**message** | **String** | human readable message with details about the request state |  [optional]
**reason** | **String** | brief reason for the request state |  [optional]
**status** | **String** | Status of the condition, one of True, False, Unknown. Approved, Denied, and Failed conditions may not be \&quot;False\&quot; or \&quot;Unknown\&quot;. Defaults to \&quot;True\&quot;. If unset, should be treated as \&quot;True\&quot;. |  [optional]
**type** | **String** | type of the condition. Known conditions include \&quot;Approved\&quot;, \&quot;Denied\&quot;, and \&quot;Failed\&quot;. | 



