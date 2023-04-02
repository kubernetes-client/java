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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;

/** ContainerStatus contains details for the current status of this container. */
@ApiModel(
    description = "ContainerStatus contains details for the current status of this container.")
@javax.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    date = "2022-12-05T08:14:34.919Z[Etc/UTC]")
public class V1ContainerStatus {
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

  public static final String SERIALIZED_NAME_RESTART_COUNT = "restartCount";

  @SerializedName(SERIALIZED_NAME_RESTART_COUNT)
  private Integer restartCount;

  public static final String SERIALIZED_NAME_STARTED = "started";

  @SerializedName(SERIALIZED_NAME_STARTED)
  private Boolean started;

  public static final String SERIALIZED_NAME_STATE = "state";

  @SerializedName(SERIALIZED_NAME_STATE)
  private V1ContainerState state;

  public V1ContainerStatus containerID(String containerID) {

    this.containerID = containerID;
    return this;
  }

  /**
   * Container&#39;s ID in the format &#39;&lt;type&gt;://&lt;container_id&gt;&#39;.
   *
   * @return containerID
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Container's ID in the format '<type>://<container_id>'.")
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
   * The image the container is running. More info:
   * https://kubernetes.io/docs/concepts/containers/images.
   *
   * @return image
   */
  @ApiModelProperty(
      required = true,
      value =
          "The image the container is running. More info: https://kubernetes.io/docs/concepts/containers/images.")
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
   * ImageID of the container&#39;s image.
   *
   * @return imageID
   */
  @ApiModelProperty(required = true, value = "ImageID of the container's image.")
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
   *
   * @return lastState
   */
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
   * This must be a DNS_LABEL. Each container in a pod must have a unique name. Cannot be updated.
   *
   * @return name
   */
  @ApiModelProperty(
      required = true,
      value =
          "This must be a DNS_LABEL. Each container in a pod must have a unique name. Cannot be updated.")
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
   * Specifies whether the container has passed its readiness probe.
   *
   * @return ready
   */
  @ApiModelProperty(
      required = true,
      value = "Specifies whether the container has passed its readiness probe.")
  public Boolean getReady() {
    return ready;
  }

  public void setReady(Boolean ready) {
    this.ready = ready;
  }

  public V1ContainerStatus restartCount(Integer restartCount) {

    this.restartCount = restartCount;
    return this;
  }

  /**
   * The number of times the container has been restarted.
   *
   * @return restartCount
   */
  @ApiModelProperty(
      required = true,
      value = "The number of times the container has been restarted.")
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
   * Specifies whether the container has passed its startup probe. Initialized as false, becomes
   * true after startupProbe is considered successful. Resets to false when the container is
   * restarted, or if kubelet loses state temporarily. Is always true when no startupProbe is
   * defined.
   *
   * @return started
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "Specifies whether the container has passed its startup probe. Initialized as false, becomes true after startupProbe is considered successful. Resets to false when the container is restarted, or if kubelet loses state temporarily. Is always true when no startupProbe is defined.")
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
   *
   * @return state
   */
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
    return Objects.equals(this.containerID, v1ContainerStatus.containerID)
        && Objects.equals(this.image, v1ContainerStatus.image)
        && Objects.equals(this.imageID, v1ContainerStatus.imageID)
        && Objects.equals(this.lastState, v1ContainerStatus.lastState)
        && Objects.equals(this.name, v1ContainerStatus.name)
        && Objects.equals(this.ready, v1ContainerStatus.ready)
        && Objects.equals(this.restartCount, v1ContainerStatus.restartCount)
        && Objects.equals(this.started, v1ContainerStatus.started)
        && Objects.equals(this.state, v1ContainerStatus.state);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        containerID, image, imageID, lastState, name, ready, restartCount, started, state);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1ContainerStatus {\n");
    sb.append("    containerID: ").append(toIndentedString(containerID)).append("\n");
    sb.append("    image: ").append(toIndentedString(image)).append("\n");
    sb.append("    imageID: ").append(toIndentedString(imageID)).append("\n");
    sb.append("    lastState: ").append(toIndentedString(lastState)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    ready: ").append(toIndentedString(ready)).append("\n");
    sb.append("    restartCount: ").append(toIndentedString(restartCount)).append("\n");
    sb.append("    started: ").append(toIndentedString(started)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
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
