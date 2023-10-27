

# V1ReplicaSetStatus

ReplicaSetStatus represents the current status of a ReplicaSet.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**availableReplicas** | **Integer** | The number of available replicas (ready for at least minReadySeconds) for this replica set. |  [optional] |
|**conditions** | [**List&lt;V1ReplicaSetCondition&gt;**](V1ReplicaSetCondition.md) | Represents the latest available observations of a replica set&#39;s current state. |  [optional] |
|**fullyLabeledReplicas** | **Integer** | The number of pods that have labels matching the labels of the pod template of the replicaset. |  [optional] |
|**observedGeneration** | **Long** | ObservedGeneration reflects the generation of the most recently observed ReplicaSet. |  [optional] |
|**readyReplicas** | **Integer** | readyReplicas is the number of pods targeted by this ReplicaSet with a Ready Condition. |  [optional] |
|**replicas** | **Integer** | Replicas is the most recently observed number of replicas. More info: https://kubernetes.io/docs/concepts/workloads/controllers/replicationcontroller/#what-is-a-replicationcontroller |  |



