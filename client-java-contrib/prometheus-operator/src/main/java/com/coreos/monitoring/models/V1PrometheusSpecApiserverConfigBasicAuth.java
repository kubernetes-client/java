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
import java.util.Objects;

/** BasicAuth allow an endpoint to authenticate over basic authentication */
@ApiModel(description = "BasicAuth allow an endpoint to authenticate over basic authentication")
@javax.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    date = "2020-08-31T19:41:55.826Z[Etc/UTC]")
public class V1PrometheusSpecApiserverConfigBasicAuth {
  public static final String SERIALIZED_NAME_PASSWORD = "password";

  @SerializedName(SERIALIZED_NAME_PASSWORD)
  private V1ServiceMonitorSpecBasicAuthPassword password;

  public static final String SERIALIZED_NAME_USERNAME = "username";

  @SerializedName(SERIALIZED_NAME_USERNAME)
  private V1ServiceMonitorSpecBasicAuthUsername username;

  public V1PrometheusSpecApiserverConfigBasicAuth password(
      V1ServiceMonitorSpecBasicAuthPassword password) {

    this.password = password;
    return this;
  }

  /**
   * Get password
   *
   * @return password
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  public V1ServiceMonitorSpecBasicAuthPassword getPassword() {
    return password;
  }

  public void setPassword(V1ServiceMonitorSpecBasicAuthPassword password) {
    this.password = password;
  }

  public V1PrometheusSpecApiserverConfigBasicAuth username(
      V1ServiceMonitorSpecBasicAuthUsername username) {

    this.username = username;
    return this;
  }

  /**
   * Get username
   *
   * @return username
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  public V1ServiceMonitorSpecBasicAuthUsername getUsername() {
    return username;
  }

  public void setUsername(V1ServiceMonitorSpecBasicAuthUsername username) {
    this.username = username;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1PrometheusSpecApiserverConfigBasicAuth v1PrometheusSpecApiserverConfigBasicAuth =
        (V1PrometheusSpecApiserverConfigBasicAuth) o;
    return Objects.equals(this.password, v1PrometheusSpecApiserverConfigBasicAuth.password)
        && Objects.equals(this.username, v1PrometheusSpecApiserverConfigBasicAuth.username);
  }

  @Override
  public int hashCode() {
    return Objects.hash(password, username);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1PrometheusSpecApiserverConfigBasicAuth {\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    username: ").append(toIndentedString(username)).append("\n");
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
