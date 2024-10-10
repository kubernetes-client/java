

# V1alpha3BasicDevice

BasicDevice defines one device instance.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**attributes** | [**Map&lt;String, V1alpha3DeviceAttribute&gt;**](V1alpha3DeviceAttribute.md) | Attributes defines the set of attributes for this device. The name of each attribute must be unique in that set.  The maximum number of attributes and capacities combined is 32. |  [optional] |
|**capacity** | **Map&lt;String, Quantity&gt;** | Capacity defines the set of capacities for this device. The name of each capacity must be unique in that set.  The maximum number of attributes and capacities combined is 32. |  [optional] |



