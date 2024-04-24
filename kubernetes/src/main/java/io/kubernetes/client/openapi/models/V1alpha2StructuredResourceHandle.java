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
import io.kubernetes.client.openapi.models.V1alpha2DriverAllocationResult;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * StructuredResourceHandle is the in-tree representation of the allocation result.
 */
@ApiModel(description = "StructuredResourceHandle is the in-tree representation of the allocation result.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-23T13:45:08.546919Z[Etc/UTC]")
public class V1alpha2StructuredResourceHandle {
  public static final String SERIALIZED_NAME_NODE_NAME = "nodeName";
  @SerializedName(SERIALIZED_NAME_NODE_NAME)
  private String nodeName;

  public static final String SERIALIZED_NAME_RESULTS = "results";
  @SerializedName(SERIALIZED_NAME_RESULTS)
  private List<V1alpha2DriverAllocationResult> results = new ArrayList<>();

  public static final String SERIALIZED_NAME_VENDOR_CLAIM_PARAMETERS = "vendorClaimParameters";
  @SerializedName(SERIALIZED_NAME_VENDOR_CLAIM_PARAMETERS)
  private Object vendorClaimParameters;

  public static final String SERIALIZED_NAME_VENDOR_CLASS_PARAMETERS = "vendorClassParameters";
  @SerializedName(SERIALIZED_NAME_VENDOR_CLASS_PARAMETERS)
  private Object vendorClassParameters;


  public V1alpha2StructuredResourceHandle nodeName(String nodeName) {

    this.nodeName = nodeName;
    return this;
  }

   /**
   * NodeName is the name of the node providing the necessary resources if the resources are local to a node.
   * @return nodeName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "NodeName is the name of the node providing the necessary resources if the resources are local to a node.")

  public String getNodeName() {
    return nodeName;
  }


  public void setNodeName(String nodeName) {
    this.nodeName = nodeName;
  }


  public V1alpha2StructuredResourceHandle results(List<V1alpha2DriverAllocationResult> results) {

    this.results = results;
    return this;
  }

  public V1alpha2StructuredResourceHandle addResultsItem(V1alpha2DriverAllocationResult resultsItem) {
    this.results.add(resultsItem);
    return this;
  }

   /**
   * Results lists all allocated driver resources.
   * @return results
  **/
  @ApiModelProperty(required = true, value = "Results lists all allocated driver resources.")

  public List<V1alpha2DriverAllocationResult> getResults() {
    return results;
  }


  public void setResults(List<V1alpha2DriverAllocationResult> results) {
    this.results = results;
  }


  public V1alpha2StructuredResourceHandle vendorClaimParameters(Object vendorClaimParameters) {

    this.vendorClaimParameters = vendorClaimParameters;
    return this;
  }

   /**
   * VendorClaimParameters are the per-claim configuration parameters from the resource claim parameters at the time that the claim was allocated.
   * @return vendorClaimParameters
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "VendorClaimParameters are the per-claim configuration parameters from the resource claim parameters at the time that the claim was allocated.")

  public Object getVendorClaimParameters() {
    return vendorClaimParameters;
  }


  public void setVendorClaimParameters(Object vendorClaimParameters) {
    this.vendorClaimParameters = vendorClaimParameters;
  }


  public V1alpha2StructuredResourceHandle vendorClassParameters(Object vendorClassParameters) {

    this.vendorClassParameters = vendorClassParameters;
    return this;
  }

   /**
   * VendorClassParameters are the per-claim configuration parameters from the resource class at the time that the claim was allocated.
   * @return vendorClassParameters
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "VendorClassParameters are the per-claim configuration parameters from the resource class at the time that the claim was allocated.")

  public Object getVendorClassParameters() {
    return vendorClassParameters;
  }


  public void setVendorClassParameters(Object vendorClassParameters) {
    this.vendorClassParameters = vendorClassParameters;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1alpha2StructuredResourceHandle v1alpha2StructuredResourceHandle = (V1alpha2StructuredResourceHandle) o;
    return Objects.equals(this.nodeName, v1alpha2StructuredResourceHandle.nodeName) &&
        Objects.equals(this.results, v1alpha2StructuredResourceHandle.results) &&
        Objects.equals(this.vendorClaimParameters, v1alpha2StructuredResourceHandle.vendorClaimParameters) &&
        Objects.equals(this.vendorClassParameters, v1alpha2StructuredResourceHandle.vendorClassParameters);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nodeName, results, vendorClaimParameters, vendorClassParameters);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1alpha2StructuredResourceHandle {\n");
    sb.append("    nodeName: ").append(toIndentedString(nodeName)).append("\n");
    sb.append("    results: ").append(toIndentedString(results)).append("\n");
    sb.append("    vendorClaimParameters: ").append(toIndentedString(vendorClaimParameters)).append("\n");
    sb.append("    vendorClassParameters: ").append(toIndentedString(vendorClassParameters)).append("\n");
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
