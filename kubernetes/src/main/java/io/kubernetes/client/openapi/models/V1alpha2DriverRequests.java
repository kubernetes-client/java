/*
Copyright 2024 The Kubernetes Authors.
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
import io.kubernetes.client.openapi.models.V1alpha2ResourceRequest;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * DriverRequests describes all resources that are needed from one particular driver.
 */
@ApiModel(description = "DriverRequests describes all resources that are needed from one particular driver.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-23T13:45:08.546919Z[Etc/UTC]")
public class V1alpha2DriverRequests {
  public static final String SERIALIZED_NAME_DRIVER_NAME = "driverName";
  @SerializedName(SERIALIZED_NAME_DRIVER_NAME)
  private String driverName;

  public static final String SERIALIZED_NAME_REQUESTS = "requests";
  @SerializedName(SERIALIZED_NAME_REQUESTS)
  private List<V1alpha2ResourceRequest> requests = null;

  public static final String SERIALIZED_NAME_VENDOR_PARAMETERS = "vendorParameters";
  @SerializedName(SERIALIZED_NAME_VENDOR_PARAMETERS)
  private Object vendorParameters;


  public V1alpha2DriverRequests driverName(String driverName) {

    this.driverName = driverName;
    return this;
  }

   /**
   * DriverName is the name used by the DRA driver kubelet plugin.
   * @return driverName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "DriverName is the name used by the DRA driver kubelet plugin.")

  public String getDriverName() {
    return driverName;
  }


  public void setDriverName(String driverName) {
    this.driverName = driverName;
  }


  public V1alpha2DriverRequests requests(List<V1alpha2ResourceRequest> requests) {

    this.requests = requests;
    return this;
  }

  public V1alpha2DriverRequests addRequestsItem(V1alpha2ResourceRequest requestsItem) {
    if (this.requests == null) {
      this.requests = new ArrayList<>();
    }
    this.requests.add(requestsItem);
    return this;
  }

   /**
   * Requests describes all resources that are needed from the driver.
   * @return requests
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Requests describes all resources that are needed from the driver.")

  public List<V1alpha2ResourceRequest> getRequests() {
    return requests;
  }


  public void setRequests(List<V1alpha2ResourceRequest> requests) {
    this.requests = requests;
  }


  public V1alpha2DriverRequests vendorParameters(Object vendorParameters) {

    this.vendorParameters = vendorParameters;
    return this;
  }

   /**
   * VendorParameters are arbitrary setup parameters for all requests of the claim. They are ignored while allocating the claim.
   * @return vendorParameters
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "VendorParameters are arbitrary setup parameters for all requests of the claim. They are ignored while allocating the claim.")

  public Object getVendorParameters() {
    return vendorParameters;
  }


  public void setVendorParameters(Object vendorParameters) {
    this.vendorParameters = vendorParameters;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1alpha2DriverRequests v1alpha2DriverRequests = (V1alpha2DriverRequests) o;
    return Objects.equals(this.driverName, v1alpha2DriverRequests.driverName) &&
        Objects.equals(this.requests, v1alpha2DriverRequests.requests) &&
        Objects.equals(this.vendorParameters, v1alpha2DriverRequests.vendorParameters);
  }

  @Override
  public int hashCode() {
    return Objects.hash(driverName, requests, vendorParameters);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1alpha2DriverRequests {\n");
    sb.append("    driverName: ").append(toIndentedString(driverName)).append("\n");
    sb.append("    requests: ").append(toIndentedString(requests)).append("\n");
    sb.append("    vendorParameters: ").append(toIndentedString(vendorParameters)).append("\n");
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
