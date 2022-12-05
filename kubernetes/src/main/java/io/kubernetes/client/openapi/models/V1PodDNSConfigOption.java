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
import java.util.Objects;

/** PodDNSConfigOption defines DNS resolver options of a pod. */
@ApiModel(description = "PodDNSConfigOption defines DNS resolver options of a pod.")
@javax.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    date = "2022-12-05T08:14:34.919Z[Etc/UTC]")
public class V1PodDNSConfigOption {
  public static final String SERIALIZED_NAME_NAME = "name";

  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_VALUE = "value";

  @SerializedName(SERIALIZED_NAME_VALUE)
  private String value;

  public V1PodDNSConfigOption name(String name) {

    this.name = name;
    return this;
  }

  /**
   * Required.
   *
   * @return name
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Required.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public V1PodDNSConfigOption value(String value) {

    this.value = value;
    return this;
  }

  /**
   * Get value
   *
   * @return value
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1PodDNSConfigOption v1PodDNSConfigOption = (V1PodDNSConfigOption) o;
    return Objects.equals(this.name, v1PodDNSConfigOption.name)
        && Objects.equals(this.value, v1PodDNSConfigOption.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, value);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1PodDNSConfigOption {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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
