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
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.kubernetes.client.openapi.models.V1beta3GroupSubject;
import io.kubernetes.client.openapi.models.V1beta3ServiceAccountSubject;
import io.kubernetes.client.openapi.models.V1beta3UserSubject;
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

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import io.kubernetes.client.openapi.JSON;

/**
 * Subject matches the originator of a request, as identified by the request authentication system. There are three ways of matching an originator; by user, group, or service account.
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-04T19:37:38.574271Z[Etc/UTC]", comments = "Generator version: 7.6.0")
public class V1beta3Subject {
  public static final String SERIALIZED_NAME_GROUP = "group";
  @SerializedName(SERIALIZED_NAME_GROUP)
  private V1beta3GroupSubject group;

  public static final String SERIALIZED_NAME_KIND = "kind";
  @SerializedName(SERIALIZED_NAME_KIND)
  private String kind;

  public static final String SERIALIZED_NAME_SERVICE_ACCOUNT = "serviceAccount";
  @SerializedName(SERIALIZED_NAME_SERVICE_ACCOUNT)
  private V1beta3ServiceAccountSubject serviceAccount;

  public static final String SERIALIZED_NAME_USER = "user";
  @SerializedName(SERIALIZED_NAME_USER)
  private V1beta3UserSubject user;

  public V1beta3Subject() {
  }

  public V1beta3Subject group(V1beta3GroupSubject group) {
    this.group = group;
    return this;
  }

   /**
   * Get group
   * @return group
  **/
  @jakarta.annotation.Nullable
  public V1beta3GroupSubject getGroup() {
    return group;
  }

  public void setGroup(V1beta3GroupSubject group) {
    this.group = group;
  }


  public V1beta3Subject kind(String kind) {
    this.kind = kind;
    return this;
  }

   /**
   * &#x60;kind&#x60; indicates which one of the other fields is non-empty. Required
   * @return kind
  **/
  @jakarta.annotation.Nonnull
  public String getKind() {
    return kind;
  }

  public void setKind(String kind) {
    this.kind = kind;
  }


  public V1beta3Subject serviceAccount(V1beta3ServiceAccountSubject serviceAccount) {
    this.serviceAccount = serviceAccount;
    return this;
  }

   /**
   * Get serviceAccount
   * @return serviceAccount
  **/
  @jakarta.annotation.Nullable
  public V1beta3ServiceAccountSubject getServiceAccount() {
    return serviceAccount;
  }

  public void setServiceAccount(V1beta3ServiceAccountSubject serviceAccount) {
    this.serviceAccount = serviceAccount;
  }


  public V1beta3Subject user(V1beta3UserSubject user) {
    this.user = user;
    return this;
  }

   /**
   * Get user
   * @return user
  **/
  @jakarta.annotation.Nullable
  public V1beta3UserSubject getUser() {
    return user;
  }

  public void setUser(V1beta3UserSubject user) {
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
    V1beta3Subject v1beta3Subject = (V1beta3Subject) o;
    return Objects.equals(this.group, v1beta3Subject.group) &&
        Objects.equals(this.kind, v1beta3Subject.kind) &&
        Objects.equals(this.serviceAccount, v1beta3Subject.serviceAccount) &&
        Objects.equals(this.user, v1beta3Subject.user);
  }

  @Override
  public int hashCode() {
    return Objects.hash(group, kind, serviceAccount, user);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1beta3Subject {\n");
    sb.append("    group: ").append(toIndentedString(group)).append("\n");
    sb.append("    kind: ").append(toIndentedString(kind)).append("\n");
    sb.append("    serviceAccount: ").append(toIndentedString(serviceAccount)).append("\n");
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
    openapiFields.add("group");
    openapiFields.add("kind");
    openapiFields.add("serviceAccount");
    openapiFields.add("user");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("kind");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to V1beta3Subject
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!V1beta3Subject.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in V1beta3Subject is not found in the empty JSON string", V1beta3Subject.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!V1beta3Subject.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `V1beta3Subject` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : V1beta3Subject.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `group`
      if (jsonObj.get("group") != null && !jsonObj.get("group").isJsonNull()) {
        V1beta3GroupSubject.validateJsonElement(jsonObj.get("group"));
      }
      if (!jsonObj.get("kind").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `kind` to be a primitive type in the JSON string but got `%s`", jsonObj.get("kind").toString()));
      }
      // validate the optional field `serviceAccount`
      if (jsonObj.get("serviceAccount") != null && !jsonObj.get("serviceAccount").isJsonNull()) {
        V1beta3ServiceAccountSubject.validateJsonElement(jsonObj.get("serviceAccount"));
      }
      // validate the optional field `user`
      if (jsonObj.get("user") != null && !jsonObj.get("user").isJsonNull()) {
        V1beta3UserSubject.validateJsonElement(jsonObj.get("user"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!V1beta3Subject.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'V1beta3Subject' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<V1beta3Subject> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(V1beta3Subject.class));

       return (TypeAdapter<T>) new TypeAdapter<V1beta3Subject>() {
           @Override
           public void write(JsonWriter out, V1beta3Subject value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public V1beta3Subject read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of V1beta3Subject given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of V1beta3Subject
  * @throws IOException if the JSON string is invalid with respect to V1beta3Subject
  */
  public static V1beta3Subject fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, V1beta3Subject.class);
  }

 /**
  * Convert an instance of V1beta3Subject to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
