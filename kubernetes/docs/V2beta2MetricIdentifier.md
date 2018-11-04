
# V2beta2MetricIdentifier

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **String** | name is the name of the given metric | 
**selector** | [**V1LabelSelector**](V1LabelSelector.md) | selector is the string-encoded form of a standard kubernetes label selector for the given metric When set, it is passed as an additional parameter to the metrics server for more specific metrics scoping. When unset, just the metricName will be used to gather metrics. |  [optional]



