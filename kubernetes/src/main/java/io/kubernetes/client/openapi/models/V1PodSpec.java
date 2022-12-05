/*
Copyright 2022 The Kubernetes Authors.
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

import com.google.gson.annotations.SerializedName;
import io.kubernetes.client.custom.Quantity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/** PodSpec is a description of a pod. */
@ApiModel(description = "PodSpec is a description of a pod.")
@javax.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    date = "2022-12-05T08:14:34.919Z[Etc/UTC]")
public class V1PodSpec {
  public static final String SERIALIZED_NAME_ACTIVE_DEADLINE_SECONDS = "activeDeadlineSeconds";

  @SerializedName(SERIALIZED_NAME_ACTIVE_DEADLINE_SECONDS)
  private Long activeDeadlineSeconds;

  public static final String SERIALIZED_NAME_AFFINITY = "affinity";

  @SerializedName(SERIALIZED_NAME_AFFINITY)
  private V1Affinity affinity;

  public static final String SERIALIZED_NAME_AUTOMOUNT_SERVICE_ACCOUNT_TOKEN =
      "automountServiceAccountToken";

  @SerializedName(SERIALIZED_NAME_AUTOMOUNT_SERVICE_ACCOUNT_TOKEN)
  private Boolean automountServiceAccountToken;

  public static final String SERIALIZED_NAME_CONTAINERS = "containers";

  @SerializedName(SERIALIZED_NAME_CONTAINERS)
  private List<V1Container> containers = new ArrayList<>();

  public static final String SERIALIZED_NAME_DNS_CONFIG = "dnsConfig";

  @SerializedName(SERIALIZED_NAME_DNS_CONFIG)
  private V1PodDNSConfig dnsConfig;

  public static final String SERIALIZED_NAME_DNS_POLICY = "dnsPolicy";

  @SerializedName(SERIALIZED_NAME_DNS_POLICY)
  private String dnsPolicy;

  public static final String SERIALIZED_NAME_ENABLE_SERVICE_LINKS = "enableServiceLinks";

  @SerializedName(SERIALIZED_NAME_ENABLE_SERVICE_LINKS)
  private Boolean enableServiceLinks;

  public static final String SERIALIZED_NAME_EPHEMERAL_CONTAINERS = "ephemeralContainers";

  @SerializedName(SERIALIZED_NAME_EPHEMERAL_CONTAINERS)
  private List<V1EphemeralContainer> ephemeralContainers = null;

  public static final String SERIALIZED_NAME_HOST_ALIASES = "hostAliases";

  @SerializedName(SERIALIZED_NAME_HOST_ALIASES)
  private List<V1HostAlias> hostAliases = null;

  public static final String SERIALIZED_NAME_HOST_I_P_C = "hostIPC";

  @SerializedName(SERIALIZED_NAME_HOST_I_P_C)
  private Boolean hostIPC;

  public static final String SERIALIZED_NAME_HOST_NETWORK = "hostNetwork";

  @SerializedName(SERIALIZED_NAME_HOST_NETWORK)
  private Boolean hostNetwork;

  public static final String SERIALIZED_NAME_HOST_P_I_D = "hostPID";

  @SerializedName(SERIALIZED_NAME_HOST_P_I_D)
  private Boolean hostPID;

  public static final String SERIALIZED_NAME_HOST_USERS = "hostUsers";

  @SerializedName(SERIALIZED_NAME_HOST_USERS)
  private Boolean hostUsers;

  public static final String SERIALIZED_NAME_HOSTNAME = "hostname";

  @SerializedName(SERIALIZED_NAME_HOSTNAME)
  private String hostname;

  public static final String SERIALIZED_NAME_IMAGE_PULL_SECRETS = "imagePullSecrets";

  @SerializedName(SERIALIZED_NAME_IMAGE_PULL_SECRETS)
  private List<V1LocalObjectReference> imagePullSecrets = null;

  public static final String SERIALIZED_NAME_INIT_CONTAINERS = "initContainers";

  @SerializedName(SERIALIZED_NAME_INIT_CONTAINERS)
  private List<V1Container> initContainers = null;

  public static final String SERIALIZED_NAME_NODE_NAME = "nodeName";

  @SerializedName(SERIALIZED_NAME_NODE_NAME)
  private String nodeName;

  public static final String SERIALIZED_NAME_NODE_SELECTOR = "nodeSelector";

  @SerializedName(SERIALIZED_NAME_NODE_SELECTOR)
  private Map<String, String> nodeSelector = null;

  public static final String SERIALIZED_NAME_OS = "os";

  @SerializedName(SERIALIZED_NAME_OS)
  private V1PodOS os;

  public static final String SERIALIZED_NAME_OVERHEAD = "overhead";

  @SerializedName(SERIALIZED_NAME_OVERHEAD)
  private Map<String, Quantity> overhead = null;

  public static final String SERIALIZED_NAME_PREEMPTION_POLICY = "preemptionPolicy";

  @SerializedName(SERIALIZED_NAME_PREEMPTION_POLICY)
  private String preemptionPolicy;

  public static final String SERIALIZED_NAME_PRIORITY = "priority";

  @SerializedName(SERIALIZED_NAME_PRIORITY)
  private Integer priority;

  public static final String SERIALIZED_NAME_PRIORITY_CLASS_NAME = "priorityClassName";

  @SerializedName(SERIALIZED_NAME_PRIORITY_CLASS_NAME)
  private String priorityClassName;

  public static final String SERIALIZED_NAME_READINESS_GATES = "readinessGates";

  @SerializedName(SERIALIZED_NAME_READINESS_GATES)
  private List<V1PodReadinessGate> readinessGates = null;

  public static final String SERIALIZED_NAME_RESTART_POLICY = "restartPolicy";

  @SerializedName(SERIALIZED_NAME_RESTART_POLICY)
  private String restartPolicy;

  public static final String SERIALIZED_NAME_RUNTIME_CLASS_NAME = "runtimeClassName";

  @SerializedName(SERIALIZED_NAME_RUNTIME_CLASS_NAME)
  private String runtimeClassName;

  public static final String SERIALIZED_NAME_SCHEDULER_NAME = "schedulerName";

  @SerializedName(SERIALIZED_NAME_SCHEDULER_NAME)
  private String schedulerName;

  public static final String SERIALIZED_NAME_SECURITY_CONTEXT = "securityContext";

  @SerializedName(SERIALIZED_NAME_SECURITY_CONTEXT)
  private V1PodSecurityContext securityContext;

  public static final String SERIALIZED_NAME_SERVICE_ACCOUNT = "serviceAccount";

  @SerializedName(SERIALIZED_NAME_SERVICE_ACCOUNT)
  private String serviceAccount;

  public static final String SERIALIZED_NAME_SERVICE_ACCOUNT_NAME = "serviceAccountName";

  @SerializedName(SERIALIZED_NAME_SERVICE_ACCOUNT_NAME)
  private String serviceAccountName;

  public static final String SERIALIZED_NAME_SET_HOSTNAME_AS_F_Q_D_N = "setHostnameAsFQDN";

  @SerializedName(SERIALIZED_NAME_SET_HOSTNAME_AS_F_Q_D_N)
  private Boolean setHostnameAsFQDN;

  public static final String SERIALIZED_NAME_SHARE_PROCESS_NAMESPACE = "shareProcessNamespace";

  @SerializedName(SERIALIZED_NAME_SHARE_PROCESS_NAMESPACE)
  private Boolean shareProcessNamespace;

  public static final String SERIALIZED_NAME_SUBDOMAIN = "subdomain";

  @SerializedName(SERIALIZED_NAME_SUBDOMAIN)
  private String subdomain;

  public static final String SERIALIZED_NAME_TERMINATION_GRACE_PERIOD_SECONDS =
      "terminationGracePeriodSeconds";

  @SerializedName(SERIALIZED_NAME_TERMINATION_GRACE_PERIOD_SECONDS)
  private Long terminationGracePeriodSeconds;

  public static final String SERIALIZED_NAME_TOLERATIONS = "tolerations";

  @SerializedName(SERIALIZED_NAME_TOLERATIONS)
  private List<V1Toleration> tolerations = null;

  public static final String SERIALIZED_NAME_TOPOLOGY_SPREAD_CONSTRAINTS =
      "topologySpreadConstraints";

  @SerializedName(SERIALIZED_NAME_TOPOLOGY_SPREAD_CONSTRAINTS)
  private List<V1TopologySpreadConstraint> topologySpreadConstraints = null;

  public static final String SERIALIZED_NAME_VOLUMES = "volumes";

  @SerializedName(SERIALIZED_NAME_VOLUMES)
  private List<V1Volume> volumes = null;

  public V1PodSpec activeDeadlineSeconds(Long activeDeadlineSeconds) {

    this.activeDeadlineSeconds = activeDeadlineSeconds;
    return this;
  }

  /**
   * Optional duration in seconds the pod may be active on the node relative to StartTime before the
   * system will actively try to mark it failed and kill associated containers. Value must be a
   * positive integer.
   *
   * @return activeDeadlineSeconds
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "Optional duration in seconds the pod may be active on the node relative to StartTime before the system will actively try to mark it failed and kill associated containers. Value must be a positive integer.")
  public Long getActiveDeadlineSeconds() {
    return activeDeadlineSeconds;
  }

  public void setActiveDeadlineSeconds(Long activeDeadlineSeconds) {
    this.activeDeadlineSeconds = activeDeadlineSeconds;
  }

  public V1PodSpec affinity(V1Affinity affinity) {

    this.affinity = affinity;
    return this;
  }

  /**
   * Get affinity
   *
   * @return affinity
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  public V1Affinity getAffinity() {
    return affinity;
  }

  public void setAffinity(V1Affinity affinity) {
    this.affinity = affinity;
  }

  public V1PodSpec automountServiceAccountToken(Boolean automountServiceAccountToken) {

    this.automountServiceAccountToken = automountServiceAccountToken;
    return this;
  }

  /**
   * AutomountServiceAccountToken indicates whether a service account token should be automatically
   * mounted.
   *
   * @return automountServiceAccountToken
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "AutomountServiceAccountToken indicates whether a service account token should be automatically mounted.")
  public Boolean getAutomountServiceAccountToken() {
    return automountServiceAccountToken;
  }

  public void setAutomountServiceAccountToken(Boolean automountServiceAccountToken) {
    this.automountServiceAccountToken = automountServiceAccountToken;
  }

  public V1PodSpec containers(List<V1Container> containers) {

    this.containers = containers;
    return this;
  }

  public V1PodSpec addContainersItem(V1Container containersItem) {
    this.containers.add(containersItem);
    return this;
  }

  /**
   * List of containers belonging to the pod. Containers cannot currently be added or removed. There
   * must be at least one container in a Pod. Cannot be updated.
   *
   * @return containers
   */
  @ApiModelProperty(
      required = true,
      value =
          "List of containers belonging to the pod. Containers cannot currently be added or removed. There must be at least one container in a Pod. Cannot be updated.")
  public List<V1Container> getContainers() {
    return containers;
  }

  public void setContainers(List<V1Container> containers) {
    this.containers = containers;
  }

  public V1PodSpec dnsConfig(V1PodDNSConfig dnsConfig) {

    this.dnsConfig = dnsConfig;
    return this;
  }

  /**
   * Get dnsConfig
   *
   * @return dnsConfig
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  public V1PodDNSConfig getDnsConfig() {
    return dnsConfig;
  }

  public void setDnsConfig(V1PodDNSConfig dnsConfig) {
    this.dnsConfig = dnsConfig;
  }

  public V1PodSpec dnsPolicy(String dnsPolicy) {

    this.dnsPolicy = dnsPolicy;
    return this;
  }

  /**
   * Set DNS policy for the pod. Defaults to \&quot;ClusterFirst\&quot;. Valid values are
   * &#39;ClusterFirstWithHostNet&#39;, &#39;ClusterFirst&#39;, &#39;Default&#39; or &#39;None&#39;.
   * DNS parameters given in DNSConfig will be merged with the policy selected with DNSPolicy. To
   * have DNS options set along with hostNetwork, you have to specify DNS policy explicitly to
   * &#39;ClusterFirstWithHostNet&#39;.
   *
   * @return dnsPolicy
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "Set DNS policy for the pod. Defaults to \"ClusterFirst\". Valid values are 'ClusterFirstWithHostNet', 'ClusterFirst', 'Default' or 'None'. DNS parameters given in DNSConfig will be merged with the policy selected with DNSPolicy. To have DNS options set along with hostNetwork, you have to specify DNS policy explicitly to 'ClusterFirstWithHostNet'.  ")
  public String getDnsPolicy() {
    return dnsPolicy;
  }

  public void setDnsPolicy(String dnsPolicy) {
    this.dnsPolicy = dnsPolicy;
  }

  public V1PodSpec enableServiceLinks(Boolean enableServiceLinks) {

    this.enableServiceLinks = enableServiceLinks;
    return this;
  }

  /**
   * EnableServiceLinks indicates whether information about services should be injected into
   * pod&#39;s environment variables, matching the syntax of Docker links. Optional: Defaults to
   * true.
   *
   * @return enableServiceLinks
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "EnableServiceLinks indicates whether information about services should be injected into pod's environment variables, matching the syntax of Docker links. Optional: Defaults to true.")
  public Boolean getEnableServiceLinks() {
    return enableServiceLinks;
  }

  public void setEnableServiceLinks(Boolean enableServiceLinks) {
    this.enableServiceLinks = enableServiceLinks;
  }

  public V1PodSpec ephemeralContainers(List<V1EphemeralContainer> ephemeralContainers) {

    this.ephemeralContainers = ephemeralContainers;
    return this;
  }

  public V1PodSpec addEphemeralContainersItem(V1EphemeralContainer ephemeralContainersItem) {
    if (this.ephemeralContainers == null) {
      this.ephemeralContainers = new ArrayList<>();
    }
    this.ephemeralContainers.add(ephemeralContainersItem);
    return this;
  }

  /**
   * List of ephemeral containers run in this pod. Ephemeral containers may be run in an existing
   * pod to perform user-initiated actions such as debugging. This list cannot be specified when
   * creating a pod, and it cannot be modified by updating the pod spec. In order to add an
   * ephemeral container to an existing pod, use the pod&#39;s ephemeralcontainers subresource.
   *
   * @return ephemeralContainers
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "List of ephemeral containers run in this pod. Ephemeral containers may be run in an existing pod to perform user-initiated actions such as debugging. This list cannot be specified when creating a pod, and it cannot be modified by updating the pod spec. In order to add an ephemeral container to an existing pod, use the pod's ephemeralcontainers subresource.")
  public List<V1EphemeralContainer> getEphemeralContainers() {
    return ephemeralContainers;
  }

  public void setEphemeralContainers(List<V1EphemeralContainer> ephemeralContainers) {
    this.ephemeralContainers = ephemeralContainers;
  }

  public V1PodSpec hostAliases(List<V1HostAlias> hostAliases) {

    this.hostAliases = hostAliases;
    return this;
  }

  public V1PodSpec addHostAliasesItem(V1HostAlias hostAliasesItem) {
    if (this.hostAliases == null) {
      this.hostAliases = new ArrayList<>();
    }
    this.hostAliases.add(hostAliasesItem);
    return this;
  }

  /**
   * HostAliases is an optional list of hosts and IPs that will be injected into the pod&#39;s hosts
   * file if specified. This is only valid for non-hostNetwork pods.
   *
   * @return hostAliases
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "HostAliases is an optional list of hosts and IPs that will be injected into the pod's hosts file if specified. This is only valid for non-hostNetwork pods.")
  public List<V1HostAlias> getHostAliases() {
    return hostAliases;
  }

  public void setHostAliases(List<V1HostAlias> hostAliases) {
    this.hostAliases = hostAliases;
  }

  public V1PodSpec hostIPC(Boolean hostIPC) {

    this.hostIPC = hostIPC;
    return this;
  }

  /**
   * Use the host&#39;s ipc namespace. Optional: Default to false.
   *
   * @return hostIPC
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Use the host's ipc namespace. Optional: Default to false.")
  public Boolean getHostIPC() {
    return hostIPC;
  }

  public void setHostIPC(Boolean hostIPC) {
    this.hostIPC = hostIPC;
  }

  public V1PodSpec hostNetwork(Boolean hostNetwork) {

    this.hostNetwork = hostNetwork;
    return this;
  }

  /**
   * Host networking requested for this pod. Use the host&#39;s network namespace. If this option is
   * set, the ports that will be used must be specified. Default to false.
   *
   * @return hostNetwork
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "Host networking requested for this pod. Use the host's network namespace. If this option is set, the ports that will be used must be specified. Default to false.")
  public Boolean getHostNetwork() {
    return hostNetwork;
  }

  public void setHostNetwork(Boolean hostNetwork) {
    this.hostNetwork = hostNetwork;
  }

  public V1PodSpec hostPID(Boolean hostPID) {

    this.hostPID = hostPID;
    return this;
  }

  /**
   * Use the host&#39;s pid namespace. Optional: Default to false.
   *
   * @return hostPID
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Use the host's pid namespace. Optional: Default to false.")
  public Boolean getHostPID() {
    return hostPID;
  }

  public void setHostPID(Boolean hostPID) {
    this.hostPID = hostPID;
  }

  public V1PodSpec hostUsers(Boolean hostUsers) {

    this.hostUsers = hostUsers;
    return this;
  }

  /**
   * Use the host&#39;s user namespace. Optional: Default to true. If set to true or not present,
   * the pod will be run in the host user namespace, useful for when the pod needs a feature only
   * available to the host user namespace, such as loading a kernel module with CAP_SYS_MODULE. When
   * set to false, a new userns is created for the pod. Setting false is useful for mitigating
   * container breakout vulnerabilities even allowing users to run their containers as root without
   * actually having root privileges on the host. This field is alpha-level and is only honored by
   * servers that enable the UserNamespacesSupport feature.
   *
   * @return hostUsers
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "Use the host's user namespace. Optional: Default to true. If set to true or not present, the pod will be run in the host user namespace, useful for when the pod needs a feature only available to the host user namespace, such as loading a kernel module with CAP_SYS_MODULE. When set to false, a new userns is created for the pod. Setting false is useful for mitigating container breakout vulnerabilities even allowing users to run their containers as root without actually having root privileges on the host. This field is alpha-level and is only honored by servers that enable the UserNamespacesSupport feature.")
  public Boolean getHostUsers() {
    return hostUsers;
  }

  public void setHostUsers(Boolean hostUsers) {
    this.hostUsers = hostUsers;
  }

  public V1PodSpec hostname(String hostname) {

    this.hostname = hostname;
    return this;
  }

  /**
   * Specifies the hostname of the Pod If not specified, the pod&#39;s hostname will be set to a
   * system-defined value.
   *
   * @return hostname
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "Specifies the hostname of the Pod If not specified, the pod's hostname will be set to a system-defined value.")
  public String getHostname() {
    return hostname;
  }

  public void setHostname(String hostname) {
    this.hostname = hostname;
  }

  public V1PodSpec imagePullSecrets(List<V1LocalObjectReference> imagePullSecrets) {

    this.imagePullSecrets = imagePullSecrets;
    return this;
  }

  public V1PodSpec addImagePullSecretsItem(V1LocalObjectReference imagePullSecretsItem) {
    if (this.imagePullSecrets == null) {
      this.imagePullSecrets = new ArrayList<>();
    }
    this.imagePullSecrets.add(imagePullSecretsItem);
    return this;
  }

  /**
   * ImagePullSecrets is an optional list of references to secrets in the same namespace to use for
   * pulling any of the images used by this PodSpec. If specified, these secrets will be passed to
   * individual puller implementations for them to use. More info:
   * https://kubernetes.io/docs/concepts/containers/images#specifying-imagepullsecrets-on-a-pod
   *
   * @return imagePullSecrets
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "ImagePullSecrets is an optional list of references to secrets in the same namespace to use for pulling any of the images used by this PodSpec. If specified, these secrets will be passed to individual puller implementations for them to use. More info: https://kubernetes.io/docs/concepts/containers/images#specifying-imagepullsecrets-on-a-pod")
  public List<V1LocalObjectReference> getImagePullSecrets() {
    return imagePullSecrets;
  }

  public void setImagePullSecrets(List<V1LocalObjectReference> imagePullSecrets) {
    this.imagePullSecrets = imagePullSecrets;
  }

  public V1PodSpec initContainers(List<V1Container> initContainers) {

    this.initContainers = initContainers;
    return this;
  }

  public V1PodSpec addInitContainersItem(V1Container initContainersItem) {
    if (this.initContainers == null) {
      this.initContainers = new ArrayList<>();
    }
    this.initContainers.add(initContainersItem);
    return this;
  }

  /**
   * List of initialization containers belonging to the pod. Init containers are executed in order
   * prior to containers being started. If any init container fails, the pod is considered to have
   * failed and is handled according to its restartPolicy. The name for an init container or normal
   * container must be unique among all containers. Init containers may not have Lifecycle actions,
   * Readiness probes, Liveness probes, or Startup probes. The resourceRequirements of an init
   * container are taken into account during scheduling by finding the highest request/limit for
   * each resource type, and then using the max of of that value or the sum of the normal
   * containers. Limits are applied to init containers in a similar fashion. Init containers cannot
   * currently be added or removed. Cannot be updated. More info:
   * https://kubernetes.io/docs/concepts/workloads/pods/init-containers/
   *
   * @return initContainers
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "List of initialization containers belonging to the pod. Init containers are executed in order prior to containers being started. If any init container fails, the pod is considered to have failed and is handled according to its restartPolicy. The name for an init container or normal container must be unique among all containers. Init containers may not have Lifecycle actions, Readiness probes, Liveness probes, or Startup probes. The resourceRequirements of an init container are taken into account during scheduling by finding the highest request/limit for each resource type, and then using the max of of that value or the sum of the normal containers. Limits are applied to init containers in a similar fashion. Init containers cannot currently be added or removed. Cannot be updated. More info: https://kubernetes.io/docs/concepts/workloads/pods/init-containers/")
  public List<V1Container> getInitContainers() {
    return initContainers;
  }

  public void setInitContainers(List<V1Container> initContainers) {
    this.initContainers = initContainers;
  }

  public V1PodSpec nodeName(String nodeName) {

    this.nodeName = nodeName;
    return this;
  }

  /**
   * NodeName is a request to schedule this pod onto a specific node. If it is non-empty, the
   * scheduler simply schedules this pod onto that node, assuming that it fits resource
   * requirements.
   *
   * @return nodeName
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "NodeName is a request to schedule this pod onto a specific node. If it is non-empty, the scheduler simply schedules this pod onto that node, assuming that it fits resource requirements.")
  public String getNodeName() {
    return nodeName;
  }

  public void setNodeName(String nodeName) {
    this.nodeName = nodeName;
  }

  public V1PodSpec nodeSelector(Map<String, String> nodeSelector) {

    this.nodeSelector = nodeSelector;
    return this;
  }

  public V1PodSpec putNodeSelectorItem(String key, String nodeSelectorItem) {
    if (this.nodeSelector == null) {
      this.nodeSelector = new HashMap<>();
    }
    this.nodeSelector.put(key, nodeSelectorItem);
    return this;
  }

  /**
   * NodeSelector is a selector which must be true for the pod to fit on a node. Selector which must
   * match a node&#39;s labels for the pod to be scheduled on that node. More info:
   * https://kubernetes.io/docs/concepts/configuration/assign-pod-node/
   *
   * @return nodeSelector
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "NodeSelector is a selector which must be true for the pod to fit on a node. Selector which must match a node's labels for the pod to be scheduled on that node. More info: https://kubernetes.io/docs/concepts/configuration/assign-pod-node/")
  public Map<String, String> getNodeSelector() {
    return nodeSelector;
  }

  public void setNodeSelector(Map<String, String> nodeSelector) {
    this.nodeSelector = nodeSelector;
  }

  public V1PodSpec os(V1PodOS os) {

    this.os = os;
    return this;
  }

  /**
   * Get os
   *
   * @return os
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  public V1PodOS getOs() {
    return os;
  }

  public void setOs(V1PodOS os) {
    this.os = os;
  }

  public V1PodSpec overhead(Map<String, Quantity> overhead) {

    this.overhead = overhead;
    return this;
  }

  public V1PodSpec putOverheadItem(String key, Quantity overheadItem) {
    if (this.overhead == null) {
      this.overhead = new HashMap<>();
    }
    this.overhead.put(key, overheadItem);
    return this;
  }

  /**
   * Overhead represents the resource overhead associated with running a pod for a given
   * RuntimeClass. This field will be autopopulated at admission time by the RuntimeClass admission
   * controller. If the RuntimeClass admission controller is enabled, overhead must not be set in
   * Pod create requests. The RuntimeClass admission controller will reject Pod create requests
   * which have the overhead already set. If RuntimeClass is configured and selected in the PodSpec,
   * Overhead will be set to the value defined in the corresponding RuntimeClass, otherwise it will
   * remain unset and treated as zero. More info:
   * https://git.k8s.io/enhancements/keps/sig-node/688-pod-overhead/README.md
   *
   * @return overhead
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "Overhead represents the resource overhead associated with running a pod for a given RuntimeClass. This field will be autopopulated at admission time by the RuntimeClass admission controller. If the RuntimeClass admission controller is enabled, overhead must not be set in Pod create requests. The RuntimeClass admission controller will reject Pod create requests which have the overhead already set. If RuntimeClass is configured and selected in the PodSpec, Overhead will be set to the value defined in the corresponding RuntimeClass, otherwise it will remain unset and treated as zero. More info: https://git.k8s.io/enhancements/keps/sig-node/688-pod-overhead/README.md")
  public Map<String, Quantity> getOverhead() {
    return overhead;
  }

  public void setOverhead(Map<String, Quantity> overhead) {
    this.overhead = overhead;
  }

  public V1PodSpec preemptionPolicy(String preemptionPolicy) {

    this.preemptionPolicy = preemptionPolicy;
    return this;
  }

  /**
   * PreemptionPolicy is the Policy for preempting pods with lower priority. One of Never,
   * PreemptLowerPriority. Defaults to PreemptLowerPriority if unset.
   *
   * @return preemptionPolicy
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "PreemptionPolicy is the Policy for preempting pods with lower priority. One of Never, PreemptLowerPriority. Defaults to PreemptLowerPriority if unset.")
  public String getPreemptionPolicy() {
    return preemptionPolicy;
  }

  public void setPreemptionPolicy(String preemptionPolicy) {
    this.preemptionPolicy = preemptionPolicy;
  }

  public V1PodSpec priority(Integer priority) {

    this.priority = priority;
    return this;
  }

  /**
   * The priority value. Various system components use this field to find the priority of the pod.
   * When Priority Admission Controller is enabled, it prevents users from setting this field. The
   * admission controller populates this field from PriorityClassName. The higher the value, the
   * higher the priority.
   *
   * @return priority
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "The priority value. Various system components use this field to find the priority of the pod. When Priority Admission Controller is enabled, it prevents users from setting this field. The admission controller populates this field from PriorityClassName. The higher the value, the higher the priority.")
  public Integer getPriority() {
    return priority;
  }

  public void setPriority(Integer priority) {
    this.priority = priority;
  }

  public V1PodSpec priorityClassName(String priorityClassName) {

    this.priorityClassName = priorityClassName;
    return this;
  }

  /**
   * If specified, indicates the pod&#39;s priority. \&quot;system-node-critical\&quot; and
   * \&quot;system-cluster-critical\&quot; are two special keywords which indicate the highest
   * priorities with the former being the highest priority. Any other name must be defined by
   * creating a PriorityClass object with that name. If not specified, the pod priority will be
   * default or zero if there is no default.
   *
   * @return priorityClassName
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "If specified, indicates the pod's priority. \"system-node-critical\" and \"system-cluster-critical\" are two special keywords which indicate the highest priorities with the former being the highest priority. Any other name must be defined by creating a PriorityClass object with that name. If not specified, the pod priority will be default or zero if there is no default.")
  public String getPriorityClassName() {
    return priorityClassName;
  }

  public void setPriorityClassName(String priorityClassName) {
    this.priorityClassName = priorityClassName;
  }

  public V1PodSpec readinessGates(List<V1PodReadinessGate> readinessGates) {

    this.readinessGates = readinessGates;
    return this;
  }

  public V1PodSpec addReadinessGatesItem(V1PodReadinessGate readinessGatesItem) {
    if (this.readinessGates == null) {
      this.readinessGates = new ArrayList<>();
    }
    this.readinessGates.add(readinessGatesItem);
    return this;
  }

  /**
   * If specified, all readiness gates will be evaluated for pod readiness. A pod is ready when all
   * its containers are ready AND all conditions specified in the readiness gates have status equal
   * to \&quot;True\&quot; More info:
   * https://git.k8s.io/enhancements/keps/sig-network/580-pod-readiness-gates
   *
   * @return readinessGates
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "If specified, all readiness gates will be evaluated for pod readiness. A pod is ready when all its containers are ready AND all conditions specified in the readiness gates have status equal to \"True\" More info: https://git.k8s.io/enhancements/keps/sig-network/580-pod-readiness-gates")
  public List<V1PodReadinessGate> getReadinessGates() {
    return readinessGates;
  }

  public void setReadinessGates(List<V1PodReadinessGate> readinessGates) {
    this.readinessGates = readinessGates;
  }

  public V1PodSpec restartPolicy(String restartPolicy) {

    this.restartPolicy = restartPolicy;
    return this;
  }

  /**
   * Restart policy for all containers within the pod. One of Always, OnFailure, Never. Default to
   * Always. More info:
   * https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle/#restart-policy
   *
   * @return restartPolicy
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "Restart policy for all containers within the pod. One of Always, OnFailure, Never. Default to Always. More info: https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle/#restart-policy  ")
  public String getRestartPolicy() {
    return restartPolicy;
  }

  public void setRestartPolicy(String restartPolicy) {
    this.restartPolicy = restartPolicy;
  }

  public V1PodSpec runtimeClassName(String runtimeClassName) {

    this.runtimeClassName = runtimeClassName;
    return this;
  }

  /**
   * RuntimeClassName refers to a RuntimeClass object in the node.k8s.io group, which should be used
   * to run this pod. If no RuntimeClass resource matches the named class, the pod will not be run.
   * If unset or empty, the \&quot;legacy\&quot; RuntimeClass will be used, which is an implicit
   * class with an empty definition that uses the default runtime handler. More info:
   * https://git.k8s.io/enhancements/keps/sig-node/585-runtime-class
   *
   * @return runtimeClassName
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "RuntimeClassName refers to a RuntimeClass object in the node.k8s.io group, which should be used to run this pod.  If no RuntimeClass resource matches the named class, the pod will not be run. If unset or empty, the \"legacy\" RuntimeClass will be used, which is an implicit class with an empty definition that uses the default runtime handler. More info: https://git.k8s.io/enhancements/keps/sig-node/585-runtime-class")
  public String getRuntimeClassName() {
    return runtimeClassName;
  }

  public void setRuntimeClassName(String runtimeClassName) {
    this.runtimeClassName = runtimeClassName;
  }

  public V1PodSpec schedulerName(String schedulerName) {

    this.schedulerName = schedulerName;
    return this;
  }

  /**
   * If specified, the pod will be dispatched by specified scheduler. If not specified, the pod will
   * be dispatched by default scheduler.
   *
   * @return schedulerName
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "If specified, the pod will be dispatched by specified scheduler. If not specified, the pod will be dispatched by default scheduler.")
  public String getSchedulerName() {
    return schedulerName;
  }

  public void setSchedulerName(String schedulerName) {
    this.schedulerName = schedulerName;
  }

  public V1PodSpec securityContext(V1PodSecurityContext securityContext) {

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
  public V1PodSecurityContext getSecurityContext() {
    return securityContext;
  }

  public void setSecurityContext(V1PodSecurityContext securityContext) {
    this.securityContext = securityContext;
  }

  public V1PodSpec serviceAccount(String serviceAccount) {

    this.serviceAccount = serviceAccount;
    return this;
  }

  /**
   * DeprecatedServiceAccount is a depreciated alias for ServiceAccountName. Deprecated: Use
   * serviceAccountName instead.
   *
   * @return serviceAccount
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "DeprecatedServiceAccount is a depreciated alias for ServiceAccountName. Deprecated: Use serviceAccountName instead.")
  public String getServiceAccount() {
    return serviceAccount;
  }

  public void setServiceAccount(String serviceAccount) {
    this.serviceAccount = serviceAccount;
  }

  public V1PodSpec serviceAccountName(String serviceAccountName) {

    this.serviceAccountName = serviceAccountName;
    return this;
  }

  /**
   * ServiceAccountName is the name of the ServiceAccount to use to run this pod. More info:
   * https://kubernetes.io/docs/tasks/configure-pod-container/configure-service-account/
   *
   * @return serviceAccountName
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "ServiceAccountName is the name of the ServiceAccount to use to run this pod. More info: https://kubernetes.io/docs/tasks/configure-pod-container/configure-service-account/")
  public String getServiceAccountName() {
    return serviceAccountName;
  }

  public void setServiceAccountName(String serviceAccountName) {
    this.serviceAccountName = serviceAccountName;
  }

  public V1PodSpec setHostnameAsFQDN(Boolean setHostnameAsFQDN) {

    this.setHostnameAsFQDN = setHostnameAsFQDN;
    return this;
  }

  /**
   * If true the pod&#39;s hostname will be configured as the pod&#39;s FQDN, rather than the leaf
   * name (the default). In Linux containers, this means setting the FQDN in the hostname field of
   * the kernel (the nodename field of struct utsname). In Windows containers, this means setting
   * the registry value of hostname for the registry key
   * HKEY_LOCAL_MACHINE\\SYSTEM\\CurrentControlSet\\Services\\Tcpip\\Parameters to FQDN. If a pod
   * does not have FQDN, this has no effect. Default to false.
   *
   * @return setHostnameAsFQDN
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "If true the pod's hostname will be configured as the pod's FQDN, rather than the leaf name (the default). In Linux containers, this means setting the FQDN in the hostname field of the kernel (the nodename field of struct utsname). In Windows containers, this means setting the registry value of hostname for the registry key HKEY_LOCAL_MACHINE\\SYSTEM\\CurrentControlSet\\Services\\Tcpip\\Parameters to FQDN. If a pod does not have FQDN, this has no effect. Default to false.")
  public Boolean getSetHostnameAsFQDN() {
    return setHostnameAsFQDN;
  }

  public void setSetHostnameAsFQDN(Boolean setHostnameAsFQDN) {
    this.setHostnameAsFQDN = setHostnameAsFQDN;
  }

  public V1PodSpec shareProcessNamespace(Boolean shareProcessNamespace) {

    this.shareProcessNamespace = shareProcessNamespace;
    return this;
  }

  /**
   * Share a single process namespace between all of the containers in a pod. When this is set
   * containers will be able to view and signal processes from other containers in the same pod, and
   * the first process in each container will not be assigned PID 1. HostPID and
   * ShareProcessNamespace cannot both be set. Optional: Default to false.
   *
   * @return shareProcessNamespace
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "Share a single process namespace between all of the containers in a pod. When this is set containers will be able to view and signal processes from other containers in the same pod, and the first process in each container will not be assigned PID 1. HostPID and ShareProcessNamespace cannot both be set. Optional: Default to false.")
  public Boolean getShareProcessNamespace() {
    return shareProcessNamespace;
  }

  public void setShareProcessNamespace(Boolean shareProcessNamespace) {
    this.shareProcessNamespace = shareProcessNamespace;
  }

  public V1PodSpec subdomain(String subdomain) {

    this.subdomain = subdomain;
    return this;
  }

  /**
   * If specified, the fully qualified Pod hostname will be
   * \&quot;&lt;hostname&gt;.&lt;subdomain&gt;.&lt;pod namespace&gt;.svc.&lt;cluster
   * domain&gt;\&quot;. If not specified, the pod will not have a domainname at all.
   *
   * @return subdomain
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "If specified, the fully qualified Pod hostname will be \"<hostname>.<subdomain>.<pod namespace>.svc.<cluster domain>\". If not specified, the pod will not have a domainname at all.")
  public String getSubdomain() {
    return subdomain;
  }

  public void setSubdomain(String subdomain) {
    this.subdomain = subdomain;
  }

  public V1PodSpec terminationGracePeriodSeconds(Long terminationGracePeriodSeconds) {

    this.terminationGracePeriodSeconds = terminationGracePeriodSeconds;
    return this;
  }

  /**
   * Optional duration in seconds the pod needs to terminate gracefully. May be decreased in delete
   * request. Value must be non-negative integer. The value zero indicates stop immediately via the
   * kill signal (no opportunity to shut down). If this value is nil, the default grace period will
   * be used instead. The grace period is the duration in seconds after the processes running in the
   * pod are sent a termination signal and the time when the processes are forcibly halted with a
   * kill signal. Set this value longer than the expected cleanup time for your process. Defaults to
   * 30 seconds.
   *
   * @return terminationGracePeriodSeconds
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "Optional duration in seconds the pod needs to terminate gracefully. May be decreased in delete request. Value must be non-negative integer. The value zero indicates stop immediately via the kill signal (no opportunity to shut down). If this value is nil, the default grace period will be used instead. The grace period is the duration in seconds after the processes running in the pod are sent a termination signal and the time when the processes are forcibly halted with a kill signal. Set this value longer than the expected cleanup time for your process. Defaults to 30 seconds.")
  public Long getTerminationGracePeriodSeconds() {
    return terminationGracePeriodSeconds;
  }

  public void setTerminationGracePeriodSeconds(Long terminationGracePeriodSeconds) {
    this.terminationGracePeriodSeconds = terminationGracePeriodSeconds;
  }

  public V1PodSpec tolerations(List<V1Toleration> tolerations) {

    this.tolerations = tolerations;
    return this;
  }

  public V1PodSpec addTolerationsItem(V1Toleration tolerationsItem) {
    if (this.tolerations == null) {
      this.tolerations = new ArrayList<>();
    }
    this.tolerations.add(tolerationsItem);
    return this;
  }

  /**
   * If specified, the pod&#39;s tolerations.
   *
   * @return tolerations
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "If specified, the pod's tolerations.")
  public List<V1Toleration> getTolerations() {
    return tolerations;
  }

  public void setTolerations(List<V1Toleration> tolerations) {
    this.tolerations = tolerations;
  }

  public V1PodSpec topologySpreadConstraints(
      List<V1TopologySpreadConstraint> topologySpreadConstraints) {

    this.topologySpreadConstraints = topologySpreadConstraints;
    return this;
  }

  public V1PodSpec addTopologySpreadConstraintsItem(
      V1TopologySpreadConstraint topologySpreadConstraintsItem) {
    if (this.topologySpreadConstraints == null) {
      this.topologySpreadConstraints = new ArrayList<>();
    }
    this.topologySpreadConstraints.add(topologySpreadConstraintsItem);
    return this;
  }

  /**
   * TopologySpreadConstraints describes how a group of pods ought to spread across topology
   * domains. Scheduler will schedule pods in a way which abides by the constraints. All
   * topologySpreadConstraints are ANDed.
   *
   * @return topologySpreadConstraints
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "TopologySpreadConstraints describes how a group of pods ought to spread across topology domains. Scheduler will schedule pods in a way which abides by the constraints. All topologySpreadConstraints are ANDed.")
  public List<V1TopologySpreadConstraint> getTopologySpreadConstraints() {
    return topologySpreadConstraints;
  }

  public void setTopologySpreadConstraints(
      List<V1TopologySpreadConstraint> topologySpreadConstraints) {
    this.topologySpreadConstraints = topologySpreadConstraints;
  }

  public V1PodSpec volumes(List<V1Volume> volumes) {

    this.volumes = volumes;
    return this;
  }

  public V1PodSpec addVolumesItem(V1Volume volumesItem) {
    if (this.volumes == null) {
      this.volumes = new ArrayList<>();
    }
    this.volumes.add(volumesItem);
    return this;
  }

  /**
   * List of volumes that can be mounted by containers belonging to the pod. More info:
   * https://kubernetes.io/docs/concepts/storage/volumes
   *
   * @return volumes
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "List of volumes that can be mounted by containers belonging to the pod. More info: https://kubernetes.io/docs/concepts/storage/volumes")
  public List<V1Volume> getVolumes() {
    return volumes;
  }

  public void setVolumes(List<V1Volume> volumes) {
    this.volumes = volumes;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1PodSpec v1PodSpec = (V1PodSpec) o;
    return Objects.equals(this.activeDeadlineSeconds, v1PodSpec.activeDeadlineSeconds)
        && Objects.equals(this.affinity, v1PodSpec.affinity)
        && Objects.equals(this.automountServiceAccountToken, v1PodSpec.automountServiceAccountToken)
        && Objects.equals(this.containers, v1PodSpec.containers)
        && Objects.equals(this.dnsConfig, v1PodSpec.dnsConfig)
        && Objects.equals(this.dnsPolicy, v1PodSpec.dnsPolicy)
        && Objects.equals(this.enableServiceLinks, v1PodSpec.enableServiceLinks)
        && Objects.equals(this.ephemeralContainers, v1PodSpec.ephemeralContainers)
        && Objects.equals(this.hostAliases, v1PodSpec.hostAliases)
        && Objects.equals(this.hostIPC, v1PodSpec.hostIPC)
        && Objects.equals(this.hostNetwork, v1PodSpec.hostNetwork)
        && Objects.equals(this.hostPID, v1PodSpec.hostPID)
        && Objects.equals(this.hostUsers, v1PodSpec.hostUsers)
        && Objects.equals(this.hostname, v1PodSpec.hostname)
        && Objects.equals(this.imagePullSecrets, v1PodSpec.imagePullSecrets)
        && Objects.equals(this.initContainers, v1PodSpec.initContainers)
        && Objects.equals(this.nodeName, v1PodSpec.nodeName)
        && Objects.equals(this.nodeSelector, v1PodSpec.nodeSelector)
        && Objects.equals(this.os, v1PodSpec.os)
        && Objects.equals(this.overhead, v1PodSpec.overhead)
        && Objects.equals(this.preemptionPolicy, v1PodSpec.preemptionPolicy)
        && Objects.equals(this.priority, v1PodSpec.priority)
        && Objects.equals(this.priorityClassName, v1PodSpec.priorityClassName)
        && Objects.equals(this.readinessGates, v1PodSpec.readinessGates)
        && Objects.equals(this.restartPolicy, v1PodSpec.restartPolicy)
        && Objects.equals(this.runtimeClassName, v1PodSpec.runtimeClassName)
        && Objects.equals(this.schedulerName, v1PodSpec.schedulerName)
        && Objects.equals(this.securityContext, v1PodSpec.securityContext)
        && Objects.equals(this.serviceAccount, v1PodSpec.serviceAccount)
        && Objects.equals(this.serviceAccountName, v1PodSpec.serviceAccountName)
        && Objects.equals(this.setHostnameAsFQDN, v1PodSpec.setHostnameAsFQDN)
        && Objects.equals(this.shareProcessNamespace, v1PodSpec.shareProcessNamespace)
        && Objects.equals(this.subdomain, v1PodSpec.subdomain)
        && Objects.equals(
            this.terminationGracePeriodSeconds, v1PodSpec.terminationGracePeriodSeconds)
        && Objects.equals(this.tolerations, v1PodSpec.tolerations)
        && Objects.equals(this.topologySpreadConstraints, v1PodSpec.topologySpreadConstraints)
        && Objects.equals(this.volumes, v1PodSpec.volumes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        activeDeadlineSeconds,
        affinity,
        automountServiceAccountToken,
        containers,
        dnsConfig,
        dnsPolicy,
        enableServiceLinks,
        ephemeralContainers,
        hostAliases,
        hostIPC,
        hostNetwork,
        hostPID,
        hostUsers,
        hostname,
        imagePullSecrets,
        initContainers,
        nodeName,
        nodeSelector,
        os,
        overhead,
        preemptionPolicy,
        priority,
        priorityClassName,
        readinessGates,
        restartPolicy,
        runtimeClassName,
        schedulerName,
        securityContext,
        serviceAccount,
        serviceAccountName,
        setHostnameAsFQDN,
        shareProcessNamespace,
        subdomain,
        terminationGracePeriodSeconds,
        tolerations,
        topologySpreadConstraints,
        volumes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1PodSpec {\n");
    sb.append("    activeDeadlineSeconds: ")
        .append(toIndentedString(activeDeadlineSeconds))
        .append("\n");
    sb.append("    affinity: ").append(toIndentedString(affinity)).append("\n");
    sb.append("    automountServiceAccountToken: ")
        .append(toIndentedString(automountServiceAccountToken))
        .append("\n");
    sb.append("    containers: ").append(toIndentedString(containers)).append("\n");
    sb.append("    dnsConfig: ").append(toIndentedString(dnsConfig)).append("\n");
    sb.append("    dnsPolicy: ").append(toIndentedString(dnsPolicy)).append("\n");
    sb.append("    enableServiceLinks: ").append(toIndentedString(enableServiceLinks)).append("\n");
    sb.append("    ephemeralContainers: ")
        .append(toIndentedString(ephemeralContainers))
        .append("\n");
    sb.append("    hostAliases: ").append(toIndentedString(hostAliases)).append("\n");
    sb.append("    hostIPC: ").append(toIndentedString(hostIPC)).append("\n");
    sb.append("    hostNetwork: ").append(toIndentedString(hostNetwork)).append("\n");
    sb.append("    hostPID: ").append(toIndentedString(hostPID)).append("\n");
    sb.append("    hostUsers: ").append(toIndentedString(hostUsers)).append("\n");
    sb.append("    hostname: ").append(toIndentedString(hostname)).append("\n");
    sb.append("    imagePullSecrets: ").append(toIndentedString(imagePullSecrets)).append("\n");
    sb.append("    initContainers: ").append(toIndentedString(initContainers)).append("\n");
    sb.append("    nodeName: ").append(toIndentedString(nodeName)).append("\n");
    sb.append("    nodeSelector: ").append(toIndentedString(nodeSelector)).append("\n");
    sb.append("    os: ").append(toIndentedString(os)).append("\n");
    sb.append("    overhead: ").append(toIndentedString(overhead)).append("\n");
    sb.append("    preemptionPolicy: ").append(toIndentedString(preemptionPolicy)).append("\n");
    sb.append("    priority: ").append(toIndentedString(priority)).append("\n");
    sb.append("    priorityClassName: ").append(toIndentedString(priorityClassName)).append("\n");
    sb.append("    readinessGates: ").append(toIndentedString(readinessGates)).append("\n");
    sb.append("    restartPolicy: ").append(toIndentedString(restartPolicy)).append("\n");
    sb.append("    runtimeClassName: ").append(toIndentedString(runtimeClassName)).append("\n");
    sb.append("    schedulerName: ").append(toIndentedString(schedulerName)).append("\n");
    sb.append("    securityContext: ").append(toIndentedString(securityContext)).append("\n");
    sb.append("    serviceAccount: ").append(toIndentedString(serviceAccount)).append("\n");
    sb.append("    serviceAccountName: ").append(toIndentedString(serviceAccountName)).append("\n");
    sb.append("    setHostnameAsFQDN: ").append(toIndentedString(setHostnameAsFQDN)).append("\n");
    sb.append("    shareProcessNamespace: ")
        .append(toIndentedString(shareProcessNamespace))
        .append("\n");
    sb.append("    subdomain: ").append(toIndentedString(subdomain)).append("\n");
    sb.append("    terminationGracePeriodSeconds: ")
        .append(toIndentedString(terminationGracePeriodSeconds))
        .append("\n");
    sb.append("    tolerations: ").append(toIndentedString(tolerations)).append("\n");
    sb.append("    topologySpreadConstraints: ")
        .append(toIndentedString(topologySpreadConstraints))
        .append("\n");
    sb.append("    volumes: ").append(toIndentedString(volumes)).append("\n");
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
