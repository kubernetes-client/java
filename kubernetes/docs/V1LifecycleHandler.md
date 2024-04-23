

# V1LifecycleHandler

LifecycleHandler defines a specific action that should be taken in a lifecycle hook. One and only one of the fields, except TCPSocket must be specified.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**exec** | [**V1ExecAction**](V1ExecAction.md) |  |  [optional] |
|**httpGet** | [**V1HTTPGetAction**](V1HTTPGetAction.md) |  |  [optional] |
|**sleep** | [**V1SleepAction**](V1SleepAction.md) |  |  [optional] |
|**tcpSocket** | [**V1TCPSocketAction**](V1TCPSocketAction.md) |  |  [optional] |



