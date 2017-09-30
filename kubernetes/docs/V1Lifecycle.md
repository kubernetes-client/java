
# V1Lifecycle

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**postStart** | [**V1Handler**](V1Handler.md) | PostStart is called immediately after a container is created. If the handler fails, the container is terminated and restarted according to its restart policy. Other management of the container blocks until the hook completes. More info: https://kubernetes.io/docs/concepts/containers/container-lifecycle-hooks/#container-hooks |  [optional]
**preStop** | [**V1Handler**](V1Handler.md) | PreStop is called immediately before a container is terminated. The container is terminated after the handler completes. The reason for termination is passed to the handler. Regardless of the outcome of the handler, the container is eventually terminated. Other management of the container blocks until the hook completes. More info: https://kubernetes.io/docs/concepts/containers/container-lifecycle-hooks/#container-hooks |  [optional]



