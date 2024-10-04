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

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import io.kubernetes.client.openapi.JSON;

/**
 * LinuxContainerUser represents user identity information in Linux containers
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-04T19:37:38.574271Z[Etc/UTC]", comments = "Generator version: 7.6.0")
public class V1LinuxContainerUser {
  public static final String SERIALIZED_NAME_GID = "gid";
  @SerializedName(SERIALIZED_NAME_GID)
  private Long gid;

  public static final String SERIALIZED_NAME_SUPPLEMENTAL_GROUPS = "supplementalGroups";
  @SerializedName(SERIALIZED_NAME_SUPPLEMENTAL_GROUPS)
  private List<Long> supplementalGroups = new ArrayList<>();

  public static final String SERIALIZED_NAME_UID = "uid";
  @SerializedName(SERIALIZED_NAME_UID)
  private Long uid;

  public V1LinuxContainerUser() {
  }

  public V1LinuxContainerUser gid(Long gid) {
    this.gid = gid;
    return this;
  }

   /**
   * GID is the primary gid initially attached to the first process in the container
   * @return gid
  **/
  @jakarta.annotation.Nonnull
  public Long getGid() {
    return gid;
  }

  public void setGid(Long gid) {
    this.gid = gid;
  }


  public V1LinuxContainerUser supplementalGroups(List<Long> supplementalGroups) {
    this.supplementalGroups = supplementalGroups;
    return this;
  }

  public V1LinuxContainerUser addSupplementalGroupsItem(Long supplementalGroupsItem) {
    if (this.supplementalGroups == null) {
      this.supplementalGroups = new ArrayList<>();
    }
    this.supplementalGroups.add(supplementalGroupsItem);
    return this;
  }

   /**
   * SupplementalGroups are the supplemental groups initially attached to the first process in the container
   * @return supplementalGroups
  **/
  @jakarta.annotation.Nullable
  public List<Long> getSupplementalGroups() {
    return supplementalGroups;
  }

  public void setSupplementalGroups(List<Long> supplementalGroups) {
    this.supplementalGroups = supplementalGroups;
  }


  public V1LinuxContainerUser uid(Long uid) {
    this.uid = uid;
    return this;
  }

   /**
   * UID is the primary uid initially attached to the first process in the container
   * @return uid
  **/
  @jakarta.annotation.Nonnull
  public Long getUid() {
    return uid;
  }

  public void setUid(Long uid) {
    this.uid = uid;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1LinuxContainerUser v1LinuxContainerUser = (V1LinuxContainerUser) o;
    return Objects.equals(this.gid, v1LinuxContainerUser.gid) &&
        Objects.equals(this.supplementalGroups, v1LinuxContainerUser.supplementalGroups) &&
        Objects.equals(this.uid, v1LinuxContainerUser.uid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(gid, supplementalGroups, uid);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1LinuxContainerUser {\n");
    sb.append("    gid: ").append(toIndentedString(gid)).append("\n");
    sb.append("    supplementalGroups: ").append(toIndentedString(supplementalGroups)).append("\n");
    sb.append("    uid: ").append(toIndentedString(uid)).append("\n");
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
    openapiFields.add("gid");
    openapiFields.add("supplementalGroups");
    openapiFields.add("uid");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("gid");
    openapiRequiredFields.add("uid");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to V1LinuxContainerUser
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!V1LinuxContainerUser.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in V1LinuxContainerUser is not found in the empty JSON string", V1LinuxContainerUser.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!V1LinuxContainerUser.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `V1LinuxContainerUser` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : V1LinuxContainerUser.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // ensure the optional json data is an array if present
      if (jsonObj.get("supplementalGroups") != null && !jsonObj.get("supplementalGroups").isJsonNull() && !jsonObj.get("supplementalGroups").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `supplementalGroups` to be an array in the JSON string but got `%s`", jsonObj.get("supplementalGroups").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!V1LinuxContainerUser.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'V1LinuxContainerUser' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<V1LinuxContainerUser> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(V1LinuxContainerUser.class));

       return (TypeAdapter<T>) new TypeAdapter<V1LinuxContainerUser>() {
           @Override
           public void write(JsonWriter out, V1LinuxContainerUser value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public V1LinuxContainerUser read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of V1LinuxContainerUser given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of V1LinuxContainerUser
  * @throws IOException if the JSON string is invalid with respect to V1LinuxContainerUser
  */
  public static V1LinuxContainerUser fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, V1LinuxContainerUser.class);
  }

 /**
  * Convert an instance of V1LinuxContainerUser to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
