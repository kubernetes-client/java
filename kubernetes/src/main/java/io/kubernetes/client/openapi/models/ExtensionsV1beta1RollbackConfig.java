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
package io.kubernetes.client.openapi.models;

import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;

/** DEPRECATED. */
@ApiModel(description = "DEPRECATED.")
@javax.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    date = "2020-06-19T10:47:33.387Z[Etc/UTC]")
public class ExtensionsV1beta1RollbackConfig {
  public static final String SERIALIZED_NAME_REVISION = "revision";

  @SerializedName(SERIALIZED_NAME_REVISION)
  private Long revision;

  public ExtensionsV1beta1RollbackConfig revision(Long revision) {

    this.revision = revision;
    return this;
  }

  /**
   * The revision to rollback to. If set to 0, rollback to the last revision.
   *
   * @return revision
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value = "The revision to rollback to. If set to 0, rollback to the last revision.")
  public Long getRevision() {
    return revision;
  }

  public void setRevision(Long revision) {
    this.revision = revision;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExtensionsV1beta1RollbackConfig extensionsV1beta1RollbackConfig =
        (ExtensionsV1beta1RollbackConfig) o;
    return Objects.equals(this.revision, extensionsV1beta1RollbackConfig.revision);
  }

  @Override
  public int hashCode() {
    return Objects.hash(revision);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExtensionsV1beta1RollbackConfig {\n");
    sb.append("    revision: ").append(toIndentedString(revision)).append("\n");
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
