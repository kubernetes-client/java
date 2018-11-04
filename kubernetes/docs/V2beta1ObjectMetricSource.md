
# V2beta1ObjectMetricSource

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**averageValue** | **String** | averageValue is the target value of the average of the metric across all relevant pods (as a quantity) |  [optional]
**metricName** | **String** | metricName is the name of the metric in question. | 
**selector** | [**V1LabelSelector**](V1LabelSelector.md) | selector is the string-encoded form of a standard kubernetes label selector for the given metric When set, it is passed as an additional parameter to the metrics server for more specific metrics scoping When unset, just the metricName will be used to gather metrics. |  [optional]
**target** | [**V2beta1CrossVersionObjectReference**](V2beta1CrossVersionObjectReference.md) | target is the described Kubernetes object. | 
**targetValue** | **String** | targetValue is the target value of the metric (as a quantity). | 



