
# V1beta1LeaseSpec

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**acquireTime** | [**DateTime**](DateTime.md) | acquireTime is a time when the current lease was acquired. |  [optional]
**holderIdentity** | **String** | holderIdentity contains the identity of the holder of a current lease. |  [optional]
**leaseDurationSeconds** | **Integer** | leaseDurationSeconds is a duration that candidates for a lease need to wait to force acquire it. This is measure against time of last observed RenewTime. |  [optional]
**leaseTransitions** | **Integer** | leaseTransitions is the number of transitions of a lease between holders. |  [optional]
**renewTime** | [**DateTime**](DateTime.md) | renewTime is a time when the current holder of a lease has last updated the lease. |  [optional]



