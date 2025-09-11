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
import io.kubernetes.client.openapi.models.V1VolumeProjection;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
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

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import io.kubernetes.client.openapi.JSON;

/**
 * Represents a projected volume source
 */
@ApiModel(description = "Represents a projected volume source")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-09-11T18:00:16.154662Z[Etc/UTC]", comments = "Generator version: 7.13.0")
public class V1ProjectedVolumeSource {
  public static final String SERIALIZED_NAME_DEFAULT_MODE = "defaultMode";
  @SerializedName(SERIALIZED_NAME_DEFAULT_MODE)
  @jakarta.annotation.Nullable
  private Integer defaultMode;

  public static final String SERIALIZED_NAME_SOURCES = "sources";
  @SerializedName(SERIALIZED_NAME_SOURCES)
  @jakarta.annotation.Nullable
  private List<V1VolumeProjection> sources = new ArrayList<>();

  public V1ProjectedVolumeSource() {
  }

  public V1ProjectedVolumeSource defaultMode(@jakarta.annotation.Nullable Integer defaultMode) {
    this.defaultMode = defaultMode;
    return this;
  }

  /**
   * defaultMode are the mode bits used to set permissions on created files by default. Must be an octal value between 0000 and 0777 or a decimal value between 0 and 511. YAML accepts both octal and decimal values, JSON requires decimal values for mode bits. Directories within the path are not affected by this setting. This might be in conflict with other options that affect the file mode, like fsGroup, and the result can be other mode bits set.
   * @return defaultMode
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "defaultMode are the mode bits used to set permissions on created files by default. Must be an octal value between 0000 and 0777 or a decimal value between 0 and 511. YAML accepts both octal and decimal values, JSON requires decimal values for mode bits. Directories within the path are not affected by this setting. This might be in conflict with other options that affect the file mode, like fsGroup, and the result can be other mode bits set.")
  public Integer getDefaultMode() {
    return defaultMode;
  }

  public void setDefaultMode(@jakarta.annotation.Nullable Integer defaultMode) {
    this.defaultMode = defaultMode;
  }


  public V1ProjectedVolumeSource sources(@jakarta.annotation.Nullable List<V1VolumeProjection> sources) {
    this.sources = sources;
    return this;
  }

  public V1ProjectedVolumeSource addSourcesItem(V1VolumeProjection sourcesItem) {
    if (this.sources == null) {
      this.sources = new ArrayList<>();
    }
    this.sources.add(sourcesItem);
    return this;
  }

  /**
   * sources is the list of volume projections. Each entry in this list handles one source.
   * @return sources
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "sources is the list of volume projections. Each entry in this list handles one source.")
  public List<V1VolumeProjection> getSources() {
    return sources;
  }

  public void setSources(@jakarta.annotation.Nullable List<V1VolumeProjection> sources) {
    this.sources = sources;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1ProjectedVolumeSource v1ProjectedVolumeSource = (V1ProjectedVolumeSource) o;
    return Objects.equals(this.defaultMode, v1ProjectedVolumeSource.defaultMode) &&
        Objects.equals(this.sources, v1ProjectedVolumeSource.sources);
  }

  @Override
  public int hashCode() {
    return Objects.hash(defaultMode, sources);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1ProjectedVolumeSource {\n");
    sb.append("    defaultMode: ").append(toIndentedString(defaultMode)).append("\n");
    sb.append("    sources: ").append(toIndentedString(sources)).append("\n");
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
    openapiFields.add("defaultMode");
    openapiFields.add("sources");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to V1ProjectedVolumeSource
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!V1ProjectedVolumeSource.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in V1ProjectedVolumeSource is not found in the empty JSON string", V1ProjectedVolumeSource.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!V1ProjectedVolumeSource.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `V1ProjectedVolumeSource` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (jsonObj.get("sources") != null && !jsonObj.get("sources").isJsonNull()) {
        JsonArray jsonArraysources = jsonObj.getAsJsonArray("sources");
        if (jsonArraysources != null) {
          // ensure the json data is an array
          if (!jsonObj.get("sources").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `sources` to be an array in the JSON string but got `%s`", jsonObj.get("sources").toString()));
          }

          // validate the optional field `sources` (array)
          for (int i = 0; i < jsonArraysources.size(); i++) {
            V1VolumeProjection.validateJsonElement(jsonArraysources.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!V1ProjectedVolumeSource.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'V1ProjectedVolumeSource' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<V1ProjectedVolumeSource> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(V1ProjectedVolumeSource.class));

       return (TypeAdapter<T>) new TypeAdapter<V1ProjectedVolumeSource>() {
           @Override
           public void write(JsonWriter out, V1ProjectedVolumeSource value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public V1ProjectedVolumeSource read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of V1ProjectedVolumeSource given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of V1ProjectedVolumeSource
   * @throws IOException if the JSON string is invalid with respect to V1ProjectedVolumeSource
   */
  public static V1ProjectedVolumeSource fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, V1ProjectedVolumeSource.class);
  }

  /**
   * Convert an instance of V1ProjectedVolumeSource to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
