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
import java.util.Objects;

/**
 * ConfigMapNodeConfigSource contains the information to reference a ConfigMap as a config source
 * for the Node. This API is deprecated since 1.22:
 * https://git.k8s.io/enhancements/keps/sig-node/281-dynamic-kubelet-configuration
 */
@ApiModel(
    description =
        "ConfigMapNodeConfigSource contains the information to reference a ConfigMap as a config source for the Node. This API is deprecated since 1.22: https://git.k8s.io/enhancements/keps/sig-node/281-dynamic-kubelet-configuration")
@javax.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    date = "2022-12-05T08:14:34.919Z[Etc/UTC]")
public class V1ConfigMapNodeConfigSource {
  public static final String SERIALIZED_NAME_KUBELET_CONFIG_KEY = "kubeletConfigKey";

  @SerializedName(SERIALIZED_NAME_KUBELET_CONFIG_KEY)
  private String kubeletConfigKey;

  public static final String SERIALIZED_NAME_NAME = "name";

  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_NAMESPACE = "namespace";

  @SerializedName(SERIALIZED_NAME_NAMESPACE)
  private String namespace;

  public static final String SERIALIZED_NAME_RESOURCE_VERSION = "resourceVersion";

  @SerializedName(SERIALIZED_NAME_RESOURCE_VERSION)
  private String resourceVersion;

  public static final String SERIALIZED_NAME_UID = "uid";

  @SerializedName(SERIALIZED_NAME_UID)
  private String uid;

  public V1ConfigMapNodeConfigSource kubeletConfigKey(String kubeletConfigKey) {

    this.kubeletConfigKey = kubeletConfigKey;
    return this;
  }

  /**
   * KubeletConfigKey declares which key of the referenced ConfigMap corresponds to the
   * KubeletConfiguration structure This field is required in all cases.
   *
   * @return kubeletConfigKey
   */
  @ApiModelProperty(
      required = true,
      value =
          "KubeletConfigKey declares which key of the referenced ConfigMap corresponds to the KubeletConfiguration structure This field is required in all cases.")
  public String getKubeletConfigKey() {
    return kubeletConfigKey;
  }

  public void setKubeletConfigKey(String kubeletConfigKey) {
    this.kubeletConfigKey = kubeletConfigKey;
  }

  public V1ConfigMapNodeConfigSource name(String name) {

    this.name = name;
    return this;
  }

  /**
   * Name is the metadata.name of the referenced ConfigMap. This field is required in all cases.
   *
   * @return name
   */
  @ApiModelProperty(
      required = true,
      value =
          "Name is the metadata.name of the referenced ConfigMap. This field is required in all cases.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public V1ConfigMapNodeConfigSource namespace(String namespace) {

    this.namespace = namespace;
    return this;
  }

  /**
   * Namespace is the metadata.namespace of the referenced ConfigMap. This field is required in all
   * cases.
   *
   * @return namespace
   */
  @ApiModelProperty(
      required = true,
      value =
          "Namespace is the metadata.namespace of the referenced ConfigMap. This field is required in all cases.")
  public String getNamespace() {
    return namespace;
  }

  public void setNamespace(String namespace) {
    this.namespace = namespace;
  }

  public V1ConfigMapNodeConfigSource resourceVersion(String resourceVersion) {

    this.resourceVersion = resourceVersion;
    return this;
  }

  /**
   * ResourceVersion is the metadata.ResourceVersion of the referenced ConfigMap. This field is
   * forbidden in Node.Spec, and required in Node.Status.
   *
   * @return resourceVersion
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "ResourceVersion is the metadata.ResourceVersion of the referenced ConfigMap. This field is forbidden in Node.Spec, and required in Node.Status.")
  public String getResourceVersion() {
    return resourceVersion;
  }

  public void setResourceVersion(String resourceVersion) {
    this.resourceVersion = resourceVersion;
  }

  public V1ConfigMapNodeConfigSource uid(String uid) {

    this.uid = uid;
    return this;
  }

  /**
   * UID is the metadata.UID of the referenced ConfigMap. This field is forbidden in Node.Spec, and
   * required in Node.Status.
   *
   * @return uid
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "UID is the metadata.UID of the referenced ConfigMap. This field is forbidden in Node.Spec, and required in Node.Status.")
  public String getUid() {
    return uid;
  }

  public void setUid(String uid) {
    this.uid = uid;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1ConfigMapNodeConfigSource v1ConfigMapNodeConfigSource = (V1ConfigMapNodeConfigSource) o;
    return Objects.equals(this.kubeletConfigKey, v1ConfigMapNodeConfigSource.kubeletConfigKey)
        && Objects.equals(this.name, v1ConfigMapNodeConfigSource.name)
        && Objects.equals(this.namespace, v1ConfigMapNodeConfigSource.namespace)
        && Objects.equals(this.resourceVersion, v1ConfigMapNodeConfigSource.resourceVersion)
        && Objects.equals(this.uid, v1ConfigMapNodeConfigSource.uid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(kubeletConfigKey, name, namespace, resourceVersion, uid);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1ConfigMapNodeConfigSource {\n");
    sb.append("    kubeletConfigKey: ").append(toIndentedString(kubeletConfigKey)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    namespace: ").append(toIndentedString(namespace)).append("\n");
    sb.append("    resourceVersion: ").append(toIndentedString(resourceVersion)).append("\n");
    sb.append("    uid: ").append(toIndentedString(uid)).append("\n");
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
