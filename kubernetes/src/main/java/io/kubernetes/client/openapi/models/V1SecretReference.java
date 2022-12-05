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
 * SecretReference represents a Secret Reference. It has enough information to retrieve secret in
 * any namespace
 */
@ApiModel(
    description =
        "SecretReference represents a Secret Reference. It has enough information to retrieve secret in any namespace")
@javax.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    date = "2022-12-05T08:14:34.919Z[Etc/UTC]")
public class V1SecretReference {
  public static final String SERIALIZED_NAME_NAME = "name";

  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_NAMESPACE = "namespace";

  @SerializedName(SERIALIZED_NAME_NAMESPACE)
  private String namespace;

  public V1SecretReference name(String name) {

    this.name = name;
    return this;
  }

  /**
   * name is unique within a namespace to reference a secret resource.
   *
   * @return name
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "name is unique within a namespace to reference a secret resource.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public V1SecretReference namespace(String namespace) {

    this.namespace = namespace;
    return this;
  }

  /**
   * namespace defines the space within which the secret name must be unique.
   *
   * @return namespace
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value = "namespace defines the space within which the secret name must be unique.")
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
    V1SecretReference v1SecretReference = (V1SecretReference) o;
    return Objects.equals(this.name, v1SecretReference.name)
        && Objects.equals(this.namespace, v1SecretReference.namespace);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, namespace);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1SecretReference {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    namespace: ").append(toIndentedString(namespace)).append("\n");
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
