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
import io.kubernetes.client.openapi.models.ApiextensionsV1WebhookClientConfig;
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
 * WebhookConversion describes how to call a conversion webhook
 */
@ApiModel(description = "WebhookConversion describes how to call a conversion webhook")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-09-11T18:00:16.154662Z[Etc/UTC]", comments = "Generator version: 7.13.0")
public class V1WebhookConversion {
  public static final String SERIALIZED_NAME_CLIENT_CONFIG = "clientConfig";
  @SerializedName(SERIALIZED_NAME_CLIENT_CONFIG)
  @jakarta.annotation.Nullable
  private ApiextensionsV1WebhookClientConfig clientConfig;

  public static final String SERIALIZED_NAME_CONVERSION_REVIEW_VERSIONS = "conversionReviewVersions";
  @SerializedName(SERIALIZED_NAME_CONVERSION_REVIEW_VERSIONS)
  @jakarta.annotation.Nonnull
  private List<String> conversionReviewVersions = new ArrayList<>();

  public V1WebhookConversion() {
  }

  public V1WebhookConversion clientConfig(@jakarta.annotation.Nullable ApiextensionsV1WebhookClientConfig clientConfig) {
    this.clientConfig = clientConfig;
    return this;
  }

  /**
   * Get clientConfig
   * @return clientConfig
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  public ApiextensionsV1WebhookClientConfig getClientConfig() {
    return clientConfig;
  }

  public void setClientConfig(@jakarta.annotation.Nullable ApiextensionsV1WebhookClientConfig clientConfig) {
    this.clientConfig = clientConfig;
  }


  public V1WebhookConversion conversionReviewVersions(@jakarta.annotation.Nonnull List<String> conversionReviewVersions) {
    this.conversionReviewVersions = conversionReviewVersions;
    return this;
  }

  public V1WebhookConversion addConversionReviewVersionsItem(String conversionReviewVersionsItem) {
    if (this.conversionReviewVersions == null) {
      this.conversionReviewVersions = new ArrayList<>();
    }
    this.conversionReviewVersions.add(conversionReviewVersionsItem);
    return this;
  }

  /**
   * conversionReviewVersions is an ordered list of preferred &#x60;ConversionReview&#x60; versions the Webhook expects. The API server will use the first version in the list which it supports. If none of the versions specified in this list are supported by API server, conversion will fail for the custom resource. If a persisted Webhook configuration specifies allowed versions and does not include any versions known to the API Server, calls to the webhook will fail.
   * @return conversionReviewVersions
   */
  @jakarta.annotation.Nonnull
  @ApiModelProperty(required = true, value = "conversionReviewVersions is an ordered list of preferred `ConversionReview` versions the Webhook expects. The API server will use the first version in the list which it supports. If none of the versions specified in this list are supported by API server, conversion will fail for the custom resource. If a persisted Webhook configuration specifies allowed versions and does not include any versions known to the API Server, calls to the webhook will fail.")
  public List<String> getConversionReviewVersions() {
    return conversionReviewVersions;
  }

  public void setConversionReviewVersions(@jakarta.annotation.Nonnull List<String> conversionReviewVersions) {
    this.conversionReviewVersions = conversionReviewVersions;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1WebhookConversion v1WebhookConversion = (V1WebhookConversion) o;
    return Objects.equals(this.clientConfig, v1WebhookConversion.clientConfig) &&
        Objects.equals(this.conversionReviewVersions, v1WebhookConversion.conversionReviewVersions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(clientConfig, conversionReviewVersions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1WebhookConversion {\n");
    sb.append("    clientConfig: ").append(toIndentedString(clientConfig)).append("\n");
    sb.append("    conversionReviewVersions: ").append(toIndentedString(conversionReviewVersions)).append("\n");
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
    openapiFields.add("clientConfig");
    openapiFields.add("conversionReviewVersions");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("conversionReviewVersions");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to V1WebhookConversion
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!V1WebhookConversion.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in V1WebhookConversion is not found in the empty JSON string", V1WebhookConversion.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!V1WebhookConversion.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `V1WebhookConversion` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : V1WebhookConversion.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `clientConfig`
      if (jsonObj.get("clientConfig") != null && !jsonObj.get("clientConfig").isJsonNull()) {
        ApiextensionsV1WebhookClientConfig.validateJsonElement(jsonObj.get("clientConfig"));
      }
      // ensure the required json array is present
      if (jsonObj.get("conversionReviewVersions") == null) {
        throw new IllegalArgumentException("Expected the field `linkedContent` to be an array in the JSON string but got `null`");
      } else if (!jsonObj.get("conversionReviewVersions").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `conversionReviewVersions` to be an array in the JSON string but got `%s`", jsonObj.get("conversionReviewVersions").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!V1WebhookConversion.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'V1WebhookConversion' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<V1WebhookConversion> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(V1WebhookConversion.class));

       return (TypeAdapter<T>) new TypeAdapter<V1WebhookConversion>() {
           @Override
           public void write(JsonWriter out, V1WebhookConversion value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public V1WebhookConversion read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of V1WebhookConversion given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of V1WebhookConversion
   * @throws IOException if the JSON string is invalid with respect to V1WebhookConversion
   */
  public static V1WebhookConversion fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, V1WebhookConversion.class);
  }

  /**
   * Convert an instance of V1WebhookConversion to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
