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
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/** Define resources requests and limits for single Pods. */
@ApiModel(description = "Define resources requests and limits for single Pods.")
@javax.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    date = "2020-08-31T19:41:55.826Z[Etc/UTC]")
public class V1AlertmanagerSpecResources {
  public static final String SERIALIZED_NAME_LIMITS = "limits";

  @SerializedName(SERIALIZED_NAME_LIMITS)
  private Map<String, String> limits = null;

  public static final String SERIALIZED_NAME_REQUESTS = "requests";

  @SerializedName(SERIALIZED_NAME_REQUESTS)
  private Map<String, String> requests = null;

  public V1AlertmanagerSpecResources limits(Map<String, String> limits) {

    this.limits = limits;
    return this;
  }

  public V1AlertmanagerSpecResources putLimitsItem(String key, String limitsItem) {
    if (this.limits == null) {
      this.limits = new HashMap<String, String>();
    }
    this.limits.put(key, limitsItem);
    return this;
  }

  /**
   * Limits describes the maximum amount of compute resources allowed. More info:
   * https://kubernetes.io/docs/concepts/configuration/manage-compute-resources-container/
   *
   * @return limits
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "Limits describes the maximum amount of compute resources allowed. More info: https://kubernetes.io/docs/concepts/configuration/manage-compute-resources-container/")
  public Map<String, String> getLimits() {
    return limits;
  }

  public void setLimits(Map<String, String> limits) {
    this.limits = limits;
  }

  public V1AlertmanagerSpecResources requests(Map<String, String> requests) {

    this.requests = requests;
    return this;
  }

  public V1AlertmanagerSpecResources putRequestsItem(String key, String requestsItem) {
    if (this.requests == null) {
      this.requests = new HashMap<String, String>();
    }
    this.requests.put(key, requestsItem);
    return this;
  }

  /**
   * Requests describes the minimum amount of compute resources required. If Requests is omitted for
   * a container, it defaults to Limits if that is explicitly specified, otherwise to an
   * implementation-defined value. More info:
   * https://kubernetes.io/docs/concepts/configuration/manage-compute-resources-container/
   *
   * @return requests
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "Requests describes the minimum amount of compute resources required. If Requests is omitted for a container, it defaults to Limits if that is explicitly specified, otherwise to an implementation-defined value. More info: https://kubernetes.io/docs/concepts/configuration/manage-compute-resources-container/")
  public Map<String, String> getRequests() {
    return requests;
  }

  public void setRequests(Map<String, String> requests) {
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
    V1AlertmanagerSpecResources v1AlertmanagerSpecResources = (V1AlertmanagerSpecResources) o;
    return Objects.equals(this.limits, v1AlertmanagerSpecResources.limits)
        && Objects.equals(this.requests, v1AlertmanagerSpecResources.requests);
  }

  @Override
  public int hashCode() {
    return Objects.hash(limits, requests);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1AlertmanagerSpecResources {\n");
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
