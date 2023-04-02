/*
Copyright 2020 The Kubernetes Authors.
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
package com.coreos.monitoring.models;

import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/** A single application container that you want to run within a pod. */
@ApiModel(description = "A single application container that you want to run within a pod.")
@javax.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    date = "2020-08-31T19:41:55.826Z[Etc/UTC]")
public class V1ThanosRulerSpecContainers {
  public static final String SERIALIZED_NAME_ARGS = "args";

  @SerializedName(SERIALIZED_NAME_ARGS)
  private List<String> args = null;

  public static final String SERIALIZED_NAME_COMMAND = "command";

  @SerializedName(SERIALIZED_NAME_COMMAND)
  private List<String> command = null;

  public static final String SERIALIZED_NAME_ENV = "env";

  @SerializedName(SERIALIZED_NAME_ENV)
  private List<V1ThanosRulerSpecEnv> env = null;

  public static final String SERIALIZED_NAME_ENV_FROM = "envFrom";

  @SerializedName(SERIALIZED_NAME_ENV_FROM)
  private List<V1ThanosRulerSpecEnvFrom> envFrom = null;

  public static final String SERIALIZED_NAME_IMAGE = "image";

  @SerializedName(SERIALIZED_NAME_IMAGE)
  private String image;

  public static final String SERIALIZED_NAME_IMAGE_PULL_POLICY = "imagePullPolicy";

  @SerializedName(SERIALIZED_NAME_IMAGE_PULL_POLICY)
  private String imagePullPolicy;

  public static final String SERIALIZED_NAME_LIFECYCLE = "lifecycle";

  @SerializedName(SERIALIZED_NAME_LIFECYCLE)
  private V1ThanosRulerSpecLifecycle lifecycle;

  public static final String SERIALIZED_NAME_LIVENESS_PROBE = "livenessProbe";

  @SerializedName(SERIALIZED_NAME_LIVENESS_PROBE)
  private V1ThanosRulerSpecLivenessProbe livenessProbe;

  public static final String SERIALIZED_NAME_NAME = "name";

  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_PORTS = "ports";

  @SerializedName(SERIALIZED_NAME_PORTS)
  private List<V1ThanosRulerSpecPorts> ports = null;

  public static final String SERIALIZED_NAME_READINESS_PROBE = "readinessProbe";

  @SerializedName(SERIALIZED_NAME_READINESS_PROBE)
  private V1ThanosRulerSpecReadinessProbe readinessProbe;

  public static final String SERIALIZED_NAME_RESOURCES = "resources";

  @SerializedName(SERIALIZED_NAME_RESOURCES)
  private V1ThanosRulerSpecResources resources;

  public static final String SERIALIZED_NAME_SECURITY_CONTEXT = "securityContext";

  @SerializedName(SERIALIZED_NAME_SECURITY_CONTEXT)
  private V1ThanosRulerSpecSecurityContext securityContext;

  public static final String SERIALIZED_NAME_STARTUP_PROBE = "startupProbe";

  @SerializedName(SERIALIZED_NAME_STARTUP_PROBE)
  private V1ThanosRulerSpecStartupProbe startupProbe;

  public static final String SERIALIZED_NAME_STDIN = "stdin";

  @SerializedName(SERIALIZED_NAME_STDIN)
  private Boolean stdin;

  public static final String SERIALIZED_NAME_STDIN_ONCE = "stdinOnce";

  @SerializedName(SERIALIZED_NAME_STDIN_ONCE)
  private Boolean stdinOnce;

  public static final String SERIALIZED_NAME_TERMINATION_MESSAGE_PATH = "terminationMessagePath";

  @SerializedName(SERIALIZED_NAME_TERMINATION_MESSAGE_PATH)
  private String terminationMessagePath;

  public static final String SERIALIZED_NAME_TERMINATION_MESSAGE_POLICY =
      "terminationMessagePolicy";

  @SerializedName(SERIALIZED_NAME_TERMINATION_MESSAGE_POLICY)
  private String terminationMessagePolicy;

  public static final String SERIALIZED_NAME_TTY = "tty";

  @SerializedName(SERIALIZED_NAME_TTY)
  private Boolean tty;

  public static final String SERIALIZED_NAME_VOLUME_DEVICES = "volumeDevices";

  @SerializedName(SERIALIZED_NAME_VOLUME_DEVICES)
  private List<V1ThanosRulerSpecVolumeDevices> volumeDevices = null;

  public static final String SERIALIZED_NAME_VOLUME_MOUNTS = "volumeMounts";

  @SerializedName(SERIALIZED_NAME_VOLUME_MOUNTS)
  private List<V1ThanosRulerSpecVolumeMounts> volumeMounts = null;

  public static final String SERIALIZED_NAME_WORKING_DIR = "workingDir";

  @SerializedName(SERIALIZED_NAME_WORKING_DIR)
  private String workingDir;

  public V1ThanosRulerSpecContainers args(List<String> args) {

    this.args = args;
    return this;
  }

  public V1ThanosRulerSpecContainers addArgsItem(String argsItem) {
    if (this.args == null) {
      this.args = new ArrayList<String>();
    }
    this.args.add(argsItem);
    return this;
  }

  /**
   * Arguments to the entrypoint. The docker image&#39;s CMD is used if this is not provided.
   * Variable references $(VAR_NAME) are expanded using the container&#39;s environment. If a
   * variable cannot be resolved, the reference in the input string will be unchanged. The
   * $(VAR_NAME) syntax can be escaped with a double $$, ie: $$(VAR_NAME). Escaped references will
   * never be expanded, regardless of whether the variable exists or not. Cannot be updated. More
   * info:
   * https://kubernetes.io/docs/tasks/inject-data-application/define-command-argument-container/#running-a-command-in-a-shell
   *
   * @return args
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "Arguments to the entrypoint. The docker image's CMD is used if this is not provided. Variable references $(VAR_NAME) are expanded using the container's environment. If a variable cannot be resolved, the reference in the input string will be unchanged. The $(VAR_NAME) syntax can be escaped with a double $$, ie: $$(VAR_NAME). Escaped references will never be expanded, regardless of whether the variable exists or not. Cannot be updated. More info: https://kubernetes.io/docs/tasks/inject-data-application/define-command-argument-container/#running-a-command-in-a-shell")
  public List<String> getArgs() {
    return args;
  }

  public void setArgs(List<String> args) {
    this.args = args;
  }

  public V1ThanosRulerSpecContainers command(List<String> command) {

    this.command = command;
    return this;
  }

  public V1ThanosRulerSpecContainers addCommandItem(String commandItem) {
    if (this.command == null) {
      this.command = new ArrayList<String>();
    }
    this.command.add(commandItem);
    return this;
  }

  /**
   * Entrypoint array. Not executed within a shell. The docker image&#39;s ENTRYPOINT is used if
   * this is not provided. Variable references $(VAR_NAME) are expanded using the container&#39;s
   * environment. If a variable cannot be resolved, the reference in the input string will be
   * unchanged. The $(VAR_NAME) syntax can be escaped with a double $$, ie: $$(VAR_NAME). Escaped
   * references will never be expanded, regardless of whether the variable exists or not. Cannot be
   * updated. More info:
   * https://kubernetes.io/docs/tasks/inject-data-application/define-command-argument-container/#running-a-command-in-a-shell
   *
   * @return command
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "Entrypoint array. Not executed within a shell. The docker image's ENTRYPOINT is used if this is not provided. Variable references $(VAR_NAME) are expanded using the container's environment. If a variable cannot be resolved, the reference in the input string will be unchanged. The $(VAR_NAME) syntax can be escaped with a double $$, ie: $$(VAR_NAME). Escaped references will never be expanded, regardless of whether the variable exists or not. Cannot be updated. More info: https://kubernetes.io/docs/tasks/inject-data-application/define-command-argument-container/#running-a-command-in-a-shell")
  public List<String> getCommand() {
    return command;
  }

  public void setCommand(List<String> command) {
    this.command = command;
  }

  public V1ThanosRulerSpecContainers env(List<V1ThanosRulerSpecEnv> env) {

    this.env = env;
    return this;
  }

  public V1ThanosRulerSpecContainers addEnvItem(V1ThanosRulerSpecEnv envItem) {
    if (this.env == null) {
      this.env = new ArrayList<V1ThanosRulerSpecEnv>();
    }
    this.env.add(envItem);
    return this;
  }

  /**
   * List of environment variables to set in the container. Cannot be updated.
   *
   * @return env
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value = "List of environment variables to set in the container. Cannot be updated.")
  public List<V1ThanosRulerSpecEnv> getEnv() {
    return env;
  }

  public void setEnv(List<V1ThanosRulerSpecEnv> env) {
    this.env = env;
  }

  public V1ThanosRulerSpecContainers envFrom(List<V1ThanosRulerSpecEnvFrom> envFrom) {

    this.envFrom = envFrom;
    return this;
  }

  public V1ThanosRulerSpecContainers addEnvFromItem(V1ThanosRulerSpecEnvFrom envFromItem) {
    if (this.envFrom == null) {
      this.envFrom = new ArrayList<V1ThanosRulerSpecEnvFrom>();
    }
    this.envFrom.add(envFromItem);
    return this;
  }

  /**
   * List of sources to populate environment variables in the container. The keys defined within a
   * source must be a C_IDENTIFIER. All invalid keys will be reported as an event when the container
   * is starting. When a key exists in multiple sources, the value associated with the last source
   * will take precedence. Values defined by an Env with a duplicate key will take precedence.
   * Cannot be updated.
   *
   * @return envFrom
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "List of sources to populate environment variables in the container. The keys defined within a source must be a C_IDENTIFIER. All invalid keys will be reported as an event when the container is starting. When a key exists in multiple sources, the value associated with the last source will take precedence. Values defined by an Env with a duplicate key will take precedence. Cannot be updated.")
  public List<V1ThanosRulerSpecEnvFrom> getEnvFrom() {
    return envFrom;
  }

  public void setEnvFrom(List<V1ThanosRulerSpecEnvFrom> envFrom) {
    this.envFrom = envFrom;
  }

  public V1ThanosRulerSpecContainers image(String image) {

    this.image = image;
    return this;
  }

  /**
   * Docker image name. More info: https://kubernetes.io/docs/concepts/containers/images This field
   * is optional to allow higher level config management to default or override container images in
   * workload controllers like Deployments and StatefulSets.
   *
   * @return image
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "Docker image name. More info: https://kubernetes.io/docs/concepts/containers/images This field is optional to allow higher level config management to default or override container images in workload controllers like Deployments and StatefulSets.")
  public String getImage() {
    return image;
  }

  public void setImage(String image) {
    this.image = image;
  }

  public V1ThanosRulerSpecContainers imagePullPolicy(String imagePullPolicy) {

    this.imagePullPolicy = imagePullPolicy;
    return this;
  }

  /**
   * Image pull policy. One of Always, Never, IfNotPresent. Defaults to Always if :latest tag is
   * specified, or IfNotPresent otherwise. Cannot be updated. More info:
   * https://kubernetes.io/docs/concepts/containers/images#updating-images
   *
   * @return imagePullPolicy
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "Image pull policy. One of Always, Never, IfNotPresent. Defaults to Always if :latest tag is specified, or IfNotPresent otherwise. Cannot be updated. More info: https://kubernetes.io/docs/concepts/containers/images#updating-images")
  public String getImagePullPolicy() {
    return imagePullPolicy;
  }

  public void setImagePullPolicy(String imagePullPolicy) {
    this.imagePullPolicy = imagePullPolicy;
  }

  public V1ThanosRulerSpecContainers lifecycle(V1ThanosRulerSpecLifecycle lifecycle) {

    this.lifecycle = lifecycle;
    return this;
  }

  /**
   * Get lifecycle
   *
   * @return lifecycle
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  public V1ThanosRulerSpecLifecycle getLifecycle() {
    return lifecycle;
  }

  public void setLifecycle(V1ThanosRulerSpecLifecycle lifecycle) {
    this.lifecycle = lifecycle;
  }

  public V1ThanosRulerSpecContainers livenessProbe(V1ThanosRulerSpecLivenessProbe livenessProbe) {

    this.livenessProbe = livenessProbe;
    return this;
  }

  /**
   * Get livenessProbe
   *
   * @return livenessProbe
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  public V1ThanosRulerSpecLivenessProbe getLivenessProbe() {
    return livenessProbe;
  }

  public void setLivenessProbe(V1ThanosRulerSpecLivenessProbe livenessProbe) {
    this.livenessProbe = livenessProbe;
  }

  public V1ThanosRulerSpecContainers name(String name) {

    this.name = name;
    return this;
  }

  /**
   * Name of the container specified as a DNS_LABEL. Each container in a pod must have a unique name
   * (DNS_LABEL). Cannot be updated.
   *
   * @return name
   */
  @ApiModelProperty(
      required = true,
      value =
          "Name of the container specified as a DNS_LABEL. Each container in a pod must have a unique name (DNS_LABEL). Cannot be updated.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public V1ThanosRulerSpecContainers ports(List<V1ThanosRulerSpecPorts> ports) {

    this.ports = ports;
    return this;
  }

  public V1ThanosRulerSpecContainers addPortsItem(V1ThanosRulerSpecPorts portsItem) {
    if (this.ports == null) {
      this.ports = new ArrayList<V1ThanosRulerSpecPorts>();
    }
    this.ports.add(portsItem);
    return this;
  }

  /**
   * List of ports to expose from the container. Exposing a port here gives the system additional
   * information about the network connections a container uses, but is primarily informational. Not
   * specifying a port here DOES NOT prevent that port from being exposed. Any port which is
   * listening on the default \&quot;0.0.0.0\&quot; address inside a container will be accessible
   * from the network. Cannot be updated.
   *
   * @return ports
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "List of ports to expose from the container. Exposing a port here gives the system additional information about the network connections a container uses, but is primarily informational. Not specifying a port here DOES NOT prevent that port from being exposed. Any port which is listening on the default \"0.0.0.0\" address inside a container will be accessible from the network. Cannot be updated.")
  public List<V1ThanosRulerSpecPorts> getPorts() {
    return ports;
  }

  public void setPorts(List<V1ThanosRulerSpecPorts> ports) {
    this.ports = ports;
  }

  public V1ThanosRulerSpecContainers readinessProbe(
      V1ThanosRulerSpecReadinessProbe readinessProbe) {

    this.readinessProbe = readinessProbe;
    return this;
  }

  /**
   * Get readinessProbe
   *
   * @return readinessProbe
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  public V1ThanosRulerSpecReadinessProbe getReadinessProbe() {
    return readinessProbe;
  }

  public void setReadinessProbe(V1ThanosRulerSpecReadinessProbe readinessProbe) {
    this.readinessProbe = readinessProbe;
  }

  public V1ThanosRulerSpecContainers resources(V1ThanosRulerSpecResources resources) {

    this.resources = resources;
    return this;
  }

  /**
   * Get resources
   *
   * @return resources
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  public V1ThanosRulerSpecResources getResources() {
    return resources;
  }

  public void setResources(V1ThanosRulerSpecResources resources) {
    this.resources = resources;
  }

  public V1ThanosRulerSpecContainers securityContext(
      V1ThanosRulerSpecSecurityContext securityContext) {

    this.securityContext = securityContext;
    return this;
  }

  /**
   * Get securityContext
   *
   * @return securityContext
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  public V1ThanosRulerSpecSecurityContext getSecurityContext() {
    return securityContext;
  }

  public void setSecurityContext(V1ThanosRulerSpecSecurityContext securityContext) {
    this.securityContext = securityContext;
  }

  public V1ThanosRulerSpecContainers startupProbe(V1ThanosRulerSpecStartupProbe startupProbe) {

    this.startupProbe = startupProbe;
    return this;
  }

  /**
   * Get startupProbe
   *
   * @return startupProbe
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  public V1ThanosRulerSpecStartupProbe getStartupProbe() {
    return startupProbe;
  }

  public void setStartupProbe(V1ThanosRulerSpecStartupProbe startupProbe) {
    this.startupProbe = startupProbe;
  }

  public V1ThanosRulerSpecContainers stdin(Boolean stdin) {

    this.stdin = stdin;
    return this;
  }

  /**
   * Whether this container should allocate a buffer for stdin in the container runtime. If this is
   * not set, reads from stdin in the container will always result in EOF. Default is false.
   *
   * @return stdin
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "Whether this container should allocate a buffer for stdin in the container runtime. If this is not set, reads from stdin in the container will always result in EOF. Default is false.")
  public Boolean getStdin() {
    return stdin;
  }

  public void setStdin(Boolean stdin) {
    this.stdin = stdin;
  }

  public V1ThanosRulerSpecContainers stdinOnce(Boolean stdinOnce) {

    this.stdinOnce = stdinOnce;
    return this;
  }

  /**
   * Whether the container runtime should close the stdin channel after it has been opened by a
   * single attach. When stdin is true the stdin stream will remain open across multiple attach
   * sessions. If stdinOnce is set to true, stdin is opened on container start, is empty until the
   * first client attaches to stdin, and then remains open and accepts data until the client
   * disconnects, at which time stdin is closed and remains closed until the container is restarted.
   * If this flag is false, a container processes that reads from stdin will never receive an EOF.
   * Default is false
   *
   * @return stdinOnce
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "Whether the container runtime should close the stdin channel after it has been opened by a single attach. When stdin is true the stdin stream will remain open across multiple attach sessions. If stdinOnce is set to true, stdin is opened on container start, is empty until the first client attaches to stdin, and then remains open and accepts data until the client disconnects, at which time stdin is closed and remains closed until the container is restarted. If this flag is false, a container processes that reads from stdin will never receive an EOF. Default is false")
  public Boolean getStdinOnce() {
    return stdinOnce;
  }

  public void setStdinOnce(Boolean stdinOnce) {
    this.stdinOnce = stdinOnce;
  }

  public V1ThanosRulerSpecContainers terminationMessagePath(String terminationMessagePath) {

    this.terminationMessagePath = terminationMessagePath;
    return this;
  }

  /**
   * Optional: Path at which the file to which the container&#39;s termination message will be
   * written is mounted into the container&#39;s filesystem. Message written is intended to be brief
   * final status, such as an assertion failure message. Will be truncated by the node if greater
   * than 4096 bytes. The total message length across all containers will be limited to 12kb.
   * Defaults to /dev/termination-log. Cannot be updated.
   *
   * @return terminationMessagePath
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "Optional: Path at which the file to which the container's termination message will be written is mounted into the container's filesystem. Message written is intended to be brief final status, such as an assertion failure message. Will be truncated by the node if greater than 4096 bytes. The total message length across all containers will be limited to 12kb. Defaults to /dev/termination-log. Cannot be updated.")
  public String getTerminationMessagePath() {
    return terminationMessagePath;
  }

  public void setTerminationMessagePath(String terminationMessagePath) {
    this.terminationMessagePath = terminationMessagePath;
  }

  public V1ThanosRulerSpecContainers terminationMessagePolicy(String terminationMessagePolicy) {

    this.terminationMessagePolicy = terminationMessagePolicy;
    return this;
  }

  /**
   * Indicate how the termination message should be populated. File will use the contents of
   * terminationMessagePath to populate the container status message on both success and failure.
   * FallbackToLogsOnError will use the last chunk of container log output if the termination
   * message file is empty and the container exited with an error. The log output is limited to 2048
   * bytes or 80 lines, whichever is smaller. Defaults to File. Cannot be updated.
   *
   * @return terminationMessagePolicy
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "Indicate how the termination message should be populated. File will use the contents of terminationMessagePath to populate the container status message on both success and failure. FallbackToLogsOnError will use the last chunk of container log output if the termination message file is empty and the container exited with an error. The log output is limited to 2048 bytes or 80 lines, whichever is smaller. Defaults to File. Cannot be updated.")
  public String getTerminationMessagePolicy() {
    return terminationMessagePolicy;
  }

  public void setTerminationMessagePolicy(String terminationMessagePolicy) {
    this.terminationMessagePolicy = terminationMessagePolicy;
  }

  public V1ThanosRulerSpecContainers tty(Boolean tty) {

    this.tty = tty;
    return this;
  }

  /**
   * Whether this container should allocate a TTY for itself, also requires &#39;stdin&#39; to be
   * true. Default is false.
   *
   * @return tty
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "Whether this container should allocate a TTY for itself, also requires 'stdin' to be true. Default is false.")
  public Boolean getTty() {
    return tty;
  }

  public void setTty(Boolean tty) {
    this.tty = tty;
  }

  public V1ThanosRulerSpecContainers volumeDevices(
      List<V1ThanosRulerSpecVolumeDevices> volumeDevices) {

    this.volumeDevices = volumeDevices;
    return this;
  }

  public V1ThanosRulerSpecContainers addVolumeDevicesItem(
      V1ThanosRulerSpecVolumeDevices volumeDevicesItem) {
    if (this.volumeDevices == null) {
      this.volumeDevices = new ArrayList<V1ThanosRulerSpecVolumeDevices>();
    }
    this.volumeDevices.add(volumeDevicesItem);
    return this;
  }

  /**
   * volumeDevices is the list of block devices to be used by the container. This is a beta feature.
   *
   * @return volumeDevices
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "volumeDevices is the list of block devices to be used by the container. This is a beta feature.")
  public List<V1ThanosRulerSpecVolumeDevices> getVolumeDevices() {
    return volumeDevices;
  }

  public void setVolumeDevices(List<V1ThanosRulerSpecVolumeDevices> volumeDevices) {
    this.volumeDevices = volumeDevices;
  }

  public V1ThanosRulerSpecContainers volumeMounts(
      List<V1ThanosRulerSpecVolumeMounts> volumeMounts) {

    this.volumeMounts = volumeMounts;
    return this;
  }

  public V1ThanosRulerSpecContainers addVolumeMountsItem(
      V1ThanosRulerSpecVolumeMounts volumeMountsItem) {
    if (this.volumeMounts == null) {
      this.volumeMounts = new ArrayList<V1ThanosRulerSpecVolumeMounts>();
    }
    this.volumeMounts.add(volumeMountsItem);
    return this;
  }

  /**
   * Pod volumes to mount into the container&#39;s filesystem. Cannot be updated.
   *
   * @return volumeMounts
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value = "Pod volumes to mount into the container's filesystem. Cannot be updated.")
  public List<V1ThanosRulerSpecVolumeMounts> getVolumeMounts() {
    return volumeMounts;
  }

  public void setVolumeMounts(List<V1ThanosRulerSpecVolumeMounts> volumeMounts) {
    this.volumeMounts = volumeMounts;
  }

  public V1ThanosRulerSpecContainers workingDir(String workingDir) {

    this.workingDir = workingDir;
    return this;
  }

  /**
   * Container&#39;s working directory. If not specified, the container runtime&#39;s default will
   * be used, which might be configured in the container image. Cannot be updated.
   *
   * @return workingDir
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "Container's working directory. If not specified, the container runtime's default will be used, which might be configured in the container image. Cannot be updated.")
  public String getWorkingDir() {
    return workingDir;
  }

  public void setWorkingDir(String workingDir) {
    this.workingDir = workingDir;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1ThanosRulerSpecContainers v1ThanosRulerSpecContainers = (V1ThanosRulerSpecContainers) o;
    return Objects.equals(this.args, v1ThanosRulerSpecContainers.args)
        && Objects.equals(this.command, v1ThanosRulerSpecContainers.command)
        && Objects.equals(this.env, v1ThanosRulerSpecContainers.env)
        && Objects.equals(this.envFrom, v1ThanosRulerSpecContainers.envFrom)
        && Objects.equals(this.image, v1ThanosRulerSpecContainers.image)
        && Objects.equals(this.imagePullPolicy, v1ThanosRulerSpecContainers.imagePullPolicy)
        && Objects.equals(this.lifecycle, v1ThanosRulerSpecContainers.lifecycle)
        && Objects.equals(this.livenessProbe, v1ThanosRulerSpecContainers.livenessProbe)
        && Objects.equals(this.name, v1ThanosRulerSpecContainers.name)
        && Objects.equals(this.ports, v1ThanosRulerSpecContainers.ports)
        && Objects.equals(this.readinessProbe, v1ThanosRulerSpecContainers.readinessProbe)
        && Objects.equals(this.resources, v1ThanosRulerSpecContainers.resources)
        && Objects.equals(this.securityContext, v1ThanosRulerSpecContainers.securityContext)
        && Objects.equals(this.startupProbe, v1ThanosRulerSpecContainers.startupProbe)
        && Objects.equals(this.stdin, v1ThanosRulerSpecContainers.stdin)
        && Objects.equals(this.stdinOnce, v1ThanosRulerSpecContainers.stdinOnce)
        && Objects.equals(
            this.terminationMessagePath, v1ThanosRulerSpecContainers.terminationMessagePath)
        && Objects.equals(
            this.terminationMessagePolicy, v1ThanosRulerSpecContainers.terminationMessagePolicy)
        && Objects.equals(this.tty, v1ThanosRulerSpecContainers.tty)
        && Objects.equals(this.volumeDevices, v1ThanosRulerSpecContainers.volumeDevices)
        && Objects.equals(this.volumeMounts, v1ThanosRulerSpecContainers.volumeMounts)
        && Objects.equals(this.workingDir, v1ThanosRulerSpecContainers.workingDir);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        args,
        command,
        env,
        envFrom,
        image,
        imagePullPolicy,
        lifecycle,
        livenessProbe,
        name,
        ports,
        readinessProbe,
        resources,
        securityContext,
        startupProbe,
        stdin,
        stdinOnce,
        terminationMessagePath,
        terminationMessagePolicy,
        tty,
        volumeDevices,
        volumeMounts,
        workingDir);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1ThanosRulerSpecContainers {\n");
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
    sb.append("    resources: ").append(toIndentedString(resources)).append("\n");
    sb.append("    securityContext: ").append(toIndentedString(securityContext)).append("\n");
    sb.append("    startupProbe: ").append(toIndentedString(startupProbe)).append("\n");
    sb.append("    stdin: ").append(toIndentedString(stdin)).append("\n");
    sb.append("    stdinOnce: ").append(toIndentedString(stdinOnce)).append("\n");
    sb.append("    terminationMessagePath: ")
        .append(toIndentedString(terminationMessagePath))
        .append("\n");
    sb.append("    terminationMessagePolicy: ")
        .append(toIndentedString(terminationMessagePolicy))
        .append("\n");
    sb.append("    tty: ").append(toIndentedString(tty)).append("\n");
    sb.append("    volumeDevices: ").append(toIndentedString(volumeDevices)).append("\n");
    sb.append("    volumeMounts: ").append(toIndentedString(volumeMounts)).append("\n");
    sb.append("    workingDir: ").append(toIndentedString(workingDir)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
