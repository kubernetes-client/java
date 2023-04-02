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
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/** Endpoint represents a single logical \&quot;backend\&quot; implementing a service. */
@ApiModel(description = "Endpoint represents a single logical \"backend\" implementing a service.")
@javax.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    date = "2022-12-05T08:14:34.919Z[Etc/UTC]")
public class V1Endpoint {
  public static final String SERIALIZED_NAME_ADDRESSES = "addresses";

  @SerializedName(SERIALIZED_NAME_ADDRESSES)
  private List<String> addresses = new ArrayList<>();

  public static final String SERIALIZED_NAME_CONDITIONS = "conditions";

  @SerializedName(SERIALIZED_NAME_CONDITIONS)
  private V1EndpointConditions conditions;

  public static final String SERIALIZED_NAME_DEPRECATED_TOPOLOGY = "deprecatedTopology";

  @SerializedName(SERIALIZED_NAME_DEPRECATED_TOPOLOGY)
  private Map<String, String> deprecatedTopology = null;

  public static final String SERIALIZED_NAME_HINTS = "hints";

  @SerializedName(SERIALIZED_NAME_HINTS)
  private V1EndpointHints hints;

  public static final String SERIALIZED_NAME_HOSTNAME = "hostname";

  @SerializedName(SERIALIZED_NAME_HOSTNAME)
  private String hostname;

  public static final String SERIALIZED_NAME_NODE_NAME = "nodeName";

  @SerializedName(SERIALIZED_NAME_NODE_NAME)
  private String nodeName;

  public static final String SERIALIZED_NAME_TARGET_REF = "targetRef";

  @SerializedName(SERIALIZED_NAME_TARGET_REF)
  private V1ObjectReference targetRef;

  public static final String SERIALIZED_NAME_ZONE = "zone";

  @SerializedName(SERIALIZED_NAME_ZONE)
  private String zone;

  public V1Endpoint addresses(List<String> addresses) {

    this.addresses = addresses;
    return this;
  }

  public V1Endpoint addAddressesItem(String addressesItem) {
    this.addresses.add(addressesItem);
    return this;
  }

  /**
   * addresses of this endpoint. The contents of this field are interpreted according to the
   * corresponding EndpointSlice addressType field. Consumers must handle different types of
   * addresses in the context of their own capabilities. This must contain at least one address but
   * no more than 100. These are all assumed to be fungible and clients may choose to only use the
   * first element. Refer to: https://issue.k8s.io/106267
   *
   * @return addresses
   */
  @ApiModelProperty(
      required = true,
      value =
          "addresses of this endpoint. The contents of this field are interpreted according to the corresponding EndpointSlice addressType field. Consumers must handle different types of addresses in the context of their own capabilities. This must contain at least one address but no more than 100. These are all assumed to be fungible and clients may choose to only use the first element. Refer to: https://issue.k8s.io/106267")
  public List<String> getAddresses() {
    return addresses;
  }

  public void setAddresses(List<String> addresses) {
    this.addresses = addresses;
  }

  public V1Endpoint conditions(V1EndpointConditions conditions) {

    this.conditions = conditions;
    return this;
  }

  /**
   * Get conditions
   *
   * @return conditions
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  public V1EndpointConditions getConditions() {
    return conditions;
  }

  public void setConditions(V1EndpointConditions conditions) {
    this.conditions = conditions;
  }

  public V1Endpoint deprecatedTopology(Map<String, String> deprecatedTopology) {

    this.deprecatedTopology = deprecatedTopology;
    return this;
  }

  public V1Endpoint putDeprecatedTopologyItem(String key, String deprecatedTopologyItem) {
    if (this.deprecatedTopology == null) {
      this.deprecatedTopology = new HashMap<>();
    }
    this.deprecatedTopology.put(key, deprecatedTopologyItem);
    return this;
  }

  /**
   * deprecatedTopology contains topology information part of the v1beta1 API. This field is
   * deprecated, and will be removed when the v1beta1 API is removed (no sooner than kubernetes
   * v1.24). While this field can hold values, it is not writable through the v1 API, and any
   * attempts to write to it will be silently ignored. Topology information can be found in the zone
   * and nodeName fields instead.
   *
   * @return deprecatedTopology
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "deprecatedTopology contains topology information part of the v1beta1 API. This field is deprecated, and will be removed when the v1beta1 API is removed (no sooner than kubernetes v1.24).  While this field can hold values, it is not writable through the v1 API, and any attempts to write to it will be silently ignored. Topology information can be found in the zone and nodeName fields instead.")
  public Map<String, String> getDeprecatedTopology() {
    return deprecatedTopology;
  }

  public void setDeprecatedTopology(Map<String, String> deprecatedTopology) {
    this.deprecatedTopology = deprecatedTopology;
  }

  public V1Endpoint hints(V1EndpointHints hints) {

    this.hints = hints;
    return this;
  }

  /**
   * Get hints
   *
   * @return hints
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  public V1EndpointHints getHints() {
    return hints;
  }

  public void setHints(V1EndpointHints hints) {
    this.hints = hints;
  }

  public V1Endpoint hostname(String hostname) {

    this.hostname = hostname;
    return this;
  }

  /**
   * hostname of this endpoint. This field may be used by consumers of endpoints to distinguish
   * endpoints from each other (e.g. in DNS names). Multiple endpoints which use the same hostname
   * should be considered fungible (e.g. multiple A values in DNS). Must be lowercase and pass DNS
   * Label (RFC 1123) validation.
   *
   * @return hostname
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "hostname of this endpoint. This field may be used by consumers of endpoints to distinguish endpoints from each other (e.g. in DNS names). Multiple endpoints which use the same hostname should be considered fungible (e.g. multiple A values in DNS). Must be lowercase and pass DNS Label (RFC 1123) validation.")
  public String getHostname() {
    return hostname;
  }

  public void setHostname(String hostname) {
    this.hostname = hostname;
  }

  public V1Endpoint nodeName(String nodeName) {

    this.nodeName = nodeName;
    return this;
  }

  /**
   * nodeName represents the name of the Node hosting this endpoint. This can be used to determine
   * endpoints local to a Node.
   *
   * @return nodeName
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "nodeName represents the name of the Node hosting this endpoint. This can be used to determine endpoints local to a Node.")
  public String getNodeName() {
    return nodeName;
  }

  public void setNodeName(String nodeName) {
    this.nodeName = nodeName;
  }

  public V1Endpoint targetRef(V1ObjectReference targetRef) {

    this.targetRef = targetRef;
    return this;
  }

  /**
   * Get targetRef
   *
   * @return targetRef
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  public V1ObjectReference getTargetRef() {
    return targetRef;
  }

  public void setTargetRef(V1ObjectReference targetRef) {
    this.targetRef = targetRef;
  }

  public V1Endpoint zone(String zone) {

    this.zone = zone;
    return this;
  }

  /**
   * zone is the name of the Zone this endpoint exists in.
   *
   * @return zone
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "zone is the name of the Zone this endpoint exists in.")
  public String getZone() {
    return zone;
  }

  public void setZone(String zone) {
    this.zone = zone;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1Endpoint v1Endpoint = (V1Endpoint) o;
    return Objects.equals(this.addresses, v1Endpoint.addresses)
        && Objects.equals(this.conditions, v1Endpoint.conditions)
        && Objects.equals(this.deprecatedTopology, v1Endpoint.deprecatedTopology)
        && Objects.equals(this.hints, v1Endpoint.hints)
        && Objects.equals(this.hostname, v1Endpoint.hostname)
        && Objects.equals(this.nodeName, v1Endpoint.nodeName)
        && Objects.equals(this.targetRef, v1Endpoint.targetRef)
        && Objects.equals(this.zone, v1Endpoint.zone);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        addresses, conditions, deprecatedTopology, hints, hostname, nodeName, targetRef, zone);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1Endpoint {\n");
    sb.append("    addresses: ").append(toIndentedString(addresses)).append("\n");
    sb.append("    conditions: ").append(toIndentedString(conditions)).append("\n");
    sb.append("    deprecatedTopology: ").append(toIndentedString(deprecatedTopology)).append("\n");
    sb.append("    hints: ").append(toIndentedString(hints)).append("\n");
    sb.append("    hostname: ").append(toIndentedString(hostname)).append("\n");
    sb.append("    nodeName: ").append(toIndentedString(nodeName)).append("\n");
    sb.append("    targetRef: ").append(toIndentedString(targetRef)).append("\n");
    sb.append("    zone: ").append(toIndentedString(zone)).append("\n");
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
