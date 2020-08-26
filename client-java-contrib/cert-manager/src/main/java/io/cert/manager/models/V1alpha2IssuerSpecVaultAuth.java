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
import java.util.Objects;

/** Auth configures how cert-manager authenticates with the Vault server. */
@ApiModel(description = "Auth configures how cert-manager authenticates with the Vault server.")
@javax.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    date = "2020-08-18T19:55:23.947Z[Etc/UTC]")
public class V1alpha2IssuerSpecVaultAuth {
  public static final String SERIALIZED_NAME_APP_ROLE = "appRole";

  @SerializedName(SERIALIZED_NAME_APP_ROLE)
  private V1alpha2IssuerSpecVaultAuthAppRole appRole;

  public static final String SERIALIZED_NAME_KUBERNETES = "kubernetes";

  @SerializedName(SERIALIZED_NAME_KUBERNETES)
  private V1alpha2IssuerSpecVaultAuthKubernetes kubernetes;

  public static final String SERIALIZED_NAME_TOKEN_SECRET_REF = "tokenSecretRef";

  @SerializedName(SERIALIZED_NAME_TOKEN_SECRET_REF)
  private V1alpha2IssuerSpecVaultAuthTokenSecretRef tokenSecretRef;

  public V1alpha2IssuerSpecVaultAuth appRole(V1alpha2IssuerSpecVaultAuthAppRole appRole) {

    this.appRole = appRole;
    return this;
  }

  /**
   * Get appRole
   *
   * @return appRole
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  public V1alpha2IssuerSpecVaultAuthAppRole getAppRole() {
    return appRole;
  }

  public void setAppRole(V1alpha2IssuerSpecVaultAuthAppRole appRole) {
    this.appRole = appRole;
  }

  public V1alpha2IssuerSpecVaultAuth kubernetes(V1alpha2IssuerSpecVaultAuthKubernetes kubernetes) {

    this.kubernetes = kubernetes;
    return this;
  }

  /**
   * Get kubernetes
   *
   * @return kubernetes
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  public V1alpha2IssuerSpecVaultAuthKubernetes getKubernetes() {
    return kubernetes;
  }

  public void setKubernetes(V1alpha2IssuerSpecVaultAuthKubernetes kubernetes) {
    this.kubernetes = kubernetes;
  }

  public V1alpha2IssuerSpecVaultAuth tokenSecretRef(
      V1alpha2IssuerSpecVaultAuthTokenSecretRef tokenSecretRef) {

    this.tokenSecretRef = tokenSecretRef;
    return this;
  }

  /**
   * Get tokenSecretRef
   *
   * @return tokenSecretRef
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  public V1alpha2IssuerSpecVaultAuthTokenSecretRef getTokenSecretRef() {
    return tokenSecretRef;
  }

  public void setTokenSecretRef(V1alpha2IssuerSpecVaultAuthTokenSecretRef tokenSecretRef) {
    this.tokenSecretRef = tokenSecretRef;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1alpha2IssuerSpecVaultAuth v1alpha2IssuerSpecVaultAuth = (V1alpha2IssuerSpecVaultAuth) o;
    return Objects.equals(this.appRole, v1alpha2IssuerSpecVaultAuth.appRole)
        && Objects.equals(this.kubernetes, v1alpha2IssuerSpecVaultAuth.kubernetes)
        && Objects.equals(this.tokenSecretRef, v1alpha2IssuerSpecVaultAuth.tokenSecretRef);
  }

  @Override
  public int hashCode() {
    return Objects.hash(appRole, kubernetes, tokenSecretRef);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1alpha2IssuerSpecVaultAuth {\n");
    sb.append("    appRole: ").append(toIndentedString(appRole)).append("\n");
    sb.append("    kubernetes: ").append(toIndentedString(kubernetes)).append("\n");
    sb.append("    tokenSecretRef: ").append(toIndentedString(tokenSecretRef)).append("\n");
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
