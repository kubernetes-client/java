

# V1HorizontalPodAutoscalerStatus

current status of a horizontal pod autoscaler

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**currentCPUUtilizationPercentage** | **Integer** | currentCPUUtilizationPercentage is the current average CPU utilization over all pods, represented as a percentage of requested CPU, e.g. 70 means that an average pod is using now 70% of its requested CPU. |  [optional] |
|**currentReplicas** | **Integer** | currentReplicas is the current number of replicas of pods managed by this autoscaler. |  |
|**desiredReplicas** | **Integer** | desiredReplicas is the  desired number of replicas of pods managed by this autoscaler. |  |
|**lastScaleTime** | **OffsetDateTime** | lastScaleTime is the last time the HorizontalPodAutoscaler scaled the number of pods; used by the autoscaler to control how often the number of pods is changed. |  [optional] |
|**observedGeneration** | **Long** | observedGeneration is the most recent generation observed by this autoscaler. |  [optional] |



