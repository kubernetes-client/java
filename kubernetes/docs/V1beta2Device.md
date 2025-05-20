

# V1beta2Device

Device represents one individual hardware instance that can be selected based on its attributes. Besides the name, exactly one field must be set.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**allNodes** | **Boolean** | AllNodes indicates that all nodes have access to the device.  Must only be set if Spec.PerDeviceNodeSelection is set to true. At most one of NodeName, NodeSelector and AllNodes can be set. |  [optional] |
|**attributes** | [**Map&lt;String, V1beta2DeviceAttribute&gt;**](V1beta2DeviceAttribute.md) | Attributes defines the set of attributes for this device. The name of each attribute must be unique in that set.  The maximum number of attributes and capacities combined is 32. |  [optional] |
|**capacity** | [**Map&lt;String, V1beta2DeviceCapacity&gt;**](V1beta2DeviceCapacity.md) | Capacity defines the set of capacities for this device. The name of each capacity must be unique in that set.  The maximum number of attributes and capacities combined is 32. |  [optional] |
|**consumesCounters** | [**List&lt;V1beta2DeviceCounterConsumption&gt;**](V1beta2DeviceCounterConsumption.md) | ConsumesCounters defines a list of references to sharedCounters and the set of counters that the device will consume from those counter sets.  There can only be a single entry per counterSet.  The total number of device counter consumption entries must be &lt;&#x3D; 32. In addition, the total number in the entire ResourceSlice must be &lt;&#x3D; 1024 (for example, 64 devices with 16 counters each). |  [optional] |
|**name** | **String** | Name is unique identifier among all devices managed by the driver in the pool. It must be a DNS label. |  |
|**nodeName** | **String** | NodeName identifies the node where the device is available.  Must only be set if Spec.PerDeviceNodeSelection is set to true. At most one of NodeName, NodeSelector and AllNodes can be set. |  [optional] |
|**nodeSelector** | [**V1NodeSelector**](V1NodeSelector.md) |  |  [optional] |
|**taints** | [**List&lt;V1beta2DeviceTaint&gt;**](V1beta2DeviceTaint.md) | If specified, these are the driver-defined taints.  The maximum number of taints is 4.  This is an alpha field and requires enabling the DRADeviceTaints feature gate. |  [optional] |



