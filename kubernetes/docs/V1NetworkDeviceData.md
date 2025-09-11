

# V1NetworkDeviceData

NetworkDeviceData provides network-related details for the allocated device. This information may be filled by drivers or other components to configure or identify the device within a network context.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**hardwareAddress** | **String** | HardwareAddress represents the hardware address (e.g. MAC Address) of the device&#39;s network interface.  Must not be longer than 128 characters. |  [optional] |
|**interfaceName** | **String** | InterfaceName specifies the name of the network interface associated with the allocated device. This might be the name of a physical or virtual network interface being configured in the pod.  Must not be longer than 256 characters. |  [optional] |
|**ips** | **List&lt;String&gt;** | IPs lists the network addresses assigned to the device&#39;s network interface. This can include both IPv4 and IPv6 addresses. The IPs are in the CIDR notation, which includes both the address and the associated subnet mask. e.g.: \&quot;192.0.2.5/24\&quot; for IPv4 and \&quot;2001:db8::5/64\&quot; for IPv6. |  [optional] |



