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
 * OwnerReference contains enough information to let you identify an owning object. An owning object must be in the same namespace as the dependent, or be cluster-scoped, so there is no namespace field.
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-23T13:45:09.091597Z[Etc/UTC]")
public class V1OwnerReference {
  public static final String SERIALIZED_NAME_API_VERSION = "apiVersion";
  @SerializedName(SERIALIZED_NAME_API_VERSION)
  private String apiVersion;

  public static final String SERIALIZED_NAME_BLOCK_OWNER_DELETION = "blockOwnerDeletion";
  @SerializedName(SERIALIZED_NAME_BLOCK_OWNER_DELETION)
  private Boolean blockOwnerDeletion;

  public static final String SERIALIZED_NAME_CONTROLLER = "controller";
  @SerializedName(SERIALIZED_NAME_CONTROLLER)
  private Boolean controller;

  public static final String SERIALIZED_NAME_KIND = "kind";
  @SerializedName(SERIALIZED_NAME_KIND)
  private String kind;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_UID = "uid";
  @SerializedName(SERIALIZED_NAME_UID)
  private String uid;

  public V1OwnerReference() {
  }

  public V1OwnerReference apiVersion(String apiVersion) {

    this.apiVersion = apiVersion;
    return this;
  }

   /**
   * API version of the referent.
   * @return apiVersion
  **/
  @jakarta.annotation.Nonnull
  public String getApiVersion() {
    return apiVersion;
  }


  public void setApiVersion(String apiVersion) {
    this.apiVersion = apiVersion;
  }


  public V1OwnerReference blockOwnerDeletion(Boolean blockOwnerDeletion) {

    this.blockOwnerDeletion = blockOwnerDeletion;
    return this;
  }

   /**
   * If true, AND if the owner has the \&quot;foregroundDeletion\&quot; finalizer, then the owner cannot be deleted from the key-value store until this reference is removed. See https://kubernetes.io/docs/concepts/architecture/garbage-collection/#foreground-deletion for how the garbage collector interacts with this field and enforces the foreground deletion. Defaults to false. To set this field, a user needs \&quot;delete\&quot; permission of the owner, otherwise 422 (Unprocessable Entity) will be returned.
   * @return blockOwnerDeletion
  **/
  @jakarta.annotation.Nullable
  public Boolean getBlockOwnerDeletion() {
    return blockOwnerDeletion;
  }


  public void setBlockOwnerDeletion(Boolean blockOwnerDeletion) {
    this.blockOwnerDeletion = blockOwnerDeletion;
  }


  public V1OwnerReference controller(Boolean controller) {

    this.controller = controller;
    return this;
  }

   /**
   * If true, this reference points to the managing controller.
   * @return controller
  **/
  @jakarta.annotation.Nullable
  public Boolean getController() {
    return controller;
  }


  public void setController(Boolean controller) {
    this.controller = controller;
  }


  public V1OwnerReference kind(String kind) {

    this.kind = kind;
    return this;
  }

   /**
   * Kind of the referent. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
   * @return kind
  **/
  @jakarta.annotation.Nonnull
  public String getKind() {
    return kind;
  }


  public void setKind(String kind) {
    this.kind = kind;
  }


  public V1OwnerReference name(String name) {

    this.name = name;
    return this;
  }

   /**
   * Name of the referent. More info: https://kubernetes.io/docs/concepts/overview/working-with-objects/names#names
   * @return name
  **/
  @jakarta.annotation.Nonnull
  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public V1OwnerReference uid(String uid) {

    this.uid = uid;
    return this;
  }

   /**
   * UID of the referent. More info: https://kubernetes.io/docs/concepts/overview/working-with-objects/names#uids
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
    V1OwnerReference v1OwnerReference = (V1OwnerReference) o;
    return Objects.equals(this.apiVersion, v1OwnerReference.apiVersion) &&
        Objects.equals(this.blockOwnerDeletion, v1OwnerReference.blockOwnerDeletion) &&
        Objects.equals(this.controller, v1OwnerReference.controller) &&
        Objects.equals(this.kind, v1OwnerReference.kind) &&
        Objects.equals(this.name, v1OwnerReference.name) &&
        Objects.equals(this.uid, v1OwnerReference.uid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(apiVersion, blockOwnerDeletion, controller, kind, name, uid);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1OwnerReference {\n");
    sb.append("    apiVersion: ").append(toIndentedString(apiVersion)).append("\n");
    sb.append("    blockOwnerDeletion: ").append(toIndentedString(blockOwnerDeletion)).append("\n");
    sb.append("    controller: ").append(toIndentedString(controller)).append("\n");
    sb.append("    kind: ").append(toIndentedString(kind)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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
    openapiFields.add("apiVersion");
    openapiFields.add("blockOwnerDeletion");
    openapiFields.add("controller");
    openapiFields.add("kind");
    openapiFields.add("name");
    openapiFields.add("uid");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("apiVersion");
    openapiRequiredFields.add("kind");
    openapiRequiredFields.add("name");
    openapiRequiredFields.add("uid");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to V1OwnerReference
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!V1OwnerReference.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in V1OwnerReference is not found in the empty JSON string", V1OwnerReference.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!V1OwnerReference.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `V1OwnerReference` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : V1OwnerReference.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("apiVersion").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `apiVersion` to be a primitive type in the JSON string but got `%s`", jsonObj.get("apiVersion").toString()));
      }
      if (!jsonObj.get("kind").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `kind` to be a primitive type in the JSON string but got `%s`", jsonObj.get("kind").toString()));
      }
      if (!jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if (!jsonObj.get("uid").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `uid` to be a primitive type in the JSON string but got `%s`", jsonObj.get("uid").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!V1OwnerReference.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'V1OwnerReference' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<V1OwnerReference> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(V1OwnerReference.class));

       return (TypeAdapter<T>) new TypeAdapter<V1OwnerReference>() {
           @Override
           public void write(JsonWriter out, V1OwnerReference value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public V1OwnerReference read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of V1OwnerReference given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of V1OwnerReference
  * @throws IOException if the JSON string is invalid with respect to V1OwnerReference
  */
  public static V1OwnerReference fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, V1OwnerReference.class);
  }

 /**
  * Convert an instance of V1OwnerReference to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
