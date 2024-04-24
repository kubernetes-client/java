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
import io.kubernetes.client.openapi.models.V1BoundObjectReference;
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
 * TokenRequestSpec contains client provided parameters of a token request.
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-23T13:45:09.091597Z[Etc/UTC]")
public class V1TokenRequestSpec {
  public static final String SERIALIZED_NAME_AUDIENCES = "audiences";
  @SerializedName(SERIALIZED_NAME_AUDIENCES)
  private List<String> audiences = new ArrayList<>();

  public static final String SERIALIZED_NAME_BOUND_OBJECT_REF = "boundObjectRef";
  @SerializedName(SERIALIZED_NAME_BOUND_OBJECT_REF)
  private V1BoundObjectReference boundObjectRef;

  public static final String SERIALIZED_NAME_EXPIRATION_SECONDS = "expirationSeconds";
  @SerializedName(SERIALIZED_NAME_EXPIRATION_SECONDS)
  private Long expirationSeconds;

  public V1TokenRequestSpec() {
  }

  public V1TokenRequestSpec audiences(List<String> audiences) {

    this.audiences = audiences;
    return this;
  }

  public V1TokenRequestSpec addAudiencesItem(String audiencesItem) {
    if (this.audiences == null) {
      this.audiences = new ArrayList<>();
    }
    this.audiences.add(audiencesItem);
    return this;
  }

   /**
   * Audiences are the intendend audiences of the token. A recipient of a token must identify themself with an identifier in the list of audiences of the token, and otherwise should reject the token. A token issued for multiple audiences may be used to authenticate against any of the audiences listed but implies a high degree of trust between the target audiences.
   * @return audiences
  **/
  @jakarta.annotation.Nonnull
  public List<String> getAudiences() {
    return audiences;
  }


  public void setAudiences(List<String> audiences) {
    this.audiences = audiences;
  }


  public V1TokenRequestSpec boundObjectRef(V1BoundObjectReference boundObjectRef) {

    this.boundObjectRef = boundObjectRef;
    return this;
  }

   /**
   * Get boundObjectRef
   * @return boundObjectRef
  **/
  @jakarta.annotation.Nullable
  public V1BoundObjectReference getBoundObjectRef() {
    return boundObjectRef;
  }


  public void setBoundObjectRef(V1BoundObjectReference boundObjectRef) {
    this.boundObjectRef = boundObjectRef;
  }


  public V1TokenRequestSpec expirationSeconds(Long expirationSeconds) {

    this.expirationSeconds = expirationSeconds;
    return this;
  }

   /**
   * ExpirationSeconds is the requested duration of validity of the request. The token issuer may return a token with a different validity duration so a client needs to check the &#39;expiration&#39; field in a response.
   * @return expirationSeconds
  **/
  @jakarta.annotation.Nullable
  public Long getExpirationSeconds() {
    return expirationSeconds;
  }


  public void setExpirationSeconds(Long expirationSeconds) {
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
    V1TokenRequestSpec v1TokenRequestSpec = (V1TokenRequestSpec) o;
    return Objects.equals(this.audiences, v1TokenRequestSpec.audiences) &&
        Objects.equals(this.boundObjectRef, v1TokenRequestSpec.boundObjectRef) &&
        Objects.equals(this.expirationSeconds, v1TokenRequestSpec.expirationSeconds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(audiences, boundObjectRef, expirationSeconds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1TokenRequestSpec {\n");
    sb.append("    audiences: ").append(toIndentedString(audiences)).append("\n");
    sb.append("    boundObjectRef: ").append(toIndentedString(boundObjectRef)).append("\n");
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
    openapiFields.add("audiences");
    openapiFields.add("boundObjectRef");
    openapiFields.add("expirationSeconds");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("audiences");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to V1TokenRequestSpec
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!V1TokenRequestSpec.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in V1TokenRequestSpec is not found in the empty JSON string", V1TokenRequestSpec.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!V1TokenRequestSpec.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `V1TokenRequestSpec` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : V1TokenRequestSpec.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      // ensure the required json array is present
      if (jsonObj.get("audiences") == null) {
        throw new IllegalArgumentException("Expected the field `linkedContent` to be an array in the JSON string but got `null`");
      } else if (!jsonObj.get("audiences").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `audiences` to be an array in the JSON string but got `%s`", jsonObj.get("audiences").toString()));
      }
      // validate the optional field `boundObjectRef`
      if (jsonObj.get("boundObjectRef") != null && !jsonObj.get("boundObjectRef").isJsonNull()) {
        V1BoundObjectReference.validateJsonObject(jsonObj.getAsJsonObject("boundObjectRef"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!V1TokenRequestSpec.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'V1TokenRequestSpec' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<V1TokenRequestSpec> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(V1TokenRequestSpec.class));

       return (TypeAdapter<T>) new TypeAdapter<V1TokenRequestSpec>() {
           @Override
           public void write(JsonWriter out, V1TokenRequestSpec value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public V1TokenRequestSpec read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of V1TokenRequestSpec given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of V1TokenRequestSpec
  * @throws IOException if the JSON string is invalid with respect to V1TokenRequestSpec
  */
  public static V1TokenRequestSpec fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, V1TokenRequestSpec.class);
  }

 /**
  * Convert an instance of V1TokenRequestSpec to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
