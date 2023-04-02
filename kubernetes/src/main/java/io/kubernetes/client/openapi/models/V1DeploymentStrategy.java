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

/** DeploymentStrategy describes how to replace existing pods with new ones. */
@ApiModel(description = "DeploymentStrategy describes how to replace existing pods with new ones.")
@javax.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    date = "2022-12-05T08:14:34.919Z[Etc/UTC]")
public class V1DeploymentStrategy {
  public static final String SERIALIZED_NAME_ROLLING_UPDATE = "rollingUpdate";

  @SerializedName(SERIALIZED_NAME_ROLLING_UPDATE)
  private V1RollingUpdateDeployment rollingUpdate;

  public static final String SERIALIZED_NAME_TYPE = "type";

  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;

  public V1DeploymentStrategy rollingUpdate(V1RollingUpdateDeployment rollingUpdate) {

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
  public V1RollingUpdateDeployment getRollingUpdate() {
    return rollingUpdate;
  }

  public void setRollingUpdate(V1RollingUpdateDeployment rollingUpdate) {
    this.rollingUpdate = rollingUpdate;
  }

  public V1DeploymentStrategy type(String type) {

    this.type = type;
    return this;
  }

  /**
   * Type of deployment. Can be \&quot;Recreate\&quot; or \&quot;RollingUpdate\&quot;. Default is
   * RollingUpdate.
   *
   * @return type
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "Type of deployment. Can be \"Recreate\" or \"RollingUpdate\". Default is RollingUpdate.  ")
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
    V1DeploymentStrategy v1DeploymentStrategy = (V1DeploymentStrategy) o;
    return Objects.equals(this.rollingUpdate, v1DeploymentStrategy.rollingUpdate)
        && Objects.equals(this.type, v1DeploymentStrategy.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(rollingUpdate, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1DeploymentStrategy {\n");
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
