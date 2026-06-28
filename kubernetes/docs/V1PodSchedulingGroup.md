

# V1PodSchedulingGroup

PodSchedulingGroup identifies the runtime scheduling group instance that a Pod belongs to. The scheduler uses this information to apply workload-aware scheduling semantics. Exactly one field must be specified.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**podGroupName** | **String** | PodGroupName specifies the name of the standalone PodGroup object that represents the runtime instance of this group. Must be a DNS subdomain. |  [optional] |



