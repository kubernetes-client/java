

# V1LimitRangeItem

LimitRangeItem defines a min/max usage limit for any resource that matches on kind.
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**_default** | [**Map&lt;String, Quantity&gt;**](Quantity.md) | Default resource requirement limit value by resource name if resource limit is omitted. |  [optional]
**defaultRequest** | [**Map&lt;String, Quantity&gt;**](Quantity.md) | DefaultRequest is the default resource requirement request value by resource name if resource request is omitted. |  [optional]
**max** | [**Map&lt;String, Quantity&gt;**](Quantity.md) | Max usage constraints on this kind by resource name. |  [optional]
**maxLimitRequestRatio** | [**Map&lt;String, Quantity&gt;**](Quantity.md) | MaxLimitRequestRatio if specified, the named resource must have a request and limit that are both non-zero where limit divided by request is less than or equal to the enumerated value; this represents the max burst for the named resource. |  [optional]
**min** | [**Map&lt;String, Quantity&gt;**](Quantity.md) | Min usage constraints on this kind by resource name. |  [optional]
**type** | [**TypeEnum**](#TypeEnum) | Type of resource that this limit applies to.  Possible enum values:  - &#x60;\&quot;Container\&quot;&#x60; Limit that applies to all containers in a namespace  - &#x60;\&quot;PersistentVolumeClaim\&quot;&#x60; Limit that applies to all persistent volume claims in a namespace  - &#x60;\&quot;Pod\&quot;&#x60; Limit that applies to all pods in a namespace | 



## Enum: TypeEnum

Name | Value
---- | -----
CONTAINER | &quot;Container&quot;
PERSISTENTVOLUMECLAIM | &quot;PersistentVolumeClaim&quot;
POD | &quot;Pod&quot;



