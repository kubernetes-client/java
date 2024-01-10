

# V2MetricStatus

MetricStatus describes the last-read state of a single metric.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**containerResource** | [**V2ContainerResourceMetricStatus**](V2ContainerResourceMetricStatus.md) |  |  [optional] |
|**external** | [**V2ExternalMetricStatus**](V2ExternalMetricStatus.md) |  |  [optional] |
|**_object** | [**V2ObjectMetricStatus**](V2ObjectMetricStatus.md) |  |  [optional] |
|**pods** | [**V2PodsMetricStatus**](V2PodsMetricStatus.md) |  |  [optional] |
|**resource** | [**V2ResourceMetricStatus**](V2ResourceMetricStatus.md) |  |  [optional] |
|**type** | **String** | type is the type of metric source.  It will be one of \&quot;ContainerResource\&quot;, \&quot;External\&quot;, \&quot;Object\&quot;, \&quot;Pods\&quot; or \&quot;Resource\&quot;, each corresponds to a matching field in the object. Note: \&quot;ContainerResource\&quot; type is available on when the feature-gate HPAContainerMetrics is enabled |  |



