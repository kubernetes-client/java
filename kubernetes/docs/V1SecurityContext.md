

# V1SecurityContext

SecurityContext holds security configuration that will be applied to a container. Some fields are present in both SecurityContext and PodSecurityContext.  When both are set, the values in SecurityContext take precedence.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**allowPrivilegeEscalation** | **Boolean** | AllowPrivilegeEscalation controls whether a process can gain more privileges than its parent process. This bool directly controls if the no_new_privs flag will be set on the container process. AllowPrivilegeEscalation is true always when the container is: 1) run as Privileged 2) has CAP_SYS_ADMIN Note that this field cannot be set when spec.os.name is windows. |  [optional] |
|**appArmorProfile** | [**V1AppArmorProfile**](V1AppArmorProfile.md) |  |  [optional] |
|**capabilities** | [**V1Capabilities**](V1Capabilities.md) |  |  [optional] |
|**privileged** | **Boolean** | Run container in privileged mode. Processes in privileged containers are essentially equivalent to root on the host. Defaults to false. Note that this field cannot be set when spec.os.name is windows. |  [optional] |
|**procMount** | **String** | procMount denotes the type of proc mount to use for the containers. The default is DefaultProcMount which uses the container runtime defaults for readonly paths and masked paths. This requires the ProcMountType feature flag to be enabled. Note that this field cannot be set when spec.os.name is windows. |  [optional] |
|**readOnlyRootFilesystem** | **Boolean** | Whether this container has a read-only root filesystem. Default is false. Note that this field cannot be set when spec.os.name is windows. |  [optional] |
|**runAsGroup** | **Long** | The GID to run the entrypoint of the container process. Uses runtime default if unset. May also be set in PodSecurityContext.  If set in both SecurityContext and PodSecurityContext, the value specified in SecurityContext takes precedence. Note that this field cannot be set when spec.os.name is windows. |  [optional] |
|**runAsNonRoot** | **Boolean** | Indicates that the container must run as a non-root user. If true, the Kubelet will validate the image at runtime to ensure that it does not run as UID 0 (root) and fail to start the container if it does. If unset or false, no such validation will be performed. May also be set in PodSecurityContext.  If set in both SecurityContext and PodSecurityContext, the value specified in SecurityContext takes precedence. |  [optional] |
|**runAsUser** | **Long** | The UID to run the entrypoint of the container process. Defaults to user specified in image metadata if unspecified. May also be set in PodSecurityContext.  If set in both SecurityContext and PodSecurityContext, the value specified in SecurityContext takes precedence. Note that this field cannot be set when spec.os.name is windows. |  [optional] |
|**seLinuxOptions** | [**V1SELinuxOptions**](V1SELinuxOptions.md) |  |  [optional] |
|**seccompProfile** | [**V1SeccompProfile**](V1SeccompProfile.md) |  |  [optional] |
|**windowsOptions** | [**V1WindowsSecurityContextOptions**](V1WindowsSecurityContextOptions.md) |  |  [optional] |



