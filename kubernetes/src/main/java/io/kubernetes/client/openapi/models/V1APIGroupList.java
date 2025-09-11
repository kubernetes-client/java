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
import io.kubernetes.client.openapi.models.V1APIGroup;
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
 * APIGroupList is a list of APIGroup, to allow clients to discover the API at /apis.
 */
@ApiModel(description = "APIGroupList is a list of APIGroup, to allow clients to discover the API at /apis.")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-09-11T18:00:16.154662Z[Etc/UTC]", comments = "Generator version: 7.13.0")
public class V1APIGroupList {
  public static final String SERIALIZED_NAME_API_VERSION = "apiVersion";
  @SerializedName(SERIALIZED_NAME_API_VERSION)
  @jakarta.annotation.Nullable
  private String apiVersion;

  public static final String SERIALIZED_NAME_GROUPS = "groups";
  @SerializedName(SERIALIZED_NAME_GROUPS)
  @jakarta.annotation.Nonnull
  private List<V1APIGroup> groups = new ArrayList<>();

  public static final String SERIALIZED_NAME_KIND = "kind";
  @SerializedName(SERIALIZED_NAME_KIND)
  @jakarta.annotation.Nullable
  private String kind;

  public V1APIGroupList() {
  }

  public V1APIGroupList apiVersion(@jakarta.annotation.Nullable String apiVersion) {
    this.apiVersion = apiVersion;
    return this;
  }

  /**
   * APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
   * @return apiVersion
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources")
  public String getApiVersion() {
    return apiVersion;
  }

  public void setApiVersion(@jakarta.annotation.Nullable String apiVersion) {
    this.apiVersion = apiVersion;
  }


  public V1APIGroupList groups(@jakarta.annotation.Nonnull List<V1APIGroup> groups) {
    this.groups = groups;
    return this;
  }

  public V1APIGroupList addGroupsItem(V1APIGroup groupsItem) {
    if (this.groups == null) {
      this.groups = new ArrayList<>();
    }
    this.groups.add(groupsItem);
    return this;
  }

  /**
   * groups is a list of APIGroup.
   * @return groups
   */
  @jakarta.annotation.Nonnull
  @ApiModelProperty(required = true, value = "groups is a list of APIGroup.")
  public List<V1APIGroup> getGroups() {
    return groups;
  }

  public void setGroups(@jakarta.annotation.Nonnull List<V1APIGroup> groups) {
    this.groups = groups;
  }


  public V1APIGroupList kind(@jakarta.annotation.Nullable String kind) {
    this.kind = kind;
    return this;
  }

  /**
   * Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
   * @return kind
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds")
  public String getKind() {
    return kind;
  }

  public void setKind(@jakarta.annotation.Nullable String kind) {
    this.kind = kind;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1APIGroupList v1APIGroupList = (V1APIGroupList) o;
    return Objects.equals(this.apiVersion, v1APIGroupList.apiVersion) &&
        Objects.equals(this.groups, v1APIGroupList.groups) &&
        Objects.equals(this.kind, v1APIGroupList.kind);
  }

  @Override
  public int hashCode() {
    return Objects.hash(apiVersion, groups, kind);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1APIGroupList {\n");
    sb.append("    apiVersion: ").append(toIndentedString(apiVersion)).append("\n");
    sb.append("    groups: ").append(toIndentedString(groups)).append("\n");
    sb.append("    kind: ").append(toIndentedString(kind)).append("\n");
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
    openapiFields.add("apiVersion");
    openapiFields.add("groups");
    openapiFields.add("kind");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("groups");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to V1APIGroupList
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!V1APIGroupList.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in V1APIGroupList is not found in the empty JSON string", V1APIGroupList.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!V1APIGroupList.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `V1APIGroupList` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : V1APIGroupList.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("apiVersion") != null && !jsonObj.get("apiVersion").isJsonNull()) && !jsonObj.get("apiVersion").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `apiVersion` to be a primitive type in the JSON string but got `%s`", jsonObj.get("apiVersion").toString()));
      }
      // ensure the json data is an array
      if (!jsonObj.get("groups").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `groups` to be an array in the JSON string but got `%s`", jsonObj.get("groups").toString()));
      }

      JsonArray jsonArraygroups = jsonObj.getAsJsonArray("groups");
      // validate the required field `groups` (array)
      for (int i = 0; i < jsonArraygroups.size(); i++) {
        V1APIGroup.validateJsonElement(jsonArraygroups.get(i));
      };
      if ((jsonObj.get("kind") != null && !jsonObj.get("kind").isJsonNull()) && !jsonObj.get("kind").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `kind` to be a primitive type in the JSON string but got `%s`", jsonObj.get("kind").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!V1APIGroupList.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'V1APIGroupList' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<V1APIGroupList> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(V1APIGroupList.class));

       return (TypeAdapter<T>) new TypeAdapter<V1APIGroupList>() {
           @Override
           public void write(JsonWriter out, V1APIGroupList value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public V1APIGroupList read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of V1APIGroupList given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of V1APIGroupList
   * @throws IOException if the JSON string is invalid with respect to V1APIGroupList
   */
  public static V1APIGroupList fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, V1APIGroupList.class);
  }

  /**
   * Convert an instance of V1APIGroupList to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
