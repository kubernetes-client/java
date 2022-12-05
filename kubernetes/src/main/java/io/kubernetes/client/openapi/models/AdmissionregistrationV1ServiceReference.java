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

/** ServiceReference holds a reference to Service.legacy.k8s.io */
@ApiModel(description = "ServiceReference holds a reference to Service.legacy.k8s.io")
@javax.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    date = "2022-12-05T08:14:34.919Z[Etc/UTC]")
public class AdmissionregistrationV1ServiceReference {
  public static final String SERIALIZED_NAME_NAME = "name";

  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_NAMESPACE = "namespace";

  @SerializedName(SERIALIZED_NAME_NAMESPACE)
  private String namespace;

  public static final String SERIALIZED_NAME_PATH = "path";

  @SerializedName(SERIALIZED_NAME_PATH)
  private String path;

  public static final String SERIALIZED_NAME_PORT = "port";

  @SerializedName(SERIALIZED_NAME_PORT)
  private Integer port;

  public AdmissionregistrationV1ServiceReference name(String name) {

    this.name = name;
    return this;
  }

  /**
   * &#x60;name&#x60; is the name of the service. Required
   *
   * @return name
   */
  @ApiModelProperty(required = true, value = "`name` is the name of the service. Required")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public AdmissionregistrationV1ServiceReference namespace(String namespace) {

    this.namespace = namespace;
    return this;
  }

  /**
   * &#x60;namespace&#x60; is the namespace of the service. Required
   *
   * @return namespace
   */
  @ApiModelProperty(
      required = true,
      value = "`namespace` is the namespace of the service. Required")
  public String getNamespace() {
    return namespace;
  }

  public void setNamespace(String namespace) {
    this.namespace = namespace;
  }

  public AdmissionregistrationV1ServiceReference path(String path) {

    this.path = path;
    return this;
  }

  /**
   * &#x60;path&#x60; is an optional URL path which will be sent in any request to this service.
   *
   * @return path
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value = "`path` is an optional URL path which will be sent in any request to this service.")
  public String getPath() {
    return path;
  }

  public void setPath(String path) {
    this.path = path;
  }

  public AdmissionregistrationV1ServiceReference port(Integer port) {

    this.port = port;
    return this;
  }

  /**
   * If specified, the port on the service that hosting webhook. Default to 443 for backward
   * compatibility. &#x60;port&#x60; should be a valid port number (1-65535, inclusive).
   *
   * @return port
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "If specified, the port on the service that hosting webhook. Default to 443 for backward compatibility. `port` should be a valid port number (1-65535, inclusive).")
  public Integer getPort() {
    return port;
  }

  public void setPort(Integer port) {
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
    AdmissionregistrationV1ServiceReference admissionregistrationV1ServiceReference =
        (AdmissionregistrationV1ServiceReference) o;
    return Objects.equals(this.name, admissionregistrationV1ServiceReference.name)
        && Objects.equals(this.namespace, admissionregistrationV1ServiceReference.namespace)
        && Objects.equals(this.path, admissionregistrationV1ServiceReference.path)
        && Objects.equals(this.port, admissionregistrationV1ServiceReference.port);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, namespace, path, port);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdmissionregistrationV1ServiceReference {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    namespace: ").append(toIndentedString(namespace)).append("\n");
    sb.append("    path: ").append(toIndentedString(path)).append("\n");
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
