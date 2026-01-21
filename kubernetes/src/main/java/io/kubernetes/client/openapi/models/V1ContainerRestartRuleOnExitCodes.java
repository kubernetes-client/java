/*
Copyright 2026 The Kubernetes Authors.
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
 * ContainerRestartRuleOnExitCodes describes the condition for handling an exited container based on its exit codes.
 */
@ApiModel(description = "ContainerRestartRuleOnExitCodes describes the condition for handling an exited container based on its exit codes.")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2026-01-21T21:30:13.305152Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class V1ContainerRestartRuleOnExitCodes {
  public static final String SERIALIZED_NAME_OPERATOR = "operator";
  @SerializedName(SERIALIZED_NAME_OPERATOR)
  @jakarta.annotation.Nonnull
  private String operator;

  public static final String SERIALIZED_NAME_VALUES = "values";
  @SerializedName(SERIALIZED_NAME_VALUES)
  @jakarta.annotation.Nullable
  private List<Integer> values = new ArrayList<>();

  public V1ContainerRestartRuleOnExitCodes() {
  }

  public V1ContainerRestartRuleOnExitCodes operator(@jakarta.annotation.Nonnull String operator) {
    this.operator = operator;
    return this;
  }

  /**
   * Represents the relationship between the container exit code(s) and the specified values. Possible values are: - In: the requirement is satisfied if the container exit code is in the   set of specified values. - NotIn: the requirement is satisfied if the container exit code is   not in the set of specified values.
   * @return operator
   */
  @jakarta.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Represents the relationship between the container exit code(s) and the specified values. Possible values are: - In: the requirement is satisfied if the container exit code is in the   set of specified values. - NotIn: the requirement is satisfied if the container exit code is   not in the set of specified values.")
  public String getOperator() {
    return operator;
  }

  public void setOperator(@jakarta.annotation.Nonnull String operator) {
    this.operator = operator;
  }


  public V1ContainerRestartRuleOnExitCodes values(@jakarta.annotation.Nullable List<Integer> values) {
    this.values = values;
    return this;
  }

  public V1ContainerRestartRuleOnExitCodes addValuesItem(Integer valuesItem) {
    if (this.values == null) {
      this.values = new ArrayList<>();
    }
    this.values.add(valuesItem);
    return this;
  }

  /**
   * Specifies the set of values to check for container exit codes. At most 255 elements are allowed.
   * @return values
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "Specifies the set of values to check for container exit codes. At most 255 elements are allowed.")
  public List<Integer> getValues() {
    return values;
  }

  public void setValues(@jakarta.annotation.Nullable List<Integer> values) {
    this.values = values;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1ContainerRestartRuleOnExitCodes v1ContainerRestartRuleOnExitCodes = (V1ContainerRestartRuleOnExitCodes) o;
    return Objects.equals(this.operator, v1ContainerRestartRuleOnExitCodes.operator) &&
        Objects.equals(this.values, v1ContainerRestartRuleOnExitCodes.values);
  }

  @Override
  public int hashCode() {
    return Objects.hash(operator, values);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1ContainerRestartRuleOnExitCodes {\n");
    sb.append("    operator: ").append(toIndentedString(operator)).append("\n");
    sb.append("    values: ").append(toIndentedString(values)).append("\n");
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
    openapiFields = new HashSet<String>(Arrays.asList("operator", "values"));

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>(Arrays.asList("operator"));
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to V1ContainerRestartRuleOnExitCodes
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!V1ContainerRestartRuleOnExitCodes.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format(java.util.Locale.ROOT, "The required field(s) %s in V1ContainerRestartRuleOnExitCodes is not found in the empty JSON string", V1ContainerRestartRuleOnExitCodes.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!V1ContainerRestartRuleOnExitCodes.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format(java.util.Locale.ROOT, "The field `%s` in the JSON string is not defined in the `V1ContainerRestartRuleOnExitCodes` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : V1ContainerRestartRuleOnExitCodes.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format(java.util.Locale.ROOT, "The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("operator").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format(java.util.Locale.ROOT, "Expected the field `operator` to be a primitive type in the JSON string but got `%s`", jsonObj.get("operator").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("values") != null && !jsonObj.get("values").isJsonNull() && !jsonObj.get("values").isJsonArray()) {
        throw new IllegalArgumentException(String.format(java.util.Locale.ROOT, "Expected the field `values` to be an array in the JSON string but got `%s`", jsonObj.get("values").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!V1ContainerRestartRuleOnExitCodes.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'V1ContainerRestartRuleOnExitCodes' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<V1ContainerRestartRuleOnExitCodes> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(V1ContainerRestartRuleOnExitCodes.class));

       return (TypeAdapter<T>) new TypeAdapter<V1ContainerRestartRuleOnExitCodes>() {
           @Override
           public void write(JsonWriter out, V1ContainerRestartRuleOnExitCodes value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public V1ContainerRestartRuleOnExitCodes read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of V1ContainerRestartRuleOnExitCodes given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of V1ContainerRestartRuleOnExitCodes
   * @throws IOException if the JSON string is invalid with respect to V1ContainerRestartRuleOnExitCodes
   */
  public static V1ContainerRestartRuleOnExitCodes fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, V1ContainerRestartRuleOnExitCodes.class);
  }

  /**
   * Convert an instance of V1ContainerRestartRuleOnExitCodes to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
