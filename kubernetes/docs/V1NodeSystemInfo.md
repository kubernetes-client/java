

# V1NodeSystemInfo

NodeSystemInfo is a set of ids/uuids to uniquely identify the node.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**architecture** | **String** | The Architecture reported by the node |  |
|**bootID** | **String** | Boot ID reported by the node. |  |
|**containerRuntimeVersion** | **String** | ContainerRuntime Version reported by the node through runtime remote API (e.g. containerd://1.4.2). |  |
|**kernelVersion** | **String** | Kernel Version reported by the node from &#39;uname -r&#39; (e.g. 3.16.0-0.bpo.4-amd64). |  |
|**kubeProxyVersion** | **String** | KubeProxy Version reported by the node. |  |
|**kubeletVersion** | **String** | Kubelet Version reported by the node. |  |
|**machineID** | **String** | MachineID reported by the node. For unique machine identification in the cluster this field is preferred. Learn more from man(5) machine-id: http://man7.org/linux/man-pages/man5/machine-id.5.html |  |
|**operatingSystem** | **String** | The Operating System reported by the node |  |
|**osImage** | **String** | OS Image reported by the node from /etc/os-release (e.g. Debian GNU/Linux 7 (wheezy)). |  |
|**systemUUID** | **String** | SystemUUID reported by the node. For unique machine identification MachineID is preferred. This field is specific to Red Hat hosts https://access.redhat.com/documentation/en-us/red_hat_subscription_management/1/html/rhsm/uuid |  |



