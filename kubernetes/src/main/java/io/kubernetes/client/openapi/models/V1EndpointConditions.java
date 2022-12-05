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

/** EndpointConditions represents the current condition of an endpoint. */
@ApiModel(description = "EndpointConditions represents the current condition of an endpoint.")
@javax.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    date = "2022-12-05T08:14:34.919Z[Etc/UTC]")
public class V1EndpointConditions {
  public static final String SERIALIZED_NAME_READY = "ready";

  @SerializedName(SERIALIZED_NAME_READY)
  private Boolean ready;

  public static final String SERIALIZED_NAME_SERVING = "serving";

  @SerializedName(SERIALIZED_NAME_SERVING)
  private Boolean serving;

  public static final String SERIALIZED_NAME_TERMINATING = "terminating";

  @SerializedName(SERIALIZED_NAME_TERMINATING)
  private Boolean terminating;

  public V1EndpointConditions ready(Boolean ready) {

    this.ready = ready;
    return this;
  }

  /**
   * ready indicates that this endpoint is prepared to receive traffic, according to whatever system
   * is managing the endpoint. A nil value indicates an unknown state. In most cases consumers
   * should interpret this unknown state as ready. For compatibility reasons, ready should never be
   * \&quot;true\&quot; for terminating endpoints.
   *
   * @return ready
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "ready indicates that this endpoint is prepared to receive traffic, according to whatever system is managing the endpoint. A nil value indicates an unknown state. In most cases consumers should interpret this unknown state as ready. For compatibility reasons, ready should never be \"true\" for terminating endpoints.")
  public Boolean getReady() {
    return ready;
  }

  public void setReady(Boolean ready) {
    this.ready = ready;
  }

  public V1EndpointConditions serving(Boolean serving) {

    this.serving = serving;
    return this;
  }

  /**
   * serving is identical to ready except that it is set regardless of the terminating state of
   * endpoints. This condition should be set to true for a ready endpoint that is terminating. If
   * nil, consumers should defer to the ready condition. This field can be enabled with the
   * EndpointSliceTerminatingCondition feature gate.
   *
   * @return serving
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "serving is identical to ready except that it is set regardless of the terminating state of endpoints. This condition should be set to true for a ready endpoint that is terminating. If nil, consumers should defer to the ready condition. This field can be enabled with the EndpointSliceTerminatingCondition feature gate.")
  public Boolean getServing() {
    return serving;
  }

  public void setServing(Boolean serving) {
    this.serving = serving;
  }

  public V1EndpointConditions terminating(Boolean terminating) {

    this.terminating = terminating;
    return this;
  }

  /**
   * terminating indicates that this endpoint is terminating. A nil value indicates an unknown
   * state. Consumers should interpret this unknown state to mean that the endpoint is not
   * terminating. This field can be enabled with the EndpointSliceTerminatingCondition feature gate.
   *
   * @return terminating
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "terminating indicates that this endpoint is terminating. A nil value indicates an unknown state. Consumers should interpret this unknown state to mean that the endpoint is not terminating. This field can be enabled with the EndpointSliceTerminatingCondition feature gate.")
  public Boolean getTerminating() {
    return terminating;
  }

  public void setTerminating(Boolean terminating) {
    this.terminating = terminating;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1EndpointConditions v1EndpointConditions = (V1EndpointConditions) o;
    return Objects.equals(this.ready, v1EndpointConditions.ready)
        && Objects.equals(this.serving, v1EndpointConditions.serving)
        && Objects.equals(this.terminating, v1EndpointConditions.terminating);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ready, serving, terminating);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1EndpointConditions {\n");
    sb.append("    ready: ").append(toIndentedString(ready)).append("\n");
    sb.append("    serving: ").append(toIndentedString(serving)).append("\n");
    sb.append("    terminating: ").append(toIndentedString(terminating)).append("\n");
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
