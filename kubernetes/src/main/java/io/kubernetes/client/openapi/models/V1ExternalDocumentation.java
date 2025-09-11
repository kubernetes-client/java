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
 * ExternalDocumentation allows referencing an external resource for extended documentation.
 */
@ApiModel(description = "ExternalDocumentation allows referencing an external resource for extended documentation.")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-09-11T18:00:16.154662Z[Etc/UTC]", comments = "Generator version: 7.13.0")
public class V1ExternalDocumentation {
  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  @jakarta.annotation.Nullable
  private String description;

  public static final String SERIALIZED_NAME_URL = "url";
  @SerializedName(SERIALIZED_NAME_URL)
  @jakarta.annotation.Nullable
  private String url;

  public V1ExternalDocumentation() {
  }

  public V1ExternalDocumentation description(@jakarta.annotation.Nullable String description) {
    this.description = description;
    return this;
  }

  /**
   * Get description
   * @return description
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  public String getDescription() {
    return description;
  }

  public void setDescription(@jakarta.annotation.Nullable String description) {
    this.description = description;
  }


  public V1ExternalDocumentation url(@jakarta.annotation.Nullable String url) {
    this.url = url;
    return this;
  }

  /**
   * Get url
   * @return url
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  public String getUrl() {
    return url;
  }

  public void setUrl(@jakarta.annotation.Nullable String url) {
    this.url = url;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1ExternalDocumentation v1ExternalDocumentation = (V1ExternalDocumentation) o;
    return Objects.equals(this.description, v1ExternalDocumentation.description) &&
        Objects.equals(this.url, v1ExternalDocumentation.url);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, url);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1ExternalDocumentation {\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
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
    openapiFields.add("url");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to V1ExternalDocumentation
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!V1ExternalDocumentation.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in V1ExternalDocumentation is not found in the empty JSON string", V1ExternalDocumentation.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!V1ExternalDocumentation.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `V1ExternalDocumentation` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("description") != null && !jsonObj.get("description").isJsonNull()) && !jsonObj.get("description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
      }
      if ((jsonObj.get("url") != null && !jsonObj.get("url").isJsonNull()) && !jsonObj.get("url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("url").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!V1ExternalDocumentation.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'V1ExternalDocumentation' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<V1ExternalDocumentation> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(V1ExternalDocumentation.class));

       return (TypeAdapter<T>) new TypeAdapter<V1ExternalDocumentation>() {
           @Override
           public void write(JsonWriter out, V1ExternalDocumentation value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public V1ExternalDocumentation read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of V1ExternalDocumentation given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of V1ExternalDocumentation
   * @throws IOException if the JSON string is invalid with respect to V1ExternalDocumentation
   */
  public static V1ExternalDocumentation fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, V1ExternalDocumentation.class);
  }

  /**
   * Convert an instance of V1ExternalDocumentation to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
