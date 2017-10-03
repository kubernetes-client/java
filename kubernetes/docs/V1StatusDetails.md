
# V1StatusDetails

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**causes** | [**List&lt;V1StatusCause&gt;**](V1StatusCause.md) | The Causes array includes more details associated with the StatusReason failure. Not all StatusReasons may provide detailed causes. |  [optional]
**group** | **String** | The group attribute of the resource associated with the status StatusReason. |  [optional]
**kind** | **String** | The kind attribute of the resource associated with the status StatusReason. On some operations may differ from the requested resource Kind. More info: https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds |  [optional]
**name** | **String** | The name attribute of the resource associated with the status StatusReason (when there is a single name which can be described). |  [optional]
**retryAfterSeconds** | **Integer** | If specified, the time in seconds before the operation should be retried. Some errors may indicate the client must take an alternate action - for those errors this field may indicate how long to wait before taking the alternate action. |  [optional]
**uid** | **String** | UID of the resource. (when there is a single resource which can be described). More info: http://kubernetes.io/docs/user-guide/identifiers#uids |  [optional]



