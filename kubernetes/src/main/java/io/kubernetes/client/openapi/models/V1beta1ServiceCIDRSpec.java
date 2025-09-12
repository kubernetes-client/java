/*
Copyright 2025 The Kubernetes Authors.
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

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * ServiceCIDRSpec define the CIDRs the user wants to use for allocating ClusterIPs for Services.
 */
@ApiModel(description = "ServiceCIDRSpec define the CIDRs the user wants to use for allocating ClusterIPs for Services.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-09-12T16:56:46.431280Z[Etc/UTC]")
public class V1beta1ServiceCIDRSpec {
  public static final String SERIALIZED_NAME_CIDRS = "cidrs";
  @SerializedName(SERIALIZED_NAME_CIDRS)
  private List<String> cidrs = null;


  public V1beta1ServiceCIDRSpec cidrs(List<String> cidrs) {

    this.cidrs = cidrs;
    return this;
  }

  public V1beta1ServiceCIDRSpec addCidrsItem(String cidrsItem) {
    if (this.cidrs == null) {
      this.cidrs = new ArrayList<>();
    }
    this.cidrs.add(cidrsItem);
    return this;
  }

   /**
   * CIDRs defines the IP blocks in CIDR notation (e.g. \&quot;192.168.0.0/24\&quot; or \&quot;2001:db8::/64\&quot;) from which to assign service cluster IPs. Max of two CIDRs is allowed, one of each IP family. This field is immutable.
   * @return cidrs
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "CIDRs defines the IP blocks in CIDR notation (e.g. \"192.168.0.0/24\" or \"2001:db8::/64\") from which to assign service cluster IPs. Max of two CIDRs is allowed, one of each IP family. This field is immutable.")

  public List<String> getCidrs() {
    return cidrs;
  }


  public void setCidrs(List<String> cidrs) {
    this.cidrs = cidrs;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1beta1ServiceCIDRSpec v1beta1ServiceCIDRSpec = (V1beta1ServiceCIDRSpec) o;
    return Objects.equals(this.cidrs, v1beta1ServiceCIDRSpec.cidrs);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cidrs);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1beta1ServiceCIDRSpec {\n");
    sb.append("    cidrs: ").append(toIndentedString(cidrs)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}
