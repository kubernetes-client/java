
# V1EnvVarSource

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**configMapKeyRef** | [**V1ConfigMapKeySelector**](V1ConfigMapKeySelector.md) | Selects a key of a ConfigMap. |  [optional]
**fieldRef** | [**V1ObjectFieldSelector**](V1ObjectFieldSelector.md) | Selects a field of the pod: supports metadata.name, metadata.namespace, metadata.labels, metadata.annotations, spec.nodeName, spec.serviceAccountName, status.hostIP, status.podIP. |  [optional]
**resourceFieldRef** | [**V1ResourceFieldSelector**](V1ResourceFieldSelector.md) | Selects a resource of the container: only resources limits and requests (limits.cpu, limits.memory, limits.ephemeral-storage, requests.cpu, requests.memory and requests.ephemeral-storage) are currently supported. |  [optional]
**secretKeyRef** | [**V1SecretKeySelector**](V1SecretKeySelector.md) | Selects a key of a secret in the pod&#39;s namespace |  [optional]



