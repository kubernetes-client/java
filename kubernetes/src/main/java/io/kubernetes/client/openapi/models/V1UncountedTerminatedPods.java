/*
Copyright 2024 The Kubernetes Authors.
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
import java.io.IOException;
import java.util.ArrayList;
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

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import io.kubernetes.client.openapi.JSON;

/**
 * UncountedTerminatedPods holds UIDs of Pods that have terminated but haven&#39;t been accounted in Job status counters.
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-23T13:45:09.091597Z[Etc/UTC]")
public class V1UncountedTerminatedPods {
  public static final String SERIALIZED_NAME_FAILED = "failed";
  @SerializedName(SERIALIZED_NAME_FAILED)
  private List<String> failed;

  public static final String SERIALIZED_NAME_SUCCEEDED = "succeeded";
  @SerializedName(SERIALIZED_NAME_SUCCEEDED)
  private List<String> succeeded;

  public V1UncountedTerminatedPods() {
  }

  public V1UncountedTerminatedPods failed(List<String> failed) {

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
  **/
  @jakarta.annotation.Nullable
  public List<String> getFailed() {
    return failed;
  }


  public void setFailed(List<String> failed) {
    this.failed = failed;
  }


  public V1UncountedTerminatedPods succeeded(List<String> succeeded) {

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
  **/
  @jakarta.annotation.Nullable
  public List<String> getSucceeded() {
    return succeeded;
  }


  public void setSucceeded(List<String> succeeded) {
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
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to V1UncountedTerminatedPods
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!V1UncountedTerminatedPods.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in V1UncountedTerminatedPods is not found in the empty JSON string", V1UncountedTerminatedPods.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!V1UncountedTerminatedPods.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `V1UncountedTerminatedPods` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("failed") != null && !jsonObj.get("failed").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `failed` to be an array in the JSON string but got `%s`", jsonObj.get("failed").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("succeeded") != null && !jsonObj.get("succeeded").isJsonArray()) {
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
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
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
