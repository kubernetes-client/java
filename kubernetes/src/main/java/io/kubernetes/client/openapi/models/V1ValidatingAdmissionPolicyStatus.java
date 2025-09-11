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
import io.kubernetes.client.openapi.models.V1Condition;
import io.kubernetes.client.openapi.models.V1TypeChecking;
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
 * ValidatingAdmissionPolicyStatus represents the status of an admission validation policy.
 */
@ApiModel(description = "ValidatingAdmissionPolicyStatus represents the status of an admission validation policy.")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-09-11T18:00:16.154662Z[Etc/UTC]", comments = "Generator version: 7.13.0")
public class V1ValidatingAdmissionPolicyStatus {
  public static final String SERIALIZED_NAME_CONDITIONS = "conditions";
  @SerializedName(SERIALIZED_NAME_CONDITIONS)
  @jakarta.annotation.Nullable
  private List<V1Condition> conditions = new ArrayList<>();

  public static final String SERIALIZED_NAME_OBSERVED_GENERATION = "observedGeneration";
  @SerializedName(SERIALIZED_NAME_OBSERVED_GENERATION)
  @jakarta.annotation.Nullable
  private Long observedGeneration;

  public static final String SERIALIZED_NAME_TYPE_CHECKING = "typeChecking";
  @SerializedName(SERIALIZED_NAME_TYPE_CHECKING)
  @jakarta.annotation.Nullable
  private V1TypeChecking typeChecking;

  public V1ValidatingAdmissionPolicyStatus() {
  }

  public V1ValidatingAdmissionPolicyStatus conditions(@jakarta.annotation.Nullable List<V1Condition> conditions) {
    this.conditions = conditions;
    return this;
  }

  public V1ValidatingAdmissionPolicyStatus addConditionsItem(V1Condition conditionsItem) {
    if (this.conditions == null) {
      this.conditions = new ArrayList<>();
    }
    this.conditions.add(conditionsItem);
    return this;
  }

  /**
   * The conditions represent the latest available observations of a policy&#39;s current state.
   * @return conditions
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "The conditions represent the latest available observations of a policy's current state.")
  public List<V1Condition> getConditions() {
    return conditions;
  }

  public void setConditions(@jakarta.annotation.Nullable List<V1Condition> conditions) {
    this.conditions = conditions;
  }


  public V1ValidatingAdmissionPolicyStatus observedGeneration(@jakarta.annotation.Nullable Long observedGeneration) {
    this.observedGeneration = observedGeneration;
    return this;
  }

  /**
   * The generation observed by the controller.
   * @return observedGeneration
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "The generation observed by the controller.")
  public Long getObservedGeneration() {
    return observedGeneration;
  }

  public void setObservedGeneration(@jakarta.annotation.Nullable Long observedGeneration) {
    this.observedGeneration = observedGeneration;
  }


  public V1ValidatingAdmissionPolicyStatus typeChecking(@jakarta.annotation.Nullable V1TypeChecking typeChecking) {
    this.typeChecking = typeChecking;
    return this;
  }

  /**
   * Get typeChecking
   * @return typeChecking
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  public V1TypeChecking getTypeChecking() {
    return typeChecking;
  }

  public void setTypeChecking(@jakarta.annotation.Nullable V1TypeChecking typeChecking) {
    this.typeChecking = typeChecking;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1ValidatingAdmissionPolicyStatus v1ValidatingAdmissionPolicyStatus = (V1ValidatingAdmissionPolicyStatus) o;
    return Objects.equals(this.conditions, v1ValidatingAdmissionPolicyStatus.conditions) &&
        Objects.equals(this.observedGeneration, v1ValidatingAdmissionPolicyStatus.observedGeneration) &&
        Objects.equals(this.typeChecking, v1ValidatingAdmissionPolicyStatus.typeChecking);
  }

  @Override
  public int hashCode() {
    return Objects.hash(conditions, observedGeneration, typeChecking);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1ValidatingAdmissionPolicyStatus {\n");
    sb.append("    conditions: ").append(toIndentedString(conditions)).append("\n");
    sb.append("    observedGeneration: ").append(toIndentedString(observedGeneration)).append("\n");
    sb.append("    typeChecking: ").append(toIndentedString(typeChecking)).append("\n");
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
    openapiFields.add("observedGeneration");
    openapiFields.add("typeChecking");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to V1ValidatingAdmissionPolicyStatus
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!V1ValidatingAdmissionPolicyStatus.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in V1ValidatingAdmissionPolicyStatus is not found in the empty JSON string", V1ValidatingAdmissionPolicyStatus.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!V1ValidatingAdmissionPolicyStatus.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `V1ValidatingAdmissionPolicyStatus` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
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
            V1Condition.validateJsonElement(jsonArrayconditions.get(i));
          };
        }
      }
      // validate the optional field `typeChecking`
      if (jsonObj.get("typeChecking") != null && !jsonObj.get("typeChecking").isJsonNull()) {
        V1TypeChecking.validateJsonElement(jsonObj.get("typeChecking"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!V1ValidatingAdmissionPolicyStatus.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'V1ValidatingAdmissionPolicyStatus' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<V1ValidatingAdmissionPolicyStatus> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(V1ValidatingAdmissionPolicyStatus.class));

       return (TypeAdapter<T>) new TypeAdapter<V1ValidatingAdmissionPolicyStatus>() {
           @Override
           public void write(JsonWriter out, V1ValidatingAdmissionPolicyStatus value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public V1ValidatingAdmissionPolicyStatus read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of V1ValidatingAdmissionPolicyStatus given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of V1ValidatingAdmissionPolicyStatus
   * @throws IOException if the JSON string is invalid with respect to V1ValidatingAdmissionPolicyStatus
   */
  public static V1ValidatingAdmissionPolicyStatus fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, V1ValidatingAdmissionPolicyStatus.class);
  }

  /**
   * Convert an instance of V1ValidatingAdmissionPolicyStatus to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
