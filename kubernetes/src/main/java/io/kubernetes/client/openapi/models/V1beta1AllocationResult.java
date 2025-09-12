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
import io.kubernetes.client.openapi.models.V1NodeSelector;
import io.kubernetes.client.openapi.models.V1beta1DeviceAllocationResult;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.time.OffsetDateTime;

/**
 * AllocationResult contains attributes of an allocated resource.
 */
@ApiModel(description = "AllocationResult contains attributes of an allocated resource.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-09-12T22:12:20.439480Z[Etc/UTC]")
public class V1beta1AllocationResult {
  public static final String SERIALIZED_NAME_ALLOCATION_TIMESTAMP = "allocationTimestamp";
  @SerializedName(SERIALIZED_NAME_ALLOCATION_TIMESTAMP)
  private OffsetDateTime allocationTimestamp;

  public static final String SERIALIZED_NAME_DEVICES = "devices";
  @SerializedName(SERIALIZED_NAME_DEVICES)
  private V1beta1DeviceAllocationResult devices;

  public static final String SERIALIZED_NAME_NODE_SELECTOR = "nodeSelector";
  @SerializedName(SERIALIZED_NAME_NODE_SELECTOR)
  private V1NodeSelector nodeSelector;


  public V1beta1AllocationResult allocationTimestamp(OffsetDateTime allocationTimestamp) {

    this.allocationTimestamp = allocationTimestamp;
    return this;
  }

   /**
   * AllocationTimestamp stores the time when the resources were allocated. This field is not guaranteed to be set, in which case that time is unknown.  This is an alpha field and requires enabling the DRADeviceBindingConditions and DRAResourceClaimDeviceStatus feature gate.
   * @return allocationTimestamp
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "AllocationTimestamp stores the time when the resources were allocated. This field is not guaranteed to be set, in which case that time is unknown.  This is an alpha field and requires enabling the DRADeviceBindingConditions and DRAResourceClaimDeviceStatus feature gate.")

  public OffsetDateTime getAllocationTimestamp() {
    return allocationTimestamp;
  }


  public void setAllocationTimestamp(OffsetDateTime allocationTimestamp) {
    this.allocationTimestamp = allocationTimestamp;
  }


  public V1beta1AllocationResult devices(V1beta1DeviceAllocationResult devices) {

    this.devices = devices;
    return this;
  }

   /**
   * Get devices
   * @return devices
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public V1beta1DeviceAllocationResult getDevices() {
    return devices;
  }


  public void setDevices(V1beta1DeviceAllocationResult devices) {
    this.devices = devices;
  }


  public V1beta1AllocationResult nodeSelector(V1NodeSelector nodeSelector) {

    this.nodeSelector = nodeSelector;
    return this;
  }

   /**
   * Get nodeSelector
   * @return nodeSelector
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public V1NodeSelector getNodeSelector() {
    return nodeSelector;
  }


  public void setNodeSelector(V1NodeSelector nodeSelector) {
    this.nodeSelector = nodeSelector;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1beta1AllocationResult v1beta1AllocationResult = (V1beta1AllocationResult) o;
    return Objects.equals(this.allocationTimestamp, v1beta1AllocationResult.allocationTimestamp) &&
        Objects.equals(this.devices, v1beta1AllocationResult.devices) &&
        Objects.equals(this.nodeSelector, v1beta1AllocationResult.nodeSelector);
  }

  @Override
  public int hashCode() {
    return Objects.hash(allocationTimestamp, devices, nodeSelector);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1beta1AllocationResult {\n");
    sb.append("    allocationTimestamp: ").append(toIndentedString(allocationTimestamp)).append("\n");
    sb.append("    devices: ").append(toIndentedString(devices)).append("\n");
    sb.append("    nodeSelector: ").append(toIndentedString(nodeSelector)).append("\n");
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
