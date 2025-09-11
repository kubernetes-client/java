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
 * ConfigMapNodeConfigSource contains the information to reference a ConfigMap as a config source for the Node. This API is deprecated since 1.22: https://git.k8s.io/enhancements/keps/sig-node/281-dynamic-kubelet-configuration
 */
@ApiModel(description = "ConfigMapNodeConfigSource contains the information to reference a ConfigMap as a config source for the Node. This API is deprecated since 1.22: https://git.k8s.io/enhancements/keps/sig-node/281-dynamic-kubelet-configuration")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-09-11T18:00:16.154662Z[Etc/UTC]", comments = "Generator version: 7.13.0")
public class V1ConfigMapNodeConfigSource {
  public static final String SERIALIZED_NAME_KUBELET_CONFIG_KEY = "kubeletConfigKey";
  @SerializedName(SERIALIZED_NAME_KUBELET_CONFIG_KEY)
  @jakarta.annotation.Nonnull
  private String kubeletConfigKey;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  @jakarta.annotation.Nonnull
  private String name;

  public static final String SERIALIZED_NAME_NAMESPACE = "namespace";
  @SerializedName(SERIALIZED_NAME_NAMESPACE)
  @jakarta.annotation.Nonnull
  private String namespace;

  public static final String SERIALIZED_NAME_RESOURCE_VERSION = "resourceVersion";
  @SerializedName(SERIALIZED_NAME_RESOURCE_VERSION)
  @jakarta.annotation.Nullable
  private String resourceVersion;

  public static final String SERIALIZED_NAME_UID = "uid";
  @SerializedName(SERIALIZED_NAME_UID)
  @jakarta.annotation.Nullable
  private String uid;

  public V1ConfigMapNodeConfigSource() {
  }

  public V1ConfigMapNodeConfigSource kubeletConfigKey(@jakarta.annotation.Nonnull String kubeletConfigKey) {
    this.kubeletConfigKey = kubeletConfigKey;
    return this;
  }

  /**
   * KubeletConfigKey declares which key of the referenced ConfigMap corresponds to the KubeletConfiguration structure This field is required in all cases.
   * @return kubeletConfigKey
   */
  @jakarta.annotation.Nonnull
  @ApiModelProperty(required = true, value = "KubeletConfigKey declares which key of the referenced ConfigMap corresponds to the KubeletConfiguration structure This field is required in all cases.")
  public String getKubeletConfigKey() {
    return kubeletConfigKey;
  }

  public void setKubeletConfigKey(@jakarta.annotation.Nonnull String kubeletConfigKey) {
    this.kubeletConfigKey = kubeletConfigKey;
  }


  public V1ConfigMapNodeConfigSource name(@jakarta.annotation.Nonnull String name) {
    this.name = name;
    return this;
  }

  /**
   * Name is the metadata.name of the referenced ConfigMap. This field is required in all cases.
   * @return name
   */
  @jakarta.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Name is the metadata.name of the referenced ConfigMap. This field is required in all cases.")
  public String getName() {
    return name;
  }

  public void setName(@jakarta.annotation.Nonnull String name) {
    this.name = name;
  }


  public V1ConfigMapNodeConfigSource namespace(@jakarta.annotation.Nonnull String namespace) {
    this.namespace = namespace;
    return this;
  }

  /**
   * Namespace is the metadata.namespace of the referenced ConfigMap. This field is required in all cases.
   * @return namespace
   */
  @jakarta.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Namespace is the metadata.namespace of the referenced ConfigMap. This field is required in all cases.")
  public String getNamespace() {
    return namespace;
  }

  public void setNamespace(@jakarta.annotation.Nonnull String namespace) {
    this.namespace = namespace;
  }


  public V1ConfigMapNodeConfigSource resourceVersion(@jakarta.annotation.Nullable String resourceVersion) {
    this.resourceVersion = resourceVersion;
    return this;
  }

  /**
   * ResourceVersion is the metadata.ResourceVersion of the referenced ConfigMap. This field is forbidden in Node.Spec, and required in Node.Status.
   * @return resourceVersion
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "ResourceVersion is the metadata.ResourceVersion of the referenced ConfigMap. This field is forbidden in Node.Spec, and required in Node.Status.")
  public String getResourceVersion() {
    return resourceVersion;
  }

  public void setResourceVersion(@jakarta.annotation.Nullable String resourceVersion) {
    this.resourceVersion = resourceVersion;
  }


  public V1ConfigMapNodeConfigSource uid(@jakarta.annotation.Nullable String uid) {
    this.uid = uid;
    return this;
  }

  /**
   * UID is the metadata.UID of the referenced ConfigMap. This field is forbidden in Node.Spec, and required in Node.Status.
   * @return uid
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "UID is the metadata.UID of the referenced ConfigMap. This field is forbidden in Node.Spec, and required in Node.Status.")
  public String getUid() {
    return uid;
  }

  public void setUid(@jakarta.annotation.Nullable String uid) {
    this.uid = uid;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1ConfigMapNodeConfigSource v1ConfigMapNodeConfigSource = (V1ConfigMapNodeConfigSource) o;
    return Objects.equals(this.kubeletConfigKey, v1ConfigMapNodeConfigSource.kubeletConfigKey) &&
        Objects.equals(this.name, v1ConfigMapNodeConfigSource.name) &&
        Objects.equals(this.namespace, v1ConfigMapNodeConfigSource.namespace) &&
        Objects.equals(this.resourceVersion, v1ConfigMapNodeConfigSource.resourceVersion) &&
        Objects.equals(this.uid, v1ConfigMapNodeConfigSource.uid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(kubeletConfigKey, name, namespace, resourceVersion, uid);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1ConfigMapNodeConfigSource {\n");
    sb.append("    kubeletConfigKey: ").append(toIndentedString(kubeletConfigKey)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    namespace: ").append(toIndentedString(namespace)).append("\n");
    sb.append("    resourceVersion: ").append(toIndentedString(resourceVersion)).append("\n");
    sb.append("    uid: ").append(toIndentedString(uid)).append("\n");
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
    openapiFields.add("kubeletConfigKey");
    openapiFields.add("name");
    openapiFields.add("namespace");
    openapiFields.add("resourceVersion");
    openapiFields.add("uid");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("kubeletConfigKey");
    openapiRequiredFields.add("name");
    openapiRequiredFields.add("namespace");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to V1ConfigMapNodeConfigSource
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!V1ConfigMapNodeConfigSource.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in V1ConfigMapNodeConfigSource is not found in the empty JSON string", V1ConfigMapNodeConfigSource.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!V1ConfigMapNodeConfigSource.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `V1ConfigMapNodeConfigSource` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : V1ConfigMapNodeConfigSource.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("kubeletConfigKey").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `kubeletConfigKey` to be a primitive type in the JSON string but got `%s`", jsonObj.get("kubeletConfigKey").toString()));
      }
      if (!jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if (!jsonObj.get("namespace").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `namespace` to be a primitive type in the JSON string but got `%s`", jsonObj.get("namespace").toString()));
      }
      if ((jsonObj.get("resourceVersion") != null && !jsonObj.get("resourceVersion").isJsonNull()) && !jsonObj.get("resourceVersion").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `resourceVersion` to be a primitive type in the JSON string but got `%s`", jsonObj.get("resourceVersion").toString()));
      }
      if ((jsonObj.get("uid") != null && !jsonObj.get("uid").isJsonNull()) && !jsonObj.get("uid").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `uid` to be a primitive type in the JSON string but got `%s`", jsonObj.get("uid").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!V1ConfigMapNodeConfigSource.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'V1ConfigMapNodeConfigSource' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<V1ConfigMapNodeConfigSource> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(V1ConfigMapNodeConfigSource.class));

       return (TypeAdapter<T>) new TypeAdapter<V1ConfigMapNodeConfigSource>() {
           @Override
           public void write(JsonWriter out, V1ConfigMapNodeConfigSource value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public V1ConfigMapNodeConfigSource read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of V1ConfigMapNodeConfigSource given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of V1ConfigMapNodeConfigSource
   * @throws IOException if the JSON string is invalid with respect to V1ConfigMapNodeConfigSource
   */
  public static V1ConfigMapNodeConfigSource fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, V1ConfigMapNodeConfigSource.class);
  }

  /**
   * Convert an instance of V1ConfigMapNodeConfigSource to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
