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
import io.kubernetes.client.openapi.models.V1ContainerStatus;
import io.kubernetes.client.openapi.models.V1HostIP;
import io.kubernetes.client.openapi.models.V1PodCondition;
import io.kubernetes.client.openapi.models.V1PodExtendedResourceClaimStatus;
import io.kubernetes.client.openapi.models.V1PodIP;
import io.kubernetes.client.openapi.models.V1PodResourceClaimStatus;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.time.OffsetDateTime;
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
 * PodStatus represents information about the status of a pod. Status may trail the actual state of a system, especially if the node that hosts the pod cannot contact the control plane.
 */
@ApiModel(description = "PodStatus represents information about the status of a pod. Status may trail the actual state of a system, especially if the node that hosts the pod cannot contact the control plane.")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-09-11T18:00:16.154662Z[Etc/UTC]", comments = "Generator version: 7.13.0")
public class V1PodStatus {
  public static final String SERIALIZED_NAME_CONDITIONS = "conditions";
  @SerializedName(SERIALIZED_NAME_CONDITIONS)
  @jakarta.annotation.Nullable
  private List<V1PodCondition> conditions = new ArrayList<>();

  public static final String SERIALIZED_NAME_CONTAINER_STATUSES = "containerStatuses";
  @SerializedName(SERIALIZED_NAME_CONTAINER_STATUSES)
  @jakarta.annotation.Nullable
  private List<V1ContainerStatus> containerStatuses = new ArrayList<>();

  public static final String SERIALIZED_NAME_EPHEMERAL_CONTAINER_STATUSES = "ephemeralContainerStatuses";
  @SerializedName(SERIALIZED_NAME_EPHEMERAL_CONTAINER_STATUSES)
  @jakarta.annotation.Nullable
  private List<V1ContainerStatus> ephemeralContainerStatuses = new ArrayList<>();

  public static final String SERIALIZED_NAME_EXTENDED_RESOURCE_CLAIM_STATUS = "extendedResourceClaimStatus";
  @SerializedName(SERIALIZED_NAME_EXTENDED_RESOURCE_CLAIM_STATUS)
  @jakarta.annotation.Nullable
  private V1PodExtendedResourceClaimStatus extendedResourceClaimStatus;

  public static final String SERIALIZED_NAME_HOST_I_P = "hostIP";
  @SerializedName(SERIALIZED_NAME_HOST_I_P)
  @jakarta.annotation.Nullable
  private String hostIP;

  public static final String SERIALIZED_NAME_HOST_I_PS = "hostIPs";
  @SerializedName(SERIALIZED_NAME_HOST_I_PS)
  @jakarta.annotation.Nullable
  private List<V1HostIP> hostIPs = new ArrayList<>();

  public static final String SERIALIZED_NAME_INIT_CONTAINER_STATUSES = "initContainerStatuses";
  @SerializedName(SERIALIZED_NAME_INIT_CONTAINER_STATUSES)
  @jakarta.annotation.Nullable
  private List<V1ContainerStatus> initContainerStatuses = new ArrayList<>();

  public static final String SERIALIZED_NAME_MESSAGE = "message";
  @SerializedName(SERIALIZED_NAME_MESSAGE)
  @jakarta.annotation.Nullable
  private String message;

  public static final String SERIALIZED_NAME_NOMINATED_NODE_NAME = "nominatedNodeName";
  @SerializedName(SERIALIZED_NAME_NOMINATED_NODE_NAME)
  @jakarta.annotation.Nullable
  private String nominatedNodeName;

  public static final String SERIALIZED_NAME_OBSERVED_GENERATION = "observedGeneration";
  @SerializedName(SERIALIZED_NAME_OBSERVED_GENERATION)
  @jakarta.annotation.Nullable
  private Long observedGeneration;

  public static final String SERIALIZED_NAME_PHASE = "phase";
  @SerializedName(SERIALIZED_NAME_PHASE)
  @jakarta.annotation.Nullable
  private String phase;

  public static final String SERIALIZED_NAME_POD_I_P = "podIP";
  @SerializedName(SERIALIZED_NAME_POD_I_P)
  @jakarta.annotation.Nullable
  private String podIP;

  public static final String SERIALIZED_NAME_POD_I_PS = "podIPs";
  @SerializedName(SERIALIZED_NAME_POD_I_PS)
  @jakarta.annotation.Nullable
  private List<V1PodIP> podIPs = new ArrayList<>();

  public static final String SERIALIZED_NAME_QOS_CLASS = "qosClass";
  @SerializedName(SERIALIZED_NAME_QOS_CLASS)
  @jakarta.annotation.Nullable
  private String qosClass;

  public static final String SERIALIZED_NAME_REASON = "reason";
  @SerializedName(SERIALIZED_NAME_REASON)
  @jakarta.annotation.Nullable
  private String reason;

  public static final String SERIALIZED_NAME_RESIZE = "resize";
  @SerializedName(SERIALIZED_NAME_RESIZE)
  @jakarta.annotation.Nullable
  private String resize;

  public static final String SERIALIZED_NAME_RESOURCE_CLAIM_STATUSES = "resourceClaimStatuses";
  @SerializedName(SERIALIZED_NAME_RESOURCE_CLAIM_STATUSES)
  @jakarta.annotation.Nullable
  private List<V1PodResourceClaimStatus> resourceClaimStatuses = new ArrayList<>();

  public static final String SERIALIZED_NAME_START_TIME = "startTime";
  @SerializedName(SERIALIZED_NAME_START_TIME)
  @jakarta.annotation.Nullable
  private OffsetDateTime startTime;

  public V1PodStatus() {
  }

  public V1PodStatus conditions(@jakarta.annotation.Nullable List<V1PodCondition> conditions) {
    this.conditions = conditions;
    return this;
  }

  public V1PodStatus addConditionsItem(V1PodCondition conditionsItem) {
    if (this.conditions == null) {
      this.conditions = new ArrayList<>();
    }
    this.conditions.add(conditionsItem);
    return this;
  }

  /**
   * Current service state of pod. More info: https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle#pod-conditions
   * @return conditions
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "Current service state of pod. More info: https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle#pod-conditions")
  public List<V1PodCondition> getConditions() {
    return conditions;
  }

  public void setConditions(@jakarta.annotation.Nullable List<V1PodCondition> conditions) {
    this.conditions = conditions;
  }


  public V1PodStatus containerStatuses(@jakarta.annotation.Nullable List<V1ContainerStatus> containerStatuses) {
    this.containerStatuses = containerStatuses;
    return this;
  }

  public V1PodStatus addContainerStatusesItem(V1ContainerStatus containerStatusesItem) {
    if (this.containerStatuses == null) {
      this.containerStatuses = new ArrayList<>();
    }
    this.containerStatuses.add(containerStatusesItem);
    return this;
  }

  /**
   * Statuses of containers in this pod. Each container in the pod should have at most one status in this list, and all statuses should be for containers in the pod. However this is not enforced. If a status for a non-existent container is present in the list, or the list has duplicate names, the behavior of various Kubernetes components is not defined and those statuses might be ignored. More info: https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle#pod-and-container-status
   * @return containerStatuses
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "Statuses of containers in this pod. Each container in the pod should have at most one status in this list, and all statuses should be for containers in the pod. However this is not enforced. If a status for a non-existent container is present in the list, or the list has duplicate names, the behavior of various Kubernetes components is not defined and those statuses might be ignored. More info: https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle#pod-and-container-status")
  public List<V1ContainerStatus> getContainerStatuses() {
    return containerStatuses;
  }

  public void setContainerStatuses(@jakarta.annotation.Nullable List<V1ContainerStatus> containerStatuses) {
    this.containerStatuses = containerStatuses;
  }


  public V1PodStatus ephemeralContainerStatuses(@jakarta.annotation.Nullable List<V1ContainerStatus> ephemeralContainerStatuses) {
    this.ephemeralContainerStatuses = ephemeralContainerStatuses;
    return this;
  }

  public V1PodStatus addEphemeralContainerStatusesItem(V1ContainerStatus ephemeralContainerStatusesItem) {
    if (this.ephemeralContainerStatuses == null) {
      this.ephemeralContainerStatuses = new ArrayList<>();
    }
    this.ephemeralContainerStatuses.add(ephemeralContainerStatusesItem);
    return this;
  }

  /**
   * Statuses for any ephemeral containers that have run in this pod. Each ephemeral container in the pod should have at most one status in this list, and all statuses should be for containers in the pod. However this is not enforced. If a status for a non-existent container is present in the list, or the list has duplicate names, the behavior of various Kubernetes components is not defined and those statuses might be ignored. More info: https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle#pod-and-container-status
   * @return ephemeralContainerStatuses
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "Statuses for any ephemeral containers that have run in this pod. Each ephemeral container in the pod should have at most one status in this list, and all statuses should be for containers in the pod. However this is not enforced. If a status for a non-existent container is present in the list, or the list has duplicate names, the behavior of various Kubernetes components is not defined and those statuses might be ignored. More info: https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle#pod-and-container-status")
  public List<V1ContainerStatus> getEphemeralContainerStatuses() {
    return ephemeralContainerStatuses;
  }

  public void setEphemeralContainerStatuses(@jakarta.annotation.Nullable List<V1ContainerStatus> ephemeralContainerStatuses) {
    this.ephemeralContainerStatuses = ephemeralContainerStatuses;
  }


  public V1PodStatus extendedResourceClaimStatus(@jakarta.annotation.Nullable V1PodExtendedResourceClaimStatus extendedResourceClaimStatus) {
    this.extendedResourceClaimStatus = extendedResourceClaimStatus;
    return this;
  }

  /**
   * Get extendedResourceClaimStatus
   * @return extendedResourceClaimStatus
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  public V1PodExtendedResourceClaimStatus getExtendedResourceClaimStatus() {
    return extendedResourceClaimStatus;
  }

  public void setExtendedResourceClaimStatus(@jakarta.annotation.Nullable V1PodExtendedResourceClaimStatus extendedResourceClaimStatus) {
    this.extendedResourceClaimStatus = extendedResourceClaimStatus;
  }


  public V1PodStatus hostIP(@jakarta.annotation.Nullable String hostIP) {
    this.hostIP = hostIP;
    return this;
  }

  /**
   * hostIP holds the IP address of the host to which the pod is assigned. Empty if the pod has not started yet. A pod can be assigned to a node that has a problem in kubelet which in turns mean that HostIP will not be updated even if there is a node is assigned to pod
   * @return hostIP
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "hostIP holds the IP address of the host to which the pod is assigned. Empty if the pod has not started yet. A pod can be assigned to a node that has a problem in kubelet which in turns mean that HostIP will not be updated even if there is a node is assigned to pod")
  public String getHostIP() {
    return hostIP;
  }

  public void setHostIP(@jakarta.annotation.Nullable String hostIP) {
    this.hostIP = hostIP;
  }


  public V1PodStatus hostIPs(@jakarta.annotation.Nullable List<V1HostIP> hostIPs) {
    this.hostIPs = hostIPs;
    return this;
  }

  public V1PodStatus addHostIPsItem(V1HostIP hostIPsItem) {
    if (this.hostIPs == null) {
      this.hostIPs = new ArrayList<>();
    }
    this.hostIPs.add(hostIPsItem);
    return this;
  }

  /**
   * hostIPs holds the IP addresses allocated to the host. If this field is specified, the first entry must match the hostIP field. This list is empty if the pod has not started yet. A pod can be assigned to a node that has a problem in kubelet which in turns means that HostIPs will not be updated even if there is a node is assigned to this pod.
   * @return hostIPs
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "hostIPs holds the IP addresses allocated to the host. If this field is specified, the first entry must match the hostIP field. This list is empty if the pod has not started yet. A pod can be assigned to a node that has a problem in kubelet which in turns means that HostIPs will not be updated even if there is a node is assigned to this pod.")
  public List<V1HostIP> getHostIPs() {
    return hostIPs;
  }

  public void setHostIPs(@jakarta.annotation.Nullable List<V1HostIP> hostIPs) {
    this.hostIPs = hostIPs;
  }


  public V1PodStatus initContainerStatuses(@jakarta.annotation.Nullable List<V1ContainerStatus> initContainerStatuses) {
    this.initContainerStatuses = initContainerStatuses;
    return this;
  }

  public V1PodStatus addInitContainerStatusesItem(V1ContainerStatus initContainerStatusesItem) {
    if (this.initContainerStatuses == null) {
      this.initContainerStatuses = new ArrayList<>();
    }
    this.initContainerStatuses.add(initContainerStatusesItem);
    return this;
  }

  /**
   * Statuses of init containers in this pod. The most recent successful non-restartable init container will have ready &#x3D; true, the most recently started container will have startTime set. Each init container in the pod should have at most one status in this list, and all statuses should be for containers in the pod. However this is not enforced. If a status for a non-existent container is present in the list, or the list has duplicate names, the behavior of various Kubernetes components is not defined and those statuses might be ignored. More info: https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle/#pod-and-container-status
   * @return initContainerStatuses
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "Statuses of init containers in this pod. The most recent successful non-restartable init container will have ready = true, the most recently started container will have startTime set. Each init container in the pod should have at most one status in this list, and all statuses should be for containers in the pod. However this is not enforced. If a status for a non-existent container is present in the list, or the list has duplicate names, the behavior of various Kubernetes components is not defined and those statuses might be ignored. More info: https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle/#pod-and-container-status")
  public List<V1ContainerStatus> getInitContainerStatuses() {
    return initContainerStatuses;
  }

  public void setInitContainerStatuses(@jakarta.annotation.Nullable List<V1ContainerStatus> initContainerStatuses) {
    this.initContainerStatuses = initContainerStatuses;
  }


  public V1PodStatus message(@jakarta.annotation.Nullable String message) {
    this.message = message;
    return this;
  }

  /**
   * A human readable message indicating details about why the pod is in this condition.
   * @return message
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "A human readable message indicating details about why the pod is in this condition.")
  public String getMessage() {
    return message;
  }

  public void setMessage(@jakarta.annotation.Nullable String message) {
    this.message = message;
  }


  public V1PodStatus nominatedNodeName(@jakarta.annotation.Nullable String nominatedNodeName) {
    this.nominatedNodeName = nominatedNodeName;
    return this;
  }

  /**
   * nominatedNodeName is set only when this pod preempts other pods on the node, but it cannot be scheduled right away as preemption victims receive their graceful termination periods. This field does not guarantee that the pod will be scheduled on this node. Scheduler may decide to place the pod elsewhere if other nodes become available sooner. Scheduler may also decide to give the resources on this node to a higher priority pod that is created after preemption. As a result, this field may be different than PodSpec.nodeName when the pod is scheduled.
   * @return nominatedNodeName
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "nominatedNodeName is set only when this pod preempts other pods on the node, but it cannot be scheduled right away as preemption victims receive their graceful termination periods. This field does not guarantee that the pod will be scheduled on this node. Scheduler may decide to place the pod elsewhere if other nodes become available sooner. Scheduler may also decide to give the resources on this node to a higher priority pod that is created after preemption. As a result, this field may be different than PodSpec.nodeName when the pod is scheduled.")
  public String getNominatedNodeName() {
    return nominatedNodeName;
  }

  public void setNominatedNodeName(@jakarta.annotation.Nullable String nominatedNodeName) {
    this.nominatedNodeName = nominatedNodeName;
  }


  public V1PodStatus observedGeneration(@jakarta.annotation.Nullable Long observedGeneration) {
    this.observedGeneration = observedGeneration;
    return this;
  }

  /**
   * If set, this represents the .metadata.generation that the pod status was set based upon. This is an alpha field. Enable PodObservedGenerationTracking to be able to use this field.
   * @return observedGeneration
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "If set, this represents the .metadata.generation that the pod status was set based upon. This is an alpha field. Enable PodObservedGenerationTracking to be able to use this field.")
  public Long getObservedGeneration() {
    return observedGeneration;
  }

  public void setObservedGeneration(@jakarta.annotation.Nullable Long observedGeneration) {
    this.observedGeneration = observedGeneration;
  }


  public V1PodStatus phase(@jakarta.annotation.Nullable String phase) {
    this.phase = phase;
    return this;
  }

  /**
   * The phase of a Pod is a simple, high-level summary of where the Pod is in its lifecycle. The conditions array, the reason and message fields, and the individual container status arrays contain more detail about the pod&#39;s status. There are five possible phase values:  Pending: The pod has been accepted by the Kubernetes system, but one or more of the container images has not been created. This includes time before being scheduled as well as time spent downloading images over the network, which could take a while. Running: The pod has been bound to a node, and all of the containers have been created. At least one container is still running, or is in the process of starting or restarting. Succeeded: All containers in the pod have terminated in success, and will not be restarted. Failed: All containers in the pod have terminated, and at least one container has terminated in failure. The container either exited with non-zero status or was terminated by the system. Unknown: For some reason the state of the pod could not be obtained, typically due to an error in communicating with the host of the pod.  More info: https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle#pod-phase
   * @return phase
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "The phase of a Pod is a simple, high-level summary of where the Pod is in its lifecycle. The conditions array, the reason and message fields, and the individual container status arrays contain more detail about the pod's status. There are five possible phase values:  Pending: The pod has been accepted by the Kubernetes system, but one or more of the container images has not been created. This includes time before being scheduled as well as time spent downloading images over the network, which could take a while. Running: The pod has been bound to a node, and all of the containers have been created. At least one container is still running, or is in the process of starting or restarting. Succeeded: All containers in the pod have terminated in success, and will not be restarted. Failed: All containers in the pod have terminated, and at least one container has terminated in failure. The container either exited with non-zero status or was terminated by the system. Unknown: For some reason the state of the pod could not be obtained, typically due to an error in communicating with the host of the pod.  More info: https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle#pod-phase")
  public String getPhase() {
    return phase;
  }

  public void setPhase(@jakarta.annotation.Nullable String phase) {
    this.phase = phase;
  }


  public V1PodStatus podIP(@jakarta.annotation.Nullable String podIP) {
    this.podIP = podIP;
    return this;
  }

  /**
   * podIP address allocated to the pod. Routable at least within the cluster. Empty if not yet allocated.
   * @return podIP
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "podIP address allocated to the pod. Routable at least within the cluster. Empty if not yet allocated.")
  public String getPodIP() {
    return podIP;
  }

  public void setPodIP(@jakarta.annotation.Nullable String podIP) {
    this.podIP = podIP;
  }


  public V1PodStatus podIPs(@jakarta.annotation.Nullable List<V1PodIP> podIPs) {
    this.podIPs = podIPs;
    return this;
  }

  public V1PodStatus addPodIPsItem(V1PodIP podIPsItem) {
    if (this.podIPs == null) {
      this.podIPs = new ArrayList<>();
    }
    this.podIPs.add(podIPsItem);
    return this;
  }

  /**
   * podIPs holds the IP addresses allocated to the pod. If this field is specified, the 0th entry must match the podIP field. Pods may be allocated at most 1 value for each of IPv4 and IPv6. This list is empty if no IPs have been allocated yet.
   * @return podIPs
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "podIPs holds the IP addresses allocated to the pod. If this field is specified, the 0th entry must match the podIP field. Pods may be allocated at most 1 value for each of IPv4 and IPv6. This list is empty if no IPs have been allocated yet.")
  public List<V1PodIP> getPodIPs() {
    return podIPs;
  }

  public void setPodIPs(@jakarta.annotation.Nullable List<V1PodIP> podIPs) {
    this.podIPs = podIPs;
  }


  public V1PodStatus qosClass(@jakarta.annotation.Nullable String qosClass) {
    this.qosClass = qosClass;
    return this;
  }

  /**
   * The Quality of Service (QOS) classification assigned to the pod based on resource requirements See PodQOSClass type for available QOS classes More info: https://kubernetes.io/docs/concepts/workloads/pods/pod-qos/#quality-of-service-classes
   * @return qosClass
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "The Quality of Service (QOS) classification assigned to the pod based on resource requirements See PodQOSClass type for available QOS classes More info: https://kubernetes.io/docs/concepts/workloads/pods/pod-qos/#quality-of-service-classes")
  public String getQosClass() {
    return qosClass;
  }

  public void setQosClass(@jakarta.annotation.Nullable String qosClass) {
    this.qosClass = qosClass;
  }


  public V1PodStatus reason(@jakarta.annotation.Nullable String reason) {
    this.reason = reason;
    return this;
  }

  /**
   * A brief CamelCase message indicating details about why the pod is in this state. e.g. &#39;Evicted&#39;
   * @return reason
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "A brief CamelCase message indicating details about why the pod is in this state. e.g. 'Evicted'")
  public String getReason() {
    return reason;
  }

  public void setReason(@jakarta.annotation.Nullable String reason) {
    this.reason = reason;
  }


  public V1PodStatus resize(@jakarta.annotation.Nullable String resize) {
    this.resize = resize;
    return this;
  }

  /**
   * Status of resources resize desired for pod&#39;s containers. It is empty if no resources resize is pending. Any changes to container resources will automatically set this to \&quot;Proposed\&quot; Deprecated: Resize status is moved to two pod conditions PodResizePending and PodResizeInProgress. PodResizePending will track states where the spec has been resized, but the Kubelet has not yet allocated the resources. PodResizeInProgress will track in-progress resizes, and should be present whenever allocated resources !&#x3D; acknowledged resources.
   * @return resize
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "Status of resources resize desired for pod's containers. It is empty if no resources resize is pending. Any changes to container resources will automatically set this to \"Proposed\" Deprecated: Resize status is moved to two pod conditions PodResizePending and PodResizeInProgress. PodResizePending will track states where the spec has been resized, but the Kubelet has not yet allocated the resources. PodResizeInProgress will track in-progress resizes, and should be present whenever allocated resources != acknowledged resources.")
  public String getResize() {
    return resize;
  }

  public void setResize(@jakarta.annotation.Nullable String resize) {
    this.resize = resize;
  }


  public V1PodStatus resourceClaimStatuses(@jakarta.annotation.Nullable List<V1PodResourceClaimStatus> resourceClaimStatuses) {
    this.resourceClaimStatuses = resourceClaimStatuses;
    return this;
  }

  public V1PodStatus addResourceClaimStatusesItem(V1PodResourceClaimStatus resourceClaimStatusesItem) {
    if (this.resourceClaimStatuses == null) {
      this.resourceClaimStatuses = new ArrayList<>();
    }
    this.resourceClaimStatuses.add(resourceClaimStatusesItem);
    return this;
  }

  /**
   * Status of resource claims.
   * @return resourceClaimStatuses
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "Status of resource claims.")
  public List<V1PodResourceClaimStatus> getResourceClaimStatuses() {
    return resourceClaimStatuses;
  }

  public void setResourceClaimStatuses(@jakarta.annotation.Nullable List<V1PodResourceClaimStatus> resourceClaimStatuses) {
    this.resourceClaimStatuses = resourceClaimStatuses;
  }


  public V1PodStatus startTime(@jakarta.annotation.Nullable OffsetDateTime startTime) {
    this.startTime = startTime;
    return this;
  }

  /**
   * RFC 3339 date and time at which the object was acknowledged by the Kubelet. This is before the Kubelet pulled the container image(s) for the pod.
   * @return startTime
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "RFC 3339 date and time at which the object was acknowledged by the Kubelet. This is before the Kubelet pulled the container image(s) for the pod.")
  public OffsetDateTime getStartTime() {
    return startTime;
  }

  public void setStartTime(@jakarta.annotation.Nullable OffsetDateTime startTime) {
    this.startTime = startTime;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1PodStatus v1PodStatus = (V1PodStatus) o;
    return Objects.equals(this.conditions, v1PodStatus.conditions) &&
        Objects.equals(this.containerStatuses, v1PodStatus.containerStatuses) &&
        Objects.equals(this.ephemeralContainerStatuses, v1PodStatus.ephemeralContainerStatuses) &&
        Objects.equals(this.extendedResourceClaimStatus, v1PodStatus.extendedResourceClaimStatus) &&
        Objects.equals(this.hostIP, v1PodStatus.hostIP) &&
        Objects.equals(this.hostIPs, v1PodStatus.hostIPs) &&
        Objects.equals(this.initContainerStatuses, v1PodStatus.initContainerStatuses) &&
        Objects.equals(this.message, v1PodStatus.message) &&
        Objects.equals(this.nominatedNodeName, v1PodStatus.nominatedNodeName) &&
        Objects.equals(this.observedGeneration, v1PodStatus.observedGeneration) &&
        Objects.equals(this.phase, v1PodStatus.phase) &&
        Objects.equals(this.podIP, v1PodStatus.podIP) &&
        Objects.equals(this.podIPs, v1PodStatus.podIPs) &&
        Objects.equals(this.qosClass, v1PodStatus.qosClass) &&
        Objects.equals(this.reason, v1PodStatus.reason) &&
        Objects.equals(this.resize, v1PodStatus.resize) &&
        Objects.equals(this.resourceClaimStatuses, v1PodStatus.resourceClaimStatuses) &&
        Objects.equals(this.startTime, v1PodStatus.startTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(conditions, containerStatuses, ephemeralContainerStatuses, extendedResourceClaimStatus, hostIP, hostIPs, initContainerStatuses, message, nominatedNodeName, observedGeneration, phase, podIP, podIPs, qosClass, reason, resize, resourceClaimStatuses, startTime);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1PodStatus {\n");
    sb.append("    conditions: ").append(toIndentedString(conditions)).append("\n");
    sb.append("    containerStatuses: ").append(toIndentedString(containerStatuses)).append("\n");
    sb.append("    ephemeralContainerStatuses: ").append(toIndentedString(ephemeralContainerStatuses)).append("\n");
    sb.append("    extendedResourceClaimStatus: ").append(toIndentedString(extendedResourceClaimStatus)).append("\n");
    sb.append("    hostIP: ").append(toIndentedString(hostIP)).append("\n");
    sb.append("    hostIPs: ").append(toIndentedString(hostIPs)).append("\n");
    sb.append("    initContainerStatuses: ").append(toIndentedString(initContainerStatuses)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    nominatedNodeName: ").append(toIndentedString(nominatedNodeName)).append("\n");
    sb.append("    observedGeneration: ").append(toIndentedString(observedGeneration)).append("\n");
    sb.append("    phase: ").append(toIndentedString(phase)).append("\n");
    sb.append("    podIP: ").append(toIndentedString(podIP)).append("\n");
    sb.append("    podIPs: ").append(toIndentedString(podIPs)).append("\n");
    sb.append("    qosClass: ").append(toIndentedString(qosClass)).append("\n");
    sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
    sb.append("    resize: ").append(toIndentedString(resize)).append("\n");
    sb.append("    resourceClaimStatuses: ").append(toIndentedString(resourceClaimStatuses)).append("\n");
    sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
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
    openapiFields.add("conditions");
    openapiFields.add("containerStatuses");
    openapiFields.add("ephemeralContainerStatuses");
    openapiFields.add("extendedResourceClaimStatus");
    openapiFields.add("hostIP");
    openapiFields.add("hostIPs");
    openapiFields.add("initContainerStatuses");
    openapiFields.add("message");
    openapiFields.add("nominatedNodeName");
    openapiFields.add("observedGeneration");
    openapiFields.add("phase");
    openapiFields.add("podIP");
    openapiFields.add("podIPs");
    openapiFields.add("qosClass");
    openapiFields.add("reason");
    openapiFields.add("resize");
    openapiFields.add("resourceClaimStatuses");
    openapiFields.add("startTime");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to V1PodStatus
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!V1PodStatus.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in V1PodStatus is not found in the empty JSON string", V1PodStatus.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!V1PodStatus.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `V1PodStatus` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (jsonObj.get("conditions") != null && !jsonObj.get("conditions").isJsonNull()) {
        JsonArray jsonArrayconditions = jsonObj.getAsJsonArray("conditions");
        if (jsonArrayconditions != null) {
          // ensure the json data is an array
          if (!jsonObj.get("conditions").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `conditions` to be an array in the JSON string but got `%s`", jsonObj.get("conditions").toString()));
          }

          // validate the optional field `conditions` (array)
          for (int i = 0; i < jsonArrayconditions.size(); i++) {
            V1PodCondition.validateJsonElement(jsonArrayconditions.get(i));
          };
        }
      }
      if (jsonObj.get("containerStatuses") != null && !jsonObj.get("containerStatuses").isJsonNull()) {
        JsonArray jsonArraycontainerStatuses = jsonObj.getAsJsonArray("containerStatuses");
        if (jsonArraycontainerStatuses != null) {
          // ensure the json data is an array
          if (!jsonObj.get("containerStatuses").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `containerStatuses` to be an array in the JSON string but got `%s`", jsonObj.get("containerStatuses").toString()));
          }

          // validate the optional field `containerStatuses` (array)
          for (int i = 0; i < jsonArraycontainerStatuses.size(); i++) {
            V1ContainerStatus.validateJsonElement(jsonArraycontainerStatuses.get(i));
          };
        }
      }
      if (jsonObj.get("ephemeralContainerStatuses") != null && !jsonObj.get("ephemeralContainerStatuses").isJsonNull()) {
        JsonArray jsonArrayephemeralContainerStatuses = jsonObj.getAsJsonArray("ephemeralContainerStatuses");
        if (jsonArrayephemeralContainerStatuses != null) {
          // ensure the json data is an array
          if (!jsonObj.get("ephemeralContainerStatuses").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `ephemeralContainerStatuses` to be an array in the JSON string but got `%s`", jsonObj.get("ephemeralContainerStatuses").toString()));
          }

          // validate the optional field `ephemeralContainerStatuses` (array)
          for (int i = 0; i < jsonArrayephemeralContainerStatuses.size(); i++) {
            V1ContainerStatus.validateJsonElement(jsonArrayephemeralContainerStatuses.get(i));
          };
        }
      }
      // validate the optional field `extendedResourceClaimStatus`
      if (jsonObj.get("extendedResourceClaimStatus") != null && !jsonObj.get("extendedResourceClaimStatus").isJsonNull()) {
        V1PodExtendedResourceClaimStatus.validateJsonElement(jsonObj.get("extendedResourceClaimStatus"));
      }
      if ((jsonObj.get("hostIP") != null && !jsonObj.get("hostIP").isJsonNull()) && !jsonObj.get("hostIP").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `hostIP` to be a primitive type in the JSON string but got `%s`", jsonObj.get("hostIP").toString()));
      }
      if (jsonObj.get("hostIPs") != null && !jsonObj.get("hostIPs").isJsonNull()) {
        JsonArray jsonArrayhostIPs = jsonObj.getAsJsonArray("hostIPs");
        if (jsonArrayhostIPs != null) {
          // ensure the json data is an array
          if (!jsonObj.get("hostIPs").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `hostIPs` to be an array in the JSON string but got `%s`", jsonObj.get("hostIPs").toString()));
          }

          // validate the optional field `hostIPs` (array)
          for (int i = 0; i < jsonArrayhostIPs.size(); i++) {
            V1HostIP.validateJsonElement(jsonArrayhostIPs.get(i));
          };
        }
      }
      if (jsonObj.get("initContainerStatuses") != null && !jsonObj.get("initContainerStatuses").isJsonNull()) {
        JsonArray jsonArrayinitContainerStatuses = jsonObj.getAsJsonArray("initContainerStatuses");
        if (jsonArrayinitContainerStatuses != null) {
          // ensure the json data is an array
          if (!jsonObj.get("initContainerStatuses").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `initContainerStatuses` to be an array in the JSON string but got `%s`", jsonObj.get("initContainerStatuses").toString()));
          }

          // validate the optional field `initContainerStatuses` (array)
          for (int i = 0; i < jsonArrayinitContainerStatuses.size(); i++) {
            V1ContainerStatus.validateJsonElement(jsonArrayinitContainerStatuses.get(i));
          };
        }
      }
      if ((jsonObj.get("message") != null && !jsonObj.get("message").isJsonNull()) && !jsonObj.get("message").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `message` to be a primitive type in the JSON string but got `%s`", jsonObj.get("message").toString()));
      }
      if ((jsonObj.get("nominatedNodeName") != null && !jsonObj.get("nominatedNodeName").isJsonNull()) && !jsonObj.get("nominatedNodeName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `nominatedNodeName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("nominatedNodeName").toString()));
      }
      if ((jsonObj.get("phase") != null && !jsonObj.get("phase").isJsonNull()) && !jsonObj.get("phase").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `phase` to be a primitive type in the JSON string but got `%s`", jsonObj.get("phase").toString()));
      }
      if ((jsonObj.get("podIP") != null && !jsonObj.get("podIP").isJsonNull()) && !jsonObj.get("podIP").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `podIP` to be a primitive type in the JSON string but got `%s`", jsonObj.get("podIP").toString()));
      }
      if (jsonObj.get("podIPs") != null && !jsonObj.get("podIPs").isJsonNull()) {
        JsonArray jsonArraypodIPs = jsonObj.getAsJsonArray("podIPs");
        if (jsonArraypodIPs != null) {
          // ensure the json data is an array
          if (!jsonObj.get("podIPs").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `podIPs` to be an array in the JSON string but got `%s`", jsonObj.get("podIPs").toString()));
          }

          // validate the optional field `podIPs` (array)
          for (int i = 0; i < jsonArraypodIPs.size(); i++) {
            V1PodIP.validateJsonElement(jsonArraypodIPs.get(i));
          };
        }
      }
      if ((jsonObj.get("qosClass") != null && !jsonObj.get("qosClass").isJsonNull()) && !jsonObj.get("qosClass").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `qosClass` to be a primitive type in the JSON string but got `%s`", jsonObj.get("qosClass").toString()));
      }
      if ((jsonObj.get("reason") != null && !jsonObj.get("reason").isJsonNull()) && !jsonObj.get("reason").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `reason` to be a primitive type in the JSON string but got `%s`", jsonObj.get("reason").toString()));
      }
      if ((jsonObj.get("resize") != null && !jsonObj.get("resize").isJsonNull()) && !jsonObj.get("resize").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `resize` to be a primitive type in the JSON string but got `%s`", jsonObj.get("resize").toString()));
      }
      if (jsonObj.get("resourceClaimStatuses") != null && !jsonObj.get("resourceClaimStatuses").isJsonNull()) {
        JsonArray jsonArrayresourceClaimStatuses = jsonObj.getAsJsonArray("resourceClaimStatuses");
        if (jsonArrayresourceClaimStatuses != null) {
          // ensure the json data is an array
          if (!jsonObj.get("resourceClaimStatuses").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `resourceClaimStatuses` to be an array in the JSON string but got `%s`", jsonObj.get("resourceClaimStatuses").toString()));
          }

          // validate the optional field `resourceClaimStatuses` (array)
          for (int i = 0; i < jsonArrayresourceClaimStatuses.size(); i++) {
            V1PodResourceClaimStatus.validateJsonElement(jsonArrayresourceClaimStatuses.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!V1PodStatus.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'V1PodStatus' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<V1PodStatus> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(V1PodStatus.class));

       return (TypeAdapter<T>) new TypeAdapter<V1PodStatus>() {
           @Override
           public void write(JsonWriter out, V1PodStatus value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public V1PodStatus read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of V1PodStatus given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of V1PodStatus
   * @throws IOException if the JSON string is invalid with respect to V1PodStatus
   */
  public static V1PodStatus fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, V1PodStatus.class);
  }

  /**
   * Convert an instance of V1PodStatus to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
