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

/** BoundObjectReference is a reference to an object that a token is bound to. */
@ApiModel(
    description = "BoundObjectReference is a reference to an object that a token is bound to.")
@javax.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    date = "2022-12-05T08:14:34.919Z[Etc/UTC]")
public class V1BoundObjectReference {
  public static final String SERIALIZED_NAME_API_VERSION = "apiVersion";

  @SerializedName(SERIALIZED_NAME_API_VERSION)
  private String apiVersion;

  public static final String SERIALIZED_NAME_KIND = "kind";

  @SerializedName(SERIALIZED_NAME_KIND)
  private String kind;

  public static final String SERIALIZED_NAME_NAME = "name";

  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_UID = "uid";

  @SerializedName(SERIALIZED_NAME_UID)
  private String uid;

  public V1BoundObjectReference apiVersion(String apiVersion) {

    this.apiVersion = apiVersion;
    return this;
  }

  /**
   * API version of the referent.
   *
   * @return apiVersion
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "API version of the referent.")
  public String getApiVersion() {
    return apiVersion;
  }

  public void setApiVersion(String apiVersion) {
    this.apiVersion = apiVersion;
  }

  public V1BoundObjectReference kind(String kind) {

    this.kind = kind;
    return this;
  }

  /**
   * Kind of the referent. Valid kinds are &#39;Pod&#39; and &#39;Secret&#39;.
   *
   * @return kind
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Kind of the referent. Valid kinds are 'Pod' and 'Secret'.")
  public String getKind() {
    return kind;
  }

  public void setKind(String kind) {
    this.kind = kind;
  }

  public V1BoundObjectReference name(String name) {

    this.name = name;
    return this;
  }

  /**
   * Name of the referent.
   *
   * @return name
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Name of the referent.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public V1BoundObjectReference uid(String uid) {

    this.uid = uid;
    return this;
  }

  /**
   * UID of the referent.
   *
   * @return uid
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "UID of the referent.")
  public String getUid() {
    return uid;
  }

  public void setUid(String uid) {
    this.uid = uid;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1BoundObjectReference v1BoundObjectReference = (V1BoundObjectReference) o;
    return Objects.equals(this.apiVersion, v1BoundObjectReference.apiVersion)
        && Objects.equals(this.kind, v1BoundObjectReference.kind)
        && Objects.equals(this.name, v1BoundObjectReference.name)
        && Objects.equals(this.uid, v1BoundObjectReference.uid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(apiVersion, kind, name, uid);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1BoundObjectReference {\n");
    sb.append("    apiVersion: ").append(toIndentedString(apiVersion)).append("\n");
    sb.append("    kind: ").append(toIndentedString(kind)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    uid: ").append(toIndentedString(uid)).append("\n");
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
