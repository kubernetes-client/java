/*
Copyright 2025 The Kubernetes Authors.
Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at
http://www.apache.org/licenses/LICENSE-2.0
Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
*/
package io.kubernetes.client.openapi.models;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.kubernetes.client.openapi.models.V1ContainerPort;
import io.kubernetes.client.openapi.models.V1ContainerResizePolicy;
import io.kubernetes.client.openapi.models.V1ContainerRestartRule;
import io.kubernetes.client.openapi.models.V1EnvFromSource;
import io.kubernetes.client.openapi.models.V1EnvVar;
import io.kubernetes.client.openapi.models.V1Lifecycle;
import io.kubernetes.client.openapi.models.V1Probe;
import io.kubernetes.client.openapi.models.V1ResourceRequirements;
import io.kubernetes.client.openapi.models.V1SecurityContext;
import io.kubernetes.client.openapi.models.V1VolumeDevice;
import io.kubernetes.client.openapi.models.V1VolumeMount;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import io.kubernetes.client.openapi.JSON;

/**
 * An EphemeralContainer is a temporary container that you may add to an existing Pod for user-initiated activities such as debugging. Ephemeral containers have no resource or scheduling guarantees, and they will not be restarted when they exit or when a Pod is removed or restarted. The kubelet may evict a Pod if an ephemeral container causes the Pod to exceed its resource allocation.  To add an ephemeral container, use the ephemeralcontainers subresource of an existing Pod. Ephemeral containers may not be removed or restarted.
 */
@ApiModel(description = "An EphemeralContainer is a temporary container that you may add to an existing Pod for user-initiated activities such as debugging. Ephemeral containers have no resource or scheduling guarantees, and they will not be restarted when they exit or when a Pod is removed or restarted. The kubelet may evict a Pod if an ephemeral container causes the Pod to exceed its resource allocation.  To add an ephemeral container, use the ephemeralcontainers subresource of an existing Pod. Ephemeral containers may not be removed or restarted.")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-09-11T18:00:16.154662Z[Etc/UTC]", comments = "Generator version: 7.13.0")
public class V1EphemeralContainer {
  public static final String SERIALIZED_NAME_ARGS = "args";
  @SerializedName(SERIALIZED_NAME_ARGS)
  @jakarta.annotation.Nullable
  private List<String> args = new ArrayList<>();

  public static final String SERIALIZED_NAME_COMMAND = "command";
  @SerializedName(SERIALIZED_NAME_COMMAND)
  @jakarta.annotation.Nullable
  private List<String> command = new ArrayList<>();

  public static final String SERIALIZED_NAME_ENV = "env";
  @SerializedName(SERIALIZED_NAME_ENV)
  @jakarta.annotation.Nullable
  private List<V1EnvVar> env = new ArrayList<>();

  public static final String SERIALIZED_NAME_ENV_FROM = "envFrom";
  @SerializedName(SERIALIZED_NAME_ENV_FROM)
  @jakarta.annotation.Nullable
  private List<V1EnvFromSource> envFrom = new ArrayList<>();

  public static final String SERIALIZED_NAME_IMAGE = "image";
  @SerializedName(SERIALIZED_NAME_IMAGE)
  @jakarta.annotation.Nullable
  private String image;

  public static final String SERIALIZED_NAME_IMAGE_PULL_POLICY = "imagePullPolicy";
  @SerializedName(SERIALIZED_NAME_IMAGE_PULL_POLICY)
  @jakarta.annotation.Nullable
  private String imagePullPolicy;

  public static final String SERIALIZED_NAME_LIFECYCLE = "lifecycle";
  @SerializedName(SERIALIZED_NAME_LIFECYCLE)
  @jakarta.annotation.Nullable
  private V1Lifecycle lifecycle;

  public static final String SERIALIZED_NAME_LIVENESS_PROBE = "livenessProbe";
  @SerializedName(SERIALIZED_NAME_LIVENESS_PROBE)
  @jakarta.annotation.Nullable
  private V1Probe livenessProbe;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  @jakarta.annotation.Nonnull
  private String name;

  public static final String SERIALIZED_NAME_PORTS = "ports";
  @SerializedName(SERIALIZED_NAME_PORTS)
  @jakarta.annotation.Nullable
  private List<V1ContainerPort> ports = new ArrayList<>();

  public static final String SERIALIZED_NAME_READINESS_PROBE = "readinessProbe";
  @SerializedName(SERIALIZED_NAME_READINESS_PROBE)
  @jakarta.annotation.Nullable
  private V1Probe readinessProbe;

  public static final String SERIALIZED_NAME_RESIZE_POLICY = "resizePolicy";
  @SerializedName(SERIALIZED_NAME_RESIZE_POLICY)
  @jakarta.annotation.Nullable
  private List<V1ContainerResizePolicy> resizePolicy = new ArrayList<>();

  public static final String SERIALIZED_NAME_RESOURCES = "resources";
  @SerializedName(SERIALIZED_NAME_RESOURCES)
  @jakarta.annotation.Nullable
  private V1ResourceRequirements resources;

  public static final String SERIALIZED_NAME_RESTART_POLICY = "restartPolicy";
  @SerializedName(SERIALIZED_NAME_RESTART_POLICY)
  @jakarta.annotation.Nullable
  private String restartPolicy;

  public static final String SERIALIZED_NAME_RESTART_POLICY_RULES = "restartPolicyRules";
  @SerializedName(SERIALIZED_NAME_RESTART_POLICY_RULES)
  @jakarta.annotation.Nullable
  private List<V1ContainerRestartRule> restartPolicyRules = new ArrayList<>();

  public static final String SERIALIZED_NAME_SECURITY_CONTEXT = "securityContext";
  @SerializedName(SERIALIZED_NAME_SECURITY_CONTEXT)
  @jakarta.annotation.Nullable
  private V1SecurityContext securityContext;

  public static final String SERIALIZED_NAME_STARTUP_PROBE = "startupProbe";
  @SerializedName(SERIALIZED_NAME_STARTUP_PROBE)
  @jakarta.annotation.Nullable
  private V1Probe startupProbe;

  public static final String SERIALIZED_NAME_STDIN = "stdin";
  @SerializedName(SERIALIZED_NAME_STDIN)
  @jakarta.annotation.Nullable
  private Boolean stdin;

  public static final String SERIALIZED_NAME_STDIN_ONCE = "stdinOnce";
  @SerializedName(SERIALIZED_NAME_STDIN_ONCE)
  @jakarta.annotation.Nullable
  private Boolean stdinOnce;

  public static final String SERIALIZED_NAME_TARGET_CONTAINER_NAME = "targetContainerName";
  @SerializedName(SERIALIZED_NAME_TARGET_CONTAINER_NAME)
  @jakarta.annotation.Nullable
  private String targetContainerName;

  public static final String SERIALIZED_NAME_TERMINATION_MESSAGE_PATH = "terminationMessagePath";
  @SerializedName(SERIALIZED_NAME_TERMINATION_MESSAGE_PATH)
  @jakarta.annotation.Nullable
  private String terminationMessagePath;

  public static final String SERIALIZED_NAME_TERMINATION_MESSAGE_POLICY = "terminationMessagePolicy";
  @SerializedName(SERIALIZED_NAME_TERMINATION_MESSAGE_POLICY)
  @jakarta.annotation.Nullable
  private String terminationMessagePolicy;

  public static final String SERIALIZED_NAME_TTY = "tty";
  @SerializedName(SERIALIZED_NAME_TTY)
  @jakarta.annotation.Nullable
  private Boolean tty;

  public static final String SERIALIZED_NAME_VOLUME_DEVICES = "volumeDevices";
  @SerializedName(SERIALIZED_NAME_VOLUME_DEVICES)
  @jakarta.annotation.Nullable
  private List<V1VolumeDevice> volumeDevices = new ArrayList<>();

  public static final String SERIALIZED_NAME_VOLUME_MOUNTS = "volumeMounts";
  @SerializedName(SERIALIZED_NAME_VOLUME_MOUNTS)
  @jakarta.annotation.Nullable
  private List<V1VolumeMount> volumeMounts = new ArrayList<>();

  public static final String SERIALIZED_NAME_WORKING_DIR = "workingDir";
  @SerializedName(SERIALIZED_NAME_WORKING_DIR)
  @jakarta.annotation.Nullable
  private String workingDir;

  public V1EphemeralContainer() {
  }

  public V1EphemeralContainer args(@jakarta.annotation.Nullable List<String> args) {
    this.args = args;
    return this;
  }

  public V1EphemeralContainer addArgsItem(String argsItem) {
    if (this.args == null) {
      this.args = new ArrayList<>();
    }
    this.args.add(argsItem);
    return this;
  }

  /**
   * Arguments to the entrypoint. The image&#39;s CMD is used if this is not provided. Variable references $(VAR_NAME) are expanded using the container&#39;s environment. If a variable cannot be resolved, the reference in the input string will be unchanged. Double $$ are reduced to a single $, which allows for escaping the $(VAR_NAME) syntax: i.e. \&quot;$$(VAR_NAME)\&quot; will produce the string literal \&quot;$(VAR_NAME)\&quot;. Escaped references will never be expanded, regardless of whether the variable exists or not. Cannot be updated. More info: https://kubernetes.io/docs/tasks/inject-data-application/define-command-argument-container/#running-a-command-in-a-shell
   * @return args
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "Arguments to the entrypoint. The image's CMD is used if this is not provided. Variable references $(VAR_NAME) are expanded using the container's environment. If a variable cannot be resolved, the reference in the input string will be unchanged. Double $$ are reduced to a single $, which allows for escaping the $(VAR_NAME) syntax: i.e. \"$$(VAR_NAME)\" will produce the string literal \"$(VAR_NAME)\". Escaped references will never be expanded, regardless of whether the variable exists or not. Cannot be updated. More info: https://kubernetes.io/docs/tasks/inject-data-application/define-command-argument-container/#running-a-command-in-a-shell")
  public List<String> getArgs() {
    return args;
  }

  public void setArgs(@jakarta.annotation.Nullable List<String> args) {
    this.args = args;
  }


  public V1EphemeralContainer command(@jakarta.annotation.Nullable List<String> command) {
    this.command = command;
    return this;
  }

  public V1EphemeralContainer addCommandItem(String commandItem) {
    if (this.command == null) {
      this.command = new ArrayList<>();
    }
    this.command.add(commandItem);
    return this;
  }

  /**
   * Entrypoint array. Not executed within a shell. The image&#39;s ENTRYPOINT is used if this is not provided. Variable references $(VAR_NAME) are expanded using the container&#39;s environment. If a variable cannot be resolved, the reference in the input string will be unchanged. Double $$ are reduced to a single $, which allows for escaping the $(VAR_NAME) syntax: i.e. \&quot;$$(VAR_NAME)\&quot; will produce the string literal \&quot;$(VAR_NAME)\&quot;. Escaped references will never be expanded, regardless of whether the variable exists or not. Cannot be updated. More info: https://kubernetes.io/docs/tasks/inject-data-application/define-command-argument-container/#running-a-command-in-a-shell
   * @return command
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "Entrypoint array. Not executed within a shell. The image's ENTRYPOINT is used if this is not provided. Variable references $(VAR_NAME) are expanded using the container's environment. If a variable cannot be resolved, the reference in the input string will be unchanged. Double $$ are reduced to a single $, which allows for escaping the $(VAR_NAME) syntax: i.e. \"$$(VAR_NAME)\" will produce the string literal \"$(VAR_NAME)\". Escaped references will never be expanded, regardless of whether the variable exists or not. Cannot be updated. More info: https://kubernetes.io/docs/tasks/inject-data-application/define-command-argument-container/#running-a-command-in-a-shell")
  public List<String> getCommand() {
    return command;
  }

  public void setCommand(@jakarta.annotation.Nullable List<String> command) {
    this.command = command;
  }


  public V1EphemeralContainer env(@jakarta.annotation.Nullable List<V1EnvVar> env) {
    this.env = env;
    return this;
  }

  public V1EphemeralContainer addEnvItem(V1EnvVar envItem) {
    if (this.env == null) {
      this.env = new ArrayList<>();
    }
    this.env.add(envItem);
    return this;
  }

  /**
   * List of environment variables to set in the container. Cannot be updated.
   * @return env
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "List of environment variables to set in the container. Cannot be updated.")
  public List<V1EnvVar> getEnv() {
    return env;
  }

  public void setEnv(@jakarta.annotation.Nullable List<V1EnvVar> env) {
    this.env = env;
  }


  public V1EphemeralContainer envFrom(@jakarta.annotation.Nullable List<V1EnvFromSource> envFrom) {
    this.envFrom = envFrom;
    return this;
  }

  public V1EphemeralContainer addEnvFromItem(V1EnvFromSource envFromItem) {
    if (this.envFrom == null) {
      this.envFrom = new ArrayList<>();
    }
    this.envFrom.add(envFromItem);
    return this;
  }

  /**
   * List of sources to populate environment variables in the container. The keys defined within a source may consist of any printable ASCII characters except &#39;&#x3D;&#39;. When a key exists in multiple sources, the value associated with the last source will take precedence. Values defined by an Env with a duplicate key will take precedence. Cannot be updated.
   * @return envFrom
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "List of sources to populate environment variables in the container. The keys defined within a source may consist of any printable ASCII characters except '='. When a key exists in multiple sources, the value associated with the last source will take precedence. Values defined by an Env with a duplicate key will take precedence. Cannot be updated.")
  public List<V1EnvFromSource> getEnvFrom() {
    return envFrom;
  }

  public void setEnvFrom(@jakarta.annotation.Nullable List<V1EnvFromSource> envFrom) {
    this.envFrom = envFrom;
  }


  public V1EphemeralContainer image(@jakarta.annotation.Nullable String image) {
    this.image = image;
    return this;
  }

  /**
   * Container image name. More info: https://kubernetes.io/docs/concepts/containers/images
   * @return image
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "Container image name. More info: https://kubernetes.io/docs/concepts/containers/images")
  public String getImage() {
    return image;
  }

  public void setImage(@jakarta.annotation.Nullable String image) {
    this.image = image;
  }


  public V1EphemeralContainer imagePullPolicy(@jakarta.annotation.Nullable String imagePullPolicy) {
    this.imagePullPolicy = imagePullPolicy;
    return this;
  }

  /**
   * Image pull policy. One of Always, Never, IfNotPresent. Defaults to Always if :latest tag is specified, or IfNotPresent otherwise. Cannot be updated. More info: https://kubernetes.io/docs/concepts/containers/images#updating-images
   * @return imagePullPolicy
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "Image pull policy. One of Always, Never, IfNotPresent. Defaults to Always if :latest tag is specified, or IfNotPresent otherwise. Cannot be updated. More info: https://kubernetes.io/docs/concepts/containers/images#updating-images")
  public String getImagePullPolicy() {
    return imagePullPolicy;
  }

  public void setImagePullPolicy(@jakarta.annotation.Nullable String imagePullPolicy) {
    this.imagePullPolicy = imagePullPolicy;
  }


  public V1EphemeralContainer lifecycle(@jakarta.annotation.Nullable V1Lifecycle lifecycle) {
    this.lifecycle = lifecycle;
    return this;
  }

  /**
   * Get lifecycle
   * @return lifecycle
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  public V1Lifecycle getLifecycle() {
    return lifecycle;
  }

  public void setLifecycle(@jakarta.annotation.Nullable V1Lifecycle lifecycle) {
    this.lifecycle = lifecycle;
  }


  public V1EphemeralContainer livenessProbe(@jakarta.annotation.Nullable V1Probe livenessProbe) {
    this.livenessProbe = livenessProbe;
    return this;
  }

  /**
   * Get livenessProbe
   * @return livenessProbe
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  public V1Probe getLivenessProbe() {
    return livenessProbe;
  }

  public void setLivenessProbe(@jakarta.annotation.Nullable V1Probe livenessProbe) {
    this.livenessProbe = livenessProbe;
  }


  public V1EphemeralContainer name(@jakarta.annotation.Nonnull String name) {
    this.name = name;
    return this;
  }

  /**
   * Name of the ephemeral container specified as a DNS_LABEL. This name must be unique among all containers, init containers and ephemeral containers.
   * @return name
   */
  @jakarta.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Name of the ephemeral container specified as a DNS_LABEL. This name must be unique among all containers, init containers and ephemeral containers.")
  public String getName() {
    return name;
  }

  public void setName(@jakarta.annotation.Nonnull String name) {
    this.name = name;
  }


  public V1EphemeralContainer ports(@jakarta.annotation.Nullable List<V1ContainerPort> ports) {
    this.ports = ports;
    return this;
  }

  public V1EphemeralContainer addPortsItem(V1ContainerPort portsItem) {
    if (this.ports == null) {
      this.ports = new ArrayList<>();
    }
    this.ports.add(portsItem);
    return this;
  }

  /**
   * Ports are not allowed for ephemeral containers.
   * @return ports
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "Ports are not allowed for ephemeral containers.")
  public List<V1ContainerPort> getPorts() {
    return ports;
  }

  public void setPorts(@jakarta.annotation.Nullable List<V1ContainerPort> ports) {
    this.ports = ports;
  }


  public V1EphemeralContainer readinessProbe(@jakarta.annotation.Nullable V1Probe readinessProbe) {
    this.readinessProbe = readinessProbe;
    return this;
  }

  /**
   * Get readinessProbe
   * @return readinessProbe
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  public V1Probe getReadinessProbe() {
    return readinessProbe;
  }

  public void setReadinessProbe(@jakarta.annotation.Nullable V1Probe readinessProbe) {
    this.readinessProbe = readinessProbe;
  }


  public V1EphemeralContainer resizePolicy(@jakarta.annotation.Nullable List<V1ContainerResizePolicy> resizePolicy) {
    this.resizePolicy = resizePolicy;
    return this;
  }

  public V1EphemeralContainer addResizePolicyItem(V1ContainerResizePolicy resizePolicyItem) {
    if (this.resizePolicy == null) {
      this.resizePolicy = new ArrayList<>();
    }
    this.resizePolicy.add(resizePolicyItem);
    return this;
  }

  /**
   * Resources resize policy for the container.
   * @return resizePolicy
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "Resources resize policy for the container.")
  public List<V1ContainerResizePolicy> getResizePolicy() {
    return resizePolicy;
  }

  public void setResizePolicy(@jakarta.annotation.Nullable List<V1ContainerResizePolicy> resizePolicy) {
    this.resizePolicy = resizePolicy;
  }


  public V1EphemeralContainer resources(@jakarta.annotation.Nullable V1ResourceRequirements resources) {
    this.resources = resources;
    return this;
  }

  /**
   * Get resources
   * @return resources
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  public V1ResourceRequirements getResources() {
    return resources;
  }

  public void setResources(@jakarta.annotation.Nullable V1ResourceRequirements resources) {
    this.resources = resources;
  }


  public V1EphemeralContainer restartPolicy(@jakarta.annotation.Nullable String restartPolicy) {
    this.restartPolicy = restartPolicy;
    return this;
  }

  /**
   * Restart policy for the container to manage the restart behavior of each container within a pod. You cannot set this field on ephemeral containers.
   * @return restartPolicy
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "Restart policy for the container to manage the restart behavior of each container within a pod. You cannot set this field on ephemeral containers.")
  public String getRestartPolicy() {
    return restartPolicy;
  }

  public void setRestartPolicy(@jakarta.annotation.Nullable String restartPolicy) {
    this.restartPolicy = restartPolicy;
  }


  public V1EphemeralContainer restartPolicyRules(@jakarta.annotation.Nullable List<V1ContainerRestartRule> restartPolicyRules) {
    this.restartPolicyRules = restartPolicyRules;
    return this;
  }

  public V1EphemeralContainer addRestartPolicyRulesItem(V1ContainerRestartRule restartPolicyRulesItem) {
    if (this.restartPolicyRules == null) {
      this.restartPolicyRules = new ArrayList<>();
    }
    this.restartPolicyRules.add(restartPolicyRulesItem);
    return this;
  }

  /**
   * Represents a list of rules to be checked to determine if the container should be restarted on exit. You cannot set this field on ephemeral containers.
   * @return restartPolicyRules
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "Represents a list of rules to be checked to determine if the container should be restarted on exit. You cannot set this field on ephemeral containers.")
  public List<V1ContainerRestartRule> getRestartPolicyRules() {
    return restartPolicyRules;
  }

  public void setRestartPolicyRules(@jakarta.annotation.Nullable List<V1ContainerRestartRule> restartPolicyRules) {
    this.restartPolicyRules = restartPolicyRules;
  }


  public V1EphemeralContainer securityContext(@jakarta.annotation.Nullable V1SecurityContext securityContext) {
    this.securityContext = securityContext;
    return this;
  }

  /**
   * Get securityContext
   * @return securityContext
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  public V1SecurityContext getSecurityContext() {
    return securityContext;
  }

  public void setSecurityContext(@jakarta.annotation.Nullable V1SecurityContext securityContext) {
    this.securityContext = securityContext;
  }


  public V1EphemeralContainer startupProbe(@jakarta.annotation.Nullable V1Probe startupProbe) {
    this.startupProbe = startupProbe;
    return this;
  }

  /**
   * Get startupProbe
   * @return startupProbe
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  public V1Probe getStartupProbe() {
    return startupProbe;
  }

  public void setStartupProbe(@jakarta.annotation.Nullable V1Probe startupProbe) {
    this.startupProbe = startupProbe;
  }


  public V1EphemeralContainer stdin(@jakarta.annotation.Nullable Boolean stdin) {
    this.stdin = stdin;
    return this;
  }

  /**
   * Whether this container should allocate a buffer for stdin in the container runtime. If this is not set, reads from stdin in the container will always result in EOF. Default is false.
   * @return stdin
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "Whether this container should allocate a buffer for stdin in the container runtime. If this is not set, reads from stdin in the container will always result in EOF. Default is false.")
  public Boolean getStdin() {
    return stdin;
  }

  public void setStdin(@jakarta.annotation.Nullable Boolean stdin) {
    this.stdin = stdin;
  }


  public V1EphemeralContainer stdinOnce(@jakarta.annotation.Nullable Boolean stdinOnce) {
    this.stdinOnce = stdinOnce;
    return this;
  }

  /**
   * Whether the container runtime should close the stdin channel after it has been opened by a single attach. When stdin is true the stdin stream will remain open across multiple attach sessions. If stdinOnce is set to true, stdin is opened on container start, is empty until the first client attaches to stdin, and then remains open and accepts data until the client disconnects, at which time stdin is closed and remains closed until the container is restarted. If this flag is false, a container processes that reads from stdin will never receive an EOF. Default is false
   * @return stdinOnce
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "Whether the container runtime should close the stdin channel after it has been opened by a single attach. When stdin is true the stdin stream will remain open across multiple attach sessions. If stdinOnce is set to true, stdin is opened on container start, is empty until the first client attaches to stdin, and then remains open and accepts data until the client disconnects, at which time stdin is closed and remains closed until the container is restarted. If this flag is false, a container processes that reads from stdin will never receive an EOF. Default is false")
  public Boolean getStdinOnce() {
    return stdinOnce;
  }

  public void setStdinOnce(@jakarta.annotation.Nullable Boolean stdinOnce) {
    this.stdinOnce = stdinOnce;
  }


  public V1EphemeralContainer targetContainerName(@jakarta.annotation.Nullable String targetContainerName) {
    this.targetContainerName = targetContainerName;
    return this;
  }

  /**
   * If set, the name of the container from PodSpec that this ephemeral container targets. The ephemeral container will be run in the namespaces (IPC, PID, etc) of this container. If not set then the ephemeral container uses the namespaces configured in the Pod spec.  The container runtime must implement support for this feature. If the runtime does not support namespace targeting then the result of setting this field is undefined.
   * @return targetContainerName
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "If set, the name of the container from PodSpec that this ephemeral container targets. The ephemeral container will be run in the namespaces (IPC, PID, etc) of this container. If not set then the ephemeral container uses the namespaces configured in the Pod spec.  The container runtime must implement support for this feature. If the runtime does not support namespace targeting then the result of setting this field is undefined.")
  public String getTargetContainerName() {
    return targetContainerName;
  }

  public void setTargetContainerName(@jakarta.annotation.Nullable String targetContainerName) {
    this.targetContainerName = targetContainerName;
  }


  public V1EphemeralContainer terminationMessagePath(@jakarta.annotation.Nullable String terminationMessagePath) {
    this.terminationMessagePath = terminationMessagePath;
    return this;
  }

  /**
   * Optional: Path at which the file to which the container&#39;s termination message will be written is mounted into the container&#39;s filesystem. Message written is intended to be brief final status, such as an assertion failure message. Will be truncated by the node if greater than 4096 bytes. The total message length across all containers will be limited to 12kb. Defaults to /dev/termination-log. Cannot be updated.
   * @return terminationMessagePath
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "Optional: Path at which the file to which the container's termination message will be written is mounted into the container's filesystem. Message written is intended to be brief final status, such as an assertion failure message. Will be truncated by the node if greater than 4096 bytes. The total message length across all containers will be limited to 12kb. Defaults to /dev/termination-log. Cannot be updated.")
  public String getTerminationMessagePath() {
    return terminationMessagePath;
  }

  public void setTerminationMessagePath(@jakarta.annotation.Nullable String terminationMessagePath) {
    this.terminationMessagePath = terminationMessagePath;
  }


  public V1EphemeralContainer terminationMessagePolicy(@jakarta.annotation.Nullable String terminationMessagePolicy) {
    this.terminationMessagePolicy = terminationMessagePolicy;
    return this;
  }

  /**
   * Indicate how the termination message should be populated. File will use the contents of terminationMessagePath to populate the container status message on both success and failure. FallbackToLogsOnError will use the last chunk of container log output if the termination message file is empty and the container exited with an error. The log output is limited to 2048 bytes or 80 lines, whichever is smaller. Defaults to File. Cannot be updated.
   * @return terminationMessagePolicy
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "Indicate how the termination message should be populated. File will use the contents of terminationMessagePath to populate the container status message on both success and failure. FallbackToLogsOnError will use the last chunk of container log output if the termination message file is empty and the container exited with an error. The log output is limited to 2048 bytes or 80 lines, whichever is smaller. Defaults to File. Cannot be updated.")
  public String getTerminationMessagePolicy() {
    return terminationMessagePolicy;
  }

  public void setTerminationMessagePolicy(@jakarta.annotation.Nullable String terminationMessagePolicy) {
    this.terminationMessagePolicy = terminationMessagePolicy;
  }


  public V1EphemeralContainer tty(@jakarta.annotation.Nullable Boolean tty) {
    this.tty = tty;
    return this;
  }

  /**
   * Whether this container should allocate a TTY for itself, also requires &#39;stdin&#39; to be true. Default is false.
   * @return tty
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "Whether this container should allocate a TTY for itself, also requires 'stdin' to be true. Default is false.")
  public Boolean getTty() {
    return tty;
  }

  public void setTty(@jakarta.annotation.Nullable Boolean tty) {
    this.tty = tty;
  }


  public V1EphemeralContainer volumeDevices(@jakarta.annotation.Nullable List<V1VolumeDevice> volumeDevices) {
    this.volumeDevices = volumeDevices;
    return this;
  }

  public V1EphemeralContainer addVolumeDevicesItem(V1VolumeDevice volumeDevicesItem) {
    if (this.volumeDevices == null) {
      this.volumeDevices = new ArrayList<>();
    }
    this.volumeDevices.add(volumeDevicesItem);
    return this;
  }

  /**
   * volumeDevices is the list of block devices to be used by the container.
   * @return volumeDevices
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "volumeDevices is the list of block devices to be used by the container.")
  public List<V1VolumeDevice> getVolumeDevices() {
    return volumeDevices;
  }

  public void setVolumeDevices(@jakarta.annotation.Nullable List<V1VolumeDevice> volumeDevices) {
    this.volumeDevices = volumeDevices;
  }


  public V1EphemeralContainer volumeMounts(@jakarta.annotation.Nullable List<V1VolumeMount> volumeMounts) {
    this.volumeMounts = volumeMounts;
    return this;
  }

  public V1EphemeralContainer addVolumeMountsItem(V1VolumeMount volumeMountsItem) {
    if (this.volumeMounts == null) {
      this.volumeMounts = new ArrayList<>();
    }
    this.volumeMounts.add(volumeMountsItem);
    return this;
  }

  /**
   * Pod volumes to mount into the container&#39;s filesystem. Subpath mounts are not allowed for ephemeral containers. Cannot be updated.
   * @return volumeMounts
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "Pod volumes to mount into the container's filesystem. Subpath mounts are not allowed for ephemeral containers. Cannot be updated.")
  public List<V1VolumeMount> getVolumeMounts() {
    return volumeMounts;
  }

  public void setVolumeMounts(@jakarta.annotation.Nullable List<V1VolumeMount> volumeMounts) {
    this.volumeMounts = volumeMounts;
  }


  public V1EphemeralContainer workingDir(@jakarta.annotation.Nullable String workingDir) {
    this.workingDir = workingDir;
    return this;
  }

  /**
   * Container&#39;s working directory. If not specified, the container runtime&#39;s default will be used, which might be configured in the container image. Cannot be updated.
   * @return workingDir
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "Container's working directory. If not specified, the container runtime's default will be used, which might be configured in the container image. Cannot be updated.")
  public String getWorkingDir() {
    return workingDir;
  }

  public void setWorkingDir(@jakarta.annotation.Nullable String workingDir) {
    this.workingDir = workingDir;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1EphemeralContainer v1EphemeralContainer = (V1EphemeralContainer) o;
    return Objects.equals(this.args, v1EphemeralContainer.args) &&
        Objects.equals(this.command, v1EphemeralContainer.command) &&
        Objects.equals(this.env, v1EphemeralContainer.env) &&
        Objects.equals(this.envFrom, v1EphemeralContainer.envFrom) &&
        Objects.equals(this.image, v1EphemeralContainer.image) &&
        Objects.equals(this.imagePullPolicy, v1EphemeralContainer.imagePullPolicy) &&
        Objects.equals(this.lifecycle, v1EphemeralContainer.lifecycle) &&
        Objects.equals(this.livenessProbe, v1EphemeralContainer.livenessProbe) &&
        Objects.equals(this.name, v1EphemeralContainer.name) &&
        Objects.equals(this.ports, v1EphemeralContainer.ports) &&
        Objects.equals(this.readinessProbe, v1EphemeralContainer.readinessProbe) &&
        Objects.equals(this.resizePolicy, v1EphemeralContainer.resizePolicy) &&
        Objects.equals(this.resources, v1EphemeralContainer.resources) &&
        Objects.equals(this.restartPolicy, v1EphemeralContainer.restartPolicy) &&
        Objects.equals(this.restartPolicyRules, v1EphemeralContainer.restartPolicyRules) &&
        Objects.equals(this.securityContext, v1EphemeralContainer.securityContext) &&
        Objects.equals(this.startupProbe, v1EphemeralContainer.startupProbe) &&
        Objects.equals(this.stdin, v1EphemeralContainer.stdin) &&
        Objects.equals(this.stdinOnce, v1EphemeralContainer.stdinOnce) &&
        Objects.equals(this.targetContainerName, v1EphemeralContainer.targetContainerName) &&
        Objects.equals(this.terminationMessagePath, v1EphemeralContainer.terminationMessagePath) &&
        Objects.equals(this.terminationMessagePolicy, v1EphemeralContainer.terminationMessagePolicy) &&
        Objects.equals(this.tty, v1EphemeralContainer.tty) &&
        Objects.equals(this.volumeDevices, v1EphemeralContainer.volumeDevices) &&
        Objects.equals(this.volumeMounts, v1EphemeralContainer.volumeMounts) &&
        Objects.equals(this.workingDir, v1EphemeralContainer.workingDir);
  }

  @Override
  public int hashCode() {
    return Objects.hash(args, command, env, envFrom, image, imagePullPolicy, lifecycle, livenessProbe, name, ports, readinessProbe, resizePolicy, resources, restartPolicy, restartPolicyRules, securityContext, startupProbe, stdin, stdinOnce, targetContainerName, terminationMessagePath, terminationMessagePolicy, tty, volumeDevices, volumeMounts, workingDir);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1EphemeralContainer {\n");
    sb.append("    args: ").append(toIndentedString(args)).append("\n");
    sb.append("    command: ").append(toIndentedString(command)).append("\n");
    sb.append("    env: ").append(toIndentedString(env)).append("\n");
    sb.append("    envFrom: ").append(toIndentedString(envFrom)).append("\n");
    sb.append("    image: ").append(toIndentedString(image)).append("\n");
    sb.append("    imagePullPolicy: ").append(toIndentedString(imagePullPolicy)).append("\n");
    sb.append("    lifecycle: ").append(toIndentedString(lifecycle)).append("\n");
    sb.append("    livenessProbe: ").append(toIndentedString(livenessProbe)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    ports: ").append(toIndentedString(ports)).append("\n");
    sb.append("    readinessProbe: ").append(toIndentedString(readinessProbe)).append("\n");
    sb.append("    resizePolicy: ").append(toIndentedString(resizePolicy)).append("\n");
    sb.append("    resources: ").append(toIndentedString(resources)).append("\n");
    sb.append("    restartPolicy: ").append(toIndentedString(restartPolicy)).append("\n");
    sb.append("    restartPolicyRules: ").append(toIndentedString(restartPolicyRules)).append("\n");
    sb.append("    securityContext: ").append(toIndentedString(securityContext)).append("\n");
    sb.append("    startupProbe: ").append(toIndentedString(startupProbe)).append("\n");
    sb.append("    stdin: ").append(toIndentedString(stdin)).append("\n");
    sb.append("    stdinOnce: ").append(toIndentedString(stdinOnce)).append("\n");
    sb.append("    targetContainerName: ").append(toIndentedString(targetContainerName)).append("\n");
    sb.append("    terminationMessagePath: ").append(toIndentedString(terminationMessagePath)).append("\n");
    sb.append("    terminationMessagePolicy: ").append(toIndentedString(terminationMessagePolicy)).append("\n");
    sb.append("    tty: ").append(toIndentedString(tty)).append("\n");
    sb.append("    volumeDevices: ").append(toIndentedString(volumeDevices)).append("\n");
    sb.append("    volumeMounts: ").append(toIndentedString(volumeMounts)).append("\n");
    sb.append("    workingDir: ").append(toIndentedString(workingDir)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("args");
    openapiFields.add("command");
    openapiFields.add("env");
    openapiFields.add("envFrom");
    openapiFields.add("image");
    openapiFields.add("imagePullPolicy");
    openapiFields.add("lifecycle");
    openapiFields.add("livenessProbe");
    openapiFields.add("name");
    openapiFields.add("ports");
    openapiFields.add("readinessProbe");
    openapiFields.add("resizePolicy");
    openapiFields.add("resources");
    openapiFields.add("restartPolicy");
    openapiFields.add("restartPolicyRules");
    openapiFields.add("securityContext");
    openapiFields.add("startupProbe");
    openapiFields.add("stdin");
    openapiFields.add("stdinOnce");
    openapiFields.add("targetContainerName");
    openapiFields.add("terminationMessagePath");
    openapiFields.add("terminationMessagePolicy");
    openapiFields.add("tty");
    openapiFields.add("volumeDevices");
    openapiFields.add("volumeMounts");
    openapiFields.add("workingDir");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("name");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to V1EphemeralContainer
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!V1EphemeralContainer.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in V1EphemeralContainer is not found in the empty JSON string", V1EphemeralContainer.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!V1EphemeralContainer.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `V1EphemeralContainer` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : V1EphemeralContainer.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // ensure the optional json data is an array if present
      if (jsonObj.get("args") != null && !jsonObj.get("args").isJsonNull() && !jsonObj.get("args").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `args` to be an array in the JSON string but got `%s`", jsonObj.get("args").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("command") != null && !jsonObj.get("command").isJsonNull() && !jsonObj.get("command").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `command` to be an array in the JSON string but got `%s`", jsonObj.get("command").toString()));
      }
      if (jsonObj.get("env") != null && !jsonObj.get("env").isJsonNull()) {
        JsonArray jsonArrayenv = jsonObj.getAsJsonArray("env");
        if (jsonArrayenv != null) {
          // ensure the json data is an array
          if (!jsonObj.get("env").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `env` to be an array in the JSON string but got `%s`", jsonObj.get("env").toString()));
          }

          // validate the optional field `env` (array)
          for (int i = 0; i < jsonArrayenv.size(); i++) {
            V1EnvVar.validateJsonElement(jsonArrayenv.get(i));
          };
        }
      }
      if (jsonObj.get("envFrom") != null && !jsonObj.get("envFrom").isJsonNull()) {
        JsonArray jsonArrayenvFrom = jsonObj.getAsJsonArray("envFrom");
        if (jsonArrayenvFrom != null) {
          // ensure the json data is an array
          if (!jsonObj.get("envFrom").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `envFrom` to be an array in the JSON string but got `%s`", jsonObj.get("envFrom").toString()));
          }

          // validate the optional field `envFrom` (array)
          for (int i = 0; i < jsonArrayenvFrom.size(); i++) {
            V1EnvFromSource.validateJsonElement(jsonArrayenvFrom.get(i));
          };
        }
      }
      if ((jsonObj.get("image") != null && !jsonObj.get("image").isJsonNull()) && !jsonObj.get("image").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `image` to be a primitive type in the JSON string but got `%s`", jsonObj.get("image").toString()));
      }
      if ((jsonObj.get("imagePullPolicy") != null && !jsonObj.get("imagePullPolicy").isJsonNull()) && !jsonObj.get("imagePullPolicy").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `imagePullPolicy` to be a primitive type in the JSON string but got `%s`", jsonObj.get("imagePullPolicy").toString()));
      }
      // validate the optional field `lifecycle`
      if (jsonObj.get("lifecycle") != null && !jsonObj.get("lifecycle").isJsonNull()) {
        V1Lifecycle.validateJsonElement(jsonObj.get("lifecycle"));
      }
      // validate the optional field `livenessProbe`
      if (jsonObj.get("livenessProbe") != null && !jsonObj.get("livenessProbe").isJsonNull()) {
        V1Probe.validateJsonElement(jsonObj.get("livenessProbe"));
      }
      if (!jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if (jsonObj.get("ports") != null && !jsonObj.get("ports").isJsonNull()) {
        JsonArray jsonArrayports = jsonObj.getAsJsonArray("ports");
        if (jsonArrayports != null) {
          // ensure the json data is an array
          if (!jsonObj.get("ports").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `ports` to be an array in the JSON string but got `%s`", jsonObj.get("ports").toString()));
          }

          // validate the optional field `ports` (array)
          for (int i = 0; i < jsonArrayports.size(); i++) {
            V1ContainerPort.validateJsonElement(jsonArrayports.get(i));
          };
        }
      }
      // validate the optional field `readinessProbe`
      if (jsonObj.get("readinessProbe") != null && !jsonObj.get("readinessProbe").isJsonNull()) {
        V1Probe.validateJsonElement(jsonObj.get("readinessProbe"));
      }
      if (jsonObj.get("resizePolicy") != null && !jsonObj.get("resizePolicy").isJsonNull()) {
        JsonArray jsonArrayresizePolicy = jsonObj.getAsJsonArray("resizePolicy");
        if (jsonArrayresizePolicy != null) {
          // ensure the json data is an array
          if (!jsonObj.get("resizePolicy").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `resizePolicy` to be an array in the JSON string but got `%s`", jsonObj.get("resizePolicy").toString()));
          }

          // validate the optional field `resizePolicy` (array)
          for (int i = 0; i < jsonArrayresizePolicy.size(); i++) {
            V1ContainerResizePolicy.validateJsonElement(jsonArrayresizePolicy.get(i));
          };
        }
      }
      // validate the optional field `resources`
      if (jsonObj.get("resources") != null && !jsonObj.get("resources").isJsonNull()) {
        V1ResourceRequirements.validateJsonElement(jsonObj.get("resources"));
      }
      if ((jsonObj.get("restartPolicy") != null && !jsonObj.get("restartPolicy").isJsonNull()) && !jsonObj.get("restartPolicy").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `restartPolicy` to be a primitive type in the JSON string but got `%s`", jsonObj.get("restartPolicy").toString()));
      }
      if (jsonObj.get("restartPolicyRules") != null && !jsonObj.get("restartPolicyRules").isJsonNull()) {
        JsonArray jsonArrayrestartPolicyRules = jsonObj.getAsJsonArray("restartPolicyRules");
        if (jsonArrayrestartPolicyRules != null) {
          // ensure the json data is an array
          if (!jsonObj.get("restartPolicyRules").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `restartPolicyRules` to be an array in the JSON string but got `%s`", jsonObj.get("restartPolicyRules").toString()));
          }

          // validate the optional field `restartPolicyRules` (array)
          for (int i = 0; i < jsonArrayrestartPolicyRules.size(); i++) {
            V1ContainerRestartRule.validateJsonElement(jsonArrayrestartPolicyRules.get(i));
          };
        }
      }
      // validate the optional field `securityContext`
      if (jsonObj.get("securityContext") != null && !jsonObj.get("securityContext").isJsonNull()) {
        V1SecurityContext.validateJsonElement(jsonObj.get("securityContext"));
      }
      // validate the optional field `startupProbe`
      if (jsonObj.get("startupProbe") != null && !jsonObj.get("startupProbe").isJsonNull()) {
        V1Probe.validateJsonElement(jsonObj.get("startupProbe"));
      }
      if ((jsonObj.get("targetContainerName") != null && !jsonObj.get("targetContainerName").isJsonNull()) && !jsonObj.get("targetContainerName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `targetContainerName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("targetContainerName").toString()));
      }
      if ((jsonObj.get("terminationMessagePath") != null && !jsonObj.get("terminationMessagePath").isJsonNull()) && !jsonObj.get("terminationMessagePath").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `terminationMessagePath` to be a primitive type in the JSON string but got `%s`", jsonObj.get("terminationMessagePath").toString()));
      }
      if ((jsonObj.get("terminationMessagePolicy") != null && !jsonObj.get("terminationMessagePolicy").isJsonNull()) && !jsonObj.get("terminationMessagePolicy").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `terminationMessagePolicy` to be a primitive type in the JSON string but got `%s`", jsonObj.get("terminationMessagePolicy").toString()));
      }
      if (jsonObj.get("volumeDevices") != null && !jsonObj.get("volumeDevices").isJsonNull()) {
        JsonArray jsonArrayvolumeDevices = jsonObj.getAsJsonArray("volumeDevices");
        if (jsonArrayvolumeDevices != null) {
          // ensure the json data is an array
          if (!jsonObj.get("volumeDevices").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `volumeDevices` to be an array in the JSON string but got `%s`", jsonObj.get("volumeDevices").toString()));
          }

          // validate the optional field `volumeDevices` (array)
          for (int i = 0; i < jsonArrayvolumeDevices.size(); i++) {
            V1VolumeDevice.validateJsonElement(jsonArrayvolumeDevices.get(i));
          };
        }
      }
      if (jsonObj.get("volumeMounts") != null && !jsonObj.get("volumeMounts").isJsonNull()) {
        JsonArray jsonArrayvolumeMounts = jsonObj.getAsJsonArray("volumeMounts");
        if (jsonArrayvolumeMounts != null) {
          // ensure the json data is an array
          if (!jsonObj.get("volumeMounts").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `volumeMounts` to be an array in the JSON string but got `%s`", jsonObj.get("volumeMounts").toString()));
          }

          // validate the optional field `volumeMounts` (array)
          for (int i = 0; i < jsonArrayvolumeMounts.size(); i++) {
            V1VolumeMount.validateJsonElement(jsonArrayvolumeMounts.get(i));
          };
        }
      }
      if ((jsonObj.get("workingDir") != null && !jsonObj.get("workingDir").isJsonNull()) && !jsonObj.get("workingDir").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `workingDir` to be a primitive type in the JSON string but got `%s`", jsonObj.get("workingDir").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!V1EphemeralContainer.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'V1EphemeralContainer' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<V1EphemeralContainer> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(V1EphemeralContainer.class));

       return (TypeAdapter<T>) new TypeAdapter<V1EphemeralContainer>() {
           @Override
           public void write(JsonWriter out, V1EphemeralContainer value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public V1EphemeralContainer read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of V1EphemeralContainer given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of V1EphemeralContainer
   * @throws IOException if the JSON string is invalid with respect to V1EphemeralContainer
   */
  public static V1EphemeralContainer fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, V1EphemeralContainer.class);
  }

  /**
   * Convert an instance of V1EphemeralContainer to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
