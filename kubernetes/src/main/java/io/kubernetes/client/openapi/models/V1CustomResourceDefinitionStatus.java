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
import io.kubernetes.client.openapi.models.V1CustomResourceDefinitionCondition;
import io.kubernetes.client.openapi.models.V1CustomResourceDefinitionNames;
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
 * CustomResourceDefinitionStatus indicates the state of the CustomResourceDefinition
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-23T13:45:09.091597Z[Etc/UTC]")
public class V1CustomResourceDefinitionStatus {
  public static final String SERIALIZED_NAME_ACCEPTED_NAMES = "acceptedNames";
  @SerializedName(SERIALIZED_NAME_ACCEPTED_NAMES)
  private V1CustomResourceDefinitionNames acceptedNames;

  public static final String SERIALIZED_NAME_CONDITIONS = "conditions";
  @SerializedName(SERIALIZED_NAME_CONDITIONS)
  private List<V1CustomResourceDefinitionCondition> conditions;

  public static final String SERIALIZED_NAME_STORED_VERSIONS = "storedVersions";
  @SerializedName(SERIALIZED_NAME_STORED_VERSIONS)
  private List<String> storedVersions;

  public V1CustomResourceDefinitionStatus() {
  }

  public V1CustomResourceDefinitionStatus acceptedNames(V1CustomResourceDefinitionNames acceptedNames) {

    this.acceptedNames = acceptedNames;
    return this;
  }

   /**
   * Get acceptedNames
   * @return acceptedNames
  **/
  @jakarta.annotation.Nullable
  public V1CustomResourceDefinitionNames getAcceptedNames() {
    return acceptedNames;
  }


  public void setAcceptedNames(V1CustomResourceDefinitionNames acceptedNames) {
    this.acceptedNames = acceptedNames;
  }


  public V1CustomResourceDefinitionStatus conditions(List<V1CustomResourceDefinitionCondition> conditions) {

    this.conditions = conditions;
    return this;
  }

  public V1CustomResourceDefinitionStatus addConditionsItem(V1CustomResourceDefinitionCondition conditionsItem) {
    if (this.conditions == null) {
      this.conditions = new ArrayList<>();
    }
    this.conditions.add(conditionsItem);
    return this;
  }

   /**
   * conditions indicate state for particular aspects of a CustomResourceDefinition
   * @return conditions
  **/
  @jakarta.annotation.Nullable
  public List<V1CustomResourceDefinitionCondition> getConditions() {
    return conditions;
  }


  public void setConditions(List<V1CustomResourceDefinitionCondition> conditions) {
    this.conditions = conditions;
  }


  public V1CustomResourceDefinitionStatus storedVersions(List<String> storedVersions) {

    this.storedVersions = storedVersions;
    return this;
  }

  public V1CustomResourceDefinitionStatus addStoredVersionsItem(String storedVersionsItem) {
    if (this.storedVersions == null) {
      this.storedVersions = new ArrayList<>();
    }
    this.storedVersions.add(storedVersionsItem);
    return this;
  }

   /**
   * storedVersions lists all versions of CustomResources that were ever persisted. Tracking these versions allows a migration path for stored versions in etcd. The field is mutable so a migration controller can finish a migration to another version (ensuring no old objects are left in storage), and then remove the rest of the versions from this list. Versions may not be removed from &#x60;spec.versions&#x60; while they exist in this list.
   * @return storedVersions
  **/
  @jakarta.annotation.Nullable
  public List<String> getStoredVersions() {
    return storedVersions;
  }


  public void setStoredVersions(List<String> storedVersions) {
    this.storedVersions = storedVersions;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1CustomResourceDefinitionStatus v1CustomResourceDefinitionStatus = (V1CustomResourceDefinitionStatus) o;
    return Objects.equals(this.acceptedNames, v1CustomResourceDefinitionStatus.acceptedNames) &&
        Objects.equals(this.conditions, v1CustomResourceDefinitionStatus.conditions) &&
        Objects.equals(this.storedVersions, v1CustomResourceDefinitionStatus.storedVersions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(acceptedNames, conditions, storedVersions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1CustomResourceDefinitionStatus {\n");
    sb.append("    acceptedNames: ").append(toIndentedString(acceptedNames)).append("\n");
    sb.append("    conditions: ").append(toIndentedString(conditions)).append("\n");
    sb.append("    storedVersions: ").append(toIndentedString(storedVersions)).append("\n");
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
    openapiFields.add("acceptedNames");
    openapiFields.add("conditions");
    openapiFields.add("storedVersions");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to V1CustomResourceDefinitionStatus
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!V1CustomResourceDefinitionStatus.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in V1CustomResourceDefinitionStatus is not found in the empty JSON string", V1CustomResourceDefinitionStatus.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!V1CustomResourceDefinitionStatus.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `V1CustomResourceDefinitionStatus` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      // validate the optional field `acceptedNames`
      if (jsonObj.get("acceptedNames") != null && !jsonObj.get("acceptedNames").isJsonNull()) {
        V1CustomResourceDefinitionNames.validateJsonObject(jsonObj.getAsJsonObject("acceptedNames"));
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
            V1CustomResourceDefinitionCondition.validateJsonObject(jsonArrayconditions.get(i).getAsJsonObject());
          };
        }
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("storedVersions") != null && !jsonObj.get("storedVersions").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `storedVersions` to be an array in the JSON string but got `%s`", jsonObj.get("storedVersions").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!V1CustomResourceDefinitionStatus.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'V1CustomResourceDefinitionStatus' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<V1CustomResourceDefinitionStatus> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(V1CustomResourceDefinitionStatus.class));

       return (TypeAdapter<T>) new TypeAdapter<V1CustomResourceDefinitionStatus>() {
           @Override
           public void write(JsonWriter out, V1CustomResourceDefinitionStatus value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public V1CustomResourceDefinitionStatus read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of V1CustomResourceDefinitionStatus given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of V1CustomResourceDefinitionStatus
  * @throws IOException if the JSON string is invalid with respect to V1CustomResourceDefinitionStatus
  */
  public static V1CustomResourceDefinitionStatus fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, V1CustomResourceDefinitionStatus.class);
  }

 /**
  * Convert an instance of V1CustomResourceDefinitionStatus to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
