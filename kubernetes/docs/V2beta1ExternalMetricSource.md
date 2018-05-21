
# V2beta1ExternalMetricSource

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**metricName** | **String** | metricName is the name of the metric in question. | 
**metricSelector** | [**V1LabelSelector**](V1LabelSelector.md) | metricSelector is used to identify a specific time series within a given metric. |  [optional]
**targetAverageValue** | [**Quantity**](Quantity.md) | targetAverageValue is the target per-pod value of global metric (as a quantity). Mutually exclusive with TargetValue. |  [optional]
**targetValue** | [**Quantity**](Quantity.md) | targetValue is the target value of the metric (as a quantity). Mutually exclusive with TargetAverageValue. |  [optional]



