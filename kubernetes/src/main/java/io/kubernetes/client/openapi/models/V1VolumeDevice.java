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
 * volumeDevice describes a mapping of a raw block device within a container.
 */
@ApiModel(description = "volumeDevice describes a mapping of a raw block device within a container.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-09-12T23:11:52.603861Z[Etc/UTC]")
public class V1VolumeDevice {
  public static final String SERIALIZED_NAME_DEVICE_PATH = "devicePath";
  @SerializedName(SERIALIZED_NAME_DEVICE_PATH)
  private String devicePath;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;


  public V1VolumeDevice devicePath(String devicePath) {

    this.devicePath = devicePath;
    return this;
  }

   /**
   * devicePath is the path inside of the container that the device will be mapped to.
   * @return devicePath
  **/
  @ApiModelProperty(required = true, value = "devicePath is the path inside of the container that the device will be mapped to.")

  public String getDevicePath() {
    return devicePath;
  }


  public void setDevicePath(String devicePath) {
    this.devicePath = devicePath;
  }


  public V1VolumeDevice name(String name) {

    this.name = name;
    return this;
  }

   /**
   * name must match the name of a persistentVolumeClaim in the pod
   * @return name
  **/
  @ApiModelProperty(required = true, value = "name must match the name of a persistentVolumeClaim in the pod")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1VolumeDevice v1VolumeDevice = (V1VolumeDevice) o;
    return Objects.equals(this.devicePath, v1VolumeDevice.devicePath) &&
        Objects.equals(this.name, v1VolumeDevice.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(devicePath, name);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1VolumeDevice {\n");
    sb.append("    devicePath: ").append(toIndentedString(devicePath)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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
