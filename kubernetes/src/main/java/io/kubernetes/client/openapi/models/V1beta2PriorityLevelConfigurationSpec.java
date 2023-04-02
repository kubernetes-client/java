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

/** PriorityLevelConfigurationSpec specifies the configuration of a priority level. */
@ApiModel(
    description = "PriorityLevelConfigurationSpec specifies the configuration of a priority level.")
@javax.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    date = "2022-12-05T08:14:34.919Z[Etc/UTC]")
public class V1beta2PriorityLevelConfigurationSpec {
  public static final String SERIALIZED_NAME_LIMITED = "limited";

  @SerializedName(SERIALIZED_NAME_LIMITED)
  private V1beta2LimitedPriorityLevelConfiguration limited;

  public static final String SERIALIZED_NAME_TYPE = "type";

  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;

  public V1beta2PriorityLevelConfigurationSpec limited(
      V1beta2LimitedPriorityLevelConfiguration limited) {

    this.limited = limited;
    return this;
  }

  /**
   * Get limited
   *
   * @return limited
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  public V1beta2LimitedPriorityLevelConfiguration getLimited() {
    return limited;
  }

  public void setLimited(V1beta2LimitedPriorityLevelConfiguration limited) {
    this.limited = limited;
  }

  public V1beta2PriorityLevelConfigurationSpec type(String type) {

    this.type = type;
    return this;
  }

  /**
   * &#x60;type&#x60; indicates whether this priority level is subject to limitation on request
   * execution. A value of &#x60;\&quot;Exempt\&quot;&#x60; means that requests of this priority
   * level are not subject to a limit (and thus are never queued) and do not detract from the
   * capacity made available to other priority levels. A value of &#x60;\&quot;Limited\&quot;&#x60;
   * means that (a) requests of this priority level _are_ subject to limits and (b) some of the
   * server&#39;s limited capacity is made available exclusively to this priority level. Required.
   *
   * @return type
   */
  @ApiModelProperty(
      required = true,
      value =
          "`type` indicates whether this priority level is subject to limitation on request execution.  A value of `\"Exempt\"` means that requests of this priority level are not subject to a limit (and thus are never queued) and do not detract from the capacity made available to other priority levels.  A value of `\"Limited\"` means that (a) requests of this priority level _are_ subject to limits and (b) some of the server's limited capacity is made available exclusively to this priority level. Required.")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1beta2PriorityLevelConfigurationSpec v1beta2PriorityLevelConfigurationSpec =
        (V1beta2PriorityLevelConfigurationSpec) o;
    return Objects.equals(this.limited, v1beta2PriorityLevelConfigurationSpec.limited)
        && Objects.equals(this.type, v1beta2PriorityLevelConfigurationSpec.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(limited, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1beta2PriorityLevelConfigurationSpec {\n");
    sb.append("    limited: ").append(toIndentedString(limited)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
