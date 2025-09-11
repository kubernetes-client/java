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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
 * UserInfo holds the information about the user needed to implement the user.Info interface.
 */
@ApiModel(description = "UserInfo holds the information about the user needed to implement the user.Info interface.")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-09-11T18:00:16.154662Z[Etc/UTC]", comments = "Generator version: 7.13.0")
public class V1UserInfo {
  public static final String SERIALIZED_NAME_EXTRA = "extra";
  @SerializedName(SERIALIZED_NAME_EXTRA)
  @jakarta.annotation.Nullable
  private Map<String, List<String>> extra = new HashMap<>();

  public static final String SERIALIZED_NAME_GROUPS = "groups";
  @SerializedName(SERIALIZED_NAME_GROUPS)
  @jakarta.annotation.Nullable
  private List<String> groups = new ArrayList<>();

  public static final String SERIALIZED_NAME_UID = "uid";
  @SerializedName(SERIALIZED_NAME_UID)
  @jakarta.annotation.Nullable
  private String uid;

  public static final String SERIALIZED_NAME_USERNAME = "username";
  @SerializedName(SERIALIZED_NAME_USERNAME)
  @jakarta.annotation.Nullable
  private String username;

  public V1UserInfo() {
  }

  public V1UserInfo extra(@jakarta.annotation.Nullable Map<String, List<String>> extra) {
    this.extra = extra;
    return this;
  }

  public V1UserInfo putExtraItem(String key, List<String> extraItem) {
    if (this.extra == null) {
      this.extra = new HashMap<>();
    }
    this.extra.put(key, extraItem);
    return this;
  }

  /**
   * Any additional information provided by the authenticator.
   * @return extra
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "Any additional information provided by the authenticator.")
  public Map<String, List<String>> getExtra() {
    return extra;
  }

  public void setExtra(@jakarta.annotation.Nullable Map<String, List<String>> extra) {
    this.extra = extra;
  }


  public V1UserInfo groups(@jakarta.annotation.Nullable List<String> groups) {
    this.groups = groups;
    return this;
  }

  public V1UserInfo addGroupsItem(String groupsItem) {
    if (this.groups == null) {
      this.groups = new ArrayList<>();
    }
    this.groups.add(groupsItem);
    return this;
  }

  /**
   * The names of groups this user is a part of.
   * @return groups
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "The names of groups this user is a part of.")
  public List<String> getGroups() {
    return groups;
  }

  public void setGroups(@jakarta.annotation.Nullable List<String> groups) {
    this.groups = groups;
  }


  public V1UserInfo uid(@jakarta.annotation.Nullable String uid) {
    this.uid = uid;
    return this;
  }

  /**
   * A unique value that identifies this user across time. If this user is deleted and another user by the same name is added, they will have different UIDs.
   * @return uid
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "A unique value that identifies this user across time. If this user is deleted and another user by the same name is added, they will have different UIDs.")
  public String getUid() {
    return uid;
  }

  public void setUid(@jakarta.annotation.Nullable String uid) {
    this.uid = uid;
  }


  public V1UserInfo username(@jakarta.annotation.Nullable String username) {
    this.username = username;
    return this;
  }

  /**
   * The name that uniquely identifies this user among all active users.
   * @return username
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "The name that uniquely identifies this user among all active users.")
  public String getUsername() {
    return username;
  }

  public void setUsername(@jakarta.annotation.Nullable String username) {
    this.username = username;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1UserInfo v1UserInfo = (V1UserInfo) o;
    return Objects.equals(this.extra, v1UserInfo.extra) &&
        Objects.equals(this.groups, v1UserInfo.groups) &&
        Objects.equals(this.uid, v1UserInfo.uid) &&
        Objects.equals(this.username, v1UserInfo.username);
  }

  @Override
  public int hashCode() {
    return Objects.hash(extra, groups, uid, username);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1UserInfo {\n");
    sb.append("    extra: ").append(toIndentedString(extra)).append("\n");
    sb.append("    groups: ").append(toIndentedString(groups)).append("\n");
    sb.append("    uid: ").append(toIndentedString(uid)).append("\n");
    sb.append("    username: ").append(toIndentedString(username)).append("\n");
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
    openapiFields.add("extra");
    openapiFields.add("groups");
    openapiFields.add("uid");
    openapiFields.add("username");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to V1UserInfo
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!V1UserInfo.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in V1UserInfo is not found in the empty JSON string", V1UserInfo.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!V1UserInfo.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `V1UserInfo` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // ensure the optional json data is an array if present
      if (jsonObj.get("groups") != null && !jsonObj.get("groups").isJsonNull() && !jsonObj.get("groups").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `groups` to be an array in the JSON string but got `%s`", jsonObj.get("groups").toString()));
      }
      if ((jsonObj.get("uid") != null && !jsonObj.get("uid").isJsonNull()) && !jsonObj.get("uid").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `uid` to be a primitive type in the JSON string but got `%s`", jsonObj.get("uid").toString()));
      }
      if ((jsonObj.get("username") != null && !jsonObj.get("username").isJsonNull()) && !jsonObj.get("username").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `username` to be a primitive type in the JSON string but got `%s`", jsonObj.get("username").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!V1UserInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'V1UserInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<V1UserInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(V1UserInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<V1UserInfo>() {
           @Override
           public void write(JsonWriter out, V1UserInfo value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public V1UserInfo read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of V1UserInfo given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of V1UserInfo
   * @throws IOException if the JSON string is invalid with respect to V1UserInfo
   */
  public static V1UserInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, V1UserInfo.class);
  }

  /**
   * Convert an instance of V1UserInfo to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
