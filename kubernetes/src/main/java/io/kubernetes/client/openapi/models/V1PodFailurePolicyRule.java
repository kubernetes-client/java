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
import io.kubernetes.client.openapi.models.V1PodFailurePolicyOnExitCodesRequirement;
import io.kubernetes.client.openapi.models.V1PodFailurePolicyOnPodConditionsPattern;
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
 * PodFailurePolicyRule describes how a pod failure is handled when the requirements are met. One of onExitCodes and onPodConditions, but not both, can be used in each rule.
 */
@ApiModel(description = "PodFailurePolicyRule describes how a pod failure is handled when the requirements are met. One of onExitCodes and onPodConditions, but not both, can be used in each rule.")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-09-11T18:00:16.154662Z[Etc/UTC]", comments = "Generator version: 7.13.0")
public class V1PodFailurePolicyRule {
  public static final String SERIALIZED_NAME_ACTION = "action";
  @SerializedName(SERIALIZED_NAME_ACTION)
  @jakarta.annotation.Nonnull
  private String action;

  public static final String SERIALIZED_NAME_ON_EXIT_CODES = "onExitCodes";
  @SerializedName(SERIALIZED_NAME_ON_EXIT_CODES)
  @jakarta.annotation.Nullable
  private V1PodFailurePolicyOnExitCodesRequirement onExitCodes;

  public static final String SERIALIZED_NAME_ON_POD_CONDITIONS = "onPodConditions";
  @SerializedName(SERIALIZED_NAME_ON_POD_CONDITIONS)
  @jakarta.annotation.Nullable
  private List<V1PodFailurePolicyOnPodConditionsPattern> onPodConditions = new ArrayList<>();

  public V1PodFailurePolicyRule() {
  }

  public V1PodFailurePolicyRule action(@jakarta.annotation.Nonnull String action) {
    this.action = action;
    return this;
  }

  /**
   * Specifies the action taken on a pod failure when the requirements are satisfied. Possible values are:  - FailJob: indicates that the pod&#39;s job is marked as Failed and all   running pods are terminated. - FailIndex: indicates that the pod&#39;s index is marked as Failed and will   not be restarted. - Ignore: indicates that the counter towards the .backoffLimit is not   incremented and a replacement pod is created. - Count: indicates that the pod is handled in the default way - the   counter towards the .backoffLimit is incremented. Additional values are considered to be added in the future. Clients should react to an unknown action by skipping the rule.
   * @return action
   */
  @jakarta.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Specifies the action taken on a pod failure when the requirements are satisfied. Possible values are:  - FailJob: indicates that the pod's job is marked as Failed and all   running pods are terminated. - FailIndex: indicates that the pod's index is marked as Failed and will   not be restarted. - Ignore: indicates that the counter towards the .backoffLimit is not   incremented and a replacement pod is created. - Count: indicates that the pod is handled in the default way - the   counter towards the .backoffLimit is incremented. Additional values are considered to be added in the future. Clients should react to an unknown action by skipping the rule.")
  public String getAction() {
    return action;
  }

  public void setAction(@jakarta.annotation.Nonnull String action) {
    this.action = action;
  }


  public V1PodFailurePolicyRule onExitCodes(@jakarta.annotation.Nullable V1PodFailurePolicyOnExitCodesRequirement onExitCodes) {
    this.onExitCodes = onExitCodes;
    return this;
  }

  /**
   * Get onExitCodes
   * @return onExitCodes
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  public V1PodFailurePolicyOnExitCodesRequirement getOnExitCodes() {
    return onExitCodes;
  }

  public void setOnExitCodes(@jakarta.annotation.Nullable V1PodFailurePolicyOnExitCodesRequirement onExitCodes) {
    this.onExitCodes = onExitCodes;
  }


  public V1PodFailurePolicyRule onPodConditions(@jakarta.annotation.Nullable List<V1PodFailurePolicyOnPodConditionsPattern> onPodConditions) {
    this.onPodConditions = onPodConditions;
    return this;
  }

  public V1PodFailurePolicyRule addOnPodConditionsItem(V1PodFailurePolicyOnPodConditionsPattern onPodConditionsItem) {
    if (this.onPodConditions == null) {
      this.onPodConditions = new ArrayList<>();
    }
    this.onPodConditions.add(onPodConditionsItem);
    return this;
  }

  /**
   * Represents the requirement on the pod conditions. The requirement is represented as a list of pod condition patterns. The requirement is satisfied if at least one pattern matches an actual pod condition. At most 20 elements are allowed.
   * @return onPodConditions
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "Represents the requirement on the pod conditions. The requirement is represented as a list of pod condition patterns. The requirement is satisfied if at least one pattern matches an actual pod condition. At most 20 elements are allowed.")
  public List<V1PodFailurePolicyOnPodConditionsPattern> getOnPodConditions() {
    return onPodConditions;
  }

  public void setOnPodConditions(@jakarta.annotation.Nullable List<V1PodFailurePolicyOnPodConditionsPattern> onPodConditions) {
    this.onPodConditions = onPodConditions;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1PodFailurePolicyRule v1PodFailurePolicyRule = (V1PodFailurePolicyRule) o;
    return Objects.equals(this.action, v1PodFailurePolicyRule.action) &&
        Objects.equals(this.onExitCodes, v1PodFailurePolicyRule.onExitCodes) &&
        Objects.equals(this.onPodConditions, v1PodFailurePolicyRule.onPodConditions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(action, onExitCodes, onPodConditions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1PodFailurePolicyRule {\n");
    sb.append("    action: ").append(toIndentedString(action)).append("\n");
    sb.append("    onExitCodes: ").append(toIndentedString(onExitCodes)).append("\n");
    sb.append("    onPodConditions: ").append(toIndentedString(onPodConditions)).append("\n");
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
    openapiFields.add("action");
    openapiFields.add("onExitCodes");
    openapiFields.add("onPodConditions");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("action");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to V1PodFailurePolicyRule
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!V1PodFailurePolicyRule.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in V1PodFailurePolicyRule is not found in the empty JSON string", V1PodFailurePolicyRule.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!V1PodFailurePolicyRule.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `V1PodFailurePolicyRule` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : V1PodFailurePolicyRule.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("action").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `action` to be a primitive type in the JSON string but got `%s`", jsonObj.get("action").toString()));
      }
      // validate the optional field `onExitCodes`
      if (jsonObj.get("onExitCodes") != null && !jsonObj.get("onExitCodes").isJsonNull()) {
        V1PodFailurePolicyOnExitCodesRequirement.validateJsonElement(jsonObj.get("onExitCodes"));
      }
      if (jsonObj.get("onPodConditions") != null && !jsonObj.get("onPodConditions").isJsonNull()) {
        JsonArray jsonArrayonPodConditions = jsonObj.getAsJsonArray("onPodConditions");
        if (jsonArrayonPodConditions != null) {
          // ensure the json data is an array
          if (!jsonObj.get("onPodConditions").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `onPodConditions` to be an array in the JSON string but got `%s`", jsonObj.get("onPodConditions").toString()));
          }

          // validate the optional field `onPodConditions` (array)
          for (int i = 0; i < jsonArrayonPodConditions.size(); i++) {
            V1PodFailurePolicyOnPodConditionsPattern.validateJsonElement(jsonArrayonPodConditions.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!V1PodFailurePolicyRule.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'V1PodFailurePolicyRule' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<V1PodFailurePolicyRule> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(V1PodFailurePolicyRule.class));

       return (TypeAdapter<T>) new TypeAdapter<V1PodFailurePolicyRule>() {
           @Override
           public void write(JsonWriter out, V1PodFailurePolicyRule value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public V1PodFailurePolicyRule read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of V1PodFailurePolicyRule given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of V1PodFailurePolicyRule
   * @throws IOException if the JSON string is invalid with respect to V1PodFailurePolicyRule
   */
  public static V1PodFailurePolicyRule fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, V1PodFailurePolicyRule.class);
  }

  /**
   * Convert an instance of V1PodFailurePolicyRule to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
