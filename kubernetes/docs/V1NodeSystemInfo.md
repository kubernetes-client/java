
# V1NodeSystemInfo

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**architecture** | **String** | The Architecture reported by the node | 
**bootID** | **String** | Boot ID reported by the node. | 
**containerRuntimeVersion** | **String** | ContainerRuntime Version reported by the node through runtime remote API (e.g. docker://1.5.0). | 
**kernelVersion** | **String** | Kernel Version reported by the node from &#39;uname -r&#39; (e.g. 3.16.0-0.bpo.4-amd64). | 
**kubeProxyVersion** | **String** | KubeProxy Version reported by the node. | 
**kubeletVersion** | **String** | Kubelet Version reported by the node. | 
**machineID** | **String** | MachineID reported by the node. For unique machine identification in the cluster this field is prefered. Learn more from man(5) machine-id: http://man7.org/linux/man-pages/man5/machine-id.5.html | 
**operatingSystem** | **String** | The Operating System reported by the node | 
**osImage** | **String** | OS Image reported by the node from /etc/os-release (e.g. Debian GNU/Linux 7 (wheezy)). | 
**systemUUID** | **String** | SystemUUID reported by the node. For unique machine identification MachineID is prefered. This field is specific to Red Hat hosts https://access.redhat.com/documentation/en-US/Red_Hat_Subscription_Management/1/html/RHSM/getting-system-uuid.html | 



