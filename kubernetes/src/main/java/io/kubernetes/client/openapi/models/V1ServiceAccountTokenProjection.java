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
 * ServiceAccountTokenProjection represents a projected service account token volume. This projection can be used to insert a service account token into the pods runtime filesystem for use against APIs (Kubernetes API Server or otherwise).
 */
@ApiModel(description = "ServiceAccountTokenProjection represents a projected service account token volume. This projection can be used to insert a service account token into the pods runtime filesystem for use against APIs (Kubernetes API Server or otherwise).")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-09-11T18:00:16.154662Z[Etc/UTC]", comments = "Generator version: 7.13.0")
public class V1ServiceAccountTokenProjection {
  public static final String SERIALIZED_NAME_AUDIENCE = "audience";
  @SerializedName(SERIALIZED_NAME_AUDIENCE)
  @jakarta.annotation.Nullable
  private String audience;

  public static final String SERIALIZED_NAME_EXPIRATION_SECONDS = "expirationSeconds";
  @SerializedName(SERIALIZED_NAME_EXPIRATION_SECONDS)
  @jakarta.annotation.Nullable
  private Long expirationSeconds;

  public static final String SERIALIZED_NAME_PATH = "path";
  @SerializedName(SERIALIZED_NAME_PATH)
  @jakarta.annotation.Nonnull
  private String path;

  public V1ServiceAccountTokenProjection() {
  }

  public V1ServiceAccountTokenProjection audience(@jakarta.annotation.Nullable String audience) {
    this.audience = audience;
    return this;
  }

  /**
   * audience is the intended audience of the token. A recipient of a token must identify itself with an identifier specified in the audience of the token, and otherwise should reject the token. The audience defaults to the identifier of the apiserver.
   * @return audience
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "audience is the intended audience of the token. A recipient of a token must identify itself with an identifier specified in the audience of the token, and otherwise should reject the token. The audience defaults to the identifier of the apiserver.")
  public String getAudience() {
    return audience;
  }

  public void setAudience(@jakarta.annotation.Nullable String audience) {
    this.audience = audience;
  }


  public V1ServiceAccountTokenProjection expirationSeconds(@jakarta.annotation.Nullable Long expirationSeconds) {
    this.expirationSeconds = expirationSeconds;
    return this;
  }

  /**
   * expirationSeconds is the requested duration of validity of the service account token. As the token approaches expiration, the kubelet volume plugin will proactively rotate the service account token. The kubelet will start trying to rotate the token if the token is older than 80 percent of its time to live or if the token is older than 24 hours.Defaults to 1 hour and must be at least 10 minutes.
   * @return expirationSeconds
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "expirationSeconds is the requested duration of validity of the service account token. As the token approaches expiration, the kubelet volume plugin will proactively rotate the service account token. The kubelet will start trying to rotate the token if the token is older than 80 percent of its time to live or if the token is older than 24 hours.Defaults to 1 hour and must be at least 10 minutes.")
  public Long getExpirationSeconds() {
    return expirationSeconds;
  }

  public void setExpirationSeconds(@jakarta.annotation.Nullable Long expirationSeconds) {
    this.expirationSeconds = expirationSeconds;
  }


  public V1ServiceAccountTokenProjection path(@jakarta.annotation.Nonnull String path) {
    this.path = path;
    return this;
  }

  /**
   * path is the path relative to the mount point of the file to project the token into.
   * @return path
   */
  @jakarta.annotation.Nonnull
  @ApiModelProperty(required = true, value = "path is the path relative to the mount point of the file to project the token into.")
  public String getPath() {
    return path;
  }

  public void setPath(@jakarta.annotation.Nonnull String path) {
    this.path = path;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1ServiceAccountTokenProjection v1ServiceAccountTokenProjection = (V1ServiceAccountTokenProjection) o;
    return Objects.equals(this.audience, v1ServiceAccountTokenProjection.audience) &&
        Objects.equals(this.expirationSeconds, v1ServiceAccountTokenProjection.expirationSeconds) &&
        Objects.equals(this.path, v1ServiceAccountTokenProjection.path);
  }

  @Override
  public int hashCode() {
    return Objects.hash(audience, expirationSeconds, path);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1ServiceAccountTokenProjection {\n");
    sb.append("    audience: ").append(toIndentedString(audience)).append("\n");
    sb.append("    expirationSeconds: ").append(toIndentedString(expirationSeconds)).append("\n");
    sb.append("    path: ").append(toIndentedString(path)).append("\n");
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
    openapiFields.add("path");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("path");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to V1ServiceAccountTokenProjection
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!V1ServiceAccountTokenProjection.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in V1ServiceAccountTokenProjection is not found in the empty JSON string", V1ServiceAccountTokenProjection.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!V1ServiceAccountTokenProjection.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `V1ServiceAccountTokenProjection` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : V1ServiceAccountTokenProjection.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("audience") != null && !jsonObj.get("audience").isJsonNull()) && !jsonObj.get("audience").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `audience` to be a primitive type in the JSON string but got `%s`", jsonObj.get("audience").toString()));
      }
      if (!jsonObj.get("path").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `path` to be a primitive type in the JSON string but got `%s`", jsonObj.get("path").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!V1ServiceAccountTokenProjection.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'V1ServiceAccountTokenProjection' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<V1ServiceAccountTokenProjection> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(V1ServiceAccountTokenProjection.class));

       return (TypeAdapter<T>) new TypeAdapter<V1ServiceAccountTokenProjection>() {
           @Override
           public void write(JsonWriter out, V1ServiceAccountTokenProjection value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public V1ServiceAccountTokenProjection read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of V1ServiceAccountTokenProjection given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of V1ServiceAccountTokenProjection
   * @throws IOException if the JSON string is invalid with respect to V1ServiceAccountTokenProjection
   */
  public static V1ServiceAccountTokenProjection fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, V1ServiceAccountTokenProjection.class);
  }

  /**
   * Convert an instance of V1ServiceAccountTokenProjection to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
