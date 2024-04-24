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
 * CustomResourceColumnDefinition specifies a column for server side printing.
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-23T13:45:09.091597Z[Etc/UTC]")
public class V1CustomResourceColumnDefinition {
  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_FORMAT = "format";
  @SerializedName(SERIALIZED_NAME_FORMAT)
  private String format;

  public static final String SERIALIZED_NAME_JSON_PATH = "jsonPath";
  @SerializedName(SERIALIZED_NAME_JSON_PATH)
  private String jsonPath;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_PRIORITY = "priority";
  @SerializedName(SERIALIZED_NAME_PRIORITY)
  private Integer priority;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;

  public V1CustomResourceColumnDefinition() {
  }

  public V1CustomResourceColumnDefinition description(String description) {

    this.description = description;
    return this;
  }

   /**
   * description is a human readable description of this column.
   * @return description
  **/
  @jakarta.annotation.Nullable
  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public V1CustomResourceColumnDefinition format(String format) {

    this.format = format;
    return this;
  }

   /**
   * format is an optional OpenAPI type definition for this column. The &#39;name&#39; format is applied to the primary identifier column to assist in clients identifying column is the resource name. See https://github.com/OAI/OpenAPI-Specification/blob/master/versions/2.0.md#data-types for details.
   * @return format
  **/
  @jakarta.annotation.Nullable
  public String getFormat() {
    return format;
  }


  public void setFormat(String format) {
    this.format = format;
  }


  public V1CustomResourceColumnDefinition jsonPath(String jsonPath) {

    this.jsonPath = jsonPath;
    return this;
  }

   /**
   * jsonPath is a simple JSON path (i.e. with array notation) which is evaluated against each custom resource to produce the value for this column.
   * @return jsonPath
  **/
  @jakarta.annotation.Nonnull
  public String getJsonPath() {
    return jsonPath;
  }


  public void setJsonPath(String jsonPath) {
    this.jsonPath = jsonPath;
  }


  public V1CustomResourceColumnDefinition name(String name) {

    this.name = name;
    return this;
  }

   /**
   * name is a human readable name for the column.
   * @return name
  **/
  @jakarta.annotation.Nonnull
  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public V1CustomResourceColumnDefinition priority(Integer priority) {

    this.priority = priority;
    return this;
  }

   /**
   * priority is an integer defining the relative importance of this column compared to others. Lower numbers are considered higher priority. Columns that may be omitted in limited space scenarios should be given a priority greater than 0.
   * @return priority
  **/
  @jakarta.annotation.Nullable
  public Integer getPriority() {
    return priority;
  }


  public void setPriority(Integer priority) {
    this.priority = priority;
  }


  public V1CustomResourceColumnDefinition type(String type) {

    this.type = type;
    return this;
  }

   /**
   * type is an OpenAPI type definition for this column. See https://github.com/OAI/OpenAPI-Specification/blob/master/versions/2.0.md#data-types for details.
   * @return type
  **/
  @jakarta.annotation.Nonnull
  public String getType() {
    return type;
  }


  public void setType(String type) {
    this.type = type;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1CustomResourceColumnDefinition v1CustomResourceColumnDefinition = (V1CustomResourceColumnDefinition) o;
    return Objects.equals(this.description, v1CustomResourceColumnDefinition.description) &&
        Objects.equals(this.format, v1CustomResourceColumnDefinition.format) &&
        Objects.equals(this.jsonPath, v1CustomResourceColumnDefinition.jsonPath) &&
        Objects.equals(this.name, v1CustomResourceColumnDefinition.name) &&
        Objects.equals(this.priority, v1CustomResourceColumnDefinition.priority) &&
        Objects.equals(this.type, v1CustomResourceColumnDefinition.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, format, jsonPath, name, priority, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1CustomResourceColumnDefinition {\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    format: ").append(toIndentedString(format)).append("\n");
    sb.append("    jsonPath: ").append(toIndentedString(jsonPath)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    priority: ").append(toIndentedString(priority)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
    openapiFields.add("description");
    openapiFields.add("format");
    openapiFields.add("jsonPath");
    openapiFields.add("name");
    openapiFields.add("priority");
    openapiFields.add("type");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("jsonPath");
    openapiRequiredFields.add("name");
    openapiRequiredFields.add("type");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to V1CustomResourceColumnDefinition
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!V1CustomResourceColumnDefinition.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in V1CustomResourceColumnDefinition is not found in the empty JSON string", V1CustomResourceColumnDefinition.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!V1CustomResourceColumnDefinition.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `V1CustomResourceColumnDefinition` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : V1CustomResourceColumnDefinition.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if ((jsonObj.get("description") != null && !jsonObj.get("description").isJsonNull()) && !jsonObj.get("description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
      }
      if ((jsonObj.get("format") != null && !jsonObj.get("format").isJsonNull()) && !jsonObj.get("format").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `format` to be a primitive type in the JSON string but got `%s`", jsonObj.get("format").toString()));
      }
      if (!jsonObj.get("jsonPath").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `jsonPath` to be a primitive type in the JSON string but got `%s`", jsonObj.get("jsonPath").toString()));
      }
      if (!jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if (!jsonObj.get("type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("type").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!V1CustomResourceColumnDefinition.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'V1CustomResourceColumnDefinition' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<V1CustomResourceColumnDefinition> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(V1CustomResourceColumnDefinition.class));

       return (TypeAdapter<T>) new TypeAdapter<V1CustomResourceColumnDefinition>() {
           @Override
           public void write(JsonWriter out, V1CustomResourceColumnDefinition value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public V1CustomResourceColumnDefinition read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of V1CustomResourceColumnDefinition given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of V1CustomResourceColumnDefinition
  * @throws IOException if the JSON string is invalid with respect to V1CustomResourceColumnDefinition
  */
  public static V1CustomResourceColumnDefinition fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, V1CustomResourceColumnDefinition.class);
  }

 /**
  * Convert an instance of V1CustomResourceColumnDefinition to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
