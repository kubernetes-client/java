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
import io.kubernetes.client.openapi.models.V1QueuingConfiguration;
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
 * LimitResponse defines how to handle requests that can not be executed right now.
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-23T13:45:09.091597Z[Etc/UTC]")
public class V1LimitResponse {
  public static final String SERIALIZED_NAME_QUEUING = "queuing";
  @SerializedName(SERIALIZED_NAME_QUEUING)
  private V1QueuingConfiguration queuing;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;

  public V1LimitResponse() {
  }

  public V1LimitResponse queuing(V1QueuingConfiguration queuing) {

    this.queuing = queuing;
    return this;
  }

   /**
   * Get queuing
   * @return queuing
  **/
  @jakarta.annotation.Nullable
  public V1QueuingConfiguration getQueuing() {
    return queuing;
  }


  public void setQueuing(V1QueuingConfiguration queuing) {
    this.queuing = queuing;
  }


  public V1LimitResponse type(String type) {

    this.type = type;
    return this;
  }

   /**
   * &#x60;type&#x60; is \&quot;Queue\&quot; or \&quot;Reject\&quot;. \&quot;Queue\&quot; means that requests that can not be executed upon arrival are held in a queue until they can be executed or a queuing limit is reached. \&quot;Reject\&quot; means that requests that can not be executed upon arrival are rejected. Required.
   * @return type
  **/
  @jakarta.annotation.Nonnull
  public String getType() {
    return type;
  }


  public void setType(String type) {
    this.type = type;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1LimitResponse v1LimitResponse = (V1LimitResponse) o;
    return Objects.equals(this.queuing, v1LimitResponse.queuing) &&
        Objects.equals(this.type, v1LimitResponse.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(queuing, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1LimitResponse {\n");
    sb.append("    queuing: ").append(toIndentedString(queuing)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
    openapiFields.add("queuing");
    openapiFields.add("type");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("type");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to V1LimitResponse
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!V1LimitResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in V1LimitResponse is not found in the empty JSON string", V1LimitResponse.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!V1LimitResponse.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `V1LimitResponse` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : V1LimitResponse.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      // validate the optional field `queuing`
      if (jsonObj.get("queuing") != null && !jsonObj.get("queuing").isJsonNull()) {
        V1QueuingConfiguration.validateJsonObject(jsonObj.getAsJsonObject("queuing"));
      }
      if (!jsonObj.get("type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("type").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!V1LimitResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'V1LimitResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<V1LimitResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(V1LimitResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<V1LimitResponse>() {
           @Override
           public void write(JsonWriter out, V1LimitResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public V1LimitResponse read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of V1LimitResponse given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of V1LimitResponse
  * @throws IOException if the JSON string is invalid with respect to V1LimitResponse
  */
  public static V1LimitResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, V1LimitResponse.class);
  }

 /**
  * Convert an instance of V1LimitResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
