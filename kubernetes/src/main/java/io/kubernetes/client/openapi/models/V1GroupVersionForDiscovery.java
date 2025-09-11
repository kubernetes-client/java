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
 * GroupVersion contains the \&quot;group/version\&quot; and \&quot;version\&quot; string of a version. It is made a struct to keep extensibility.
 */
@ApiModel(description = "GroupVersion contains the \"group/version\" and \"version\" string of a version. It is made a struct to keep extensibility.")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-09-11T18:00:16.154662Z[Etc/UTC]", comments = "Generator version: 7.13.0")
public class V1GroupVersionForDiscovery {
  public static final String SERIALIZED_NAME_GROUP_VERSION = "groupVersion";
  @SerializedName(SERIALIZED_NAME_GROUP_VERSION)
  @jakarta.annotation.Nonnull
  private String groupVersion;

  public static final String SERIALIZED_NAME_VERSION = "version";
  @SerializedName(SERIALIZED_NAME_VERSION)
  @jakarta.annotation.Nonnull
  private String version;

  public V1GroupVersionForDiscovery() {
  }

  public V1GroupVersionForDiscovery groupVersion(@jakarta.annotation.Nonnull String groupVersion) {
    this.groupVersion = groupVersion;
    return this;
  }

  /**
   * groupVersion specifies the API group and version in the form \&quot;group/version\&quot;
   * @return groupVersion
   */
  @jakarta.annotation.Nonnull
  @ApiModelProperty(required = true, value = "groupVersion specifies the API group and version in the form \"group/version\"")
  public String getGroupVersion() {
    return groupVersion;
  }

  public void setGroupVersion(@jakarta.annotation.Nonnull String groupVersion) {
    this.groupVersion = groupVersion;
  }


  public V1GroupVersionForDiscovery version(@jakarta.annotation.Nonnull String version) {
    this.version = version;
    return this;
  }

  /**
   * version specifies the version in the form of \&quot;version\&quot;. This is to save the clients the trouble of splitting the GroupVersion.
   * @return version
   */
  @jakarta.annotation.Nonnull
  @ApiModelProperty(required = true, value = "version specifies the version in the form of \"version\". This is to save the clients the trouble of splitting the GroupVersion.")
  public String getVersion() {
    return version;
  }

  public void setVersion(@jakarta.annotation.Nonnull String version) {
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
    V1GroupVersionForDiscovery v1GroupVersionForDiscovery = (V1GroupVersionForDiscovery) o;
    return Objects.equals(this.groupVersion, v1GroupVersionForDiscovery.groupVersion) &&
        Objects.equals(this.version, v1GroupVersionForDiscovery.version);
  }

  @Override
  public int hashCode() {
    return Objects.hash(groupVersion, version);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1GroupVersionForDiscovery {\n");
    sb.append("    groupVersion: ").append(toIndentedString(groupVersion)).append("\n");
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
    openapiFields.add("groupVersion");
    openapiFields.add("version");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("groupVersion");
    openapiRequiredFields.add("version");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to V1GroupVersionForDiscovery
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!V1GroupVersionForDiscovery.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in V1GroupVersionForDiscovery is not found in the empty JSON string", V1GroupVersionForDiscovery.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!V1GroupVersionForDiscovery.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `V1GroupVersionForDiscovery` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : V1GroupVersionForDiscovery.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("groupVersion").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `groupVersion` to be a primitive type in the JSON string but got `%s`", jsonObj.get("groupVersion").toString()));
      }
      if (!jsonObj.get("version").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `version` to be a primitive type in the JSON string but got `%s`", jsonObj.get("version").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!V1GroupVersionForDiscovery.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'V1GroupVersionForDiscovery' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<V1GroupVersionForDiscovery> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(V1GroupVersionForDiscovery.class));

       return (TypeAdapter<T>) new TypeAdapter<V1GroupVersionForDiscovery>() {
           @Override
           public void write(JsonWriter out, V1GroupVersionForDiscovery value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public V1GroupVersionForDiscovery read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of V1GroupVersionForDiscovery given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of V1GroupVersionForDiscovery
   * @throws IOException if the JSON string is invalid with respect to V1GroupVersionForDiscovery
   */
  public static V1GroupVersionForDiscovery fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, V1GroupVersionForDiscovery.class);
  }

  /**
   * Convert an instance of V1GroupVersionForDiscovery to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
