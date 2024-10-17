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
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
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

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import io.kubernetes.client.openapi.JSON;

/**
 * FieldSelectorRequirement is a selector that contains values, a key, and an operator that relates the key and values.
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-04T19:37:38.574271Z[Etc/UTC]", comments = "Generator version: 7.6.0")
public class V1FieldSelectorRequirement {
  public static final String SERIALIZED_NAME_KEY = "key";
  @SerializedName(SERIALIZED_NAME_KEY)
  private String key;

  public static final String SERIALIZED_NAME_OPERATOR = "operator";
  @SerializedName(SERIALIZED_NAME_OPERATOR)
  private String operator;

  public static final String SERIALIZED_NAME_VALUES = "values";
  @SerializedName(SERIALIZED_NAME_VALUES)
  private List<String> values = new ArrayList<>();

  public V1FieldSelectorRequirement() {
  }

  public V1FieldSelectorRequirement key(String key) {
    this.key = key;
    return this;
  }

   /**
   * key is the field selector key that the requirement applies to.
   * @return key
  **/
  @jakarta.annotation.Nonnull
  public String getKey() {
    return key;
  }

  public void setKey(String key) {
    this.key = key;
  }


  public V1FieldSelectorRequirement operator(String operator) {
    this.operator = operator;
    return this;
  }

   /**
   * operator represents a key&#39;s relationship to a set of values. Valid operators are In, NotIn, Exists, DoesNotExist. The list of operators may grow in the future.
   * @return operator
  **/
  @jakarta.annotation.Nonnull
  public String getOperator() {
    return operator;
  }

  public void setOperator(String operator) {
    this.operator = operator;
  }


  public V1FieldSelectorRequirement values(List<String> values) {
    this.values = values;
    return this;
  }

  public V1FieldSelectorRequirement addValuesItem(String valuesItem) {
    if (this.values == null) {
      this.values = new ArrayList<>();
    }
    this.values.add(valuesItem);
    return this;
  }

   /**
   * values is an array of string values. If the operator is In or NotIn, the values array must be non-empty. If the operator is Exists or DoesNotExist, the values array must be empty.
   * @return values
  **/
  @jakarta.annotation.Nullable
  public List<String> getValues() {
    return values;
  }

  public void setValues(List<String> values) {
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
    V1FieldSelectorRequirement v1FieldSelectorRequirement = (V1FieldSelectorRequirement) o;
    return Objects.equals(this.key, v1FieldSelectorRequirement.key) &&
        Objects.equals(this.operator, v1FieldSelectorRequirement.operator) &&
        Objects.equals(this.values, v1FieldSelectorRequirement.values);
  }

  @Override
  public int hashCode() {
    return Objects.hash(key, operator, values);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1FieldSelectorRequirement {\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
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
    openapiFields = new HashSet<String>();
    openapiFields.add("key");
    openapiFields.add("operator");
    openapiFields.add("values");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("key");
    openapiRequiredFields.add("operator");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to V1FieldSelectorRequirement
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!V1FieldSelectorRequirement.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in V1FieldSelectorRequirement is not found in the empty JSON string", V1FieldSelectorRequirement.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!V1FieldSelectorRequirement.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `V1FieldSelectorRequirement` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : V1FieldSelectorRequirement.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("key").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `key` to be a primitive type in the JSON string but got `%s`", jsonObj.get("key").toString()));
      }
      if (!jsonObj.get("operator").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `operator` to be a primitive type in the JSON string but got `%s`", jsonObj.get("operator").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("values") != null && !jsonObj.get("values").isJsonNull() && !jsonObj.get("values").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `values` to be an array in the JSON string but got `%s`", jsonObj.get("values").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!V1FieldSelectorRequirement.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'V1FieldSelectorRequirement' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<V1FieldSelectorRequirement> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(V1FieldSelectorRequirement.class));

       return (TypeAdapter<T>) new TypeAdapter<V1FieldSelectorRequirement>() {
           @Override
           public void write(JsonWriter out, V1FieldSelectorRequirement value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public V1FieldSelectorRequirement read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of V1FieldSelectorRequirement given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of V1FieldSelectorRequirement
  * @throws IOException if the JSON string is invalid with respect to V1FieldSelectorRequirement
  */
  public static V1FieldSelectorRequirement fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, V1FieldSelectorRequirement.class);
  }

 /**
  * Convert an instance of V1FieldSelectorRequirement to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
