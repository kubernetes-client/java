

# V1ReplicaSetStatus

ReplicaSetStatus represents the current status of a ReplicaSet.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**availableReplicas** | **Integer** | The number of available non-terminating pods (ready for at least minReadySeconds) for this replica set. |  [optional] |
|**conditions** | [**List&lt;V1ReplicaSetCondition&gt;**](V1ReplicaSetCondition.md) | Represents the latest available observations of a replica set&#39;s current state. |  [optional] |
|**fullyLabeledReplicas** | **Integer** | The number of non-terminating pods that have labels matching the labels of the pod template of the replicaset. |  [optional] |
|**observedGeneration** | **Long** | ObservedGeneration reflects the generation of the most recently observed ReplicaSet. |  [optional] |
|**readyReplicas** | **Integer** | The number of non-terminating pods targeted by this ReplicaSet with a Ready Condition. |  [optional] |
|**replicas** | **Integer** | Replicas is the most recently observed number of non-terminating pods. More info: https://kubernetes.io/docs/concepts/workloads/controllers/replicaset |  |
|**terminatingReplicas** | **Integer** | The number of terminating pods for this replica set. Terminating pods have a non-null .metadata.deletionTimestamp and have not yet reached the Failed or Succeeded .status.phase.  This is a beta field and requires enabling DeploymentReplicaSetTerminatingReplicas feature (enabled by default). |  [optional] |



