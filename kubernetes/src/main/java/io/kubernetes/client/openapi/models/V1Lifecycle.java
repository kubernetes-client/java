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
 * Lifecycle describes actions that the management system should take in response to container
 * lifecycle events. For the PostStart and PreStop lifecycle handlers, management of the container
 * blocks until the action is complete, unless the container process fails, in which case the
 * handler is aborted.
 */
@ApiModel(
    description =
        "Lifecycle describes actions that the management system should take in response to container lifecycle events. For the PostStart and PreStop lifecycle handlers, management of the container blocks until the action is complete, unless the container process fails, in which case the handler is aborted.")
@javax.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    date = "2022-12-05T08:14:34.919Z[Etc/UTC]")
public class V1Lifecycle {
  public static final String SERIALIZED_NAME_POST_START = "postStart";

  @SerializedName(SERIALIZED_NAME_POST_START)
  private V1LifecycleHandler postStart;

  public static final String SERIALIZED_NAME_PRE_STOP = "preStop";

  @SerializedName(SERIALIZED_NAME_PRE_STOP)
  private V1LifecycleHandler preStop;

  public V1Lifecycle postStart(V1LifecycleHandler postStart) {

    this.postStart = postStart;
    return this;
  }

  /**
   * Get postStart
   *
   * @return postStart
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  public V1LifecycleHandler getPostStart() {
    return postStart;
  }

  public void setPostStart(V1LifecycleHandler postStart) {
    this.postStart = postStart;
  }

  public V1Lifecycle preStop(V1LifecycleHandler preStop) {

    this.preStop = preStop;
    return this;
  }

  /**
   * Get preStop
   *
   * @return preStop
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  public V1LifecycleHandler getPreStop() {
    return preStop;
  }

  public void setPreStop(V1LifecycleHandler preStop) {
    this.preStop = preStop;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1Lifecycle v1Lifecycle = (V1Lifecycle) o;
    return Objects.equals(this.postStart, v1Lifecycle.postStart)
        && Objects.equals(this.preStop, v1Lifecycle.preStop);
  }

  @Override
  public int hashCode() {
    return Objects.hash(postStart, preStop);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1Lifecycle {\n");
    sb.append("    postStart: ").append(toIndentedString(postStart)).append("\n");
    sb.append("    preStop: ").append(toIndentedString(preStop)).append("\n");
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
