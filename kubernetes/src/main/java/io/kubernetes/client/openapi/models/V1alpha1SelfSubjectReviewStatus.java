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
import io.kubernetes.client.openapi.models.V1UserInfo;
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
 * SelfSubjectReviewStatus is filled by the kube-apiserver and sent back to a user.
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-23T13:45:09.091597Z[Etc/UTC]")
public class V1alpha1SelfSubjectReviewStatus {
  public static final String SERIALIZED_NAME_USER_INFO = "userInfo";
  @SerializedName(SERIALIZED_NAME_USER_INFO)
  private V1UserInfo userInfo;

  public V1alpha1SelfSubjectReviewStatus() {
  }

  public V1alpha1SelfSubjectReviewStatus userInfo(V1UserInfo userInfo) {

    this.userInfo = userInfo;
    return this;
  }

   /**
   * Get userInfo
   * @return userInfo
  **/
  @jakarta.annotation.Nullable
  public V1UserInfo getUserInfo() {
    return userInfo;
  }


  public void setUserInfo(V1UserInfo userInfo) {
    this.userInfo = userInfo;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1alpha1SelfSubjectReviewStatus v1alpha1SelfSubjectReviewStatus = (V1alpha1SelfSubjectReviewStatus) o;
    return Objects.equals(this.userInfo, v1alpha1SelfSubjectReviewStatus.userInfo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(userInfo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1alpha1SelfSubjectReviewStatus {\n");
    sb.append("    userInfo: ").append(toIndentedString(userInfo)).append("\n");
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
    openapiFields.add("userInfo");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to V1alpha1SelfSubjectReviewStatus
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!V1alpha1SelfSubjectReviewStatus.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in V1alpha1SelfSubjectReviewStatus is not found in the empty JSON string", V1alpha1SelfSubjectReviewStatus.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!V1alpha1SelfSubjectReviewStatus.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `V1alpha1SelfSubjectReviewStatus` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      // validate the optional field `userInfo`
      if (jsonObj.get("userInfo") != null && !jsonObj.get("userInfo").isJsonNull()) {
        V1UserInfo.validateJsonObject(jsonObj.getAsJsonObject("userInfo"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!V1alpha1SelfSubjectReviewStatus.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'V1alpha1SelfSubjectReviewStatus' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<V1alpha1SelfSubjectReviewStatus> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(V1alpha1SelfSubjectReviewStatus.class));

       return (TypeAdapter<T>) new TypeAdapter<V1alpha1SelfSubjectReviewStatus>() {
           @Override
           public void write(JsonWriter out, V1alpha1SelfSubjectReviewStatus value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public V1alpha1SelfSubjectReviewStatus read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of V1alpha1SelfSubjectReviewStatus given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of V1alpha1SelfSubjectReviewStatus
  * @throws IOException if the JSON string is invalid with respect to V1alpha1SelfSubjectReviewStatus
  */
  public static V1alpha1SelfSubjectReviewStatus fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, V1alpha1SelfSubjectReviewStatus.class);
  }

 /**
  * Convert an instance of V1alpha1SelfSubjectReviewStatus to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
