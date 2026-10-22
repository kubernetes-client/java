

# V1GRPCAction

GRPCAction specifies an action involving a GRPC service.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**mode** | **String** | mode specifies the connection mode for the gRPC health probe. Set to \&quot;TLS\&quot; to use TLS without certificate verification. Set to \&quot;Plaintext\&quot; to use a plaintext (insecure) connection explicitly. If not specified, the probe uses a plaintext (insecure) connection. |  [optional] |
|**port** | **Integer** | Port number of the gRPC service. Number must be in the range 1 to 65535. |  |
|**service** | **String** | Service is the name of the service to place in the gRPC HealthCheckRequest (see https://github.com/grpc/grpc/blob/master/doc/health-checking.md).  If this is not specified, the default behavior is defined by gRPC. |  [optional] |



