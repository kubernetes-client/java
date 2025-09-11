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
import io.kubernetes.client.openapi.models.V1MutatingWebhook;
import io.kubernetes.client.openapi.models.V1ObjectMeta;
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
 * MutatingWebhookConfiguration describes the configuration of and admission webhook that accept or reject and may change the object.
 */
@ApiModel(description = "MutatingWebhookConfiguration describes the configuration of and admission webhook that accept or reject and may change the object.")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-09-11T18:00:16.154662Z[Etc/UTC]", comments = "Generator version: 7.13.0")
public class V1MutatingWebhookConfiguration implements io.kubernetes.client.common.KubernetesObject {
  public static final String SERIALIZED_NAME_API_VERSION = "apiVersion";
  @SerializedName(SERIALIZED_NAME_API_VERSION)
  @jakarta.annotation.Nullable
  private String apiVersion;

  public static final String SERIALIZED_NAME_KIND = "kind";
  @SerializedName(SERIALIZED_NAME_KIND)
  @jakarta.annotation.Nullable
  private String kind;

  public static final String SERIALIZED_NAME_METADATA = "metadata";
  @SerializedName(SERIALIZED_NAME_METADATA)
  @jakarta.annotation.Nullable
  private V1ObjectMeta metadata;

  public static final String SERIALIZED_NAME_WEBHOOKS = "webhooks";
  @SerializedName(SERIALIZED_NAME_WEBHOOKS)
  @jakarta.annotation.Nullable
  private List<V1MutatingWebhook> webhooks = new ArrayList<>();

  public V1MutatingWebhookConfiguration() {
  }

  public V1MutatingWebhookConfiguration apiVersion(@jakarta.annotation.Nullable String apiVersion) {
    this.apiVersion = apiVersion;
    return this;
  }

  /**
   * APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
   * @return apiVersion
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources")
  public String getApiVersion() {
    return apiVersion;
  }

  public void setApiVersion(@jakarta.annotation.Nullable String apiVersion) {
    this.apiVersion = apiVersion;
  }


  public V1MutatingWebhookConfiguration kind(@jakarta.annotation.Nullable String kind) {
    this.kind = kind;
    return this;
  }

  /**
   * Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
   * @return kind
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds")
  public String getKind() {
    return kind;
  }

  public void setKind(@jakarta.annotation.Nullable String kind) {
    this.kind = kind;
  }


  public V1MutatingWebhookConfiguration metadata(@jakarta.annotation.Nullable V1ObjectMeta metadata) {
    this.metadata = metadata;
    return this;
  }

  /**
   * Get metadata
   * @return metadata
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  public V1ObjectMeta getMetadata() {
    return metadata;
  }

  public void setMetadata(@jakarta.annotation.Nullable V1ObjectMeta metadata) {
    this.metadata = metadata;
  }


  public V1MutatingWebhookConfiguration webhooks(@jakarta.annotation.Nullable List<V1MutatingWebhook> webhooks) {
    this.webhooks = webhooks;
    return this;
  }

  public V1MutatingWebhookConfiguration addWebhooksItem(V1MutatingWebhook webhooksItem) {
    if (this.webhooks == null) {
      this.webhooks = new ArrayList<>();
    }
    this.webhooks.add(webhooksItem);
    return this;
  }

  /**
   * Webhooks is a list of webhooks and the affected resources and operations.
   * @return webhooks
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "Webhooks is a list of webhooks and the affected resources and operations.")
  public List<V1MutatingWebhook> getWebhooks() {
    return webhooks;
  }

  public void setWebhooks(@jakarta.annotation.Nullable List<V1MutatingWebhook> webhooks) {
    this.webhooks = webhooks;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1MutatingWebhookConfiguration v1MutatingWebhookConfiguration = (V1MutatingWebhookConfiguration) o;
    return Objects.equals(this.apiVersion, v1MutatingWebhookConfiguration.apiVersion) &&
        Objects.equals(this.kind, v1MutatingWebhookConfiguration.kind) &&
        Objects.equals(this.metadata, v1MutatingWebhookConfiguration.metadata) &&
        Objects.equals(this.webhooks, v1MutatingWebhookConfiguration.webhooks);
  }

  @Override
  public int hashCode() {
    return Objects.hash(apiVersion, kind, metadata, webhooks);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1MutatingWebhookConfiguration {\n");
    sb.append("    apiVersion: ").append(toIndentedString(apiVersion)).append("\n");
    sb.append("    kind: ").append(toIndentedString(kind)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    webhooks: ").append(toIndentedString(webhooks)).append("\n");
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
    openapiFields.add("apiVersion");
    openapiFields.add("kind");
    openapiFields.add("metadata");
    openapiFields.add("webhooks");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to V1MutatingWebhookConfiguration
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!V1MutatingWebhookConfiguration.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in V1MutatingWebhookConfiguration is not found in the empty JSON string", V1MutatingWebhookConfiguration.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!V1MutatingWebhookConfiguration.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `V1MutatingWebhookConfiguration` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("apiVersion") != null && !jsonObj.get("apiVersion").isJsonNull()) && !jsonObj.get("apiVersion").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `apiVersion` to be a primitive type in the JSON string but got `%s`", jsonObj.get("apiVersion").toString()));
      }
      if ((jsonObj.get("kind") != null && !jsonObj.get("kind").isJsonNull()) && !jsonObj.get("kind").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `kind` to be a primitive type in the JSON string but got `%s`", jsonObj.get("kind").toString()));
      }
      // validate the optional field `metadata`
      if (jsonObj.get("metadata") != null && !jsonObj.get("metadata").isJsonNull()) {
        V1ObjectMeta.validateJsonElement(jsonObj.get("metadata"));
      }
      if (jsonObj.get("webhooks") != null && !jsonObj.get("webhooks").isJsonNull()) {
        JsonArray jsonArraywebhooks = jsonObj.getAsJsonArray("webhooks");
        if (jsonArraywebhooks != null) {
          // ensure the json data is an array
          if (!jsonObj.get("webhooks").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `webhooks` to be an array in the JSON string but got `%s`", jsonObj.get("webhooks").toString()));
          }

          // validate the optional field `webhooks` (array)
          for (int i = 0; i < jsonArraywebhooks.size(); i++) {
            V1MutatingWebhook.validateJsonElement(jsonArraywebhooks.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!V1MutatingWebhookConfiguration.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'V1MutatingWebhookConfiguration' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<V1MutatingWebhookConfiguration> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(V1MutatingWebhookConfiguration.class));

       return (TypeAdapter<T>) new TypeAdapter<V1MutatingWebhookConfiguration>() {
           @Override
           public void write(JsonWriter out, V1MutatingWebhookConfiguration value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public V1MutatingWebhookConfiguration read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of V1MutatingWebhookConfiguration given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of V1MutatingWebhookConfiguration
   * @throws IOException if the JSON string is invalid with respect to V1MutatingWebhookConfiguration
   */
  public static V1MutatingWebhookConfiguration fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, V1MutatingWebhookConfiguration.class);
  }

  /**
   * Convert an instance of V1MutatingWebhookConfiguration to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
