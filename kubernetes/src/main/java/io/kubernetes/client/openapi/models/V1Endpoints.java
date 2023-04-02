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
 * Endpoints is a collection of endpoints that implement the actual service. Example: Name:
 * \&quot;mysvc\&quot;, Subsets: [ { Addresses: [{\&quot;ip\&quot;: \&quot;10.10.1.1\&quot;},
 * {\&quot;ip\&quot;: \&quot;10.10.2.2\&quot;}], Ports: [{\&quot;name\&quot;: \&quot;a\&quot;,
 * \&quot;port\&quot;: 8675}, {\&quot;name\&quot;: \&quot;b\&quot;, \&quot;port\&quot;: 309}] }, {
 * Addresses: [{\&quot;ip\&quot;: \&quot;10.10.3.3\&quot;}], Ports: [{\&quot;name\&quot;:
 * \&quot;a\&quot;, \&quot;port\&quot;: 93}, {\&quot;name\&quot;: \&quot;b\&quot;,
 * \&quot;port\&quot;: 76}] }, ]
 */
@ApiModel(
    description =
        "Endpoints is a collection of endpoints that implement the actual service. Example:    Name: \"mysvc\",   Subsets: [     {       Addresses: [{\"ip\": \"10.10.1.1\"}, {\"ip\": \"10.10.2.2\"}],       Ports: [{\"name\": \"a\", \"port\": 8675}, {\"name\": \"b\", \"port\": 309}]     },     {       Addresses: [{\"ip\": \"10.10.3.3\"}],       Ports: [{\"name\": \"a\", \"port\": 93}, {\"name\": \"b\", \"port\": 76}]     },  ]")
@javax.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    date = "2022-12-05T08:14:34.919Z[Etc/UTC]")
public class V1Endpoints implements io.kubernetes.client.common.KubernetesObject {
  public static final String SERIALIZED_NAME_API_VERSION = "apiVersion";

  @SerializedName(SERIALIZED_NAME_API_VERSION)
  private String apiVersion;

  public static final String SERIALIZED_NAME_KIND = "kind";

  @SerializedName(SERIALIZED_NAME_KIND)
  private String kind;

  public static final String SERIALIZED_NAME_METADATA = "metadata";

  @SerializedName(SERIALIZED_NAME_METADATA)
  private V1ObjectMeta metadata;

  public static final String SERIALIZED_NAME_SUBSETS = "subsets";

  @SerializedName(SERIALIZED_NAME_SUBSETS)
  private List<V1EndpointSubset> subsets = null;

  public V1Endpoints apiVersion(String apiVersion) {

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

  public V1Endpoints kind(String kind) {

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

  public V1Endpoints metadata(V1ObjectMeta metadata) {

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

  public V1Endpoints subsets(List<V1EndpointSubset> subsets) {

    this.subsets = subsets;
    return this;
  }

  public V1Endpoints addSubsetsItem(V1EndpointSubset subsetsItem) {
    if (this.subsets == null) {
      this.subsets = new ArrayList<>();
    }
    this.subsets.add(subsetsItem);
    return this;
  }

  /**
   * The set of all endpoints is the union of all subsets. Addresses are placed into subsets
   * according to the IPs they share. A single address with multiple ports, some of which are ready
   * and some of which are not (because they come from different containers) will result in the
   * address being displayed in different subsets for the different ports. No address will appear in
   * both Addresses and NotReadyAddresses in the same subset. Sets of addresses and ports that
   * comprise a service.
   *
   * @return subsets
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "The set of all endpoints is the union of all subsets. Addresses are placed into subsets according to the IPs they share. A single address with multiple ports, some of which are ready and some of which are not (because they come from different containers) will result in the address being displayed in different subsets for the different ports. No address will appear in both Addresses and NotReadyAddresses in the same subset. Sets of addresses and ports that comprise a service.")
  public List<V1EndpointSubset> getSubsets() {
    return subsets;
  }

  public void setSubsets(List<V1EndpointSubset> subsets) {
    this.subsets = subsets;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1Endpoints v1Endpoints = (V1Endpoints) o;
    return Objects.equals(this.apiVersion, v1Endpoints.apiVersion)
        && Objects.equals(this.kind, v1Endpoints.kind)
        && Objects.equals(this.metadata, v1Endpoints.metadata)
        && Objects.equals(this.subsets, v1Endpoints.subsets);
  }

  @Override
  public int hashCode() {
    return Objects.hash(apiVersion, kind, metadata, subsets);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1Endpoints {\n");
    sb.append("    apiVersion: ").append(toIndentedString(apiVersion)).append("\n");
    sb.append("    kind: ").append(toIndentedString(kind)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    subsets: ").append(toIndentedString(subsets)).append("\n");
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
