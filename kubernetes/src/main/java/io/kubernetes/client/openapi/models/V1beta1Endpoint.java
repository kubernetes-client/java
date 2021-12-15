/*
Copyright 2021 The Kubernetes Authors.
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
    date = "2021-12-10T19:11:23.904Z[Etc/UTC]")
public class V1beta1Endpoint {
  public static final String SERIALIZED_NAME_ADDRESSES = "addresses";

  @SerializedName(SERIALIZED_NAME_ADDRESSES)
  private List<String> addresses = new ArrayList<>();

  public static final String SERIALIZED_NAME_CONDITIONS = "conditions";

  @SerializedName(SERIALIZED_NAME_CONDITIONS)
  private V1beta1EndpointConditions conditions;

  public static final String SERIALIZED_NAME_HINTS = "hints";

  @SerializedName(SERIALIZED_NAME_HINTS)
  private V1beta1EndpointHints hints;

  public static final String SERIALIZED_NAME_HOSTNAME = "hostname";

  @SerializedName(SERIALIZED_NAME_HOSTNAME)
  private String hostname;

  public static final String SERIALIZED_NAME_NODE_NAME = "nodeName";

  @SerializedName(SERIALIZED_NAME_NODE_NAME)
  private String nodeName;

  public static final String SERIALIZED_NAME_TARGET_REF = "targetRef";

  @SerializedName(SERIALIZED_NAME_TARGET_REF)
  private V1ObjectReference targetRef;

  public static final String SERIALIZED_NAME_TOPOLOGY = "topology";

  @SerializedName(SERIALIZED_NAME_TOPOLOGY)
  private Map<String, String> topology = null;

  public V1beta1Endpoint addresses(List<String> addresses) {

    this.addresses = addresses;
    return this;
  }

  public V1beta1Endpoint addAddressesItem(String addressesItem) {
    this.addresses.add(addressesItem);
    return this;
  }

  /**
   * addresses of this endpoint. The contents of this field are interpreted according to the
   * corresponding EndpointSlice addressType field. Consumers must handle different types of
   * addresses in the context of their own capabilities. This must contain at least one address but
   * no more than 100.
   *
   * @return addresses
   */
  @ApiModelProperty(
      required = true,
      value =
          "addresses of this endpoint. The contents of this field are interpreted according to the corresponding EndpointSlice addressType field. Consumers must handle different types of addresses in the context of their own capabilities. This must contain at least one address but no more than 100.")
  public List<String> getAddresses() {
    return addresses;
  }

  public void setAddresses(List<String> addresses) {
    this.addresses = addresses;
  }

  public V1beta1Endpoint conditions(V1beta1EndpointConditions conditions) {

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
  public V1beta1EndpointConditions getConditions() {
    return conditions;
  }

  public void setConditions(V1beta1EndpointConditions conditions) {
    this.conditions = conditions;
  }

  public V1beta1Endpoint hints(V1beta1EndpointHints hints) {

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
  public V1beta1EndpointHints getHints() {
    return hints;
  }

  public void setHints(V1beta1EndpointHints hints) {
    this.hints = hints;
  }

  public V1beta1Endpoint hostname(String hostname) {

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

  public V1beta1Endpoint nodeName(String nodeName) {

    this.nodeName = nodeName;
    return this;
  }

  /**
   * nodeName represents the name of the Node hosting this endpoint. This can be used to determine
   * endpoints local to a Node. This field can be enabled with the EndpointSliceNodeName feature
   * gate.
   *
   * @return nodeName
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "nodeName represents the name of the Node hosting this endpoint. This can be used to determine endpoints local to a Node. This field can be enabled with the EndpointSliceNodeName feature gate.")
  public String getNodeName() {
    return nodeName;
  }

  public void setNodeName(String nodeName) {
    this.nodeName = nodeName;
  }

  public V1beta1Endpoint targetRef(V1ObjectReference targetRef) {

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

  public V1beta1Endpoint topology(Map<String, String> topology) {

    this.topology = topology;
    return this;
  }

  public V1beta1Endpoint putTopologyItem(String key, String topologyItem) {
    if (this.topology == null) {
      this.topology = new HashMap<>();
    }
    this.topology.put(key, topologyItem);
    return this;
  }

  /**
   * topology contains arbitrary topology information associated with the endpoint. These key/value
   * pairs must conform with the label format.
   * https://kubernetes.io/docs/concepts/overview/working-with-objects/labels Topology may include a
   * maximum of 16 key/value pairs. This includes, but is not limited to the following well known
   * keys: * kubernetes.io/hostname: the value indicates the hostname of the node where the endpoint
   * is located. This should match the corresponding node label. * topology.kubernetes.io/zone: the
   * value indicates the zone where the endpoint is located. This should match the corresponding
   * node label. * topology.kubernetes.io/region: the value indicates the region where the endpoint
   * is located. This should match the corresponding node label. This field is deprecated and will
   * be removed in future api versions.
   *
   * @return topology
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "topology contains arbitrary topology information associated with the endpoint. These key/value pairs must conform with the label format. https://kubernetes.io/docs/concepts/overview/working-with-objects/labels Topology may include a maximum of 16 key/value pairs. This includes, but is not limited to the following well known keys: * kubernetes.io/hostname: the value indicates the hostname of the node   where the endpoint is located. This should match the corresponding   node label. * topology.kubernetes.io/zone: the value indicates the zone where the   endpoint is located. This should match the corresponding node label. * topology.kubernetes.io/region: the value indicates the region where the   endpoint is located. This should match the corresponding node label. This field is deprecated and will be removed in future api versions.")
  public Map<String, String> getTopology() {
    return topology;
  }

  public void setTopology(Map<String, String> topology) {
    this.topology = topology;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1beta1Endpoint v1beta1Endpoint = (V1beta1Endpoint) o;
    return Objects.equals(this.addresses, v1beta1Endpoint.addresses)
        && Objects.equals(this.conditions, v1beta1Endpoint.conditions)
        && Objects.equals(this.hints, v1beta1Endpoint.hints)
        && Objects.equals(this.hostname, v1beta1Endpoint.hostname)
        && Objects.equals(this.nodeName, v1beta1Endpoint.nodeName)
        && Objects.equals(this.targetRef, v1beta1Endpoint.targetRef)
        && Objects.equals(this.topology, v1beta1Endpoint.topology);
  }

  @Override
  public int hashCode() {
    return Objects.hash(addresses, conditions, hints, hostname, nodeName, targetRef, topology);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1beta1Endpoint {\n");
    sb.append("    addresses: ").append(toIndentedString(addresses)).append("\n");
    sb.append("    conditions: ").append(toIndentedString(conditions)).append("\n");
    sb.append("    hints: ").append(toIndentedString(hints)).append("\n");
    sb.append("    hostname: ").append(toIndentedString(hostname)).append("\n");
    sb.append("    nodeName: ").append(toIndentedString(nodeName)).append("\n");
    sb.append("    targetRef: ").append(toIndentedString(targetRef)).append("\n");
    sb.append("    topology: ").append(toIndentedString(topology)).append("\n");
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
