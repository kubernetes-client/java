/*
Copyright 2021 The Kubernetes Authors.
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
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * RuntimeClassStrategyOptions define the strategy that will dictate the allowable RuntimeClasses
 * for a pod.
 */
@ApiModel(
    description =
        "RuntimeClassStrategyOptions define the strategy that will dictate the allowable RuntimeClasses for a pod.")
@javax.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    date = "2021-12-10T19:11:23.904Z[Etc/UTC]")
public class V1beta1RuntimeClassStrategyOptions {
  public static final String SERIALIZED_NAME_ALLOWED_RUNTIME_CLASS_NAMES =
      "allowedRuntimeClassNames";

  @SerializedName(SERIALIZED_NAME_ALLOWED_RUNTIME_CLASS_NAMES)
  private List<String> allowedRuntimeClassNames = new ArrayList<>();

  public static final String SERIALIZED_NAME_DEFAULT_RUNTIME_CLASS_NAME = "defaultRuntimeClassName";

  @SerializedName(SERIALIZED_NAME_DEFAULT_RUNTIME_CLASS_NAME)
  private String defaultRuntimeClassName;

  public V1beta1RuntimeClassStrategyOptions allowedRuntimeClassNames(
      List<String> allowedRuntimeClassNames) {

    this.allowedRuntimeClassNames = allowedRuntimeClassNames;
    return this;
  }

  public V1beta1RuntimeClassStrategyOptions addAllowedRuntimeClassNamesItem(
      String allowedRuntimeClassNamesItem) {
    this.allowedRuntimeClassNames.add(allowedRuntimeClassNamesItem);
    return this;
  }

  /**
   * allowedRuntimeClassNames is an allowlist of RuntimeClass names that may be specified on a pod.
   * A value of \&quot;*\&quot; means that any RuntimeClass name is allowed, and must be the only
   * item in the list. An empty list requires the RuntimeClassName field to be unset.
   *
   * @return allowedRuntimeClassNames
   */
  @ApiModelProperty(
      required = true,
      value =
          "allowedRuntimeClassNames is an allowlist of RuntimeClass names that may be specified on a pod. A value of \"*\" means that any RuntimeClass name is allowed, and must be the only item in the list. An empty list requires the RuntimeClassName field to be unset.")
  public List<String> getAllowedRuntimeClassNames() {
    return allowedRuntimeClassNames;
  }

  public void setAllowedRuntimeClassNames(List<String> allowedRuntimeClassNames) {
    this.allowedRuntimeClassNames = allowedRuntimeClassNames;
  }

  public V1beta1RuntimeClassStrategyOptions defaultRuntimeClassName(
      String defaultRuntimeClassName) {

    this.defaultRuntimeClassName = defaultRuntimeClassName;
    return this;
  }

  /**
   * defaultRuntimeClassName is the default RuntimeClassName to set on the pod. The default MUST be
   * allowed by the allowedRuntimeClassNames list. A value of nil does not mutate the Pod.
   *
   * @return defaultRuntimeClassName
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "defaultRuntimeClassName is the default RuntimeClassName to set on the pod. The default MUST be allowed by the allowedRuntimeClassNames list. A value of nil does not mutate the Pod.")
  public String getDefaultRuntimeClassName() {
    return defaultRuntimeClassName;
  }

  public void setDefaultRuntimeClassName(String defaultRuntimeClassName) {
    this.defaultRuntimeClassName = defaultRuntimeClassName;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1beta1RuntimeClassStrategyOptions v1beta1RuntimeClassStrategyOptions =
        (V1beta1RuntimeClassStrategyOptions) o;
    return Objects.equals(
            this.allowedRuntimeClassNames,
            v1beta1RuntimeClassStrategyOptions.allowedRuntimeClassNames)
        && Objects.equals(
            this.defaultRuntimeClassName,
            v1beta1RuntimeClassStrategyOptions.defaultRuntimeClassName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(allowedRuntimeClassNames, defaultRuntimeClassName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1beta1RuntimeClassStrategyOptions {\n");
    sb.append("    allowedRuntimeClassNames: ")
        .append(toIndentedString(allowedRuntimeClassNames))
        .append("\n");
    sb.append("    defaultRuntimeClassName: ")
        .append(toIndentedString(defaultRuntimeClassName))
        .append("\n");
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
