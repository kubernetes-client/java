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

/**
 * ContainerState holds a possible state of container. Only one of its members may be specified. If
 * none of them is specified, the default one is ContainerStateWaiting.
 */
@ApiModel(
    description =
        "ContainerState holds a possible state of container. Only one of its members may be specified. If none of them is specified, the default one is ContainerStateWaiting.")
@javax.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    date = "2022-12-05T08:14:34.919Z[Etc/UTC]")
public class V1ContainerState {
  public static final String SERIALIZED_NAME_RUNNING = "running";

  @SerializedName(SERIALIZED_NAME_RUNNING)
  private V1ContainerStateRunning running;

  public static final String SERIALIZED_NAME_TERMINATED = "terminated";

  @SerializedName(SERIALIZED_NAME_TERMINATED)
  private V1ContainerStateTerminated terminated;

  public static final String SERIALIZED_NAME_WAITING = "waiting";

  @SerializedName(SERIALIZED_NAME_WAITING)
  private V1ContainerStateWaiting waiting;

  public V1ContainerState running(V1ContainerStateRunning running) {

    this.running = running;
    return this;
  }

  /**
   * Get running
   *
   * @return running
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  public V1ContainerStateRunning getRunning() {
    return running;
  }

  public void setRunning(V1ContainerStateRunning running) {
    this.running = running;
  }

  public V1ContainerState terminated(V1ContainerStateTerminated terminated) {

    this.terminated = terminated;
    return this;
  }

  /**
   * Get terminated
   *
   * @return terminated
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  public V1ContainerStateTerminated getTerminated() {
    return terminated;
  }

  public void setTerminated(V1ContainerStateTerminated terminated) {
    this.terminated = terminated;
  }

  public V1ContainerState waiting(V1ContainerStateWaiting waiting) {

    this.waiting = waiting;
    return this;
  }

  /**
   * Get waiting
   *
   * @return waiting
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  public V1ContainerStateWaiting getWaiting() {
    return waiting;
  }

  public void setWaiting(V1ContainerStateWaiting waiting) {
    this.waiting = waiting;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1ContainerState v1ContainerState = (V1ContainerState) o;
    return Objects.equals(this.running, v1ContainerState.running)
        && Objects.equals(this.terminated, v1ContainerState.terminated)
        && Objects.equals(this.waiting, v1ContainerState.waiting);
  }

  @Override
  public int hashCode() {
    return Objects.hash(running, terminated, waiting);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1ContainerState {\n");
    sb.append("    running: ").append(toIndentedString(running)).append("\n");
    sb.append("    terminated: ").append(toIndentedString(terminated)).append("\n");
    sb.append("    waiting: ").append(toIndentedString(waiting)).append("\n");
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
