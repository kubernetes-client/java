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

/** HTTPGet specifies the http request to perform. */
@ApiModel(description = "HTTPGet specifies the http request to perform.")
@javax.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    date = "2020-08-31T19:41:55.826Z[Etc/UTC]")
public class V1ThanosRulerSpecLifecyclePostStartHttpGet {
  public static final String SERIALIZED_NAME_HOST = "host";

  @SerializedName(SERIALIZED_NAME_HOST)
  private String host;

  public static final String SERIALIZED_NAME_HTTP_HEADERS = "httpHeaders";

  @SerializedName(SERIALIZED_NAME_HTTP_HEADERS)
  private List<V1ThanosRulerSpecLifecyclePostStartHttpGetHttpHeaders> httpHeaders = null;

  public static final String SERIALIZED_NAME_PATH = "path";

  @SerializedName(SERIALIZED_NAME_PATH)
  private String path;

  public static final String SERIALIZED_NAME_PORT = "port";

  @SerializedName(SERIALIZED_NAME_PORT)
  private Object port;

  public static final String SERIALIZED_NAME_SCHEME = "scheme";

  @SerializedName(SERIALIZED_NAME_SCHEME)
  private String scheme;

  public V1ThanosRulerSpecLifecyclePostStartHttpGet host(String host) {

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

  public V1ThanosRulerSpecLifecyclePostStartHttpGet httpHeaders(
      List<V1ThanosRulerSpecLifecyclePostStartHttpGetHttpHeaders> httpHeaders) {

    this.httpHeaders = httpHeaders;
    return this;
  }

  public V1ThanosRulerSpecLifecyclePostStartHttpGet addHttpHeadersItem(
      V1ThanosRulerSpecLifecyclePostStartHttpGetHttpHeaders httpHeadersItem) {
    if (this.httpHeaders == null) {
      this.httpHeaders = new ArrayList<V1ThanosRulerSpecLifecyclePostStartHttpGetHttpHeaders>();
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
  public List<V1ThanosRulerSpecLifecyclePostStartHttpGetHttpHeaders> getHttpHeaders() {
    return httpHeaders;
  }

  public void setHttpHeaders(
      List<V1ThanosRulerSpecLifecyclePostStartHttpGetHttpHeaders> httpHeaders) {
    this.httpHeaders = httpHeaders;
  }

  public V1ThanosRulerSpecLifecyclePostStartHttpGet path(String path) {

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

  public V1ThanosRulerSpecLifecyclePostStartHttpGet port(Object port) {

    this.port = port;
    return this;
  }

  /**
   * Name or number of the port to access on the container. Number must be in the range 1 to 65535.
   * Name must be an IANA_SVC_NAME.
   *
   * @return port
   */
  @ApiModelProperty(
      required = true,
      value =
          "Name or number of the port to access on the container. Number must be in the range 1 to 65535. Name must be an IANA_SVC_NAME.")
  public Object getPort() {
    return port;
  }

  public void setPort(Object port) {
    this.port = port;
  }

  public V1ThanosRulerSpecLifecyclePostStartHttpGet scheme(String scheme) {

    this.scheme = scheme;
    return this;
  }

  /**
   * Scheme to use for connecting to the host. Defaults to HTTP.
   *
   * @return scheme
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Scheme to use for connecting to the host. Defaults to HTTP.")
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
    V1ThanosRulerSpecLifecyclePostStartHttpGet v1ThanosRulerSpecLifecyclePostStartHttpGet =
        (V1ThanosRulerSpecLifecyclePostStartHttpGet) o;
    return Objects.equals(this.host, v1ThanosRulerSpecLifecyclePostStartHttpGet.host)
        && Objects.equals(this.httpHeaders, v1ThanosRulerSpecLifecyclePostStartHttpGet.httpHeaders)
        && Objects.equals(this.path, v1ThanosRulerSpecLifecyclePostStartHttpGet.path)
        && Objects.equals(this.port, v1ThanosRulerSpecLifecyclePostStartHttpGet.port)
        && Objects.equals(this.scheme, v1ThanosRulerSpecLifecyclePostStartHttpGet.scheme);
  }

  @Override
  public int hashCode() {
    return Objects.hash(host, httpHeaders, path, port, scheme);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1ThanosRulerSpecLifecyclePostStartHttpGet {\n");
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
