
# V1HorizontalPodAutoscalerStatus

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**currentCPUUtilizationPercentage** | **Integer** | current average CPU utilization over all pods, represented as a percentage of requested CPU, e.g. 70 means that an average pod is using now 70% of its requested CPU. |  [optional]
**currentReplicas** | **Integer** | current number of replicas of pods managed by this autoscaler. | 
**desiredReplicas** | **Integer** | desired number of replicas of pods managed by this autoscaler. | 
**lastScaleTime** | [**DateTime**](DateTime.md) | last time the HorizontalPodAutoscaler scaled the number of pods; used by the autoscaler to control how often the number of pods is changed. |  [optional]
**observedGeneration** | **Long** | most recent generation observed by this autoscaler. |  [optional]



