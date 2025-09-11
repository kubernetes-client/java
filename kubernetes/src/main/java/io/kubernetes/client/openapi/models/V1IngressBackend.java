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
import io.kubernetes.client.openapi.models.V1IngressServiceBackend;
import io.kubernetes.client.openapi.models.V1TypedLocalObjectReference;
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
 * IngressBackend describes all endpoints for a given service and port.
 */
@ApiModel(description = "IngressBackend describes all endpoints for a given service and port.")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-09-11T18:00:16.154662Z[Etc/UTC]", comments = "Generator version: 7.13.0")
public class V1IngressBackend {
  public static final String SERIALIZED_NAME_RESOURCE = "resource";
  @SerializedName(SERIALIZED_NAME_RESOURCE)
  @jakarta.annotation.Nullable
  private V1TypedLocalObjectReference resource;

  public static final String SERIALIZED_NAME_SERVICE = "service";
  @SerializedName(SERIALIZED_NAME_SERVICE)
  @jakarta.annotation.Nullable
  private V1IngressServiceBackend service;

  public V1IngressBackend() {
  }

  public V1IngressBackend resource(@jakarta.annotation.Nullable V1TypedLocalObjectReference resource) {
    this.resource = resource;
    return this;
  }

  /**
   * Get resource
   * @return resource
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  public V1TypedLocalObjectReference getResource() {
    return resource;
  }

  public void setResource(@jakarta.annotation.Nullable V1TypedLocalObjectReference resource) {
    this.resource = resource;
  }


  public V1IngressBackend service(@jakarta.annotation.Nullable V1IngressServiceBackend service) {
    this.service = service;
    return this;
  }

  /**
   * Get service
   * @return service
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  public V1IngressServiceBackend getService() {
    return service;
  }

  public void setService(@jakarta.annotation.Nullable V1IngressServiceBackend service) {
    this.service = service;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1IngressBackend v1IngressBackend = (V1IngressBackend) o;
    return Objects.equals(this.resource, v1IngressBackend.resource) &&
        Objects.equals(this.service, v1IngressBackend.service);
  }

  @Override
  public int hashCode() {
    return Objects.hash(resource, service);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1IngressBackend {\n");
    sb.append("    resource: ").append(toIndentedString(resource)).append("\n");
    sb.append("    service: ").append(toIndentedString(service)).append("\n");
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
    openapiFields.add("resource");
    openapiFields.add("service");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to V1IngressBackend
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!V1IngressBackend.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in V1IngressBackend is not found in the empty JSON string", V1IngressBackend.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!V1IngressBackend.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `V1IngressBackend` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `resource`
      if (jsonObj.get("resource") != null && !jsonObj.get("resource").isJsonNull()) {
        V1TypedLocalObjectReference.validateJsonElement(jsonObj.get("resource"));
      }
      // validate the optional field `service`
      if (jsonObj.get("service") != null && !jsonObj.get("service").isJsonNull()) {
        V1IngressServiceBackend.validateJsonElement(jsonObj.get("service"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!V1IngressBackend.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'V1IngressBackend' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<V1IngressBackend> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(V1IngressBackend.class));

       return (TypeAdapter<T>) new TypeAdapter<V1IngressBackend>() {
           @Override
           public void write(JsonWriter out, V1IngressBackend value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public V1IngressBackend read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of V1IngressBackend given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of V1IngressBackend
   * @throws IOException if the JSON string is invalid with respect to V1IngressBackend
   */
  public static V1IngressBackend fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, V1IngressBackend.class);
  }

  /**
   * Convert an instance of V1IngressBackend to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
