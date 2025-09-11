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
import io.kubernetes.client.openapi.models.V1LocalObjectReference;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

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
 * FlexVolume represents a generic volume resource that is provisioned/attached using an exec based plugin.
 */
@ApiModel(description = "FlexVolume represents a generic volume resource that is provisioned/attached using an exec based plugin.")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-09-11T18:00:16.154662Z[Etc/UTC]", comments = "Generator version: 7.13.0")
public class V1FlexVolumeSource {
  public static final String SERIALIZED_NAME_DRIVER = "driver";
  @SerializedName(SERIALIZED_NAME_DRIVER)
  @jakarta.annotation.Nonnull
  private String driver;

  public static final String SERIALIZED_NAME_FS_TYPE = "fsType";
  @SerializedName(SERIALIZED_NAME_FS_TYPE)
  @jakarta.annotation.Nullable
  private String fsType;

  public static final String SERIALIZED_NAME_OPTIONS = "options";
  @SerializedName(SERIALIZED_NAME_OPTIONS)
  @jakarta.annotation.Nullable
  private Map<String, String> options = new HashMap<>();

  public static final String SERIALIZED_NAME_READ_ONLY = "readOnly";
  @SerializedName(SERIALIZED_NAME_READ_ONLY)
  @jakarta.annotation.Nullable
  private Boolean readOnly;

  public static final String SERIALIZED_NAME_SECRET_REF = "secretRef";
  @SerializedName(SERIALIZED_NAME_SECRET_REF)
  @jakarta.annotation.Nullable
  private V1LocalObjectReference secretRef;

  public V1FlexVolumeSource() {
  }

  public V1FlexVolumeSource driver(@jakarta.annotation.Nonnull String driver) {
    this.driver = driver;
    return this;
  }

  /**
   * driver is the name of the driver to use for this volume.
   * @return driver
   */
  @jakarta.annotation.Nonnull
  @ApiModelProperty(required = true, value = "driver is the name of the driver to use for this volume.")
  public String getDriver() {
    return driver;
  }

  public void setDriver(@jakarta.annotation.Nonnull String driver) {
    this.driver = driver;
  }


  public V1FlexVolumeSource fsType(@jakarta.annotation.Nullable String fsType) {
    this.fsType = fsType;
    return this;
  }

  /**
   * fsType is the filesystem type to mount. Must be a filesystem type supported by the host operating system. Ex. \&quot;ext4\&quot;, \&quot;xfs\&quot;, \&quot;ntfs\&quot;. The default filesystem depends on FlexVolume script.
   * @return fsType
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "fsType is the filesystem type to mount. Must be a filesystem type supported by the host operating system. Ex. \"ext4\", \"xfs\", \"ntfs\". The default filesystem depends on FlexVolume script.")
  public String getFsType() {
    return fsType;
  }

  public void setFsType(@jakarta.annotation.Nullable String fsType) {
    this.fsType = fsType;
  }


  public V1FlexVolumeSource options(@jakarta.annotation.Nullable Map<String, String> options) {
    this.options = options;
    return this;
  }

  public V1FlexVolumeSource putOptionsItem(String key, String optionsItem) {
    if (this.options == null) {
      this.options = new HashMap<>();
    }
    this.options.put(key, optionsItem);
    return this;
  }

  /**
   * options is Optional: this field holds extra command options if any.
   * @return options
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "options is Optional: this field holds extra command options if any.")
  public Map<String, String> getOptions() {
    return options;
  }

  public void setOptions(@jakarta.annotation.Nullable Map<String, String> options) {
    this.options = options;
  }


  public V1FlexVolumeSource readOnly(@jakarta.annotation.Nullable Boolean readOnly) {
    this.readOnly = readOnly;
    return this;
  }

  /**
   * readOnly is Optional: defaults to false (read/write). ReadOnly here will force the ReadOnly setting in VolumeMounts.
   * @return readOnly
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "readOnly is Optional: defaults to false (read/write). ReadOnly here will force the ReadOnly setting in VolumeMounts.")
  public Boolean getReadOnly() {
    return readOnly;
  }

  public void setReadOnly(@jakarta.annotation.Nullable Boolean readOnly) {
    this.readOnly = readOnly;
  }


  public V1FlexVolumeSource secretRef(@jakarta.annotation.Nullable V1LocalObjectReference secretRef) {
    this.secretRef = secretRef;
    return this;
  }

  /**
   * Get secretRef
   * @return secretRef
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  public V1LocalObjectReference getSecretRef() {
    return secretRef;
  }

  public void setSecretRef(@jakarta.annotation.Nullable V1LocalObjectReference secretRef) {
    this.secretRef = secretRef;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1FlexVolumeSource v1FlexVolumeSource = (V1FlexVolumeSource) o;
    return Objects.equals(this.driver, v1FlexVolumeSource.driver) &&
        Objects.equals(this.fsType, v1FlexVolumeSource.fsType) &&
        Objects.equals(this.options, v1FlexVolumeSource.options) &&
        Objects.equals(this.readOnly, v1FlexVolumeSource.readOnly) &&
        Objects.equals(this.secretRef, v1FlexVolumeSource.secretRef);
  }

  @Override
  public int hashCode() {
    return Objects.hash(driver, fsType, options, readOnly, secretRef);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1FlexVolumeSource {\n");
    sb.append("    driver: ").append(toIndentedString(driver)).append("\n");
    sb.append("    fsType: ").append(toIndentedString(fsType)).append("\n");
    sb.append("    options: ").append(toIndentedString(options)).append("\n");
    sb.append("    readOnly: ").append(toIndentedString(readOnly)).append("\n");
    sb.append("    secretRef: ").append(toIndentedString(secretRef)).append("\n");
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
    openapiFields.add("driver");
    openapiFields.add("fsType");
    openapiFields.add("options");
    openapiFields.add("readOnly");
    openapiFields.add("secretRef");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("driver");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to V1FlexVolumeSource
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!V1FlexVolumeSource.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in V1FlexVolumeSource is not found in the empty JSON string", V1FlexVolumeSource.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!V1FlexVolumeSource.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `V1FlexVolumeSource` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : V1FlexVolumeSource.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("driver").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `driver` to be a primitive type in the JSON string but got `%s`", jsonObj.get("driver").toString()));
      }
      if ((jsonObj.get("fsType") != null && !jsonObj.get("fsType").isJsonNull()) && !jsonObj.get("fsType").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `fsType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("fsType").toString()));
      }
      // validate the optional field `secretRef`
      if (jsonObj.get("secretRef") != null && !jsonObj.get("secretRef").isJsonNull()) {
        V1LocalObjectReference.validateJsonElement(jsonObj.get("secretRef"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!V1FlexVolumeSource.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'V1FlexVolumeSource' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<V1FlexVolumeSource> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(V1FlexVolumeSource.class));

       return (TypeAdapter<T>) new TypeAdapter<V1FlexVolumeSource>() {
           @Override
           public void write(JsonWriter out, V1FlexVolumeSource value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public V1FlexVolumeSource read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of V1FlexVolumeSource given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of V1FlexVolumeSource
   * @throws IOException if the JSON string is invalid with respect to V1FlexVolumeSource
   */
  public static V1FlexVolumeSource fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, V1FlexVolumeSource.class);
  }

  /**
   * Convert an instance of V1FlexVolumeSource to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
