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
 * NetworkPolicyEgressRule describes a particular set of traffic that is allowed out of pods matched
 * by a NetworkPolicySpec&#39;s podSelector. The traffic must match both ports and to. This type is
 * beta-level in 1.8
 */
@ApiModel(
    description =
        "NetworkPolicyEgressRule describes a particular set of traffic that is allowed out of pods matched by a NetworkPolicySpec's podSelector. The traffic must match both ports and to. This type is beta-level in 1.8")
@javax.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    date = "2022-12-05T08:14:34.919Z[Etc/UTC]")
public class V1NetworkPolicyEgressRule {
  public static final String SERIALIZED_NAME_PORTS = "ports";

  @SerializedName(SERIALIZED_NAME_PORTS)
  private List<V1NetworkPolicyPort> ports = null;

  public static final String SERIALIZED_NAME_TO = "to";

  @SerializedName(SERIALIZED_NAME_TO)
  private List<V1NetworkPolicyPeer> to = null;

  public V1NetworkPolicyEgressRule ports(List<V1NetworkPolicyPort> ports) {

    this.ports = ports;
    return this;
  }

  public V1NetworkPolicyEgressRule addPortsItem(V1NetworkPolicyPort portsItem) {
    if (this.ports == null) {
      this.ports = new ArrayList<>();
    }
    this.ports.add(portsItem);
    return this;
  }

  /**
   * List of destination ports for outgoing traffic. Each item in this list is combined using a
   * logical OR. If this field is empty or missing, this rule matches all ports (traffic not
   * restricted by port). If this field is present and contains at least one item, then this rule
   * allows traffic only if the traffic matches at least one port in the list.
   *
   * @return ports
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "List of destination ports for outgoing traffic. Each item in this list is combined using a logical OR. If this field is empty or missing, this rule matches all ports (traffic not restricted by port). If this field is present and contains at least one item, then this rule allows traffic only if the traffic matches at least one port in the list.")
  public List<V1NetworkPolicyPort> getPorts() {
    return ports;
  }

  public void setPorts(List<V1NetworkPolicyPort> ports) {
    this.ports = ports;
  }

  public V1NetworkPolicyEgressRule to(List<V1NetworkPolicyPeer> to) {

    this.to = to;
    return this;
  }

  public V1NetworkPolicyEgressRule addToItem(V1NetworkPolicyPeer toItem) {
    if (this.to == null) {
      this.to = new ArrayList<>();
    }
    this.to.add(toItem);
    return this;
  }

  /**
   * List of destinations for outgoing traffic of pods selected for this rule. Items in this list
   * are combined using a logical OR operation. If this field is empty or missing, this rule matches
   * all destinations (traffic not restricted by destination). If this field is present and contains
   * at least one item, this rule allows traffic only if the traffic matches at least one item in
   * the to list.
   *
   * @return to
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "List of destinations for outgoing traffic of pods selected for this rule. Items in this list are combined using a logical OR operation. If this field is empty or missing, this rule matches all destinations (traffic not restricted by destination). If this field is present and contains at least one item, this rule allows traffic only if the traffic matches at least one item in the to list.")
  public List<V1NetworkPolicyPeer> getTo() {
    return to;
  }

  public void setTo(List<V1NetworkPolicyPeer> to) {
    this.to = to;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1NetworkPolicyEgressRule v1NetworkPolicyEgressRule = (V1NetworkPolicyEgressRule) o;
    return Objects.equals(this.ports, v1NetworkPolicyEgressRule.ports)
        && Objects.equals(this.to, v1NetworkPolicyEgressRule.to);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ports, to);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1NetworkPolicyEgressRule {\n");
    sb.append("    ports: ").append(toIndentedString(ports)).append("\n");
    sb.append("    to: ").append(toIndentedString(to)).append("\n");
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
