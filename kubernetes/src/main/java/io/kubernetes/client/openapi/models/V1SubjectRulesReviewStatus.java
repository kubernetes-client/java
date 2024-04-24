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
import io.kubernetes.client.openapi.models.V1NonResourceRule;
import io.kubernetes.client.openapi.models.V1ResourceRule;
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
 * SubjectRulesReviewStatus contains the result of a rules check. This check can be incomplete depending on the set of authorizers the server is configured with and any errors experienced during evaluation. Because authorization rules are additive, if a rule appears in a list it&#39;s safe to assume the subject has that permission, even if that list is incomplete.
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-23T13:45:09.091597Z[Etc/UTC]")
public class V1SubjectRulesReviewStatus {
  public static final String SERIALIZED_NAME_EVALUATION_ERROR = "evaluationError";
  @SerializedName(SERIALIZED_NAME_EVALUATION_ERROR)
  private String evaluationError;

  public static final String SERIALIZED_NAME_INCOMPLETE = "incomplete";
  @SerializedName(SERIALIZED_NAME_INCOMPLETE)
  private Boolean incomplete;

  public static final String SERIALIZED_NAME_NON_RESOURCE_RULES = "nonResourceRules";
  @SerializedName(SERIALIZED_NAME_NON_RESOURCE_RULES)
  private List<V1NonResourceRule> nonResourceRules = new ArrayList<>();

  public static final String SERIALIZED_NAME_RESOURCE_RULES = "resourceRules";
  @SerializedName(SERIALIZED_NAME_RESOURCE_RULES)
  private List<V1ResourceRule> resourceRules = new ArrayList<>();

  public V1SubjectRulesReviewStatus() {
  }

  public V1SubjectRulesReviewStatus evaluationError(String evaluationError) {

    this.evaluationError = evaluationError;
    return this;
  }

   /**
   * EvaluationError can appear in combination with Rules. It indicates an error occurred during rule evaluation, such as an authorizer that doesn&#39;t support rule evaluation, and that ResourceRules and/or NonResourceRules may be incomplete.
   * @return evaluationError
  **/
  @jakarta.annotation.Nullable
  public String getEvaluationError() {
    return evaluationError;
  }


  public void setEvaluationError(String evaluationError) {
    this.evaluationError = evaluationError;
  }


  public V1SubjectRulesReviewStatus incomplete(Boolean incomplete) {

    this.incomplete = incomplete;
    return this;
  }

   /**
   * Incomplete is true when the rules returned by this call are incomplete. This is most commonly encountered when an authorizer, such as an external authorizer, doesn&#39;t support rules evaluation.
   * @return incomplete
  **/
  @jakarta.annotation.Nonnull
  public Boolean getIncomplete() {
    return incomplete;
  }


  public void setIncomplete(Boolean incomplete) {
    this.incomplete = incomplete;
  }


  public V1SubjectRulesReviewStatus nonResourceRules(List<V1NonResourceRule> nonResourceRules) {

    this.nonResourceRules = nonResourceRules;
    return this;
  }

  public V1SubjectRulesReviewStatus addNonResourceRulesItem(V1NonResourceRule nonResourceRulesItem) {
    if (this.nonResourceRules == null) {
      this.nonResourceRules = new ArrayList<>();
    }
    this.nonResourceRules.add(nonResourceRulesItem);
    return this;
  }

   /**
   * NonResourceRules is the list of actions the subject is allowed to perform on non-resources. The list ordering isn&#39;t significant, may contain duplicates, and possibly be incomplete.
   * @return nonResourceRules
  **/
  @jakarta.annotation.Nonnull
  public List<V1NonResourceRule> getNonResourceRules() {
    return nonResourceRules;
  }


  public void setNonResourceRules(List<V1NonResourceRule> nonResourceRules) {
    this.nonResourceRules = nonResourceRules;
  }


  public V1SubjectRulesReviewStatus resourceRules(List<V1ResourceRule> resourceRules) {

    this.resourceRules = resourceRules;
    return this;
  }

  public V1SubjectRulesReviewStatus addResourceRulesItem(V1ResourceRule resourceRulesItem) {
    if (this.resourceRules == null) {
      this.resourceRules = new ArrayList<>();
    }
    this.resourceRules.add(resourceRulesItem);
    return this;
  }

   /**
   * ResourceRules is the list of actions the subject is allowed to perform on resources. The list ordering isn&#39;t significant, may contain duplicates, and possibly be incomplete.
   * @return resourceRules
  **/
  @jakarta.annotation.Nonnull
  public List<V1ResourceRule> getResourceRules() {
    return resourceRules;
  }


  public void setResourceRules(List<V1ResourceRule> resourceRules) {
    this.resourceRules = resourceRules;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1SubjectRulesReviewStatus v1SubjectRulesReviewStatus = (V1SubjectRulesReviewStatus) o;
    return Objects.equals(this.evaluationError, v1SubjectRulesReviewStatus.evaluationError) &&
        Objects.equals(this.incomplete, v1SubjectRulesReviewStatus.incomplete) &&
        Objects.equals(this.nonResourceRules, v1SubjectRulesReviewStatus.nonResourceRules) &&
        Objects.equals(this.resourceRules, v1SubjectRulesReviewStatus.resourceRules);
  }

  @Override
  public int hashCode() {
    return Objects.hash(evaluationError, incomplete, nonResourceRules, resourceRules);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1SubjectRulesReviewStatus {\n");
    sb.append("    evaluationError: ").append(toIndentedString(evaluationError)).append("\n");
    sb.append("    incomplete: ").append(toIndentedString(incomplete)).append("\n");
    sb.append("    nonResourceRules: ").append(toIndentedString(nonResourceRules)).append("\n");
    sb.append("    resourceRules: ").append(toIndentedString(resourceRules)).append("\n");
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
    openapiFields.add("evaluationError");
    openapiFields.add("incomplete");
    openapiFields.add("nonResourceRules");
    openapiFields.add("resourceRules");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("incomplete");
    openapiRequiredFields.add("nonResourceRules");
    openapiRequiredFields.add("resourceRules");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to V1SubjectRulesReviewStatus
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!V1SubjectRulesReviewStatus.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in V1SubjectRulesReviewStatus is not found in the empty JSON string", V1SubjectRulesReviewStatus.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!V1SubjectRulesReviewStatus.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `V1SubjectRulesReviewStatus` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : V1SubjectRulesReviewStatus.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if ((jsonObj.get("evaluationError") != null && !jsonObj.get("evaluationError").isJsonNull()) && !jsonObj.get("evaluationError").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `evaluationError` to be a primitive type in the JSON string but got `%s`", jsonObj.get("evaluationError").toString()));
      }
      // ensure the json data is an array
      if (!jsonObj.get("nonResourceRules").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `nonResourceRules` to be an array in the JSON string but got `%s`", jsonObj.get("nonResourceRules").toString()));
      }

      JsonArray jsonArraynonResourceRules = jsonObj.getAsJsonArray("nonResourceRules");
      // validate the required field `nonResourceRules` (array)
      for (int i = 0; i < jsonArraynonResourceRules.size(); i++) {
        V1NonResourceRule.validateJsonObject(jsonArraynonResourceRules.get(i).getAsJsonObject());
      };
      // ensure the json data is an array
      if (!jsonObj.get("resourceRules").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `resourceRules` to be an array in the JSON string but got `%s`", jsonObj.get("resourceRules").toString()));
      }

      JsonArray jsonArrayresourceRules = jsonObj.getAsJsonArray("resourceRules");
      // validate the required field `resourceRules` (array)
      for (int i = 0; i < jsonArrayresourceRules.size(); i++) {
        V1ResourceRule.validateJsonObject(jsonArrayresourceRules.get(i).getAsJsonObject());
      };
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!V1SubjectRulesReviewStatus.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'V1SubjectRulesReviewStatus' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<V1SubjectRulesReviewStatus> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(V1SubjectRulesReviewStatus.class));

       return (TypeAdapter<T>) new TypeAdapter<V1SubjectRulesReviewStatus>() {
           @Override
           public void write(JsonWriter out, V1SubjectRulesReviewStatus value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public V1SubjectRulesReviewStatus read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of V1SubjectRulesReviewStatus given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of V1SubjectRulesReviewStatus
  * @throws IOException if the JSON string is invalid with respect to V1SubjectRulesReviewStatus
  */
  public static V1SubjectRulesReviewStatus fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, V1SubjectRulesReviewStatus.class);
  }

 /**
  * Convert an instance of V1SubjectRulesReviewStatus to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
