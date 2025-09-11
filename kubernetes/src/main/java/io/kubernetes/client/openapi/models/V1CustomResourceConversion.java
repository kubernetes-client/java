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
import io.kubernetes.client.openapi.models.V1WebhookConversion;
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
 * CustomResourceConversion describes how to convert different versions of a CR.
 */
@ApiModel(description = "CustomResourceConversion describes how to convert different versions of a CR.")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-09-11T18:00:16.154662Z[Etc/UTC]", comments = "Generator version: 7.13.0")
public class V1CustomResourceConversion {
  public static final String SERIALIZED_NAME_STRATEGY = "strategy";
  @SerializedName(SERIALIZED_NAME_STRATEGY)
  @jakarta.annotation.Nonnull
  private String strategy;

  public static final String SERIALIZED_NAME_WEBHOOK = "webhook";
  @SerializedName(SERIALIZED_NAME_WEBHOOK)
  @jakarta.annotation.Nullable
  private V1WebhookConversion webhook;

  public V1CustomResourceConversion() {
  }

  public V1CustomResourceConversion strategy(@jakarta.annotation.Nonnull String strategy) {
    this.strategy = strategy;
    return this;
  }

  /**
   * strategy specifies how custom resources are converted between versions. Allowed values are: - &#x60;\&quot;None\&quot;&#x60;: The converter only change the apiVersion and would not touch any other field in the custom resource. - &#x60;\&quot;Webhook\&quot;&#x60;: API Server will call to an external webhook to do the conversion. Additional information   is needed for this option. This requires spec.preserveUnknownFields to be false, and spec.conversion.webhook to be set.
   * @return strategy
   */
  @jakarta.annotation.Nonnull
  @ApiModelProperty(required = true, value = "strategy specifies how custom resources are converted between versions. Allowed values are: - `\"None\"`: The converter only change the apiVersion and would not touch any other field in the custom resource. - `\"Webhook\"`: API Server will call to an external webhook to do the conversion. Additional information   is needed for this option. This requires spec.preserveUnknownFields to be false, and spec.conversion.webhook to be set.")
  public String getStrategy() {
    return strategy;
  }

  public void setStrategy(@jakarta.annotation.Nonnull String strategy) {
    this.strategy = strategy;
  }


  public V1CustomResourceConversion webhook(@jakarta.annotation.Nullable V1WebhookConversion webhook) {
    this.webhook = webhook;
    return this;
  }

  /**
   * Get webhook
   * @return webhook
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  public V1WebhookConversion getWebhook() {
    return webhook;
  }

  public void setWebhook(@jakarta.annotation.Nullable V1WebhookConversion webhook) {
    this.webhook = webhook;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1CustomResourceConversion v1CustomResourceConversion = (V1CustomResourceConversion) o;
    return Objects.equals(this.strategy, v1CustomResourceConversion.strategy) &&
        Objects.equals(this.webhook, v1CustomResourceConversion.webhook);
  }

  @Override
  public int hashCode() {
    return Objects.hash(strategy, webhook);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1CustomResourceConversion {\n");
    sb.append("    strategy: ").append(toIndentedString(strategy)).append("\n");
    sb.append("    webhook: ").append(toIndentedString(webhook)).append("\n");
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
    openapiFields.add("strategy");
    openapiFields.add("webhook");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("strategy");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to V1CustomResourceConversion
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!V1CustomResourceConversion.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in V1CustomResourceConversion is not found in the empty JSON string", V1CustomResourceConversion.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!V1CustomResourceConversion.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `V1CustomResourceConversion` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : V1CustomResourceConversion.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("strategy").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `strategy` to be a primitive type in the JSON string but got `%s`", jsonObj.get("strategy").toString()));
      }
      // validate the optional field `webhook`
      if (jsonObj.get("webhook") != null && !jsonObj.get("webhook").isJsonNull()) {
        V1WebhookConversion.validateJsonElement(jsonObj.get("webhook"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!V1CustomResourceConversion.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'V1CustomResourceConversion' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<V1CustomResourceConversion> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(V1CustomResourceConversion.class));

       return (TypeAdapter<T>) new TypeAdapter<V1CustomResourceConversion>() {
           @Override
           public void write(JsonWriter out, V1CustomResourceConversion value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public V1CustomResourceConversion read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of V1CustomResourceConversion given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of V1CustomResourceConversion
   * @throws IOException if the JSON string is invalid with respect to V1CustomResourceConversion
   */
  public static V1CustomResourceConversion fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, V1CustomResourceConversion.class);
  }

  /**
   * Convert an instance of V1CustomResourceConversion to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
