
# V2beta1ResourceMetricSource

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **String** | name is the name of the resource in question. | 
**targetAverageUtilization** | **Integer** | targetAverageUtilization is the target value of the average of the resource metric across all relevant pods, represented as a percentage of the requested value of the resource for the pods. |  [optional]
**targetAverageValue** | **String** | targetAverageValue is the target value of the average of the resource metric across all relevant pods, as a raw value (instead of as a percentage of the request), similar to the \&quot;pods\&quot; metric source type. |  [optional]



