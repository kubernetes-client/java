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

/**
 * GRPCServerTLSConfig configures the gRPC server from which Thanos Querier reads recorded rule
 * data. Note: Currently only the CAFile, CertFile, and KeyFile fields are supported. Maps to the
 * &#39;--grpc-server-tls-*&#39; CLI args.
 */
@ApiModel(
    description =
        "GRPCServerTLSConfig configures the gRPC server from which Thanos Querier reads recorded rule data. Note: Currently only the CAFile, CertFile, and KeyFile fields are supported. Maps to the '--grpc-server-tls-*' CLI args.")
@javax.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    date = "2020-08-31T19:41:55.826Z[Etc/UTC]")
public class V1ThanosRulerSpecGrpcServerTlsConfig {
  public static final String SERIALIZED_NAME_CA = "ca";

  @SerializedName(SERIALIZED_NAME_CA)
  private V1ServiceMonitorSpecTlsConfigCa ca;

  public static final String SERIALIZED_NAME_CA_FILE = "caFile";

  @SerializedName(SERIALIZED_NAME_CA_FILE)
  private String caFile;

  public static final String SERIALIZED_NAME_CERT = "cert";

  @SerializedName(SERIALIZED_NAME_CERT)
  private V1ServiceMonitorSpecTlsConfigCert cert;

  public static final String SERIALIZED_NAME_CERT_FILE = "certFile";

  @SerializedName(SERIALIZED_NAME_CERT_FILE)
  private String certFile;

  public static final String SERIALIZED_NAME_INSECURE_SKIP_VERIFY = "insecureSkipVerify";

  @SerializedName(SERIALIZED_NAME_INSECURE_SKIP_VERIFY)
  private Boolean insecureSkipVerify;

  public static final String SERIALIZED_NAME_KEY_FILE = "keyFile";

  @SerializedName(SERIALIZED_NAME_KEY_FILE)
  private String keyFile;

  public static final String SERIALIZED_NAME_KEY_SECRET = "keySecret";

  @SerializedName(SERIALIZED_NAME_KEY_SECRET)
  private V1ServiceMonitorSpecTlsConfigKeySecret keySecret;

  public static final String SERIALIZED_NAME_SERVER_NAME = "serverName";

  @SerializedName(SERIALIZED_NAME_SERVER_NAME)
  private String serverName;

  public V1ThanosRulerSpecGrpcServerTlsConfig ca(V1ServiceMonitorSpecTlsConfigCa ca) {

    this.ca = ca;
    return this;
  }

  /**
   * Get ca
   *
   * @return ca
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  public V1ServiceMonitorSpecTlsConfigCa getCa() {
    return ca;
  }

  public void setCa(V1ServiceMonitorSpecTlsConfigCa ca) {
    this.ca = ca;
  }

  public V1ThanosRulerSpecGrpcServerTlsConfig caFile(String caFile) {

    this.caFile = caFile;
    return this;
  }

  /**
   * Path to the CA cert in the Prometheus container to use for the targets.
   *
   * @return caFile
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value = "Path to the CA cert in the Prometheus container to use for the targets.")
  public String getCaFile() {
    return caFile;
  }

  public void setCaFile(String caFile) {
    this.caFile = caFile;
  }

  public V1ThanosRulerSpecGrpcServerTlsConfig cert(V1ServiceMonitorSpecTlsConfigCert cert) {

    this.cert = cert;
    return this;
  }

  /**
   * Get cert
   *
   * @return cert
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  public V1ServiceMonitorSpecTlsConfigCert getCert() {
    return cert;
  }

  public void setCert(V1ServiceMonitorSpecTlsConfigCert cert) {
    this.cert = cert;
  }

  public V1ThanosRulerSpecGrpcServerTlsConfig certFile(String certFile) {

    this.certFile = certFile;
    return this;
  }

  /**
   * Path to the client cert file in the Prometheus container for the targets.
   *
   * @return certFile
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value = "Path to the client cert file in the Prometheus container for the targets.")
  public String getCertFile() {
    return certFile;
  }

  public void setCertFile(String certFile) {
    this.certFile = certFile;
  }

  public V1ThanosRulerSpecGrpcServerTlsConfig insecureSkipVerify(Boolean insecureSkipVerify) {

    this.insecureSkipVerify = insecureSkipVerify;
    return this;
  }

  /**
   * Disable target certificate validation.
   *
   * @return insecureSkipVerify
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Disable target certificate validation.")
  public Boolean getInsecureSkipVerify() {
    return insecureSkipVerify;
  }

  public void setInsecureSkipVerify(Boolean insecureSkipVerify) {
    this.insecureSkipVerify = insecureSkipVerify;
  }

  public V1ThanosRulerSpecGrpcServerTlsConfig keyFile(String keyFile) {

    this.keyFile = keyFile;
    return this;
  }

  /**
   * Path to the client key file in the Prometheus container for the targets.
   *
   * @return keyFile
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value = "Path to the client key file in the Prometheus container for the targets.")
  public String getKeyFile() {
    return keyFile;
  }

  public void setKeyFile(String keyFile) {
    this.keyFile = keyFile;
  }

  public V1ThanosRulerSpecGrpcServerTlsConfig keySecret(
      V1ServiceMonitorSpecTlsConfigKeySecret keySecret) {

    this.keySecret = keySecret;
    return this;
  }

  /**
   * Get keySecret
   *
   * @return keySecret
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  public V1ServiceMonitorSpecTlsConfigKeySecret getKeySecret() {
    return keySecret;
  }

  public void setKeySecret(V1ServiceMonitorSpecTlsConfigKeySecret keySecret) {
    this.keySecret = keySecret;
  }

  public V1ThanosRulerSpecGrpcServerTlsConfig serverName(String serverName) {

    this.serverName = serverName;
    return this;
  }

  /**
   * Used to verify the hostname for the targets.
   *
   * @return serverName
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Used to verify the hostname for the targets.")
  public String getServerName() {
    return serverName;
  }

  public void setServerName(String serverName) {
    this.serverName = serverName;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1ThanosRulerSpecGrpcServerTlsConfig v1ThanosRulerSpecGrpcServerTlsConfig =
        (V1ThanosRulerSpecGrpcServerTlsConfig) o;
    return Objects.equals(this.ca, v1ThanosRulerSpecGrpcServerTlsConfig.ca)
        && Objects.equals(this.caFile, v1ThanosRulerSpecGrpcServerTlsConfig.caFile)
        && Objects.equals(this.cert, v1ThanosRulerSpecGrpcServerTlsConfig.cert)
        && Objects.equals(this.certFile, v1ThanosRulerSpecGrpcServerTlsConfig.certFile)
        && Objects.equals(
            this.insecureSkipVerify, v1ThanosRulerSpecGrpcServerTlsConfig.insecureSkipVerify)
        && Objects.equals(this.keyFile, v1ThanosRulerSpecGrpcServerTlsConfig.keyFile)
        && Objects.equals(this.keySecret, v1ThanosRulerSpecGrpcServerTlsConfig.keySecret)
        && Objects.equals(this.serverName, v1ThanosRulerSpecGrpcServerTlsConfig.serverName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        ca, caFile, cert, certFile, insecureSkipVerify, keyFile, keySecret, serverName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1ThanosRulerSpecGrpcServerTlsConfig {\n");
    sb.append("    ca: ").append(toIndentedString(ca)).append("\n");
    sb.append("    caFile: ").append(toIndentedString(caFile)).append("\n");
    sb.append("    cert: ").append(toIndentedString(cert)).append("\n");
    sb.append("    certFile: ").append(toIndentedString(certFile)).append("\n");
    sb.append("    insecureSkipVerify: ").append(toIndentedString(insecureSkipVerify)).append("\n");
    sb.append("    keyFile: ").append(toIndentedString(keyFile)).append("\n");
    sb.append("    keySecret: ").append(toIndentedString(keySecret)).append("\n");
    sb.append("    serverName: ").append(toIndentedString(serverName)).append("\n");
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
