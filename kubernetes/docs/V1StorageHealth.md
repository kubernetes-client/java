

# V1StorageHealth

StorageHealth contains storage backend health reported by a CSI driver on a node.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**healthConditions** | [**List&lt;V1StorageHealthCondition&gt;**](V1StorageHealthCondition.md) | healthConditions are the adverse storage backend conditions reported by the CSI driver. At most 16 conditions may be reported. |  [optional] |
|**name** | **String** | name is the CSI driver name, matching CSINodeDriver.name. |  |



