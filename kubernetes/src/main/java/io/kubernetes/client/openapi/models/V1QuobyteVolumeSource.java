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
 * Represents a Quobyte mount that lasts the lifetime of a pod. Quobyte volumes do not support ownership management or SELinux relabeling.
 */
@ApiModel(description = "Represents a Quobyte mount that lasts the lifetime of a pod. Quobyte volumes do not support ownership management or SELinux relabeling.")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-11-21T03:25:56.836812Z[Etc/UTC]", comments = "Generator version: 7.16.0")
public class V1QuobyteVolumeSource {
  public static final String SERIALIZED_NAME_GROUP = "group";
  @SerializedName(SERIALIZED_NAME_GROUP)
  @jakarta.annotation.Nullable
  private String group;

  public static final String SERIALIZED_NAME_READ_ONLY = "readOnly";
  @SerializedName(SERIALIZED_NAME_READ_ONLY)
  @jakarta.annotation.Nullable
  private Boolean readOnly;

  public static final String SERIALIZED_NAME_REGISTRY = "registry";
  @SerializedName(SERIALIZED_NAME_REGISTRY)
  @jakarta.annotation.Nonnull
  private String registry;

  public static final String SERIALIZED_NAME_TENANT = "tenant";
  @SerializedName(SERIALIZED_NAME_TENANT)
  @jakarta.annotation.Nullable
  private String tenant;

  public static final String SERIALIZED_NAME_USER = "user";
  @SerializedName(SERIALIZED_NAME_USER)
  @jakarta.annotation.Nullable
  private String user;

  public static final String SERIALIZED_NAME_VOLUME = "volume";
  @SerializedName(SERIALIZED_NAME_VOLUME)
  @jakarta.annotation.Nonnull
  private String volume;

  public V1QuobyteVolumeSource() {
  }

  public V1QuobyteVolumeSource group(@jakarta.annotation.Nullable String group) {
    this.group = group;
    return this;
  }

  /**
   * group to map volume access to Default is no group
   * @return group
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "group to map volume access to Default is no group")
  public String getGroup() {
    return group;
  }

  public void setGroup(@jakarta.annotation.Nullable String group) {
    this.group = group;
  }


  public V1QuobyteVolumeSource readOnly(@jakarta.annotation.Nullable Boolean readOnly) {
    this.readOnly = readOnly;
    return this;
  }

  /**
   * readOnly here will force the Quobyte volume to be mounted with read-only permissions. Defaults to false.
   * @return readOnly
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "readOnly here will force the Quobyte volume to be mounted with read-only permissions. Defaults to false.")
  public Boolean getReadOnly() {
    return readOnly;
  }

  public void setReadOnly(@jakarta.annotation.Nullable Boolean readOnly) {
    this.readOnly = readOnly;
  }


  public V1QuobyteVolumeSource registry(@jakarta.annotation.Nonnull String registry) {
    this.registry = registry;
    return this;
  }

  /**
   * registry represents a single or multiple Quobyte Registry services specified as a string as host:port pair (multiple entries are separated with commas) which acts as the central registry for volumes
   * @return registry
   */
  @jakarta.annotation.Nonnull
  @ApiModelProperty(required = true, value = "registry represents a single or multiple Quobyte Registry services specified as a string as host:port pair (multiple entries are separated with commas) which acts as the central registry for volumes")
  public String getRegistry() {
    return registry;
  }

  public void setRegistry(@jakarta.annotation.Nonnull String registry) {
    this.registry = registry;
  }


  public V1QuobyteVolumeSource tenant(@jakarta.annotation.Nullable String tenant) {
    this.tenant = tenant;
    return this;
  }

  /**
   * tenant owning the given Quobyte volume in the Backend Used with dynamically provisioned Quobyte volumes, value is set by the plugin
   * @return tenant
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "tenant owning the given Quobyte volume in the Backend Used with dynamically provisioned Quobyte volumes, value is set by the plugin")
  public String getTenant() {
    return tenant;
  }

  public void setTenant(@jakarta.annotation.Nullable String tenant) {
    this.tenant = tenant;
  }


  public V1QuobyteVolumeSource user(@jakarta.annotation.Nullable String user) {
    this.user = user;
    return this;
  }

  /**
   * user to map volume access to Defaults to serivceaccount user
   * @return user
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "user to map volume access to Defaults to serivceaccount user")
  public String getUser() {
    return user;
  }

  public void setUser(@jakarta.annotation.Nullable String user) {
    this.user = user;
  }


  public V1QuobyteVolumeSource volume(@jakarta.annotation.Nonnull String volume) {
    this.volume = volume;
    return this;
  }

  /**
   * volume is a string that references an already created Quobyte volume by name.
   * @return volume
   */
  @jakarta.annotation.Nonnull
  @ApiModelProperty(required = true, value = "volume is a string that references an already created Quobyte volume by name.")
  public String getVolume() {
    return volume;
  }

  public void setVolume(@jakarta.annotation.Nonnull String volume) {
    this.volume = volume;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1QuobyteVolumeSource v1QuobyteVolumeSource = (V1QuobyteVolumeSource) o;
    return Objects.equals(this.group, v1QuobyteVolumeSource.group) &&
        Objects.equals(this.readOnly, v1QuobyteVolumeSource.readOnly) &&
        Objects.equals(this.registry, v1QuobyteVolumeSource.registry) &&
        Objects.equals(this.tenant, v1QuobyteVolumeSource.tenant) &&
        Objects.equals(this.user, v1QuobyteVolumeSource.user) &&
        Objects.equals(this.volume, v1QuobyteVolumeSource.volume);
  }

  @Override
  public int hashCode() {
    return Objects.hash(group, readOnly, registry, tenant, user, volume);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1QuobyteVolumeSource {\n");
    sb.append("    group: ").append(toIndentedString(group)).append("\n");
    sb.append("    readOnly: ").append(toIndentedString(readOnly)).append("\n");
    sb.append("    registry: ").append(toIndentedString(registry)).append("\n");
    sb.append("    tenant: ").append(toIndentedString(tenant)).append("\n");
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
    sb.append("    volume: ").append(toIndentedString(volume)).append("\n");
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
    openapiFields = new HashSet<String>(Arrays.asList("group", "readOnly", "registry", "tenant", "user", "volume"));

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>(Arrays.asList("registry", "volume"));
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to V1QuobyteVolumeSource
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!V1QuobyteVolumeSource.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format(Locale.ROOT, "The required field(s) %s in V1QuobyteVolumeSource is not found in the empty JSON string", V1QuobyteVolumeSource.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!V1QuobyteVolumeSource.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format(Locale.ROOT, "The field `%s` in the JSON string is not defined in the `V1QuobyteVolumeSource` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : V1QuobyteVolumeSource.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format(Locale.ROOT, "The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("group") != null && !jsonObj.get("group").isJsonNull()) && !jsonObj.get("group").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format(Locale.ROOT, "Expected the field `group` to be a primitive type in the JSON string but got `%s`", jsonObj.get("group").toString()));
      }
      if (!jsonObj.get("registry").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format(Locale.ROOT, "Expected the field `registry` to be a primitive type in the JSON string but got `%s`", jsonObj.get("registry").toString()));
      }
      if ((jsonObj.get("tenant") != null && !jsonObj.get("tenant").isJsonNull()) && !jsonObj.get("tenant").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format(Locale.ROOT, "Expected the field `tenant` to be a primitive type in the JSON string but got `%s`", jsonObj.get("tenant").toString()));
      }
      if ((jsonObj.get("user") != null && !jsonObj.get("user").isJsonNull()) && !jsonObj.get("user").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format(Locale.ROOT, "Expected the field `user` to be a primitive type in the JSON string but got `%s`", jsonObj.get("user").toString()));
      }
      if (!jsonObj.get("volume").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format(Locale.ROOT, "Expected the field `volume` to be a primitive type in the JSON string but got `%s`", jsonObj.get("volume").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!V1QuobyteVolumeSource.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'V1QuobyteVolumeSource' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<V1QuobyteVolumeSource> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(V1QuobyteVolumeSource.class));

       return (TypeAdapter<T>) new TypeAdapter<V1QuobyteVolumeSource>() {
           @Override
           public void write(JsonWriter out, V1QuobyteVolumeSource value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public V1QuobyteVolumeSource read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of V1QuobyteVolumeSource given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of V1QuobyteVolumeSource
   * @throws IOException if the JSON string is invalid with respect to V1QuobyteVolumeSource
   */
  public static V1QuobyteVolumeSource fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, V1QuobyteVolumeSource.class);
  }

  /**
   * Convert an instance of V1QuobyteVolumeSource to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
