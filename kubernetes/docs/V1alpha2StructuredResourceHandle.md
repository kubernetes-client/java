

# V1alpha2StructuredResourceHandle

StructuredResourceHandle is the in-tree representation of the allocation result.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**nodeName** | **String** | NodeName is the name of the node providing the necessary resources if the resources are local to a node. |  [optional] |
|**results** | [**List&lt;V1alpha2DriverAllocationResult&gt;**](V1alpha2DriverAllocationResult.md) | Results lists all allocated driver resources. |  |
|**vendorClaimParameters** | **Object** | VendorClaimParameters are the per-claim configuration parameters from the resource claim parameters at the time that the claim was allocated. |  [optional] |
|**vendorClassParameters** | **Object** | VendorClassParameters are the per-claim configuration parameters from the resource class at the time that the claim was allocated. |  [optional] |



