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
import java.util.ArrayList;
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

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import io.kubernetes.client.openapi.JSON;

/**
 * TokenReviewSpec is a description of the token authentication request.
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-23T13:45:09.091597Z[Etc/UTC]")
public class V1TokenReviewSpec {
  public static final String SERIALIZED_NAME_AUDIENCES = "audiences";
  @SerializedName(SERIALIZED_NAME_AUDIENCES)
  private List<String> audiences;

  public static final String SERIALIZED_NAME_TOKEN = "token";
  @SerializedName(SERIALIZED_NAME_TOKEN)
  private String token;

  public V1TokenReviewSpec() {
  }

  public V1TokenReviewSpec audiences(List<String> audiences) {

    this.audiences = audiences;
    return this;
  }

  public V1TokenReviewSpec addAudiencesItem(String audiencesItem) {
    if (this.audiences == null) {
      this.audiences = new ArrayList<>();
    }
    this.audiences.add(audiencesItem);
    return this;
  }

   /**
   * Audiences is a list of the identifiers that the resource server presented with the token identifies as. Audience-aware token authenticators will verify that the token was intended for at least one of the audiences in this list. If no audiences are provided, the audience will default to the audience of the Kubernetes apiserver.
   * @return audiences
  **/
  @jakarta.annotation.Nullable
  public List<String> getAudiences() {
    return audiences;
  }


  public void setAudiences(List<String> audiences) {
    this.audiences = audiences;
  }


  public V1TokenReviewSpec token(String token) {

    this.token = token;
    return this;
  }

   /**
   * Token is the opaque bearer token.
   * @return token
  **/
  @jakarta.annotation.Nullable
  public String getToken() {
    return token;
  }


  public void setToken(String token) {
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
    V1TokenReviewSpec v1TokenReviewSpec = (V1TokenReviewSpec) o;
    return Objects.equals(this.audiences, v1TokenReviewSpec.audiences) &&
        Objects.equals(this.token, v1TokenReviewSpec.token);
  }

  @Override
  public int hashCode() {
    return Objects.hash(audiences, token);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1TokenReviewSpec {\n");
    sb.append("    audiences: ").append(toIndentedString(audiences)).append("\n");
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
    openapiFields.add("audiences");
    openapiFields.add("token");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to V1TokenReviewSpec
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!V1TokenReviewSpec.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in V1TokenReviewSpec is not found in the empty JSON string", V1TokenReviewSpec.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!V1TokenReviewSpec.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `V1TokenReviewSpec` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("audiences") != null && !jsonObj.get("audiences").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `audiences` to be an array in the JSON string but got `%s`", jsonObj.get("audiences").toString()));
      }
      if ((jsonObj.get("token") != null && !jsonObj.get("token").isJsonNull()) && !jsonObj.get("token").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `token` to be a primitive type in the JSON string but got `%s`", jsonObj.get("token").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!V1TokenReviewSpec.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'V1TokenReviewSpec' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<V1TokenReviewSpec> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(V1TokenReviewSpec.class));

       return (TypeAdapter<T>) new TypeAdapter<V1TokenReviewSpec>() {
           @Override
           public void write(JsonWriter out, V1TokenReviewSpec value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public V1TokenReviewSpec read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of V1TokenReviewSpec given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of V1TokenReviewSpec
  * @throws IOException if the JSON string is invalid with respect to V1TokenReviewSpec
  */
  public static V1TokenReviewSpec fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, V1TokenReviewSpec.class);
  }

 /**
  * Convert an instance of V1TokenReviewSpec to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
