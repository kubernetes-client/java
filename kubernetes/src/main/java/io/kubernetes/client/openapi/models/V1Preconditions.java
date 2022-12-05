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

/** Preconditions must be fulfilled before an operation (update, delete, etc.) is carried out. */
@ApiModel(
    description =
        "Preconditions must be fulfilled before an operation (update, delete, etc.) is carried out.")
@javax.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    date = "2022-12-05T08:14:34.919Z[Etc/UTC]")
public class V1Preconditions {
  public static final String SERIALIZED_NAME_RESOURCE_VERSION = "resourceVersion";

  @SerializedName(SERIALIZED_NAME_RESOURCE_VERSION)
  private String resourceVersion;

  public static final String SERIALIZED_NAME_UID = "uid";

  @SerializedName(SERIALIZED_NAME_UID)
  private String uid;

  public V1Preconditions resourceVersion(String resourceVersion) {

    this.resourceVersion = resourceVersion;
    return this;
  }

  /**
   * Specifies the target ResourceVersion
   *
   * @return resourceVersion
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Specifies the target ResourceVersion")
  public String getResourceVersion() {
    return resourceVersion;
  }

  public void setResourceVersion(String resourceVersion) {
    this.resourceVersion = resourceVersion;
  }

  public V1Preconditions uid(String uid) {

    this.uid = uid;
    return this;
  }

  /**
   * Specifies the target UID.
   *
   * @return uid
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Specifies the target UID.")
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
    V1Preconditions v1Preconditions = (V1Preconditions) o;
    return Objects.equals(this.resourceVersion, v1Preconditions.resourceVersion)
        && Objects.equals(this.uid, v1Preconditions.uid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(resourceVersion, uid);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1Preconditions {\n");
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
