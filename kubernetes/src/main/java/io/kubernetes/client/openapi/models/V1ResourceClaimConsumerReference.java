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

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import io.kubernetes.client.openapi.JSON;

/**
 * ResourceClaimConsumerReference contains enough information to let you locate the consumer of a ResourceClaim. The user must be a resource in the same namespace as the ResourceClaim.
 */
@ApiModel(description = "ResourceClaimConsumerReference contains enough information to let you locate the consumer of a ResourceClaim. The user must be a resource in the same namespace as the ResourceClaim.")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-09-11T18:00:16.154662Z[Etc/UTC]", comments = "Generator version: 7.13.0")
public class V1ResourceClaimConsumerReference {
  public static final String SERIALIZED_NAME_API_GROUP = "apiGroup";
  @SerializedName(SERIALIZED_NAME_API_GROUP)
  @jakarta.annotation.Nullable
  private String apiGroup;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  @jakarta.annotation.Nonnull
  private String name;

  public static final String SERIALIZED_NAME_RESOURCE = "resource";
  @SerializedName(SERIALIZED_NAME_RESOURCE)
  @jakarta.annotation.Nonnull
  private String resource;

  public static final String SERIALIZED_NAME_UID = "uid";
  @SerializedName(SERIALIZED_NAME_UID)
  @jakarta.annotation.Nonnull
  private String uid;

  public V1ResourceClaimConsumerReference() {
  }

  public V1ResourceClaimConsumerReference apiGroup(@jakarta.annotation.Nullable String apiGroup) {
    this.apiGroup = apiGroup;
    return this;
  }

  /**
   * APIGroup is the group for the resource being referenced. It is empty for the core API. This matches the group in the APIVersion that is used when creating the resources.
   * @return apiGroup
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "APIGroup is the group for the resource being referenced. It is empty for the core API. This matches the group in the APIVersion that is used when creating the resources.")
  public String getApiGroup() {
    return apiGroup;
  }

  public void setApiGroup(@jakarta.annotation.Nullable String apiGroup) {
    this.apiGroup = apiGroup;
  }


  public V1ResourceClaimConsumerReference name(@jakarta.annotation.Nonnull String name) {
    this.name = name;
    return this;
  }

  /**
   * Name is the name of resource being referenced.
   * @return name
   */
  @jakarta.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Name is the name of resource being referenced.")
  public String getName() {
    return name;
  }

  public void setName(@jakarta.annotation.Nonnull String name) {
    this.name = name;
  }


  public V1ResourceClaimConsumerReference resource(@jakarta.annotation.Nonnull String resource) {
    this.resource = resource;
    return this;
  }

  /**
   * Resource is the type of resource being referenced, for example \&quot;pods\&quot;.
   * @return resource
   */
  @jakarta.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Resource is the type of resource being referenced, for example \"pods\".")
  public String getResource() {
    return resource;
  }

  public void setResource(@jakarta.annotation.Nonnull String resource) {
    this.resource = resource;
  }


  public V1ResourceClaimConsumerReference uid(@jakarta.annotation.Nonnull String uid) {
    this.uid = uid;
    return this;
  }

  /**
   * UID identifies exactly one incarnation of the resource.
   * @return uid
   */
  @jakarta.annotation.Nonnull
  @ApiModelProperty(required = true, value = "UID identifies exactly one incarnation of the resource.")
  public String getUid() {
    return uid;
  }

  public void setUid(@jakarta.annotation.Nonnull String uid) {
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
    V1ResourceClaimConsumerReference v1ResourceClaimConsumerReference = (V1ResourceClaimConsumerReference) o;
    return Objects.equals(this.apiGroup, v1ResourceClaimConsumerReference.apiGroup) &&
        Objects.equals(this.name, v1ResourceClaimConsumerReference.name) &&
        Objects.equals(this.resource, v1ResourceClaimConsumerReference.resource) &&
        Objects.equals(this.uid, v1ResourceClaimConsumerReference.uid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(apiGroup, name, resource, uid);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1ResourceClaimConsumerReference {\n");
    sb.append("    apiGroup: ").append(toIndentedString(apiGroup)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    resource: ").append(toIndentedString(resource)).append("\n");
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
    openapiFields.add("apiGroup");
    openapiFields.add("name");
    openapiFields.add("resource");
    openapiFields.add("uid");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("name");
    openapiRequiredFields.add("resource");
    openapiRequiredFields.add("uid");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to V1ResourceClaimConsumerReference
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!V1ResourceClaimConsumerReference.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in V1ResourceClaimConsumerReference is not found in the empty JSON string", V1ResourceClaimConsumerReference.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!V1ResourceClaimConsumerReference.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `V1ResourceClaimConsumerReference` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : V1ResourceClaimConsumerReference.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("apiGroup") != null && !jsonObj.get("apiGroup").isJsonNull()) && !jsonObj.get("apiGroup").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `apiGroup` to be a primitive type in the JSON string but got `%s`", jsonObj.get("apiGroup").toString()));
      }
      if (!jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if (!jsonObj.get("resource").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `resource` to be a primitive type in the JSON string but got `%s`", jsonObj.get("resource").toString()));
      }
      if (!jsonObj.get("uid").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `uid` to be a primitive type in the JSON string but got `%s`", jsonObj.get("uid").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!V1ResourceClaimConsumerReference.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'V1ResourceClaimConsumerReference' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<V1ResourceClaimConsumerReference> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(V1ResourceClaimConsumerReference.class));

       return (TypeAdapter<T>) new TypeAdapter<V1ResourceClaimConsumerReference>() {
           @Override
           public void write(JsonWriter out, V1ResourceClaimConsumerReference value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public V1ResourceClaimConsumerReference read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of V1ResourceClaimConsumerReference given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of V1ResourceClaimConsumerReference
   * @throws IOException if the JSON string is invalid with respect to V1ResourceClaimConsumerReference
   */
  public static V1ResourceClaimConsumerReference fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, V1ResourceClaimConsumerReference.class);
  }

  /**
   * Convert an instance of V1ResourceClaimConsumerReference to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
