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
import io.kubernetes.client.openapi.models.V1ContainerRestartRuleOnExitCodes;
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
 * ContainerRestartRule describes how a container exit is handled.
 */
@ApiModel(description = "ContainerRestartRule describes how a container exit is handled.")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-09-11T18:00:16.154662Z[Etc/UTC]", comments = "Generator version: 7.13.0")
public class V1ContainerRestartRule {
  public static final String SERIALIZED_NAME_ACTION = "action";
  @SerializedName(SERIALIZED_NAME_ACTION)
  @jakarta.annotation.Nonnull
  private String action;

  public static final String SERIALIZED_NAME_EXIT_CODES = "exitCodes";
  @SerializedName(SERIALIZED_NAME_EXIT_CODES)
  @jakarta.annotation.Nullable
  private V1ContainerRestartRuleOnExitCodes exitCodes;

  public V1ContainerRestartRule() {
  }

  public V1ContainerRestartRule action(@jakarta.annotation.Nonnull String action) {
    this.action = action;
    return this;
  }

  /**
   * Specifies the action taken on a container exit if the requirements are satisfied. The only possible value is \&quot;Restart\&quot; to restart the container.
   * @return action
   */
  @jakarta.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Specifies the action taken on a container exit if the requirements are satisfied. The only possible value is \"Restart\" to restart the container.")
  public String getAction() {
    return action;
  }

  public void setAction(@jakarta.annotation.Nonnull String action) {
    this.action = action;
  }


  public V1ContainerRestartRule exitCodes(@jakarta.annotation.Nullable V1ContainerRestartRuleOnExitCodes exitCodes) {
    this.exitCodes = exitCodes;
    return this;
  }

  /**
   * Get exitCodes
   * @return exitCodes
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  public V1ContainerRestartRuleOnExitCodes getExitCodes() {
    return exitCodes;
  }

  public void setExitCodes(@jakarta.annotation.Nullable V1ContainerRestartRuleOnExitCodes exitCodes) {
    this.exitCodes = exitCodes;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1ContainerRestartRule v1ContainerRestartRule = (V1ContainerRestartRule) o;
    return Objects.equals(this.action, v1ContainerRestartRule.action) &&
        Objects.equals(this.exitCodes, v1ContainerRestartRule.exitCodes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(action, exitCodes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1ContainerRestartRule {\n");
    sb.append("    action: ").append(toIndentedString(action)).append("\n");
    sb.append("    exitCodes: ").append(toIndentedString(exitCodes)).append("\n");
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
    openapiFields.add("exitCodes");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("action");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to V1ContainerRestartRule
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!V1ContainerRestartRule.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in V1ContainerRestartRule is not found in the empty JSON string", V1ContainerRestartRule.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!V1ContainerRestartRule.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `V1ContainerRestartRule` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : V1ContainerRestartRule.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("action").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `action` to be a primitive type in the JSON string but got `%s`", jsonObj.get("action").toString()));
      }
      // validate the optional field `exitCodes`
      if (jsonObj.get("exitCodes") != null && !jsonObj.get("exitCodes").isJsonNull()) {
        V1ContainerRestartRuleOnExitCodes.validateJsonElement(jsonObj.get("exitCodes"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!V1ContainerRestartRule.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'V1ContainerRestartRule' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<V1ContainerRestartRule> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(V1ContainerRestartRule.class));

       return (TypeAdapter<T>) new TypeAdapter<V1ContainerRestartRule>() {
           @Override
           public void write(JsonWriter out, V1ContainerRestartRule value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public V1ContainerRestartRule read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of V1ContainerRestartRule given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of V1ContainerRestartRule
   * @throws IOException if the JSON string is invalid with respect to V1ContainerRestartRule
   */
  public static V1ContainerRestartRule fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, V1ContainerRestartRule.class);
  }

  /**
   * Convert an instance of V1ContainerRestartRule to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
