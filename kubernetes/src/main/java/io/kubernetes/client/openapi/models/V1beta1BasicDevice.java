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
import io.kubernetes.client.openapi.models.V1beta1DeviceAttribute;
import io.kubernetes.client.openapi.models.V1beta1DeviceCapacity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * BasicDevice defines one device instance.
 */
@ApiModel(description = "BasicDevice defines one device instance.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-02-12T23:08:31.638427Z[Etc/UTC]")
public class V1beta1BasicDevice {
  public static final String SERIALIZED_NAME_ATTRIBUTES = "attributes";
  @SerializedName(SERIALIZED_NAME_ATTRIBUTES)
  private Map<String, V1beta1DeviceAttribute> attributes = null;

  public static final String SERIALIZED_NAME_CAPACITY = "capacity";
  @SerializedName(SERIALIZED_NAME_CAPACITY)
  private Map<String, V1beta1DeviceCapacity> capacity = null;


  public V1beta1BasicDevice attributes(Map<String, V1beta1DeviceAttribute> attributes) {

    this.attributes = attributes;
    return this;
  }

  public V1beta1BasicDevice putAttributesItem(String key, V1beta1DeviceAttribute attributesItem) {
    if (this.attributes == null) {
      this.attributes = new HashMap<>();
    }
    this.attributes.put(key, attributesItem);
    return this;
  }

   /**
   * Attributes defines the set of attributes for this device. The name of each attribute must be unique in that set.  The maximum number of attributes and capacities combined is 32.
   * @return attributes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Attributes defines the set of attributes for this device. The name of each attribute must be unique in that set.  The maximum number of attributes and capacities combined is 32.")

  public Map<String, V1beta1DeviceAttribute> getAttributes() {
    return attributes;
  }


  public void setAttributes(Map<String, V1beta1DeviceAttribute> attributes) {
    this.attributes = attributes;
  }


  public V1beta1BasicDevice capacity(Map<String, V1beta1DeviceCapacity> capacity) {

    this.capacity = capacity;
    return this;
  }

  public V1beta1BasicDevice putCapacityItem(String key, V1beta1DeviceCapacity capacityItem) {
    if (this.capacity == null) {
      this.capacity = new HashMap<>();
    }
    this.capacity.put(key, capacityItem);
    return this;
  }

   /**
   * Capacity defines the set of capacities for this device. The name of each capacity must be unique in that set.  The maximum number of attributes and capacities combined is 32.
   * @return capacity
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Capacity defines the set of capacities for this device. The name of each capacity must be unique in that set.  The maximum number of attributes and capacities combined is 32.")

  public Map<String, V1beta1DeviceCapacity> getCapacity() {
    return capacity;
  }


  public void setCapacity(Map<String, V1beta1DeviceCapacity> capacity) {
    this.capacity = capacity;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1beta1BasicDevice v1beta1BasicDevice = (V1beta1BasicDevice) o;
    return Objects.equals(this.attributes, v1beta1BasicDevice.attributes) &&
        Objects.equals(this.capacity, v1beta1BasicDevice.capacity);
  }

  @Override
  public int hashCode() {
    return Objects.hash(attributes, capacity);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1beta1BasicDevice {\n");
    sb.append("    attributes: ").append(toIndentedString(attributes)).append("\n");
    sb.append("    capacity: ").append(toIndentedString(capacity)).append("\n");
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
