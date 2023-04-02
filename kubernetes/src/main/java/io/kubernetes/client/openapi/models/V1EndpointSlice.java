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
 * EndpointSlice represents a subset of the endpoints that implement a service. For a given service
 * there may be multiple EndpointSlice objects, selected by labels, which must be joined to produce
 * the full set of endpoints.
 */
@ApiModel(
    description =
        "EndpointSlice represents a subset of the endpoints that implement a service. For a given service there may be multiple EndpointSlice objects, selected by labels, which must be joined to produce the full set of endpoints.")
@javax.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    date = "2022-12-05T08:14:34.919Z[Etc/UTC]")
public class V1EndpointSlice implements io.kubernetes.client.common.KubernetesObject {
  public static final String SERIALIZED_NAME_ADDRESS_TYPE = "addressType";

  @SerializedName(SERIALIZED_NAME_ADDRESS_TYPE)
  private String addressType;

  public static final String SERIALIZED_NAME_API_VERSION = "apiVersion";

  @SerializedName(SERIALIZED_NAME_API_VERSION)
  private String apiVersion;

  public static final String SERIALIZED_NAME_ENDPOINTS = "endpoints";

  @SerializedName(SERIALIZED_NAME_ENDPOINTS)
  private List<V1Endpoint> endpoints = new ArrayList<>();

  public static final String SERIALIZED_NAME_KIND = "kind";

  @SerializedName(SERIALIZED_NAME_KIND)
  private String kind;

  public static final String SERIALIZED_NAME_METADATA = "metadata";

  @SerializedName(SERIALIZED_NAME_METADATA)
  private V1ObjectMeta metadata;

  public static final String SERIALIZED_NAME_PORTS = "ports";

  @SerializedName(SERIALIZED_NAME_PORTS)
  private List<DiscoveryV1EndpointPort> ports = null;

  public V1EndpointSlice addressType(String addressType) {

    this.addressType = addressType;
    return this;
  }

  /**
   * addressType specifies the type of address carried by this EndpointSlice. All addresses in this
   * slice must be the same type. This field is immutable after creation. The following address
   * types are currently supported: * IPv4: Represents an IPv4 Address. * IPv6: Represents an IPv6
   * Address. * FQDN: Represents a Fully Qualified Domain Name.
   *
   * @return addressType
   */
  @ApiModelProperty(
      required = true,
      value =
          "addressType specifies the type of address carried by this EndpointSlice. All addresses in this slice must be the same type. This field is immutable after creation. The following address types are currently supported: * IPv4: Represents an IPv4 Address. * IPv6: Represents an IPv6 Address. * FQDN: Represents a Fully Qualified Domain Name.  ")
  public String getAddressType() {
    return addressType;
  }

  public void setAddressType(String addressType) {
    this.addressType = addressType;
  }

  public V1EndpointSlice apiVersion(String apiVersion) {

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

  public V1EndpointSlice endpoints(List<V1Endpoint> endpoints) {

    this.endpoints = endpoints;
    return this;
  }

  public V1EndpointSlice addEndpointsItem(V1Endpoint endpointsItem) {
    this.endpoints.add(endpointsItem);
    return this;
  }

  /**
   * endpoints is a list of unique endpoints in this slice. Each slice may include a maximum of 1000
   * endpoints.
   *
   * @return endpoints
   */
  @ApiModelProperty(
      required = true,
      value =
          "endpoints is a list of unique endpoints in this slice. Each slice may include a maximum of 1000 endpoints.")
  public List<V1Endpoint> getEndpoints() {
    return endpoints;
  }

  public void setEndpoints(List<V1Endpoint> endpoints) {
    this.endpoints = endpoints;
  }

  public V1EndpointSlice kind(String kind) {

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

  public V1EndpointSlice metadata(V1ObjectMeta metadata) {

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

  public V1EndpointSlice ports(List<DiscoveryV1EndpointPort> ports) {

    this.ports = ports;
    return this;
  }

  public V1EndpointSlice addPortsItem(DiscoveryV1EndpointPort portsItem) {
    if (this.ports == null) {
      this.ports = new ArrayList<>();
    }
    this.ports.add(portsItem);
    return this;
  }

  /**
   * ports specifies the list of network ports exposed by each endpoint in this slice. Each port
   * must have a unique name. When ports is empty, it indicates that there are no defined ports.
   * When a port is defined with a nil port value, it indicates \&quot;all ports\&quot;. Each slice
   * may include a maximum of 100 ports.
   *
   * @return ports
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "ports specifies the list of network ports exposed by each endpoint in this slice. Each port must have a unique name. When ports is empty, it indicates that there are no defined ports. When a port is defined with a nil port value, it indicates \"all ports\". Each slice may include a maximum of 100 ports.")
  public List<DiscoveryV1EndpointPort> getPorts() {
    return ports;
  }

  public void setPorts(List<DiscoveryV1EndpointPort> ports) {
    this.ports = ports;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1EndpointSlice v1EndpointSlice = (V1EndpointSlice) o;
    return Objects.equals(this.addressType, v1EndpointSlice.addressType)
        && Objects.equals(this.apiVersion, v1EndpointSlice.apiVersion)
        && Objects.equals(this.endpoints, v1EndpointSlice.endpoints)
        && Objects.equals(this.kind, v1EndpointSlice.kind)
        && Objects.equals(this.metadata, v1EndpointSlice.metadata)
        && Objects.equals(this.ports, v1EndpointSlice.ports);
  }

  @Override
  public int hashCode() {
    return Objects.hash(addressType, apiVersion, endpoints, kind, metadata, ports);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1EndpointSlice {\n");
    sb.append("    addressType: ").append(toIndentedString(addressType)).append("\n");
    sb.append("    apiVersion: ").append(toIndentedString(apiVersion)).append("\n");
    sb.append("    endpoints: ").append(toIndentedString(endpoints)).append("\n");
    sb.append("    kind: ").append(toIndentedString(kind)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    ports: ").append(toIndentedString(ports)).append("\n");
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
