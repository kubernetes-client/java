

# V1Lifecycle

Lifecycle describes actions that the management system should take in response to container lifecycle events. For the PostStart and PreStop lifecycle handlers, management of the container blocks until the action is complete, unless the container process fails, in which case the handler is aborted.
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**postStart** | [**V1LifecycleHandler**](V1LifecycleHandler.md) |  |  [optional]
**preStop** | [**V1LifecycleHandler**](V1LifecycleHandler.md) |  |  [optional]
**stopSignal** | **String** | StopSignal defines which signal will be sent to a container when it is being stopped. If not specified, the default is defined by the container runtime in use. StopSignal can only be set for Pods with a non-empty .spec.os.name |  [optional]



