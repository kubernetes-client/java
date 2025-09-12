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
 * CounterSet defines a named set of counters that are available to be used by devices defined in the ResourceSlice.  The counters are not allocatable by themselves, but can be referenced by devices. When a device is allocated, the portion of counters it uses will no longer be available for use by other devices.
 */
@ApiModel(description = "CounterSet defines a named set of counters that are available to be used by devices defined in the ResourceSlice.  The counters are not allocatable by themselves, but can be referenced by devices. When a device is allocated, the portion of counters it uses will no longer be available for use by other devices.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-09-12T16:56:46.431280Z[Etc/UTC]")
public class V1beta2CounterSet {
  public static final String SERIALIZED_NAME_COUNTERS = "counters";
  @SerializedName(SERIALIZED_NAME_COUNTERS)
  private Map<String, V1beta2Counter> counters = new HashMap<>();

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;


  public V1beta2CounterSet counters(Map<String, V1beta2Counter> counters) {

    this.counters = counters;
    return this;
  }

  public V1beta2CounterSet putCountersItem(String key, V1beta2Counter countersItem) {
    this.counters.put(key, countersItem);
    return this;
  }

   /**
   * Counters defines the set of counters for this CounterSet The name of each counter must be unique in that set and must be a DNS label.  The maximum number of counters in all sets is 32.
   * @return counters
  **/
  @ApiModelProperty(required = true, value = "Counters defines the set of counters for this CounterSet The name of each counter must be unique in that set and must be a DNS label.  The maximum number of counters in all sets is 32.")

  public Map<String, V1beta2Counter> getCounters() {
    return counters;
  }


  public void setCounters(Map<String, V1beta2Counter> counters) {
    this.counters = counters;
  }


  public V1beta2CounterSet name(String name) {

    this.name = name;
    return this;
  }

   /**
   * Name defines the name of the counter set. It must be a DNS label.
   * @return name
  **/
  @ApiModelProperty(required = true, value = "Name defines the name of the counter set. It must be a DNS label.")

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
    V1beta2CounterSet v1beta2CounterSet = (V1beta2CounterSet) o;
    return Objects.equals(this.counters, v1beta2CounterSet.counters) &&
        Objects.equals(this.name, v1beta2CounterSet.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(counters, name);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1beta2CounterSet {\n");
    sb.append("    counters: ").append(toIndentedString(counters)).append("\n");
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
