

# V2PodsMetricSource

PodsMetricSource indicates how to scale on a metric describing each pod in the current scale target (for example, transactions-processed-per-second). The values will be averaged together before being compared to the target value.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**metric** | [**V2MetricIdentifier**](V2MetricIdentifier.md) |  |  |
|**target** | [**V2MetricTarget**](V2MetricTarget.md) |  |  |



