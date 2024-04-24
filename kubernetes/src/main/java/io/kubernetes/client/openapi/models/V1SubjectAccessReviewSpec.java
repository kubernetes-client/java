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
import io.kubernetes.client.openapi.models.V1NonResourceAttributes;
import io.kubernetes.client.openapi.models.V1ResourceAttributes;
import java.io.IOException;
import java.util.ArrayList;
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

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import io.kubernetes.client.openapi.JSON;

/**
 * SubjectAccessReviewSpec is a description of the access request.  Exactly one of ResourceAuthorizationAttributes and NonResourceAuthorizationAttributes must be set
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-23T13:45:09.091597Z[Etc/UTC]")
public class V1SubjectAccessReviewSpec {
  public static final String SERIALIZED_NAME_EXTRA = "extra";
  @SerializedName(SERIALIZED_NAME_EXTRA)
  private Map<String, List<String>> extra = new HashMap<>();

  public static final String SERIALIZED_NAME_GROUPS = "groups";
  @SerializedName(SERIALIZED_NAME_GROUPS)
  private List<String> groups;

  public static final String SERIALIZED_NAME_NON_RESOURCE_ATTRIBUTES = "nonResourceAttributes";
  @SerializedName(SERIALIZED_NAME_NON_RESOURCE_ATTRIBUTES)
  private V1NonResourceAttributes nonResourceAttributes;

  public static final String SERIALIZED_NAME_RESOURCE_ATTRIBUTES = "resourceAttributes";
  @SerializedName(SERIALIZED_NAME_RESOURCE_ATTRIBUTES)
  private V1ResourceAttributes resourceAttributes;

  public static final String SERIALIZED_NAME_UID = "uid";
  @SerializedName(SERIALIZED_NAME_UID)
  private String uid;

  public static final String SERIALIZED_NAME_USER = "user";
  @SerializedName(SERIALIZED_NAME_USER)
  private String user;

  public V1SubjectAccessReviewSpec() {
  }

  public V1SubjectAccessReviewSpec extra(Map<String, List<String>> extra) {

    this.extra = extra;
    return this;
  }

  public V1SubjectAccessReviewSpec putExtraItem(String key, List<String> extraItem) {
    if (this.extra == null) {
      this.extra = new HashMap<>();
    }
    this.extra.put(key, extraItem);
    return this;
  }

   /**
   * Extra corresponds to the user.Info.GetExtra() method from the authenticator.  Since that is input to the authorizer it needs a reflection here.
   * @return extra
  **/
  @jakarta.annotation.Nullable
  public Map<String, List<String>> getExtra() {
    return extra;
  }


  public void setExtra(Map<String, List<String>> extra) {
    this.extra = extra;
  }


  public V1SubjectAccessReviewSpec groups(List<String> groups) {

    this.groups = groups;
    return this;
  }

  public V1SubjectAccessReviewSpec addGroupsItem(String groupsItem) {
    if (this.groups == null) {
      this.groups = new ArrayList<>();
    }
    this.groups.add(groupsItem);
    return this;
  }

   /**
   * Groups is the groups you&#39;re testing for.
   * @return groups
  **/
  @jakarta.annotation.Nullable
  public List<String> getGroups() {
    return groups;
  }


  public void setGroups(List<String> groups) {
    this.groups = groups;
  }


  public V1SubjectAccessReviewSpec nonResourceAttributes(V1NonResourceAttributes nonResourceAttributes) {

    this.nonResourceAttributes = nonResourceAttributes;
    return this;
  }

   /**
   * Get nonResourceAttributes
   * @return nonResourceAttributes
  **/
  @jakarta.annotation.Nullable
  public V1NonResourceAttributes getNonResourceAttributes() {
    return nonResourceAttributes;
  }


  public void setNonResourceAttributes(V1NonResourceAttributes nonResourceAttributes) {
    this.nonResourceAttributes = nonResourceAttributes;
  }


  public V1SubjectAccessReviewSpec resourceAttributes(V1ResourceAttributes resourceAttributes) {

    this.resourceAttributes = resourceAttributes;
    return this;
  }

   /**
   * Get resourceAttributes
   * @return resourceAttributes
  **/
  @jakarta.annotation.Nullable
  public V1ResourceAttributes getResourceAttributes() {
    return resourceAttributes;
  }


  public void setResourceAttributes(V1ResourceAttributes resourceAttributes) {
    this.resourceAttributes = resourceAttributes;
  }


  public V1SubjectAccessReviewSpec uid(String uid) {

    this.uid = uid;
    return this;
  }

   /**
   * UID information about the requesting user.
   * @return uid
  **/
  @jakarta.annotation.Nullable
  public String getUid() {
    return uid;
  }


  public void setUid(String uid) {
    this.uid = uid;
  }


  public V1SubjectAccessReviewSpec user(String user) {

    this.user = user;
    return this;
  }

   /**
   * User is the user you&#39;re testing for. If you specify \&quot;User\&quot; but not \&quot;Groups\&quot;, then is it interpreted as \&quot;What if User were not a member of any groups
   * @return user
  **/
  @jakarta.annotation.Nullable
  public String getUser() {
    return user;
  }


  public void setUser(String user) {
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
    V1SubjectAccessReviewSpec v1SubjectAccessReviewSpec = (V1SubjectAccessReviewSpec) o;
    return Objects.equals(this.extra, v1SubjectAccessReviewSpec.extra) &&
        Objects.equals(this.groups, v1SubjectAccessReviewSpec.groups) &&
        Objects.equals(this.nonResourceAttributes, v1SubjectAccessReviewSpec.nonResourceAttributes) &&
        Objects.equals(this.resourceAttributes, v1SubjectAccessReviewSpec.resourceAttributes) &&
        Objects.equals(this.uid, v1SubjectAccessReviewSpec.uid) &&
        Objects.equals(this.user, v1SubjectAccessReviewSpec.user);
  }

  @Override
  public int hashCode() {
    return Objects.hash(extra, groups, nonResourceAttributes, resourceAttributes, uid, user);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1SubjectAccessReviewSpec {\n");
    sb.append("    extra: ").append(toIndentedString(extra)).append("\n");
    sb.append("    groups: ").append(toIndentedString(groups)).append("\n");
    sb.append("    nonResourceAttributes: ").append(toIndentedString(nonResourceAttributes)).append("\n");
    sb.append("    resourceAttributes: ").append(toIndentedString(resourceAttributes)).append("\n");
    sb.append("    uid: ").append(toIndentedString(uid)).append("\n");
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
    openapiFields.add("extra");
    openapiFields.add("groups");
    openapiFields.add("nonResourceAttributes");
    openapiFields.add("resourceAttributes");
    openapiFields.add("uid");
    openapiFields.add("user");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to V1SubjectAccessReviewSpec
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!V1SubjectAccessReviewSpec.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in V1SubjectAccessReviewSpec is not found in the empty JSON string", V1SubjectAccessReviewSpec.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!V1SubjectAccessReviewSpec.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `V1SubjectAccessReviewSpec` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("groups") != null && !jsonObj.get("groups").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `groups` to be an array in the JSON string but got `%s`", jsonObj.get("groups").toString()));
      }
      // validate the optional field `nonResourceAttributes`
      if (jsonObj.get("nonResourceAttributes") != null && !jsonObj.get("nonResourceAttributes").isJsonNull()) {
        V1NonResourceAttributes.validateJsonObject(jsonObj.getAsJsonObject("nonResourceAttributes"));
      }
      // validate the optional field `resourceAttributes`
      if (jsonObj.get("resourceAttributes") != null && !jsonObj.get("resourceAttributes").isJsonNull()) {
        V1ResourceAttributes.validateJsonObject(jsonObj.getAsJsonObject("resourceAttributes"));
      }
      if ((jsonObj.get("uid") != null && !jsonObj.get("uid").isJsonNull()) && !jsonObj.get("uid").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `uid` to be a primitive type in the JSON string but got `%s`", jsonObj.get("uid").toString()));
      }
      if ((jsonObj.get("user") != null && !jsonObj.get("user").isJsonNull()) && !jsonObj.get("user").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `user` to be a primitive type in the JSON string but got `%s`", jsonObj.get("user").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!V1SubjectAccessReviewSpec.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'V1SubjectAccessReviewSpec' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<V1SubjectAccessReviewSpec> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(V1SubjectAccessReviewSpec.class));

       return (TypeAdapter<T>) new TypeAdapter<V1SubjectAccessReviewSpec>() {
           @Override
           public void write(JsonWriter out, V1SubjectAccessReviewSpec value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public V1SubjectAccessReviewSpec read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of V1SubjectAccessReviewSpec given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of V1SubjectAccessReviewSpec
  * @throws IOException if the JSON string is invalid with respect to V1SubjectAccessReviewSpec
  */
  public static V1SubjectAccessReviewSpec fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, V1SubjectAccessReviewSpec.class);
  }

 /**
  * Convert an instance of V1SubjectAccessReviewSpec to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
