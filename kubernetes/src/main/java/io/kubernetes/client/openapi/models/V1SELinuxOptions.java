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

/** SELinuxOptions are the labels to be applied to the container */
@ApiModel(description = "SELinuxOptions are the labels to be applied to the container")
@javax.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    date = "2022-12-05T08:14:34.919Z[Etc/UTC]")
public class V1SELinuxOptions {
  public static final String SERIALIZED_NAME_LEVEL = "level";

  @SerializedName(SERIALIZED_NAME_LEVEL)
  private String level;

  public static final String SERIALIZED_NAME_ROLE = "role";

  @SerializedName(SERIALIZED_NAME_ROLE)
  private String role;

  public static final String SERIALIZED_NAME_TYPE = "type";

  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;

  public static final String SERIALIZED_NAME_USER = "user";

  @SerializedName(SERIALIZED_NAME_USER)
  private String user;

  public V1SELinuxOptions level(String level) {

    this.level = level;
    return this;
  }

  /**
   * Level is SELinux level label that applies to the container.
   *
   * @return level
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Level is SELinux level label that applies to the container.")
  public String getLevel() {
    return level;
  }

  public void setLevel(String level) {
    this.level = level;
  }

  public V1SELinuxOptions role(String role) {

    this.role = role;
    return this;
  }

  /**
   * Role is a SELinux role label that applies to the container.
   *
   * @return role
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Role is a SELinux role label that applies to the container.")
  public String getRole() {
    return role;
  }

  public void setRole(String role) {
    this.role = role;
  }

  public V1SELinuxOptions type(String type) {

    this.type = type;
    return this;
  }

  /**
   * Type is a SELinux type label that applies to the container.
   *
   * @return type
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Type is a SELinux type label that applies to the container.")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public V1SELinuxOptions user(String user) {

    this.user = user;
    return this;
  }

  /**
   * User is a SELinux user label that applies to the container.
   *
   * @return user
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "User is a SELinux user label that applies to the container.")
  public String getUser() {
    return user;
  }

  public void setUser(String user) {
    this.user = user;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1SELinuxOptions v1SELinuxOptions = (V1SELinuxOptions) o;
    return Objects.equals(this.level, v1SELinuxOptions.level)
        && Objects.equals(this.role, v1SELinuxOptions.role)
        && Objects.equals(this.type, v1SELinuxOptions.type)
        && Objects.equals(this.user, v1SELinuxOptions.user);
  }

  @Override
  public int hashCode() {
    return Objects.hash(level, role, type, user);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1SELinuxOptions {\n");
    sb.append("    level: ").append(toIndentedString(level)).append("\n");
    sb.append("    role: ").append(toIndentedString(role)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
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
