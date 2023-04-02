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
 * APIResourceList is a list of APIResource, it is used to expose the name of the resources
 * supported in a specific group and version, and if the resource is namespaced.
 */
@ApiModel(
    description =
        "APIResourceList is a list of APIResource, it is used to expose the name of the resources supported in a specific group and version, and if the resource is namespaced.")
@javax.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    date = "2022-12-05T08:14:34.919Z[Etc/UTC]")
public class V1APIResourceList {
  public static final String SERIALIZED_NAME_API_VERSION = "apiVersion";

  @SerializedName(SERIALIZED_NAME_API_VERSION)
  private String apiVersion;

  public static final String SERIALIZED_NAME_GROUP_VERSION = "groupVersion";

  @SerializedName(SERIALIZED_NAME_GROUP_VERSION)
  private String groupVersion;

  public static final String SERIALIZED_NAME_KIND = "kind";

  @SerializedName(SERIALIZED_NAME_KIND)
  private String kind;

  public static final String SERIALIZED_NAME_RESOURCES = "resources";

  @SerializedName(SERIALIZED_NAME_RESOURCES)
  private List<V1APIResource> resources = new ArrayList<>();

  public V1APIResourceList apiVersion(String apiVersion) {

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

  public V1APIResourceList groupVersion(String groupVersion) {

    this.groupVersion = groupVersion;
    return this;
  }

  /**
   * groupVersion is the group and version this APIResourceList is for.
   *
   * @return groupVersion
   */
  @ApiModelProperty(
      required = true,
      value = "groupVersion is the group and version this APIResourceList is for.")
  public String getGroupVersion() {
    return groupVersion;
  }

  public void setGroupVersion(String groupVersion) {
    this.groupVersion = groupVersion;
  }

  public V1APIResourceList kind(String kind) {

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

  public V1APIResourceList resources(List<V1APIResource> resources) {

    this.resources = resources;
    return this;
  }

  public V1APIResourceList addResourcesItem(V1APIResource resourcesItem) {
    this.resources.add(resourcesItem);
    return this;
  }

  /**
   * resources contains the name of the resources and if they are namespaced.
   *
   * @return resources
   */
  @ApiModelProperty(
      required = true,
      value = "resources contains the name of the resources and if they are namespaced.")
  public List<V1APIResource> getResources() {
    return resources;
  }

  public void setResources(List<V1APIResource> resources) {
    this.resources = resources;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1APIResourceList v1APIResourceList = (V1APIResourceList) o;
    return Objects.equals(this.apiVersion, v1APIResourceList.apiVersion)
        && Objects.equals(this.groupVersion, v1APIResourceList.groupVersion)
        && Objects.equals(this.kind, v1APIResourceList.kind)
        && Objects.equals(this.resources, v1APIResourceList.resources);
  }

  @Override
  public int hashCode() {
    return Objects.hash(apiVersion, groupVersion, kind, resources);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1APIResourceList {\n");
    sb.append("    apiVersion: ").append(toIndentedString(apiVersion)).append("\n");
    sb.append("    groupVersion: ").append(toIndentedString(groupVersion)).append("\n");
    sb.append("    kind: ").append(toIndentedString(kind)).append("\n");
    sb.append("    resources: ").append(toIndentedString(resources)).append("\n");
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
