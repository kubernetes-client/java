/*
Copyright 2023 The Kubernetes Authors.
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
import io.kubernetes.client.openapi.models.V1alpha2AllocationResult;
import io.kubernetes.client.openapi.models.V1alpha2ResourceClaimConsumerReference;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * ResourceClaimStatus tracks whether the resource has been allocated and what the resulting attributes are.
 */
@ApiModel(description = "ResourceClaimStatus tracks whether the resource has been allocated and what the resulting attributes are.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-12-01T19:05:21.333462Z[Etc/UTC]")
public class V1alpha2ResourceClaimStatus {
  public static final String SERIALIZED_NAME_ALLOCATION = "allocation";
  @SerializedName(SERIALIZED_NAME_ALLOCATION)
  private V1alpha2AllocationResult allocation;

  public static final String SERIALIZED_NAME_DEALLOCATION_REQUESTED = "deallocationRequested";
  @SerializedName(SERIALIZED_NAME_DEALLOCATION_REQUESTED)
  private Boolean deallocationRequested;

  public static final String SERIALIZED_NAME_DRIVER_NAME = "driverName";
  @SerializedName(SERIALIZED_NAME_DRIVER_NAME)
  private String driverName;

  public static final String SERIALIZED_NAME_RESERVED_FOR = "reservedFor";
  @SerializedName(SERIALIZED_NAME_RESERVED_FOR)
  private List<V1alpha2ResourceClaimConsumerReference> reservedFor = null;


  public V1alpha2ResourceClaimStatus allocation(V1alpha2AllocationResult allocation) {

    this.allocation = allocation;
    return this;
  }

   /**
   * Get allocation
   * @return allocation
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public V1alpha2AllocationResult getAllocation() {
    return allocation;
  }


  public void setAllocation(V1alpha2AllocationResult allocation) {
    this.allocation = allocation;
  }


  public V1alpha2ResourceClaimStatus deallocationRequested(Boolean deallocationRequested) {

    this.deallocationRequested = deallocationRequested;
    return this;
  }

   /**
   * DeallocationRequested indicates that a ResourceClaim is to be deallocated.  The driver then must deallocate this claim and reset the field together with clearing the Allocation field.  While DeallocationRequested is set, no new consumers may be added to ReservedFor.
   * @return deallocationRequested
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "DeallocationRequested indicates that a ResourceClaim is to be deallocated.  The driver then must deallocate this claim and reset the field together with clearing the Allocation field.  While DeallocationRequested is set, no new consumers may be added to ReservedFor.")

  public Boolean getDeallocationRequested() {
    return deallocationRequested;
  }


  public void setDeallocationRequested(Boolean deallocationRequested) {
    this.deallocationRequested = deallocationRequested;
  }


  public V1alpha2ResourceClaimStatus driverName(String driverName) {

    this.driverName = driverName;
    return this;
  }

   /**
   * DriverName is a copy of the driver name from the ResourceClass at the time when allocation started.
   * @return driverName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "DriverName is a copy of the driver name from the ResourceClass at the time when allocation started.")

  public String getDriverName() {
    return driverName;
  }


  public void setDriverName(String driverName) {
    this.driverName = driverName;
  }


  public V1alpha2ResourceClaimStatus reservedFor(List<V1alpha2ResourceClaimConsumerReference> reservedFor) {

    this.reservedFor = reservedFor;
    return this;
  }

  public V1alpha2ResourceClaimStatus addReservedForItem(V1alpha2ResourceClaimConsumerReference reservedForItem) {
    if (this.reservedFor == null) {
      this.reservedFor = new ArrayList<>();
    }
    this.reservedFor.add(reservedForItem);
    return this;
  }

   /**
   * ReservedFor indicates which entities are currently allowed to use the claim. A Pod which references a ResourceClaim which is not reserved for that Pod will not be started.  There can be at most 32 such reservations. This may get increased in the future, but not reduced.
   * @return reservedFor
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "ReservedFor indicates which entities are currently allowed to use the claim. A Pod which references a ResourceClaim which is not reserved for that Pod will not be started.  There can be at most 32 such reservations. This may get increased in the future, but not reduced.")

  public List<V1alpha2ResourceClaimConsumerReference> getReservedFor() {
    return reservedFor;
  }


  public void setReservedFor(List<V1alpha2ResourceClaimConsumerReference> reservedFor) {
    this.reservedFor = reservedFor;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1alpha2ResourceClaimStatus v1alpha2ResourceClaimStatus = (V1alpha2ResourceClaimStatus) o;
    return Objects.equals(this.allocation, v1alpha2ResourceClaimStatus.allocation) &&
        Objects.equals(this.deallocationRequested, v1alpha2ResourceClaimStatus.deallocationRequested) &&
        Objects.equals(this.driverName, v1alpha2ResourceClaimStatus.driverName) &&
        Objects.equals(this.reservedFor, v1alpha2ResourceClaimStatus.reservedFor);
  }

  @Override
  public int hashCode() {
    return Objects.hash(allocation, deallocationRequested, driverName, reservedFor);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1alpha2ResourceClaimStatus {\n");
    sb.append("    allocation: ").append(toIndentedString(allocation)).append("\n");
    sb.append("    deallocationRequested: ").append(toIndentedString(deallocationRequested)).append("\n");
    sb.append("    driverName: ").append(toIndentedString(driverName)).append("\n");
    sb.append("    reservedFor: ").append(toIndentedString(reservedFor)).append("\n");
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
