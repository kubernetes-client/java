

# V1NodePodPreemptionPolicy

NodePodPreemptionPolicy defines the node-level policies governing preemption for pods on this node.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**disableResizePreemption** | **List&lt;String&gt;** | DisableResizePreemption lists the owners (e.g., autoscalers, operators, administrators) that have requested to disable scheduler and Kubelet preemption for in-place pod resize on this node. If this list is non-empty, resize-induced preemption is disabled on this node. This is an alpha field and requires enabling the InPlacePodVerticalScalingSchedulerPreemption feature gate. |  [optional] |



