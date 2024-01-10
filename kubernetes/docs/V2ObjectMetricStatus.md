

# V2ObjectMetricStatus

ObjectMetricStatus indicates the current value of a metric describing a kubernetes object (for example, hits-per-second on an Ingress object).

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**current** | [**V2MetricValueStatus**](V2MetricValueStatus.md) |  |  |
|**describedObject** | [**V2CrossVersionObjectReference**](V2CrossVersionObjectReference.md) |  |  |
|**metric** | [**V2MetricIdentifier**](V2MetricIdentifier.md) |  |  |



