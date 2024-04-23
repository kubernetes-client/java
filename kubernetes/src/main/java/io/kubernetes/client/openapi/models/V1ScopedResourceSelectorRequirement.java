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
 * A scoped-resource selector requirement is a selector that contains values, a scope name, and an operator that relates the scope name and values.
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-23T13:45:09.091597Z[Etc/UTC]")
public class V1ScopedResourceSelectorRequirement {
  public static final String SERIALIZED_NAME_OPERATOR = "operator";
  @SerializedName(SERIALIZED_NAME_OPERATOR)
  private String operator;

  public static final String SERIALIZED_NAME_SCOPE_NAME = "scopeName";
  @SerializedName(SERIALIZED_NAME_SCOPE_NAME)
  private String scopeName;

  public static final String SERIALIZED_NAME_VALUES = "values";
  @SerializedName(SERIALIZED_NAME_VALUES)
  private List<String> values;

  public V1ScopedResourceSelectorRequirement() {
  }

  public V1ScopedResourceSelectorRequirement operator(String operator) {

    this.operator = operator;
    return this;
  }

   /**
   * Represents a scope&#39;s relationship to a set of values. Valid operators are In, NotIn, Exists, DoesNotExist.
   * @return operator
  **/
  @jakarta.annotation.Nonnull
  public String getOperator() {
    return operator;
  }


  public void setOperator(String operator) {
    this.operator = operator;
  }


  public V1ScopedResourceSelectorRequirement scopeName(String scopeName) {

    this.scopeName = scopeName;
    return this;
  }

   /**
   * The name of the scope that the selector applies to.
   * @return scopeName
  **/
  @jakarta.annotation.Nonnull
  public String getScopeName() {
    return scopeName;
  }


  public void setScopeName(String scopeName) {
    this.scopeName = scopeName;
  }


  public V1ScopedResourceSelectorRequirement values(List<String> values) {

    this.values = values;
    return this;
  }

  public V1ScopedResourceSelectorRequirement addValuesItem(String valuesItem) {
    if (this.values == null) {
      this.values = new ArrayList<>();
    }
    this.values.add(valuesItem);
    return this;
  }

   /**
   * An array of string values. If the operator is In or NotIn, the values array must be non-empty. If the operator is Exists or DoesNotExist, the values array must be empty. This array is replaced during a strategic merge patch.
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
    V1ScopedResourceSelectorRequirement v1ScopedResourceSelectorRequirement = (V1ScopedResourceSelectorRequirement) o;
    return Objects.equals(this.operator, v1ScopedResourceSelectorRequirement.operator) &&
        Objects.equals(this.scopeName, v1ScopedResourceSelectorRequirement.scopeName) &&
        Objects.equals(this.values, v1ScopedResourceSelectorRequirement.values);
  }

  @Override
  public int hashCode() {
    return Objects.hash(operator, scopeName, values);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1ScopedResourceSelectorRequirement {\n");
    sb.append("    operator: ").append(toIndentedString(operator)).append("\n");
    sb.append("    scopeName: ").append(toIndentedString(scopeName)).append("\n");
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
    openapiFields.add("operator");
    openapiFields.add("scopeName");
    openapiFields.add("values");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("operator");
    openapiRequiredFields.add("scopeName");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to V1ScopedResourceSelectorRequirement
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!V1ScopedResourceSelectorRequirement.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in V1ScopedResourceSelectorRequirement is not found in the empty JSON string", V1ScopedResourceSelectorRequirement.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!V1ScopedResourceSelectorRequirement.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `V1ScopedResourceSelectorRequirement` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : V1ScopedResourceSelectorRequirement.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("operator").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `operator` to be a primitive type in the JSON string but got `%s`", jsonObj.get("operator").toString()));
      }
      if (!jsonObj.get("scopeName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `scopeName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("scopeName").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("values") != null && !jsonObj.get("values").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `values` to be an array in the JSON string but got `%s`", jsonObj.get("values").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!V1ScopedResourceSelectorRequirement.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'V1ScopedResourceSelectorRequirement' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<V1ScopedResourceSelectorRequirement> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(V1ScopedResourceSelectorRequirement.class));

       return (TypeAdapter<T>) new TypeAdapter<V1ScopedResourceSelectorRequirement>() {
           @Override
           public void write(JsonWriter out, V1ScopedResourceSelectorRequirement value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public V1ScopedResourceSelectorRequirement read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of V1ScopedResourceSelectorRequirement given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of V1ScopedResourceSelectorRequirement
  * @throws IOException if the JSON string is invalid with respect to V1ScopedResourceSelectorRequirement
  */
  public static V1ScopedResourceSelectorRequirement fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, V1ScopedResourceSelectorRequirement.class);
  }

 /**
  * Convert an instance of V1ScopedResourceSelectorRequirement to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
