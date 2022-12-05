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

/** Affinity is a group of affinity scheduling rules. */
@ApiModel(description = "Affinity is a group of affinity scheduling rules.")
@javax.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    date = "2022-12-05T08:14:34.919Z[Etc/UTC]")
public class V1Affinity {
  public static final String SERIALIZED_NAME_NODE_AFFINITY = "nodeAffinity";

  @SerializedName(SERIALIZED_NAME_NODE_AFFINITY)
  private V1NodeAffinity nodeAffinity;

  public static final String SERIALIZED_NAME_POD_AFFINITY = "podAffinity";

  @SerializedName(SERIALIZED_NAME_POD_AFFINITY)
  private V1PodAffinity podAffinity;

  public static final String SERIALIZED_NAME_POD_ANTI_AFFINITY = "podAntiAffinity";

  @SerializedName(SERIALIZED_NAME_POD_ANTI_AFFINITY)
  private V1PodAntiAffinity podAntiAffinity;

  public V1Affinity nodeAffinity(V1NodeAffinity nodeAffinity) {

    this.nodeAffinity = nodeAffinity;
    return this;
  }

  /**
   * Get nodeAffinity
   *
   * @return nodeAffinity
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  public V1NodeAffinity getNodeAffinity() {
    return nodeAffinity;
  }

  public void setNodeAffinity(V1NodeAffinity nodeAffinity) {
    this.nodeAffinity = nodeAffinity;
  }

  public V1Affinity podAffinity(V1PodAffinity podAffinity) {

    this.podAffinity = podAffinity;
    return this;
  }

  /**
   * Get podAffinity
   *
   * @return podAffinity
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  public V1PodAffinity getPodAffinity() {
    return podAffinity;
  }

  public void setPodAffinity(V1PodAffinity podAffinity) {
    this.podAffinity = podAffinity;
  }

  public V1Affinity podAntiAffinity(V1PodAntiAffinity podAntiAffinity) {

    this.podAntiAffinity = podAntiAffinity;
    return this;
  }

  /**
   * Get podAntiAffinity
   *
   * @return podAntiAffinity
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  public V1PodAntiAffinity getPodAntiAffinity() {
    return podAntiAffinity;
  }

  public void setPodAntiAffinity(V1PodAntiAffinity podAntiAffinity) {
    this.podAntiAffinity = podAntiAffinity;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1Affinity v1Affinity = (V1Affinity) o;
    return Objects.equals(this.nodeAffinity, v1Affinity.nodeAffinity)
        && Objects.equals(this.podAffinity, v1Affinity.podAffinity)
        && Objects.equals(this.podAntiAffinity, v1Affinity.podAntiAffinity);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nodeAffinity, podAffinity, podAntiAffinity);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1Affinity {\n");
    sb.append("    nodeAffinity: ").append(toIndentedString(nodeAffinity)).append("\n");
    sb.append("    podAffinity: ").append(toIndentedString(podAffinity)).append("\n");
    sb.append("    podAntiAffinity: ").append(toIndentedString(podAntiAffinity)).append("\n");
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
