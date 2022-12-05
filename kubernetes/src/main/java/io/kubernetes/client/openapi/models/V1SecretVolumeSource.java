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
 * Adapts a Secret into a volume. The contents of the target Secret&#39;s Data field will be
 * presented in a volume as files using the keys in the Data field as the file names. Secret volumes
 * support ownership management and SELinux relabeling.
 */
@ApiModel(
    description =
        "Adapts a Secret into a volume.  The contents of the target Secret's Data field will be presented in a volume as files using the keys in the Data field as the file names. Secret volumes support ownership management and SELinux relabeling.")
@javax.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    date = "2022-12-05T08:14:34.919Z[Etc/UTC]")
public class V1SecretVolumeSource {
  public static final String SERIALIZED_NAME_DEFAULT_MODE = "defaultMode";

  @SerializedName(SERIALIZED_NAME_DEFAULT_MODE)
  private Integer defaultMode;

  public static final String SERIALIZED_NAME_ITEMS = "items";

  @SerializedName(SERIALIZED_NAME_ITEMS)
  private List<V1KeyToPath> items = null;

  public static final String SERIALIZED_NAME_OPTIONAL = "optional";

  @SerializedName(SERIALIZED_NAME_OPTIONAL)
  private Boolean optional;

  public static final String SERIALIZED_NAME_SECRET_NAME = "secretName";

  @SerializedName(SERIALIZED_NAME_SECRET_NAME)
  private String secretName;

  public V1SecretVolumeSource defaultMode(Integer defaultMode) {

    this.defaultMode = defaultMode;
    return this;
  }

  /**
   * defaultMode is Optional: mode bits used to set permissions on created files by default. Must be
   * an octal value between 0000 and 0777 or a decimal value between 0 and 511. YAML accepts both
   * octal and decimal values, JSON requires decimal values for mode bits. Defaults to 0644.
   * Directories within the path are not affected by this setting. This might be in conflict with
   * other options that affect the file mode, like fsGroup, and the result can be other mode bits
   * set.
   *
   * @return defaultMode
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "defaultMode is Optional: mode bits used to set permissions on created files by default. Must be an octal value between 0000 and 0777 or a decimal value between 0 and 511. YAML accepts both octal and decimal values, JSON requires decimal values for mode bits. Defaults to 0644. Directories within the path are not affected by this setting. This might be in conflict with other options that affect the file mode, like fsGroup, and the result can be other mode bits set.")
  public Integer getDefaultMode() {
    return defaultMode;
  }

  public void setDefaultMode(Integer defaultMode) {
    this.defaultMode = defaultMode;
  }

  public V1SecretVolumeSource items(List<V1KeyToPath> items) {

    this.items = items;
    return this;
  }

  public V1SecretVolumeSource addItemsItem(V1KeyToPath itemsItem) {
    if (this.items == null) {
      this.items = new ArrayList<>();
    }
    this.items.add(itemsItem);
    return this;
  }

  /**
   * items If unspecified, each key-value pair in the Data field of the referenced Secret will be
   * projected into the volume as a file whose name is the key and content is the value. If
   * specified, the listed keys will be projected into the specified paths, and unlisted keys will
   * not be present. If a key is specified which is not present in the Secret, the volume setup will
   * error unless it is marked optional. Paths must be relative and may not contain the &#39;..&#39;
   * path or start with &#39;..&#39;.
   *
   * @return items
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "items If unspecified, each key-value pair in the Data field of the referenced Secret will be projected into the volume as a file whose name is the key and content is the value. If specified, the listed keys will be projected into the specified paths, and unlisted keys will not be present. If a key is specified which is not present in the Secret, the volume setup will error unless it is marked optional. Paths must be relative and may not contain the '..' path or start with '..'.")
  public List<V1KeyToPath> getItems() {
    return items;
  }

  public void setItems(List<V1KeyToPath> items) {
    this.items = items;
  }

  public V1SecretVolumeSource optional(Boolean optional) {

    this.optional = optional;
    return this;
  }

  /**
   * optional field specify whether the Secret or its keys must be defined
   *
   * @return optional
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "optional field specify whether the Secret or its keys must be defined")
  public Boolean getOptional() {
    return optional;
  }

  public void setOptional(Boolean optional) {
    this.optional = optional;
  }

  public V1SecretVolumeSource secretName(String secretName) {

    this.secretName = secretName;
    return this;
  }

  /**
   * secretName is the name of the secret in the pod&#39;s namespace to use. More info:
   * https://kubernetes.io/docs/concepts/storage/volumes#secret
   *
   * @return secretName
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "secretName is the name of the secret in the pod's namespace to use. More info: https://kubernetes.io/docs/concepts/storage/volumes#secret")
  public String getSecretName() {
    return secretName;
  }

  public void setSecretName(String secretName) {
    this.secretName = secretName;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1SecretVolumeSource v1SecretVolumeSource = (V1SecretVolumeSource) o;
    return Objects.equals(this.defaultMode, v1SecretVolumeSource.defaultMode)
        && Objects.equals(this.items, v1SecretVolumeSource.items)
        && Objects.equals(this.optional, v1SecretVolumeSource.optional)
        && Objects.equals(this.secretName, v1SecretVolumeSource.secretName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(defaultMode, items, optional, secretName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1SecretVolumeSource {\n");
    sb.append("    defaultMode: ").append(toIndentedString(defaultMode)).append("\n");
    sb.append("    items: ").append(toIndentedString(items)).append("\n");
    sb.append("    optional: ").append(toIndentedString(optional)).append("\n");
    sb.append("    secretName: ").append(toIndentedString(secretName)).append("\n");
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
