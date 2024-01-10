

# V1StatefulSetStatus

StatefulSetStatus represents the current state of a StatefulSet.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**availableReplicas** | **Integer** | Total number of available pods (ready for at least minReadySeconds) targeted by this statefulset. |  [optional] |
|**collisionCount** | **Integer** | collisionCount is the count of hash collisions for the StatefulSet. The StatefulSet controller uses this field as a collision avoidance mechanism when it needs to create the name for the newest ControllerRevision. |  [optional] |
|**conditions** | [**List&lt;V1StatefulSetCondition&gt;**](V1StatefulSetCondition.md) | Represents the latest available observations of a statefulset&#39;s current state. |  [optional] |
|**currentReplicas** | **Integer** | currentReplicas is the number of Pods created by the StatefulSet controller from the StatefulSet version indicated by currentRevision. |  [optional] |
|**currentRevision** | **String** | currentRevision, if not empty, indicates the version of the StatefulSet used to generate Pods in the sequence [0,currentReplicas). |  [optional] |
|**observedGeneration** | **Long** | observedGeneration is the most recent generation observed for this StatefulSet. It corresponds to the StatefulSet&#39;s generation, which is updated on mutation by the API Server. |  [optional] |
|**readyReplicas** | **Integer** | readyReplicas is the number of pods created for this StatefulSet with a Ready Condition. |  [optional] |
|**replicas** | **Integer** | replicas is the number of Pods created by the StatefulSet controller. |  |
|**updateRevision** | **String** | updateRevision, if not empty, indicates the version of the StatefulSet used to generate Pods in the sequence [replicas-updatedReplicas,replicas) |  [optional] |
|**updatedReplicas** | **Integer** | updatedReplicas is the number of Pods created by the StatefulSet controller from the StatefulSet version indicated by updateRevision. |  [optional] |



