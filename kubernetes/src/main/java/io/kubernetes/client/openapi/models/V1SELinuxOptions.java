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
 * SELinuxOptions are the labels to be applied to the container
 */
@ApiModel(description = "SELinuxOptions are the labels to be applied to the container")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-09-11T18:00:16.154662Z[Etc/UTC]", comments = "Generator version: 7.13.0")
public class V1SELinuxOptions {
  public static final String SERIALIZED_NAME_LEVEL = "level";
  @SerializedName(SERIALIZED_NAME_LEVEL)
  @jakarta.annotation.Nullable
  private String level;

  public static final String SERIALIZED_NAME_ROLE = "role";
  @SerializedName(SERIALIZED_NAME_ROLE)
  @jakarta.annotation.Nullable
  private String role;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  @jakarta.annotation.Nullable
  private String type;

  public static final String SERIALIZED_NAME_USER = "user";
  @SerializedName(SERIALIZED_NAME_USER)
  @jakarta.annotation.Nullable
  private String user;

  public V1SELinuxOptions() {
  }

  public V1SELinuxOptions level(@jakarta.annotation.Nullable String level) {
    this.level = level;
    return this;
  }

  /**
   * Level is SELinux level label that applies to the container.
   * @return level
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "Level is SELinux level label that applies to the container.")
  public String getLevel() {
    return level;
  }

  public void setLevel(@jakarta.annotation.Nullable String level) {
    this.level = level;
  }


  public V1SELinuxOptions role(@jakarta.annotation.Nullable String role) {
    this.role = role;
    return this;
  }

  /**
   * Role is a SELinux role label that applies to the container.
   * @return role
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "Role is a SELinux role label that applies to the container.")
  public String getRole() {
    return role;
  }

  public void setRole(@jakarta.annotation.Nullable String role) {
    this.role = role;
  }


  public V1SELinuxOptions type(@jakarta.annotation.Nullable String type) {
    this.type = type;
    return this;
  }

  /**
   * Type is a SELinux type label that applies to the container.
   * @return type
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "Type is a SELinux type label that applies to the container.")
  public String getType() {
    return type;
  }

  public void setType(@jakarta.annotation.Nullable String type) {
    this.type = type;
  }


  public V1SELinuxOptions user(@jakarta.annotation.Nullable String user) {
    this.user = user;
    return this;
  }

  /**
   * User is a SELinux user label that applies to the container.
   * @return user
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "User is a SELinux user label that applies to the container.")
  public String getUser() {
    return user;
  }

  public void setUser(@jakarta.annotation.Nullable String user) {
    this.user = user;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1SELinuxOptions v1SELinuxOptions = (V1SELinuxOptions) o;
    return Objects.equals(this.level, v1SELinuxOptions.level) &&
        Objects.equals(this.role, v1SELinuxOptions.role) &&
        Objects.equals(this.type, v1SELinuxOptions.type) &&
        Objects.equals(this.user, v1SELinuxOptions.user);
  }

  @Override
  public int hashCode() {
    return Objects.hash(level, role, type, user);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1SELinuxOptions {\n");
    sb.append("    level: ").append(toIndentedString(level)).append("\n");
    sb.append("    role: ").append(toIndentedString(role)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
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
    openapiFields.add("level");
    openapiFields.add("role");
    openapiFields.add("type");
    openapiFields.add("user");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to V1SELinuxOptions
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!V1SELinuxOptions.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in V1SELinuxOptions is not found in the empty JSON string", V1SELinuxOptions.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!V1SELinuxOptions.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `V1SELinuxOptions` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("level") != null && !jsonObj.get("level").isJsonNull()) && !jsonObj.get("level").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `level` to be a primitive type in the JSON string but got `%s`", jsonObj.get("level").toString()));
      }
      if ((jsonObj.get("role") != null && !jsonObj.get("role").isJsonNull()) && !jsonObj.get("role").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `role` to be a primitive type in the JSON string but got `%s`", jsonObj.get("role").toString()));
      }
      if ((jsonObj.get("type") != null && !jsonObj.get("type").isJsonNull()) && !jsonObj.get("type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("type").toString()));
      }
      if ((jsonObj.get("user") != null && !jsonObj.get("user").isJsonNull()) && !jsonObj.get("user").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `user` to be a primitive type in the JSON string but got `%s`", jsonObj.get("user").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!V1SELinuxOptions.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'V1SELinuxOptions' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<V1SELinuxOptions> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(V1SELinuxOptions.class));

       return (TypeAdapter<T>) new TypeAdapter<V1SELinuxOptions>() {
           @Override
           public void write(JsonWriter out, V1SELinuxOptions value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public V1SELinuxOptions read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of V1SELinuxOptions given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of V1SELinuxOptions
   * @throws IOException if the JSON string is invalid with respect to V1SELinuxOptions
   */
  public static V1SELinuxOptions fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, V1SELinuxOptions.class);
  }

  /**
   * Convert an instance of V1SELinuxOptions to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
