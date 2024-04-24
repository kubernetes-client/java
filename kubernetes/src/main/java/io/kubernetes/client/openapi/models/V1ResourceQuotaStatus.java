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
import io.kubernetes.client.custom.Quantity;
import java.io.IOException;
import java.util.HashMap;
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

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import io.kubernetes.client.openapi.JSON;

/**
 * ResourceQuotaStatus defines the enforced hard limits and observed use.
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-23T13:45:09.091597Z[Etc/UTC]")
public class V1ResourceQuotaStatus {
  public static final String SERIALIZED_NAME_HARD = "hard";
  @SerializedName(SERIALIZED_NAME_HARD)
  private Map<String, Quantity> hard = new HashMap<>();

  public static final String SERIALIZED_NAME_USED = "used";
  @SerializedName(SERIALIZED_NAME_USED)
  private Map<String, Quantity> used = new HashMap<>();

  public V1ResourceQuotaStatus() {
  }

  public V1ResourceQuotaStatus hard(Map<String, Quantity> hard) {

    this.hard = hard;
    return this;
  }

  public V1ResourceQuotaStatus putHardItem(String key, Quantity hardItem) {
    if (this.hard == null) {
      this.hard = new HashMap<>();
    }
    this.hard.put(key, hardItem);
    return this;
  }

   /**
   * Hard is the set of enforced hard limits for each named resource. More info: https://kubernetes.io/docs/concepts/policy/resource-quotas/
   * @return hard
  **/
  @jakarta.annotation.Nullable
  public Map<String, Quantity> getHard() {
    return hard;
  }


  public void setHard(Map<String, Quantity> hard) {
    this.hard = hard;
  }


  public V1ResourceQuotaStatus used(Map<String, Quantity> used) {

    this.used = used;
    return this;
  }

  public V1ResourceQuotaStatus putUsedItem(String key, Quantity usedItem) {
    if (this.used == null) {
      this.used = new HashMap<>();
    }
    this.used.put(key, usedItem);
    return this;
  }

   /**
   * Used is the current observed total usage of the resource in the namespace.
   * @return used
  **/
  @jakarta.annotation.Nullable
  public Map<String, Quantity> getUsed() {
    return used;
  }


  public void setUsed(Map<String, Quantity> used) {
    this.used = used;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1ResourceQuotaStatus v1ResourceQuotaStatus = (V1ResourceQuotaStatus) o;
    return Objects.equals(this.hard, v1ResourceQuotaStatus.hard) &&
        Objects.equals(this.used, v1ResourceQuotaStatus.used);
  }

  @Override
  public int hashCode() {
    return Objects.hash(hard, used);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1ResourceQuotaStatus {\n");
    sb.append("    hard: ").append(toIndentedString(hard)).append("\n");
    sb.append("    used: ").append(toIndentedString(used)).append("\n");
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
    openapiFields.add("hard");
    openapiFields.add("used");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to V1ResourceQuotaStatus
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!V1ResourceQuotaStatus.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in V1ResourceQuotaStatus is not found in the empty JSON string", V1ResourceQuotaStatus.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!V1ResourceQuotaStatus.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `V1ResourceQuotaStatus` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!V1ResourceQuotaStatus.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'V1ResourceQuotaStatus' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<V1ResourceQuotaStatus> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(V1ResourceQuotaStatus.class));

       return (TypeAdapter<T>) new TypeAdapter<V1ResourceQuotaStatus>() {
           @Override
           public void write(JsonWriter out, V1ResourceQuotaStatus value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public V1ResourceQuotaStatus read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of V1ResourceQuotaStatus given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of V1ResourceQuotaStatus
  * @throws IOException if the JSON string is invalid with respect to V1ResourceQuotaStatus
  */
  public static V1ResourceQuotaStatus fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, V1ResourceQuotaStatus.class);
  }

 /**
  * Convert an instance of V1ResourceQuotaStatus to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
