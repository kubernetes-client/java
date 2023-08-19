

# V1PortStatus


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**error** | **String** | Error is to record the problem with the service port The format of the error shall comply with the following rules: - built-in error values shall be specified in this file and those shall use   CamelCase names - cloud provider specific error values must have names that comply with the   format foo.example.com/CamelCase. |  [optional] |
|**port** | **Integer** | Port is the port number of the service port of which status is recorded here |  |
|**protocol** | **String** | Protocol is the protocol of the service port of which status is recorded here The supported values are: \&quot;TCP\&quot;, \&quot;UDP\&quot;, \&quot;SCTP\&quot; |  |



