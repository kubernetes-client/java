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

/** RoleRef contains information that points to the role being used */
@ApiModel(description = "RoleRef contains information that points to the role being used")
@javax.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    date = "2022-12-05T08:14:34.919Z[Etc/UTC]")
public class V1RoleRef {
  public static final String SERIALIZED_NAME_API_GROUP = "apiGroup";

  @SerializedName(SERIALIZED_NAME_API_GROUP)
  private String apiGroup;

  public static final String SERIALIZED_NAME_KIND = "kind";

  @SerializedName(SERIALIZED_NAME_KIND)
  private String kind;

  public static final String SERIALIZED_NAME_NAME = "name";

  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public V1RoleRef apiGroup(String apiGroup) {

    this.apiGroup = apiGroup;
    return this;
  }

  /**
   * APIGroup is the group for the resource being referenced
   *
   * @return apiGroup
   */
  @ApiModelProperty(
      required = true,
      value = "APIGroup is the group for the resource being referenced")
  public String getApiGroup() {
    return apiGroup;
  }

  public void setApiGroup(String apiGroup) {
    this.apiGroup = apiGroup;
  }

  public V1RoleRef kind(String kind) {

    this.kind = kind;
    return this;
  }

  /**
   * Kind is the type of resource being referenced
   *
   * @return kind
   */
  @ApiModelProperty(required = true, value = "Kind is the type of resource being referenced")
  public String getKind() {
    return kind;
  }

  public void setKind(String kind) {
    this.kind = kind;
  }

  public V1RoleRef name(String name) {

    this.name = name;
    return this;
  }

  /**
   * Name is the name of resource being referenced
   *
   * @return name
   */
  @ApiModelProperty(required = true, value = "Name is the name of resource being referenced")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1RoleRef v1RoleRef = (V1RoleRef) o;
    return Objects.equals(this.apiGroup, v1RoleRef.apiGroup)
        && Objects.equals(this.kind, v1RoleRef.kind)
        && Objects.equals(this.name, v1RoleRef.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(apiGroup, kind, name);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1RoleRef {\n");
    sb.append("    apiGroup: ").append(toIndentedString(apiGroup)).append("\n");
    sb.append("    kind: ").append(toIndentedString(kind)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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
