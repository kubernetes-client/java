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
import io.kubernetes.client.custom.IntOrString;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/** HTTPGetAction describes an action based on HTTP Get requests. */
@ApiModel(description = "HTTPGetAction describes an action based on HTTP Get requests.")
@javax.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    date = "2022-12-05T08:14:34.919Z[Etc/UTC]")
public class V1HTTPGetAction {
  public static final String SERIALIZED_NAME_HOST = "host";

  @SerializedName(SERIALIZED_NAME_HOST)
  private String host;

  public static final String SERIALIZED_NAME_HTTP_HEADERS = "httpHeaders";

  @SerializedName(SERIALIZED_NAME_HTTP_HEADERS)
  private List<V1HTTPHeader> httpHeaders = null;

  public static final String SERIALIZED_NAME_PATH = "path";

  @SerializedName(SERIALIZED_NAME_PATH)
  private String path;

  public static final String SERIALIZED_NAME_PORT = "port";

  @SerializedName(SERIALIZED_NAME_PORT)
  private IntOrString port;

  public static final String SERIALIZED_NAME_SCHEME = "scheme";

  @SerializedName(SERIALIZED_NAME_SCHEME)
  private String scheme;

  public V1HTTPGetAction host(String host) {

    this.host = host;
    return this;
  }

  /**
   * Host name to connect to, defaults to the pod IP. You probably want to set \&quot;Host\&quot; in
   * httpHeaders instead.
   *
   * @return host
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "Host name to connect to, defaults to the pod IP. You probably want to set \"Host\" in httpHeaders instead.")
  public String getHost() {
    return host;
  }

  public void setHost(String host) {
    this.host = host;
  }

  public V1HTTPGetAction httpHeaders(List<V1HTTPHeader> httpHeaders) {

    this.httpHeaders = httpHeaders;
    return this;
  }

  public V1HTTPGetAction addHttpHeadersItem(V1HTTPHeader httpHeadersItem) {
    if (this.httpHeaders == null) {
      this.httpHeaders = new ArrayList<>();
    }
    this.httpHeaders.add(httpHeadersItem);
    return this;
  }

  /**
   * Custom headers to set in the request. HTTP allows repeated headers.
   *
   * @return httpHeaders
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Custom headers to set in the request. HTTP allows repeated headers.")
  public List<V1HTTPHeader> getHttpHeaders() {
    return httpHeaders;
  }

  public void setHttpHeaders(List<V1HTTPHeader> httpHeaders) {
    this.httpHeaders = httpHeaders;
  }

  public V1HTTPGetAction path(String path) {

    this.path = path;
    return this;
  }

  /**
   * Path to access on the HTTP server.
   *
   * @return path
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Path to access on the HTTP server.")
  public String getPath() {
    return path;
  }

  public void setPath(String path) {
    this.path = path;
  }

  public V1HTTPGetAction port(IntOrString port) {

    this.port = port;
    return this;
  }

  /**
   * IntOrString is a type that can hold an int32 or a string. When used in JSON or YAML marshalling
   * and unmarshalling, it produces or consumes the inner type. This allows you to have, for
   * example, a JSON field that can accept a name or number.
   *
   * @return port
   */
  @ApiModelProperty(
      required = true,
      value =
          "IntOrString is a type that can hold an int32 or a string.  When used in JSON or YAML marshalling and unmarshalling, it produces or consumes the inner type.  This allows you to have, for example, a JSON field that can accept a name or number.")
  public IntOrString getPort() {
    return port;
  }

  public void setPort(IntOrString port) {
    this.port = port;
  }

  public V1HTTPGetAction scheme(String scheme) {

    this.scheme = scheme;
    return this;
  }

  /**
   * Scheme to use for connecting to the host. Defaults to HTTP.
   *
   * @return scheme
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Scheme to use for connecting to the host. Defaults to HTTP.  ")
  public String getScheme() {
    return scheme;
  }

  public void setScheme(String scheme) {
    this.scheme = scheme;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1HTTPGetAction v1HTTPGetAction = (V1HTTPGetAction) o;
    return Objects.equals(this.host, v1HTTPGetAction.host)
        && Objects.equals(this.httpHeaders, v1HTTPGetAction.httpHeaders)
        && Objects.equals(this.path, v1HTTPGetAction.path)
        && Objects.equals(this.port, v1HTTPGetAction.port)
        && Objects.equals(this.scheme, v1HTTPGetAction.scheme);
  }

  @Override
  public int hashCode() {
    return Objects.hash(host, httpHeaders, path, port, scheme);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1HTTPGetAction {\n");
    sb.append("    host: ").append(toIndentedString(host)).append("\n");
    sb.append("    httpHeaders: ").append(toIndentedString(httpHeaders)).append("\n");
    sb.append("    path: ").append(toIndentedString(path)).append("\n");
    sb.append("    port: ").append(toIndentedString(port)).append("\n");
    sb.append("    scheme: ").append(toIndentedString(scheme)).append("\n");
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
