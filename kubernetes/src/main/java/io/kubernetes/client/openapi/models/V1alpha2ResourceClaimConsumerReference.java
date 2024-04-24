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
 * ResourceClaimConsumerReference contains enough information to let you locate the consumer of a ResourceClaim. The user must be a resource in the same namespace as the ResourceClaim.
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-23T13:45:09.091597Z[Etc/UTC]")
public class V1alpha2ResourceClaimConsumerReference {
  public static final String SERIALIZED_NAME_API_GROUP = "apiGroup";
  @SerializedName(SERIALIZED_NAME_API_GROUP)
  private String apiGroup;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_RESOURCE = "resource";
  @SerializedName(SERIALIZED_NAME_RESOURCE)
  private String resource;

  public static final String SERIALIZED_NAME_UID = "uid";
  @SerializedName(SERIALIZED_NAME_UID)
  private String uid;

  public V1alpha2ResourceClaimConsumerReference() {
  }

  public V1alpha2ResourceClaimConsumerReference apiGroup(String apiGroup) {

    this.apiGroup = apiGroup;
    return this;
  }

   /**
   * APIGroup is the group for the resource being referenced. It is empty for the core API. This matches the group in the APIVersion that is used when creating the resources.
   * @return apiGroup
  **/
  @jakarta.annotation.Nullable
  public String getApiGroup() {
    return apiGroup;
  }


  public void setApiGroup(String apiGroup) {
    this.apiGroup = apiGroup;
  }


  public V1alpha2ResourceClaimConsumerReference name(String name) {

    this.name = name;
    return this;
  }

   /**
   * Name is the name of resource being referenced.
   * @return name
  **/
  @jakarta.annotation.Nonnull
  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public V1alpha2ResourceClaimConsumerReference resource(String resource) {

    this.resource = resource;
    return this;
  }

   /**
   * Resource is the type of resource being referenced, for example \&quot;pods\&quot;.
   * @return resource
  **/
  @jakarta.annotation.Nonnull
  public String getResource() {
    return resource;
  }


  public void setResource(String resource) {
    this.resource = resource;
  }


  public V1alpha2ResourceClaimConsumerReference uid(String uid) {

    this.uid = uid;
    return this;
  }

   /**
   * UID identifies exactly one incarnation of the resource.
   * @return uid
  **/
  @jakarta.annotation.Nonnull
  public String getUid() {
    return uid;
  }


  public void setUid(String uid) {
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
    V1alpha2ResourceClaimConsumerReference v1alpha2ResourceClaimConsumerReference = (V1alpha2ResourceClaimConsumerReference) o;
    return Objects.equals(this.apiGroup, v1alpha2ResourceClaimConsumerReference.apiGroup) &&
        Objects.equals(this.name, v1alpha2ResourceClaimConsumerReference.name) &&
        Objects.equals(this.resource, v1alpha2ResourceClaimConsumerReference.resource) &&
        Objects.equals(this.uid, v1alpha2ResourceClaimConsumerReference.uid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(apiGroup, name, resource, uid);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1alpha2ResourceClaimConsumerReference {\n");
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
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to V1alpha2ResourceClaimConsumerReference
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!V1alpha2ResourceClaimConsumerReference.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in V1alpha2ResourceClaimConsumerReference is not found in the empty JSON string", V1alpha2ResourceClaimConsumerReference.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!V1alpha2ResourceClaimConsumerReference.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `V1alpha2ResourceClaimConsumerReference` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : V1alpha2ResourceClaimConsumerReference.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
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
       if (!V1alpha2ResourceClaimConsumerReference.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'V1alpha2ResourceClaimConsumerReference' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<V1alpha2ResourceClaimConsumerReference> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(V1alpha2ResourceClaimConsumerReference.class));

       return (TypeAdapter<T>) new TypeAdapter<V1alpha2ResourceClaimConsumerReference>() {
           @Override
           public void write(JsonWriter out, V1alpha2ResourceClaimConsumerReference value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public V1alpha2ResourceClaimConsumerReference read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of V1alpha2ResourceClaimConsumerReference given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of V1alpha2ResourceClaimConsumerReference
  * @throws IOException if the JSON string is invalid with respect to V1alpha2ResourceClaimConsumerReference
  */
  public static V1alpha2ResourceClaimConsumerReference fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, V1alpha2ResourceClaimConsumerReference.class);
  }

 /**
  * Convert an instance of V1alpha2ResourceClaimConsumerReference to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
