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
import io.kubernetes.client.openapi.models.V1alpha2NamedResourcesAllocationResult;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * DriverAllocationResult contains vendor parameters and the allocation result for one request.
 */
@ApiModel(description = "DriverAllocationResult contains vendor parameters and the allocation result for one request.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-23T13:45:08.546919Z[Etc/UTC]")
public class V1alpha2DriverAllocationResult {
  public static final String SERIALIZED_NAME_NAMED_RESOURCES = "namedResources";
  @SerializedName(SERIALIZED_NAME_NAMED_RESOURCES)
  private V1alpha2NamedResourcesAllocationResult namedResources;

  public static final String SERIALIZED_NAME_VENDOR_REQUEST_PARAMETERS = "vendorRequestParameters";
  @SerializedName(SERIALIZED_NAME_VENDOR_REQUEST_PARAMETERS)
  private Object vendorRequestParameters;


  public V1alpha2DriverAllocationResult namedResources(V1alpha2NamedResourcesAllocationResult namedResources) {

    this.namedResources = namedResources;
    return this;
  }

   /**
   * Get namedResources
   * @return namedResources
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public V1alpha2NamedResourcesAllocationResult getNamedResources() {
    return namedResources;
  }


  public void setNamedResources(V1alpha2NamedResourcesAllocationResult namedResources) {
    this.namedResources = namedResources;
  }


  public V1alpha2DriverAllocationResult vendorRequestParameters(Object vendorRequestParameters) {

    this.vendorRequestParameters = vendorRequestParameters;
    return this;
  }

   /**
   * VendorRequestParameters are the per-request configuration parameters from the time that the claim was allocated.
   * @return vendorRequestParameters
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "VendorRequestParameters are the per-request configuration parameters from the time that the claim was allocated.")

  public Object getVendorRequestParameters() {
    return vendorRequestParameters;
  }


  public void setVendorRequestParameters(Object vendorRequestParameters) {
    this.vendorRequestParameters = vendorRequestParameters;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1alpha2DriverAllocationResult v1alpha2DriverAllocationResult = (V1alpha2DriverAllocationResult) o;
    return Objects.equals(this.namedResources, v1alpha2DriverAllocationResult.namedResources) &&
        Objects.equals(this.vendorRequestParameters, v1alpha2DriverAllocationResult.vendorRequestParameters);
  }

  @Override
  public int hashCode() {
    return Objects.hash(namedResources, vendorRequestParameters);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1alpha2DriverAllocationResult {\n");
    sb.append("    namedResources: ").append(toIndentedString(namedResources)).append("\n");
    sb.append("    vendorRequestParameters: ").append(toIndentedString(vendorRequestParameters)).append("\n");
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
