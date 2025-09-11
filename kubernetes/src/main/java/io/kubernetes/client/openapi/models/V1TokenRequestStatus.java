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
import java.time.OffsetDateTime;
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
 * TokenRequestStatus is the result of a token request.
 */
@ApiModel(description = "TokenRequestStatus is the result of a token request.")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-09-11T18:00:16.154662Z[Etc/UTC]", comments = "Generator version: 7.13.0")
public class V1TokenRequestStatus {
  public static final String SERIALIZED_NAME_EXPIRATION_TIMESTAMP = "expirationTimestamp";
  @SerializedName(SERIALIZED_NAME_EXPIRATION_TIMESTAMP)
  @jakarta.annotation.Nonnull
  private OffsetDateTime expirationTimestamp;

  public static final String SERIALIZED_NAME_TOKEN = "token";
  @SerializedName(SERIALIZED_NAME_TOKEN)
  @jakarta.annotation.Nonnull
  private String token;

  public V1TokenRequestStatus() {
  }

  public V1TokenRequestStatus expirationTimestamp(@jakarta.annotation.Nonnull OffsetDateTime expirationTimestamp) {
    this.expirationTimestamp = expirationTimestamp;
    return this;
  }

  /**
   * ExpirationTimestamp is the time of expiration of the returned token.
   * @return expirationTimestamp
   */
  @jakarta.annotation.Nonnull
  @ApiModelProperty(required = true, value = "ExpirationTimestamp is the time of expiration of the returned token.")
  public OffsetDateTime getExpirationTimestamp() {
    return expirationTimestamp;
  }

  public void setExpirationTimestamp(@jakarta.annotation.Nonnull OffsetDateTime expirationTimestamp) {
    this.expirationTimestamp = expirationTimestamp;
  }


  public V1TokenRequestStatus token(@jakarta.annotation.Nonnull String token) {
    this.token = token;
    return this;
  }

  /**
   * Token is the opaque bearer token.
   * @return token
   */
  @jakarta.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Token is the opaque bearer token.")
  public String getToken() {
    return token;
  }

  public void setToken(@jakarta.annotation.Nonnull String token) {
    this.token = token;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1TokenRequestStatus v1TokenRequestStatus = (V1TokenRequestStatus) o;
    return Objects.equals(this.expirationTimestamp, v1TokenRequestStatus.expirationTimestamp) &&
        Objects.equals(this.token, v1TokenRequestStatus.token);
  }

  @Override
  public int hashCode() {
    return Objects.hash(expirationTimestamp, token);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1TokenRequestStatus {\n");
    sb.append("    expirationTimestamp: ").append(toIndentedString(expirationTimestamp)).append("\n");
    sb.append("    token: ").append(toIndentedString(token)).append("\n");
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
    openapiFields.add("expirationTimestamp");
    openapiFields.add("token");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("expirationTimestamp");
    openapiRequiredFields.add("token");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to V1TokenRequestStatus
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!V1TokenRequestStatus.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in V1TokenRequestStatus is not found in the empty JSON string", V1TokenRequestStatus.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!V1TokenRequestStatus.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `V1TokenRequestStatus` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : V1TokenRequestStatus.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("token").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `token` to be a primitive type in the JSON string but got `%s`", jsonObj.get("token").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!V1TokenRequestStatus.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'V1TokenRequestStatus' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<V1TokenRequestStatus> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(V1TokenRequestStatus.class));

       return (TypeAdapter<T>) new TypeAdapter<V1TokenRequestStatus>() {
           @Override
           public void write(JsonWriter out, V1TokenRequestStatus value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public V1TokenRequestStatus read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of V1TokenRequestStatus given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of V1TokenRequestStatus
   * @throws IOException if the JSON string is invalid with respect to V1TokenRequestStatus
   */
  public static V1TokenRequestStatus fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, V1TokenRequestStatus.class);
  }

  /**
   * Convert an instance of V1TokenRequestStatus to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
