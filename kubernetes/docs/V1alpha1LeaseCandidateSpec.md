

# V1alpha1LeaseCandidateSpec

LeaseCandidateSpec is a specification of a Lease.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**binaryVersion** | **String** | BinaryVersion is the binary version. It must be in a semver format without leading &#x60;v&#x60;. This field is required when strategy is \&quot;OldestEmulationVersion\&quot; |  [optional] |
|**emulationVersion** | **String** | EmulationVersion is the emulation version. It must be in a semver format without leading &#x60;v&#x60;. EmulationVersion must be less than or equal to BinaryVersion. This field is required when strategy is \&quot;OldestEmulationVersion\&quot; |  [optional] |
|**leaseName** | **String** | LeaseName is the name of the lease for which this candidate is contending. This field is immutable. |  |
|**pingTime** | **OffsetDateTime** | PingTime is the last time that the server has requested the LeaseCandidate to renew. It is only done during leader election to check if any LeaseCandidates have become ineligible. When PingTime is updated, the LeaseCandidate will respond by updating RenewTime. |  [optional] |
|**preferredStrategies** | **List&lt;String&gt;** | PreferredStrategies indicates the list of strategies for picking the leader for coordinated leader election. The list is ordered, and the first strategy supersedes all other strategies. The list is used by coordinated leader election to make a decision about the final election strategy. This follows as - If all clients have strategy X as the first element in this list, strategy X will be used. - If a candidate has strategy [X] and another candidate has strategy [Y, X], Y supersedes X and strategy Y   will be used. - If a candidate has strategy [X, Y] and another candidate has strategy [Y, X], this is a user error and leader   election will not operate the Lease until resolved. (Alpha) Using this field requires the CoordinatedLeaderElection feature gate to be enabled. |  |
|**renewTime** | **OffsetDateTime** | RenewTime is the time that the LeaseCandidate was last updated. Any time a Lease needs to do leader election, the PingTime field is updated to signal to the LeaseCandidate that they should update the RenewTime. Old LeaseCandidate objects are also garbage collected if it has been hours since the last renew. The PingTime field is updated regularly to prevent garbage collection for still active LeaseCandidates. |  [optional] |



