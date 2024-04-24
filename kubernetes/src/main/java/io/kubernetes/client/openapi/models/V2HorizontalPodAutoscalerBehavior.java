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
import io.kubernetes.client.openapi.models.V2HPAScalingRules;
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
 * HorizontalPodAutoscalerBehavior configures the scaling behavior of the target in both Up and Down directions (scaleUp and scaleDown fields respectively).
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-23T13:45:09.091597Z[Etc/UTC]")
public class V2HorizontalPodAutoscalerBehavior {
  public static final String SERIALIZED_NAME_SCALE_DOWN = "scaleDown";
  @SerializedName(SERIALIZED_NAME_SCALE_DOWN)
  private V2HPAScalingRules scaleDown;

  public static final String SERIALIZED_NAME_SCALE_UP = "scaleUp";
  @SerializedName(SERIALIZED_NAME_SCALE_UP)
  private V2HPAScalingRules scaleUp;

  public V2HorizontalPodAutoscalerBehavior() {
  }

  public V2HorizontalPodAutoscalerBehavior scaleDown(V2HPAScalingRules scaleDown) {

    this.scaleDown = scaleDown;
    return this;
  }

   /**
   * Get scaleDown
   * @return scaleDown
  **/
  @jakarta.annotation.Nullable
  public V2HPAScalingRules getScaleDown() {
    return scaleDown;
  }


  public void setScaleDown(V2HPAScalingRules scaleDown) {
    this.scaleDown = scaleDown;
  }


  public V2HorizontalPodAutoscalerBehavior scaleUp(V2HPAScalingRules scaleUp) {

    this.scaleUp = scaleUp;
    return this;
  }

   /**
   * Get scaleUp
   * @return scaleUp
  **/
  @jakarta.annotation.Nullable
  public V2HPAScalingRules getScaleUp() {
    return scaleUp;
  }


  public void setScaleUp(V2HPAScalingRules scaleUp) {
    this.scaleUp = scaleUp;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V2HorizontalPodAutoscalerBehavior v2HorizontalPodAutoscalerBehavior = (V2HorizontalPodAutoscalerBehavior) o;
    return Objects.equals(this.scaleDown, v2HorizontalPodAutoscalerBehavior.scaleDown) &&
        Objects.equals(this.scaleUp, v2HorizontalPodAutoscalerBehavior.scaleUp);
  }

  @Override
  public int hashCode() {
    return Objects.hash(scaleDown, scaleUp);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V2HorizontalPodAutoscalerBehavior {\n");
    sb.append("    scaleDown: ").append(toIndentedString(scaleDown)).append("\n");
    sb.append("    scaleUp: ").append(toIndentedString(scaleUp)).append("\n");
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
    openapiFields.add("scaleDown");
    openapiFields.add("scaleUp");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to V2HorizontalPodAutoscalerBehavior
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!V2HorizontalPodAutoscalerBehavior.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in V2HorizontalPodAutoscalerBehavior is not found in the empty JSON string", V2HorizontalPodAutoscalerBehavior.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!V2HorizontalPodAutoscalerBehavior.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `V2HorizontalPodAutoscalerBehavior` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      // validate the optional field `scaleDown`
      if (jsonObj.get("scaleDown") != null && !jsonObj.get("scaleDown").isJsonNull()) {
        V2HPAScalingRules.validateJsonObject(jsonObj.getAsJsonObject("scaleDown"));
      }
      // validate the optional field `scaleUp`
      if (jsonObj.get("scaleUp") != null && !jsonObj.get("scaleUp").isJsonNull()) {
        V2HPAScalingRules.validateJsonObject(jsonObj.getAsJsonObject("scaleUp"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!V2HorizontalPodAutoscalerBehavior.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'V2HorizontalPodAutoscalerBehavior' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<V2HorizontalPodAutoscalerBehavior> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(V2HorizontalPodAutoscalerBehavior.class));

       return (TypeAdapter<T>) new TypeAdapter<V2HorizontalPodAutoscalerBehavior>() {
           @Override
           public void write(JsonWriter out, V2HorizontalPodAutoscalerBehavior value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public V2HorizontalPodAutoscalerBehavior read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of V2HorizontalPodAutoscalerBehavior given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of V2HorizontalPodAutoscalerBehavior
  * @throws IOException if the JSON string is invalid with respect to V2HorizontalPodAutoscalerBehavior
  */
  public static V2HorizontalPodAutoscalerBehavior fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, V2HorizontalPodAutoscalerBehavior.class);
  }

 /**
  * Convert an instance of V2HorizontalPodAutoscalerBehavior to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
