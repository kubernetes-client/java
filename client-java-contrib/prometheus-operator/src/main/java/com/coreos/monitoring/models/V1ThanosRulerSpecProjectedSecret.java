/*
Copyright 2020 The Kubernetes Authors.
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
package com.coreos.monitoring.models;

import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/** information about the secret data to project */
@ApiModel(description = "information about the secret data to project")
@javax.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    date = "2020-08-31T19:41:55.826Z[Etc/UTC]")
public class V1ThanosRulerSpecProjectedSecret {
  public static final String SERIALIZED_NAME_ITEMS = "items";

  @SerializedName(SERIALIZED_NAME_ITEMS)
  private List<V1ThanosRulerSpecConfigMapItems> items = null;

  public static final String SERIALIZED_NAME_NAME = "name";

  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_OPTIONAL = "optional";

  @SerializedName(SERIALIZED_NAME_OPTIONAL)
  private Boolean optional;

  public V1ThanosRulerSpecProjectedSecret items(List<V1ThanosRulerSpecConfigMapItems> items) {

    this.items = items;
    return this;
  }

  public V1ThanosRulerSpecProjectedSecret addItemsItem(V1ThanosRulerSpecConfigMapItems itemsItem) {
    if (this.items == null) {
      this.items = new ArrayList<V1ThanosRulerSpecConfigMapItems>();
    }
    this.items.add(itemsItem);
    return this;
  }

  /**
   * If unspecified, each key-value pair in the Data field of the referenced Secret will be
   * projected into the volume as a file whose name is the key and content is the value. If
   * specified, the listed keys will be projected into the specified paths, and unlisted keys will
   * not be present. If a key is specified which is not present in the Secret, the volume setup will
   * error unless it is marked optional. Paths must be relative and may not contain the &#39;..&#39;
   * path or start with &#39;..&#39;.
   *
   * @return items
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "If unspecified, each key-value pair in the Data field of the referenced Secret will be projected into the volume as a file whose name is the key and content is the value. If specified, the listed keys will be projected into the specified paths, and unlisted keys will not be present. If a key is specified which is not present in the Secret, the volume setup will error unless it is marked optional. Paths must be relative and may not contain the '..' path or start with '..'.")
  public List<V1ThanosRulerSpecConfigMapItems> getItems() {
    return items;
  }

  public void setItems(List<V1ThanosRulerSpecConfigMapItems> items) {
    this.items = items;
  }

  public V1ThanosRulerSpecProjectedSecret name(String name) {

    this.name = name;
    return this;
  }

  /**
   * Name of the referent. More info:
   * https://kubernetes.io/docs/concepts/overview/working-with-objects/names/#names TODO: Add other
   * useful fields. apiVersion, kind, uid?
   *
   * @return name
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "Name of the referent. More info: https://kubernetes.io/docs/concepts/overview/working-with-objects/names/#names TODO: Add other useful fields. apiVersion, kind, uid?")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public V1ThanosRulerSpecProjectedSecret optional(Boolean optional) {

    this.optional = optional;
    return this;
  }

  /**
   * Specify whether the Secret or its key must be defined
   *
   * @return optional
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Specify whether the Secret or its key must be defined")
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
    V1ThanosRulerSpecProjectedSecret v1ThanosRulerSpecProjectedSecret =
        (V1ThanosRulerSpecProjectedSecret) o;
    return Objects.equals(this.items, v1ThanosRulerSpecProjectedSecret.items)
        && Objects.equals(this.name, v1ThanosRulerSpecProjectedSecret.name)
        && Objects.equals(this.optional, v1ThanosRulerSpecProjectedSecret.optional);
  }

  @Override
  public int hashCode() {
    return Objects.hash(items, name, optional);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1ThanosRulerSpecProjectedSecret {\n");
    sb.append("    items: ").append(toIndentedString(items)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    optional: ").append(toIndentedString(optional)).append("\n");
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
