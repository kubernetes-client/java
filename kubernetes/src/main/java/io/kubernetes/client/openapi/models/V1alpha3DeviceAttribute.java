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

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import io.kubernetes.client.openapi.JSON;

/**
 * DeviceAttribute must have exactly one field set.
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-04T19:37:38.574271Z[Etc/UTC]", comments = "Generator version: 7.6.0")
public class V1alpha3DeviceAttribute {
  public static final String SERIALIZED_NAME_BOOL = "bool";
  @SerializedName(SERIALIZED_NAME_BOOL)
  private Boolean bool;

  public static final String SERIALIZED_NAME_INT = "int";
  @SerializedName(SERIALIZED_NAME_INT)
  private Long _int;

  public static final String SERIALIZED_NAME_STRING = "string";
  @SerializedName(SERIALIZED_NAME_STRING)
  private String string;

  public static final String SERIALIZED_NAME_VERSION = "version";
  @SerializedName(SERIALIZED_NAME_VERSION)
  private String version;

  public V1alpha3DeviceAttribute() {
  }

  public V1alpha3DeviceAttribute bool(Boolean bool) {
    this.bool = bool;
    return this;
  }

   /**
   * BoolValue is a true/false value.
   * @return bool
  **/
  @jakarta.annotation.Nullable
  public Boolean getBool() {
    return bool;
  }

  public void setBool(Boolean bool) {
    this.bool = bool;
  }


  public V1alpha3DeviceAttribute _int(Long _int) {
    this._int = _int;
    return this;
  }

   /**
   * IntValue is a number.
   * @return _int
  **/
  @jakarta.annotation.Nullable
  public Long getInt() {
    return _int;
  }

  public void setInt(Long _int) {
    this._int = _int;
  }


  public V1alpha3DeviceAttribute string(String string) {
    this.string = string;
    return this;
  }

   /**
   * StringValue is a string. Must not be longer than 64 characters.
   * @return string
  **/
  @jakarta.annotation.Nullable
  public String getString() {
    return string;
  }

  public void setString(String string) {
    this.string = string;
  }


  public V1alpha3DeviceAttribute version(String version) {
    this.version = version;
    return this;
  }

   /**
   * VersionValue is a semantic version according to semver.org spec 2.0.0. Must not be longer than 64 characters.
   * @return version
  **/
  @jakarta.annotation.Nullable
  public String getVersion() {
    return version;
  }

  public void setVersion(String version) {
    this.version = version;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1alpha3DeviceAttribute v1alpha3DeviceAttribute = (V1alpha3DeviceAttribute) o;
    return Objects.equals(this.bool, v1alpha3DeviceAttribute.bool) &&
        Objects.equals(this._int, v1alpha3DeviceAttribute._int) &&
        Objects.equals(this.string, v1alpha3DeviceAttribute.string) &&
        Objects.equals(this.version, v1alpha3DeviceAttribute.version);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bool, _int, string, version);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1alpha3DeviceAttribute {\n");
    sb.append("    bool: ").append(toIndentedString(bool)).append("\n");
    sb.append("    _int: ").append(toIndentedString(_int)).append("\n");
    sb.append("    string: ").append(toIndentedString(string)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
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
    openapiFields.add("bool");
    openapiFields.add("int");
    openapiFields.add("string");
    openapiFields.add("version");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to V1alpha3DeviceAttribute
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!V1alpha3DeviceAttribute.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in V1alpha3DeviceAttribute is not found in the empty JSON string", V1alpha3DeviceAttribute.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!V1alpha3DeviceAttribute.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `V1alpha3DeviceAttribute` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("string") != null && !jsonObj.get("string").isJsonNull()) && !jsonObj.get("string").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `string` to be a primitive type in the JSON string but got `%s`", jsonObj.get("string").toString()));
      }
      if ((jsonObj.get("version") != null && !jsonObj.get("version").isJsonNull()) && !jsonObj.get("version").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `version` to be a primitive type in the JSON string but got `%s`", jsonObj.get("version").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!V1alpha3DeviceAttribute.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'V1alpha3DeviceAttribute' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<V1alpha3DeviceAttribute> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(V1alpha3DeviceAttribute.class));

       return (TypeAdapter<T>) new TypeAdapter<V1alpha3DeviceAttribute>() {
           @Override
           public void write(JsonWriter out, V1alpha3DeviceAttribute value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public V1alpha3DeviceAttribute read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of V1alpha3DeviceAttribute given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of V1alpha3DeviceAttribute
  * @throws IOException if the JSON string is invalid with respect to V1alpha3DeviceAttribute
  */
  public static V1alpha3DeviceAttribute fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, V1alpha3DeviceAttribute.class);
  }

 /**
  * Convert an instance of V1alpha3DeviceAttribute to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
