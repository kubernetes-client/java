/*
Copyright 2026 The Kubernetes Authors.
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
 * ServiceReference holds a reference to Service.legacy.k8s.io
 */
@ApiModel(description = "ServiceReference holds a reference to Service.legacy.k8s.io")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2026-01-21T21:30:13.305152Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class AdmissionregistrationV1ServiceReference {
  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  @jakarta.annotation.Nonnull
  private String name;

  public static final String SERIALIZED_NAME_NAMESPACE = "namespace";
  @SerializedName(SERIALIZED_NAME_NAMESPACE)
  @jakarta.annotation.Nonnull
  private String namespace;

  public static final String SERIALIZED_NAME_PATH = "path";
  @SerializedName(SERIALIZED_NAME_PATH)
  @jakarta.annotation.Nullable
  private String path;

  public static final String SERIALIZED_NAME_PORT = "port";
  @SerializedName(SERIALIZED_NAME_PORT)
  @jakarta.annotation.Nullable
  private Integer port;

  public AdmissionregistrationV1ServiceReference() {
  }

  public AdmissionregistrationV1ServiceReference name(@jakarta.annotation.Nonnull String name) {
    this.name = name;
    return this;
  }

  /**
   * &#x60;name&#x60; is the name of the service. Required
   * @return name
   */
  @jakarta.annotation.Nonnull
  @ApiModelProperty(required = true, value = "`name` is the name of the service. Required")
  public String getName() {
    return name;
  }

  public void setName(@jakarta.annotation.Nonnull String name) {
    this.name = name;
  }


  public AdmissionregistrationV1ServiceReference namespace(@jakarta.annotation.Nonnull String namespace) {
    this.namespace = namespace;
    return this;
  }

  /**
   * &#x60;namespace&#x60; is the namespace of the service. Required
   * @return namespace
   */
  @jakarta.annotation.Nonnull
  @ApiModelProperty(required = true, value = "`namespace` is the namespace of the service. Required")
  public String getNamespace() {
    return namespace;
  }

  public void setNamespace(@jakarta.annotation.Nonnull String namespace) {
    this.namespace = namespace;
  }


  public AdmissionregistrationV1ServiceReference path(@jakarta.annotation.Nullable String path) {
    this.path = path;
    return this;
  }

  /**
   * &#x60;path&#x60; is an optional URL path which will be sent in any request to this service.
   * @return path
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "`path` is an optional URL path which will be sent in any request to this service.")
  public String getPath() {
    return path;
  }

  public void setPath(@jakarta.annotation.Nullable String path) {
    this.path = path;
  }


  public AdmissionregistrationV1ServiceReference port(@jakarta.annotation.Nullable Integer port) {
    this.port = port;
    return this;
  }

  /**
   * If specified, the port on the service that hosting webhook. Default to 443 for backward compatibility. &#x60;port&#x60; should be a valid port number (1-65535, inclusive).
   * @return port
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "If specified, the port on the service that hosting webhook. Default to 443 for backward compatibility. `port` should be a valid port number (1-65535, inclusive).")
  public Integer getPort() {
    return port;
  }

  public void setPort(@jakarta.annotation.Nullable Integer port) {
    this.port = port;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AdmissionregistrationV1ServiceReference admissionregistrationV1ServiceReference = (AdmissionregistrationV1ServiceReference) o;
    return Objects.equals(this.name, admissionregistrationV1ServiceReference.name) &&
        Objects.equals(this.namespace, admissionregistrationV1ServiceReference.namespace) &&
        Objects.equals(this.path, admissionregistrationV1ServiceReference.path) &&
        Objects.equals(this.port, admissionregistrationV1ServiceReference.port);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, namespace, path, port);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdmissionregistrationV1ServiceReference {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    namespace: ").append(toIndentedString(namespace)).append("\n");
    sb.append("    path: ").append(toIndentedString(path)).append("\n");
    sb.append("    port: ").append(toIndentedString(port)).append("\n");
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
    openapiFields = new HashSet<String>(Arrays.asList("name", "namespace", "path", "port"));

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>(Arrays.asList("name", "namespace"));
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to AdmissionregistrationV1ServiceReference
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!AdmissionregistrationV1ServiceReference.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format(java.util.Locale.ROOT, "The required field(s) %s in AdmissionregistrationV1ServiceReference is not found in the empty JSON string", AdmissionregistrationV1ServiceReference.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!AdmissionregistrationV1ServiceReference.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format(java.util.Locale.ROOT, "The field `%s` in the JSON string is not defined in the `AdmissionregistrationV1ServiceReference` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : AdmissionregistrationV1ServiceReference.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format(java.util.Locale.ROOT, "The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format(java.util.Locale.ROOT, "Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if (!jsonObj.get("namespace").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format(java.util.Locale.ROOT, "Expected the field `namespace` to be a primitive type in the JSON string but got `%s`", jsonObj.get("namespace").toString()));
      }
      if ((jsonObj.get("path") != null && !jsonObj.get("path").isJsonNull()) && !jsonObj.get("path").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format(java.util.Locale.ROOT, "Expected the field `path` to be a primitive type in the JSON string but got `%s`", jsonObj.get("path").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AdmissionregistrationV1ServiceReference.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AdmissionregistrationV1ServiceReference' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AdmissionregistrationV1ServiceReference> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AdmissionregistrationV1ServiceReference.class));

       return (TypeAdapter<T>) new TypeAdapter<AdmissionregistrationV1ServiceReference>() {
           @Override
           public void write(JsonWriter out, AdmissionregistrationV1ServiceReference value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AdmissionregistrationV1ServiceReference read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of AdmissionregistrationV1ServiceReference given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of AdmissionregistrationV1ServiceReference
   * @throws IOException if the JSON string is invalid with respect to AdmissionregistrationV1ServiceReference
   */
  public static AdmissionregistrationV1ServiceReference fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AdmissionregistrationV1ServiceReference.class);
  }

  /**
   * Convert an instance of AdmissionregistrationV1ServiceReference to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
