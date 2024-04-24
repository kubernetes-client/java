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
import io.kubernetes.client.openapi.models.V1NodeConfigSource;
import java.io.IOException;

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
 * NodeConfigStatus describes the status of the config assigned by Node.Spec.ConfigSource.
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-23T13:45:09.091597Z[Etc/UTC]")
public class V1NodeConfigStatus {
  public static final String SERIALIZED_NAME_ACTIVE = "active";
  @SerializedName(SERIALIZED_NAME_ACTIVE)
  private V1NodeConfigSource active;

  public static final String SERIALIZED_NAME_ASSIGNED = "assigned";
  @SerializedName(SERIALIZED_NAME_ASSIGNED)
  private V1NodeConfigSource assigned;

  public static final String SERIALIZED_NAME_ERROR = "error";
  @SerializedName(SERIALIZED_NAME_ERROR)
  private String error;

  public static final String SERIALIZED_NAME_LAST_KNOWN_GOOD = "lastKnownGood";
  @SerializedName(SERIALIZED_NAME_LAST_KNOWN_GOOD)
  private V1NodeConfigSource lastKnownGood;

  public V1NodeConfigStatus() {
  }

  public V1NodeConfigStatus active(V1NodeConfigSource active) {

    this.active = active;
    return this;
  }

   /**
   * Get active
   * @return active
  **/
  @jakarta.annotation.Nullable
  public V1NodeConfigSource getActive() {
    return active;
  }


  public void setActive(V1NodeConfigSource active) {
    this.active = active;
  }


  public V1NodeConfigStatus assigned(V1NodeConfigSource assigned) {

    this.assigned = assigned;
    return this;
  }

   /**
   * Get assigned
   * @return assigned
  **/
  @jakarta.annotation.Nullable
  public V1NodeConfigSource getAssigned() {
    return assigned;
  }


  public void setAssigned(V1NodeConfigSource assigned) {
    this.assigned = assigned;
  }


  public V1NodeConfigStatus error(String error) {

    this.error = error;
    return this;
  }

   /**
   * Error describes any problems reconciling the Spec.ConfigSource to the Active config. Errors may occur, for example, attempting to checkpoint Spec.ConfigSource to the local Assigned record, attempting to checkpoint the payload associated with Spec.ConfigSource, attempting to load or validate the Assigned config, etc. Errors may occur at different points while syncing config. Earlier errors (e.g. download or checkpointing errors) will not result in a rollback to LastKnownGood, and may resolve across Kubelet retries. Later errors (e.g. loading or validating a checkpointed config) will result in a rollback to LastKnownGood. In the latter case, it is usually possible to resolve the error by fixing the config assigned in Spec.ConfigSource. You can find additional information for debugging by searching the error message in the Kubelet log. Error is a human-readable description of the error state; machines can check whether or not Error is empty, but should not rely on the stability of the Error text across Kubelet versions.
   * @return error
  **/
  @jakarta.annotation.Nullable
  public String getError() {
    return error;
  }


  public void setError(String error) {
    this.error = error;
  }


  public V1NodeConfigStatus lastKnownGood(V1NodeConfigSource lastKnownGood) {

    this.lastKnownGood = lastKnownGood;
    return this;
  }

   /**
   * Get lastKnownGood
   * @return lastKnownGood
  **/
  @jakarta.annotation.Nullable
  public V1NodeConfigSource getLastKnownGood() {
    return lastKnownGood;
  }


  public void setLastKnownGood(V1NodeConfigSource lastKnownGood) {
    this.lastKnownGood = lastKnownGood;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1NodeConfigStatus v1NodeConfigStatus = (V1NodeConfigStatus) o;
    return Objects.equals(this.active, v1NodeConfigStatus.active) &&
        Objects.equals(this.assigned, v1NodeConfigStatus.assigned) &&
        Objects.equals(this.error, v1NodeConfigStatus.error) &&
        Objects.equals(this.lastKnownGood, v1NodeConfigStatus.lastKnownGood);
  }

  @Override
  public int hashCode() {
    return Objects.hash(active, assigned, error, lastKnownGood);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1NodeConfigStatus {\n");
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
    sb.append("    assigned: ").append(toIndentedString(assigned)).append("\n");
    sb.append("    error: ").append(toIndentedString(error)).append("\n");
    sb.append("    lastKnownGood: ").append(toIndentedString(lastKnownGood)).append("\n");
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
    openapiFields.add("assigned");
    openapiFields.add("error");
    openapiFields.add("lastKnownGood");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to V1NodeConfigStatus
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!V1NodeConfigStatus.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in V1NodeConfigStatus is not found in the empty JSON string", V1NodeConfigStatus.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!V1NodeConfigStatus.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `V1NodeConfigStatus` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      // validate the optional field `active`
      if (jsonObj.get("active") != null && !jsonObj.get("active").isJsonNull()) {
        V1NodeConfigSource.validateJsonObject(jsonObj.getAsJsonObject("active"));
      }
      // validate the optional field `assigned`
      if (jsonObj.get("assigned") != null && !jsonObj.get("assigned").isJsonNull()) {
        V1NodeConfigSource.validateJsonObject(jsonObj.getAsJsonObject("assigned"));
      }
      if ((jsonObj.get("error") != null && !jsonObj.get("error").isJsonNull()) && !jsonObj.get("error").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `error` to be a primitive type in the JSON string but got `%s`", jsonObj.get("error").toString()));
      }
      // validate the optional field `lastKnownGood`
      if (jsonObj.get("lastKnownGood") != null && !jsonObj.get("lastKnownGood").isJsonNull()) {
        V1NodeConfigSource.validateJsonObject(jsonObj.getAsJsonObject("lastKnownGood"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!V1NodeConfigStatus.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'V1NodeConfigStatus' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<V1NodeConfigStatus> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(V1NodeConfigStatus.class));

       return (TypeAdapter<T>) new TypeAdapter<V1NodeConfigStatus>() {
           @Override
           public void write(JsonWriter out, V1NodeConfigStatus value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public V1NodeConfigStatus read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of V1NodeConfigStatus given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of V1NodeConfigStatus
  * @throws IOException if the JSON string is invalid with respect to V1NodeConfigStatus
  */
  public static V1NodeConfigStatus fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, V1NodeConfigStatus.class);
  }

 /**
  * Convert an instance of V1NodeConfigStatus to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
