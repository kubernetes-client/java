

# V1ResourceClaimStatus

ResourceClaimStatus tracks whether the resource has been allocated and what the result of that was.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**allocation** | [**V1AllocationResult**](V1AllocationResult.md) |  |  [optional] |
|**devices** | [**List&lt;V1AllocatedDeviceStatus&gt;**](V1AllocatedDeviceStatus.md) | Devices contains the status of each device allocated for this claim, as reported by the driver. This can include driver-specific information. Entries are owned by their respective drivers. |  [optional] |
|**reservedFor** | [**List&lt;V1ResourceClaimConsumerReference&gt;**](V1ResourceClaimConsumerReference.md) | ReservedFor indicates which entities are currently allowed to use the claim. A Pod which references a ResourceClaim which is not reserved for that Pod will not be started. A claim that is in use or might be in use because it has been reserved must not get deallocated.  In a cluster with multiple scheduler instances, two pods might get scheduled concurrently by different schedulers. When they reference the same ResourceClaim which already has reached its maximum number of consumers, only one pod can be scheduled.  Both schedulers try to add their pod to the claim.status.reservedFor field, but only the update that reaches the API server first gets stored. The other one fails with an error and the scheduler which issued it knows that it must put the pod back into the queue, waiting for the ResourceClaim to become usable again.  There can be at most 256 such reservations. This may get increased in the future, but not reduced. |  [optional] |



