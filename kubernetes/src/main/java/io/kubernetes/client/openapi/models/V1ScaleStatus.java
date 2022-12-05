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

/** ScaleStatus represents the current status of a scale subresource. */
@ApiModel(description = "ScaleStatus represents the current status of a scale subresource.")
@javax.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    date = "2022-12-05T08:14:34.919Z[Etc/UTC]")
public class V1ScaleStatus {
  public static final String SERIALIZED_NAME_REPLICAS = "replicas";

  @SerializedName(SERIALIZED_NAME_REPLICAS)
  private Integer replicas;

  public static final String SERIALIZED_NAME_SELECTOR = "selector";

  @SerializedName(SERIALIZED_NAME_SELECTOR)
  private String selector;

  public V1ScaleStatus replicas(Integer replicas) {

    this.replicas = replicas;
    return this;
  }

  /**
   * actual number of observed instances of the scaled object.
   *
   * @return replicas
   */
  @ApiModelProperty(
      required = true,
      value = "actual number of observed instances of the scaled object.")
  public Integer getReplicas() {
    return replicas;
  }

  public void setReplicas(Integer replicas) {
    this.replicas = replicas;
  }

  public V1ScaleStatus selector(String selector) {

    this.selector = selector;
    return this;
  }

  /**
   * label query over pods that should match the replicas count. This is same as the label selector
   * but in the string format to avoid introspection by clients. The string will be in the same
   * format as the query-param syntax. More info about label selectors:
   * http://kubernetes.io/docs/user-guide/labels#label-selectors
   *
   * @return selector
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "label query over pods that should match the replicas count. This is same as the label selector but in the string format to avoid introspection by clients. The string will be in the same format as the query-param syntax. More info about label selectors: http://kubernetes.io/docs/user-guide/labels#label-selectors")
  public String getSelector() {
    return selector;
  }

  public void setSelector(String selector) {
    this.selector = selector;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1ScaleStatus v1ScaleStatus = (V1ScaleStatus) o;
    return Objects.equals(this.replicas, v1ScaleStatus.replicas)
        && Objects.equals(this.selector, v1ScaleStatus.selector);
  }

  @Override
  public int hashCode() {
    return Objects.hash(replicas, selector);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1ScaleStatus {\n");
    sb.append("    replicas: ").append(toIndentedString(replicas)).append("\n");
    sb.append("    selector: ").append(toIndentedString(selector)).append("\n");
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
