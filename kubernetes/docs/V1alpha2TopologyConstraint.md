

# V1alpha2TopologyConstraint

TopologyConstraint defines a topology constraint for a PodGroup.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**key** | **String** | Key specifies the key of the node label representing the topology domain. All pods within the PodGroup must be colocated within the same domain instance. Different PodGroups can land on different domain instances even if they derive from the same PodGroupTemplate. Examples: \&quot;topology.kubernetes.io/rack\&quot; |  |



