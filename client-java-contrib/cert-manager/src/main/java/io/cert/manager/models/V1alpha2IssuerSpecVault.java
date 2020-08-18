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
package io.cert.manager.models;

import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Arrays;
import java.util.Objects;

/** Vault configures this issuer to sign certificates using a HashiCorp Vault PKI backend. */
@ApiModel(
    description =
        "Vault configures this issuer to sign certificates using a HashiCorp Vault PKI backend.")
@javax.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    date = "2020-08-18T19:55:23.947Z[Etc/UTC]")
public class V1alpha2IssuerSpecVault {
  public static final String SERIALIZED_NAME_AUTH = "auth";

  @SerializedName(SERIALIZED_NAME_AUTH)
  private V1alpha2IssuerSpecVaultAuth auth;

  public static final String SERIALIZED_NAME_CA_BUNDLE = "caBundle";

  @SerializedName(SERIALIZED_NAME_CA_BUNDLE)
  private byte[] caBundle;

  public static final String SERIALIZED_NAME_PATH = "path";

  @SerializedName(SERIALIZED_NAME_PATH)
  private String path;

  public static final String SERIALIZED_NAME_SERVER = "server";

  @SerializedName(SERIALIZED_NAME_SERVER)
  private String server;

  public V1alpha2IssuerSpecVault auth(V1alpha2IssuerSpecVaultAuth auth) {

    this.auth = auth;
    return this;
  }

  /**
   * Get auth
   *
   * @return auth
   */
  @ApiModelProperty(required = true, value = "")
  public V1alpha2IssuerSpecVaultAuth getAuth() {
    return auth;
  }

  public void setAuth(V1alpha2IssuerSpecVaultAuth auth) {
    this.auth = auth;
  }

  public V1alpha2IssuerSpecVault caBundle(byte[] caBundle) {

    this.caBundle = caBundle;
    return this;
  }

  /**
   * PEM encoded CA bundle used to validate Vault server certificate. Only used if the Server URL is
   * using HTTPS protocol. This parameter is ignored for plain HTTP protocol connection. If not set
   * the system root certificates are used to validate the TLS connection.
   *
   * @return caBundle
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "PEM encoded CA bundle used to validate Vault server certificate. Only used if the Server URL is using HTTPS protocol. This parameter is ignored for plain HTTP protocol connection. If not set the system root certificates are used to validate the TLS connection.")
  public byte[] getCaBundle() {
    return caBundle;
  }

  public void setCaBundle(byte[] caBundle) {
    this.caBundle = caBundle;
  }

  public V1alpha2IssuerSpecVault path(String path) {

    this.path = path;
    return this;
  }

  /**
   * Path is the mount path of the Vault PKI backend&#39;s &#x60;sign&#x60; endpoint, e.g:
   * \&quot;my_pki_mount/sign/my-role-name\&quot;.
   *
   * @return path
   */
  @ApiModelProperty(
      required = true,
      value =
          "Path is the mount path of the Vault PKI backend's `sign` endpoint, e.g: \"my_pki_mount/sign/my-role-name\".")
  public String getPath() {
    return path;
  }

  public void setPath(String path) {
    this.path = path;
  }

  public V1alpha2IssuerSpecVault server(String server) {

    this.server = server;
    return this;
  }

  /**
   * Server is the connection address for the Vault server, e.g:
   * \&quot;https://vault.example.com:8200\&quot;.
   *
   * @return server
   */
  @ApiModelProperty(
      required = true,
      value =
          "Server is the connection address for the Vault server, e.g: \"https://vault.example.com:8200\".")
  public String getServer() {
    return server;
  }

  public void setServer(String server) {
    this.server = server;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1alpha2IssuerSpecVault v1alpha2IssuerSpecVault = (V1alpha2IssuerSpecVault) o;
    return Objects.equals(this.auth, v1alpha2IssuerSpecVault.auth)
        && Arrays.equals(this.caBundle, v1alpha2IssuerSpecVault.caBundle)
        && Objects.equals(this.path, v1alpha2IssuerSpecVault.path)
        && Objects.equals(this.server, v1alpha2IssuerSpecVault.server);
  }

  @Override
  public int hashCode() {
    return Objects.hash(auth, Arrays.hashCode(caBundle), path, server);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1alpha2IssuerSpecVault {\n");
    sb.append("    auth: ").append(toIndentedString(auth)).append("\n");
    sb.append("    caBundle: ").append(toIndentedString(caBundle)).append("\n");
    sb.append("    path: ").append(toIndentedString(path)).append("\n");
    sb.append("    server: ").append(toIndentedString(server)).append("\n");
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
