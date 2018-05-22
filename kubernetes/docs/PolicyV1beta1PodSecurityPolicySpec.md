
# PolicyV1beta1PodSecurityPolicySpec

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**allowPrivilegeEscalation** | **Boolean** | AllowPrivilegeEscalation determines if a pod can request to allow privilege escalation. If unspecified, defaults to true. |  [optional]
**allowedCapabilities** | **List&lt;String&gt;** | AllowedCapabilities is a list of capabilities that can be requested to add to the container. Capabilities in this field may be added at the pod author&#39;s discretion. You must not list a capability in both AllowedCapabilities and RequiredDropCapabilities. |  [optional]
**allowedFlexVolumes** | [**List&lt;PolicyV1beta1AllowedFlexVolume&gt;**](PolicyV1beta1AllowedFlexVolume.md) | AllowedFlexVolumes is a whitelist of allowed Flexvolumes.  Empty or nil indicates that all Flexvolumes may be used.  This parameter is effective only when the usage of the Flexvolumes is allowed in the \&quot;Volumes\&quot; field. |  [optional]
**allowedHostPaths** | [**List&lt;PolicyV1beta1AllowedHostPath&gt;**](PolicyV1beta1AllowedHostPath.md) | is a white list of allowed host paths. Empty indicates that all host paths may be used. |  [optional]
**defaultAddCapabilities** | **List&lt;String&gt;** | DefaultAddCapabilities is the default set of capabilities that will be added to the container unless the pod spec specifically drops the capability.  You may not list a capability in both DefaultAddCapabilities and RequiredDropCapabilities. Capabilities added here are implicitly allowed, and need not be included in the AllowedCapabilities list. |  [optional]
**defaultAllowPrivilegeEscalation** | **Boolean** | DefaultAllowPrivilegeEscalation controls the default setting for whether a process can gain more privileges than its parent process. |  [optional]
**fsGroup** | [**PolicyV1beta1FSGroupStrategyOptions**](PolicyV1beta1FSGroupStrategyOptions.md) | FSGroup is the strategy that will dictate what fs group is used by the SecurityContext. | 
**hostIPC** | **Boolean** | hostIPC determines if the policy allows the use of HostIPC in the pod spec. |  [optional]
**hostNetwork** | **Boolean** | hostNetwork determines if the policy allows the use of HostNetwork in the pod spec. |  [optional]
**hostPID** | **Boolean** | hostPID determines if the policy allows the use of HostPID in the pod spec. |  [optional]
**hostPorts** | [**List&lt;PolicyV1beta1HostPortRange&gt;**](PolicyV1beta1HostPortRange.md) | hostPorts determines which host port ranges are allowed to be exposed. |  [optional]
**privileged** | **Boolean** | privileged determines if a pod can request to be run as privileged. |  [optional]
**readOnlyRootFilesystem** | **Boolean** | ReadOnlyRootFilesystem when set to true will force containers to run with a read only root file system.  If the container specifically requests to run with a non-read only root file system the PSP should deny the pod. If set to false the container may run with a read only root file system if it wishes but it will not be forced to. |  [optional]
**requiredDropCapabilities** | **List&lt;String&gt;** | RequiredDropCapabilities are the capabilities that will be dropped from the container.  These are required to be dropped and cannot be added. |  [optional]
**runAsUser** | [**PolicyV1beta1RunAsUserStrategyOptions**](PolicyV1beta1RunAsUserStrategyOptions.md) | runAsUser is the strategy that will dictate the allowable RunAsUser values that may be set. | 
**seLinux** | [**PolicyV1beta1SELinuxStrategyOptions**](PolicyV1beta1SELinuxStrategyOptions.md) | seLinux is the strategy that will dictate the allowable labels that may be set. | 
**supplementalGroups** | [**PolicyV1beta1SupplementalGroupsStrategyOptions**](PolicyV1beta1SupplementalGroupsStrategyOptions.md) | SupplementalGroups is the strategy that will dictate what supplemental groups are used by the SecurityContext. | 
**volumes** | **List&lt;String&gt;** | volumes is a white list of allowed volume plugins.  Empty indicates that all plugins may be used. |  [optional]



