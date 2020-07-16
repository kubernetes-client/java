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
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;

/** V1beta1DaemonSetUpdateStrategy */
@javax.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    date = "2020-06-19T10:47:33.387Z[Etc/UTC]")
public class V1beta1DaemonSetUpdateStrategy {
  public static final String SERIALIZED_NAME_ROLLING_UPDATE = "rollingUpdate";

  @SerializedName(SERIALIZED_NAME_ROLLING_UPDATE)
  private V1beta1RollingUpdateDaemonSet rollingUpdate;

  public static final String SERIALIZED_NAME_TYPE = "type";

  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;

  public V1beta1DaemonSetUpdateStrategy rollingUpdate(V1beta1RollingUpdateDaemonSet rollingUpdate) {

    this.rollingUpdate = rollingUpdate;
    return this;
  }

  /**
   * Get rollingUpdate
   *
   * @return rollingUpdate
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  public V1beta1RollingUpdateDaemonSet getRollingUpdate() {
    return rollingUpdate;
  }

  public void setRollingUpdate(V1beta1RollingUpdateDaemonSet rollingUpdate) {
    this.rollingUpdate = rollingUpdate;
  }

  public V1beta1DaemonSetUpdateStrategy type(String type) {

    this.type = type;
    return this;
  }

  /**
   * Type of daemon set update. Can be \&quot;RollingUpdate\&quot; or \&quot;OnDelete\&quot;.
   * Default is OnDelete.
   *
   * @return type
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "Type of daemon set update. Can be \"RollingUpdate\" or \"OnDelete\". Default is OnDelete.")
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
    V1beta1DaemonSetUpdateStrategy v1beta1DaemonSetUpdateStrategy =
        (V1beta1DaemonSetUpdateStrategy) o;
    return Objects.equals(this.rollingUpdate, v1beta1DaemonSetUpdateStrategy.rollingUpdate)
        && Objects.equals(this.type, v1beta1DaemonSetUpdateStrategy.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(rollingUpdate, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1beta1DaemonSetUpdateStrategy {\n");
    sb.append("    rollingUpdate: ").append(toIndentedString(rollingUpdate)).append("\n");
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
