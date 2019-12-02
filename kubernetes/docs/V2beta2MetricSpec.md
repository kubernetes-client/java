

# V2beta2MetricSpec

MetricSpec specifies how to scale based on a single metric (only `type` and one other matching field should be set at once).
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**external** | [**V2beta2ExternalMetricSource**](V2beta2ExternalMetricSource.md) |  |  [optional]
**_object** | [**V2beta2ObjectMetricSource**](V2beta2ObjectMetricSource.md) |  |  [optional]
**pods** | [**V2beta2PodsMetricSource**](V2beta2PodsMetricSource.md) |  |  [optional]
**resource** | [**V2beta2ResourceMetricSource**](V2beta2ResourceMetricSource.md) |  |  [optional]
**type** | **String** | type is the type of metric source.  It should be one of \&quot;Object\&quot;, \&quot;Pods\&quot; or \&quot;Resource\&quot;, each mapping to a matching field in the object. | 



