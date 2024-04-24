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
 * ServiceAccountTokenProjection represents a projected service account token volume. This projection can be used to insert a service account token into the pods runtime filesystem for use against APIs (Kubernetes API Server or otherwise).
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-23T13:45:09.091597Z[Etc/UTC]")
public class V1ServiceAccountTokenProjection {
  public static final String SERIALIZED_NAME_AUDIENCE = "audience";
  @SerializedName(SERIALIZED_NAME_AUDIENCE)
  private String audience;

  public static final String SERIALIZED_NAME_EXPIRATION_SECONDS = "expirationSeconds";
  @SerializedName(SERIALIZED_NAME_EXPIRATION_SECONDS)
  private Long expirationSeconds;

  public static final String SERIALIZED_NAME_PATH = "path";
  @SerializedName(SERIALIZED_NAME_PATH)
  private String path;

  public V1ServiceAccountTokenProjection() {
  }

  public V1ServiceAccountTokenProjection audience(String audience) {

    this.audience = audience;
    return this;
  }

   /**
   * audience is the intended audience of the token. A recipient of a token must identify itself with an identifier specified in the audience of the token, and otherwise should reject the token. The audience defaults to the identifier of the apiserver.
   * @return audience
  **/
  @jakarta.annotation.Nullable
  public String getAudience() {
    return audience;
  }


  public void setAudience(String audience) {
    this.audience = audience;
  }


  public V1ServiceAccountTokenProjection expirationSeconds(Long expirationSeconds) {

    this.expirationSeconds = expirationSeconds;
    return this;
  }

   /**
   * expirationSeconds is the requested duration of validity of the service account token. As the token approaches expiration, the kubelet volume plugin will proactively rotate the service account token. The kubelet will start trying to rotate the token if the token is older than 80 percent of its time to live or if the token is older than 24 hours.Defaults to 1 hour and must be at least 10 minutes.
   * @return expirationSeconds
  **/
  @jakarta.annotation.Nullable
  public Long getExpirationSeconds() {
    return expirationSeconds;
  }


  public void setExpirationSeconds(Long expirationSeconds) {
    this.expirationSeconds = expirationSeconds;
  }


  public V1ServiceAccountTokenProjection path(String path) {

    this.path = path;
    return this;
  }

   /**
   * path is the path relative to the mount point of the file to project the token into.
   * @return path
  **/
  @jakarta.annotation.Nonnull
  public String getPath() {
    return path;
  }


  public void setPath(String path) {
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
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to V1ServiceAccountTokenProjection
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!V1ServiceAccountTokenProjection.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in V1ServiceAccountTokenProjection is not found in the empty JSON string", V1ServiceAccountTokenProjection.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!V1ServiceAccountTokenProjection.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `V1ServiceAccountTokenProjection` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : V1ServiceAccountTokenProjection.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
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
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
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
