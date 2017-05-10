
# V2alpha1HorizontalPodAutoscalerStatus

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**currentMetrics** | [**List&lt;V2alpha1MetricStatus&gt;**](V2alpha1MetricStatus.md) | currentMetrics is the last read state of the metrics used by this autoscaler. | 
**currentReplicas** | **Integer** | currentReplicas is current number of replicas of pods managed by this autoscaler, as last seen by the autoscaler. | 
**desiredReplicas** | **Integer** | desiredReplicas is the desired number of replicas of pods managed by this autoscaler, as last calculated by the autoscaler. | 
**lastScaleTime** | [**DateTime**](DateTime.md) | lastScaleTime is the last time the HorizontalPodAutoscaler scaled the number of pods, used by the autoscaler to control how often the number of pods is changed. |  [optional]
**observedGeneration** | **Long** | observedGeneration is the most recent generation observed by this autoscaler. |  [optional]



