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
package com.coreos.monitoring.models;

import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;

/** If specified, the pod&#39;s scheduling constraints. */
@ApiModel(description = "If specified, the pod's scheduling constraints.")
@javax.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    date = "2020-08-31T19:41:55.826Z[Etc/UTC]")
public class V1ThanosRulerSpecAffinity {
  public static final String SERIALIZED_NAME_NODE_AFFINITY = "nodeAffinity";

  @SerializedName(SERIALIZED_NAME_NODE_AFFINITY)
  private V1ThanosRulerSpecAffinityNodeAffinity nodeAffinity;

  public static final String SERIALIZED_NAME_POD_AFFINITY = "podAffinity";

  @SerializedName(SERIALIZED_NAME_POD_AFFINITY)
  private V1ThanosRulerSpecAffinityPodAffinity podAffinity;

  public static final String SERIALIZED_NAME_POD_ANTI_AFFINITY = "podAntiAffinity";

  @SerializedName(SERIALIZED_NAME_POD_ANTI_AFFINITY)
  private V1ThanosRulerSpecAffinityPodAntiAffinity podAntiAffinity;

  public V1ThanosRulerSpecAffinity nodeAffinity(
      V1ThanosRulerSpecAffinityNodeAffinity nodeAffinity) {

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
  public V1ThanosRulerSpecAffinityNodeAffinity getNodeAffinity() {
    return nodeAffinity;
  }

  public void setNodeAffinity(V1ThanosRulerSpecAffinityNodeAffinity nodeAffinity) {
    this.nodeAffinity = nodeAffinity;
  }

  public V1ThanosRulerSpecAffinity podAffinity(V1ThanosRulerSpecAffinityPodAffinity podAffinity) {

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
  public V1ThanosRulerSpecAffinityPodAffinity getPodAffinity() {
    return podAffinity;
  }

  public void setPodAffinity(V1ThanosRulerSpecAffinityPodAffinity podAffinity) {
    this.podAffinity = podAffinity;
  }

  public V1ThanosRulerSpecAffinity podAntiAffinity(
      V1ThanosRulerSpecAffinityPodAntiAffinity podAntiAffinity) {

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
  public V1ThanosRulerSpecAffinityPodAntiAffinity getPodAntiAffinity() {
    return podAntiAffinity;
  }

  public void setPodAntiAffinity(V1ThanosRulerSpecAffinityPodAntiAffinity podAntiAffinity) {
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
    V1ThanosRulerSpecAffinity v1ThanosRulerSpecAffinity = (V1ThanosRulerSpecAffinity) o;
    return Objects.equals(this.nodeAffinity, v1ThanosRulerSpecAffinity.nodeAffinity)
        && Objects.equals(this.podAffinity, v1ThanosRulerSpecAffinity.podAffinity)
        && Objects.equals(this.podAntiAffinity, v1ThanosRulerSpecAffinity.podAntiAffinity);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nodeAffinity, podAffinity, podAntiAffinity);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1ThanosRulerSpecAffinity {\n");
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
