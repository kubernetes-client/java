/*
Copyright 2024 The Kubernetes Authors.
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
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.kubernetes.client.custom.Quantity;
import io.kubernetes.client.openapi.models.V1Affinity;
import io.kubernetes.client.openapi.models.V1Container;
import io.kubernetes.client.openapi.models.V1EphemeralContainer;
import io.kubernetes.client.openapi.models.V1HostAlias;
import io.kubernetes.client.openapi.models.V1LocalObjectReference;
import io.kubernetes.client.openapi.models.V1PodDNSConfig;
import io.kubernetes.client.openapi.models.V1PodOS;
import io.kubernetes.client.openapi.models.V1PodReadinessGate;
import io.kubernetes.client.openapi.models.V1PodResourceClaim;
import io.kubernetes.client.openapi.models.V1PodSchedulingGate;
import io.kubernetes.client.openapi.models.V1PodSecurityContext;
import io.kubernetes.client.openapi.models.V1Toleration;
import io.kubernetes.client.openapi.models.V1TopologySpreadConstraint;
import io.kubernetes.client.openapi.models.V1Volume;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import io.kubernetes.client.openapi.JSON;

/**
 * PodSpec is a description of a pod.
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-23T13:45:09.091597Z[Etc/UTC]")
public class V1PodSpec {
  public static final String SERIALIZED_NAME_ACTIVE_DEADLINE_SECONDS = "activeDeadlineSeconds";
  @SerializedName(SERIALIZED_NAME_ACTIVE_DEADLINE_SECONDS)
  private Long activeDeadlineSeconds;

  public static final String SERIALIZED_NAME_AFFINITY = "affinity";
  @SerializedName(SERIALIZED_NAME_AFFINITY)
  private V1Affinity affinity;

  public static final String SERIALIZED_NAME_AUTOMOUNT_SERVICE_ACCOUNT_TOKEN = "automountServiceAccountToken";
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
  private List<V1EphemeralContainer> ephemeralContainers;

  public static final String SERIALIZED_NAME_HOST_ALIASES = "hostAliases";
  @SerializedName(SERIALIZED_NAME_HOST_ALIASES)
  private List<V1HostAlias> hostAliases;

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
  private List<V1LocalObjectReference> imagePullSecrets;

  public static final String SERIALIZED_NAME_INIT_CONTAINERS = "initContainers";
  @SerializedName(SERIALIZED_NAME_INIT_CONTAINERS)
  private List<V1Container> initContainers;

  public static final String SERIALIZED_NAME_NODE_NAME = "nodeName";
  @SerializedName(SERIALIZED_NAME_NODE_NAME)
  private String nodeName;

  public static final String SERIALIZED_NAME_NODE_SELECTOR = "nodeSelector";
  @SerializedName(SERIALIZED_NAME_NODE_SELECTOR)
  private Map<String, String> nodeSelector = new HashMap<>();

  public static final String SERIALIZED_NAME_OS = "os";
  @SerializedName(SERIALIZED_NAME_OS)
  private V1PodOS os;

  public static final String SERIALIZED_NAME_OVERHEAD = "overhead";
  @SerializedName(SERIALIZED_NAME_OVERHEAD)
  private Map<String, Quantity> overhead = new HashMap<>();

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
  private List<V1PodReadinessGate> readinessGates;

  public static final String SERIALIZED_NAME_RESOURCE_CLAIMS = "resourceClaims";
  @SerializedName(SERIALIZED_NAME_RESOURCE_CLAIMS)
  private List<V1PodResourceClaim> resourceClaims;

  public static final String SERIALIZED_NAME_RESTART_POLICY = "restartPolicy";
  @SerializedName(SERIALIZED_NAME_RESTART_POLICY)
  private String restartPolicy;

  public static final String SERIALIZED_NAME_RUNTIME_CLASS_NAME = "runtimeClassName";
  @SerializedName(SERIALIZED_NAME_RUNTIME_CLASS_NAME)
  private String runtimeClassName;

  public static final String SERIALIZED_NAME_SCHEDULER_NAME = "schedulerName";
  @SerializedName(SERIALIZED_NAME_SCHEDULER_NAME)
  private String schedulerName;

  public static final String SERIALIZED_NAME_SCHEDULING_GATES = "schedulingGates";
  @SerializedName(SERIALIZED_NAME_SCHEDULING_GATES)
  private List<V1PodSchedulingGate> schedulingGates;

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

  public static final String SERIALIZED_NAME_TERMINATION_GRACE_PERIOD_SECONDS = "terminationGracePeriodSeconds";
  @SerializedName(SERIALIZED_NAME_TERMINATION_GRACE_PERIOD_SECONDS)
  private Long terminationGracePeriodSeconds;

  public static final String SERIALIZED_NAME_TOLERATIONS = "tolerations";
  @SerializedName(SERIALIZED_NAME_TOLERATIONS)
  private List<V1Toleration> tolerations;

  public static final String SERIALIZED_NAME_TOPOLOGY_SPREAD_CONSTRAINTS = "topologySpreadConstraints";
  @SerializedName(SERIALIZED_NAME_TOPOLOGY_SPREAD_CONSTRAINTS)
  private List<V1TopologySpreadConstraint> topologySpreadConstraints;

  public static final String SERIALIZED_NAME_VOLUMES = "volumes";
  @SerializedName(SERIALIZED_NAME_VOLUMES)
  private List<V1Volume> volumes;

  public V1PodSpec() {
  }

  public V1PodSpec activeDeadlineSeconds(Long activeDeadlineSeconds) {

    this.activeDeadlineSeconds = activeDeadlineSeconds;
    return this;
  }

   /**
   * Optional duration in seconds the pod may be active on the node relative to StartTime before the system will actively try to mark it failed and kill associated containers. Value must be a positive integer.
   * @return activeDeadlineSeconds
  **/
  @jakarta.annotation.Nullable
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
   * @return affinity
  **/
  @jakarta.annotation.Nullable
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
   * AutomountServiceAccountToken indicates whether a service account token should be automatically mounted.
   * @return automountServiceAccountToken
  **/
  @jakarta.annotation.Nullable
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
    if (this.containers == null) {
      this.containers = new ArrayList<>();
    }
    this.containers.add(containersItem);
    return this;
  }

   /**
   * List of containers belonging to the pod. Containers cannot currently be added or removed. There must be at least one container in a Pod. Cannot be updated.
   * @return containers
  **/
  @jakarta.annotation.Nonnull
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
   * @return dnsConfig
  **/
  @jakarta.annotation.Nullable
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
   * Set DNS policy for the pod. Defaults to \&quot;ClusterFirst\&quot;. Valid values are &#39;ClusterFirstWithHostNet&#39;, &#39;ClusterFirst&#39;, &#39;Default&#39; or &#39;None&#39;. DNS parameters given in DNSConfig will be merged with the policy selected with DNSPolicy. To have DNS options set along with hostNetwork, you have to specify DNS policy explicitly to &#39;ClusterFirstWithHostNet&#39;.
   * @return dnsPolicy
  **/
  @jakarta.annotation.Nullable
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
   * EnableServiceLinks indicates whether information about services should be injected into pod&#39;s environment variables, matching the syntax of Docker links. Optional: Defaults to true.
   * @return enableServiceLinks
  **/
  @jakarta.annotation.Nullable
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
   * List of ephemeral containers run in this pod. Ephemeral containers may be run in an existing pod to perform user-initiated actions such as debugging. This list cannot be specified when creating a pod, and it cannot be modified by updating the pod spec. In order to add an ephemeral container to an existing pod, use the pod&#39;s ephemeralcontainers subresource.
   * @return ephemeralContainers
  **/
  @jakarta.annotation.Nullable
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
   * HostAliases is an optional list of hosts and IPs that will be injected into the pod&#39;s hosts file if specified.
   * @return hostAliases
  **/
  @jakarta.annotation.Nullable
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
   * @return hostIPC
  **/
  @jakarta.annotation.Nullable
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
   * Host networking requested for this pod. Use the host&#39;s network namespace. If this option is set, the ports that will be used must be specified. Default to false.
   * @return hostNetwork
  **/
  @jakarta.annotation.Nullable
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
   * @return hostPID
  **/
  @jakarta.annotation.Nullable
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
   * Use the host&#39;s user namespace. Optional: Default to true. If set to true or not present, the pod will be run in the host user namespace, useful for when the pod needs a feature only available to the host user namespace, such as loading a kernel module with CAP_SYS_MODULE. When set to false, a new userns is created for the pod. Setting false is useful for mitigating container breakout vulnerabilities even allowing users to run their containers as root without actually having root privileges on the host. This field is alpha-level and is only honored by servers that enable the UserNamespacesSupport feature.
   * @return hostUsers
  **/
  @jakarta.annotation.Nullable
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
   * Specifies the hostname of the Pod If not specified, the pod&#39;s hostname will be set to a system-defined value.
   * @return hostname
  **/
  @jakarta.annotation.Nullable
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
   * ImagePullSecrets is an optional list of references to secrets in the same namespace to use for pulling any of the images used by this PodSpec. If specified, these secrets will be passed to individual puller implementations for them to use. More info: https://kubernetes.io/docs/concepts/containers/images#specifying-imagepullsecrets-on-a-pod
   * @return imagePullSecrets
  **/
  @jakarta.annotation.Nullable
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
   * List of initialization containers belonging to the pod. Init containers are executed in order prior to containers being started. If any init container fails, the pod is considered to have failed and is handled according to its restartPolicy. The name for an init container or normal container must be unique among all containers. Init containers may not have Lifecycle actions, Readiness probes, Liveness probes, or Startup probes. The resourceRequirements of an init container are taken into account during scheduling by finding the highest request/limit for each resource type, and then using the max of of that value or the sum of the normal containers. Limits are applied to init containers in a similar fashion. Init containers cannot currently be added or removed. Cannot be updated. More info: https://kubernetes.io/docs/concepts/workloads/pods/init-containers/
   * @return initContainers
  **/
  @jakarta.annotation.Nullable
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
   * NodeName is a request to schedule this pod onto a specific node. If it is non-empty, the scheduler simply schedules this pod onto that node, assuming that it fits resource requirements.
   * @return nodeName
  **/
  @jakarta.annotation.Nullable
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
   * NodeSelector is a selector which must be true for the pod to fit on a node. Selector which must match a node&#39;s labels for the pod to be scheduled on that node. More info: https://kubernetes.io/docs/concepts/configuration/assign-pod-node/
   * @return nodeSelector
  **/
  @jakarta.annotation.Nullable
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
   * @return os
  **/
  @jakarta.annotation.Nullable
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
   * Overhead represents the resource overhead associated with running a pod for a given RuntimeClass. This field will be autopopulated at admission time by the RuntimeClass admission controller. If the RuntimeClass admission controller is enabled, overhead must not be set in Pod create requests. The RuntimeClass admission controller will reject Pod create requests which have the overhead already set. If RuntimeClass is configured and selected in the PodSpec, Overhead will be set to the value defined in the corresponding RuntimeClass, otherwise it will remain unset and treated as zero. More info: https://git.k8s.io/enhancements/keps/sig-node/688-pod-overhead/README.md
   * @return overhead
  **/
  @jakarta.annotation.Nullable
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
   * PreemptionPolicy is the Policy for preempting pods with lower priority. One of Never, PreemptLowerPriority. Defaults to PreemptLowerPriority if unset.
   * @return preemptionPolicy
  **/
  @jakarta.annotation.Nullable
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
   * The priority value. Various system components use this field to find the priority of the pod. When Priority Admission Controller is enabled, it prevents users from setting this field. The admission controller populates this field from PriorityClassName. The higher the value, the higher the priority.
   * @return priority
  **/
  @jakarta.annotation.Nullable
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
   * If specified, indicates the pod&#39;s priority. \&quot;system-node-critical\&quot; and \&quot;system-cluster-critical\&quot; are two special keywords which indicate the highest priorities with the former being the highest priority. Any other name must be defined by creating a PriorityClass object with that name. If not specified, the pod priority will be default or zero if there is no default.
   * @return priorityClassName
  **/
  @jakarta.annotation.Nullable
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
   * If specified, all readiness gates will be evaluated for pod readiness. A pod is ready when all its containers are ready AND all conditions specified in the readiness gates have status equal to \&quot;True\&quot; More info: https://git.k8s.io/enhancements/keps/sig-network/580-pod-readiness-gates
   * @return readinessGates
  **/
  @jakarta.annotation.Nullable
  public List<V1PodReadinessGate> getReadinessGates() {
    return readinessGates;
  }


  public void setReadinessGates(List<V1PodReadinessGate> readinessGates) {
    this.readinessGates = readinessGates;
  }


  public V1PodSpec resourceClaims(List<V1PodResourceClaim> resourceClaims) {

    this.resourceClaims = resourceClaims;
    return this;
  }

  public V1PodSpec addResourceClaimsItem(V1PodResourceClaim resourceClaimsItem) {
    if (this.resourceClaims == null) {
      this.resourceClaims = new ArrayList<>();
    }
    this.resourceClaims.add(resourceClaimsItem);
    return this;
  }

   /**
   * ResourceClaims defines which ResourceClaims must be allocated and reserved before the Pod is allowed to start. The resources will be made available to those containers which consume them by name.  This is an alpha field and requires enabling the DynamicResourceAllocation feature gate.  This field is immutable.
   * @return resourceClaims
  **/
  @jakarta.annotation.Nullable
  public List<V1PodResourceClaim> getResourceClaims() {
    return resourceClaims;
  }


  public void setResourceClaims(List<V1PodResourceClaim> resourceClaims) {
    this.resourceClaims = resourceClaims;
  }


  public V1PodSpec restartPolicy(String restartPolicy) {

    this.restartPolicy = restartPolicy;
    return this;
  }

   /**
   * Restart policy for all containers within the pod. One of Always, OnFailure, Never. In some contexts, only a subset of those values may be permitted. Default to Always. More info: https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle/#restart-policy
   * @return restartPolicy
  **/
  @jakarta.annotation.Nullable
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
   * RuntimeClassName refers to a RuntimeClass object in the node.k8s.io group, which should be used to run this pod.  If no RuntimeClass resource matches the named class, the pod will not be run. If unset or empty, the \&quot;legacy\&quot; RuntimeClass will be used, which is an implicit class with an empty definition that uses the default runtime handler. More info: https://git.k8s.io/enhancements/keps/sig-node/585-runtime-class
   * @return runtimeClassName
  **/
  @jakarta.annotation.Nullable
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
   * If specified, the pod will be dispatched by specified scheduler. If not specified, the pod will be dispatched by default scheduler.
   * @return schedulerName
  **/
  @jakarta.annotation.Nullable
  public String getSchedulerName() {
    return schedulerName;
  }


  public void setSchedulerName(String schedulerName) {
    this.schedulerName = schedulerName;
  }


  public V1PodSpec schedulingGates(List<V1PodSchedulingGate> schedulingGates) {

    this.schedulingGates = schedulingGates;
    return this;
  }

  public V1PodSpec addSchedulingGatesItem(V1PodSchedulingGate schedulingGatesItem) {
    if (this.schedulingGates == null) {
      this.schedulingGates = new ArrayList<>();
    }
    this.schedulingGates.add(schedulingGatesItem);
    return this;
  }

   /**
   * SchedulingGates is an opaque list of values that if specified will block scheduling the pod. If schedulingGates is not empty, the pod will stay in the SchedulingGated state and the scheduler will not attempt to schedule the pod.  SchedulingGates can only be set at pod creation time, and be removed only afterwards.
   * @return schedulingGates
  **/
  @jakarta.annotation.Nullable
  public List<V1PodSchedulingGate> getSchedulingGates() {
    return schedulingGates;
  }


  public void setSchedulingGates(List<V1PodSchedulingGate> schedulingGates) {
    this.schedulingGates = schedulingGates;
  }


  public V1PodSpec securityContext(V1PodSecurityContext securityContext) {

    this.securityContext = securityContext;
    return this;
  }

   /**
   * Get securityContext
   * @return securityContext
  **/
  @jakarta.annotation.Nullable
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
   * DeprecatedServiceAccount is a deprecated alias for ServiceAccountName. Deprecated: Use serviceAccountName instead.
   * @return serviceAccount
  **/
  @jakarta.annotation.Nullable
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
   * ServiceAccountName is the name of the ServiceAccount to use to run this pod. More info: https://kubernetes.io/docs/tasks/configure-pod-container/configure-service-account/
   * @return serviceAccountName
  **/
  @jakarta.annotation.Nullable
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
   * If true the pod&#39;s hostname will be configured as the pod&#39;s FQDN, rather than the leaf name (the default). In Linux containers, this means setting the FQDN in the hostname field of the kernel (the nodename field of struct utsname). In Windows containers, this means setting the registry value of hostname for the registry key HKEY_LOCAL_MACHINE\\SYSTEM\\CurrentControlSet\\Services\\Tcpip\\Parameters to FQDN. If a pod does not have FQDN, this has no effect. Default to false.
   * @return setHostnameAsFQDN
  **/
  @jakarta.annotation.Nullable
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
   * Share a single process namespace between all of the containers in a pod. When this is set containers will be able to view and signal processes from other containers in the same pod, and the first process in each container will not be assigned PID 1. HostPID and ShareProcessNamespace cannot both be set. Optional: Default to false.
   * @return shareProcessNamespace
  **/
  @jakarta.annotation.Nullable
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
   * If specified, the fully qualified Pod hostname will be \&quot;&lt;hostname&gt;.&lt;subdomain&gt;.&lt;pod namespace&gt;.svc.&lt;cluster domain&gt;\&quot;. If not specified, the pod will not have a domainname at all.
   * @return subdomain
  **/
  @jakarta.annotation.Nullable
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
   * Optional duration in seconds the pod needs to terminate gracefully. May be decreased in delete request. Value must be non-negative integer. The value zero indicates stop immediately via the kill signal (no opportunity to shut down). If this value is nil, the default grace period will be used instead. The grace period is the duration in seconds after the processes running in the pod are sent a termination signal and the time when the processes are forcibly halted with a kill signal. Set this value longer than the expected cleanup time for your process. Defaults to 30 seconds.
   * @return terminationGracePeriodSeconds
  **/
  @jakarta.annotation.Nullable
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
   * @return tolerations
  **/
  @jakarta.annotation.Nullable
  public List<V1Toleration> getTolerations() {
    return tolerations;
  }


  public void setTolerations(List<V1Toleration> tolerations) {
    this.tolerations = tolerations;
  }


  public V1PodSpec topologySpreadConstraints(List<V1TopologySpreadConstraint> topologySpreadConstraints) {

    this.topologySpreadConstraints = topologySpreadConstraints;
    return this;
  }

  public V1PodSpec addTopologySpreadConstraintsItem(V1TopologySpreadConstraint topologySpreadConstraintsItem) {
    if (this.topologySpreadConstraints == null) {
      this.topologySpreadConstraints = new ArrayList<>();
    }
    this.topologySpreadConstraints.add(topologySpreadConstraintsItem);
    return this;
  }

   /**
   * TopologySpreadConstraints describes how a group of pods ought to spread across topology domains. Scheduler will schedule pods in a way which abides by the constraints. All topologySpreadConstraints are ANDed.
   * @return topologySpreadConstraints
  **/
  @jakarta.annotation.Nullable
  public List<V1TopologySpreadConstraint> getTopologySpreadConstraints() {
    return topologySpreadConstraints;
  }


  public void setTopologySpreadConstraints(List<V1TopologySpreadConstraint> topologySpreadConstraints) {
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
   * List of volumes that can be mounted by containers belonging to the pod. More info: https://kubernetes.io/docs/concepts/storage/volumes
   * @return volumes
  **/
  @jakarta.annotation.Nullable
  public List<V1Volume> getVolumes() {
    return volumes;
  }


  public void setVolumes(List<V1Volume> volumes) {
    this.volumes = volumes;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1PodSpec v1PodSpec = (V1PodSpec) o;
    return Objects.equals(this.activeDeadlineSeconds, v1PodSpec.activeDeadlineSeconds) &&
        Objects.equals(this.affinity, v1PodSpec.affinity) &&
        Objects.equals(this.automountServiceAccountToken, v1PodSpec.automountServiceAccountToken) &&
        Objects.equals(this.containers, v1PodSpec.containers) &&
        Objects.equals(this.dnsConfig, v1PodSpec.dnsConfig) &&
        Objects.equals(this.dnsPolicy, v1PodSpec.dnsPolicy) &&
        Objects.equals(this.enableServiceLinks, v1PodSpec.enableServiceLinks) &&
        Objects.equals(this.ephemeralContainers, v1PodSpec.ephemeralContainers) &&
        Objects.equals(this.hostAliases, v1PodSpec.hostAliases) &&
        Objects.equals(this.hostIPC, v1PodSpec.hostIPC) &&
        Objects.equals(this.hostNetwork, v1PodSpec.hostNetwork) &&
        Objects.equals(this.hostPID, v1PodSpec.hostPID) &&
        Objects.equals(this.hostUsers, v1PodSpec.hostUsers) &&
        Objects.equals(this.hostname, v1PodSpec.hostname) &&
        Objects.equals(this.imagePullSecrets, v1PodSpec.imagePullSecrets) &&
        Objects.equals(this.initContainers, v1PodSpec.initContainers) &&
        Objects.equals(this.nodeName, v1PodSpec.nodeName) &&
        Objects.equals(this.nodeSelector, v1PodSpec.nodeSelector) &&
        Objects.equals(this.os, v1PodSpec.os) &&
        Objects.equals(this.overhead, v1PodSpec.overhead) &&
        Objects.equals(this.preemptionPolicy, v1PodSpec.preemptionPolicy) &&
        Objects.equals(this.priority, v1PodSpec.priority) &&
        Objects.equals(this.priorityClassName, v1PodSpec.priorityClassName) &&
        Objects.equals(this.readinessGates, v1PodSpec.readinessGates) &&
        Objects.equals(this.resourceClaims, v1PodSpec.resourceClaims) &&
        Objects.equals(this.restartPolicy, v1PodSpec.restartPolicy) &&
        Objects.equals(this.runtimeClassName, v1PodSpec.runtimeClassName) &&
        Objects.equals(this.schedulerName, v1PodSpec.schedulerName) &&
        Objects.equals(this.schedulingGates, v1PodSpec.schedulingGates) &&
        Objects.equals(this.securityContext, v1PodSpec.securityContext) &&
        Objects.equals(this.serviceAccount, v1PodSpec.serviceAccount) &&
        Objects.equals(this.serviceAccountName, v1PodSpec.serviceAccountName) &&
        Objects.equals(this.setHostnameAsFQDN, v1PodSpec.setHostnameAsFQDN) &&
        Objects.equals(this.shareProcessNamespace, v1PodSpec.shareProcessNamespace) &&
        Objects.equals(this.subdomain, v1PodSpec.subdomain) &&
        Objects.equals(this.terminationGracePeriodSeconds, v1PodSpec.terminationGracePeriodSeconds) &&
        Objects.equals(this.tolerations, v1PodSpec.tolerations) &&
        Objects.equals(this.topologySpreadConstraints, v1PodSpec.topologySpreadConstraints) &&
        Objects.equals(this.volumes, v1PodSpec.volumes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(activeDeadlineSeconds, affinity, automountServiceAccountToken, containers, dnsConfig, dnsPolicy, enableServiceLinks, ephemeralContainers, hostAliases, hostIPC, hostNetwork, hostPID, hostUsers, hostname, imagePullSecrets, initContainers, nodeName, nodeSelector, os, overhead, preemptionPolicy, priority, priorityClassName, readinessGates, resourceClaims, restartPolicy, runtimeClassName, schedulerName, schedulingGates, securityContext, serviceAccount, serviceAccountName, setHostnameAsFQDN, shareProcessNamespace, subdomain, terminationGracePeriodSeconds, tolerations, topologySpreadConstraints, volumes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1PodSpec {\n");
    sb.append("    activeDeadlineSeconds: ").append(toIndentedString(activeDeadlineSeconds)).append("\n");
    sb.append("    affinity: ").append(toIndentedString(affinity)).append("\n");
    sb.append("    automountServiceAccountToken: ").append(toIndentedString(automountServiceAccountToken)).append("\n");
    sb.append("    containers: ").append(toIndentedString(containers)).append("\n");
    sb.append("    dnsConfig: ").append(toIndentedString(dnsConfig)).append("\n");
    sb.append("    dnsPolicy: ").append(toIndentedString(dnsPolicy)).append("\n");
    sb.append("    enableServiceLinks: ").append(toIndentedString(enableServiceLinks)).append("\n");
    sb.append("    ephemeralContainers: ").append(toIndentedString(ephemeralContainers)).append("\n");
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
    sb.append("    resourceClaims: ").append(toIndentedString(resourceClaims)).append("\n");
    sb.append("    restartPolicy: ").append(toIndentedString(restartPolicy)).append("\n");
    sb.append("    runtimeClassName: ").append(toIndentedString(runtimeClassName)).append("\n");
    sb.append("    schedulerName: ").append(toIndentedString(schedulerName)).append("\n");
    sb.append("    schedulingGates: ").append(toIndentedString(schedulingGates)).append("\n");
    sb.append("    securityContext: ").append(toIndentedString(securityContext)).append("\n");
    sb.append("    serviceAccount: ").append(toIndentedString(serviceAccount)).append("\n");
    sb.append("    serviceAccountName: ").append(toIndentedString(serviceAccountName)).append("\n");
    sb.append("    setHostnameAsFQDN: ").append(toIndentedString(setHostnameAsFQDN)).append("\n");
    sb.append("    shareProcessNamespace: ").append(toIndentedString(shareProcessNamespace)).append("\n");
    sb.append("    subdomain: ").append(toIndentedString(subdomain)).append("\n");
    sb.append("    terminationGracePeriodSeconds: ").append(toIndentedString(terminationGracePeriodSeconds)).append("\n");
    sb.append("    tolerations: ").append(toIndentedString(tolerations)).append("\n");
    sb.append("    topologySpreadConstraints: ").append(toIndentedString(topologySpreadConstraints)).append("\n");
    sb.append("    volumes: ").append(toIndentedString(volumes)).append("\n");
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
    openapiFields.add("activeDeadlineSeconds");
    openapiFields.add("affinity");
    openapiFields.add("automountServiceAccountToken");
    openapiFields.add("containers");
    openapiFields.add("dnsConfig");
    openapiFields.add("dnsPolicy");
    openapiFields.add("enableServiceLinks");
    openapiFields.add("ephemeralContainers");
    openapiFields.add("hostAliases");
    openapiFields.add("hostIPC");
    openapiFields.add("hostNetwork");
    openapiFields.add("hostPID");
    openapiFields.add("hostUsers");
    openapiFields.add("hostname");
    openapiFields.add("imagePullSecrets");
    openapiFields.add("initContainers");
    openapiFields.add("nodeName");
    openapiFields.add("nodeSelector");
    openapiFields.add("os");
    openapiFields.add("overhead");
    openapiFields.add("preemptionPolicy");
    openapiFields.add("priority");
    openapiFields.add("priorityClassName");
    openapiFields.add("readinessGates");
    openapiFields.add("resourceClaims");
    openapiFields.add("restartPolicy");
    openapiFields.add("runtimeClassName");
    openapiFields.add("schedulerName");
    openapiFields.add("schedulingGates");
    openapiFields.add("securityContext");
    openapiFields.add("serviceAccount");
    openapiFields.add("serviceAccountName");
    openapiFields.add("setHostnameAsFQDN");
    openapiFields.add("shareProcessNamespace");
    openapiFields.add("subdomain");
    openapiFields.add("terminationGracePeriodSeconds");
    openapiFields.add("tolerations");
    openapiFields.add("topologySpreadConstraints");
    openapiFields.add("volumes");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("containers");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to V1PodSpec
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!V1PodSpec.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in V1PodSpec is not found in the empty JSON string", V1PodSpec.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!V1PodSpec.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `V1PodSpec` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : V1PodSpec.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      // validate the optional field `affinity`
      if (jsonObj.get("affinity") != null && !jsonObj.get("affinity").isJsonNull()) {
        V1Affinity.validateJsonObject(jsonObj.getAsJsonObject("affinity"));
      }
      // ensure the json data is an array
      if (!jsonObj.get("containers").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `containers` to be an array in the JSON string but got `%s`", jsonObj.get("containers").toString()));
      }

      JsonArray jsonArraycontainers = jsonObj.getAsJsonArray("containers");
      // validate the required field `containers` (array)
      for (int i = 0; i < jsonArraycontainers.size(); i++) {
        V1Container.validateJsonObject(jsonArraycontainers.get(i).getAsJsonObject());
      };
      // validate the optional field `dnsConfig`
      if (jsonObj.get("dnsConfig") != null && !jsonObj.get("dnsConfig").isJsonNull()) {
        V1PodDNSConfig.validateJsonObject(jsonObj.getAsJsonObject("dnsConfig"));
      }
      if ((jsonObj.get("dnsPolicy") != null && !jsonObj.get("dnsPolicy").isJsonNull()) && !jsonObj.get("dnsPolicy").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `dnsPolicy` to be a primitive type in the JSON string but got `%s`", jsonObj.get("dnsPolicy").toString()));
      }
      if (jsonObj.get("ephemeralContainers") != null && !jsonObj.get("ephemeralContainers").isJsonNull()) {
        JsonArray jsonArrayephemeralContainers = jsonObj.getAsJsonArray("ephemeralContainers");
        if (jsonArrayephemeralContainers != null) {
          // ensure the json data is an array
          if (!jsonObj.get("ephemeralContainers").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `ephemeralContainers` to be an array in the JSON string but got `%s`", jsonObj.get("ephemeralContainers").toString()));
          }

          // validate the optional field `ephemeralContainers` (array)
          for (int i = 0; i < jsonArrayephemeralContainers.size(); i++) {
            V1EphemeralContainer.validateJsonObject(jsonArrayephemeralContainers.get(i).getAsJsonObject());
          };
        }
      }
      if (jsonObj.get("hostAliases") != null && !jsonObj.get("hostAliases").isJsonNull()) {
        JsonArray jsonArrayhostAliases = jsonObj.getAsJsonArray("hostAliases");
        if (jsonArrayhostAliases != null) {
          // ensure the json data is an array
          if (!jsonObj.get("hostAliases").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `hostAliases` to be an array in the JSON string but got `%s`", jsonObj.get("hostAliases").toString()));
          }

          // validate the optional field `hostAliases` (array)
          for (int i = 0; i < jsonArrayhostAliases.size(); i++) {
            V1HostAlias.validateJsonObject(jsonArrayhostAliases.get(i).getAsJsonObject());
          };
        }
      }
      if ((jsonObj.get("hostname") != null && !jsonObj.get("hostname").isJsonNull()) && !jsonObj.get("hostname").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `hostname` to be a primitive type in the JSON string but got `%s`", jsonObj.get("hostname").toString()));
      }
      if (jsonObj.get("imagePullSecrets") != null && !jsonObj.get("imagePullSecrets").isJsonNull()) {
        JsonArray jsonArrayimagePullSecrets = jsonObj.getAsJsonArray("imagePullSecrets");
        if (jsonArrayimagePullSecrets != null) {
          // ensure the json data is an array
          if (!jsonObj.get("imagePullSecrets").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `imagePullSecrets` to be an array in the JSON string but got `%s`", jsonObj.get("imagePullSecrets").toString()));
          }

          // validate the optional field `imagePullSecrets` (array)
          for (int i = 0; i < jsonArrayimagePullSecrets.size(); i++) {
            V1LocalObjectReference.validateJsonObject(jsonArrayimagePullSecrets.get(i).getAsJsonObject());
          };
        }
      }
      if (jsonObj.get("initContainers") != null && !jsonObj.get("initContainers").isJsonNull()) {
        JsonArray jsonArrayinitContainers = jsonObj.getAsJsonArray("initContainers");
        if (jsonArrayinitContainers != null) {
          // ensure the json data is an array
          if (!jsonObj.get("initContainers").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `initContainers` to be an array in the JSON string but got `%s`", jsonObj.get("initContainers").toString()));
          }

          // validate the optional field `initContainers` (array)
          for (int i = 0; i < jsonArrayinitContainers.size(); i++) {
            V1Container.validateJsonObject(jsonArrayinitContainers.get(i).getAsJsonObject());
          };
        }
      }
      if ((jsonObj.get("nodeName") != null && !jsonObj.get("nodeName").isJsonNull()) && !jsonObj.get("nodeName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `nodeName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("nodeName").toString()));
      }
      // validate the optional field `os`
      if (jsonObj.get("os") != null && !jsonObj.get("os").isJsonNull()) {
        V1PodOS.validateJsonObject(jsonObj.getAsJsonObject("os"));
      }
      if ((jsonObj.get("preemptionPolicy") != null && !jsonObj.get("preemptionPolicy").isJsonNull()) && !jsonObj.get("preemptionPolicy").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `preemptionPolicy` to be a primitive type in the JSON string but got `%s`", jsonObj.get("preemptionPolicy").toString()));
      }
      if ((jsonObj.get("priorityClassName") != null && !jsonObj.get("priorityClassName").isJsonNull()) && !jsonObj.get("priorityClassName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `priorityClassName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("priorityClassName").toString()));
      }
      if (jsonObj.get("readinessGates") != null && !jsonObj.get("readinessGates").isJsonNull()) {
        JsonArray jsonArrayreadinessGates = jsonObj.getAsJsonArray("readinessGates");
        if (jsonArrayreadinessGates != null) {
          // ensure the json data is an array
          if (!jsonObj.get("readinessGates").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `readinessGates` to be an array in the JSON string but got `%s`", jsonObj.get("readinessGates").toString()));
          }

          // validate the optional field `readinessGates` (array)
          for (int i = 0; i < jsonArrayreadinessGates.size(); i++) {
            V1PodReadinessGate.validateJsonObject(jsonArrayreadinessGates.get(i).getAsJsonObject());
          };
        }
      }
      if (jsonObj.get("resourceClaims") != null && !jsonObj.get("resourceClaims").isJsonNull()) {
        JsonArray jsonArrayresourceClaims = jsonObj.getAsJsonArray("resourceClaims");
        if (jsonArrayresourceClaims != null) {
          // ensure the json data is an array
          if (!jsonObj.get("resourceClaims").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `resourceClaims` to be an array in the JSON string but got `%s`", jsonObj.get("resourceClaims").toString()));
          }

          // validate the optional field `resourceClaims` (array)
          for (int i = 0; i < jsonArrayresourceClaims.size(); i++) {
            V1PodResourceClaim.validateJsonObject(jsonArrayresourceClaims.get(i).getAsJsonObject());
          };
        }
      }
      if ((jsonObj.get("restartPolicy") != null && !jsonObj.get("restartPolicy").isJsonNull()) && !jsonObj.get("restartPolicy").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `restartPolicy` to be a primitive type in the JSON string but got `%s`", jsonObj.get("restartPolicy").toString()));
      }
      if ((jsonObj.get("runtimeClassName") != null && !jsonObj.get("runtimeClassName").isJsonNull()) && !jsonObj.get("runtimeClassName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `runtimeClassName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("runtimeClassName").toString()));
      }
      if ((jsonObj.get("schedulerName") != null && !jsonObj.get("schedulerName").isJsonNull()) && !jsonObj.get("schedulerName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `schedulerName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("schedulerName").toString()));
      }
      if (jsonObj.get("schedulingGates") != null && !jsonObj.get("schedulingGates").isJsonNull()) {
        JsonArray jsonArrayschedulingGates = jsonObj.getAsJsonArray("schedulingGates");
        if (jsonArrayschedulingGates != null) {
          // ensure the json data is an array
          if (!jsonObj.get("schedulingGates").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `schedulingGates` to be an array in the JSON string but got `%s`", jsonObj.get("schedulingGates").toString()));
          }

          // validate the optional field `schedulingGates` (array)
          for (int i = 0; i < jsonArrayschedulingGates.size(); i++) {
            V1PodSchedulingGate.validateJsonObject(jsonArrayschedulingGates.get(i).getAsJsonObject());
          };
        }
      }
      // validate the optional field `securityContext`
      if (jsonObj.get("securityContext") != null && !jsonObj.get("securityContext").isJsonNull()) {
        V1PodSecurityContext.validateJsonObject(jsonObj.getAsJsonObject("securityContext"));
      }
      if ((jsonObj.get("serviceAccount") != null && !jsonObj.get("serviceAccount").isJsonNull()) && !jsonObj.get("serviceAccount").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `serviceAccount` to be a primitive type in the JSON string but got `%s`", jsonObj.get("serviceAccount").toString()));
      }
      if ((jsonObj.get("serviceAccountName") != null && !jsonObj.get("serviceAccountName").isJsonNull()) && !jsonObj.get("serviceAccountName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `serviceAccountName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("serviceAccountName").toString()));
      }
      if ((jsonObj.get("subdomain") != null && !jsonObj.get("subdomain").isJsonNull()) && !jsonObj.get("subdomain").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `subdomain` to be a primitive type in the JSON string but got `%s`", jsonObj.get("subdomain").toString()));
      }
      if (jsonObj.get("tolerations") != null && !jsonObj.get("tolerations").isJsonNull()) {
        JsonArray jsonArraytolerations = jsonObj.getAsJsonArray("tolerations");
        if (jsonArraytolerations != null) {
          // ensure the json data is an array
          if (!jsonObj.get("tolerations").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `tolerations` to be an array in the JSON string but got `%s`", jsonObj.get("tolerations").toString()));
          }

          // validate the optional field `tolerations` (array)
          for (int i = 0; i < jsonArraytolerations.size(); i++) {
            V1Toleration.validateJsonObject(jsonArraytolerations.get(i).getAsJsonObject());
          };
        }
      }
      if (jsonObj.get("topologySpreadConstraints") != null && !jsonObj.get("topologySpreadConstraints").isJsonNull()) {
        JsonArray jsonArraytopologySpreadConstraints = jsonObj.getAsJsonArray("topologySpreadConstraints");
        if (jsonArraytopologySpreadConstraints != null) {
          // ensure the json data is an array
          if (!jsonObj.get("topologySpreadConstraints").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `topologySpreadConstraints` to be an array in the JSON string but got `%s`", jsonObj.get("topologySpreadConstraints").toString()));
          }

          // validate the optional field `topologySpreadConstraints` (array)
          for (int i = 0; i < jsonArraytopologySpreadConstraints.size(); i++) {
            V1TopologySpreadConstraint.validateJsonObject(jsonArraytopologySpreadConstraints.get(i).getAsJsonObject());
          };
        }
      }
      if (jsonObj.get("volumes") != null && !jsonObj.get("volumes").isJsonNull()) {
        JsonArray jsonArrayvolumes = jsonObj.getAsJsonArray("volumes");
        if (jsonArrayvolumes != null) {
          // ensure the json data is an array
          if (!jsonObj.get("volumes").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `volumes` to be an array in the JSON string but got `%s`", jsonObj.get("volumes").toString()));
          }

          // validate the optional field `volumes` (array)
          for (int i = 0; i < jsonArrayvolumes.size(); i++) {
            V1Volume.validateJsonObject(jsonArrayvolumes.get(i).getAsJsonObject());
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!V1PodSpec.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'V1PodSpec' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<V1PodSpec> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(V1PodSpec.class));

       return (TypeAdapter<T>) new TypeAdapter<V1PodSpec>() {
           @Override
           public void write(JsonWriter out, V1PodSpec value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public V1PodSpec read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of V1PodSpec given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of V1PodSpec
  * @throws IOException if the JSON string is invalid with respect to V1PodSpec
  */
  public static V1PodSpec fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, V1PodSpec.class);
  }

 /**
  * Convert an instance of V1PodSpec to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
