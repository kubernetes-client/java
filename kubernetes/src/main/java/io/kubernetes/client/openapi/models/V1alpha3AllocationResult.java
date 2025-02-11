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
import io.kubernetes.client.openapi.models.V1alpha3DeviceAllocationResult;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * AllocationResult contains attributes of an allocated resource.
 */
@ApiModel(description = "AllocationResult contains attributes of an allocated resource.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-02-07T19:21:52.410010Z[Etc/UTC]")
public class V1alpha3AllocationResult {
  public static final String SERIALIZED_NAME_CONTROLLER = "controller";
  @SerializedName(SERIALIZED_NAME_CONTROLLER)
  private String controller;

  public static final String SERIALIZED_NAME_DEVICES = "devices";
  @SerializedName(SERIALIZED_NAME_DEVICES)
  private V1alpha3DeviceAllocationResult devices;

  public static final String SERIALIZED_NAME_NODE_SELECTOR = "nodeSelector";
  @SerializedName(SERIALIZED_NAME_NODE_SELECTOR)
  private V1NodeSelector nodeSelector;


  public V1alpha3AllocationResult controller(String controller) {

    this.controller = controller;
    return this;
  }

   /**
   * Controller is the name of the DRA driver which handled the allocation. That driver is also responsible for deallocating the claim. It is empty when the claim can be deallocated without involving a driver.  A driver may allocate devices provided by other drivers, so this driver name here can be different from the driver names listed for the results.  This is an alpha field and requires enabling the DRAControlPlaneController feature gate.
   * @return controller
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Controller is the name of the DRA driver which handled the allocation. That driver is also responsible for deallocating the claim. It is empty when the claim can be deallocated without involving a driver.  A driver may allocate devices provided by other drivers, so this driver name here can be different from the driver names listed for the results.  This is an alpha field and requires enabling the DRAControlPlaneController feature gate.")

  public String getController() {
    return controller;
  }


  public void setController(String controller) {
    this.controller = controller;
  }


  public V1alpha3AllocationResult devices(V1alpha3DeviceAllocationResult devices) {

    this.devices = devices;
    return this;
  }

   /**
   * Get devices
   * @return devices
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public V1alpha3DeviceAllocationResult getDevices() {
    return devices;
  }


  public void setDevices(V1alpha3DeviceAllocationResult devices) {
    this.devices = devices;
  }


  public V1alpha3AllocationResult nodeSelector(V1NodeSelector nodeSelector) {

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
    V1alpha3AllocationResult v1alpha3AllocationResult = (V1alpha3AllocationResult) o;
    return Objects.equals(this.controller, v1alpha3AllocationResult.controller) &&
        Objects.equals(this.devices, v1alpha3AllocationResult.devices) &&
        Objects.equals(this.nodeSelector, v1alpha3AllocationResult.nodeSelector);
  }

  @Override
  public int hashCode() {
    return Objects.hash(controller, devices, nodeSelector);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1alpha3AllocationResult {\n");
    sb.append("    controller: ").append(toIndentedString(controller)).append("\n");
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
