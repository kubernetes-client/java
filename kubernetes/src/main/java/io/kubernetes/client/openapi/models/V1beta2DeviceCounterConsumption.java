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
import io.kubernetes.client.openapi.models.V1beta2Counter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * DeviceCounterConsumption defines a set of counters that a device will consume from a CounterSet.
 */
@ApiModel(description = "DeviceCounterConsumption defines a set of counters that a device will consume from a CounterSet.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-09-12T16:56:46.431280Z[Etc/UTC]")
public class V1beta2DeviceCounterConsumption {
  public static final String SERIALIZED_NAME_COUNTER_SET = "counterSet";
  @SerializedName(SERIALIZED_NAME_COUNTER_SET)
  private String counterSet;

  public static final String SERIALIZED_NAME_COUNTERS = "counters";
  @SerializedName(SERIALIZED_NAME_COUNTERS)
  private Map<String, V1beta2Counter> counters = new HashMap<>();


  public V1beta2DeviceCounterConsumption counterSet(String counterSet) {

    this.counterSet = counterSet;
    return this;
  }

   /**
   * CounterSet is the name of the set from which the counters defined will be consumed.
   * @return counterSet
  **/
  @ApiModelProperty(required = true, value = "CounterSet is the name of the set from which the counters defined will be consumed.")

  public String getCounterSet() {
    return counterSet;
  }


  public void setCounterSet(String counterSet) {
    this.counterSet = counterSet;
  }


  public V1beta2DeviceCounterConsumption counters(Map<String, V1beta2Counter> counters) {

    this.counters = counters;
    return this;
  }

  public V1beta2DeviceCounterConsumption putCountersItem(String key, V1beta2Counter countersItem) {
    this.counters.put(key, countersItem);
    return this;
  }

   /**
   * Counters defines the counters that will be consumed by the device.  The maximum number counters in a device is 32. In addition, the maximum number of all counters in all devices is 1024 (for example, 64 devices with 16 counters each).
   * @return counters
  **/
  @ApiModelProperty(required = true, value = "Counters defines the counters that will be consumed by the device.  The maximum number counters in a device is 32. In addition, the maximum number of all counters in all devices is 1024 (for example, 64 devices with 16 counters each).")

  public Map<String, V1beta2Counter> getCounters() {
    return counters;
  }


  public void setCounters(Map<String, V1beta2Counter> counters) {
    this.counters = counters;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1beta2DeviceCounterConsumption v1beta2DeviceCounterConsumption = (V1beta2DeviceCounterConsumption) o;
    return Objects.equals(this.counterSet, v1beta2DeviceCounterConsumption.counterSet) &&
        Objects.equals(this.counters, v1beta2DeviceCounterConsumption.counters);
  }

  @Override
  public int hashCode() {
    return Objects.hash(counterSet, counters);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1beta2DeviceCounterConsumption {\n");
    sb.append("    counterSet: ").append(toIndentedString(counterSet)).append("\n");
    sb.append("    counters: ").append(toIndentedString(counters)).append("\n");
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
