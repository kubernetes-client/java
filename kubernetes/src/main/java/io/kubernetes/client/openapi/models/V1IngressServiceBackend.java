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

/** IngressServiceBackend references a Kubernetes Service as a Backend. */
@ApiModel(description = "IngressServiceBackend references a Kubernetes Service as a Backend.")
@javax.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    date = "2022-12-05T08:14:34.919Z[Etc/UTC]")
public class V1IngressServiceBackend {
  public static final String SERIALIZED_NAME_NAME = "name";

  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_PORT = "port";

  @SerializedName(SERIALIZED_NAME_PORT)
  private V1ServiceBackendPort port;

  public V1IngressServiceBackend name(String name) {

    this.name = name;
    return this;
  }

  /**
   * Name is the referenced service. The service must exist in the same namespace as the Ingress
   * object.
   *
   * @return name
   */
  @ApiModelProperty(
      required = true,
      value =
          "Name is the referenced service. The service must exist in the same namespace as the Ingress object.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public V1IngressServiceBackend port(V1ServiceBackendPort port) {

    this.port = port;
    return this;
  }

  /**
   * Get port
   *
   * @return port
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  public V1ServiceBackendPort getPort() {
    return port;
  }

  public void setPort(V1ServiceBackendPort port) {
    this.port = port;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1IngressServiceBackend v1IngressServiceBackend = (V1IngressServiceBackend) o;
    return Objects.equals(this.name, v1IngressServiceBackend.name)
        && Objects.equals(this.port, v1IngressServiceBackend.port);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, port);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1IngressServiceBackend {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    port: ").append(toIndentedString(port)).append("\n");
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
