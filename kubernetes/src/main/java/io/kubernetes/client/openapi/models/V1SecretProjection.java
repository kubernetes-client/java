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
import io.kubernetes.client.openapi.models.V1KeyToPath;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Adapts a secret into a projected volume.  The contents of the target Secret&#39;s Data field will be presented in a projected volume as files using the keys in the Data field as the file names. Note that this is identical to a secret volume source without the default mode.
 */
@ApiModel(description = "Adapts a secret into a projected volume.  The contents of the target Secret's Data field will be presented in a projected volume as files using the keys in the Data field as the file names. Note that this is identical to a secret volume source without the default mode.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-09-12T22:12:20.439480Z[Etc/UTC]")
public class V1SecretProjection {
  public static final String SERIALIZED_NAME_ITEMS = "items";
  @SerializedName(SERIALIZED_NAME_ITEMS)
  private List<V1KeyToPath> items = null;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_OPTIONAL = "optional";
  @SerializedName(SERIALIZED_NAME_OPTIONAL)
  private Boolean optional;


  public V1SecretProjection items(List<V1KeyToPath> items) {

    this.items = items;
    return this;
  }

  public V1SecretProjection addItemsItem(V1KeyToPath itemsItem) {
    if (this.items == null) {
      this.items = new ArrayList<>();
    }
    this.items.add(itemsItem);
    return this;
  }

   /**
   * items if unspecified, each key-value pair in the Data field of the referenced Secret will be projected into the volume as a file whose name is the key and content is the value. If specified, the listed keys will be projected into the specified paths, and unlisted keys will not be present. If a key is specified which is not present in the Secret, the volume setup will error unless it is marked optional. Paths must be relative and may not contain the &#39;..&#39; path or start with &#39;..&#39;.
   * @return items
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "items if unspecified, each key-value pair in the Data field of the referenced Secret will be projected into the volume as a file whose name is the key and content is the value. If specified, the listed keys will be projected into the specified paths, and unlisted keys will not be present. If a key is specified which is not present in the Secret, the volume setup will error unless it is marked optional. Paths must be relative and may not contain the '..' path or start with '..'.")

  public List<V1KeyToPath> getItems() {
    return items;
  }


  public void setItems(List<V1KeyToPath> items) {
    this.items = items;
  }


  public V1SecretProjection name(String name) {

    this.name = name;
    return this;
  }

   /**
   * Name of the referent. This field is effectively required, but due to backwards compatibility is allowed to be empty. Instances of this type with an empty value here are almost certainly wrong. More info: https://kubernetes.io/docs/concepts/overview/working-with-objects/names/#names
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Name of the referent. This field is effectively required, but due to backwards compatibility is allowed to be empty. Instances of this type with an empty value here are almost certainly wrong. More info: https://kubernetes.io/docs/concepts/overview/working-with-objects/names/#names")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public V1SecretProjection optional(Boolean optional) {

    this.optional = optional;
    return this;
  }

   /**
   * optional field specify whether the Secret or its key must be defined
   * @return optional
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "optional field specify whether the Secret or its key must be defined")

  public Boolean getOptional() {
    return optional;
  }


  public void setOptional(Boolean optional) {
    this.optional = optional;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1SecretProjection v1SecretProjection = (V1SecretProjection) o;
    return Objects.equals(this.items, v1SecretProjection.items) &&
        Objects.equals(this.name, v1SecretProjection.name) &&
        Objects.equals(this.optional, v1SecretProjection.optional);
  }

  @Override
  public int hashCode() {
    return Objects.hash(items, name, optional);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1SecretProjection {\n");
    sb.append("    items: ").append(toIndentedString(items)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    optional: ").append(toIndentedString(optional)).append("\n");
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
