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
 * OwnerReference contains enough information to let you identify an owning object. An owning object must be in the same namespace as the dependent, or be cluster-scoped, so there is no namespace field.
 */
@ApiModel(description = "OwnerReference contains enough information to let you identify an owning object. An owning object must be in the same namespace as the dependent, or be cluster-scoped, so there is no namespace field.")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-09-11T18:00:16.154662Z[Etc/UTC]", comments = "Generator version: 7.13.0")
public class V1OwnerReference {
  public static final String SERIALIZED_NAME_API_VERSION = "apiVersion";
  @SerializedName(SERIALIZED_NAME_API_VERSION)
  @jakarta.annotation.Nonnull
  private String apiVersion;

  public static final String SERIALIZED_NAME_BLOCK_OWNER_DELETION = "blockOwnerDeletion";
  @SerializedName(SERIALIZED_NAME_BLOCK_OWNER_DELETION)
  @jakarta.annotation.Nullable
  private Boolean blockOwnerDeletion;

  public static final String SERIALIZED_NAME_CONTROLLER = "controller";
  @SerializedName(SERIALIZED_NAME_CONTROLLER)
  @jakarta.annotation.Nullable
  private Boolean controller;

  public static final String SERIALIZED_NAME_KIND = "kind";
  @SerializedName(SERIALIZED_NAME_KIND)
  @jakarta.annotation.Nonnull
  private String kind;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  @jakarta.annotation.Nonnull
  private String name;

  public static final String SERIALIZED_NAME_UID = "uid";
  @SerializedName(SERIALIZED_NAME_UID)
  @jakarta.annotation.Nonnull
  private String uid;

  public V1OwnerReference() {
  }

  public V1OwnerReference apiVersion(@jakarta.annotation.Nonnull String apiVersion) {
    this.apiVersion = apiVersion;
    return this;
  }

  /**
   * API version of the referent.
   * @return apiVersion
   */
  @jakarta.annotation.Nonnull
  @ApiModelProperty(required = true, value = "API version of the referent.")
  public String getApiVersion() {
    return apiVersion;
  }

  public void setApiVersion(@jakarta.annotation.Nonnull String apiVersion) {
    this.apiVersion = apiVersion;
  }


  public V1OwnerReference blockOwnerDeletion(@jakarta.annotation.Nullable Boolean blockOwnerDeletion) {
    this.blockOwnerDeletion = blockOwnerDeletion;
    return this;
  }

  /**
   * If true, AND if the owner has the \&quot;foregroundDeletion\&quot; finalizer, then the owner cannot be deleted from the key-value store until this reference is removed. See https://kubernetes.io/docs/concepts/architecture/garbage-collection/#foreground-deletion for how the garbage collector interacts with this field and enforces the foreground deletion. Defaults to false. To set this field, a user needs \&quot;delete\&quot; permission of the owner, otherwise 422 (Unprocessable Entity) will be returned.
   * @return blockOwnerDeletion
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "If true, AND if the owner has the \"foregroundDeletion\" finalizer, then the owner cannot be deleted from the key-value store until this reference is removed. See https://kubernetes.io/docs/concepts/architecture/garbage-collection/#foreground-deletion for how the garbage collector interacts with this field and enforces the foreground deletion. Defaults to false. To set this field, a user needs \"delete\" permission of the owner, otherwise 422 (Unprocessable Entity) will be returned.")
  public Boolean getBlockOwnerDeletion() {
    return blockOwnerDeletion;
  }

  public void setBlockOwnerDeletion(@jakarta.annotation.Nullable Boolean blockOwnerDeletion) {
    this.blockOwnerDeletion = blockOwnerDeletion;
  }


  public V1OwnerReference controller(@jakarta.annotation.Nullable Boolean controller) {
    this.controller = controller;
    return this;
  }

  /**
   * If true, this reference points to the managing controller.
   * @return controller
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "If true, this reference points to the managing controller.")
  public Boolean getController() {
    return controller;
  }

  public void setController(@jakarta.annotation.Nullable Boolean controller) {
    this.controller = controller;
  }


  public V1OwnerReference kind(@jakarta.annotation.Nonnull String kind) {
    this.kind = kind;
    return this;
  }

  /**
   * Kind of the referent. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
   * @return kind
   */
  @jakarta.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Kind of the referent. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds")
  public String getKind() {
    return kind;
  }

  public void setKind(@jakarta.annotation.Nonnull String kind) {
    this.kind = kind;
  }


  public V1OwnerReference name(@jakarta.annotation.Nonnull String name) {
    this.name = name;
    return this;
  }

  /**
   * Name of the referent. More info: https://kubernetes.io/docs/concepts/overview/working-with-objects/names#names
   * @return name
   */
  @jakarta.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Name of the referent. More info: https://kubernetes.io/docs/concepts/overview/working-with-objects/names#names")
  public String getName() {
    return name;
  }

  public void setName(@jakarta.annotation.Nonnull String name) {
    this.name = name;
  }


  public V1OwnerReference uid(@jakarta.annotation.Nonnull String uid) {
    this.uid = uid;
    return this;
  }

  /**
   * UID of the referent. More info: https://kubernetes.io/docs/concepts/overview/working-with-objects/names#uids
   * @return uid
   */
  @jakarta.annotation.Nonnull
  @ApiModelProperty(required = true, value = "UID of the referent. More info: https://kubernetes.io/docs/concepts/overview/working-with-objects/names#uids")
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
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to V1OwnerReference
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!V1OwnerReference.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in V1OwnerReference is not found in the empty JSON string", V1OwnerReference.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!V1OwnerReference.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `V1OwnerReference` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : V1OwnerReference.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
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
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
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
