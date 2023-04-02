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

/** NodeSpec describes the attributes that a node is created with. */
@ApiModel(description = "NodeSpec describes the attributes that a node is created with.")
@javax.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    date = "2022-12-05T08:14:34.919Z[Etc/UTC]")
public class V1NodeSpec {
  public static final String SERIALIZED_NAME_CONFIG_SOURCE = "configSource";

  @SerializedName(SERIALIZED_NAME_CONFIG_SOURCE)
  private V1NodeConfigSource configSource;

  public static final String SERIALIZED_NAME_EXTERNAL_I_D = "externalID";

  @SerializedName(SERIALIZED_NAME_EXTERNAL_I_D)
  private String externalID;

  public static final String SERIALIZED_NAME_POD_C_I_D_R = "podCIDR";

  @SerializedName(SERIALIZED_NAME_POD_C_I_D_R)
  private String podCIDR;

  public static final String SERIALIZED_NAME_POD_C_I_D_RS = "podCIDRs";

  @SerializedName(SERIALIZED_NAME_POD_C_I_D_RS)
  private List<String> podCIDRs = null;

  public static final String SERIALIZED_NAME_PROVIDER_I_D = "providerID";

  @SerializedName(SERIALIZED_NAME_PROVIDER_I_D)
  private String providerID;

  public static final String SERIALIZED_NAME_TAINTS = "taints";

  @SerializedName(SERIALIZED_NAME_TAINTS)
  private List<V1Taint> taints = null;

  public static final String SERIALIZED_NAME_UNSCHEDULABLE = "unschedulable";

  @SerializedName(SERIALIZED_NAME_UNSCHEDULABLE)
  private Boolean unschedulable;

  public V1NodeSpec configSource(V1NodeConfigSource configSource) {

    this.configSource = configSource;
    return this;
  }

  /**
   * Get configSource
   *
   * @return configSource
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  public V1NodeConfigSource getConfigSource() {
    return configSource;
  }

  public void setConfigSource(V1NodeConfigSource configSource) {
    this.configSource = configSource;
  }

  public V1NodeSpec externalID(String externalID) {

    this.externalID = externalID;
    return this;
  }

  /**
   * Deprecated. Not all kubelets will set this field. Remove field after 1.13. see:
   * https://issues.k8s.io/61966
   *
   * @return externalID
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "Deprecated. Not all kubelets will set this field. Remove field after 1.13. see: https://issues.k8s.io/61966")
  public String getExternalID() {
    return externalID;
  }

  public void setExternalID(String externalID) {
    this.externalID = externalID;
  }

  public V1NodeSpec podCIDR(String podCIDR) {

    this.podCIDR = podCIDR;
    return this;
  }

  /**
   * PodCIDR represents the pod IP range assigned to the node.
   *
   * @return podCIDR
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "PodCIDR represents the pod IP range assigned to the node.")
  public String getPodCIDR() {
    return podCIDR;
  }

  public void setPodCIDR(String podCIDR) {
    this.podCIDR = podCIDR;
  }

  public V1NodeSpec podCIDRs(List<String> podCIDRs) {

    this.podCIDRs = podCIDRs;
    return this;
  }

  public V1NodeSpec addPodCIDRsItem(String podCIDRsItem) {
    if (this.podCIDRs == null) {
      this.podCIDRs = new ArrayList<>();
    }
    this.podCIDRs.add(podCIDRsItem);
    return this;
  }

  /**
   * podCIDRs represents the IP ranges assigned to the node for usage by Pods on that node. If this
   * field is specified, the 0th entry must match the podCIDR field. It may contain at most 1 value
   * for each of IPv4 and IPv6.
   *
   * @return podCIDRs
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "podCIDRs represents the IP ranges assigned to the node for usage by Pods on that node. If this field is specified, the 0th entry must match the podCIDR field. It may contain at most 1 value for each of IPv4 and IPv6.")
  public List<String> getPodCIDRs() {
    return podCIDRs;
  }

  public void setPodCIDRs(List<String> podCIDRs) {
    this.podCIDRs = podCIDRs;
  }

  public V1NodeSpec providerID(String providerID) {

    this.providerID = providerID;
    return this;
  }

  /**
   * ID of the node assigned by the cloud provider in the format:
   * &lt;ProviderName&gt;://&lt;ProviderSpecificNodeID&gt;
   *
   * @return providerID
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "ID of the node assigned by the cloud provider in the format: <ProviderName>://<ProviderSpecificNodeID>")
  public String getProviderID() {
    return providerID;
  }

  public void setProviderID(String providerID) {
    this.providerID = providerID;
  }

  public V1NodeSpec taints(List<V1Taint> taints) {

    this.taints = taints;
    return this;
  }

  public V1NodeSpec addTaintsItem(V1Taint taintsItem) {
    if (this.taints == null) {
      this.taints = new ArrayList<>();
    }
    this.taints.add(taintsItem);
    return this;
  }

  /**
   * If specified, the node&#39;s taints.
   *
   * @return taints
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "If specified, the node's taints.")
  public List<V1Taint> getTaints() {
    return taints;
  }

  public void setTaints(List<V1Taint> taints) {
    this.taints = taints;
  }

  public V1NodeSpec unschedulable(Boolean unschedulable) {

    this.unschedulable = unschedulable;
    return this;
  }

  /**
   * Unschedulable controls node schedulability of new pods. By default, node is schedulable. More
   * info: https://kubernetes.io/docs/concepts/nodes/node/#manual-node-administration
   *
   * @return unschedulable
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "Unschedulable controls node schedulability of new pods. By default, node is schedulable. More info: https://kubernetes.io/docs/concepts/nodes/node/#manual-node-administration")
  public Boolean getUnschedulable() {
    return unschedulable;
  }

  public void setUnschedulable(Boolean unschedulable) {
    this.unschedulable = unschedulable;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1NodeSpec v1NodeSpec = (V1NodeSpec) o;
    return Objects.equals(this.configSource, v1NodeSpec.configSource)
        && Objects.equals(this.externalID, v1NodeSpec.externalID)
        && Objects.equals(this.podCIDR, v1NodeSpec.podCIDR)
        && Objects.equals(this.podCIDRs, v1NodeSpec.podCIDRs)
        && Objects.equals(this.providerID, v1NodeSpec.providerID)
        && Objects.equals(this.taints, v1NodeSpec.taints)
        && Objects.equals(this.unschedulable, v1NodeSpec.unschedulable);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        configSource, externalID, podCIDR, podCIDRs, providerID, taints, unschedulable);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1NodeSpec {\n");
    sb.append("    configSource: ").append(toIndentedString(configSource)).append("\n");
    sb.append("    externalID: ").append(toIndentedString(externalID)).append("\n");
    sb.append("    podCIDR: ").append(toIndentedString(podCIDR)).append("\n");
    sb.append("    podCIDRs: ").append(toIndentedString(podCIDRs)).append("\n");
    sb.append("    providerID: ").append(toIndentedString(providerID)).append("\n");
    sb.append("    taints: ").append(toIndentedString(taints)).append("\n");
    sb.append("    unschedulable: ").append(toIndentedString(unschedulable)).append("\n");
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
