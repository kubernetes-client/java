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
 * The names of the group, the version, and the resource.
 */
@ApiModel(description = "The names of the group, the version, and the resource.")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-09-11T18:00:16.154662Z[Etc/UTC]", comments = "Generator version: 7.13.0")
public class V1alpha1GroupVersionResource {
  public static final String SERIALIZED_NAME_GROUP = "group";
  @SerializedName(SERIALIZED_NAME_GROUP)
  @jakarta.annotation.Nullable
  private String group;

  public static final String SERIALIZED_NAME_RESOURCE = "resource";
  @SerializedName(SERIALIZED_NAME_RESOURCE)
  @jakarta.annotation.Nullable
  private String resource;

  public static final String SERIALIZED_NAME_VERSION = "version";
  @SerializedName(SERIALIZED_NAME_VERSION)
  @jakarta.annotation.Nullable
  private String version;

  public V1alpha1GroupVersionResource() {
  }

  public V1alpha1GroupVersionResource group(@jakarta.annotation.Nullable String group) {
    this.group = group;
    return this;
  }

  /**
   * The name of the group.
   * @return group
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "The name of the group.")
  public String getGroup() {
    return group;
  }

  public void setGroup(@jakarta.annotation.Nullable String group) {
    this.group = group;
  }


  public V1alpha1GroupVersionResource resource(@jakarta.annotation.Nullable String resource) {
    this.resource = resource;
    return this;
  }

  /**
   * The name of the resource.
   * @return resource
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "The name of the resource.")
  public String getResource() {
    return resource;
  }

  public void setResource(@jakarta.annotation.Nullable String resource) {
    this.resource = resource;
  }


  public V1alpha1GroupVersionResource version(@jakarta.annotation.Nullable String version) {
    this.version = version;
    return this;
  }

  /**
   * The name of the version.
   * @return version
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "The name of the version.")
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
    V1alpha1GroupVersionResource v1alpha1GroupVersionResource = (V1alpha1GroupVersionResource) o;
    return Objects.equals(this.group, v1alpha1GroupVersionResource.group) &&
        Objects.equals(this.resource, v1alpha1GroupVersionResource.resource) &&
        Objects.equals(this.version, v1alpha1GroupVersionResource.version);
  }

  @Override
  public int hashCode() {
    return Objects.hash(group, resource, version);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1alpha1GroupVersionResource {\n");
    sb.append("    group: ").append(toIndentedString(group)).append("\n");
    sb.append("    resource: ").append(toIndentedString(resource)).append("\n");
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
    openapiFields.add("group");
    openapiFields.add("resource");
    openapiFields.add("version");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to V1alpha1GroupVersionResource
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!V1alpha1GroupVersionResource.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in V1alpha1GroupVersionResource is not found in the empty JSON string", V1alpha1GroupVersionResource.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!V1alpha1GroupVersionResource.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `V1alpha1GroupVersionResource` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("group") != null && !jsonObj.get("group").isJsonNull()) && !jsonObj.get("group").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `group` to be a primitive type in the JSON string but got `%s`", jsonObj.get("group").toString()));
      }
      if ((jsonObj.get("resource") != null && !jsonObj.get("resource").isJsonNull()) && !jsonObj.get("resource").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `resource` to be a primitive type in the JSON string but got `%s`", jsonObj.get("resource").toString()));
      }
      if ((jsonObj.get("version") != null && !jsonObj.get("version").isJsonNull()) && !jsonObj.get("version").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `version` to be a primitive type in the JSON string but got `%s`", jsonObj.get("version").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!V1alpha1GroupVersionResource.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'V1alpha1GroupVersionResource' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<V1alpha1GroupVersionResource> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(V1alpha1GroupVersionResource.class));

       return (TypeAdapter<T>) new TypeAdapter<V1alpha1GroupVersionResource>() {
           @Override
           public void write(JsonWriter out, V1alpha1GroupVersionResource value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public V1alpha1GroupVersionResource read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of V1alpha1GroupVersionResource given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of V1alpha1GroupVersionResource
   * @throws IOException if the JSON string is invalid with respect to V1alpha1GroupVersionResource
   */
  public static V1alpha1GroupVersionResource fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, V1alpha1GroupVersionResource.class);
  }

  /**
   * Convert an instance of V1alpha1GroupVersionResource to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
