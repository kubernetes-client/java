

# V1alpha3BasicDevice

BasicDevice defines one device instance.
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**allNodes** | **Boolean** | AllNodes indicates that all nodes have access to the device.  Must only be set if Spec.PerDeviceNodeSelection is set to true. At most one of NodeName, NodeSelector and AllNodes can be set. |  [optional]
**attributes** | [**Map&lt;String, V1alpha3DeviceAttribute&gt;**](V1alpha3DeviceAttribute.md) | Attributes defines the set of attributes for this device. The name of each attribute must be unique in that set.  The maximum number of attributes and capacities combined is 32. |  [optional]
**capacity** | [**Map&lt;String, Quantity&gt;**](Quantity.md) | Capacity defines the set of capacities for this device. The name of each capacity must be unique in that set.  The maximum number of attributes and capacities combined is 32. |  [optional]
**consumesCounters** | [**List&lt;V1alpha3DeviceCounterConsumption&gt;**](V1alpha3DeviceCounterConsumption.md) | ConsumesCounters defines a list of references to sharedCounters and the set of counters that the device will consume from those counter sets.  There can only be a single entry per counterSet.  The total number of device counter consumption entries must be &lt;&#x3D; 32. In addition, the total number in the entire ResourceSlice must be &lt;&#x3D; 1024 (for example, 64 devices with 16 counters each). |  [optional]
**nodeName** | **String** | NodeName identifies the node where the device is available.  Must only be set if Spec.PerDeviceNodeSelection is set to true. At most one of NodeName, NodeSelector and AllNodes can be set. |  [optional]
**nodeSelector** | [**V1NodeSelector**](V1NodeSelector.md) |  |  [optional]
**taints** | [**List&lt;V1alpha3DeviceTaint&gt;**](V1alpha3DeviceTaint.md) | If specified, these are the driver-defined taints.  The maximum number of taints is 4.  This is an alpha field and requires enabling the DRADeviceTaints feature gate. |  [optional]



