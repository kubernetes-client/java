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

/** DownwardAPI represents downward API about the pod that should populate this volume */
@ApiModel(
    description =
        "DownwardAPI represents downward API about the pod that should populate this volume")
@javax.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    date = "2020-08-31T19:41:55.826Z[Etc/UTC]")
public class V1ThanosRulerSpecDownwardAPI {
  public static final String SERIALIZED_NAME_DEFAULT_MODE = "defaultMode";

  @SerializedName(SERIALIZED_NAME_DEFAULT_MODE)
  private Integer defaultMode;

  public static final String SERIALIZED_NAME_ITEMS = "items";

  @SerializedName(SERIALIZED_NAME_ITEMS)
  private List<V1ThanosRulerSpecDownwardAPIItems> items = null;

  public V1ThanosRulerSpecDownwardAPI defaultMode(Integer defaultMode) {

    this.defaultMode = defaultMode;
    return this;
  }

  /**
   * Optional: mode bits to use on created files by default. Must be a value between 0 and 0777.
   * Defaults to 0644. Directories within the path are not affected by this setting. This might be
   * in conflict with other options that affect the file mode, like fsGroup, and the result can be
   * other mode bits set.
   *
   * @return defaultMode
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "Optional: mode bits to use on created files by default. Must be a value between 0 and 0777. Defaults to 0644. Directories within the path are not affected by this setting. This might be in conflict with other options that affect the file mode, like fsGroup, and the result can be other mode bits set.")
  public Integer getDefaultMode() {
    return defaultMode;
  }

  public void setDefaultMode(Integer defaultMode) {
    this.defaultMode = defaultMode;
  }

  public V1ThanosRulerSpecDownwardAPI items(List<V1ThanosRulerSpecDownwardAPIItems> items) {

    this.items = items;
    return this;
  }

  public V1ThanosRulerSpecDownwardAPI addItemsItem(V1ThanosRulerSpecDownwardAPIItems itemsItem) {
    if (this.items == null) {
      this.items = new ArrayList<V1ThanosRulerSpecDownwardAPIItems>();
    }
    this.items.add(itemsItem);
    return this;
  }

  /**
   * Items is a list of downward API volume file
   *
   * @return items
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Items is a list of downward API volume file")
  public List<V1ThanosRulerSpecDownwardAPIItems> getItems() {
    return items;
  }

  public void setItems(List<V1ThanosRulerSpecDownwardAPIItems> items) {
    this.items = items;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1ThanosRulerSpecDownwardAPI v1ThanosRulerSpecDownwardAPI = (V1ThanosRulerSpecDownwardAPI) o;
    return Objects.equals(this.defaultMode, v1ThanosRulerSpecDownwardAPI.defaultMode)
        && Objects.equals(this.items, v1ThanosRulerSpecDownwardAPI.items);
  }

  @Override
  public int hashCode() {
    return Objects.hash(defaultMode, items);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1ThanosRulerSpecDownwardAPI {\n");
    sb.append("    defaultMode: ").append(toIndentedString(defaultMode)).append("\n");
    sb.append("    items: ").append(toIndentedString(items)).append("\n");
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
