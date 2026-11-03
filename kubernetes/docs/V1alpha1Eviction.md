

# V1alpha1Eviction

Eviction initiates an eviction process, which should ideally result in a graceful eviction of a .spec.target (e.g. termination of a pod).  The evictionrequest-controller observes intents of all EvictionRequests and transforms them into Evictions. It manages the Eviction lifecycle. Requesters are preserved in .status.requesters even after they have withdrawn their request. If all requesters withdraw their eviction intent for a common target, the eviction will be canceled. Once all EvictionRequest corresponding to this Eviction .spec.target have been removed, this Eviction object will eventually be garbage collected.  If the target is a pod, the .status.targetResponders is populated from Pod's .spec.evictionResponders.  Responders should observe and communicate through the .status to help with the eviction of the target when they see their state == Active in .status.targetResponders. ResponderStatus struct should then be periodically updated to indicate the progress or completion of the eviction process by each responder in .status.responders. If .status.responders[].heartbeatTime is not updated within the heartbeat deadline defined by the Eviction API (currently 20 minutes), the eviction is passed over to the next responder with a lower priority.  If there are no other responders and the target is a pod, the last default imperative-eviction.k8s.io/evictor responder with a priority of 100 will evict the pod using the imperative Eviction API (pods/<name>/eviction subresource).

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**apiVersion** | **String** | APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources |  [optional] |
|**kind** | **String** | Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds |  [optional] |
|**metadata** | [**V1ObjectMeta**](V1ObjectMeta.md) |  |  [optional] |
|**spec** | [**V1alpha1EvictionSpec**](V1alpha1EvictionSpec.md) |  |  |
|**status** | [**V1alpha1EvictionStatus**](V1alpha1EvictionStatus.md) |  |  [optional] |


## Implemented Interfaces

* io.kubernetes.client.common.KubernetesObject


