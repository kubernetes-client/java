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
 * ResourceClaim references one entry in PodSpec.ResourceClaims.
 */
@ApiModel(description = "ResourceClaim references one entry in PodSpec.ResourceClaims.")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2026-01-21T21:30:13.305152Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class CoreV1ResourceClaim {
  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  @jakarta.annotation.Nonnull
  private String name;

  public static final String SERIALIZED_NAME_REQUEST = "request";
  @SerializedName(SERIALIZED_NAME_REQUEST)
  @jakarta.annotation.Nullable
  private String request;

  public CoreV1ResourceClaim() {
  }

  public CoreV1ResourceClaim name(@jakarta.annotation.Nonnull String name) {
    this.name = name;
    return this;
  }

  /**
   * Name must match the name of one entry in pod.spec.resourceClaims of the Pod where this field is used. It makes that resource available inside a container.
   * @return name
   */
  @jakarta.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Name must match the name of one entry in pod.spec.resourceClaims of the Pod where this field is used. It makes that resource available inside a container.")
  public String getName() {
    return name;
  }

  public void setName(@jakarta.annotation.Nonnull String name) {
    this.name = name;
  }


  public CoreV1ResourceClaim request(@jakarta.annotation.Nullable String request) {
    this.request = request;
    return this;
  }

  /**
   * Request is the name chosen for a request in the referenced claim. If empty, everything from the claim is made available, otherwise only the result of this request.
   * @return request
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "Request is the name chosen for a request in the referenced claim. If empty, everything from the claim is made available, otherwise only the result of this request.")
  public String getRequest() {
    return request;
  }

  public void setRequest(@jakarta.annotation.Nullable String request) {
    this.request = request;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CoreV1ResourceClaim coreV1ResourceClaim = (CoreV1ResourceClaim) o;
    return Objects.equals(this.name, coreV1ResourceClaim.name) &&
        Objects.equals(this.request, coreV1ResourceClaim.request);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, request);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CoreV1ResourceClaim {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    request: ").append(toIndentedString(request)).append("\n");
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
    openapiFields = new HashSet<String>(Arrays.asList("name", "request"));

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>(Arrays.asList("name"));
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to CoreV1ResourceClaim
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CoreV1ResourceClaim.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format(java.util.Locale.ROOT, "The required field(s) %s in CoreV1ResourceClaim is not found in the empty JSON string", CoreV1ResourceClaim.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!CoreV1ResourceClaim.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format(java.util.Locale.ROOT, "The field `%s` in the JSON string is not defined in the `CoreV1ResourceClaim` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : CoreV1ResourceClaim.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format(java.util.Locale.ROOT, "The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format(java.util.Locale.ROOT, "Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if ((jsonObj.get("request") != null && !jsonObj.get("request").isJsonNull()) && !jsonObj.get("request").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format(java.util.Locale.ROOT, "Expected the field `request` to be a primitive type in the JSON string but got `%s`", jsonObj.get("request").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CoreV1ResourceClaim.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CoreV1ResourceClaim' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CoreV1ResourceClaim> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CoreV1ResourceClaim.class));

       return (TypeAdapter<T>) new TypeAdapter<CoreV1ResourceClaim>() {
           @Override
           public void write(JsonWriter out, CoreV1ResourceClaim value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CoreV1ResourceClaim read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of CoreV1ResourceClaim given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of CoreV1ResourceClaim
   * @throws IOException if the JSON string is invalid with respect to CoreV1ResourceClaim
   */
  public static CoreV1ResourceClaim fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CoreV1ResourceClaim.class);
  }

  /**
   * Convert an instance of CoreV1ResourceClaim to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
