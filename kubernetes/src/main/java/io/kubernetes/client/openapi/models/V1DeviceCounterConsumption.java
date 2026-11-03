/*
Copyright 2026 The Kubernetes Authors.
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
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.kubernetes.client.openapi.models.V1Counter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import io.kubernetes.client.openapi.JSON;

/**
 * DeviceCounterConsumption defines a set of counters that a device will consume from a CounterSet.
 */
@ApiModel(description = "DeviceCounterConsumption defines a set of counters that a device will consume from a CounterSet.")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2026-10-15T02:48:00.835726Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class V1DeviceCounterConsumption {
  public static final String SERIALIZED_NAME_COMPATIBILITY_GROUPS = "compatibilityGroups";
  @SerializedName(SERIALIZED_NAME_COMPATIBILITY_GROUPS)
  @jakarta.annotation.Nullable
  private List<String> compatibilityGroups = new ArrayList<>();

  public static final String SERIALIZED_NAME_COUNTER_SET = "counterSet";
  @SerializedName(SERIALIZED_NAME_COUNTER_SET)
  @jakarta.annotation.Nonnull
  private String counterSet;

  public static final String SERIALIZED_NAME_COUNTERS = "counters";
  @SerializedName(SERIALIZED_NAME_COUNTERS)
  @jakarta.annotation.Nonnull
  private Map<String, V1Counter> counters = new HashMap<>();

  public V1DeviceCounterConsumption() {
  }

  public V1DeviceCounterConsumption compatibilityGroups(@jakarta.annotation.Nullable List<String> compatibilityGroups) {
    this.compatibilityGroups = compatibilityGroups;
    return this;
  }

  public V1DeviceCounterConsumption addCompatibilityGroupsItem(String compatibilityGroupsItem) {
    if (this.compatibilityGroups == null) {
      this.compatibilityGroups = new ArrayList<>();
    }
    this.compatibilityGroups.add(compatibilityGroupsItem);
    return this;
  }

  /**
   * CompatibilityGroups is a list of opaque group names for this counter set consumption.  Devices that consume counters from the same counter set may only be allocated at the same time (\&quot;co-allocated\&quot;) if they all share at least one common group: the intersection of the CompatibilityGroups of all co-allocated devices on that counter set must be non-empty. Devices that consume from different counter sets are never compared via this field.  An unset field, an explicit nil, and an empty list are equivalent and mean \&quot;no groups\&quot;: such a device is only co-allocatable with sibling devices on the same counter set that also have no groups, and is never co-allocatable with a device that declares one or more groups.  Group names are opaque and meaningful only within the publishing driver&#39;s pool.  The maximum number of groups is 2, and the names must be unique.
   * @return compatibilityGroups
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "CompatibilityGroups is a list of opaque group names for this counter set consumption.  Devices that consume counters from the same counter set may only be allocated at the same time (\"co-allocated\") if they all share at least one common group: the intersection of the CompatibilityGroups of all co-allocated devices on that counter set must be non-empty. Devices that consume from different counter sets are never compared via this field.  An unset field, an explicit nil, and an empty list are equivalent and mean \"no groups\": such a device is only co-allocatable with sibling devices on the same counter set that also have no groups, and is never co-allocatable with a device that declares one or more groups.  Group names are opaque and meaningful only within the publishing driver's pool.  The maximum number of groups is 2, and the names must be unique.")
  public List<String> getCompatibilityGroups() {
    return compatibilityGroups;
  }

  public void setCompatibilityGroups(@jakarta.annotation.Nullable List<String> compatibilityGroups) {
    this.compatibilityGroups = compatibilityGroups;
  }


  public V1DeviceCounterConsumption counterSet(@jakarta.annotation.Nonnull String counterSet) {
    this.counterSet = counterSet;
    return this;
  }

  /**
   * CounterSet is the name of the set from which the counters defined will be consumed.
   * @return counterSet
   */
  @jakarta.annotation.Nonnull
  @ApiModelProperty(required = true, value = "CounterSet is the name of the set from which the counters defined will be consumed.")
  public String getCounterSet() {
    return counterSet;
  }

  public void setCounterSet(@jakarta.annotation.Nonnull String counterSet) {
    this.counterSet = counterSet;
  }


  public V1DeviceCounterConsumption counters(@jakarta.annotation.Nonnull Map<String, V1Counter> counters) {
    this.counters = counters;
    return this;
  }

  public V1DeviceCounterConsumption putCountersItem(String key, V1Counter countersItem) {
    if (this.counters == null) {
      this.counters = new HashMap<>();
    }
    this.counters.put(key, countersItem);
    return this;
  }

  /**
   * Counters defines the counters that will be consumed by the device.  The maximum number of counters is 32.
   * @return counters
   */
  @jakarta.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Counters defines the counters that will be consumed by the device.  The maximum number of counters is 32.")
  public Map<String, V1Counter> getCounters() {
    return counters;
  }

  public void setCounters(@jakarta.annotation.Nonnull Map<String, V1Counter> counters) {
    this.counters = counters;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1DeviceCounterConsumption v1DeviceCounterConsumption = (V1DeviceCounterConsumption) o;
    return Objects.equals(this.compatibilityGroups, v1DeviceCounterConsumption.compatibilityGroups) &&
        Objects.equals(this.counterSet, v1DeviceCounterConsumption.counterSet) &&
        Objects.equals(this.counters, v1DeviceCounterConsumption.counters);
  }

  @Override
  public int hashCode() {
    return Objects.hash(compatibilityGroups, counterSet, counters);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1DeviceCounterConsumption {\n");
    sb.append("    compatibilityGroups: ").append(toIndentedString(compatibilityGroups)).append("\n");
    sb.append("    counterSet: ").append(toIndentedString(counterSet)).append("\n");
    sb.append("    counters: ").append(toIndentedString(counters)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>(Arrays.asList("compatibilityGroups", "counterSet", "counters"));

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>(Arrays.asList("counterSet", "counters"));
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to V1DeviceCounterConsumption
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!V1DeviceCounterConsumption.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format(java.util.Locale.ROOT, "The required field(s) %s in V1DeviceCounterConsumption is not found in the empty JSON string", V1DeviceCounterConsumption.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!V1DeviceCounterConsumption.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format(java.util.Locale.ROOT, "The field `%s` in the JSON string is not defined in the `V1DeviceCounterConsumption` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : V1DeviceCounterConsumption.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format(java.util.Locale.ROOT, "The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // ensure the optional json data is an array if present
      if (jsonObj.get("compatibilityGroups") != null && !jsonObj.get("compatibilityGroups").isJsonNull() && !jsonObj.get("compatibilityGroups").isJsonArray()) {
        throw new IllegalArgumentException(String.format(java.util.Locale.ROOT, "Expected the field `compatibilityGroups` to be an array in the JSON string but got `%s`", jsonObj.get("compatibilityGroups").toString()));
      }
      if (!jsonObj.get("counterSet").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format(java.util.Locale.ROOT, "Expected the field `counterSet` to be a primitive type in the JSON string but got `%s`", jsonObj.get("counterSet").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!V1DeviceCounterConsumption.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'V1DeviceCounterConsumption' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<V1DeviceCounterConsumption> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(V1DeviceCounterConsumption.class));

       return (TypeAdapter<T>) new TypeAdapter<V1DeviceCounterConsumption>() {
           @Override
           public void write(JsonWriter out, V1DeviceCounterConsumption value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public V1DeviceCounterConsumption read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of V1DeviceCounterConsumption given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of V1DeviceCounterConsumption
   * @throws IOException if the JSON string is invalid with respect to V1DeviceCounterConsumption
   */
  public static V1DeviceCounterConsumption fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, V1DeviceCounterConsumption.class);
  }

  /**
   * Convert an instance of V1DeviceCounterConsumption to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
