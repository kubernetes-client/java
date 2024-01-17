

# V2ExternalMetricSource

ExternalMetricSource indicates how to scale on a metric not associated with any Kubernetes object (for example length of queue in cloud messaging service, or QPS from loadbalancer running outside of cluster).

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**metric** | [**V2MetricIdentifier**](V2MetricIdentifier.md) |  |  |
|**target** | [**V2MetricTarget**](V2MetricTarget.md) |  |  |



