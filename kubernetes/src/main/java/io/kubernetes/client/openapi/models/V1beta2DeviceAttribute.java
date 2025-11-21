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
import java.util.Locale;
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
import java.util.Locale;

import io.kubernetes.client.openapi.JSON;

/**
 * DeviceAttribute must have exactly one field set.
 */
@ApiModel(description = "DeviceAttribute must have exactly one field set.")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-11-21T03:25:56.836812Z[Etc/UTC]", comments = "Generator version: 7.16.0")
public class V1beta2DeviceAttribute {
  public static final String SERIALIZED_NAME_BOOL = "bool";
  @SerializedName(SERIALIZED_NAME_BOOL)
  @jakarta.annotation.Nullable
  private Boolean bool;

  public static final String SERIALIZED_NAME_INT = "int";
  @SerializedName(SERIALIZED_NAME_INT)
  @jakarta.annotation.Nullable
  private Long _int;

  public static final String SERIALIZED_NAME_STRING = "string";
  @SerializedName(SERIALIZED_NAME_STRING)
  @jakarta.annotation.Nullable
  private String string;

  public static final String SERIALIZED_NAME_VERSION = "version";
  @SerializedName(SERIALIZED_NAME_VERSION)
  @jakarta.annotation.Nullable
  private String version;

  public V1beta2DeviceAttribute() {
  }

  public V1beta2DeviceAttribute bool(@jakarta.annotation.Nullable Boolean bool) {
    this.bool = bool;
    return this;
  }

  /**
   * BoolValue is a true/false value.
   * @return bool
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "BoolValue is a true/false value.")
  public Boolean getBool() {
    return bool;
  }

  public void setBool(@jakarta.annotation.Nullable Boolean bool) {
    this.bool = bool;
  }


  public V1beta2DeviceAttribute _int(@jakarta.annotation.Nullable Long _int) {
    this._int = _int;
    return this;
  }

  /**
   * IntValue is a number.
   * @return _int
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "IntValue is a number.")
  public Long getInt() {
    return _int;
  }

  public void setInt(@jakarta.annotation.Nullable Long _int) {
    this._int = _int;
  }


  public V1beta2DeviceAttribute string(@jakarta.annotation.Nullable String string) {
    this.string = string;
    return this;
  }

  /**
   * StringValue is a string. Must not be longer than 64 characters.
   * @return string
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "StringValue is a string. Must not be longer than 64 characters.")
  public String getString() {
    return string;
  }

  public void setString(@jakarta.annotation.Nullable String string) {
    this.string = string;
  }


  public V1beta2DeviceAttribute version(@jakarta.annotation.Nullable String version) {
    this.version = version;
    return this;
  }

  /**
   * VersionValue is a semantic version according to semver.org spec 2.0.0. Must not be longer than 64 characters.
   * @return version
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "VersionValue is a semantic version according to semver.org spec 2.0.0. Must not be longer than 64 characters.")
  public String getVersion() {
    return version;
  }

  public void setVersion(@jakarta.annotation.Nullable String version) {
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
    V1beta2DeviceAttribute v1beta2DeviceAttribute = (V1beta2DeviceAttribute) o;
    return Objects.equals(this.bool, v1beta2DeviceAttribute.bool) &&
        Objects.equals(this._int, v1beta2DeviceAttribute._int) &&
        Objects.equals(this.string, v1beta2DeviceAttribute.string) &&
        Objects.equals(this.version, v1beta2DeviceAttribute.version);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bool, _int, string, version);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1beta2DeviceAttribute {\n");
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
    openapiFields = new HashSet<String>(Arrays.asList("bool", "int", "string", "version"));

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>(0);
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to V1beta2DeviceAttribute
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!V1beta2DeviceAttribute.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format(Locale.ROOT, "The required field(s) %s in V1beta2DeviceAttribute is not found in the empty JSON string", V1beta2DeviceAttribute.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!V1beta2DeviceAttribute.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format(Locale.ROOT, "The field `%s` in the JSON string is not defined in the `V1beta2DeviceAttribute` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("string") != null && !jsonObj.get("string").isJsonNull()) && !jsonObj.get("string").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format(Locale.ROOT, "Expected the field `string` to be a primitive type in the JSON string but got `%s`", jsonObj.get("string").toString()));
      }
      if ((jsonObj.get("version") != null && !jsonObj.get("version").isJsonNull()) && !jsonObj.get("version").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format(Locale.ROOT, "Expected the field `version` to be a primitive type in the JSON string but got `%s`", jsonObj.get("version").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!V1beta2DeviceAttribute.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'V1beta2DeviceAttribute' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<V1beta2DeviceAttribute> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(V1beta2DeviceAttribute.class));

       return (TypeAdapter<T>) new TypeAdapter<V1beta2DeviceAttribute>() {
           @Override
           public void write(JsonWriter out, V1beta2DeviceAttribute value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public V1beta2DeviceAttribute read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of V1beta2DeviceAttribute given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of V1beta2DeviceAttribute
   * @throws IOException if the JSON string is invalid with respect to V1beta2DeviceAttribute
   */
  public static V1beta2DeviceAttribute fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, V1beta2DeviceAttribute.class);
  }

  /**
   * Convert an instance of V1beta2DeviceAttribute to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
