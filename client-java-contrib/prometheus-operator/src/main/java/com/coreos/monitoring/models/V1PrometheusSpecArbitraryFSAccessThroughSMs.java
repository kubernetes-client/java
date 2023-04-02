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
package com.coreos.monitoring.models;

import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;

/**
 * ArbitraryFSAccessThroughSMs configures whether configuration based on a service monitor can
 * access arbitrary files on the file system of the Prometheus container e.g. bearer token files.
 */
@ApiModel(
    description =
        "ArbitraryFSAccessThroughSMs configures whether configuration based on a service monitor can access arbitrary files on the file system of the Prometheus container e.g. bearer token files.")
@javax.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    date = "2020-08-31T19:41:55.826Z[Etc/UTC]")
public class V1PrometheusSpecArbitraryFSAccessThroughSMs {
  public static final String SERIALIZED_NAME_DENY = "deny";

  @SerializedName(SERIALIZED_NAME_DENY)
  private Boolean deny;

  public V1PrometheusSpecArbitraryFSAccessThroughSMs deny(Boolean deny) {

    this.deny = deny;
    return this;
  }

  /**
   * Get deny
   *
   * @return deny
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  public Boolean getDeny() {
    return deny;
  }

  public void setDeny(Boolean deny) {
    this.deny = deny;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1PrometheusSpecArbitraryFSAccessThroughSMs v1PrometheusSpecArbitraryFSAccessThroughSMs =
        (V1PrometheusSpecArbitraryFSAccessThroughSMs) o;
    return Objects.equals(this.deny, v1PrometheusSpecArbitraryFSAccessThroughSMs.deny);
  }

  @Override
  public int hashCode() {
    return Objects.hash(deny);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1PrometheusSpecArbitraryFSAccessThroughSMs {\n");
    sb.append("    deny: ").append(toIndentedString(deny)).append("\n");
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
