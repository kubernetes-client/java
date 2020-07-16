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
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/** ScaleStatus represents the current status of a scale subresource. */
@ApiModel(description = "ScaleStatus represents the current status of a scale subresource.")
@javax.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    date = "2020-06-19T10:47:33.387Z[Etc/UTC]")
public class AppsV1beta1ScaleStatus {
  public static final String SERIALIZED_NAME_REPLICAS = "replicas";

  @SerializedName(SERIALIZED_NAME_REPLICAS)
  private Integer replicas;

  public static final String SERIALIZED_NAME_SELECTOR = "selector";

  @SerializedName(SERIALIZED_NAME_SELECTOR)
  private Map<String, String> selector = null;

  public static final String SERIALIZED_NAME_TARGET_SELECTOR = "targetSelector";

  @SerializedName(SERIALIZED_NAME_TARGET_SELECTOR)
  private String targetSelector;

  public AppsV1beta1ScaleStatus replicas(Integer replicas) {

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

  public AppsV1beta1ScaleStatus selector(Map<String, String> selector) {

    this.selector = selector;
    return this;
  }

  public AppsV1beta1ScaleStatus putSelectorItem(String key, String selectorItem) {
    if (this.selector == null) {
      this.selector = new HashMap<String, String>();
    }
    this.selector.put(key, selectorItem);
    return this;
  }

  /**
   * label query over pods that should match the replicas count. More info:
   * http://kubernetes.io/docs/user-guide/labels#label-selectors
   *
   * @return selector
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "label query over pods that should match the replicas count. More info: http://kubernetes.io/docs/user-guide/labels#label-selectors")
  public Map<String, String> getSelector() {
    return selector;
  }

  public void setSelector(Map<String, String> selector) {
    this.selector = selector;
  }

  public AppsV1beta1ScaleStatus targetSelector(String targetSelector) {

    this.targetSelector = targetSelector;
    return this;
  }

  /**
   * label selector for pods that should match the replicas count. This is a serializated version of
   * both map-based and more expressive set-based selectors. This is done to avoid introspection in
   * the clients. The string will be in the same format as the query-param syntax. If the target
   * type only supports map-based selectors, both this field and map-based selector field are
   * populated. More info:
   * https://kubernetes.io/docs/concepts/overview/working-with-objects/labels/#label-selectors
   *
   * @return targetSelector
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "label selector for pods that should match the replicas count. This is a serializated version of both map-based and more expressive set-based selectors. This is done to avoid introspection in the clients. The string will be in the same format as the query-param syntax. If the target type only supports map-based selectors, both this field and map-based selector field are populated. More info: https://kubernetes.io/docs/concepts/overview/working-with-objects/labels/#label-selectors")
  public String getTargetSelector() {
    return targetSelector;
  }

  public void setTargetSelector(String targetSelector) {
    this.targetSelector = targetSelector;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AppsV1beta1ScaleStatus appsV1beta1ScaleStatus = (AppsV1beta1ScaleStatus) o;
    return Objects.equals(this.replicas, appsV1beta1ScaleStatus.replicas)
        && Objects.equals(this.selector, appsV1beta1ScaleStatus.selector)
        && Objects.equals(this.targetSelector, appsV1beta1ScaleStatus.targetSelector);
  }

  @Override
  public int hashCode() {
    return Objects.hash(replicas, selector, targetSelector);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AppsV1beta1ScaleStatus {\n");
    sb.append("    replicas: ").append(toIndentedString(replicas)).append("\n");
    sb.append("    selector: ").append(toIndentedString(selector)).append("\n");
    sb.append("    targetSelector: ").append(toIndentedString(targetSelector)).append("\n");
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
