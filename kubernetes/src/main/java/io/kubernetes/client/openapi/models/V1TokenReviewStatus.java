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
import io.kubernetes.client.openapi.models.V1UserInfo;
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
 * TokenReviewStatus is the result of the token authentication request.
 */
@ApiModel(description = "TokenReviewStatus is the result of the token authentication request.")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-09-11T18:00:16.154662Z[Etc/UTC]", comments = "Generator version: 7.13.0")
public class V1TokenReviewStatus {
  public static final String SERIALIZED_NAME_AUDIENCES = "audiences";
  @SerializedName(SERIALIZED_NAME_AUDIENCES)
  @jakarta.annotation.Nullable
  private List<String> audiences = new ArrayList<>();

  public static final String SERIALIZED_NAME_AUTHENTICATED = "authenticated";
  @SerializedName(SERIALIZED_NAME_AUTHENTICATED)
  @jakarta.annotation.Nullable
  private Boolean authenticated;

  public static final String SERIALIZED_NAME_ERROR = "error";
  @SerializedName(SERIALIZED_NAME_ERROR)
  @jakarta.annotation.Nullable
  private String error;

  public static final String SERIALIZED_NAME_USER = "user";
  @SerializedName(SERIALIZED_NAME_USER)
  @jakarta.annotation.Nullable
  private V1UserInfo user;

  public V1TokenReviewStatus() {
  }

  public V1TokenReviewStatus audiences(@jakarta.annotation.Nullable List<String> audiences) {
    this.audiences = audiences;
    return this;
  }

  public V1TokenReviewStatus addAudiencesItem(String audiencesItem) {
    if (this.audiences == null) {
      this.audiences = new ArrayList<>();
    }
    this.audiences.add(audiencesItem);
    return this;
  }

  /**
   * Audiences are audience identifiers chosen by the authenticator that are compatible with both the TokenReview and token. An identifier is any identifier in the intersection of the TokenReviewSpec audiences and the token&#39;s audiences. A client of the TokenReview API that sets the spec.audiences field should validate that a compatible audience identifier is returned in the status.audiences field to ensure that the TokenReview server is audience aware. If a TokenReview returns an empty status.audience field where status.authenticated is \&quot;true\&quot;, the token is valid against the audience of the Kubernetes API server.
   * @return audiences
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "Audiences are audience identifiers chosen by the authenticator that are compatible with both the TokenReview and token. An identifier is any identifier in the intersection of the TokenReviewSpec audiences and the token's audiences. A client of the TokenReview API that sets the spec.audiences field should validate that a compatible audience identifier is returned in the status.audiences field to ensure that the TokenReview server is audience aware. If a TokenReview returns an empty status.audience field where status.authenticated is \"true\", the token is valid against the audience of the Kubernetes API server.")
  public List<String> getAudiences() {
    return audiences;
  }

  public void setAudiences(@jakarta.annotation.Nullable List<String> audiences) {
    this.audiences = audiences;
  }


  public V1TokenReviewStatus authenticated(@jakarta.annotation.Nullable Boolean authenticated) {
    this.authenticated = authenticated;
    return this;
  }

  /**
   * Authenticated indicates that the token was associated with a known user.
   * @return authenticated
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "Authenticated indicates that the token was associated with a known user.")
  public Boolean getAuthenticated() {
    return authenticated;
  }

  public void setAuthenticated(@jakarta.annotation.Nullable Boolean authenticated) {
    this.authenticated = authenticated;
  }


  public V1TokenReviewStatus error(@jakarta.annotation.Nullable String error) {
    this.error = error;
    return this;
  }

  /**
   * Error indicates that the token couldn&#39;t be checked
   * @return error
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "Error indicates that the token couldn't be checked")
  public String getError() {
    return error;
  }

  public void setError(@jakarta.annotation.Nullable String error) {
    this.error = error;
  }


  public V1TokenReviewStatus user(@jakarta.annotation.Nullable V1UserInfo user) {
    this.user = user;
    return this;
  }

  /**
   * Get user
   * @return user
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  public V1UserInfo getUser() {
    return user;
  }

  public void setUser(@jakarta.annotation.Nullable V1UserInfo user) {
    this.user = user;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1TokenReviewStatus v1TokenReviewStatus = (V1TokenReviewStatus) o;
    return Objects.equals(this.audiences, v1TokenReviewStatus.audiences) &&
        Objects.equals(this.authenticated, v1TokenReviewStatus.authenticated) &&
        Objects.equals(this.error, v1TokenReviewStatus.error) &&
        Objects.equals(this.user, v1TokenReviewStatus.user);
  }

  @Override
  public int hashCode() {
    return Objects.hash(audiences, authenticated, error, user);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1TokenReviewStatus {\n");
    sb.append("    audiences: ").append(toIndentedString(audiences)).append("\n");
    sb.append("    authenticated: ").append(toIndentedString(authenticated)).append("\n");
    sb.append("    error: ").append(toIndentedString(error)).append("\n");
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
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
    openapiFields.add("authenticated");
    openapiFields.add("error");
    openapiFields.add("user");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to V1TokenReviewStatus
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!V1TokenReviewStatus.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in V1TokenReviewStatus is not found in the empty JSON string", V1TokenReviewStatus.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!V1TokenReviewStatus.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `V1TokenReviewStatus` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // ensure the optional json data is an array if present
      if (jsonObj.get("audiences") != null && !jsonObj.get("audiences").isJsonNull() && !jsonObj.get("audiences").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `audiences` to be an array in the JSON string but got `%s`", jsonObj.get("audiences").toString()));
      }
      if ((jsonObj.get("error") != null && !jsonObj.get("error").isJsonNull()) && !jsonObj.get("error").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `error` to be a primitive type in the JSON string but got `%s`", jsonObj.get("error").toString()));
      }
      // validate the optional field `user`
      if (jsonObj.get("user") != null && !jsonObj.get("user").isJsonNull()) {
        V1UserInfo.validateJsonElement(jsonObj.get("user"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!V1TokenReviewStatus.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'V1TokenReviewStatus' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<V1TokenReviewStatus> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(V1TokenReviewStatus.class));

       return (TypeAdapter<T>) new TypeAdapter<V1TokenReviewStatus>() {
           @Override
           public void write(JsonWriter out, V1TokenReviewStatus value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public V1TokenReviewStatus read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of V1TokenReviewStatus given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of V1TokenReviewStatus
   * @throws IOException if the JSON string is invalid with respect to V1TokenReviewStatus
   */
  public static V1TokenReviewStatus fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, V1TokenReviewStatus.class);
  }

  /**
   * Convert an instance of V1TokenReviewStatus to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
