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
 * Subject contains a reference to the object or user identities a role binding applies to.  This can either hold a direct API object reference, or a value for non-objects such as user and group names.
 */
@ApiModel(description = "Subject contains a reference to the object or user identities a role binding applies to.  This can either hold a direct API object reference, or a value for non-objects such as user and group names.")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-09-11T18:00:16.154662Z[Etc/UTC]", comments = "Generator version: 7.13.0")
public class RbacV1Subject {
  public static final String SERIALIZED_NAME_API_GROUP = "apiGroup";
  @SerializedName(SERIALIZED_NAME_API_GROUP)
  @jakarta.annotation.Nullable
  private String apiGroup;

  public static final String SERIALIZED_NAME_KIND = "kind";
  @SerializedName(SERIALIZED_NAME_KIND)
  @jakarta.annotation.Nonnull
  private String kind;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  @jakarta.annotation.Nonnull
  private String name;

  public static final String SERIALIZED_NAME_NAMESPACE = "namespace";
  @SerializedName(SERIALIZED_NAME_NAMESPACE)
  @jakarta.annotation.Nullable
  private String namespace;

  public RbacV1Subject() {
  }

  public RbacV1Subject apiGroup(@jakarta.annotation.Nullable String apiGroup) {
    this.apiGroup = apiGroup;
    return this;
  }

  /**
   * APIGroup holds the API group of the referenced subject. Defaults to \&quot;\&quot; for ServiceAccount subjects. Defaults to \&quot;rbac.authorization.k8s.io\&quot; for User and Group subjects.
   * @return apiGroup
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "APIGroup holds the API group of the referenced subject. Defaults to \"\" for ServiceAccount subjects. Defaults to \"rbac.authorization.k8s.io\" for User and Group subjects.")
  public String getApiGroup() {
    return apiGroup;
  }

  public void setApiGroup(@jakarta.annotation.Nullable String apiGroup) {
    this.apiGroup = apiGroup;
  }


  public RbacV1Subject kind(@jakarta.annotation.Nonnull String kind) {
    this.kind = kind;
    return this;
  }

  /**
   * Kind of object being referenced. Values defined by this API group are \&quot;User\&quot;, \&quot;Group\&quot;, and \&quot;ServiceAccount\&quot;. If the Authorizer does not recognized the kind value, the Authorizer should report an error.
   * @return kind
   */
  @jakarta.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Kind of object being referenced. Values defined by this API group are \"User\", \"Group\", and \"ServiceAccount\". If the Authorizer does not recognized the kind value, the Authorizer should report an error.")
  public String getKind() {
    return kind;
  }

  public void setKind(@jakarta.annotation.Nonnull String kind) {
    this.kind = kind;
  }


  public RbacV1Subject name(@jakarta.annotation.Nonnull String name) {
    this.name = name;
    return this;
  }

  /**
   * Name of the object being referenced.
   * @return name
   */
  @jakarta.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Name of the object being referenced.")
  public String getName() {
    return name;
  }

  public void setName(@jakarta.annotation.Nonnull String name) {
    this.name = name;
  }


  public RbacV1Subject namespace(@jakarta.annotation.Nullable String namespace) {
    this.namespace = namespace;
    return this;
  }

  /**
   * Namespace of the referenced object.  If the object kind is non-namespace, such as \&quot;User\&quot; or \&quot;Group\&quot;, and this value is not empty the Authorizer should report an error.
   * @return namespace
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "Namespace of the referenced object.  If the object kind is non-namespace, such as \"User\" or \"Group\", and this value is not empty the Authorizer should report an error.")
  public String getNamespace() {
    return namespace;
  }

  public void setNamespace(@jakarta.annotation.Nullable String namespace) {
    this.namespace = namespace;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RbacV1Subject rbacV1Subject = (RbacV1Subject) o;
    return Objects.equals(this.apiGroup, rbacV1Subject.apiGroup) &&
        Objects.equals(this.kind, rbacV1Subject.kind) &&
        Objects.equals(this.name, rbacV1Subject.name) &&
        Objects.equals(this.namespace, rbacV1Subject.namespace);
  }

  @Override
  public int hashCode() {
    return Objects.hash(apiGroup, kind, name, namespace);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RbacV1Subject {\n");
    sb.append("    apiGroup: ").append(toIndentedString(apiGroup)).append("\n");
    sb.append("    kind: ").append(toIndentedString(kind)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    namespace: ").append(toIndentedString(namespace)).append("\n");
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
    openapiFields.add("kind");
    openapiFields.add("name");
    openapiFields.add("namespace");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("kind");
    openapiRequiredFields.add("name");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to RbacV1Subject
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!RbacV1Subject.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in RbacV1Subject is not found in the empty JSON string", RbacV1Subject.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!RbacV1Subject.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `RbacV1Subject` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : RbacV1Subject.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("apiGroup") != null && !jsonObj.get("apiGroup").isJsonNull()) && !jsonObj.get("apiGroup").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `apiGroup` to be a primitive type in the JSON string but got `%s`", jsonObj.get("apiGroup").toString()));
      }
      if (!jsonObj.get("kind").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `kind` to be a primitive type in the JSON string but got `%s`", jsonObj.get("kind").toString()));
      }
      if (!jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if ((jsonObj.get("namespace") != null && !jsonObj.get("namespace").isJsonNull()) && !jsonObj.get("namespace").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `namespace` to be a primitive type in the JSON string but got `%s`", jsonObj.get("namespace").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!RbacV1Subject.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'RbacV1Subject' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<RbacV1Subject> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(RbacV1Subject.class));

       return (TypeAdapter<T>) new TypeAdapter<RbacV1Subject>() {
           @Override
           public void write(JsonWriter out, RbacV1Subject value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public RbacV1Subject read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of RbacV1Subject given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of RbacV1Subject
   * @throws IOException if the JSON string is invalid with respect to RbacV1Subject
   */
  public static RbacV1Subject fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, RbacV1Subject.class);
  }

  /**
   * Convert an instance of RbacV1Subject to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
