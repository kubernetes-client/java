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
 * An API server instance reports the version it can decode and the version it encodes objects to
 * when persisting objects in the backend.
 */
@ApiModel(
    description =
        "An API server instance reports the version it can decode and the version it encodes objects to when persisting objects in the backend.")
@javax.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    date = "2022-12-05T08:14:34.919Z[Etc/UTC]")
public class V1alpha1ServerStorageVersion {
  public static final String SERIALIZED_NAME_API_SERVER_I_D = "apiServerID";

  @SerializedName(SERIALIZED_NAME_API_SERVER_I_D)
  private String apiServerID;

  public static final String SERIALIZED_NAME_DECODABLE_VERSIONS = "decodableVersions";

  @SerializedName(SERIALIZED_NAME_DECODABLE_VERSIONS)
  private List<String> decodableVersions = null;

  public static final String SERIALIZED_NAME_ENCODING_VERSION = "encodingVersion";

  @SerializedName(SERIALIZED_NAME_ENCODING_VERSION)
  private String encodingVersion;

  public V1alpha1ServerStorageVersion apiServerID(String apiServerID) {

    this.apiServerID = apiServerID;
    return this;
  }

  /**
   * The ID of the reporting API server.
   *
   * @return apiServerID
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The ID of the reporting API server.")
  public String getApiServerID() {
    return apiServerID;
  }

  public void setApiServerID(String apiServerID) {
    this.apiServerID = apiServerID;
  }

  public V1alpha1ServerStorageVersion decodableVersions(List<String> decodableVersions) {

    this.decodableVersions = decodableVersions;
    return this;
  }

  public V1alpha1ServerStorageVersion addDecodableVersionsItem(String decodableVersionsItem) {
    if (this.decodableVersions == null) {
      this.decodableVersions = new ArrayList<>();
    }
    this.decodableVersions.add(decodableVersionsItem);
    return this;
  }

  /**
   * The API server can decode objects encoded in these versions. The encodingVersion must be
   * included in the decodableVersions.
   *
   * @return decodableVersions
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "The API server can decode objects encoded in these versions. The encodingVersion must be included in the decodableVersions.")
  public List<String> getDecodableVersions() {
    return decodableVersions;
  }

  public void setDecodableVersions(List<String> decodableVersions) {
    this.decodableVersions = decodableVersions;
  }

  public V1alpha1ServerStorageVersion encodingVersion(String encodingVersion) {

    this.encodingVersion = encodingVersion;
    return this;
  }

  /**
   * The API server encodes the object to this version when persisting it in the backend (e.g.,
   * etcd).
   *
   * @return encodingVersion
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "The API server encodes the object to this version when persisting it in the backend (e.g., etcd).")
  public String getEncodingVersion() {
    return encodingVersion;
  }

  public void setEncodingVersion(String encodingVersion) {
    this.encodingVersion = encodingVersion;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1alpha1ServerStorageVersion v1alpha1ServerStorageVersion = (V1alpha1ServerStorageVersion) o;
    return Objects.equals(this.apiServerID, v1alpha1ServerStorageVersion.apiServerID)
        && Objects.equals(this.decodableVersions, v1alpha1ServerStorageVersion.decodableVersions)
        && Objects.equals(this.encodingVersion, v1alpha1ServerStorageVersion.encodingVersion);
  }

  @Override
  public int hashCode() {
    return Objects.hash(apiServerID, decodableVersions, encodingVersion);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1alpha1ServerStorageVersion {\n");
    sb.append("    apiServerID: ").append(toIndentedString(apiServerID)).append("\n");
    sb.append("    decodableVersions: ").append(toIndentedString(decodableVersions)).append("\n");
    sb.append("    encodingVersion: ").append(toIndentedString(encodingVersion)).append("\n");
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
