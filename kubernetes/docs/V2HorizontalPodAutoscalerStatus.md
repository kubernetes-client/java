

# V2HorizontalPodAutoscalerStatus

HorizontalPodAutoscalerStatus describes the current status of a horizontal pod autoscaler.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**conditions** | [**List&lt;V2HorizontalPodAutoscalerCondition&gt;**](V2HorizontalPodAutoscalerCondition.md) | conditions is the set of conditions required for this autoscaler to scale its target, and indicates whether or not those conditions are met. |  [optional] |
|**currentMetrics** | [**List&lt;V2MetricStatus&gt;**](V2MetricStatus.md) | currentMetrics is the last read state of the metrics used by this autoscaler. |  [optional] |
|**currentReplicas** | **Integer** | currentReplicas is current number of replicas of pods managed by this autoscaler, as last seen by the autoscaler. |  [optional] |
|**desiredReplicas** | **Integer** | desiredReplicas is the desired number of replicas of pods managed by this autoscaler, as last calculated by the autoscaler. |  |
|**lastScaleTime** | **OffsetDateTime** | lastScaleTime is the last time the HorizontalPodAutoscaler scaled the number of pods, used by the autoscaler to control how often the number of pods is changed. |  [optional] |
|**observedGeneration** | **Long** | observedGeneration is the most recent generation observed by this autoscaler. |  [optional] |



