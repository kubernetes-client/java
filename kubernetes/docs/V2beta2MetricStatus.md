

# V2beta2MetricStatus

MetricStatus describes the last-read state of a single metric.
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**external** | [**V2beta2ExternalMetricStatus**](V2beta2ExternalMetricStatus.md) |  |  [optional]
**_object** | [**V2beta2ObjectMetricStatus**](V2beta2ObjectMetricStatus.md) |  |  [optional]
**pods** | [**V2beta2PodsMetricStatus**](V2beta2PodsMetricStatus.md) |  |  [optional]
**resource** | [**V2beta2ResourceMetricStatus**](V2beta2ResourceMetricStatus.md) |  |  [optional]
**type** | **String** | type is the type of metric source.  It will be one of \&quot;Object\&quot;, \&quot;Pods\&quot; or \&quot;Resource\&quot;, each corresponds to a matching field in the object. | 



