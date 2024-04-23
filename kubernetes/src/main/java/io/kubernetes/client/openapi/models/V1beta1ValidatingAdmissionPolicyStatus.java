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
import io.kubernetes.client.openapi.models.V1beta1TypeChecking;
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
 * ValidatingAdmissionPolicyStatus represents the status of an admission validation policy.
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-23T13:45:09.091597Z[Etc/UTC]")
public class V1beta1ValidatingAdmissionPolicyStatus {
  public static final String SERIALIZED_NAME_CONDITIONS = "conditions";
  @SerializedName(SERIALIZED_NAME_CONDITIONS)
  private List<V1Condition> conditions;

  public static final String SERIALIZED_NAME_OBSERVED_GENERATION = "observedGeneration";
  @SerializedName(SERIALIZED_NAME_OBSERVED_GENERATION)
  private Long observedGeneration;

  public static final String SERIALIZED_NAME_TYPE_CHECKING = "typeChecking";
  @SerializedName(SERIALIZED_NAME_TYPE_CHECKING)
  private V1beta1TypeChecking typeChecking;

  public V1beta1ValidatingAdmissionPolicyStatus() {
  }

  public V1beta1ValidatingAdmissionPolicyStatus conditions(List<V1Condition> conditions) {

    this.conditions = conditions;
    return this;
  }

  public V1beta1ValidatingAdmissionPolicyStatus addConditionsItem(V1Condition conditionsItem) {
    if (this.conditions == null) {
      this.conditions = new ArrayList<>();
    }
    this.conditions.add(conditionsItem);
    return this;
  }

   /**
   * The conditions represent the latest available observations of a policy&#39;s current state.
   * @return conditions
  **/
  @jakarta.annotation.Nullable
  public List<V1Condition> getConditions() {
    return conditions;
  }


  public void setConditions(List<V1Condition> conditions) {
    this.conditions = conditions;
  }


  public V1beta1ValidatingAdmissionPolicyStatus observedGeneration(Long observedGeneration) {

    this.observedGeneration = observedGeneration;
    return this;
  }

   /**
   * The generation observed by the controller.
   * @return observedGeneration
  **/
  @jakarta.annotation.Nullable
  public Long getObservedGeneration() {
    return observedGeneration;
  }


  public void setObservedGeneration(Long observedGeneration) {
    this.observedGeneration = observedGeneration;
  }


  public V1beta1ValidatingAdmissionPolicyStatus typeChecking(V1beta1TypeChecking typeChecking) {

    this.typeChecking = typeChecking;
    return this;
  }

   /**
   * Get typeChecking
   * @return typeChecking
  **/
  @jakarta.annotation.Nullable
  public V1beta1TypeChecking getTypeChecking() {
    return typeChecking;
  }


  public void setTypeChecking(V1beta1TypeChecking typeChecking) {
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
    V1beta1ValidatingAdmissionPolicyStatus v1beta1ValidatingAdmissionPolicyStatus = (V1beta1ValidatingAdmissionPolicyStatus) o;
    return Objects.equals(this.conditions, v1beta1ValidatingAdmissionPolicyStatus.conditions) &&
        Objects.equals(this.observedGeneration, v1beta1ValidatingAdmissionPolicyStatus.observedGeneration) &&
        Objects.equals(this.typeChecking, v1beta1ValidatingAdmissionPolicyStatus.typeChecking);
  }

  @Override
  public int hashCode() {
    return Objects.hash(conditions, observedGeneration, typeChecking);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1beta1ValidatingAdmissionPolicyStatus {\n");
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
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to V1beta1ValidatingAdmissionPolicyStatus
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!V1beta1ValidatingAdmissionPolicyStatus.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in V1beta1ValidatingAdmissionPolicyStatus is not found in the empty JSON string", V1beta1ValidatingAdmissionPolicyStatus.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!V1beta1ValidatingAdmissionPolicyStatus.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `V1beta1ValidatingAdmissionPolicyStatus` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
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
      // validate the optional field `typeChecking`
      if (jsonObj.get("typeChecking") != null && !jsonObj.get("typeChecking").isJsonNull()) {
        V1beta1TypeChecking.validateJsonObject(jsonObj.getAsJsonObject("typeChecking"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!V1beta1ValidatingAdmissionPolicyStatus.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'V1beta1ValidatingAdmissionPolicyStatus' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<V1beta1ValidatingAdmissionPolicyStatus> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(V1beta1ValidatingAdmissionPolicyStatus.class));

       return (TypeAdapter<T>) new TypeAdapter<V1beta1ValidatingAdmissionPolicyStatus>() {
           @Override
           public void write(JsonWriter out, V1beta1ValidatingAdmissionPolicyStatus value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public V1beta1ValidatingAdmissionPolicyStatus read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of V1beta1ValidatingAdmissionPolicyStatus given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of V1beta1ValidatingAdmissionPolicyStatus
  * @throws IOException if the JSON string is invalid with respect to V1beta1ValidatingAdmissionPolicyStatus
  */
  public static V1beta1ValidatingAdmissionPolicyStatus fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, V1beta1ValidatingAdmissionPolicyStatus.class);
  }

 /**
  * Convert an instance of V1beta1ValidatingAdmissionPolicyStatus to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
