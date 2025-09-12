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
import io.kubernetes.client.custom.Quantity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * VolumeResourceRequirements describes the storage resource requirements for a volume.
 */
@ApiModel(description = "VolumeResourceRequirements describes the storage resource requirements for a volume.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-09-12T22:12:20.439480Z[Etc/UTC]")
public class V1VolumeResourceRequirements {
  public static final String SERIALIZED_NAME_LIMITS = "limits";
  @SerializedName(SERIALIZED_NAME_LIMITS)
  private Map<String, Quantity> limits = null;

  public static final String SERIALIZED_NAME_REQUESTS = "requests";
  @SerializedName(SERIALIZED_NAME_REQUESTS)
  private Map<String, Quantity> requests = null;


  public V1VolumeResourceRequirements limits(Map<String, Quantity> limits) {

    this.limits = limits;
    return this;
  }

  public V1VolumeResourceRequirements putLimitsItem(String key, Quantity limitsItem) {
    if (this.limits == null) {
      this.limits = new HashMap<>();
    }
    this.limits.put(key, limitsItem);
    return this;
  }

   /**
   * Limits describes the maximum amount of compute resources allowed. More info: https://kubernetes.io/docs/concepts/configuration/manage-resources-containers/
   * @return limits
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Limits describes the maximum amount of compute resources allowed. More info: https://kubernetes.io/docs/concepts/configuration/manage-resources-containers/")

  public Map<String, Quantity> getLimits() {
    return limits;
  }


  public void setLimits(Map<String, Quantity> limits) {
    this.limits = limits;
  }


  public V1VolumeResourceRequirements requests(Map<String, Quantity> requests) {

    this.requests = requests;
    return this;
  }

  public V1VolumeResourceRequirements putRequestsItem(String key, Quantity requestsItem) {
    if (this.requests == null) {
      this.requests = new HashMap<>();
    }
    this.requests.put(key, requestsItem);
    return this;
  }

   /**
   * Requests describes the minimum amount of compute resources required. If Requests is omitted for a container, it defaults to Limits if that is explicitly specified, otherwise to an implementation-defined value. Requests cannot exceed Limits. More info: https://kubernetes.io/docs/concepts/configuration/manage-resources-containers/
   * @return requests
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Requests describes the minimum amount of compute resources required. If Requests is omitted for a container, it defaults to Limits if that is explicitly specified, otherwise to an implementation-defined value. Requests cannot exceed Limits. More info: https://kubernetes.io/docs/concepts/configuration/manage-resources-containers/")

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
    V1VolumeResourceRequirements v1VolumeResourceRequirements = (V1VolumeResourceRequirements) o;
    return Objects.equals(this.limits, v1VolumeResourceRequirements.limits) &&
        Objects.equals(this.requests, v1VolumeResourceRequirements.requests);
  }

  @Override
  public int hashCode() {
    return Objects.hash(limits, requests);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1VolumeResourceRequirements {\n");
    sb.append("    limits: ").append(toIndentedString(limits)).append("\n");
    sb.append("    requests: ").append(toIndentedString(requests)).append("\n");
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
