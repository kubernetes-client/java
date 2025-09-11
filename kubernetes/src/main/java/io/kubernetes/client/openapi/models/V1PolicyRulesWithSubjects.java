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
import io.kubernetes.client.openapi.models.FlowcontrolV1Subject;
import io.kubernetes.client.openapi.models.V1NonResourcePolicyRule;
import io.kubernetes.client.openapi.models.V1ResourcePolicyRule;
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
 * PolicyRulesWithSubjects prescribes a test that applies to a request to an apiserver. The test considers the subject making the request, the verb being requested, and the resource to be acted upon. This PolicyRulesWithSubjects matches a request if and only if both (a) at least one member of subjects matches the request and (b) at least one member of resourceRules or nonResourceRules matches the request.
 */
@ApiModel(description = "PolicyRulesWithSubjects prescribes a test that applies to a request to an apiserver. The test considers the subject making the request, the verb being requested, and the resource to be acted upon. This PolicyRulesWithSubjects matches a request if and only if both (a) at least one member of subjects matches the request and (b) at least one member of resourceRules or nonResourceRules matches the request.")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-09-11T18:00:16.154662Z[Etc/UTC]", comments = "Generator version: 7.13.0")
public class V1PolicyRulesWithSubjects {
  public static final String SERIALIZED_NAME_NON_RESOURCE_RULES = "nonResourceRules";
  @SerializedName(SERIALIZED_NAME_NON_RESOURCE_RULES)
  @jakarta.annotation.Nullable
  private List<V1NonResourcePolicyRule> nonResourceRules = new ArrayList<>();

  public static final String SERIALIZED_NAME_RESOURCE_RULES = "resourceRules";
  @SerializedName(SERIALIZED_NAME_RESOURCE_RULES)
  @jakarta.annotation.Nullable
  private List<V1ResourcePolicyRule> resourceRules = new ArrayList<>();

  public static final String SERIALIZED_NAME_SUBJECTS = "subjects";
  @SerializedName(SERIALIZED_NAME_SUBJECTS)
  @jakarta.annotation.Nonnull
  private List<FlowcontrolV1Subject> subjects = new ArrayList<>();

  public V1PolicyRulesWithSubjects() {
  }

  public V1PolicyRulesWithSubjects nonResourceRules(@jakarta.annotation.Nullable List<V1NonResourcePolicyRule> nonResourceRules) {
    this.nonResourceRules = nonResourceRules;
    return this;
  }

  public V1PolicyRulesWithSubjects addNonResourceRulesItem(V1NonResourcePolicyRule nonResourceRulesItem) {
    if (this.nonResourceRules == null) {
      this.nonResourceRules = new ArrayList<>();
    }
    this.nonResourceRules.add(nonResourceRulesItem);
    return this;
  }

  /**
   * &#x60;nonResourceRules&#x60; is a list of NonResourcePolicyRules that identify matching requests according to their verb and the target non-resource URL.
   * @return nonResourceRules
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "`nonResourceRules` is a list of NonResourcePolicyRules that identify matching requests according to their verb and the target non-resource URL.")
  public List<V1NonResourcePolicyRule> getNonResourceRules() {
    return nonResourceRules;
  }

  public void setNonResourceRules(@jakarta.annotation.Nullable List<V1NonResourcePolicyRule> nonResourceRules) {
    this.nonResourceRules = nonResourceRules;
  }


  public V1PolicyRulesWithSubjects resourceRules(@jakarta.annotation.Nullable List<V1ResourcePolicyRule> resourceRules) {
    this.resourceRules = resourceRules;
    return this;
  }

  public V1PolicyRulesWithSubjects addResourceRulesItem(V1ResourcePolicyRule resourceRulesItem) {
    if (this.resourceRules == null) {
      this.resourceRules = new ArrayList<>();
    }
    this.resourceRules.add(resourceRulesItem);
    return this;
  }

  /**
   * &#x60;resourceRules&#x60; is a slice of ResourcePolicyRules that identify matching requests according to their verb and the target resource. At least one of &#x60;resourceRules&#x60; and &#x60;nonResourceRules&#x60; has to be non-empty.
   * @return resourceRules
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "`resourceRules` is a slice of ResourcePolicyRules that identify matching requests according to their verb and the target resource. At least one of `resourceRules` and `nonResourceRules` has to be non-empty.")
  public List<V1ResourcePolicyRule> getResourceRules() {
    return resourceRules;
  }

  public void setResourceRules(@jakarta.annotation.Nullable List<V1ResourcePolicyRule> resourceRules) {
    this.resourceRules = resourceRules;
  }


  public V1PolicyRulesWithSubjects subjects(@jakarta.annotation.Nonnull List<FlowcontrolV1Subject> subjects) {
    this.subjects = subjects;
    return this;
  }

  public V1PolicyRulesWithSubjects addSubjectsItem(FlowcontrolV1Subject subjectsItem) {
    if (this.subjects == null) {
      this.subjects = new ArrayList<>();
    }
    this.subjects.add(subjectsItem);
    return this;
  }

  /**
   * subjects is the list of normal user, serviceaccount, or group that this rule cares about. There must be at least one member in this slice. A slice that includes both the system:authenticated and system:unauthenticated user groups matches every request. Required.
   * @return subjects
   */
  @jakarta.annotation.Nonnull
  @ApiModelProperty(required = true, value = "subjects is the list of normal user, serviceaccount, or group that this rule cares about. There must be at least one member in this slice. A slice that includes both the system:authenticated and system:unauthenticated user groups matches every request. Required.")
  public List<FlowcontrolV1Subject> getSubjects() {
    return subjects;
  }

  public void setSubjects(@jakarta.annotation.Nonnull List<FlowcontrolV1Subject> subjects) {
    this.subjects = subjects;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1PolicyRulesWithSubjects v1PolicyRulesWithSubjects = (V1PolicyRulesWithSubjects) o;
    return Objects.equals(this.nonResourceRules, v1PolicyRulesWithSubjects.nonResourceRules) &&
        Objects.equals(this.resourceRules, v1PolicyRulesWithSubjects.resourceRules) &&
        Objects.equals(this.subjects, v1PolicyRulesWithSubjects.subjects);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nonResourceRules, resourceRules, subjects);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1PolicyRulesWithSubjects {\n");
    sb.append("    nonResourceRules: ").append(toIndentedString(nonResourceRules)).append("\n");
    sb.append("    resourceRules: ").append(toIndentedString(resourceRules)).append("\n");
    sb.append("    subjects: ").append(toIndentedString(subjects)).append("\n");
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
    openapiFields.add("nonResourceRules");
    openapiFields.add("resourceRules");
    openapiFields.add("subjects");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("subjects");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to V1PolicyRulesWithSubjects
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!V1PolicyRulesWithSubjects.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in V1PolicyRulesWithSubjects is not found in the empty JSON string", V1PolicyRulesWithSubjects.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!V1PolicyRulesWithSubjects.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `V1PolicyRulesWithSubjects` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : V1PolicyRulesWithSubjects.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (jsonObj.get("nonResourceRules") != null && !jsonObj.get("nonResourceRules").isJsonNull()) {
        JsonArray jsonArraynonResourceRules = jsonObj.getAsJsonArray("nonResourceRules");
        if (jsonArraynonResourceRules != null) {
          // ensure the json data is an array
          if (!jsonObj.get("nonResourceRules").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `nonResourceRules` to be an array in the JSON string but got `%s`", jsonObj.get("nonResourceRules").toString()));
          }

          // validate the optional field `nonResourceRules` (array)
          for (int i = 0; i < jsonArraynonResourceRules.size(); i++) {
            V1NonResourcePolicyRule.validateJsonElement(jsonArraynonResourceRules.get(i));
          };
        }
      }
      if (jsonObj.get("resourceRules") != null && !jsonObj.get("resourceRules").isJsonNull()) {
        JsonArray jsonArrayresourceRules = jsonObj.getAsJsonArray("resourceRules");
        if (jsonArrayresourceRules != null) {
          // ensure the json data is an array
          if (!jsonObj.get("resourceRules").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `resourceRules` to be an array in the JSON string but got `%s`", jsonObj.get("resourceRules").toString()));
          }

          // validate the optional field `resourceRules` (array)
          for (int i = 0; i < jsonArrayresourceRules.size(); i++) {
            V1ResourcePolicyRule.validateJsonElement(jsonArrayresourceRules.get(i));
          };
        }
      }
      // ensure the json data is an array
      if (!jsonObj.get("subjects").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `subjects` to be an array in the JSON string but got `%s`", jsonObj.get("subjects").toString()));
      }

      JsonArray jsonArraysubjects = jsonObj.getAsJsonArray("subjects");
      // validate the required field `subjects` (array)
      for (int i = 0; i < jsonArraysubjects.size(); i++) {
        FlowcontrolV1Subject.validateJsonElement(jsonArraysubjects.get(i));
      };
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!V1PolicyRulesWithSubjects.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'V1PolicyRulesWithSubjects' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<V1PolicyRulesWithSubjects> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(V1PolicyRulesWithSubjects.class));

       return (TypeAdapter<T>) new TypeAdapter<V1PolicyRulesWithSubjects>() {
           @Override
           public void write(JsonWriter out, V1PolicyRulesWithSubjects value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public V1PolicyRulesWithSubjects read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of V1PolicyRulesWithSubjects given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of V1PolicyRulesWithSubjects
   * @throws IOException if the JSON string is invalid with respect to V1PolicyRulesWithSubjects
   */
  public static V1PolicyRulesWithSubjects fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, V1PolicyRulesWithSubjects.class);
  }

  /**
   * Convert an instance of V1PolicyRulesWithSubjects to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
