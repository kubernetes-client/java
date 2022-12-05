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
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/** Overhead structure represents the resource overhead associated with running a pod. */
@ApiModel(
    description =
        "Overhead structure represents the resource overhead associated with running a pod.")
@javax.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    date = "2022-12-05T08:14:34.919Z[Etc/UTC]")
public class V1Overhead {
  public static final String SERIALIZED_NAME_POD_FIXED = "podFixed";

  @SerializedName(SERIALIZED_NAME_POD_FIXED)
  private Map<String, Quantity> podFixed = null;

  public V1Overhead podFixed(Map<String, Quantity> podFixed) {

    this.podFixed = podFixed;
    return this;
  }

  public V1Overhead putPodFixedItem(String key, Quantity podFixedItem) {
    if (this.podFixed == null) {
      this.podFixed = new HashMap<>();
    }
    this.podFixed.put(key, podFixedItem);
    return this;
  }

  /**
   * PodFixed represents the fixed resource overhead associated with running a pod.
   *
   * @return podFixed
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value = "PodFixed represents the fixed resource overhead associated with running a pod.")
  public Map<String, Quantity> getPodFixed() {
    return podFixed;
  }

  public void setPodFixed(Map<String, Quantity> podFixed) {
    this.podFixed = podFixed;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1Overhead v1Overhead = (V1Overhead) o;
    return Objects.equals(this.podFixed, v1Overhead.podFixed);
  }

  @Override
  public int hashCode() {
    return Objects.hash(podFixed);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1Overhead {\n");
    sb.append("    podFixed: ").append(toIndentedString(podFixed)).append("\n");
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
