

# V1alpha3PartitionTypeStatus

PartitionTypeStatus reports allocatability for a single partition type, identified by the value of a grouping attribute.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**allocatable** | **Integer** | Allocatable is the number of additional devices of this partition type that could still be allocated given current shared-counter consumption. |  |
|**attribute** | **String** | Attribute is the fully qualified name of the device attribute whose value groups this entry. It is the PartitionTypeAttribute declared by the devices&#39; own slice, or the default named in the request when their slice declares none. |  |
|**total** | **Integer** | Total is the number of devices of this partition type in the pool. |  |
|**type** | **String** | Type is the partition type value (e.g. \&quot;Full\&quot; or \&quot;Half\&quot;). |  |



