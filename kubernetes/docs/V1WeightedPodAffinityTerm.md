

# V1WeightedPodAffinityTerm

The weights of all of the matched WeightedPodAffinityTerm fields are added per-node to find the most preferred node(s)

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**podAffinityTerm** | [**V1PodAffinityTerm**](V1PodAffinityTerm.md) |  |  |
|**weight** | **Integer** | weight associated with matching the corresponding podAffinityTerm, in the range 1-100. |  |



