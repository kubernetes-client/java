

# V1ResourceSliceSpec

ResourceSliceSpec contains the information published by the driver in one ResourceSlice.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**allNodes** | **Boolean** | AllNodes indicates that all nodes have access to the resources in the pool.  Exactly one of NodeName, NodeSelector, AllNodes, and PerDeviceNodeSelection must be set. |  [optional] |
|**devices** | [**List&lt;V1Device&gt;**](V1Device.md) | Devices lists some or all of the devices in this pool.  Must not have more than 128 entries. If any device uses taints or consumes counters the limit is 64.  Only one of Devices and SharedCounters can be set in a ResourceSlice. |  [optional] |
|**driver** | **String** | Driver identifies the DRA driver providing the capacity information. A field selector can be used to list only ResourceSlice objects with a certain driver name.  Must be a DNS subdomain and should end with a DNS domain owned by the vendor of the driver. It should use only lower case characters. This field is immutable. |  |
|**nodeName** | **String** | NodeName identifies the node which provides the resources in this pool. A field selector can be used to list only ResourceSlice objects belonging to a certain node.  This field can be used to limit access from nodes to ResourceSlices with the same node name. It also indicates to autoscalers that adding new nodes of the same type as some old node might also make new resources available.  Exactly one of NodeName, NodeSelector, AllNodes, and PerDeviceNodeSelection must be set. This field is immutable. |  [optional] |
|**nodeSelector** | [**V1NodeSelector**](V1NodeSelector.md) |  |  [optional] |
|**partitionTypeAttribute** | **String** | PartitionTypeAttribute names a string device attribute (by fully qualified name, e.g. \&quot;gpu.example.com/profile\&quot;) whose value labels each device with its partition type, such as \&quot;Full\&quot; or \&quot;Half\&quot; for a MIG-style GPU.  When set, every partitionable device in the slice must carry the attribute and devices sharing a value must share the same ConsumesCounters cost. |  [optional] |
|**perDeviceNodeSelection** | **Boolean** | PerDeviceNodeSelection defines whether the access from nodes to resources in the pool is set on the ResourceSlice level or on each device. If it is set to true, every device defined the ResourceSlice must specify this individually.  Exactly one of NodeName, NodeSelector, AllNodes, and PerDeviceNodeSelection must be set. |  [optional] |
|**pool** | [**V1ResourcePool**](V1ResourcePool.md) |  |  |
|**sharedCounters** | [**List&lt;V1CounterSet&gt;**](V1CounterSet.md) | SharedCounters defines a list of counter sets, each of which has a name and a list of counters available.  The names of the counter sets must be unique in the ResourcePool.  Only one of Devices and SharedCounters can be set in a ResourceSlice.  The maximum number of counter sets is 8. |  [optional] |
|**skipNodeOperations** | **List&lt;String&gt;** | SkipNodeOperations lists node-local resource operations (gRPC calls) that will be skipped for the devices in this slice when determining whether operations are necessary on the node. If all allocated devices for a driver in a claim skip an operation, that gRPC call will be skipped. Valid values are:  - \&quot;NodePrepareResources\&quot;: NodePrepareResources gRPC calls are skipped. This   value cannot be specified unless \&quot;NodeUnprepareResources\&quot; is also listed   (or \&quot;*\&quot; is specified). - \&quot;NodeUnprepareResources\&quot;: NodeUnprepareResources gRPC calls are skipped. - \&quot;*\&quot;: All node-local resource operations are skipped.  Other values may be added in the future. The kubelet must ignore unknown values. |  [optional] |



