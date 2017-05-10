
# V1Status

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**apiVersion** | **String** | APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: http://releases.k8s.io/HEAD/docs/devel/api-conventions.md#resources |  [optional]
**code** | **Integer** | Suggested HTTP return code for this status, 0 if not set. |  [optional]
**details** | [**V1StatusDetails**](V1StatusDetails.md) | Extended data associated with the reason.  Each reason may define its own extended details. This field is optional and the data returned is not guaranteed to conform to any schema except that defined by the reason type. |  [optional]
**kind** | **String** | Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: http://releases.k8s.io/HEAD/docs/devel/api-conventions.md#types-kinds |  [optional]
**message** | **String** | A human-readable description of the status of this operation. |  [optional]
**metadata** | [**V1ListMeta**](V1ListMeta.md) | Standard list metadata. More info: http://releases.k8s.io/HEAD/docs/devel/api-conventions.md#types-kinds |  [optional]
**reason** | **String** | A machine-readable description of why this operation is in the \&quot;Failure\&quot; status. If this value is empty there is no information available. A Reason clarifies an HTTP status code but does not override it. |  [optional]
**status** | **String** | Status of the operation. One of: \&quot;Success\&quot; or \&quot;Failure\&quot;. More info: http://releases.k8s.io/HEAD/docs/devel/api-conventions.md#spec-and-status |  [optional]



