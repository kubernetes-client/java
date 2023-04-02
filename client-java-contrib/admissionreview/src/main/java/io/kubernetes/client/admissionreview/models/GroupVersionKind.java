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
package io.kubernetes.client.admissionreview.models;

import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;

/**
 * GroupVersionKind unambiguously identifies a kind. It doesn&#39;t anonymously include GroupVersion
 * to avoid automatic coersion. It doesn&#39;t use a GroupVersion to avoid custom marshalling
 */
@ApiModel(
    description =
        "GroupVersionKind unambiguously identifies a kind.  It doesn't anonymously include GroupVersion to avoid automatic coersion.  It doesn't use a GroupVersion to avoid custom marshalling")
@javax.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    date = "2021-07-01T14:30:02.888Z[Etc/UTC]")
public class GroupVersionKind {
  public static final String SERIALIZED_NAME_GROUP = "group";

  @SerializedName(SERIALIZED_NAME_GROUP)
  private String group;

  public static final String SERIALIZED_NAME_KIND = "kind";

  @SerializedName(SERIALIZED_NAME_KIND)
  private String kind;

  public static final String SERIALIZED_NAME_VERSION = "version";

  @SerializedName(SERIALIZED_NAME_VERSION)
  private String version;

  public GroupVersionKind group(String group) {

    this.group = group;
    return this;
  }

  /**
   * Get group
   *
   * @return group
   */
  @ApiModelProperty(required = true, value = "")
  public String getGroup() {
    return group;
  }

  public void setGroup(String group) {
    this.group = group;
  }

  public GroupVersionKind kind(String kind) {

    this.kind = kind;
    return this;
  }

  /**
   * Get kind
   *
   * @return kind
   */
  @ApiModelProperty(required = true, value = "")
  public String getKind() {
    return kind;
  }

  public void setKind(String kind) {
    this.kind = kind;
  }

  public GroupVersionKind version(String version) {

    this.version = version;
    return this;
  }

  /**
   * Get version
   *
   * @return version
   */
  @ApiModelProperty(required = true, value = "")
  public String getVersion() {
    return version;
  }

  public void setVersion(String version) {
    this.version = version;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GroupVersionKind groupVersionKind = (GroupVersionKind) o;
    return Objects.equals(this.group, groupVersionKind.group)
        && Objects.equals(this.kind, groupVersionKind.kind)
        && Objects.equals(this.version, groupVersionKind.version);
  }

  @Override
  public int hashCode() {
    return Objects.hash(group, kind, version);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GroupVersionKind {\n");
    sb.append("    group: ").append(toIndentedString(group)).append("\n");
    sb.append("    kind: ").append(toIndentedString(kind)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
