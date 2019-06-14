
# V1HorizontalPodAutoscalerSpec

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**maxReplicas** | **Integer** | upper limit for the number of pods that can be set by the autoscaler; cannot be smaller than MinReplicas. | 
**minReplicas** | **Integer** | lower limit for the number of pods that can be set by the autoscaler, default 1. |  [optional]
**scaleTargetRef** | [**V1CrossVersionObjectReference**](V1CrossVersionObjectReference.md) |  | 
**targetCPUUtilizationPercentage** | **Integer** | target average CPU utilization (represented as a percentage of requested CPU) over all the pods; if not specified the default autoscaling policy will be used. |  [optional]



