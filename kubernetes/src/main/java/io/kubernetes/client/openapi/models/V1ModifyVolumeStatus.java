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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * ModifyVolumeStatus represents the status object of ControllerModifyVolume operation
 */
@ApiModel(description = "ModifyVolumeStatus represents the status object of ControllerModifyVolume operation")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-02-07T19:21:52.410010Z[Etc/UTC]")
public class V1ModifyVolumeStatus {
  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private String status;

  public static final String SERIALIZED_NAME_TARGET_VOLUME_ATTRIBUTES_CLASS_NAME = "targetVolumeAttributesClassName";
  @SerializedName(SERIALIZED_NAME_TARGET_VOLUME_ATTRIBUTES_CLASS_NAME)
  private String targetVolumeAttributesClassName;


  public V1ModifyVolumeStatus status(String status) {

    this.status = status;
    return this;
  }

   /**
   * status is the status of the ControllerModifyVolume operation. It can be in any of following states:  - Pending    Pending indicates that the PersistentVolumeClaim cannot be modified due to unmet requirements, such as    the specified VolumeAttributesClass not existing.  - InProgress    InProgress indicates that the volume is being modified.  - Infeasible   Infeasible indicates that the request has been rejected as invalid by the CSI driver. To    resolve the error, a valid VolumeAttributesClass needs to be specified. Note: New statuses can be added in the future. Consumers should check for unknown statuses and fail appropriately.
   * @return status
  **/
  @ApiModelProperty(required = true, value = "status is the status of the ControllerModifyVolume operation. It can be in any of following states:  - Pending    Pending indicates that the PersistentVolumeClaim cannot be modified due to unmet requirements, such as    the specified VolumeAttributesClass not existing.  - InProgress    InProgress indicates that the volume is being modified.  - Infeasible   Infeasible indicates that the request has been rejected as invalid by the CSI driver. To    resolve the error, a valid VolumeAttributesClass needs to be specified. Note: New statuses can be added in the future. Consumers should check for unknown statuses and fail appropriately.")

  public String getStatus() {
    return status;
  }


  public void setStatus(String status) {
    this.status = status;
  }


  public V1ModifyVolumeStatus targetVolumeAttributesClassName(String targetVolumeAttributesClassName) {

    this.targetVolumeAttributesClassName = targetVolumeAttributesClassName;
    return this;
  }

   /**
   * targetVolumeAttributesClassName is the name of the VolumeAttributesClass the PVC currently being reconciled
   * @return targetVolumeAttributesClassName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "targetVolumeAttributesClassName is the name of the VolumeAttributesClass the PVC currently being reconciled")

  public String getTargetVolumeAttributesClassName() {
    return targetVolumeAttributesClassName;
  }


  public void setTargetVolumeAttributesClassName(String targetVolumeAttributesClassName) {
    this.targetVolumeAttributesClassName = targetVolumeAttributesClassName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1ModifyVolumeStatus v1ModifyVolumeStatus = (V1ModifyVolumeStatus) o;
    return Objects.equals(this.status, v1ModifyVolumeStatus.status) &&
        Objects.equals(this.targetVolumeAttributesClassName, v1ModifyVolumeStatus.targetVolumeAttributesClassName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(status, targetVolumeAttributesClassName);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1ModifyVolumeStatus {\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    targetVolumeAttributesClassName: ").append(toIndentedString(targetVolumeAttributesClassName)).append("\n");
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
