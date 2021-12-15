/*
Copyright 2021 The Kubernetes Authors.
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

/** AllowedFlexVolume represents a single Flexvolume that is allowed to be used. */
@ApiModel(
    description = "AllowedFlexVolume represents a single Flexvolume that is allowed to be used.")
@javax.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    date = "2021-12-10T19:11:23.904Z[Etc/UTC]")
public class V1beta1AllowedFlexVolume {
  public static final String SERIALIZED_NAME_DRIVER = "driver";

  @SerializedName(SERIALIZED_NAME_DRIVER)
  private String driver;

  public V1beta1AllowedFlexVolume driver(String driver) {

    this.driver = driver;
    return this;
  }

  /**
   * driver is the name of the Flexvolume driver.
   *
   * @return driver
   */
  @ApiModelProperty(required = true, value = "driver is the name of the Flexvolume driver.")
  public String getDriver() {
    return driver;
  }

  public void setDriver(String driver) {
    this.driver = driver;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1beta1AllowedFlexVolume v1beta1AllowedFlexVolume = (V1beta1AllowedFlexVolume) o;
    return Objects.equals(this.driver, v1beta1AllowedFlexVolume.driver);
  }

  @Override
  public int hashCode() {
    return Objects.hash(driver);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1beta1AllowedFlexVolume {\n");
    sb.append("    driver: ").append(toIndentedString(driver)).append("\n");
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
