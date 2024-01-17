

# V1alpha2PodSchedulingContextSpec

PodSchedulingContextSpec describes where resources for the Pod are needed.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**potentialNodes** | **List&lt;String&gt;** | PotentialNodes lists nodes where the Pod might be able to run.  The size of this field is limited to 128. This is large enough for many clusters. Larger clusters may need more attempts to find a node that suits all pending resources. This may get increased in the future, but not reduced. |  [optional] |
|**selectedNode** | **String** | SelectedNode is the node for which allocation of ResourceClaims that are referenced by the Pod and that use \&quot;WaitForFirstConsumer\&quot; allocation is to be attempted. |  [optional] |



