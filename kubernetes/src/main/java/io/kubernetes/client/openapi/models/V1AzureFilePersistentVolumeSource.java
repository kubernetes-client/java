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
 * AzureFile represents an Azure File Service mount on the host and bind mount to the pod.
 */
@ApiModel(description = "AzureFile represents an Azure File Service mount on the host and bind mount to the pod.")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-09-11T18:00:16.154662Z[Etc/UTC]", comments = "Generator version: 7.13.0")
public class V1AzureFilePersistentVolumeSource {
  public static final String SERIALIZED_NAME_READ_ONLY = "readOnly";
  @SerializedName(SERIALIZED_NAME_READ_ONLY)
  @jakarta.annotation.Nullable
  private Boolean readOnly;

  public static final String SERIALIZED_NAME_SECRET_NAME = "secretName";
  @SerializedName(SERIALIZED_NAME_SECRET_NAME)
  @jakarta.annotation.Nonnull
  private String secretName;

  public static final String SERIALIZED_NAME_SECRET_NAMESPACE = "secretNamespace";
  @SerializedName(SERIALIZED_NAME_SECRET_NAMESPACE)
  @jakarta.annotation.Nullable
  private String secretNamespace;

  public static final String SERIALIZED_NAME_SHARE_NAME = "shareName";
  @SerializedName(SERIALIZED_NAME_SHARE_NAME)
  @jakarta.annotation.Nonnull
  private String shareName;

  public V1AzureFilePersistentVolumeSource() {
  }

  public V1AzureFilePersistentVolumeSource readOnly(@jakarta.annotation.Nullable Boolean readOnly) {
    this.readOnly = readOnly;
    return this;
  }

  /**
   * readOnly defaults to false (read/write). ReadOnly here will force the ReadOnly setting in VolumeMounts.
   * @return readOnly
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "readOnly defaults to false (read/write). ReadOnly here will force the ReadOnly setting in VolumeMounts.")
  public Boolean getReadOnly() {
    return readOnly;
  }

  public void setReadOnly(@jakarta.annotation.Nullable Boolean readOnly) {
    this.readOnly = readOnly;
  }


  public V1AzureFilePersistentVolumeSource secretName(@jakarta.annotation.Nonnull String secretName) {
    this.secretName = secretName;
    return this;
  }

  /**
   * secretName is the name of secret that contains Azure Storage Account Name and Key
   * @return secretName
   */
  @jakarta.annotation.Nonnull
  @ApiModelProperty(required = true, value = "secretName is the name of secret that contains Azure Storage Account Name and Key")
  public String getSecretName() {
    return secretName;
  }

  public void setSecretName(@jakarta.annotation.Nonnull String secretName) {
    this.secretName = secretName;
  }


  public V1AzureFilePersistentVolumeSource secretNamespace(@jakarta.annotation.Nullable String secretNamespace) {
    this.secretNamespace = secretNamespace;
    return this;
  }

  /**
   * secretNamespace is the namespace of the secret that contains Azure Storage Account Name and Key default is the same as the Pod
   * @return secretNamespace
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "secretNamespace is the namespace of the secret that contains Azure Storage Account Name and Key default is the same as the Pod")
  public String getSecretNamespace() {
    return secretNamespace;
  }

  public void setSecretNamespace(@jakarta.annotation.Nullable String secretNamespace) {
    this.secretNamespace = secretNamespace;
  }


  public V1AzureFilePersistentVolumeSource shareName(@jakarta.annotation.Nonnull String shareName) {
    this.shareName = shareName;
    return this;
  }

  /**
   * shareName is the azure Share Name
   * @return shareName
   */
  @jakarta.annotation.Nonnull
  @ApiModelProperty(required = true, value = "shareName is the azure Share Name")
  public String getShareName() {
    return shareName;
  }

  public void setShareName(@jakarta.annotation.Nonnull String shareName) {
    this.shareName = shareName;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1AzureFilePersistentVolumeSource v1AzureFilePersistentVolumeSource = (V1AzureFilePersistentVolumeSource) o;
    return Objects.equals(this.readOnly, v1AzureFilePersistentVolumeSource.readOnly) &&
        Objects.equals(this.secretName, v1AzureFilePersistentVolumeSource.secretName) &&
        Objects.equals(this.secretNamespace, v1AzureFilePersistentVolumeSource.secretNamespace) &&
        Objects.equals(this.shareName, v1AzureFilePersistentVolumeSource.shareName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(readOnly, secretName, secretNamespace, shareName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1AzureFilePersistentVolumeSource {\n");
    sb.append("    readOnly: ").append(toIndentedString(readOnly)).append("\n");
    sb.append("    secretName: ").append(toIndentedString(secretName)).append("\n");
    sb.append("    secretNamespace: ").append(toIndentedString(secretNamespace)).append("\n");
    sb.append("    shareName: ").append(toIndentedString(shareName)).append("\n");
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
    openapiFields.add("readOnly");
    openapiFields.add("secretName");
    openapiFields.add("secretNamespace");
    openapiFields.add("shareName");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("secretName");
    openapiRequiredFields.add("shareName");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to V1AzureFilePersistentVolumeSource
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!V1AzureFilePersistentVolumeSource.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in V1AzureFilePersistentVolumeSource is not found in the empty JSON string", V1AzureFilePersistentVolumeSource.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!V1AzureFilePersistentVolumeSource.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `V1AzureFilePersistentVolumeSource` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : V1AzureFilePersistentVolumeSource.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("secretName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `secretName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("secretName").toString()));
      }
      if ((jsonObj.get("secretNamespace") != null && !jsonObj.get("secretNamespace").isJsonNull()) && !jsonObj.get("secretNamespace").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `secretNamespace` to be a primitive type in the JSON string but got `%s`", jsonObj.get("secretNamespace").toString()));
      }
      if (!jsonObj.get("shareName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `shareName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("shareName").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!V1AzureFilePersistentVolumeSource.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'V1AzureFilePersistentVolumeSource' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<V1AzureFilePersistentVolumeSource> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(V1AzureFilePersistentVolumeSource.class));

       return (TypeAdapter<T>) new TypeAdapter<V1AzureFilePersistentVolumeSource>() {
           @Override
           public void write(JsonWriter out, V1AzureFilePersistentVolumeSource value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public V1AzureFilePersistentVolumeSource read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of V1AzureFilePersistentVolumeSource given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of V1AzureFilePersistentVolumeSource
   * @throws IOException if the JSON string is invalid with respect to V1AzureFilePersistentVolumeSource
   */
  public static V1AzureFilePersistentVolumeSource fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, V1AzureFilePersistentVolumeSource.class);
  }

  /**
   * Convert an instance of V1AzureFilePersistentVolumeSource to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
