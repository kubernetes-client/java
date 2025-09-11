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
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.time.OffsetDateTime;
import java.util.Arrays;

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
 * EventSeries contain information on series of events, i.e. thing that was/is happening continuously for some time.
 */
@ApiModel(description = "EventSeries contain information on series of events, i.e. thing that was/is happening continuously for some time.")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-09-11T18:00:16.154662Z[Etc/UTC]", comments = "Generator version: 7.13.0")
public class CoreV1EventSeries {
  public static final String SERIALIZED_NAME_COUNT = "count";
  @SerializedName(SERIALIZED_NAME_COUNT)
  @jakarta.annotation.Nullable
  private Integer count;

  public static final String SERIALIZED_NAME_LAST_OBSERVED_TIME = "lastObservedTime";
  @SerializedName(SERIALIZED_NAME_LAST_OBSERVED_TIME)
  @jakarta.annotation.Nullable
  private OffsetDateTime lastObservedTime;

  public CoreV1EventSeries() {
  }

  public CoreV1EventSeries count(@jakarta.annotation.Nullable Integer count) {
    this.count = count;
    return this;
  }

  /**
   * Number of occurrences in this series up to the last heartbeat time
   * @return count
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "Number of occurrences in this series up to the last heartbeat time")
  public Integer getCount() {
    return count;
  }

  public void setCount(@jakarta.annotation.Nullable Integer count) {
    this.count = count;
  }


  public CoreV1EventSeries lastObservedTime(@jakarta.annotation.Nullable OffsetDateTime lastObservedTime) {
    this.lastObservedTime = lastObservedTime;
    return this;
  }

  /**
   * Time of the last occurrence observed
   * @return lastObservedTime
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "Time of the last occurrence observed")
  public OffsetDateTime getLastObservedTime() {
    return lastObservedTime;
  }

  public void setLastObservedTime(@jakarta.annotation.Nullable OffsetDateTime lastObservedTime) {
    this.lastObservedTime = lastObservedTime;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CoreV1EventSeries coreV1EventSeries = (CoreV1EventSeries) o;
    return Objects.equals(this.count, coreV1EventSeries.count) &&
        Objects.equals(this.lastObservedTime, coreV1EventSeries.lastObservedTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(count, lastObservedTime);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CoreV1EventSeries {\n");
    sb.append("    count: ").append(toIndentedString(count)).append("\n");
    sb.append("    lastObservedTime: ").append(toIndentedString(lastObservedTime)).append("\n");
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
    openapiFields = new HashSet<String>();
    openapiFields.add("count");
    openapiFields.add("lastObservedTime");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to CoreV1EventSeries
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CoreV1EventSeries.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CoreV1EventSeries is not found in the empty JSON string", CoreV1EventSeries.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!CoreV1EventSeries.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CoreV1EventSeries` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CoreV1EventSeries.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CoreV1EventSeries' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CoreV1EventSeries> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CoreV1EventSeries.class));

       return (TypeAdapter<T>) new TypeAdapter<CoreV1EventSeries>() {
           @Override
           public void write(JsonWriter out, CoreV1EventSeries value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CoreV1EventSeries read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of CoreV1EventSeries given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of CoreV1EventSeries
   * @throws IOException if the JSON string is invalid with respect to CoreV1EventSeries
   */
  public static CoreV1EventSeries fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CoreV1EventSeries.class);
  }

  /**
   * Convert an instance of CoreV1EventSeries to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
