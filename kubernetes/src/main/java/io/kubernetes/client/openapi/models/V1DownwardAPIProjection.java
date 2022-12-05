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
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Represents downward API info for projecting into a projected volume. Note that this is identical
 * to a downwardAPI volume source without the default mode.
 */
@ApiModel(
    description =
        "Represents downward API info for projecting into a projected volume. Note that this is identical to a downwardAPI volume source without the default mode.")
@javax.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    date = "2022-12-05T08:14:34.919Z[Etc/UTC]")
public class V1DownwardAPIProjection {
  public static final String SERIALIZED_NAME_ITEMS = "items";

  @SerializedName(SERIALIZED_NAME_ITEMS)
  private List<V1DownwardAPIVolumeFile> items = null;

  public V1DownwardAPIProjection items(List<V1DownwardAPIVolumeFile> items) {

    this.items = items;
    return this;
  }

  public V1DownwardAPIProjection addItemsItem(V1DownwardAPIVolumeFile itemsItem) {
    if (this.items == null) {
      this.items = new ArrayList<>();
    }
    this.items.add(itemsItem);
    return this;
  }

  /**
   * Items is a list of DownwardAPIVolume file
   *
   * @return items
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Items is a list of DownwardAPIVolume file")
  public List<V1DownwardAPIVolumeFile> getItems() {
    return items;
  }

  public void setItems(List<V1DownwardAPIVolumeFile> items) {
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
    V1DownwardAPIProjection v1DownwardAPIProjection = (V1DownwardAPIProjection) o;
    return Objects.equals(this.items, v1DownwardAPIProjection.items);
  }

  @Override
  public int hashCode() {
    return Objects.hash(items);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1DownwardAPIProjection {\n");
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
