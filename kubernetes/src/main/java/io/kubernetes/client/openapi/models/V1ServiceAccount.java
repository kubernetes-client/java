/*
Copyright 2022 The Kubernetes Authors.
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

import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * ServiceAccount binds together: * a name, understood by users, and perhaps by peripheral systems,
 * for an identity * a principal that can be authenticated and authorized * a set of secrets
 */
@ApiModel(
    description =
        "ServiceAccount binds together: * a name, understood by users, and perhaps by peripheral systems, for an identity * a principal that can be authenticated and authorized * a set of secrets")
@javax.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    date = "2022-12-05T08:14:34.919Z[Etc/UTC]")
public class V1ServiceAccount implements io.kubernetes.client.common.KubernetesObject {
  public static final String SERIALIZED_NAME_API_VERSION = "apiVersion";

  @SerializedName(SERIALIZED_NAME_API_VERSION)
  private String apiVersion;

  public static final String SERIALIZED_NAME_AUTOMOUNT_SERVICE_ACCOUNT_TOKEN =
      "automountServiceAccountToken";

  @SerializedName(SERIALIZED_NAME_AUTOMOUNT_SERVICE_ACCOUNT_TOKEN)
  private Boolean automountServiceAccountToken;

  public static final String SERIALIZED_NAME_IMAGE_PULL_SECRETS = "imagePullSecrets";

  @SerializedName(SERIALIZED_NAME_IMAGE_PULL_SECRETS)
  private List<V1LocalObjectReference> imagePullSecrets = null;

  public static final String SERIALIZED_NAME_KIND = "kind";

  @SerializedName(SERIALIZED_NAME_KIND)
  private String kind;

  public static final String SERIALIZED_NAME_METADATA = "metadata";

  @SerializedName(SERIALIZED_NAME_METADATA)
  private V1ObjectMeta metadata;

  public static final String SERIALIZED_NAME_SECRETS = "secrets";

  @SerializedName(SERIALIZED_NAME_SECRETS)
  private List<V1ObjectReference> secrets = null;

  public V1ServiceAccount apiVersion(String apiVersion) {

    this.apiVersion = apiVersion;
    return this;
  }

  /**
   * APIVersion defines the versioned schema of this representation of an object. Servers should
   * convert recognized schemas to the latest internal value, and may reject unrecognized values.
   * More info:
   * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
   *
   * @return apiVersion
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources")
  public String getApiVersion() {
    return apiVersion;
  }

  public void setApiVersion(String apiVersion) {
    this.apiVersion = apiVersion;
  }

  public V1ServiceAccount automountServiceAccountToken(Boolean automountServiceAccountToken) {

    this.automountServiceAccountToken = automountServiceAccountToken;
    return this;
  }

  /**
   * AutomountServiceAccountToken indicates whether pods running as this service account should have
   * an API token automatically mounted. Can be overridden at the pod level.
   *
   * @return automountServiceAccountToken
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "AutomountServiceAccountToken indicates whether pods running as this service account should have an API token automatically mounted. Can be overridden at the pod level.")
  public Boolean getAutomountServiceAccountToken() {
    return automountServiceAccountToken;
  }

  public void setAutomountServiceAccountToken(Boolean automountServiceAccountToken) {
    this.automountServiceAccountToken = automountServiceAccountToken;
  }

  public V1ServiceAccount imagePullSecrets(List<V1LocalObjectReference> imagePullSecrets) {

    this.imagePullSecrets = imagePullSecrets;
    return this;
  }

  public V1ServiceAccount addImagePullSecretsItem(V1LocalObjectReference imagePullSecretsItem) {
    if (this.imagePullSecrets == null) {
      this.imagePullSecrets = new ArrayList<>();
    }
    this.imagePullSecrets.add(imagePullSecretsItem);
    return this;
  }

  /**
   * ImagePullSecrets is a list of references to secrets in the same namespace to use for pulling
   * any images in pods that reference this ServiceAccount. ImagePullSecrets are distinct from
   * Secrets because Secrets can be mounted in the pod, but ImagePullSecrets are only accessed by
   * the kubelet. More info:
   * https://kubernetes.io/docs/concepts/containers/images/#specifying-imagepullsecrets-on-a-pod
   *
   * @return imagePullSecrets
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "ImagePullSecrets is a list of references to secrets in the same namespace to use for pulling any images in pods that reference this ServiceAccount. ImagePullSecrets are distinct from Secrets because Secrets can be mounted in the pod, but ImagePullSecrets are only accessed by the kubelet. More info: https://kubernetes.io/docs/concepts/containers/images/#specifying-imagepullsecrets-on-a-pod")
  public List<V1LocalObjectReference> getImagePullSecrets() {
    return imagePullSecrets;
  }

  public void setImagePullSecrets(List<V1LocalObjectReference> imagePullSecrets) {
    this.imagePullSecrets = imagePullSecrets;
  }

  public V1ServiceAccount kind(String kind) {

    this.kind = kind;
    return this;
  }

  /**
   * Kind is a string value representing the REST resource this object represents. Servers may infer
   * this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More
   * info:
   * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
   *
   * @return kind
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds")
  public String getKind() {
    return kind;
  }

  public void setKind(String kind) {
    this.kind = kind;
  }

  public V1ServiceAccount metadata(V1ObjectMeta metadata) {

    this.metadata = metadata;
    return this;
  }

  /**
   * Get metadata
   *
   * @return metadata
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  public V1ObjectMeta getMetadata() {
    return metadata;
  }

  public void setMetadata(V1ObjectMeta metadata) {
    this.metadata = metadata;
  }

  public V1ServiceAccount secrets(List<V1ObjectReference> secrets) {

    this.secrets = secrets;
    return this;
  }

  public V1ServiceAccount addSecretsItem(V1ObjectReference secretsItem) {
    if (this.secrets == null) {
      this.secrets = new ArrayList<>();
    }
    this.secrets.add(secretsItem);
    return this;
  }

  /**
   * Secrets is a list of the secrets in the same namespace that pods running using this
   * ServiceAccount are allowed to use. Pods are only limited to this list if this service account
   * has a \&quot;kubernetes.io/enforce-mountable-secrets\&quot; annotation set to
   * \&quot;true\&quot;. This field should not be used to find auto-generated service account token
   * secrets for use outside of pods. Instead, tokens can be requested directly using the
   * TokenRequest API, or service account token secrets can be manually created. More info:
   * https://kubernetes.io/docs/concepts/configuration/secret
   *
   * @return secrets
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "Secrets is a list of the secrets in the same namespace that pods running using this ServiceAccount are allowed to use. Pods are only limited to this list if this service account has a \"kubernetes.io/enforce-mountable-secrets\" annotation set to \"true\". This field should not be used to find auto-generated service account token secrets for use outside of pods. Instead, tokens can be requested directly using the TokenRequest API, or service account token secrets can be manually created. More info: https://kubernetes.io/docs/concepts/configuration/secret")
  public List<V1ObjectReference> getSecrets() {
    return secrets;
  }

  public void setSecrets(List<V1ObjectReference> secrets) {
    this.secrets = secrets;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1ServiceAccount v1ServiceAccount = (V1ServiceAccount) o;
    return Objects.equals(this.apiVersion, v1ServiceAccount.apiVersion)
        && Objects.equals(
            this.automountServiceAccountToken, v1ServiceAccount.automountServiceAccountToken)
        && Objects.equals(this.imagePullSecrets, v1ServiceAccount.imagePullSecrets)
        && Objects.equals(this.kind, v1ServiceAccount.kind)
        && Objects.equals(this.metadata, v1ServiceAccount.metadata)
        && Objects.equals(this.secrets, v1ServiceAccount.secrets);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        apiVersion, automountServiceAccountToken, imagePullSecrets, kind, metadata, secrets);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1ServiceAccount {\n");
    sb.append("    apiVersion: ").append(toIndentedString(apiVersion)).append("\n");
    sb.append("    automountServiceAccountToken: ")
        .append(toIndentedString(automountServiceAccountToken))
        .append("\n");
    sb.append("    imagePullSecrets: ").append(toIndentedString(imagePullSecrets)).append("\n");
    sb.append("    kind: ").append(toIndentedString(kind)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    secrets: ").append(toIndentedString(secrets)).append("\n");
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
