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

/** Adds and removes POSIX capabilities from running containers. */
@ApiModel(description = "Adds and removes POSIX capabilities from running containers.")
@javax.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    date = "2022-12-05T08:14:34.919Z[Etc/UTC]")
public class V1Capabilities {
  public static final String SERIALIZED_NAME_ADD = "add";

  @SerializedName(SERIALIZED_NAME_ADD)
  private List<String> add = null;

  public static final String SERIALIZED_NAME_DROP = "drop";

  @SerializedName(SERIALIZED_NAME_DROP)
  private List<String> drop = null;

  public V1Capabilities add(List<String> add) {

    this.add = add;
    return this;
  }

  public V1Capabilities addAddItem(String addItem) {
    if (this.add == null) {
      this.add = new ArrayList<>();
    }
    this.add.add(addItem);
    return this;
  }

  /**
   * Added capabilities
   *
   * @return add
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Added capabilities")
  public List<String> getAdd() {
    return add;
  }

  public void setAdd(List<String> add) {
    this.add = add;
  }

  public V1Capabilities drop(List<String> drop) {

    this.drop = drop;
    return this;
  }

  public V1Capabilities addDropItem(String dropItem) {
    if (this.drop == null) {
      this.drop = new ArrayList<>();
    }
    this.drop.add(dropItem);
    return this;
  }

  /**
   * Removed capabilities
   *
   * @return drop
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Removed capabilities")
  public List<String> getDrop() {
    return drop;
  }

  public void setDrop(List<String> drop) {
    this.drop = drop;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1Capabilities v1Capabilities = (V1Capabilities) o;
    return Objects.equals(this.add, v1Capabilities.add)
        && Objects.equals(this.drop, v1Capabilities.drop);
  }

  @Override
  public int hashCode() {
    return Objects.hash(add, drop);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1Capabilities {\n");
    sb.append("    add: ").append(toIndentedString(add)).append("\n");
    sb.append("    drop: ").append(toIndentedString(drop)).append("\n");
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
