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

/**
 * The capabilities to add/drop when running containers. Defaults to the default set of capabilities
 * granted by the container runtime.
 */
@ApiModel(
    description =
        "The capabilities to add/drop when running containers. Defaults to the default set of capabilities granted by the container runtime.")
@javax.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    date = "2020-08-31T19:41:55.826Z[Etc/UTC]")
public class V1ThanosRulerSpecSecurityContextCapabilities {
  public static final String SERIALIZED_NAME_ADD = "add";

  @SerializedName(SERIALIZED_NAME_ADD)
  private List<String> add = null;

  public static final String SERIALIZED_NAME_DROP = "drop";

  @SerializedName(SERIALIZED_NAME_DROP)
  private List<String> drop = null;

  public V1ThanosRulerSpecSecurityContextCapabilities add(List<String> add) {

    this.add = add;
    return this;
  }

  public V1ThanosRulerSpecSecurityContextCapabilities addAddItem(String addItem) {
    if (this.add == null) {
      this.add = new ArrayList<String>();
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

  public V1ThanosRulerSpecSecurityContextCapabilities drop(List<String> drop) {

    this.drop = drop;
    return this;
  }

  public V1ThanosRulerSpecSecurityContextCapabilities addDropItem(String dropItem) {
    if (this.drop == null) {
      this.drop = new ArrayList<String>();
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
    V1ThanosRulerSpecSecurityContextCapabilities v1ThanosRulerSpecSecurityContextCapabilities =
        (V1ThanosRulerSpecSecurityContextCapabilities) o;
    return Objects.equals(this.add, v1ThanosRulerSpecSecurityContextCapabilities.add)
        && Objects.equals(this.drop, v1ThanosRulerSpecSecurityContextCapabilities.drop);
  }

  @Override
  public int hashCode() {
    return Objects.hash(add, drop);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1ThanosRulerSpecSecurityContextCapabilities {\n");
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
