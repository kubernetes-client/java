/*
Copyright 2024 The Kubernetes Authors.
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
import io.kubernetes.client.openapi.models.V1alpha2NamedResourcesAttribute;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * NamedResourcesInstance represents one individual hardware instance that can be selected based on its attributes.
 */
@ApiModel(description = "NamedResourcesInstance represents one individual hardware instance that can be selected based on its attributes.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-23T13:45:08.546919Z[Etc/UTC]")
public class V1alpha2NamedResourcesInstance {
  public static final String SERIALIZED_NAME_ATTRIBUTES = "attributes";
  @SerializedName(SERIALIZED_NAME_ATTRIBUTES)
  private List<V1alpha2NamedResourcesAttribute> attributes = null;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;


  public V1alpha2NamedResourcesInstance attributes(List<V1alpha2NamedResourcesAttribute> attributes) {

    this.attributes = attributes;
    return this;
  }

  public V1alpha2NamedResourcesInstance addAttributesItem(V1alpha2NamedResourcesAttribute attributesItem) {
    if (this.attributes == null) {
      this.attributes = new ArrayList<>();
    }
    this.attributes.add(attributesItem);
    return this;
  }

   /**
   * Attributes defines the attributes of this resource instance. The name of each attribute must be unique.
   * @return attributes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Attributes defines the attributes of this resource instance. The name of each attribute must be unique.")

  public List<V1alpha2NamedResourcesAttribute> getAttributes() {
    return attributes;
  }


  public void setAttributes(List<V1alpha2NamedResourcesAttribute> attributes) {
    this.attributes = attributes;
  }


  public V1alpha2NamedResourcesInstance name(String name) {

    this.name = name;
    return this;
  }

   /**
   * Name is unique identifier among all resource instances managed by the driver on the node. It must be a DNS subdomain.
   * @return name
  **/
  @ApiModelProperty(required = true, value = "Name is unique identifier among all resource instances managed by the driver on the node. It must be a DNS subdomain.")

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
    V1alpha2NamedResourcesInstance v1alpha2NamedResourcesInstance = (V1alpha2NamedResourcesInstance) o;
    return Objects.equals(this.attributes, v1alpha2NamedResourcesInstance.attributes) &&
        Objects.equals(this.name, v1alpha2NamedResourcesInstance.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(attributes, name);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1alpha2NamedResourcesInstance {\n");
    sb.append("    attributes: ").append(toIndentedString(attributes)).append("\n");
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
