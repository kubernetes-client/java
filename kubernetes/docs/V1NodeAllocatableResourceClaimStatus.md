

# V1NodeAllocatableResourceClaimStatus

NodeAllocatableResourceClaimStatus describes the status of node allocatable resources allocated via DRA.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**containers** | **List&lt;String&gt;** | Containers lists the names of all containers in this pod that reference the claim. |  [optional] |
|**mapping** | [**List&lt;V1NodeAllocatableMappedResources&gt;**](V1NodeAllocatableMappedResources.md) | Mapping contains allocations through devices mapped in the device spec&#39;s &#x60;nodeAllocatableResources[...].mapping&#x60; field. This is used by kubelet for pod level and container-level cgroup enforcement. |  [optional] |
|**overhead** | [**List&lt;V1NodeAllocatableOverheadResources&gt;**](V1NodeAllocatableOverheadResources.md) | Overhead contains allocations through devices mapped in the device spec&#39;s &#x60;nodeAllocatableResources[...].overhead&#x60; field. This is used by kubelet for pod level and container-level cgroup enforcement. |  [optional] |
|**resourceClaimName** | **String** | ResourceClaimName is the resource claim referenced by the pod that resulted in this node allocatable resource allocation. |  |



