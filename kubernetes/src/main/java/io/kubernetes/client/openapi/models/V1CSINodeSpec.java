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

/** CSINodeSpec holds information about the specification of all CSI drivers installed on a node */
@ApiModel(
    description =
        "CSINodeSpec holds information about the specification of all CSI drivers installed on a node")
@javax.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    date = "2022-12-05T08:14:34.919Z[Etc/UTC]")
public class V1CSINodeSpec {
  public static final String SERIALIZED_NAME_DRIVERS = "drivers";

  @SerializedName(SERIALIZED_NAME_DRIVERS)
  private List<V1CSINodeDriver> drivers = new ArrayList<>();

  public V1CSINodeSpec drivers(List<V1CSINodeDriver> drivers) {

    this.drivers = drivers;
    return this;
  }

  public V1CSINodeSpec addDriversItem(V1CSINodeDriver driversItem) {
    this.drivers.add(driversItem);
    return this;
  }

  /**
   * drivers is a list of information of all CSI Drivers existing on a node. If all drivers in the
   * list are uninstalled, this can become empty.
   *
   * @return drivers
   */
  @ApiModelProperty(
      required = true,
      value =
          "drivers is a list of information of all CSI Drivers existing on a node. If all drivers in the list are uninstalled, this can become empty.")
  public List<V1CSINodeDriver> getDrivers() {
    return drivers;
  }

  public void setDrivers(List<V1CSINodeDriver> drivers) {
    this.drivers = drivers;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1CSINodeSpec v1CSINodeSpec = (V1CSINodeSpec) o;
    return Objects.equals(this.drivers, v1CSINodeSpec.drivers);
  }

  @Override
  public int hashCode() {
    return Objects.hash(drivers);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1CSINodeSpec {\n");
    sb.append("    drivers: ").append(toIndentedString(drivers)).append("\n");
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
