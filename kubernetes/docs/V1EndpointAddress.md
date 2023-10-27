

# V1EndpointAddress

EndpointAddress is a tuple that describes single IP address.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**hostname** | **String** | The Hostname of this endpoint |  [optional] |
|**ip** | **String** | The IP of this endpoint. May not be loopback (127.0.0.0/8 or ::1), link-local (169.254.0.0/16 or fe80::/10), or link-local multicast (224.0.0.0/24 or ff02::/16). |  |
|**nodeName** | **String** | Optional: Node hosting this endpoint. This can be used to determine endpoints local to a node. |  [optional] |
|**targetRef** | [**V1ObjectReference**](V1ObjectReference.md) |  |  [optional] |



