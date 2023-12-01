/*
Copyright 2023 The Kubernetes Authors.
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

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * CrossVersionObjectReference contains enough information to let you identify the referred resource.
 */
@ApiModel(description = "CrossVersionObjectReference contains enough information to let you identify the referred resource.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-12-01T19:05:21.333462Z[Etc/UTC]")
public class V1CrossVersionObjectReference {
  public static final String SERIALIZED_NAME_API_VERSION = "apiVersion";
  @SerializedName(SERIALIZED_NAME_API_VERSION)
  private String apiVersion;

  public static final String SERIALIZED_NAME_KIND = "kind";
  @SerializedName(SERIALIZED_NAME_KIND)
  private String kind;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;


  public V1CrossVersionObjectReference apiVersion(String apiVersion) {

    this.apiVersion = apiVersion;
    return this;
  }

   /**
   * apiVersion is the API version of the referent
   * @return apiVersion
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "apiVersion is the API version of the referent")

  public String getApiVersion() {
    return apiVersion;
  }


  public void setApiVersion(String apiVersion) {
    this.apiVersion = apiVersion;
  }


  public V1CrossVersionObjectReference kind(String kind) {

    this.kind = kind;
    return this;
  }

   /**
   * kind is the kind of the referent; More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
   * @return kind
  **/
  @ApiModelProperty(required = true, value = "kind is the kind of the referent; More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds")

  public String getKind() {
    return kind;
  }


  public void setKind(String kind) {
    this.kind = kind;
  }


  public V1CrossVersionObjectReference name(String name) {

    this.name = name;
    return this;
  }

   /**
   * name is the name of the referent; More info: https://kubernetes.io/docs/concepts/overview/working-with-objects/names/#names
   * @return name
  **/
  @ApiModelProperty(required = true, value = "name is the name of the referent; More info: https://kubernetes.io/docs/concepts/overview/working-with-objects/names/#names")

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
    V1CrossVersionObjectReference v1CrossVersionObjectReference = (V1CrossVersionObjectReference) o;
    return Objects.equals(this.apiVersion, v1CrossVersionObjectReference.apiVersion) &&
        Objects.equals(this.kind, v1CrossVersionObjectReference.kind) &&
        Objects.equals(this.name, v1CrossVersionObjectReference.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(apiVersion, kind, name);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1CrossVersionObjectReference {\n");
    sb.append("    apiVersion: ").append(toIndentedString(apiVersion)).append("\n");
    sb.append("    kind: ").append(toIndentedString(kind)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}
