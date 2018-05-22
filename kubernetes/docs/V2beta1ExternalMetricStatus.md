
# V2beta1ExternalMetricStatus

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**currentAverageValue** | **String** | currentAverageValue is the current value of metric averaged over autoscaled pods. |  [optional]
**currentValue** | **String** | currentValue is the current value of the metric (as a quantity) | 
**metricName** | **String** | metricName is the name of a metric used for autoscaling in metric system. | 
**metricSelector** | [**V1LabelSelector**](V1LabelSelector.md) | metricSelector is used to identify a specific time series within a given metric. |  [optional]



