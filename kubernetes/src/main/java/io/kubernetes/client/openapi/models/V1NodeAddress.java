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

/** NodeAddress contains information for the node&#39;s address. */
@ApiModel(description = "NodeAddress contains information for the node's address.")
@javax.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    date = "2022-12-05T08:14:34.919Z[Etc/UTC]")
public class V1NodeAddress {
  public static final String SERIALIZED_NAME_ADDRESS = "address";

  @SerializedName(SERIALIZED_NAME_ADDRESS)
  private String address;

  public static final String SERIALIZED_NAME_TYPE = "type";

  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;

  public V1NodeAddress address(String address) {

    this.address = address;
    return this;
  }

  /**
   * The node address.
   *
   * @return address
   */
  @ApiModelProperty(required = true, value = "The node address.")
  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public V1NodeAddress type(String type) {

    this.type = type;
    return this;
  }

  /**
   * Node address type, one of Hostname, ExternalIP or InternalIP.
   *
   * @return type
   */
  @ApiModelProperty(
      required = true,
      value = "Node address type, one of Hostname, ExternalIP or InternalIP.")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1NodeAddress v1NodeAddress = (V1NodeAddress) o;
    return Objects.equals(this.address, v1NodeAddress.address)
        && Objects.equals(this.type, v1NodeAddress.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(address, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1NodeAddress {\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
