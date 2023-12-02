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
 * ResourceClassParametersReference contains enough information to let you locate the parameters for a ResourceClass.
 */
@ApiModel(description = "ResourceClassParametersReference contains enough information to let you locate the parameters for a ResourceClass.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-12-01T19:05:21.333462Z[Etc/UTC]")
public class V1alpha2ResourceClassParametersReference {
  public static final String SERIALIZED_NAME_API_GROUP = "apiGroup";
  @SerializedName(SERIALIZED_NAME_API_GROUP)
  private String apiGroup;

  public static final String SERIALIZED_NAME_KIND = "kind";
  @SerializedName(SERIALIZED_NAME_KIND)
  private String kind;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_NAMESPACE = "namespace";
  @SerializedName(SERIALIZED_NAME_NAMESPACE)
  private String namespace;


  public V1alpha2ResourceClassParametersReference apiGroup(String apiGroup) {

    this.apiGroup = apiGroup;
    return this;
  }

   /**
   * APIGroup is the group for the resource being referenced. It is empty for the core API. This matches the group in the APIVersion that is used when creating the resources.
   * @return apiGroup
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "APIGroup is the group for the resource being referenced. It is empty for the core API. This matches the group in the APIVersion that is used when creating the resources.")

  public String getApiGroup() {
    return apiGroup;
  }


  public void setApiGroup(String apiGroup) {
    this.apiGroup = apiGroup;
  }


  public V1alpha2ResourceClassParametersReference kind(String kind) {

    this.kind = kind;
    return this;
  }

   /**
   * Kind is the type of resource being referenced. This is the same value as in the parameter object&#39;s metadata.
   * @return kind
  **/
  @ApiModelProperty(required = true, value = "Kind is the type of resource being referenced. This is the same value as in the parameter object's metadata.")

  public String getKind() {
    return kind;
  }


  public void setKind(String kind) {
    this.kind = kind;
  }


  public V1alpha2ResourceClassParametersReference name(String name) {

    this.name = name;
    return this;
  }

   /**
   * Name is the name of resource being referenced.
   * @return name
  **/
  @ApiModelProperty(required = true, value = "Name is the name of resource being referenced.")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public V1alpha2ResourceClassParametersReference namespace(String namespace) {

    this.namespace = namespace;
    return this;
  }

   /**
   * Namespace that contains the referenced resource. Must be empty for cluster-scoped resources and non-empty for namespaced resources.
   * @return namespace
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Namespace that contains the referenced resource. Must be empty for cluster-scoped resources and non-empty for namespaced resources.")

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
    V1alpha2ResourceClassParametersReference v1alpha2ResourceClassParametersReference = (V1alpha2ResourceClassParametersReference) o;
    return Objects.equals(this.apiGroup, v1alpha2ResourceClassParametersReference.apiGroup) &&
        Objects.equals(this.kind, v1alpha2ResourceClassParametersReference.kind) &&
        Objects.equals(this.name, v1alpha2ResourceClassParametersReference.name) &&
        Objects.equals(this.namespace, v1alpha2ResourceClassParametersReference.namespace);
  }

  @Override
  public int hashCode() {
    return Objects.hash(apiGroup, kind, name, namespace);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1alpha2ResourceClassParametersReference {\n");
    sb.append("    apiGroup: ").append(toIndentedString(apiGroup)).append("\n");
    sb.append("    kind: ").append(toIndentedString(kind)).append("\n");
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
