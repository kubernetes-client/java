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
 * API server instances report the versions they can decode and the version they encode objects to
 * when persisting objects in the backend.
 */
@ApiModel(
    description =
        "API server instances report the versions they can decode and the version they encode objects to when persisting objects in the backend.")
@javax.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    date = "2022-12-05T08:14:34.919Z[Etc/UTC]")
public class V1alpha1StorageVersionStatus {
  public static final String SERIALIZED_NAME_COMMON_ENCODING_VERSION = "commonEncodingVersion";

  @SerializedName(SERIALIZED_NAME_COMMON_ENCODING_VERSION)
  private String commonEncodingVersion;

  public static final String SERIALIZED_NAME_CONDITIONS = "conditions";

  @SerializedName(SERIALIZED_NAME_CONDITIONS)
  private List<V1alpha1StorageVersionCondition> conditions = null;

  public static final String SERIALIZED_NAME_STORAGE_VERSIONS = "storageVersions";

  @SerializedName(SERIALIZED_NAME_STORAGE_VERSIONS)
  private List<V1alpha1ServerStorageVersion> storageVersions = null;

  public V1alpha1StorageVersionStatus commonEncodingVersion(String commonEncodingVersion) {

    this.commonEncodingVersion = commonEncodingVersion;
    return this;
  }

  /**
   * If all API server instances agree on the same encoding storage version, then this field is set
   * to that version. Otherwise this field is left empty. API servers should finish updating its
   * storageVersionStatus entry before serving write operations, so that this field will be in sync
   * with the reality.
   *
   * @return commonEncodingVersion
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "If all API server instances agree on the same encoding storage version, then this field is set to that version. Otherwise this field is left empty. API servers should finish updating its storageVersionStatus entry before serving write operations, so that this field will be in sync with the reality.")
  public String getCommonEncodingVersion() {
    return commonEncodingVersion;
  }

  public void setCommonEncodingVersion(String commonEncodingVersion) {
    this.commonEncodingVersion = commonEncodingVersion;
  }

  public V1alpha1StorageVersionStatus conditions(List<V1alpha1StorageVersionCondition> conditions) {

    this.conditions = conditions;
    return this;
  }

  public V1alpha1StorageVersionStatus addConditionsItem(
      V1alpha1StorageVersionCondition conditionsItem) {
    if (this.conditions == null) {
      this.conditions = new ArrayList<>();
    }
    this.conditions.add(conditionsItem);
    return this;
  }

  /**
   * The latest available observations of the storageVersion&#39;s state.
   *
   * @return conditions
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The latest available observations of the storageVersion's state.")
  public List<V1alpha1StorageVersionCondition> getConditions() {
    return conditions;
  }

  public void setConditions(List<V1alpha1StorageVersionCondition> conditions) {
    this.conditions = conditions;
  }

  public V1alpha1StorageVersionStatus storageVersions(
      List<V1alpha1ServerStorageVersion> storageVersions) {

    this.storageVersions = storageVersions;
    return this;
  }

  public V1alpha1StorageVersionStatus addStorageVersionsItem(
      V1alpha1ServerStorageVersion storageVersionsItem) {
    if (this.storageVersions == null) {
      this.storageVersions = new ArrayList<>();
    }
    this.storageVersions.add(storageVersionsItem);
    return this;
  }

  /**
   * The reported versions per API server instance.
   *
   * @return storageVersions
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The reported versions per API server instance.")
  public List<V1alpha1ServerStorageVersion> getStorageVersions() {
    return storageVersions;
  }

  public void setStorageVersions(List<V1alpha1ServerStorageVersion> storageVersions) {
    this.storageVersions = storageVersions;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1alpha1StorageVersionStatus v1alpha1StorageVersionStatus = (V1alpha1StorageVersionStatus) o;
    return Objects.equals(
            this.commonEncodingVersion, v1alpha1StorageVersionStatus.commonEncodingVersion)
        && Objects.equals(this.conditions, v1alpha1StorageVersionStatus.conditions)
        && Objects.equals(this.storageVersions, v1alpha1StorageVersionStatus.storageVersions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(commonEncodingVersion, conditions, storageVersions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1alpha1StorageVersionStatus {\n");
    sb.append("    commonEncodingVersion: ")
        .append(toIndentedString(commonEncodingVersion))
        .append("\n");
    sb.append("    conditions: ").append(toIndentedString(conditions)).append("\n");
    sb.append("    storageVersions: ").append(toIndentedString(storageVersions)).append("\n");
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
