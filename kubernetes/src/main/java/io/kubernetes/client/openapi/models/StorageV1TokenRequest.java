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
 * TokenRequest contains parameters of a service account token.
 */
@ApiModel(description = "TokenRequest contains parameters of a service account token.")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-09-11T18:00:16.154662Z[Etc/UTC]", comments = "Generator version: 7.13.0")
public class StorageV1TokenRequest {
  public static final String SERIALIZED_NAME_AUDIENCE = "audience";
  @SerializedName(SERIALIZED_NAME_AUDIENCE)
  @jakarta.annotation.Nonnull
  private String audience;

  public static final String SERIALIZED_NAME_EXPIRATION_SECONDS = "expirationSeconds";
  @SerializedName(SERIALIZED_NAME_EXPIRATION_SECONDS)
  @jakarta.annotation.Nullable
  private Long expirationSeconds;

  public StorageV1TokenRequest() {
  }

  public StorageV1TokenRequest audience(@jakarta.annotation.Nonnull String audience) {
    this.audience = audience;
    return this;
  }

  /**
   * audience is the intended audience of the token in \&quot;TokenRequestSpec\&quot;. It will default to the audiences of kube apiserver.
   * @return audience
   */
  @jakarta.annotation.Nonnull
  @ApiModelProperty(required = true, value = "audience is the intended audience of the token in \"TokenRequestSpec\". It will default to the audiences of kube apiserver.")
  public String getAudience() {
    return audience;
  }

  public void setAudience(@jakarta.annotation.Nonnull String audience) {
    this.audience = audience;
  }


  public StorageV1TokenRequest expirationSeconds(@jakarta.annotation.Nullable Long expirationSeconds) {
    this.expirationSeconds = expirationSeconds;
    return this;
  }

  /**
   * expirationSeconds is the duration of validity of the token in \&quot;TokenRequestSpec\&quot;. It has the same default value of \&quot;ExpirationSeconds\&quot; in \&quot;TokenRequestSpec\&quot;.
   * @return expirationSeconds
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "expirationSeconds is the duration of validity of the token in \"TokenRequestSpec\". It has the same default value of \"ExpirationSeconds\" in \"TokenRequestSpec\".")
  public Long getExpirationSeconds() {
    return expirationSeconds;
  }

  public void setExpirationSeconds(@jakarta.annotation.Nullable Long expirationSeconds) {
    this.expirationSeconds = expirationSeconds;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StorageV1TokenRequest storageV1TokenRequest = (StorageV1TokenRequest) o;
    return Objects.equals(this.audience, storageV1TokenRequest.audience) &&
        Objects.equals(this.expirationSeconds, storageV1TokenRequest.expirationSeconds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(audience, expirationSeconds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StorageV1TokenRequest {\n");
    sb.append("    audience: ").append(toIndentedString(audience)).append("\n");
    sb.append("    expirationSeconds: ").append(toIndentedString(expirationSeconds)).append("\n");
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
    openapiFields.add("audience");
    openapiFields.add("expirationSeconds");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("audience");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to StorageV1TokenRequest
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!StorageV1TokenRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in StorageV1TokenRequest is not found in the empty JSON string", StorageV1TokenRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!StorageV1TokenRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `StorageV1TokenRequest` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : StorageV1TokenRequest.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("audience").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `audience` to be a primitive type in the JSON string but got `%s`", jsonObj.get("audience").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!StorageV1TokenRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'StorageV1TokenRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<StorageV1TokenRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(StorageV1TokenRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<StorageV1TokenRequest>() {
           @Override
           public void write(JsonWriter out, StorageV1TokenRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public StorageV1TokenRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of StorageV1TokenRequest given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of StorageV1TokenRequest
   * @throws IOException if the JSON string is invalid with respect to StorageV1TokenRequest
   */
  public static StorageV1TokenRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, StorageV1TokenRequest.class);
  }

  /**
   * Convert an instance of StorageV1TokenRequest to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
