

# V1alpha2ResourceClaimStatus

ResourceClaimStatus tracks whether the resource has been allocated and what the resulting attributes are.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**allocation** | [**V1alpha2AllocationResult**](V1alpha2AllocationResult.md) |  |  [optional] |
|**deallocationRequested** | **Boolean** | DeallocationRequested indicates that a ResourceClaim is to be deallocated.  The driver then must deallocate this claim and reset the field together with clearing the Allocation field.  While DeallocationRequested is set, no new consumers may be added to ReservedFor. |  [optional] |
|**driverName** | **String** | DriverName is a copy of the driver name from the ResourceClass at the time when allocation started. |  [optional] |
|**reservedFor** | [**List&lt;V1alpha2ResourceClaimConsumerReference&gt;**](V1alpha2ResourceClaimConsumerReference.md) | ReservedFor indicates which entities are currently allowed to use the claim. A Pod which references a ResourceClaim which is not reserved for that Pod will not be started.  There can be at most 32 such reservations. This may get increased in the future, but not reduced. |  [optional] |



