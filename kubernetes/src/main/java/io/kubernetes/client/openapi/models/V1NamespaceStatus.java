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
import io.kubernetes.client.openapi.models.V1NamespaceCondition;
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
 * NamespaceStatus is information about the current status of a Namespace.
 */
@ApiModel(description = "NamespaceStatus is information about the current status of a Namespace.")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-09-11T18:00:16.154662Z[Etc/UTC]", comments = "Generator version: 7.13.0")
public class V1NamespaceStatus {
  public static final String SERIALIZED_NAME_CONDITIONS = "conditions";
  @SerializedName(SERIALIZED_NAME_CONDITIONS)
  @jakarta.annotation.Nullable
  private List<V1NamespaceCondition> conditions = new ArrayList<>();

  public static final String SERIALIZED_NAME_PHASE = "phase";
  @SerializedName(SERIALIZED_NAME_PHASE)
  @jakarta.annotation.Nullable
  private String phase;

  public V1NamespaceStatus() {
  }

  public V1NamespaceStatus conditions(@jakarta.annotation.Nullable List<V1NamespaceCondition> conditions) {
    this.conditions = conditions;
    return this;
  }

  public V1NamespaceStatus addConditionsItem(V1NamespaceCondition conditionsItem) {
    if (this.conditions == null) {
      this.conditions = new ArrayList<>();
    }
    this.conditions.add(conditionsItem);
    return this;
  }

  /**
   * Represents the latest available observations of a namespace&#39;s current state.
   * @return conditions
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "Represents the latest available observations of a namespace's current state.")
  public List<V1NamespaceCondition> getConditions() {
    return conditions;
  }

  public void setConditions(@jakarta.annotation.Nullable List<V1NamespaceCondition> conditions) {
    this.conditions = conditions;
  }


  public V1NamespaceStatus phase(@jakarta.annotation.Nullable String phase) {
    this.phase = phase;
    return this;
  }

  /**
   * Phase is the current lifecycle phase of the namespace. More info: https://kubernetes.io/docs/tasks/administer-cluster/namespaces/
   * @return phase
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "Phase is the current lifecycle phase of the namespace. More info: https://kubernetes.io/docs/tasks/administer-cluster/namespaces/")
  public String getPhase() {
    return phase;
  }

  public void setPhase(@jakarta.annotation.Nullable String phase) {
    this.phase = phase;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1NamespaceStatus v1NamespaceStatus = (V1NamespaceStatus) o;
    return Objects.equals(this.conditions, v1NamespaceStatus.conditions) &&
        Objects.equals(this.phase, v1NamespaceStatus.phase);
  }

  @Override
  public int hashCode() {
    return Objects.hash(conditions, phase);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1NamespaceStatus {\n");
    sb.append("    conditions: ").append(toIndentedString(conditions)).append("\n");
    sb.append("    phase: ").append(toIndentedString(phase)).append("\n");
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
    openapiFields.add("phase");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to V1NamespaceStatus
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!V1NamespaceStatus.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in V1NamespaceStatus is not found in the empty JSON string", V1NamespaceStatus.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!V1NamespaceStatus.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `V1NamespaceStatus` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (jsonObj.get("conditions") != null && !jsonObj.get("conditions").isJsonNull()) {
        JsonArray jsonArrayconditions = jsonObj.getAsJsonArray("conditions");
        if (jsonArrayconditions != null) {
          // ensure the json data is an array
          if (!jsonObj.get("conditions").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `conditions` to be an array in the JSON string but got `%s`", jsonObj.get("conditions").toString()));
          }

          // validate the optional field `conditions` (array)
          for (int i = 0; i < jsonArrayconditions.size(); i++) {
            V1NamespaceCondition.validateJsonElement(jsonArrayconditions.get(i));
          };
        }
      }
      if ((jsonObj.get("phase") != null && !jsonObj.get("phase").isJsonNull()) && !jsonObj.get("phase").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `phase` to be a primitive type in the JSON string but got `%s`", jsonObj.get("phase").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!V1NamespaceStatus.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'V1NamespaceStatus' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<V1NamespaceStatus> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(V1NamespaceStatus.class));

       return (TypeAdapter<T>) new TypeAdapter<V1NamespaceStatus>() {
           @Override
           public void write(JsonWriter out, V1NamespaceStatus value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public V1NamespaceStatus read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of V1NamespaceStatus given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of V1NamespaceStatus
   * @throws IOException if the JSON string is invalid with respect to V1NamespaceStatus
   */
  public static V1NamespaceStatus fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, V1NamespaceStatus.class);
  }

  /**
   * Convert an instance of V1NamespaceStatus to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
