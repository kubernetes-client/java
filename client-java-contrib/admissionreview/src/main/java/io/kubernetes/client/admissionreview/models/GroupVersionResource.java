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
 * GroupVersionResource unambiguously identifies a resource. It doesn&#39;t anonymously include
 * GroupVersion to avoid automatic coersion. It doesn&#39;t use a GroupVersion to avoid custom
 * marshalling
 */
@ApiModel(
    description =
        "GroupVersionResource unambiguously identifies a resource.  It doesn't anonymously include GroupVersion to avoid automatic coersion.  It doesn't use a GroupVersion to avoid custom marshalling")
@javax.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    date = "2021-07-01T14:30:02.888Z[Etc/UTC]")
public class GroupVersionResource {
  public static final String SERIALIZED_NAME_GROUP = "group";

  @SerializedName(SERIALIZED_NAME_GROUP)
  private String group;

  public static final String SERIALIZED_NAME_RESOURCE = "resource";

  @SerializedName(SERIALIZED_NAME_RESOURCE)
  private String resource;

  public static final String SERIALIZED_NAME_VERSION = "version";

  @SerializedName(SERIALIZED_NAME_VERSION)
  private String version;

  public GroupVersionResource group(String group) {

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

  public GroupVersionResource resource(String resource) {

    this.resource = resource;
    return this;
  }

  /**
   * Get resource
   *
   * @return resource
   */
  @ApiModelProperty(required = true, value = "")
  public String getResource() {
    return resource;
  }

  public void setResource(String resource) {
    this.resource = resource;
  }

  public GroupVersionResource version(String version) {

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
    GroupVersionResource groupVersionResource = (GroupVersionResource) o;
    return Objects.equals(this.group, groupVersionResource.group)
        && Objects.equals(this.resource, groupVersionResource.resource)
        && Objects.equals(this.version, groupVersionResource.version);
  }

  @Override
  public int hashCode() {
    return Objects.hash(group, resource, version);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GroupVersionResource {\n");
    sb.append("    group: ").append(toIndentedString(group)).append("\n");
    sb.append("    resource: ").append(toIndentedString(resource)).append("\n");
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
