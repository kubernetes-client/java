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

/** LoadBalancerStatus represents the status of a load-balancer. */
@ApiModel(description = "LoadBalancerStatus represents the status of a load-balancer.")
@javax.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    date = "2022-12-05T08:14:34.919Z[Etc/UTC]")
public class V1LoadBalancerStatus {
  public static final String SERIALIZED_NAME_INGRESS = "ingress";

  @SerializedName(SERIALIZED_NAME_INGRESS)
  private List<V1LoadBalancerIngress> ingress = null;

  public V1LoadBalancerStatus ingress(List<V1LoadBalancerIngress> ingress) {

    this.ingress = ingress;
    return this;
  }

  public V1LoadBalancerStatus addIngressItem(V1LoadBalancerIngress ingressItem) {
    if (this.ingress == null) {
      this.ingress = new ArrayList<>();
    }
    this.ingress.add(ingressItem);
    return this;
  }

  /**
   * Ingress is a list containing ingress points for the load-balancer. Traffic intended for the
   * service should be sent to these ingress points.
   *
   * @return ingress
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "Ingress is a list containing ingress points for the load-balancer. Traffic intended for the service should be sent to these ingress points.")
  public List<V1LoadBalancerIngress> getIngress() {
    return ingress;
  }

  public void setIngress(List<V1LoadBalancerIngress> ingress) {
    this.ingress = ingress;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1LoadBalancerStatus v1LoadBalancerStatus = (V1LoadBalancerStatus) o;
    return Objects.equals(this.ingress, v1LoadBalancerStatus.ingress);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ingress);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1LoadBalancerStatus {\n");
    sb.append("    ingress: ").append(toIndentedString(ingress)).append("\n");
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
