

# V1LeaseSpec

LeaseSpec is a specification of a Lease.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**acquireTime** | **OffsetDateTime** | acquireTime is a time when the current lease was acquired. |  [optional] |
|**holderIdentity** | **String** | holderIdentity contains the identity of the holder of a current lease. If Coordinated Leader Election is used, the holder identity must be equal to the elected LeaseCandidate.metadata.name field. |  [optional] |
|**leaseDurationSeconds** | **Integer** | leaseDurationSeconds is a duration that candidates for a lease need to wait to force acquire it. This is measured against the time of last observed renewTime. |  [optional] |
|**leaseTransitions** | **Integer** | leaseTransitions is the number of transitions of a lease between holders. |  [optional] |
|**preferredHolder** | **String** | PreferredHolder signals to a lease holder that the lease has a more optimal holder and should be given up. This field can only be set if Strategy is also set. |  [optional] |
|**renewTime** | **OffsetDateTime** | renewTime is a time when the current holder of a lease has last updated the lease. |  [optional] |
|**strategy** | **String** | Strategy indicates the strategy for picking the leader for coordinated leader election. If the field is not specified, there is no active coordination for this lease. (Alpha) Using this field requires the CoordinatedLeaderElection feature gate to be enabled. |  [optional] |



