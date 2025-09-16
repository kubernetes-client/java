/*
Copyright 2025 The Kubernetes Authors.
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

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.kubernetes.client.openapi.models.V1ClusterTrustBundleProjection;
import io.kubernetes.client.openapi.models.V1ConfigMapProjection;
import io.kubernetes.client.openapi.models.V1DownwardAPIProjection;
import io.kubernetes.client.openapi.models.V1PodCertificateProjection;
import io.kubernetes.client.openapi.models.V1SecretProjection;
import io.kubernetes.client.openapi.models.V1ServiceAccountTokenProjection;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Projection that may be projected along with other supported volume types. Exactly one of these fields must be set.
 */
@ApiModel(description = "Projection that may be projected along with other supported volume types. Exactly one of these fields must be set.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-09-12T23:11:52.603861Z[Etc/UTC]")
public class V1VolumeProjection {
  public static final String SERIALIZED_NAME_CLUSTER_TRUST_BUNDLE = "clusterTrustBundle";
  @SerializedName(SERIALIZED_NAME_CLUSTER_TRUST_BUNDLE)
  private V1ClusterTrustBundleProjection clusterTrustBundle;

  public static final String SERIALIZED_NAME_CONFIG_MAP = "configMap";
  @SerializedName(SERIALIZED_NAME_CONFIG_MAP)
  private V1ConfigMapProjection configMap;

  public static final String SERIALIZED_NAME_DOWNWARD_A_P_I = "downwardAPI";
  @SerializedName(SERIALIZED_NAME_DOWNWARD_A_P_I)
  private V1DownwardAPIProjection downwardAPI;

  public static final String SERIALIZED_NAME_POD_CERTIFICATE = "podCertificate";
  @SerializedName(SERIALIZED_NAME_POD_CERTIFICATE)
  private V1PodCertificateProjection podCertificate;

  public static final String SERIALIZED_NAME_SECRET = "secret";
  @SerializedName(SERIALIZED_NAME_SECRET)
  private V1SecretProjection secret;

  public static final String SERIALIZED_NAME_SERVICE_ACCOUNT_TOKEN = "serviceAccountToken";
  @SerializedName(SERIALIZED_NAME_SERVICE_ACCOUNT_TOKEN)
  private V1ServiceAccountTokenProjection serviceAccountToken;


  public V1VolumeProjection clusterTrustBundle(V1ClusterTrustBundleProjection clusterTrustBundle) {

    this.clusterTrustBundle = clusterTrustBundle;
    return this;
  }

   /**
   * Get clusterTrustBundle
   * @return clusterTrustBundle
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public V1ClusterTrustBundleProjection getClusterTrustBundle() {
    return clusterTrustBundle;
  }


  public void setClusterTrustBundle(V1ClusterTrustBundleProjection clusterTrustBundle) {
    this.clusterTrustBundle = clusterTrustBundle;
  }


  public V1VolumeProjection configMap(V1ConfigMapProjection configMap) {

    this.configMap = configMap;
    return this;
  }

   /**
   * Get configMap
   * @return configMap
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public V1ConfigMapProjection getConfigMap() {
    return configMap;
  }


  public void setConfigMap(V1ConfigMapProjection configMap) {
    this.configMap = configMap;
  }


  public V1VolumeProjection downwardAPI(V1DownwardAPIProjection downwardAPI) {

    this.downwardAPI = downwardAPI;
    return this;
  }

   /**
   * Get downwardAPI
   * @return downwardAPI
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public V1DownwardAPIProjection getDownwardAPI() {
    return downwardAPI;
  }


  public void setDownwardAPI(V1DownwardAPIProjection downwardAPI) {
    this.downwardAPI = downwardAPI;
  }


  public V1VolumeProjection podCertificate(V1PodCertificateProjection podCertificate) {

    this.podCertificate = podCertificate;
    return this;
  }

   /**
   * Get podCertificate
   * @return podCertificate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public V1PodCertificateProjection getPodCertificate() {
    return podCertificate;
  }


  public void setPodCertificate(V1PodCertificateProjection podCertificate) {
    this.podCertificate = podCertificate;
  }


  public V1VolumeProjection secret(V1SecretProjection secret) {

    this.secret = secret;
    return this;
  }

   /**
   * Get secret
   * @return secret
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public V1SecretProjection getSecret() {
    return secret;
  }


  public void setSecret(V1SecretProjection secret) {
    this.secret = secret;
  }


  public V1VolumeProjection serviceAccountToken(V1ServiceAccountTokenProjection serviceAccountToken) {

    this.serviceAccountToken = serviceAccountToken;
    return this;
  }

   /**
   * Get serviceAccountToken
   * @return serviceAccountToken
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public V1ServiceAccountTokenProjection getServiceAccountToken() {
    return serviceAccountToken;
  }


  public void setServiceAccountToken(V1ServiceAccountTokenProjection serviceAccountToken) {
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
    V1VolumeProjection v1VolumeProjection = (V1VolumeProjection) o;
    return Objects.equals(this.clusterTrustBundle, v1VolumeProjection.clusterTrustBundle) &&
        Objects.equals(this.configMap, v1VolumeProjection.configMap) &&
        Objects.equals(this.downwardAPI, v1VolumeProjection.downwardAPI) &&
        Objects.equals(this.podCertificate, v1VolumeProjection.podCertificate) &&
        Objects.equals(this.secret, v1VolumeProjection.secret) &&
        Objects.equals(this.serviceAccountToken, v1VolumeProjection.serviceAccountToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(clusterTrustBundle, configMap, downwardAPI, podCertificate, secret, serviceAccountToken);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1VolumeProjection {\n");
    sb.append("    clusterTrustBundle: ").append(toIndentedString(clusterTrustBundle)).append("\n");
    sb.append("    configMap: ").append(toIndentedString(configMap)).append("\n");
    sb.append("    downwardAPI: ").append(toIndentedString(downwardAPI)).append("\n");
    sb.append("    podCertificate: ").append(toIndentedString(podCertificate)).append("\n");
    sb.append("    secret: ").append(toIndentedString(secret)).append("\n");
    sb.append("    serviceAccountToken: ").append(toIndentedString(serviceAccountToken)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}
