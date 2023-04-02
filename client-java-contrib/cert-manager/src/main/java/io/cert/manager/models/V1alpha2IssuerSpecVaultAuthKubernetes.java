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
 * Kubernetes authenticates with Vault by passing the ServiceAccount token stored in the named
 * Secret resource to the Vault server.
 */
@ApiModel(
    description =
        "Kubernetes authenticates with Vault by passing the ServiceAccount token stored in the named Secret resource to the Vault server.")
@javax.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    date = "2020-08-18T19:55:23.947Z[Etc/UTC]")
public class V1alpha2IssuerSpecVaultAuthKubernetes {
  public static final String SERIALIZED_NAME_MOUNT_PATH = "mountPath";

  @SerializedName(SERIALIZED_NAME_MOUNT_PATH)
  private String mountPath;

  public static final String SERIALIZED_NAME_ROLE = "role";

  @SerializedName(SERIALIZED_NAME_ROLE)
  private String role;

  public static final String SERIALIZED_NAME_SECRET_REF = "secretRef";

  @SerializedName(SERIALIZED_NAME_SECRET_REF)
  private V1alpha2IssuerSpecVaultAuthKubernetesSecretRef secretRef;

  public V1alpha2IssuerSpecVaultAuthKubernetes mountPath(String mountPath) {

    this.mountPath = mountPath;
    return this;
  }

  /**
   * The Vault mountPath here is the mount path to use when authenticating with Vault. For example,
   * setting a value to &#x60;/v1/auth/foo&#x60;, will use the path &#x60;/v1/auth/foo/login&#x60;
   * to authenticate with Vault. If unspecified, the default value \&quot;/v1/auth/kubernetes\&quot;
   * will be used.
   *
   * @return mountPath
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "The Vault mountPath here is the mount path to use when authenticating with Vault. For example, setting a value to `/v1/auth/foo`, will use the path `/v1/auth/foo/login` to authenticate with Vault. If unspecified, the default value \"/v1/auth/kubernetes\" will be used.")
  public String getMountPath() {
    return mountPath;
  }

  public void setMountPath(String mountPath) {
    this.mountPath = mountPath;
  }

  public V1alpha2IssuerSpecVaultAuthKubernetes role(String role) {

    this.role = role;
    return this;
  }

  /**
   * A required field containing the Vault Role to assume. A Role binds a Kubernetes ServiceAccount
   * with a set of Vault policies.
   *
   * @return role
   */
  @ApiModelProperty(
      required = true,
      value =
          "A required field containing the Vault Role to assume. A Role binds a Kubernetes ServiceAccount with a set of Vault policies.")
  public String getRole() {
    return role;
  }

  public void setRole(String role) {
    this.role = role;
  }

  public V1alpha2IssuerSpecVaultAuthKubernetes secretRef(
      V1alpha2IssuerSpecVaultAuthKubernetesSecretRef secretRef) {

    this.secretRef = secretRef;
    return this;
  }

  /**
   * Get secretRef
   *
   * @return secretRef
   */
  @ApiModelProperty(required = true, value = "")
  public V1alpha2IssuerSpecVaultAuthKubernetesSecretRef getSecretRef() {
    return secretRef;
  }

  public void setSecretRef(V1alpha2IssuerSpecVaultAuthKubernetesSecretRef secretRef) {
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
    V1alpha2IssuerSpecVaultAuthKubernetes v1alpha2IssuerSpecVaultAuthKubernetes =
        (V1alpha2IssuerSpecVaultAuthKubernetes) o;
    return Objects.equals(this.mountPath, v1alpha2IssuerSpecVaultAuthKubernetes.mountPath)
        && Objects.equals(this.role, v1alpha2IssuerSpecVaultAuthKubernetes.role)
        && Objects.equals(this.secretRef, v1alpha2IssuerSpecVaultAuthKubernetes.secretRef);
  }

  @Override
  public int hashCode() {
    return Objects.hash(mountPath, role, secretRef);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1alpha2IssuerSpecVaultAuthKubernetes {\n");
    sb.append("    mountPath: ").append(toIndentedString(mountPath)).append("\n");
    sb.append("    role: ").append(toIndentedString(role)).append("\n");
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
