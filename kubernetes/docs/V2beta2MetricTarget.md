
# V2beta2MetricTarget

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**averageUtilization** | **Integer** | averageUtilization is the target value of the average of the resource metric across all relevant pods, represented as a percentage of the requested value of the resource for the pods. Currently only valid for Resource metric source type |  [optional]
**averageValue** | [**Quantity**](Quantity.md) | averageValue is the target value of the average of the metric across all relevant pods (as a quantity) |  [optional]
**type** | **String** | type represents whether the metric type is Utilization, Value, or AverageValue | 
**value** | [**Quantity**](Quantity.md) | value is the target value of the metric (as a quantity). |  [optional]



