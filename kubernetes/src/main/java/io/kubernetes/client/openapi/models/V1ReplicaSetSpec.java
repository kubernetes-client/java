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

/** ReplicaSetSpec is the specification of a ReplicaSet. */
@ApiModel(description = "ReplicaSetSpec is the specification of a ReplicaSet.")
@javax.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    date = "2022-12-05T08:14:34.919Z[Etc/UTC]")
public class V1ReplicaSetSpec {
  public static final String SERIALIZED_NAME_MIN_READY_SECONDS = "minReadySeconds";

  @SerializedName(SERIALIZED_NAME_MIN_READY_SECONDS)
  private Integer minReadySeconds;

  public static final String SERIALIZED_NAME_REPLICAS = "replicas";

  @SerializedName(SERIALIZED_NAME_REPLICAS)
  private Integer replicas;

  public static final String SERIALIZED_NAME_SELECTOR = "selector";

  @SerializedName(SERIALIZED_NAME_SELECTOR)
  private V1LabelSelector selector;

  public static final String SERIALIZED_NAME_TEMPLATE = "template";

  @SerializedName(SERIALIZED_NAME_TEMPLATE)
  private V1PodTemplateSpec template;

  public V1ReplicaSetSpec minReadySeconds(Integer minReadySeconds) {

    this.minReadySeconds = minReadySeconds;
    return this;
  }

  /**
   * Minimum number of seconds for which a newly created pod should be ready without any of its
   * container crashing, for it to be considered available. Defaults to 0 (pod will be considered
   * available as soon as it is ready)
   *
   * @return minReadySeconds
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "Minimum number of seconds for which a newly created pod should be ready without any of its container crashing, for it to be considered available. Defaults to 0 (pod will be considered available as soon as it is ready)")
  public Integer getMinReadySeconds() {
    return minReadySeconds;
  }

  public void setMinReadySeconds(Integer minReadySeconds) {
    this.minReadySeconds = minReadySeconds;
  }

  public V1ReplicaSetSpec replicas(Integer replicas) {

    this.replicas = replicas;
    return this;
  }

  /**
   * Replicas is the number of desired replicas. This is a pointer to distinguish between explicit
   * zero and unspecified. Defaults to 1. More info:
   * https://kubernetes.io/docs/concepts/workloads/controllers/replicationcontroller/#what-is-a-replicationcontroller
   *
   * @return replicas
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "Replicas is the number of desired replicas. This is a pointer to distinguish between explicit zero and unspecified. Defaults to 1. More info: https://kubernetes.io/docs/concepts/workloads/controllers/replicationcontroller/#what-is-a-replicationcontroller")
  public Integer getReplicas() {
    return replicas;
  }

  public void setReplicas(Integer replicas) {
    this.replicas = replicas;
  }

  public V1ReplicaSetSpec selector(V1LabelSelector selector) {

    this.selector = selector;
    return this;
  }

  /**
   * Get selector
   *
   * @return selector
   */
  @ApiModelProperty(required = true, value = "")
  public V1LabelSelector getSelector() {
    return selector;
  }

  public void setSelector(V1LabelSelector selector) {
    this.selector = selector;
  }

  public V1ReplicaSetSpec template(V1PodTemplateSpec template) {

    this.template = template;
    return this;
  }

  /**
   * Get template
   *
   * @return template
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  public V1PodTemplateSpec getTemplate() {
    return template;
  }

  public void setTemplate(V1PodTemplateSpec template) {
    this.template = template;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1ReplicaSetSpec v1ReplicaSetSpec = (V1ReplicaSetSpec) o;
    return Objects.equals(this.minReadySeconds, v1ReplicaSetSpec.minReadySeconds)
        && Objects.equals(this.replicas, v1ReplicaSetSpec.replicas)
        && Objects.equals(this.selector, v1ReplicaSetSpec.selector)
        && Objects.equals(this.template, v1ReplicaSetSpec.template);
  }

  @Override
  public int hashCode() {
    return Objects.hash(minReadySeconds, replicas, selector, template);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1ReplicaSetSpec {\n");
    sb.append("    minReadySeconds: ").append(toIndentedString(minReadySeconds)).append("\n");
    sb.append("    replicas: ").append(toIndentedString(replicas)).append("\n");
    sb.append("    selector: ").append(toIndentedString(selector)).append("\n");
    sb.append("    template: ").append(toIndentedString(template)).append("\n");
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
