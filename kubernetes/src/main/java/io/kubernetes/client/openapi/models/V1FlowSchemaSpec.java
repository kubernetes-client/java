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
import io.kubernetes.client.openapi.models.V1FlowDistinguisherMethod;
import io.kubernetes.client.openapi.models.V1PolicyRulesWithSubjects;
import io.kubernetes.client.openapi.models.V1PriorityLevelConfigurationReference;
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
 * FlowSchemaSpec describes how the FlowSchema&#39;s specification looks like.
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-23T13:45:09.091597Z[Etc/UTC]")
public class V1FlowSchemaSpec {
  public static final String SERIALIZED_NAME_DISTINGUISHER_METHOD = "distinguisherMethod";
  @SerializedName(SERIALIZED_NAME_DISTINGUISHER_METHOD)
  private V1FlowDistinguisherMethod distinguisherMethod;

  public static final String SERIALIZED_NAME_MATCHING_PRECEDENCE = "matchingPrecedence";
  @SerializedName(SERIALIZED_NAME_MATCHING_PRECEDENCE)
  private Integer matchingPrecedence;

  public static final String SERIALIZED_NAME_PRIORITY_LEVEL_CONFIGURATION = "priorityLevelConfiguration";
  @SerializedName(SERIALIZED_NAME_PRIORITY_LEVEL_CONFIGURATION)
  private V1PriorityLevelConfigurationReference priorityLevelConfiguration;

  public static final String SERIALIZED_NAME_RULES = "rules";
  @SerializedName(SERIALIZED_NAME_RULES)
  private List<V1PolicyRulesWithSubjects> rules;

  public V1FlowSchemaSpec() {
  }

  public V1FlowSchemaSpec distinguisherMethod(V1FlowDistinguisherMethod distinguisherMethod) {

    this.distinguisherMethod = distinguisherMethod;
    return this;
  }

   /**
   * Get distinguisherMethod
   * @return distinguisherMethod
  **/
  @jakarta.annotation.Nullable
  public V1FlowDistinguisherMethod getDistinguisherMethod() {
    return distinguisherMethod;
  }


  public void setDistinguisherMethod(V1FlowDistinguisherMethod distinguisherMethod) {
    this.distinguisherMethod = distinguisherMethod;
  }


  public V1FlowSchemaSpec matchingPrecedence(Integer matchingPrecedence) {

    this.matchingPrecedence = matchingPrecedence;
    return this;
  }

   /**
   * &#x60;matchingPrecedence&#x60; is used to choose among the FlowSchemas that match a given request. The chosen FlowSchema is among those with the numerically lowest (which we take to be logically highest) MatchingPrecedence.  Each MatchingPrecedence value must be ranged in [1,10000]. Note that if the precedence is not specified, it will be set to 1000 as default.
   * @return matchingPrecedence
  **/
  @jakarta.annotation.Nullable
  public Integer getMatchingPrecedence() {
    return matchingPrecedence;
  }


  public void setMatchingPrecedence(Integer matchingPrecedence) {
    this.matchingPrecedence = matchingPrecedence;
  }


  public V1FlowSchemaSpec priorityLevelConfiguration(V1PriorityLevelConfigurationReference priorityLevelConfiguration) {

    this.priorityLevelConfiguration = priorityLevelConfiguration;
    return this;
  }

   /**
   * Get priorityLevelConfiguration
   * @return priorityLevelConfiguration
  **/
  @jakarta.annotation.Nonnull
  public V1PriorityLevelConfigurationReference getPriorityLevelConfiguration() {
    return priorityLevelConfiguration;
  }


  public void setPriorityLevelConfiguration(V1PriorityLevelConfigurationReference priorityLevelConfiguration) {
    this.priorityLevelConfiguration = priorityLevelConfiguration;
  }


  public V1FlowSchemaSpec rules(List<V1PolicyRulesWithSubjects> rules) {

    this.rules = rules;
    return this;
  }

  public V1FlowSchemaSpec addRulesItem(V1PolicyRulesWithSubjects rulesItem) {
    if (this.rules == null) {
      this.rules = new ArrayList<>();
    }
    this.rules.add(rulesItem);
    return this;
  }

   /**
   * &#x60;rules&#x60; describes which requests will match this flow schema. This FlowSchema matches a request if and only if at least one member of rules matches the request. if it is an empty slice, there will be no requests matching the FlowSchema.
   * @return rules
  **/
  @jakarta.annotation.Nullable
  public List<V1PolicyRulesWithSubjects> getRules() {
    return rules;
  }


  public void setRules(List<V1PolicyRulesWithSubjects> rules) {
    this.rules = rules;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1FlowSchemaSpec v1FlowSchemaSpec = (V1FlowSchemaSpec) o;
    return Objects.equals(this.distinguisherMethod, v1FlowSchemaSpec.distinguisherMethod) &&
        Objects.equals(this.matchingPrecedence, v1FlowSchemaSpec.matchingPrecedence) &&
        Objects.equals(this.priorityLevelConfiguration, v1FlowSchemaSpec.priorityLevelConfiguration) &&
        Objects.equals(this.rules, v1FlowSchemaSpec.rules);
  }

  @Override
  public int hashCode() {
    return Objects.hash(distinguisherMethod, matchingPrecedence, priorityLevelConfiguration, rules);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1FlowSchemaSpec {\n");
    sb.append("    distinguisherMethod: ").append(toIndentedString(distinguisherMethod)).append("\n");
    sb.append("    matchingPrecedence: ").append(toIndentedString(matchingPrecedence)).append("\n");
    sb.append("    priorityLevelConfiguration: ").append(toIndentedString(priorityLevelConfiguration)).append("\n");
    sb.append("    rules: ").append(toIndentedString(rules)).append("\n");
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
    openapiFields.add("distinguisherMethod");
    openapiFields.add("matchingPrecedence");
    openapiFields.add("priorityLevelConfiguration");
    openapiFields.add("rules");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("priorityLevelConfiguration");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to V1FlowSchemaSpec
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!V1FlowSchemaSpec.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in V1FlowSchemaSpec is not found in the empty JSON string", V1FlowSchemaSpec.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!V1FlowSchemaSpec.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `V1FlowSchemaSpec` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : V1FlowSchemaSpec.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      // validate the optional field `distinguisherMethod`
      if (jsonObj.get("distinguisherMethod") != null && !jsonObj.get("distinguisherMethod").isJsonNull()) {
        V1FlowDistinguisherMethod.validateJsonObject(jsonObj.getAsJsonObject("distinguisherMethod"));
      }
      // validate the required field `priorityLevelConfiguration`
      V1PriorityLevelConfigurationReference.validateJsonObject(jsonObj.getAsJsonObject("priorityLevelConfiguration"));
      if (jsonObj.get("rules") != null && !jsonObj.get("rules").isJsonNull()) {
        JsonArray jsonArrayrules = jsonObj.getAsJsonArray("rules");
        if (jsonArrayrules != null) {
          // ensure the json data is an array
          if (!jsonObj.get("rules").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `rules` to be an array in the JSON string but got `%s`", jsonObj.get("rules").toString()));
          }

          // validate the optional field `rules` (array)
          for (int i = 0; i < jsonArrayrules.size(); i++) {
            V1PolicyRulesWithSubjects.validateJsonObject(jsonArrayrules.get(i).getAsJsonObject());
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!V1FlowSchemaSpec.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'V1FlowSchemaSpec' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<V1FlowSchemaSpec> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(V1FlowSchemaSpec.class));

       return (TypeAdapter<T>) new TypeAdapter<V1FlowSchemaSpec>() {
           @Override
           public void write(JsonWriter out, V1FlowSchemaSpec value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public V1FlowSchemaSpec read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of V1FlowSchemaSpec given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of V1FlowSchemaSpec
  * @throws IOException if the JSON string is invalid with respect to V1FlowSchemaSpec
  */
  public static V1FlowSchemaSpec fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, V1FlowSchemaSpec.class);
  }

 /**
  * Convert an instance of V1FlowSchemaSpec to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
