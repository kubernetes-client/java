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

/** Projection that may be projected along with other supported volume types */
@ApiModel(description = "Projection that may be projected along with other supported volume types")
@javax.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    date = "2020-08-31T19:41:55.826Z[Etc/UTC]")
public class V1ThanosRulerSpecProjectedSources {
  public static final String SERIALIZED_NAME_CONFIG_MAP = "configMap";

  @SerializedName(SERIALIZED_NAME_CONFIG_MAP)
  private V1ThanosRulerSpecProjectedConfigMap configMap;

  public static final String SERIALIZED_NAME_DOWNWARD_A_P_I = "downwardAPI";

  @SerializedName(SERIALIZED_NAME_DOWNWARD_A_P_I)
  private V1ThanosRulerSpecProjectedDownwardAPI downwardAPI;

  public static final String SERIALIZED_NAME_SECRET = "secret";

  @SerializedName(SERIALIZED_NAME_SECRET)
  private V1ThanosRulerSpecProjectedSecret secret;

  public static final String SERIALIZED_NAME_SERVICE_ACCOUNT_TOKEN = "serviceAccountToken";

  @SerializedName(SERIALIZED_NAME_SERVICE_ACCOUNT_TOKEN)
  private V1ThanosRulerSpecProjectedServiceAccountToken serviceAccountToken;

  public V1ThanosRulerSpecProjectedSources configMap(
      V1ThanosRulerSpecProjectedConfigMap configMap) {

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
  public V1ThanosRulerSpecProjectedConfigMap getConfigMap() {
    return configMap;
  }

  public void setConfigMap(V1ThanosRulerSpecProjectedConfigMap configMap) {
    this.configMap = configMap;
  }

  public V1ThanosRulerSpecProjectedSources downwardAPI(
      V1ThanosRulerSpecProjectedDownwardAPI downwardAPI) {

    this.downwardAPI = downwardAPI;
    return this;
  }

  /**
   * Get downwardAPI
   *
   * @return downwardAPI
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  public V1ThanosRulerSpecProjectedDownwardAPI getDownwardAPI() {
    return downwardAPI;
  }

  public void setDownwardAPI(V1ThanosRulerSpecProjectedDownwardAPI downwardAPI) {
    this.downwardAPI = downwardAPI;
  }

  public V1ThanosRulerSpecProjectedSources secret(V1ThanosRulerSpecProjectedSecret secret) {

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
  public V1ThanosRulerSpecProjectedSecret getSecret() {
    return secret;
  }

  public void setSecret(V1ThanosRulerSpecProjectedSecret secret) {
    this.secret = secret;
  }

  public V1ThanosRulerSpecProjectedSources serviceAccountToken(
      V1ThanosRulerSpecProjectedServiceAccountToken serviceAccountToken) {

    this.serviceAccountToken = serviceAccountToken;
    return this;
  }

  /**
   * Get serviceAccountToken
   *
   * @return serviceAccountToken
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  public V1ThanosRulerSpecProjectedServiceAccountToken getServiceAccountToken() {
    return serviceAccountToken;
  }

  public void setServiceAccountToken(
      V1ThanosRulerSpecProjectedServiceAccountToken serviceAccountToken) {
    this.serviceAccountToken = serviceAccountToken;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1ThanosRulerSpecProjectedSources v1ThanosRulerSpecProjectedSources =
        (V1ThanosRulerSpecProjectedSources) o;
    return Objects.equals(this.configMap, v1ThanosRulerSpecProjectedSources.configMap)
        && Objects.equals(this.downwardAPI, v1ThanosRulerSpecProjectedSources.downwardAPI)
        && Objects.equals(this.secret, v1ThanosRulerSpecProjectedSources.secret)
        && Objects.equals(
            this.serviceAccountToken, v1ThanosRulerSpecProjectedSources.serviceAccountToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(configMap, downwardAPI, secret, serviceAccountToken);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1ThanosRulerSpecProjectedSources {\n");
    sb.append("    configMap: ").append(toIndentedString(configMap)).append("\n");
    sb.append("    downwardAPI: ").append(toIndentedString(downwardAPI)).append("\n");
    sb.append("    secret: ").append(toIndentedString(secret)).append("\n");
    sb.append("    serviceAccountToken: ")
        .append(toIndentedString(serviceAccountToken))
        .append("\n");
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
