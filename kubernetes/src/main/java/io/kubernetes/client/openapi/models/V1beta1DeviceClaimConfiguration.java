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
import io.kubernetes.client.openapi.models.V1beta1OpaqueDeviceConfiguration;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * DeviceClaimConfiguration is used for configuration parameters in DeviceClaim.
 */
@ApiModel(description = "DeviceClaimConfiguration is used for configuration parameters in DeviceClaim.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-09-12T22:12:20.439480Z[Etc/UTC]")
public class V1beta1DeviceClaimConfiguration {
  public static final String SERIALIZED_NAME_OPAQUE = "opaque";
  @SerializedName(SERIALIZED_NAME_OPAQUE)
  private V1beta1OpaqueDeviceConfiguration opaque;

  public static final String SERIALIZED_NAME_REQUESTS = "requests";
  @SerializedName(SERIALIZED_NAME_REQUESTS)
  private List<String> requests = null;


  public V1beta1DeviceClaimConfiguration opaque(V1beta1OpaqueDeviceConfiguration opaque) {

    this.opaque = opaque;
    return this;
  }

   /**
   * Get opaque
   * @return opaque
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public V1beta1OpaqueDeviceConfiguration getOpaque() {
    return opaque;
  }


  public void setOpaque(V1beta1OpaqueDeviceConfiguration opaque) {
    this.opaque = opaque;
  }


  public V1beta1DeviceClaimConfiguration requests(List<String> requests) {

    this.requests = requests;
    return this;
  }

  public V1beta1DeviceClaimConfiguration addRequestsItem(String requestsItem) {
    if (this.requests == null) {
      this.requests = new ArrayList<>();
    }
    this.requests.add(requestsItem);
    return this;
  }

   /**
   * Requests lists the names of requests where the configuration applies. If empty, it applies to all requests.  References to subrequests must include the name of the main request and may include the subrequest using the format &lt;main request&gt;[/&lt;subrequest&gt;]. If just the main request is given, the configuration applies to all subrequests.
   * @return requests
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Requests lists the names of requests where the configuration applies. If empty, it applies to all requests.  References to subrequests must include the name of the main request and may include the subrequest using the format <main request>[/<subrequest>]. If just the main request is given, the configuration applies to all subrequests.")

  public List<String> getRequests() {
    return requests;
  }


  public void setRequests(List<String> requests) {
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
    V1beta1DeviceClaimConfiguration v1beta1DeviceClaimConfiguration = (V1beta1DeviceClaimConfiguration) o;
    return Objects.equals(this.opaque, v1beta1DeviceClaimConfiguration.opaque) &&
        Objects.equals(this.requests, v1beta1DeviceClaimConfiguration.requests);
  }

  @Override
  public int hashCode() {
    return Objects.hash(opaque, requests);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1beta1DeviceClaimConfiguration {\n");
    sb.append("    opaque: ").append(toIndentedString(opaque)).append("\n");
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
