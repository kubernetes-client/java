

# V1beta2NodeAllocatableResource

NodeAllocatableResource defines the translation between the DRA device/capacity units requested to the corresponding quantity of the node allocatable resource. At least one of Mapping or Overhead must be specified. Not specifying either is an invalid configuration.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**mapping** | [**V1beta2NodeAllocatableMapping**](V1beta2NodeAllocatableMapping.md) |  |  [optional] |
|**overhead** | [**V1beta2NodeAllocatableOverhead**](V1beta2NodeAllocatableOverhead.md) |  |  [optional] |



