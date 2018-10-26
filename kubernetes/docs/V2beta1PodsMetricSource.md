
# V2beta1PodsMetricSource

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**metricName** | **String** | metricName is the name of the metric in question | 
**selector** | [**V1LabelSelector**](V1LabelSelector.md) | selector is the string-encoded form of a standard kubernetes label selector for the given metric When set, it is passed as an additional parameter to the metrics server for more specific metrics scoping When unset, just the metricName will be used to gather metrics. |  [optional]
**targetAverageValue** | **String** | targetAverageValue is the target value of the average of the metric across all relevant pods (as a quantity) | 



