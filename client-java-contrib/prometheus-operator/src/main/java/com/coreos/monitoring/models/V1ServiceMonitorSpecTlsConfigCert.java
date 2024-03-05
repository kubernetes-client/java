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

/** Struct containing the client cert file for the targets. */
@ApiModel(description = "Struct containing the client cert file for the targets.")
@javax.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    date = "2020-08-31T19:41:55.826Z[Etc/UTC]")
public class V1ServiceMonitorSpecTlsConfigCert {
  public static final String SERIALIZED_NAME_CONFIG_MAP = "configMap";

  @SerializedName(SERIALIZED_NAME_CONFIG_MAP)
  private V1ServiceMonitorSpecTlsConfigCaConfigMap configMap;

  public static final String SERIALIZED_NAME_SECRET = "secret";

  @SerializedName(SERIALIZED_NAME_SECRET)
  private V1ServiceMonitorSpecTlsConfigCaSecret secret;

  public V1ServiceMonitorSpecTlsConfigCert configMap(
      V1ServiceMonitorSpecTlsConfigCaConfigMap configMap) {

    this.configMap = configMap;
    return this;
  }

  /**
   * Get configMap
   *
   * @return configMap
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  public V1ServiceMonitorSpecTlsConfigCaConfigMap getConfigMap() {
    return configMap;
  }

  public void setConfigMap(V1ServiceMonitorSpecTlsConfigCaConfigMap configMap) {
    this.configMap = configMap;
  }

  public V1ServiceMonitorSpecTlsConfigCert secret(V1ServiceMonitorSpecTlsConfigCaSecret secret) {

    this.secret = secret;
    return this;
  }

  /**
   * Get secret
   *
   * @return secret
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  public V1ServiceMonitorSpecTlsConfigCaSecret getSecret() {
    return secret;
  }

  public void setSecret(V1ServiceMonitorSpecTlsConfigCaSecret secret) {
    this.secret = secret;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1ServiceMonitorSpecTlsConfigCert v1ServiceMonitorSpecTlsConfigCert =
        (V1ServiceMonitorSpecTlsConfigCert) o;
    return Objects.equals(this.configMap, v1ServiceMonitorSpecTlsConfigCert.configMap)
        && Objects.equals(this.secret, v1ServiceMonitorSpecTlsConfigCert.secret);
  }

  @Override
  public int hashCode() {
    return Objects.hash(configMap, secret);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1ServiceMonitorSpecTlsConfigCert {\n");
    sb.append("    configMap: ").append(toIndentedString(configMap)).append("\n");
    sb.append("    secret: ").append(toIndentedString(secret)).append("\n");
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
