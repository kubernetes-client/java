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

/**
 * CrossVersionObjectReference contains enough information to let you identify the referred
 * resource.
 */
@ApiModel(
    description =
        "CrossVersionObjectReference contains enough information to let you identify the referred resource.")
@javax.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    date = "2022-12-05T08:14:34.919Z[Etc/UTC]")
public class V2CrossVersionObjectReference {
  public static final String SERIALIZED_NAME_API_VERSION = "apiVersion";

  @SerializedName(SERIALIZED_NAME_API_VERSION)
  private String apiVersion;

  public static final String SERIALIZED_NAME_KIND = "kind";

  @SerializedName(SERIALIZED_NAME_KIND)
  private String kind;

  public static final String SERIALIZED_NAME_NAME = "name";

  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public V2CrossVersionObjectReference apiVersion(String apiVersion) {

    this.apiVersion = apiVersion;
    return this;
  }

  /**
   * API version of the referent
   *
   * @return apiVersion
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "API version of the referent")
  public String getApiVersion() {
    return apiVersion;
  }

  public void setApiVersion(String apiVersion) {
    this.apiVersion = apiVersion;
  }

  public V2CrossVersionObjectReference kind(String kind) {

    this.kind = kind;
    return this;
  }

  /**
   * Kind of the referent; More info:
   * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds\&quot;
   *
   * @return kind
   */
  @ApiModelProperty(
      required = true,
      value =
          "Kind of the referent; More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds\"")
  public String getKind() {
    return kind;
  }

  public void setKind(String kind) {
    this.kind = kind;
  }

  public V2CrossVersionObjectReference name(String name) {

    this.name = name;
    return this;
  }

  /**
   * Name of the referent; More info: http://kubernetes.io/docs/user-guide/identifiers#names
   *
   * @return name
   */
  @ApiModelProperty(
      required = true,
      value =
          "Name of the referent; More info: http://kubernetes.io/docs/user-guide/identifiers#names")
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
    V2CrossVersionObjectReference v2CrossVersionObjectReference = (V2CrossVersionObjectReference) o;
    return Objects.equals(this.apiVersion, v2CrossVersionObjectReference.apiVersion)
        && Objects.equals(this.kind, v2CrossVersionObjectReference.kind)
        && Objects.equals(this.name, v2CrossVersionObjectReference.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(apiVersion, kind, name);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V2CrossVersionObjectReference {\n");
    sb.append("    apiVersion: ").append(toIndentedString(apiVersion)).append("\n");
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
