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
 * UncountedTerminatedPods holds UIDs of Pods that have terminated but haven&#39;t been accounted in Job status counters.
 */
@ApiModel(description = "UncountedTerminatedPods holds UIDs of Pods that have terminated but haven't been accounted in Job status counters.")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-09-11T18:00:16.154662Z[Etc/UTC]", comments = "Generator version: 7.13.0")
public class V1UncountedTerminatedPods {
  public static final String SERIALIZED_NAME_FAILED = "failed";
  @SerializedName(SERIALIZED_NAME_FAILED)
  @jakarta.annotation.Nullable
  private List<String> failed = new ArrayList<>();

  public static final String SERIALIZED_NAME_SUCCEEDED = "succeeded";
  @SerializedName(SERIALIZED_NAME_SUCCEEDED)
  @jakarta.annotation.Nullable
  private List<String> succeeded = new ArrayList<>();

  public V1UncountedTerminatedPods() {
  }

  public V1UncountedTerminatedPods failed(@jakarta.annotation.Nullable List<String> failed) {
    this.failed = failed;
    return this;
  }

  public V1UncountedTerminatedPods addFailedItem(String failedItem) {
    if (this.failed == null) {
      this.failed = new ArrayList<>();
    }
    this.failed.add(failedItem);
    return this;
  }

  /**
   * failed holds UIDs of failed Pods.
   * @return failed
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "failed holds UIDs of failed Pods.")
  public List<String> getFailed() {
    return failed;
  }

  public void setFailed(@jakarta.annotation.Nullable List<String> failed) {
    this.failed = failed;
  }


  public V1UncountedTerminatedPods succeeded(@jakarta.annotation.Nullable List<String> succeeded) {
    this.succeeded = succeeded;
    return this;
  }

  public V1UncountedTerminatedPods addSucceededItem(String succeededItem) {
    if (this.succeeded == null) {
      this.succeeded = new ArrayList<>();
    }
    this.succeeded.add(succeededItem);
    return this;
  }

  /**
   * succeeded holds UIDs of succeeded Pods.
   * @return succeeded
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "succeeded holds UIDs of succeeded Pods.")
  public List<String> getSucceeded() {
    return succeeded;
  }

  public void setSucceeded(@jakarta.annotation.Nullable List<String> succeeded) {
    this.succeeded = succeeded;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1UncountedTerminatedPods v1UncountedTerminatedPods = (V1UncountedTerminatedPods) o;
    return Objects.equals(this.failed, v1UncountedTerminatedPods.failed) &&
        Objects.equals(this.succeeded, v1UncountedTerminatedPods.succeeded);
  }

  @Override
  public int hashCode() {
    return Objects.hash(failed, succeeded);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1UncountedTerminatedPods {\n");
    sb.append("    failed: ").append(toIndentedString(failed)).append("\n");
    sb.append("    succeeded: ").append(toIndentedString(succeeded)).append("\n");
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
    openapiFields.add("failed");
    openapiFields.add("succeeded");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to V1UncountedTerminatedPods
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!V1UncountedTerminatedPods.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in V1UncountedTerminatedPods is not found in the empty JSON string", V1UncountedTerminatedPods.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!V1UncountedTerminatedPods.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `V1UncountedTerminatedPods` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // ensure the optional json data is an array if present
      if (jsonObj.get("failed") != null && !jsonObj.get("failed").isJsonNull() && !jsonObj.get("failed").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `failed` to be an array in the JSON string but got `%s`", jsonObj.get("failed").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("succeeded") != null && !jsonObj.get("succeeded").isJsonNull() && !jsonObj.get("succeeded").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `succeeded` to be an array in the JSON string but got `%s`", jsonObj.get("succeeded").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!V1UncountedTerminatedPods.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'V1UncountedTerminatedPods' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<V1UncountedTerminatedPods> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(V1UncountedTerminatedPods.class));

       return (TypeAdapter<T>) new TypeAdapter<V1UncountedTerminatedPods>() {
           @Override
           public void write(JsonWriter out, V1UncountedTerminatedPods value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public V1UncountedTerminatedPods read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of V1UncountedTerminatedPods given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of V1UncountedTerminatedPods
   * @throws IOException if the JSON string is invalid with respect to V1UncountedTerminatedPods
   */
  public static V1UncountedTerminatedPods fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, V1UncountedTerminatedPods.class);
  }

  /**
   * Convert an instance of V1UncountedTerminatedPods to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
