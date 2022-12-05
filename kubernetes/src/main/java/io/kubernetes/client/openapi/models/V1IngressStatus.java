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
import java.util.Objects;

/** IngressStatus describe the current state of the Ingress. */
@ApiModel(description = "IngressStatus describe the current state of the Ingress.")
@javax.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    date = "2022-12-05T08:14:34.919Z[Etc/UTC]")
public class V1IngressStatus {
  public static final String SERIALIZED_NAME_LOAD_BALANCER = "loadBalancer";

  @SerializedName(SERIALIZED_NAME_LOAD_BALANCER)
  private V1LoadBalancerStatus loadBalancer;

  public V1IngressStatus loadBalancer(V1LoadBalancerStatus loadBalancer) {

    this.loadBalancer = loadBalancer;
    return this;
  }

  /**
   * Get loadBalancer
   *
   * @return loadBalancer
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  public V1LoadBalancerStatus getLoadBalancer() {
    return loadBalancer;
  }

  public void setLoadBalancer(V1LoadBalancerStatus loadBalancer) {
    this.loadBalancer = loadBalancer;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1IngressStatus v1IngressStatus = (V1IngressStatus) o;
    return Objects.equals(this.loadBalancer, v1IngressStatus.loadBalancer);
  }

  @Override
  public int hashCode() {
    return Objects.hash(loadBalancer);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1IngressStatus {\n");
    sb.append("    loadBalancer: ").append(toIndentedString(loadBalancer)).append("\n");
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
