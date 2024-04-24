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
import io.kubernetes.client.openapi.models.V1Condition;
import io.kubernetes.client.openapi.models.V1LoadBalancerStatus;
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
 * ServiceStatus represents the current status of a service.
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-23T13:45:09.091597Z[Etc/UTC]")
public class V1ServiceStatus {
  public static final String SERIALIZED_NAME_CONDITIONS = "conditions";
  @SerializedName(SERIALIZED_NAME_CONDITIONS)
  private List<V1Condition> conditions;

  public static final String SERIALIZED_NAME_LOAD_BALANCER = "loadBalancer";
  @SerializedName(SERIALIZED_NAME_LOAD_BALANCER)
  private V1LoadBalancerStatus loadBalancer;

  public V1ServiceStatus() {
  }

  public V1ServiceStatus conditions(List<V1Condition> conditions) {

    this.conditions = conditions;
    return this;
  }

  public V1ServiceStatus addConditionsItem(V1Condition conditionsItem) {
    if (this.conditions == null) {
      this.conditions = new ArrayList<>();
    }
    this.conditions.add(conditionsItem);
    return this;
  }

   /**
   * Current service state
   * @return conditions
  **/
  @jakarta.annotation.Nullable
  public List<V1Condition> getConditions() {
    return conditions;
  }


  public void setConditions(List<V1Condition> conditions) {
    this.conditions = conditions;
  }


  public V1ServiceStatus loadBalancer(V1LoadBalancerStatus loadBalancer) {

    this.loadBalancer = loadBalancer;
    return this;
  }

   /**
   * Get loadBalancer
   * @return loadBalancer
  **/
  @jakarta.annotation.Nullable
  public V1LoadBalancerStatus getLoadBalancer() {
    return loadBalancer;
  }


  public void setLoadBalancer(V1LoadBalancerStatus loadBalancer) {
    this.loadBalancer = loadBalancer;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1ServiceStatus v1ServiceStatus = (V1ServiceStatus) o;
    return Objects.equals(this.conditions, v1ServiceStatus.conditions) &&
        Objects.equals(this.loadBalancer, v1ServiceStatus.loadBalancer);
  }

  @Override
  public int hashCode() {
    return Objects.hash(conditions, loadBalancer);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1ServiceStatus {\n");
    sb.append("    conditions: ").append(toIndentedString(conditions)).append("\n");
    sb.append("    loadBalancer: ").append(toIndentedString(loadBalancer)).append("\n");
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
    openapiFields.add("conditions");
    openapiFields.add("loadBalancer");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to V1ServiceStatus
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!V1ServiceStatus.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in V1ServiceStatus is not found in the empty JSON string", V1ServiceStatus.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!V1ServiceStatus.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `V1ServiceStatus` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("conditions") != null && !jsonObj.get("conditions").isJsonNull()) {
        JsonArray jsonArrayconditions = jsonObj.getAsJsonArray("conditions");
        if (jsonArrayconditions != null) {
          // ensure the json data is an array
          if (!jsonObj.get("conditions").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `conditions` to be an array in the JSON string but got `%s`", jsonObj.get("conditions").toString()));
          }

          // validate the optional field `conditions` (array)
          for (int i = 0; i < jsonArrayconditions.size(); i++) {
            V1Condition.validateJsonObject(jsonArrayconditions.get(i).getAsJsonObject());
          };
        }
      }
      // validate the optional field `loadBalancer`
      if (jsonObj.get("loadBalancer") != null && !jsonObj.get("loadBalancer").isJsonNull()) {
        V1LoadBalancerStatus.validateJsonObject(jsonObj.getAsJsonObject("loadBalancer"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!V1ServiceStatus.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'V1ServiceStatus' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<V1ServiceStatus> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(V1ServiceStatus.class));

       return (TypeAdapter<T>) new TypeAdapter<V1ServiceStatus>() {
           @Override
           public void write(JsonWriter out, V1ServiceStatus value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public V1ServiceStatus read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of V1ServiceStatus given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of V1ServiceStatus
  * @throws IOException if the JSON string is invalid with respect to V1ServiceStatus
  */
  public static V1ServiceStatus fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, V1ServiceStatus.class);
  }

 /**
  * Convert an instance of V1ServiceStatus to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
