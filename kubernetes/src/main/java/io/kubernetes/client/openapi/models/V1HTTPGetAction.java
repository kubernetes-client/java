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
import io.kubernetes.client.custom.IntOrString;
import io.kubernetes.client.openapi.models.V1HTTPHeader;
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
 * HTTPGetAction describes an action based on HTTP Get requests.
 */
@ApiModel(description = "HTTPGetAction describes an action based on HTTP Get requests.")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-09-11T18:00:16.154662Z[Etc/UTC]", comments = "Generator version: 7.13.0")
public class V1HTTPGetAction {
  public static final String SERIALIZED_NAME_HOST = "host";
  @SerializedName(SERIALIZED_NAME_HOST)
  @jakarta.annotation.Nullable
  private String host;

  public static final String SERIALIZED_NAME_HTTP_HEADERS = "httpHeaders";
  @SerializedName(SERIALIZED_NAME_HTTP_HEADERS)
  @jakarta.annotation.Nullable
  private List<V1HTTPHeader> httpHeaders = new ArrayList<>();

  public static final String SERIALIZED_NAME_PATH = "path";
  @SerializedName(SERIALIZED_NAME_PATH)
  @jakarta.annotation.Nullable
  private String path;

  public static final String SERIALIZED_NAME_PORT = "port";
  @SerializedName(SERIALIZED_NAME_PORT)
  @jakarta.annotation.Nonnull
  private IntOrString port;

  public static final String SERIALIZED_NAME_SCHEME = "scheme";
  @SerializedName(SERIALIZED_NAME_SCHEME)
  @jakarta.annotation.Nullable
  private String scheme;

  public V1HTTPGetAction() {
  }

  public V1HTTPGetAction host(@jakarta.annotation.Nullable String host) {
    this.host = host;
    return this;
  }

  /**
   * Host name to connect to, defaults to the pod IP. You probably want to set \&quot;Host\&quot; in httpHeaders instead.
   * @return host
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "Host name to connect to, defaults to the pod IP. You probably want to set \"Host\" in httpHeaders instead.")
  public String getHost() {
    return host;
  }

  public void setHost(@jakarta.annotation.Nullable String host) {
    this.host = host;
  }


  public V1HTTPGetAction httpHeaders(@jakarta.annotation.Nullable List<V1HTTPHeader> httpHeaders) {
    this.httpHeaders = httpHeaders;
    return this;
  }

  public V1HTTPGetAction addHttpHeadersItem(V1HTTPHeader httpHeadersItem) {
    if (this.httpHeaders == null) {
      this.httpHeaders = new ArrayList<>();
    }
    this.httpHeaders.add(httpHeadersItem);
    return this;
  }

  /**
   * Custom headers to set in the request. HTTP allows repeated headers.
   * @return httpHeaders
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "Custom headers to set in the request. HTTP allows repeated headers.")
  public List<V1HTTPHeader> getHttpHeaders() {
    return httpHeaders;
  }

  public void setHttpHeaders(@jakarta.annotation.Nullable List<V1HTTPHeader> httpHeaders) {
    this.httpHeaders = httpHeaders;
  }


  public V1HTTPGetAction path(@jakarta.annotation.Nullable String path) {
    this.path = path;
    return this;
  }

  /**
   * Path to access on the HTTP server.
   * @return path
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "Path to access on the HTTP server.")
  public String getPath() {
    return path;
  }

  public void setPath(@jakarta.annotation.Nullable String path) {
    this.path = path;
  }


  public V1HTTPGetAction port(@jakarta.annotation.Nonnull IntOrString port) {
    this.port = port;
    return this;
  }

  /**
   * IntOrString is a type that can hold an int32 or a string.  When used in JSON or YAML marshalling and unmarshalling, it produces or consumes the inner type.  This allows you to have, for example, a JSON field that can accept a name or number.
   * @return port
   */
  @jakarta.annotation.Nonnull
  @ApiModelProperty(required = true, value = "IntOrString is a type that can hold an int32 or a string.  When used in JSON or YAML marshalling and unmarshalling, it produces or consumes the inner type.  This allows you to have, for example, a JSON field that can accept a name or number.")
  public IntOrString getPort() {
    return port;
  }

  public void setPort(@jakarta.annotation.Nonnull IntOrString port) {
    this.port = port;
  }


  public V1HTTPGetAction scheme(@jakarta.annotation.Nullable String scheme) {
    this.scheme = scheme;
    return this;
  }

  /**
   * Scheme to use for connecting to the host. Defaults to HTTP.
   * @return scheme
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "Scheme to use for connecting to the host. Defaults to HTTP.")
  public String getScheme() {
    return scheme;
  }

  public void setScheme(@jakarta.annotation.Nullable String scheme) {
    this.scheme = scheme;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1HTTPGetAction v1HTTPGetAction = (V1HTTPGetAction) o;
    return Objects.equals(this.host, v1HTTPGetAction.host) &&
        Objects.equals(this.httpHeaders, v1HTTPGetAction.httpHeaders) &&
        Objects.equals(this.path, v1HTTPGetAction.path) &&
        Objects.equals(this.port, v1HTTPGetAction.port) &&
        Objects.equals(this.scheme, v1HTTPGetAction.scheme);
  }

  @Override
  public int hashCode() {
    return Objects.hash(host, httpHeaders, path, port, scheme);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1HTTPGetAction {\n");
    sb.append("    host: ").append(toIndentedString(host)).append("\n");
    sb.append("    httpHeaders: ").append(toIndentedString(httpHeaders)).append("\n");
    sb.append("    path: ").append(toIndentedString(path)).append("\n");
    sb.append("    port: ").append(toIndentedString(port)).append("\n");
    sb.append("    scheme: ").append(toIndentedString(scheme)).append("\n");
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
    openapiFields.add("host");
    openapiFields.add("httpHeaders");
    openapiFields.add("path");
    openapiFields.add("port");
    openapiFields.add("scheme");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("port");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to V1HTTPGetAction
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!V1HTTPGetAction.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in V1HTTPGetAction is not found in the empty JSON string", V1HTTPGetAction.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!V1HTTPGetAction.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `V1HTTPGetAction` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : V1HTTPGetAction.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("host") != null && !jsonObj.get("host").isJsonNull()) && !jsonObj.get("host").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `host` to be a primitive type in the JSON string but got `%s`", jsonObj.get("host").toString()));
      }
      if (jsonObj.get("httpHeaders") != null && !jsonObj.get("httpHeaders").isJsonNull()) {
        JsonArray jsonArrayhttpHeaders = jsonObj.getAsJsonArray("httpHeaders");
        if (jsonArrayhttpHeaders != null) {
          // ensure the json data is an array
          if (!jsonObj.get("httpHeaders").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `httpHeaders` to be an array in the JSON string but got `%s`", jsonObj.get("httpHeaders").toString()));
          }

          // validate the optional field `httpHeaders` (array)
          for (int i = 0; i < jsonArrayhttpHeaders.size(); i++) {
            V1HTTPHeader.validateJsonElement(jsonArrayhttpHeaders.get(i));
          };
        }
      }
      if ((jsonObj.get("path") != null && !jsonObj.get("path").isJsonNull()) && !jsonObj.get("path").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `path` to be a primitive type in the JSON string but got `%s`", jsonObj.get("path").toString()));
      }
      if (!jsonObj.get("port").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `port` to be a primitive type in the JSON string but got `%s`", jsonObj.get("port").toString()));
      }
      if ((jsonObj.get("scheme") != null && !jsonObj.get("scheme").isJsonNull()) && !jsonObj.get("scheme").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `scheme` to be a primitive type in the JSON string but got `%s`", jsonObj.get("scheme").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!V1HTTPGetAction.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'V1HTTPGetAction' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<V1HTTPGetAction> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(V1HTTPGetAction.class));

       return (TypeAdapter<T>) new TypeAdapter<V1HTTPGetAction>() {
           @Override
           public void write(JsonWriter out, V1HTTPGetAction value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public V1HTTPGetAction read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of V1HTTPGetAction given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of V1HTTPGetAction
   * @throws IOException if the JSON string is invalid with respect to V1HTTPGetAction
   */
  public static V1HTTPGetAction fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, V1HTTPGetAction.class);
  }

  /**
   * Convert an instance of V1HTTPGetAction to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
