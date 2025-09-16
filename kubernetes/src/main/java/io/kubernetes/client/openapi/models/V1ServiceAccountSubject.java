/*
Copyright 2025 The Kubernetes Authors.
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
 * ServiceAccountSubject holds detailed information for service-account-kind subject.
 */
@ApiModel(description = "ServiceAccountSubject holds detailed information for service-account-kind subject.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-09-12T23:11:52.603861Z[Etc/UTC]")
public class V1ServiceAccountSubject {
  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_NAMESPACE = "namespace";
  @SerializedName(SERIALIZED_NAME_NAMESPACE)
  private String namespace;


  public V1ServiceAccountSubject name(String name) {

    this.name = name;
    return this;
  }

   /**
   * &#x60;name&#x60; is the name of matching ServiceAccount objects, or \&quot;*\&quot; to match regardless of name. Required.
   * @return name
  **/
  @ApiModelProperty(required = true, value = "`name` is the name of matching ServiceAccount objects, or \"*\" to match regardless of name. Required.")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public V1ServiceAccountSubject namespace(String namespace) {

    this.namespace = namespace;
    return this;
  }

   /**
   * &#x60;namespace&#x60; is the namespace of matching ServiceAccount objects. Required.
   * @return namespace
  **/
  @ApiModelProperty(required = true, value = "`namespace` is the namespace of matching ServiceAccount objects. Required.")

  public String getNamespace() {
    return namespace;
  }


  public void setNamespace(String namespace) {
    this.namespace = namespace;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1ServiceAccountSubject v1ServiceAccountSubject = (V1ServiceAccountSubject) o;
    return Objects.equals(this.name, v1ServiceAccountSubject.name) &&
        Objects.equals(this.namespace, v1ServiceAccountSubject.namespace);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, namespace);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1ServiceAccountSubject {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    namespace: ").append(toIndentedString(namespace)).append("\n");
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
