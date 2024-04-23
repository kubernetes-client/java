/*
Copyright 2024 The Kubernetes Authors.
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
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.kubernetes.client.openapi.models.AdmissionregistrationV1ServiceReference;
import java.io.IOException;

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

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import io.kubernetes.client.openapi.JSON;

/**
 * WebhookClientConfig contains the information to make a TLS connection with the webhook
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-23T13:45:09.091597Z[Etc/UTC]")
public class AdmissionregistrationV1WebhookClientConfig {
  public static final String SERIALIZED_NAME_CA_BUNDLE = "caBundle";
  @SerializedName(SERIALIZED_NAME_CA_BUNDLE)
  private byte[] caBundle;

  public static final String SERIALIZED_NAME_SERVICE = "service";
  @SerializedName(SERIALIZED_NAME_SERVICE)
  private AdmissionregistrationV1ServiceReference service;

  public static final String SERIALIZED_NAME_URL = "url";
  @SerializedName(SERIALIZED_NAME_URL)
  private String url;

  public AdmissionregistrationV1WebhookClientConfig() {
  }

  public AdmissionregistrationV1WebhookClientConfig caBundle(byte[] caBundle) {

    this.caBundle = caBundle;
    return this;
  }

   /**
   * &#x60;caBundle&#x60; is a PEM encoded CA bundle which will be used to validate the webhook&#39;s server certificate. If unspecified, system trust roots on the apiserver are used.
   * @return caBundle
  **/
  @jakarta.annotation.Nullable
  public byte[] getCaBundle() {
    return caBundle;
  }


  public void setCaBundle(byte[] caBundle) {
    this.caBundle = caBundle;
  }


  public AdmissionregistrationV1WebhookClientConfig service(AdmissionregistrationV1ServiceReference service) {

    this.service = service;
    return this;
  }

   /**
   * Get service
   * @return service
  **/
  @jakarta.annotation.Nullable
  public AdmissionregistrationV1ServiceReference getService() {
    return service;
  }


  public void setService(AdmissionregistrationV1ServiceReference service) {
    this.service = service;
  }


  public AdmissionregistrationV1WebhookClientConfig url(String url) {

    this.url = url;
    return this;
  }

   /**
   * &#x60;url&#x60; gives the location of the webhook, in standard URL form (&#x60;scheme://host:port/path&#x60;). Exactly one of &#x60;url&#x60; or &#x60;service&#x60; must be specified.  The &#x60;host&#x60; should not refer to a service running in the cluster; use the &#x60;service&#x60; field instead. The host might be resolved via external DNS in some apiservers (e.g., &#x60;kube-apiserver&#x60; cannot resolve in-cluster DNS as that would be a layering violation). &#x60;host&#x60; may also be an IP address.  Please note that using &#x60;localhost&#x60; or &#x60;127.0.0.1&#x60; as a &#x60;host&#x60; is risky unless you take great care to run this webhook on all hosts which run an apiserver which might need to make calls to this webhook. Such installs are likely to be non-portable, i.e., not easy to turn up in a new cluster.  The scheme must be \&quot;https\&quot;; the URL must begin with \&quot;https://\&quot;.  A path is optional, and if present may be any string permissible in a URL. You may use the path to pass an arbitrary string to the webhook, for example, a cluster identifier.  Attempting to use a user or basic auth e.g. \&quot;user:password@\&quot; is not allowed. Fragments (\&quot;#...\&quot;) and query parameters (\&quot;?...\&quot;) are not allowed, either.
   * @return url
  **/
  @jakarta.annotation.Nullable
  public String getUrl() {
    return url;
  }


  public void setUrl(String url) {
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
    AdmissionregistrationV1WebhookClientConfig admissionregistrationV1WebhookClientConfig = (AdmissionregistrationV1WebhookClientConfig) o;
    return Arrays.equals(this.caBundle, admissionregistrationV1WebhookClientConfig.caBundle) &&
        Objects.equals(this.service, admissionregistrationV1WebhookClientConfig.service) &&
        Objects.equals(this.url, admissionregistrationV1WebhookClientConfig.url);
  }

  @Override
  public int hashCode() {
    return Objects.hash(Arrays.hashCode(caBundle), service, url);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdmissionregistrationV1WebhookClientConfig {\n");
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
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AdmissionregistrationV1WebhookClientConfig
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!AdmissionregistrationV1WebhookClientConfig.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in AdmissionregistrationV1WebhookClientConfig is not found in the empty JSON string", AdmissionregistrationV1WebhookClientConfig.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!AdmissionregistrationV1WebhookClientConfig.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AdmissionregistrationV1WebhookClientConfig` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      // validate the optional field `service`
      if (jsonObj.get("service") != null && !jsonObj.get("service").isJsonNull()) {
        AdmissionregistrationV1ServiceReference.validateJsonObject(jsonObj.getAsJsonObject("service"));
      }
      if ((jsonObj.get("url") != null && !jsonObj.get("url").isJsonNull()) && !jsonObj.get("url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("url").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AdmissionregistrationV1WebhookClientConfig.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AdmissionregistrationV1WebhookClientConfig' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AdmissionregistrationV1WebhookClientConfig> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AdmissionregistrationV1WebhookClientConfig.class));

       return (TypeAdapter<T>) new TypeAdapter<AdmissionregistrationV1WebhookClientConfig>() {
           @Override
           public void write(JsonWriter out, AdmissionregistrationV1WebhookClientConfig value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AdmissionregistrationV1WebhookClientConfig read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AdmissionregistrationV1WebhookClientConfig given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AdmissionregistrationV1WebhookClientConfig
  * @throws IOException if the JSON string is invalid with respect to AdmissionregistrationV1WebhookClientConfig
  */
  public static AdmissionregistrationV1WebhookClientConfig fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AdmissionregistrationV1WebhookClientConfig.class);
  }

 /**
  * Convert an instance of AdmissionregistrationV1WebhookClientConfig to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
