/*
Copyright 2023 The Kubernetes Authors.
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
import io.kubernetes.client.openapi.models.V1ContainerState;
import io.kubernetes.client.openapi.models.V1ResourceRequirements;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * ContainerStatus contains details for the current status of this container.
 */
@ApiModel(description = "ContainerStatus contains details for the current status of this container.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-12-01T19:05:21.333462Z[Etc/UTC]")
public class V1ContainerStatus {
  public static final String SERIALIZED_NAME_ALLOCATED_RESOURCES = "allocatedResources";
  @SerializedName(SERIALIZED_NAME_ALLOCATED_RESOURCES)
  private Map<String, Quantity> allocatedResources = null;

  public static final String SERIALIZED_NAME_CONTAINER_I_D = "containerID";
  @SerializedName(SERIALIZED_NAME_CONTAINER_I_D)
  private String containerID;

  public static final String SERIALIZED_NAME_IMAGE = "image";
  @SerializedName(SERIALIZED_NAME_IMAGE)
  private String image;

  public static final String SERIALIZED_NAME_IMAGE_I_D = "imageID";
  @SerializedName(SERIALIZED_NAME_IMAGE_I_D)
  private String imageID;

  public static final String SERIALIZED_NAME_LAST_STATE = "lastState";
  @SerializedName(SERIALIZED_NAME_LAST_STATE)
  private V1ContainerState lastState;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_READY = "ready";
  @SerializedName(SERIALIZED_NAME_READY)
  private Boolean ready;

  public static final String SERIALIZED_NAME_RESOURCES = "resources";
  @SerializedName(SERIALIZED_NAME_RESOURCES)
  private V1ResourceRequirements resources;

  public static final String SERIALIZED_NAME_RESTART_COUNT = "restartCount";
  @SerializedName(SERIALIZED_NAME_RESTART_COUNT)
  private Integer restartCount;

  public static final String SERIALIZED_NAME_STARTED = "started";
  @SerializedName(SERIALIZED_NAME_STARTED)
  private Boolean started;

  public static final String SERIALIZED_NAME_STATE = "state";
  @SerializedName(SERIALIZED_NAME_STATE)
  private V1ContainerState state;


  public V1ContainerStatus allocatedResources(Map<String, Quantity> allocatedResources) {

    this.allocatedResources = allocatedResources;
    return this;
  }

  public V1ContainerStatus putAllocatedResourcesItem(String key, Quantity allocatedResourcesItem) {
    if (this.allocatedResources == null) {
      this.allocatedResources = new HashMap<>();
    }
    this.allocatedResources.put(key, allocatedResourcesItem);
    return this;
  }

   /**
   * AllocatedResources represents the compute resources allocated for this container by the node. Kubelet sets this value to Container.Resources.Requests upon successful pod admission and after successfully admitting desired pod resize.
   * @return allocatedResources
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "AllocatedResources represents the compute resources allocated for this container by the node. Kubelet sets this value to Container.Resources.Requests upon successful pod admission and after successfully admitting desired pod resize.")

  public Map<String, Quantity> getAllocatedResources() {
    return allocatedResources;
  }


  public void setAllocatedResources(Map<String, Quantity> allocatedResources) {
    this.allocatedResources = allocatedResources;
  }


  public V1ContainerStatus containerID(String containerID) {

    this.containerID = containerID;
    return this;
  }

   /**
   * ContainerID is the ID of the container in the format &#39;&lt;type&gt;://&lt;container_id&gt;&#39;. Where type is a container runtime identifier, returned from Version call of CRI API (for example \&quot;containerd\&quot;).
   * @return containerID
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "ContainerID is the ID of the container in the format '<type>://<container_id>'. Where type is a container runtime identifier, returned from Version call of CRI API (for example \"containerd\").")

  public String getContainerID() {
    return containerID;
  }


  public void setContainerID(String containerID) {
    this.containerID = containerID;
  }


  public V1ContainerStatus image(String image) {

    this.image = image;
    return this;
  }

   /**
   * Image is the name of container image that the container is running. The container image may not match the image used in the PodSpec, as it may have been resolved by the runtime. More info: https://kubernetes.io/docs/concepts/containers/images.
   * @return image
  **/
  @ApiModelProperty(required = true, value = "Image is the name of container image that the container is running. The container image may not match the image used in the PodSpec, as it may have been resolved by the runtime. More info: https://kubernetes.io/docs/concepts/containers/images.")

  public String getImage() {
    return image;
  }


  public void setImage(String image) {
    this.image = image;
  }


  public V1ContainerStatus imageID(String imageID) {

    this.imageID = imageID;
    return this;
  }

   /**
   * ImageID is the image ID of the container&#39;s image. The image ID may not match the image ID of the image used in the PodSpec, as it may have been resolved by the runtime.
   * @return imageID
  **/
  @ApiModelProperty(required = true, value = "ImageID is the image ID of the container's image. The image ID may not match the image ID of the image used in the PodSpec, as it may have been resolved by the runtime.")

  public String getImageID() {
    return imageID;
  }


  public void setImageID(String imageID) {
    this.imageID = imageID;
  }


  public V1ContainerStatus lastState(V1ContainerState lastState) {

    this.lastState = lastState;
    return this;
  }

   /**
   * Get lastState
   * @return lastState
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public V1ContainerState getLastState() {
    return lastState;
  }


  public void setLastState(V1ContainerState lastState) {
    this.lastState = lastState;
  }


  public V1ContainerStatus name(String name) {

    this.name = name;
    return this;
  }

   /**
   * Name is a DNS_LABEL representing the unique name of the container. Each container in a pod must have a unique name across all container types. Cannot be updated.
   * @return name
  **/
  @ApiModelProperty(required = true, value = "Name is a DNS_LABEL representing the unique name of the container. Each container in a pod must have a unique name across all container types. Cannot be updated.")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public V1ContainerStatus ready(Boolean ready) {

    this.ready = ready;
    return this;
  }

   /**
   * Ready specifies whether the container is currently passing its readiness check. The value will change as readiness probes keep executing. If no readiness probes are specified, this field defaults to true once the container is fully started (see Started field).  The value is typically used to determine whether a container is ready to accept traffic.
   * @return ready
  **/
  @ApiModelProperty(required = true, value = "Ready specifies whether the container is currently passing its readiness check. The value will change as readiness probes keep executing. If no readiness probes are specified, this field defaults to true once the container is fully started (see Started field).  The value is typically used to determine whether a container is ready to accept traffic.")

  public Boolean getReady() {
    return ready;
  }


  public void setReady(Boolean ready) {
    this.ready = ready;
  }


  public V1ContainerStatus resources(V1ResourceRequirements resources) {

    this.resources = resources;
    return this;
  }

   /**
   * Get resources
   * @return resources
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public V1ResourceRequirements getResources() {
    return resources;
  }


  public void setResources(V1ResourceRequirements resources) {
    this.resources = resources;
  }


  public V1ContainerStatus restartCount(Integer restartCount) {

    this.restartCount = restartCount;
    return this;
  }

   /**
   * RestartCount holds the number of times the container has been restarted. Kubelet makes an effort to always increment the value, but there are cases when the state may be lost due to node restarts and then the value may be reset to 0. The value is never negative.
   * @return restartCount
  **/
  @ApiModelProperty(required = true, value = "RestartCount holds the number of times the container has been restarted. Kubelet makes an effort to always increment the value, but there are cases when the state may be lost due to node restarts and then the value may be reset to 0. The value is never negative.")

  public Integer getRestartCount() {
    return restartCount;
  }


  public void setRestartCount(Integer restartCount) {
    this.restartCount = restartCount;
  }


  public V1ContainerStatus started(Boolean started) {

    this.started = started;
    return this;
  }

   /**
   * Started indicates whether the container has finished its postStart lifecycle hook and passed its startup probe. Initialized as false, becomes true after startupProbe is considered successful. Resets to false when the container is restarted, or if kubelet loses state temporarily. In both cases, startup probes will run again. Is always true when no startupProbe is defined and container is running and has passed the postStart lifecycle hook. The null value must be treated the same as false.
   * @return started
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Started indicates whether the container has finished its postStart lifecycle hook and passed its startup probe. Initialized as false, becomes true after startupProbe is considered successful. Resets to false when the container is restarted, or if kubelet loses state temporarily. In both cases, startup probes will run again. Is always true when no startupProbe is defined and container is running and has passed the postStart lifecycle hook. The null value must be treated the same as false.")

  public Boolean getStarted() {
    return started;
  }


  public void setStarted(Boolean started) {
    this.started = started;
  }


  public V1ContainerStatus state(V1ContainerState state) {

    this.state = state;
    return this;
  }

   /**
   * Get state
   * @return state
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public V1ContainerState getState() {
    return state;
  }


  public void setState(V1ContainerState state) {
    this.state = state;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1ContainerStatus v1ContainerStatus = (V1ContainerStatus) o;
    return Objects.equals(this.allocatedResources, v1ContainerStatus.allocatedResources) &&
        Objects.equals(this.containerID, v1ContainerStatus.containerID) &&
        Objects.equals(this.image, v1ContainerStatus.image) &&
        Objects.equals(this.imageID, v1ContainerStatus.imageID) &&
        Objects.equals(this.lastState, v1ContainerStatus.lastState) &&
        Objects.equals(this.name, v1ContainerStatus.name) &&
        Objects.equals(this.ready, v1ContainerStatus.ready) &&
        Objects.equals(this.resources, v1ContainerStatus.resources) &&
        Objects.equals(this.restartCount, v1ContainerStatus.restartCount) &&
        Objects.equals(this.started, v1ContainerStatus.started) &&
        Objects.equals(this.state, v1ContainerStatus.state);
  }

  @Override
  public int hashCode() {
    return Objects.hash(allocatedResources, containerID, image, imageID, lastState, name, ready, resources, restartCount, started, state);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1ContainerStatus {\n");
    sb.append("    allocatedResources: ").append(toIndentedString(allocatedResources)).append("\n");
    sb.append("    containerID: ").append(toIndentedString(containerID)).append("\n");
    sb.append("    image: ").append(toIndentedString(image)).append("\n");
    sb.append("    imageID: ").append(toIndentedString(imageID)).append("\n");
    sb.append("    lastState: ").append(toIndentedString(lastState)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    ready: ").append(toIndentedString(ready)).append("\n");
    sb.append("    resources: ").append(toIndentedString(resources)).append("\n");
    sb.append("    restartCount: ").append(toIndentedString(restartCount)).append("\n");
    sb.append("    started: ").append(toIndentedString(started)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}
