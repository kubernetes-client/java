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
import io.kubernetes.client.custom.Quantity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/** ResourceRequirements describes the compute resource requirements. */
@ApiModel(description = "ResourceRequirements describes the compute resource requirements.")
@javax.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    date = "2022-12-05T08:14:34.919Z[Etc/UTC]")
public class V1ResourceRequirements {
  public static final String SERIALIZED_NAME_LIMITS = "limits";

  @SerializedName(SERIALIZED_NAME_LIMITS)
  private Map<String, Quantity> limits = null;

  public static final String SERIALIZED_NAME_REQUESTS = "requests";

  @SerializedName(SERIALIZED_NAME_REQUESTS)
  private Map<String, Quantity> requests = null;

  public V1ResourceRequirements limits(Map<String, Quantity> limits) {

    this.limits = limits;
    return this;
  }

  public V1ResourceRequirements putLimitsItem(String key, Quantity limitsItem) {
    if (this.limits == null) {
      this.limits = new HashMap<>();
    }
    this.limits.put(key, limitsItem);
    return this;
  }

  /**
   * Limits describes the maximum amount of compute resources allowed. More info:
   * https://kubernetes.io/docs/concepts/configuration/manage-resources-containers/
   *
   * @return limits
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "Limits describes the maximum amount of compute resources allowed. More info: https://kubernetes.io/docs/concepts/configuration/manage-resources-containers/")
  public Map<String, Quantity> getLimits() {
    return limits;
  }

  public void setLimits(Map<String, Quantity> limits) {
    this.limits = limits;
  }

  public V1ResourceRequirements requests(Map<String, Quantity> requests) {

    this.requests = requests;
    return this;
  }

  public V1ResourceRequirements putRequestsItem(String key, Quantity requestsItem) {
    if (this.requests == null) {
      this.requests = new HashMap<>();
    }
    this.requests.put(key, requestsItem);
    return this;
  }

  /**
   * Requests describes the minimum amount of compute resources required. If Requests is omitted for
   * a container, it defaults to Limits if that is explicitly specified, otherwise to an
   * implementation-defined value. More info:
   * https://kubernetes.io/docs/concepts/configuration/manage-resources-containers/
   *
   * @return requests
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "Requests describes the minimum amount of compute resources required. If Requests is omitted for a container, it defaults to Limits if that is explicitly specified, otherwise to an implementation-defined value. More info: https://kubernetes.io/docs/concepts/configuration/manage-resources-containers/")
  public Map<String, Quantity> getRequests() {
    return requests;
  }

  public void setRequests(Map<String, Quantity> requests) {
    this.requests = requests;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1ResourceRequirements v1ResourceRequirements = (V1ResourceRequirements) o;
    return Objects.equals(this.limits, v1ResourceRequirements.limits)
        && Objects.equals(this.requests, v1ResourceRequirements.requests);
  }

  @Override
  public int hashCode() {
    return Objects.hash(limits, requests);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1ResourceRequirements {\n");
    sb.append("    limits: ").append(toIndentedString(limits)).append("\n");
    sb.append("    requests: ").append(toIndentedString(requests)).append("\n");
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
