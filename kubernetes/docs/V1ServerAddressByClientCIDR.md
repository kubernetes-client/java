

# V1ServerAddressByClientCIDR

ServerAddressByClientCIDR helps the client to determine the server address that they should use, depending on the clientCIDR that they match.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**clientCIDR** | **String** | The CIDR with which clients can match their IP to figure out the server address that they should use. |  |
|**serverAddress** | **String** | Address of this server, suitable for a client that matches the above CIDR. This can be a hostname, hostname:port, IP or IP:port. |  |



