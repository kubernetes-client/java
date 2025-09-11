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
import io.kubernetes.client.openapi.models.V1ObjectReference;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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
 * CronJobStatus represents the current state of a cron job.
 */
@ApiModel(description = "CronJobStatus represents the current state of a cron job.")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-09-11T18:00:16.154662Z[Etc/UTC]", comments = "Generator version: 7.13.0")
public class V1CronJobStatus {
  public static final String SERIALIZED_NAME_ACTIVE = "active";
  @SerializedName(SERIALIZED_NAME_ACTIVE)
  @jakarta.annotation.Nullable
  private List<V1ObjectReference> active = new ArrayList<>();

  public static final String SERIALIZED_NAME_LAST_SCHEDULE_TIME = "lastScheduleTime";
  @SerializedName(SERIALIZED_NAME_LAST_SCHEDULE_TIME)
  @jakarta.annotation.Nullable
  private OffsetDateTime lastScheduleTime;

  public static final String SERIALIZED_NAME_LAST_SUCCESSFUL_TIME = "lastSuccessfulTime";
  @SerializedName(SERIALIZED_NAME_LAST_SUCCESSFUL_TIME)
  @jakarta.annotation.Nullable
  private OffsetDateTime lastSuccessfulTime;

  public V1CronJobStatus() {
  }

  public V1CronJobStatus active(@jakarta.annotation.Nullable List<V1ObjectReference> active) {
    this.active = active;
    return this;
  }

  public V1CronJobStatus addActiveItem(V1ObjectReference activeItem) {
    if (this.active == null) {
      this.active = new ArrayList<>();
    }
    this.active.add(activeItem);
    return this;
  }

  /**
   * A list of pointers to currently running jobs.
   * @return active
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "A list of pointers to currently running jobs.")
  public List<V1ObjectReference> getActive() {
    return active;
  }

  public void setActive(@jakarta.annotation.Nullable List<V1ObjectReference> active) {
    this.active = active;
  }


  public V1CronJobStatus lastScheduleTime(@jakarta.annotation.Nullable OffsetDateTime lastScheduleTime) {
    this.lastScheduleTime = lastScheduleTime;
    return this;
  }

  /**
   * Information when was the last time the job was successfully scheduled.
   * @return lastScheduleTime
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "Information when was the last time the job was successfully scheduled.")
  public OffsetDateTime getLastScheduleTime() {
    return lastScheduleTime;
  }

  public void setLastScheduleTime(@jakarta.annotation.Nullable OffsetDateTime lastScheduleTime) {
    this.lastScheduleTime = lastScheduleTime;
  }


  public V1CronJobStatus lastSuccessfulTime(@jakarta.annotation.Nullable OffsetDateTime lastSuccessfulTime) {
    this.lastSuccessfulTime = lastSuccessfulTime;
    return this;
  }

  /**
   * Information when was the last time the job successfully completed.
   * @return lastSuccessfulTime
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "Information when was the last time the job successfully completed.")
  public OffsetDateTime getLastSuccessfulTime() {
    return lastSuccessfulTime;
  }

  public void setLastSuccessfulTime(@jakarta.annotation.Nullable OffsetDateTime lastSuccessfulTime) {
    this.lastSuccessfulTime = lastSuccessfulTime;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1CronJobStatus v1CronJobStatus = (V1CronJobStatus) o;
    return Objects.equals(this.active, v1CronJobStatus.active) &&
        Objects.equals(this.lastScheduleTime, v1CronJobStatus.lastScheduleTime) &&
        Objects.equals(this.lastSuccessfulTime, v1CronJobStatus.lastSuccessfulTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(active, lastScheduleTime, lastSuccessfulTime);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1CronJobStatus {\n");
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
    sb.append("    lastScheduleTime: ").append(toIndentedString(lastScheduleTime)).append("\n");
    sb.append("    lastSuccessfulTime: ").append(toIndentedString(lastSuccessfulTime)).append("\n");
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
    openapiFields.add("active");
    openapiFields.add("lastScheduleTime");
    openapiFields.add("lastSuccessfulTime");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to V1CronJobStatus
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!V1CronJobStatus.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in V1CronJobStatus is not found in the empty JSON string", V1CronJobStatus.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!V1CronJobStatus.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `V1CronJobStatus` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (jsonObj.get("active") != null && !jsonObj.get("active").isJsonNull()) {
        JsonArray jsonArrayactive = jsonObj.getAsJsonArray("active");
        if (jsonArrayactive != null) {
          // ensure the json data is an array
          if (!jsonObj.get("active").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `active` to be an array in the JSON string but got `%s`", jsonObj.get("active").toString()));
          }

          // validate the optional field `active` (array)
          for (int i = 0; i < jsonArrayactive.size(); i++) {
            V1ObjectReference.validateJsonElement(jsonArrayactive.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!V1CronJobStatus.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'V1CronJobStatus' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<V1CronJobStatus> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(V1CronJobStatus.class));

       return (TypeAdapter<T>) new TypeAdapter<V1CronJobStatus>() {
           @Override
           public void write(JsonWriter out, V1CronJobStatus value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public V1CronJobStatus read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of V1CronJobStatus given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of V1CronJobStatus
   * @throws IOException if the JSON string is invalid with respect to V1CronJobStatus
   */
  public static V1CronJobStatus fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, V1CronJobStatus.class);
  }

  /**
   * Convert an instance of V1CronJobStatus to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
