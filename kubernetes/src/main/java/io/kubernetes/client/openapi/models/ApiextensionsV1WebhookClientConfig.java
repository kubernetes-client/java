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
import io.kubernetes.client.openapi.models.ApiextensionsV1ServiceReference;
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
 * WebhookClientConfig contains the information to make a TLS connection with the webhook.
 */
@ApiModel(description = "WebhookClientConfig contains the information to make a TLS connection with the webhook.")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-09-11T18:00:16.154662Z[Etc/UTC]", comments = "Generator version: 7.13.0")
public class ApiextensionsV1WebhookClientConfig {
  public static final String SERIALIZED_NAME_CA_BUNDLE = "caBundle";
  @SerializedName(SERIALIZED_NAME_CA_BUNDLE)
  @jakarta.annotation.Nullable
  private byte[] caBundle;

  public static final String SERIALIZED_NAME_SERVICE = "service";
  @SerializedName(SERIALIZED_NAME_SERVICE)
  @jakarta.annotation.Nullable
  private ApiextensionsV1ServiceReference service;

  public static final String SERIALIZED_NAME_URL = "url";
  @SerializedName(SERIALIZED_NAME_URL)
  @jakarta.annotation.Nullable
  private String url;

  public ApiextensionsV1WebhookClientConfig() {
  }

  public ApiextensionsV1WebhookClientConfig caBundle(@jakarta.annotation.Nullable byte[] caBundle) {
    this.caBundle = caBundle;
    return this;
  }

  /**
   * caBundle is a PEM encoded CA bundle which will be used to validate the webhook&#39;s server certificate. If unspecified, system trust roots on the apiserver are used.
   * @return caBundle
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "caBundle is a PEM encoded CA bundle which will be used to validate the webhook's server certificate. If unspecified, system trust roots on the apiserver are used.")
  public byte[] getCaBundle() {
    return caBundle;
  }

  public void setCaBundle(@jakarta.annotation.Nullable byte[] caBundle) {
    this.caBundle = caBundle;
  }


  public ApiextensionsV1WebhookClientConfig service(@jakarta.annotation.Nullable ApiextensionsV1ServiceReference service) {
    this.service = service;
    return this;
  }

  /**
   * Get service
   * @return service
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  public ApiextensionsV1ServiceReference getService() {
    return service;
  }

  public void setService(@jakarta.annotation.Nullable ApiextensionsV1ServiceReference service) {
    this.service = service;
  }


  public ApiextensionsV1WebhookClientConfig url(@jakarta.annotation.Nullable String url) {
    this.url = url;
    return this;
  }

  /**
   * url gives the location of the webhook, in standard URL form (&#x60;scheme://host:port/path&#x60;). Exactly one of &#x60;url&#x60; or &#x60;service&#x60; must be specified.  The &#x60;host&#x60; should not refer to a service running in the cluster; use the &#x60;service&#x60; field instead. The host might be resolved via external DNS in some apiservers (e.g., &#x60;kube-apiserver&#x60; cannot resolve in-cluster DNS as that would be a layering violation). &#x60;host&#x60; may also be an IP address.  Please note that using &#x60;localhost&#x60; or &#x60;127.0.0.1&#x60; as a &#x60;host&#x60; is risky unless you take great care to run this webhook on all hosts which run an apiserver which might need to make calls to this webhook. Such installs are likely to be non-portable, i.e., not easy to turn up in a new cluster.  The scheme must be \&quot;https\&quot;; the URL must begin with \&quot;https://\&quot;.  A path is optional, and if present may be any string permissible in a URL. You may use the path to pass an arbitrary string to the webhook, for example, a cluster identifier.  Attempting to use a user or basic auth e.g. \&quot;user:password@\&quot; is not allowed. Fragments (\&quot;#...\&quot;) and query parameters (\&quot;?...\&quot;) are not allowed, either.
   * @return url
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "url gives the location of the webhook, in standard URL form (`scheme://host:port/path`). Exactly one of `url` or `service` must be specified.  The `host` should not refer to a service running in the cluster; use the `service` field instead. The host might be resolved via external DNS in some apiservers (e.g., `kube-apiserver` cannot resolve in-cluster DNS as that would be a layering violation). `host` may also be an IP address.  Please note that using `localhost` or `127.0.0.1` as a `host` is risky unless you take great care to run this webhook on all hosts which run an apiserver which might need to make calls to this webhook. Such installs are likely to be non-portable, i.e., not easy to turn up in a new cluster.  The scheme must be \"https\"; the URL must begin with \"https://\".  A path is optional, and if present may be any string permissible in a URL. You may use the path to pass an arbitrary string to the webhook, for example, a cluster identifier.  Attempting to use a user or basic auth e.g. \"user:password@\" is not allowed. Fragments (\"#...\") and query parameters (\"?...\") are not allowed, either.")
  public String getUrl() {
    return url;
  }

  public void setUrl(@jakarta.annotation.Nullable String url) {
    this.url = url;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApiextensionsV1WebhookClientConfig apiextensionsV1WebhookClientConfig = (ApiextensionsV1WebhookClientConfig) o;
    return Arrays.equals(this.caBundle, apiextensionsV1WebhookClientConfig.caBundle) &&
        Objects.equals(this.service, apiextensionsV1WebhookClientConfig.service) &&
        Objects.equals(this.url, apiextensionsV1WebhookClientConfig.url);
  }

  @Override
  public int hashCode() {
    return Objects.hash(Arrays.hashCode(caBundle), service, url);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApiextensionsV1WebhookClientConfig {\n");
    sb.append("    caBundle: ").append(toIndentedString(caBundle)).append("\n");
    sb.append("    service: ").append(toIndentedString(service)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
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
    openapiFields.add("caBundle");
    openapiFields.add("service");
    openapiFields.add("url");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to ApiextensionsV1WebhookClientConfig
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ApiextensionsV1WebhookClientConfig.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ApiextensionsV1WebhookClientConfig is not found in the empty JSON string", ApiextensionsV1WebhookClientConfig.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ApiextensionsV1WebhookClientConfig.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ApiextensionsV1WebhookClientConfig` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `service`
      if (jsonObj.get("service") != null && !jsonObj.get("service").isJsonNull()) {
        ApiextensionsV1ServiceReference.validateJsonElement(jsonObj.get("service"));
      }
      if ((jsonObj.get("url") != null && !jsonObj.get("url").isJsonNull()) && !jsonObj.get("url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("url").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ApiextensionsV1WebhookClientConfig.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ApiextensionsV1WebhookClientConfig' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ApiextensionsV1WebhookClientConfig> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ApiextensionsV1WebhookClientConfig.class));

       return (TypeAdapter<T>) new TypeAdapter<ApiextensionsV1WebhookClientConfig>() {
           @Override
           public void write(JsonWriter out, ApiextensionsV1WebhookClientConfig value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ApiextensionsV1WebhookClientConfig read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of ApiextensionsV1WebhookClientConfig given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of ApiextensionsV1WebhookClientConfig
   * @throws IOException if the JSON string is invalid with respect to ApiextensionsV1WebhookClientConfig
   */
  public static ApiextensionsV1WebhookClientConfig fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ApiextensionsV1WebhookClientConfig.class);
  }

  /**
   * Convert an instance of ApiextensionsV1WebhookClientConfig to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
