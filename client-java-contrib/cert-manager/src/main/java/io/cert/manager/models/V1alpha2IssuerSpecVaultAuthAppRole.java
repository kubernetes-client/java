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

/**
 * AppRole authenticates with Vault using the App Role auth mechanism, with the role and secret
 * stored in a Kubernetes Secret resource.
 */
@ApiModel(
    description =
        "AppRole authenticates with Vault using the App Role auth mechanism, with the role and secret stored in a Kubernetes Secret resource.")
@javax.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    date = "2020-08-18T19:55:23.947Z[Etc/UTC]")
public class V1alpha2IssuerSpecVaultAuthAppRole {
  public static final String SERIALIZED_NAME_PATH = "path";

  @SerializedName(SERIALIZED_NAME_PATH)
  private String path;

  public static final String SERIALIZED_NAME_ROLE_ID = "roleId";

  @SerializedName(SERIALIZED_NAME_ROLE_ID)
  private String roleId;

  public static final String SERIALIZED_NAME_SECRET_REF = "secretRef";

  @SerializedName(SERIALIZED_NAME_SECRET_REF)
  private V1alpha2IssuerSpecVaultAuthAppRoleSecretRef secretRef;

  public V1alpha2IssuerSpecVaultAuthAppRole path(String path) {

    this.path = path;
    return this;
  }

  /**
   * Path where the App Role authentication backend is mounted in Vault, e.g: \&quot;approle\&quot;
   *
   * @return path
   */
  @ApiModelProperty(
      required = true,
      value =
          "Path where the App Role authentication backend is mounted in Vault, e.g: \"approle\"")
  public String getPath() {
    return path;
  }

  public void setPath(String path) {
    this.path = path;
  }

  public V1alpha2IssuerSpecVaultAuthAppRole roleId(String roleId) {

    this.roleId = roleId;
    return this;
  }

  /**
   * RoleID configured in the App Role authentication backend when setting up the authentication
   * backend in Vault.
   *
   * @return roleId
   */
  @ApiModelProperty(
      required = true,
      value =
          "RoleID configured in the App Role authentication backend when setting up the authentication backend in Vault.")
  public String getRoleId() {
    return roleId;
  }

  public void setRoleId(String roleId) {
    this.roleId = roleId;
  }

  public V1alpha2IssuerSpecVaultAuthAppRole secretRef(
      V1alpha2IssuerSpecVaultAuthAppRoleSecretRef secretRef) {

    this.secretRef = secretRef;
    return this;
  }

  /**
   * Get secretRef
   *
   * @return secretRef
   */
  @ApiModelProperty(required = true, value = "")
  public V1alpha2IssuerSpecVaultAuthAppRoleSecretRef getSecretRef() {
    return secretRef;
  }

  public void setSecretRef(V1alpha2IssuerSpecVaultAuthAppRoleSecretRef secretRef) {
    this.secretRef = secretRef;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1alpha2IssuerSpecVaultAuthAppRole v1alpha2IssuerSpecVaultAuthAppRole =
        (V1alpha2IssuerSpecVaultAuthAppRole) o;
    return Objects.equals(this.path, v1alpha2IssuerSpecVaultAuthAppRole.path)
        && Objects.equals(this.roleId, v1alpha2IssuerSpecVaultAuthAppRole.roleId)
        && Objects.equals(this.secretRef, v1alpha2IssuerSpecVaultAuthAppRole.secretRef);
  }

  @Override
  public int hashCode() {
    return Objects.hash(path, roleId, secretRef);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1alpha2IssuerSpecVaultAuthAppRole {\n");
    sb.append("    path: ").append(toIndentedString(path)).append("\n");
    sb.append("    roleId: ").append(toIndentedString(roleId)).append("\n");
    sb.append("    secretRef: ").append(toIndentedString(secretRef)).append("\n");
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
