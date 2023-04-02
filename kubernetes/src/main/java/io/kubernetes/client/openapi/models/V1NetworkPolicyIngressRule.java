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
 * NetworkPolicyIngressRule describes a particular set of traffic that is allowed to the pods
 * matched by a NetworkPolicySpec&#39;s podSelector. The traffic must match both ports and from.
 */
@ApiModel(
    description =
        "NetworkPolicyIngressRule describes a particular set of traffic that is allowed to the pods matched by a NetworkPolicySpec's podSelector. The traffic must match both ports and from.")
@javax.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    date = "2022-12-05T08:14:34.919Z[Etc/UTC]")
public class V1NetworkPolicyIngressRule {
  public static final String SERIALIZED_NAME_FROM = "from";

  @SerializedName(SERIALIZED_NAME_FROM)
  private List<V1NetworkPolicyPeer> from = null;

  public static final String SERIALIZED_NAME_PORTS = "ports";

  @SerializedName(SERIALIZED_NAME_PORTS)
  private List<V1NetworkPolicyPort> ports = null;

  public V1NetworkPolicyIngressRule from(List<V1NetworkPolicyPeer> from) {

    this.from = from;
    return this;
  }

  public V1NetworkPolicyIngressRule addFromItem(V1NetworkPolicyPeer fromItem) {
    if (this.from == null) {
      this.from = new ArrayList<>();
    }
    this.from.add(fromItem);
    return this;
  }

  /**
   * List of sources which should be able to access the pods selected for this rule. Items in this
   * list are combined using a logical OR operation. If this field is empty or missing, this rule
   * matches all sources (traffic not restricted by source). If this field is present and contains
   * at least one item, this rule allows traffic only if the traffic matches at least one item in
   * the from list.
   *
   * @return from
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "List of sources which should be able to access the pods selected for this rule. Items in this list are combined using a logical OR operation. If this field is empty or missing, this rule matches all sources (traffic not restricted by source). If this field is present and contains at least one item, this rule allows traffic only if the traffic matches at least one item in the from list.")
  public List<V1NetworkPolicyPeer> getFrom() {
    return from;
  }

  public void setFrom(List<V1NetworkPolicyPeer> from) {
    this.from = from;
  }

  public V1NetworkPolicyIngressRule ports(List<V1NetworkPolicyPort> ports) {

    this.ports = ports;
    return this;
  }

  public V1NetworkPolicyIngressRule addPortsItem(V1NetworkPolicyPort portsItem) {
    if (this.ports == null) {
      this.ports = new ArrayList<>();
    }
    this.ports.add(portsItem);
    return this;
  }

  /**
   * List of ports which should be made accessible on the pods selected for this rule. Each item in
   * this list is combined using a logical OR. If this field is empty or missing, this rule matches
   * all ports (traffic not restricted by port). If this field is present and contains at least one
   * item, then this rule allows traffic only if the traffic matches at least one port in the list.
   *
   * @return ports
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "List of ports which should be made accessible on the pods selected for this rule. Each item in this list is combined using a logical OR. If this field is empty or missing, this rule matches all ports (traffic not restricted by port). If this field is present and contains at least one item, then this rule allows traffic only if the traffic matches at least one port in the list.")
  public List<V1NetworkPolicyPort> getPorts() {
    return ports;
  }

  public void setPorts(List<V1NetworkPolicyPort> ports) {
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
    V1NetworkPolicyIngressRule v1NetworkPolicyIngressRule = (V1NetworkPolicyIngressRule) o;
    return Objects.equals(this.from, v1NetworkPolicyIngressRule.from)
        && Objects.equals(this.ports, v1NetworkPolicyIngressRule.ports);
  }

  @Override
  public int hashCode() {
    return Objects.hash(from, ports);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1NetworkPolicyIngressRule {\n");
    sb.append("    from: ").append(toIndentedString(from)).append("\n");
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
