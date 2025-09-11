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
 * PodReadinessGate contains the reference to a pod condition
 */
@ApiModel(description = "PodReadinessGate contains the reference to a pod condition")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-09-11T18:00:16.154662Z[Etc/UTC]", comments = "Generator version: 7.13.0")
public class V1PodReadinessGate {
  public static final String SERIALIZED_NAME_CONDITION_TYPE = "conditionType";
  @SerializedName(SERIALIZED_NAME_CONDITION_TYPE)
  @jakarta.annotation.Nonnull
  private String conditionType;

  public V1PodReadinessGate() {
  }

  public V1PodReadinessGate conditionType(@jakarta.annotation.Nonnull String conditionType) {
    this.conditionType = conditionType;
    return this;
  }

  /**
   * ConditionType refers to a condition in the pod&#39;s condition list with matching type.
   * @return conditionType
   */
  @jakarta.annotation.Nonnull
  @ApiModelProperty(required = true, value = "ConditionType refers to a condition in the pod's condition list with matching type.")
  public String getConditionType() {
    return conditionType;
  }

  public void setConditionType(@jakarta.annotation.Nonnull String conditionType) {
    this.conditionType = conditionType;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1PodReadinessGate v1PodReadinessGate = (V1PodReadinessGate) o;
    return Objects.equals(this.conditionType, v1PodReadinessGate.conditionType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(conditionType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1PodReadinessGate {\n");
    sb.append("    conditionType: ").append(toIndentedString(conditionType)).append("\n");
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
    openapiFields.add("conditionType");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("conditionType");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to V1PodReadinessGate
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!V1PodReadinessGate.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in V1PodReadinessGate is not found in the empty JSON string", V1PodReadinessGate.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!V1PodReadinessGate.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `V1PodReadinessGate` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : V1PodReadinessGate.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("conditionType").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `conditionType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("conditionType").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!V1PodReadinessGate.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'V1PodReadinessGate' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<V1PodReadinessGate> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(V1PodReadinessGate.class));

       return (TypeAdapter<T>) new TypeAdapter<V1PodReadinessGate>() {
           @Override
           public void write(JsonWriter out, V1PodReadinessGate value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public V1PodReadinessGate read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of V1PodReadinessGate given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of V1PodReadinessGate
   * @throws IOException if the JSON string is invalid with respect to V1PodReadinessGate
   */
  public static V1PodReadinessGate fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, V1PodReadinessGate.class);
  }

  /**
   * Convert an instance of V1PodReadinessGate to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
