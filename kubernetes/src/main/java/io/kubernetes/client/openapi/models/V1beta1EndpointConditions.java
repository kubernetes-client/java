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
package io.kubernetes.client.openapi.models;

import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;

/** EndpointConditions represents the current condition of an endpoint. */
@ApiModel(description = "EndpointConditions represents the current condition of an endpoint.")
@javax.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    date = "2020-07-29T18:17:00.375Z[Etc/UTC]")
public class V1beta1EndpointConditions {
  public static final String SERIALIZED_NAME_READY = "ready";

  @SerializedName(SERIALIZED_NAME_READY)
  private Boolean ready;

  public V1beta1EndpointConditions ready(Boolean ready) {

    this.ready = ready;
    return this;
  }

  /**
   * ready indicates that this endpoint is prepared to receive traffic, according to whatever system
   * is managing the endpoint. A nil value indicates an unknown state. In most cases consumers
   * should interpret this unknown state as ready.
   *
   * @return ready
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "ready indicates that this endpoint is prepared to receive traffic, according to whatever system is managing the endpoint. A nil value indicates an unknown state. In most cases consumers should interpret this unknown state as ready.")
  public Boolean getReady() {
    return ready;
  }

  public void setReady(Boolean ready) {
    this.ready = ready;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1beta1EndpointConditions v1beta1EndpointConditions = (V1beta1EndpointConditions) o;
    return Objects.equals(this.ready, v1beta1EndpointConditions.ready);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ready);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1beta1EndpointConditions {\n");
    sb.append("    ready: ").append(toIndentedString(ready)).append("\n");
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
