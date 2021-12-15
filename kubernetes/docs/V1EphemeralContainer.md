

# V1EphemeralContainer

An EphemeralContainer is a temporary container that you may add to an existing Pod for user-initiated activities such as debugging. Ephemeral containers have no resource or scheduling guarantees, and they will not be restarted when they exit or when a Pod is removed or restarted. The kubelet may evict a Pod if an ephemeral container causes the Pod to exceed its resource allocation.  To add an ephemeral container, use the ephemeralcontainers subresource of an existing Pod. Ephemeral containers may not be removed or restarted.  This is a beta feature available on clusters that haven't disabled the EphemeralContainers feature gate.
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**args** | **List&lt;String&gt;** | Arguments to the entrypoint. The docker image&#39;s CMD is used if this is not provided. Variable references $(VAR_NAME) are expanded using the container&#39;s environment. If a variable cannot be resolved, the reference in the input string will be unchanged. Double $$ are reduced to a single $, which allows for escaping the $(VAR_NAME) syntax: i.e. \&quot;$$(VAR_NAME)\&quot; will produce the string literal \&quot;$(VAR_NAME)\&quot;. Escaped references will never be expanded, regardless of whether the variable exists or not. Cannot be updated. More info: https://kubernetes.io/docs/tasks/inject-data-application/define-command-argument-container/#running-a-command-in-a-shell |  [optional]
**command** | **List&lt;String&gt;** | Entrypoint array. Not executed within a shell. The docker image&#39;s ENTRYPOINT is used if this is not provided. Variable references $(VAR_NAME) are expanded using the container&#39;s environment. If a variable cannot be resolved, the reference in the input string will be unchanged. Double $$ are reduced to a single $, which allows for escaping the $(VAR_NAME) syntax: i.e. \&quot;$$(VAR_NAME)\&quot; will produce the string literal \&quot;$(VAR_NAME)\&quot;. Escaped references will never be expanded, regardless of whether the variable exists or not. Cannot be updated. More info: https://kubernetes.io/docs/tasks/inject-data-application/define-command-argument-container/#running-a-command-in-a-shell |  [optional]
**env** | [**List&lt;V1EnvVar&gt;**](V1EnvVar.md) | List of environment variables to set in the container. Cannot be updated. |  [optional]
**envFrom** | [**List&lt;V1EnvFromSource&gt;**](V1EnvFromSource.md) | List of sources to populate environment variables in the container. The keys defined within a source must be a C_IDENTIFIER. All invalid keys will be reported as an event when the container is starting. When a key exists in multiple sources, the value associated with the last source will take precedence. Values defined by an Env with a duplicate key will take precedence. Cannot be updated. |  [optional]
**image** | **String** | Docker image name. More info: https://kubernetes.io/docs/concepts/containers/images |  [optional]
**imagePullPolicy** | [**ImagePullPolicyEnum**](#ImagePullPolicyEnum) | Image pull policy. One of Always, Never, IfNotPresent. Defaults to Always if :latest tag is specified, or IfNotPresent otherwise. Cannot be updated. More info: https://kubernetes.io/docs/concepts/containers/images#updating-images  Possible enum values:  - &#x60;\&quot;Always\&quot;&#x60; means that kubelet always attempts to pull the latest image. Container will fail If the pull fails.  - &#x60;\&quot;IfNotPresent\&quot;&#x60; means that kubelet pulls if the image isn&#39;t present on disk. Container will fail if the image isn&#39;t present and the pull fails.  - &#x60;\&quot;Never\&quot;&#x60; means that kubelet never pulls an image, but only uses a local image. Container will fail if the image isn&#39;t present |  [optional]
**lifecycle** | [**V1Lifecycle**](V1Lifecycle.md) |  |  [optional]
**livenessProbe** | [**V1Probe**](V1Probe.md) |  |  [optional]
**name** | **String** | Name of the ephemeral container specified as a DNS_LABEL. This name must be unique among all containers, init containers and ephemeral containers. | 
**ports** | [**List&lt;V1ContainerPort&gt;**](V1ContainerPort.md) | Ports are not allowed for ephemeral containers. |  [optional]
**readinessProbe** | [**V1Probe**](V1Probe.md) |  |  [optional]
**resources** | [**V1ResourceRequirements**](V1ResourceRequirements.md) |  |  [optional]
**securityContext** | [**V1SecurityContext**](V1SecurityContext.md) |  |  [optional]
**startupProbe** | [**V1Probe**](V1Probe.md) |  |  [optional]
**stdin** | **Boolean** | Whether this container should allocate a buffer for stdin in the container runtime. If this is not set, reads from stdin in the container will always result in EOF. Default is false. |  [optional]
**stdinOnce** | **Boolean** | Whether the container runtime should close the stdin channel after it has been opened by a single attach. When stdin is true the stdin stream will remain open across multiple attach sessions. If stdinOnce is set to true, stdin is opened on container start, is empty until the first client attaches to stdin, and then remains open and accepts data until the client disconnects, at which time stdin is closed and remains closed until the container is restarted. If this flag is false, a container processes that reads from stdin will never receive an EOF. Default is false |  [optional]
**targetContainerName** | **String** | If set, the name of the container from PodSpec that this ephemeral container targets. The ephemeral container will be run in the namespaces (IPC, PID, etc) of this container. If not set then the ephemeral container uses the namespaces configured in the Pod spec.  The container runtime must implement support for this feature. If the runtime does not support namespace targeting then the result of setting this field is undefined. |  [optional]
**terminationMessagePath** | **String** | Optional: Path at which the file to which the container&#39;s termination message will be written is mounted into the container&#39;s filesystem. Message written is intended to be brief final status, such as an assertion failure message. Will be truncated by the node if greater than 4096 bytes. The total message length across all containers will be limited to 12kb. Defaults to /dev/termination-log. Cannot be updated. |  [optional]
**terminationMessagePolicy** | [**TerminationMessagePolicyEnum**](#TerminationMessagePolicyEnum) | Indicate how the termination message should be populated. File will use the contents of terminationMessagePath to populate the container status message on both success and failure. FallbackToLogsOnError will use the last chunk of container log output if the termination message file is empty and the container exited with an error. The log output is limited to 2048 bytes or 80 lines, whichever is smaller. Defaults to File. Cannot be updated.  Possible enum values:  - &#x60;\&quot;FallbackToLogsOnError\&quot;&#x60; will read the most recent contents of the container logs for the container status message when the container exits with an error and the terminationMessagePath has no contents.  - &#x60;\&quot;File\&quot;&#x60; is the default behavior and will set the container status message to the contents of the container&#39;s terminationMessagePath when the container exits. |  [optional]
**tty** | **Boolean** | Whether this container should allocate a TTY for itself, also requires &#39;stdin&#39; to be true. Default is false. |  [optional]
**volumeDevices** | [**List&lt;V1VolumeDevice&gt;**](V1VolumeDevice.md) | volumeDevices is the list of block devices to be used by the container. |  [optional]
**volumeMounts** | [**List&lt;V1VolumeMount&gt;**](V1VolumeMount.md) | Pod volumes to mount into the container&#39;s filesystem. Subpath mounts are not allowed for ephemeral containers. Cannot be updated. |  [optional]
**workingDir** | **String** | Container&#39;s working directory. If not specified, the container runtime&#39;s default will be used, which might be configured in the container image. Cannot be updated. |  [optional]



## Enum: ImagePullPolicyEnum

Name | Value
---- | -----
ALWAYS | &quot;Always&quot;
IFNOTPRESENT | &quot;IfNotPresent&quot;
NEVER | &quot;Never&quot;



## Enum: TerminationMessagePolicyEnum

Name | Value
---- | -----
FALLBACKTOLOGSONERROR | &quot;FallbackToLogsOnError&quot;
FILE | &quot;File&quot;



