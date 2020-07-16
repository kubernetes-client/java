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
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * DEPRECATED 1.9 - This group version of NetworkPolicyIngressRule is deprecated by
 * networking/v1/NetworkPolicyIngressRule. This NetworkPolicyIngressRule matches traffic if and only
 * if the traffic matches both ports AND from.
 */
@ApiModel(
    description =
        "DEPRECATED 1.9 - This group version of NetworkPolicyIngressRule is deprecated by networking/v1/NetworkPolicyIngressRule. This NetworkPolicyIngressRule matches traffic if and only if the traffic matches both ports AND from.")
@javax.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    date = "2020-06-19T10:47:33.387Z[Etc/UTC]")
public class V1beta1NetworkPolicyIngressRule {
  public static final String SERIALIZED_NAME_FROM = "from";

  @SerializedName(SERIALIZED_NAME_FROM)
  private List<V1beta1NetworkPolicyPeer> from = null;

  public static final String SERIALIZED_NAME_PORTS = "ports";

  @SerializedName(SERIALIZED_NAME_PORTS)
  private List<V1beta1NetworkPolicyPort> ports = null;

  public V1beta1NetworkPolicyIngressRule from(List<V1beta1NetworkPolicyPeer> from) {

    this.from = from;
    return this;
  }

  public V1beta1NetworkPolicyIngressRule addFromItem(V1beta1NetworkPolicyPeer fromItem) {
    if (this.from == null) {
      this.from = new ArrayList<V1beta1NetworkPolicyPeer>();
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
  public List<V1beta1NetworkPolicyPeer> getFrom() {
    return from;
  }

  public void setFrom(List<V1beta1NetworkPolicyPeer> from) {
    this.from = from;
  }

  public V1beta1NetworkPolicyIngressRule ports(List<V1beta1NetworkPolicyPort> ports) {

    this.ports = ports;
    return this;
  }

  public V1beta1NetworkPolicyIngressRule addPortsItem(V1beta1NetworkPolicyPort portsItem) {
    if (this.ports == null) {
      this.ports = new ArrayList<V1beta1NetworkPolicyPort>();
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
  public List<V1beta1NetworkPolicyPort> getPorts() {
    return ports;
  }

  public void setPorts(List<V1beta1NetworkPolicyPort> ports) {
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
    V1beta1NetworkPolicyIngressRule v1beta1NetworkPolicyIngressRule =
        (V1beta1NetworkPolicyIngressRule) o;
    return Objects.equals(this.from, v1beta1NetworkPolicyIngressRule.from)
        && Objects.equals(this.ports, v1beta1NetworkPolicyIngressRule.ports);
  }

  @Override
  public int hashCode() {
    return Objects.hash(from, ports);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1beta1NetworkPolicyIngressRule {\n");
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
