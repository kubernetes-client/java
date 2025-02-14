

# V1beta1BasicDevice

BasicDevice defines one device instance.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**attributes** | [**Map&lt;String, V1beta1DeviceAttribute&gt;**](V1beta1DeviceAttribute.md) | Attributes defines the set of attributes for this device. The name of each attribute must be unique in that set.  The maximum number of attributes and capacities combined is 32. |  [optional] |
|**capacity** | [**Map&lt;String, V1beta1DeviceCapacity&gt;**](V1beta1DeviceCapacity.md) | Capacity defines the set of capacities for this device. The name of each capacity must be unique in that set.  The maximum number of attributes and capacities combined is 32. |  [optional] |



