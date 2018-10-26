
# V2beta2HorizontalPodAutoscalerSpec

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**maxReplicas** | **Integer** | maxReplicas is the upper limit for the number of replicas to which the autoscaler can scale up. It cannot be less that minReplicas. | 
**metrics** | [**List&lt;V2beta2MetricSpec&gt;**](V2beta2MetricSpec.md) | metrics contains the specifications for which to use to calculate the desired replica count (the maximum replica count across all metrics will be used).  The desired replica count is calculated multiplying the ratio between the target value and the current value by the current number of pods.  Ergo, metrics used must decrease as the pod count is increased, and vice-versa.  See the individual metric source types for more information about how each type of metric must respond. If not set, the default metric will be set to 80% average CPU utilization. |  [optional]
**minReplicas** | **Integer** | minReplicas is the lower limit for the number of replicas to which the autoscaler can scale down. It defaults to 1 pod. |  [optional]
**scaleTargetRef** | [**V2beta2CrossVersionObjectReference**](V2beta2CrossVersionObjectReference.md) | scaleTargetRef points to the target resource to scale, and is used to the pods for which metrics should be collected, as well as to actually change the replica count. | 



