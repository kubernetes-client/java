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

/** ServiceBackendPort is the service port being referenced. */
@ApiModel(description = "ServiceBackendPort is the service port being referenced.")
@javax.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    date = "2022-12-05T08:14:34.919Z[Etc/UTC]")
public class V1ServiceBackendPort {
  public static final String SERIALIZED_NAME_NAME = "name";

  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_NUMBER = "number";

  @SerializedName(SERIALIZED_NAME_NUMBER)
  private Integer number;

  public V1ServiceBackendPort name(String name) {

    this.name = name;
    return this;
  }

  /**
   * Name is the name of the port on the Service. This is a mutually exclusive setting with
   * \&quot;Number\&quot;.
   *
   * @return name
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "Name is the name of the port on the Service. This is a mutually exclusive setting with \"Number\".")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public V1ServiceBackendPort number(Integer number) {

    this.number = number;
    return this;
  }

  /**
   * Number is the numerical port number (e.g. 80) on the Service. This is a mutually exclusive
   * setting with \&quot;Name\&quot;.
   *
   * @return number
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "Number is the numerical port number (e.g. 80) on the Service. This is a mutually exclusive setting with \"Name\".")
  public Integer getNumber() {
    return number;
  }

  public void setNumber(Integer number) {
    this.number = number;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1ServiceBackendPort v1ServiceBackendPort = (V1ServiceBackendPort) o;
    return Objects.equals(this.name, v1ServiceBackendPort.name)
        && Objects.equals(this.number, v1ServiceBackendPort.number);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, number);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1ServiceBackendPort {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    number: ").append(toIndentedString(number)).append("\n");
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
