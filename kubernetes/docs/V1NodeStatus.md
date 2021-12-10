

# V1NodeStatus

NodeStatus is information about the current status of a node.
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**addresses** | [**List&lt;V1NodeAddress&gt;**](V1NodeAddress.md) | List of addresses reachable to the node. Queried from cloud provider, if available. More info: https://kubernetes.io/docs/concepts/nodes/node/#addresses Note: This field is declared as mergeable, but the merge key is not sufficiently unique, which can cause data corruption when it is merged. Callers should instead use a full-replacement patch. See http://pr.k8s.io/79391 for an example. |  [optional]
**allocatable** | [**Map&lt;String, Quantity&gt;**](Quantity.md) | Allocatable represents the resources of a node that are available for scheduling. Defaults to Capacity. |  [optional]
**capacity** | [**Map&lt;String, Quantity&gt;**](Quantity.md) | Capacity represents the total resources of a node. More info: https://kubernetes.io/docs/concepts/storage/persistent-volumes#capacity |  [optional]
**conditions** | [**List&lt;V1NodeCondition&gt;**](V1NodeCondition.md) | Conditions is an array of current observed node conditions. More info: https://kubernetes.io/docs/concepts/nodes/node/#condition |  [optional]
**config** | [**V1NodeConfigStatus**](V1NodeConfigStatus.md) |  |  [optional]
**daemonEndpoints** | [**V1NodeDaemonEndpoints**](V1NodeDaemonEndpoints.md) |  |  [optional]
**images** | [**List&lt;V1ContainerImage&gt;**](V1ContainerImage.md) | List of container images on this node |  [optional]
**nodeInfo** | [**V1NodeSystemInfo**](V1NodeSystemInfo.md) |  |  [optional]
**phase** | [**PhaseEnum**](#PhaseEnum) | NodePhase is the recently observed lifecycle phase of the node. More info: https://kubernetes.io/docs/concepts/nodes/node/#phase The field is never populated, and now is deprecated.  Possible enum values:  - &#x60;\&quot;Pending\&quot;&#x60; means the node has been created/added by the system, but not configured.  - &#x60;\&quot;Running\&quot;&#x60; means the node has been configured and has Kubernetes components running.  - &#x60;\&quot;Terminated\&quot;&#x60; means the node has been removed from the cluster. |  [optional]
**volumesAttached** | [**List&lt;V1AttachedVolume&gt;**](V1AttachedVolume.md) | List of volumes that are attached to the node. |  [optional]
**volumesInUse** | **List&lt;String&gt;** | List of attachable volumes in use (mounted) by the node. |  [optional]



## Enum: PhaseEnum

Name | Value
---- | -----
PENDING | &quot;Pending&quot;
RUNNING | &quot;Running&quot;
TERMINATED | &quot;Terminated&quot;



