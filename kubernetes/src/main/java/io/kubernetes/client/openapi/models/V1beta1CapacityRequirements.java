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
 * CapacityRequirements defines the capacity requirements for a specific device request.
 */
@ApiModel(description = "CapacityRequirements defines the capacity requirements for a specific device request.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-09-12T22:12:20.439480Z[Etc/UTC]")
public class V1beta1CapacityRequirements {
  public static final String SERIALIZED_NAME_REQUESTS = "requests";
  @SerializedName(SERIALIZED_NAME_REQUESTS)
  private Map<String, Quantity> requests = null;


  public V1beta1CapacityRequirements requests(Map<String, Quantity> requests) {

    this.requests = requests;
    return this;
  }

  public V1beta1CapacityRequirements putRequestsItem(String key, Quantity requestsItem) {
    if (this.requests == null) {
      this.requests = new HashMap<>();
    }
    this.requests.put(key, requestsItem);
    return this;
  }

   /**
   * Requests represent individual device resource requests for distinct resources, all of which must be provided by the device.  This value is used as an additional filtering condition against the available capacity on the device. This is semantically equivalent to a CEL selector with &#x60;device.capacity[&lt;domain&gt;].&lt;name&gt;.compareTo(quantity(&lt;request quantity&gt;)) &gt;&#x3D; 0&#x60;. For example, device.capacity[&#39;test-driver.cdi.k8s.io&#39;].counters.compareTo(quantity(&#39;2&#39;)) &gt;&#x3D; 0.  When a requestPolicy is defined, the requested amount is adjusted upward to the nearest valid value based on the policy. If the requested amount cannot be adjusted to a valid value—because it exceeds what the requestPolicy allows— the device is considered ineligible for allocation.  For any capacity that is not explicitly requested: - If no requestPolicy is set, the default consumed capacity is equal to the full device capacity   (i.e., the whole device is claimed). - If a requestPolicy is set, the default consumed capacity is determined according to that policy.  If the device allows multiple allocation, the aggregated amount across all requests must not exceed the capacity value. The consumed capacity, which may be adjusted based on the requestPolicy if defined, is recorded in the resource claim’s status.devices[*].consumedCapacity field.
   * @return requests
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Requests represent individual device resource requests for distinct resources, all of which must be provided by the device.  This value is used as an additional filtering condition against the available capacity on the device. This is semantically equivalent to a CEL selector with `device.capacity[<domain>].<name>.compareTo(quantity(<request quantity>)) >= 0`. For example, device.capacity['test-driver.cdi.k8s.io'].counters.compareTo(quantity('2')) >= 0.  When a requestPolicy is defined, the requested amount is adjusted upward to the nearest valid value based on the policy. If the requested amount cannot be adjusted to a valid value—because it exceeds what the requestPolicy allows— the device is considered ineligible for allocation.  For any capacity that is not explicitly requested: - If no requestPolicy is set, the default consumed capacity is equal to the full device capacity   (i.e., the whole device is claimed). - If a requestPolicy is set, the default consumed capacity is determined according to that policy.  If the device allows multiple allocation, the aggregated amount across all requests must not exceed the capacity value. The consumed capacity, which may be adjusted based on the requestPolicy if defined, is recorded in the resource claim’s status.devices[*].consumedCapacity field.")

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
    V1beta1CapacityRequirements v1beta1CapacityRequirements = (V1beta1CapacityRequirements) o;
    return Objects.equals(this.requests, v1beta1CapacityRequirements.requests);
  }

  @Override
  public int hashCode() {
    return Objects.hash(requests);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1beta1CapacityRequirements {\n");
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
