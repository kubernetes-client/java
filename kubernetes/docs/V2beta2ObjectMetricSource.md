

# V2beta2ObjectMetricSource

ObjectMetricSource indicates how to scale on a metric describing a kubernetes object (for example, hits-per-second on an Ingress object).
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**describedObject** | [**V2beta2CrossVersionObjectReference**](V2beta2CrossVersionObjectReference.md) |  | 
**metric** | [**V2beta2MetricIdentifier**](V2beta2MetricIdentifier.md) |  | 
**target** | [**V2beta2MetricTarget**](V2beta2MetricTarget.md) |  | 



