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
import io.kubernetes.client.openapi.models.V1NonResourceAttributes;
import io.kubernetes.client.openapi.models.V1ResourceAttributes;
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
 * SelfSubjectAccessReviewSpec is a description of the access request.  Exactly one of ResourceAuthorizationAttributes and NonResourceAuthorizationAttributes must be set
 */
@ApiModel(description = "SelfSubjectAccessReviewSpec is a description of the access request.  Exactly one of ResourceAuthorizationAttributes and NonResourceAuthorizationAttributes must be set")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-09-11T18:00:16.154662Z[Etc/UTC]", comments = "Generator version: 7.13.0")
public class V1SelfSubjectAccessReviewSpec {
  public static final String SERIALIZED_NAME_NON_RESOURCE_ATTRIBUTES = "nonResourceAttributes";
  @SerializedName(SERIALIZED_NAME_NON_RESOURCE_ATTRIBUTES)
  @jakarta.annotation.Nullable
  private V1NonResourceAttributes nonResourceAttributes;

  public static final String SERIALIZED_NAME_RESOURCE_ATTRIBUTES = "resourceAttributes";
  @SerializedName(SERIALIZED_NAME_RESOURCE_ATTRIBUTES)
  @jakarta.annotation.Nullable
  private V1ResourceAttributes resourceAttributes;

  public V1SelfSubjectAccessReviewSpec() {
  }

  public V1SelfSubjectAccessReviewSpec nonResourceAttributes(@jakarta.annotation.Nullable V1NonResourceAttributes nonResourceAttributes) {
    this.nonResourceAttributes = nonResourceAttributes;
    return this;
  }

  /**
   * Get nonResourceAttributes
   * @return nonResourceAttributes
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  public V1NonResourceAttributes getNonResourceAttributes() {
    return nonResourceAttributes;
  }

  public void setNonResourceAttributes(@jakarta.annotation.Nullable V1NonResourceAttributes nonResourceAttributes) {
    this.nonResourceAttributes = nonResourceAttributes;
  }


  public V1SelfSubjectAccessReviewSpec resourceAttributes(@jakarta.annotation.Nullable V1ResourceAttributes resourceAttributes) {
    this.resourceAttributes = resourceAttributes;
    return this;
  }

  /**
   * Get resourceAttributes
   * @return resourceAttributes
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  public V1ResourceAttributes getResourceAttributes() {
    return resourceAttributes;
  }

  public void setResourceAttributes(@jakarta.annotation.Nullable V1ResourceAttributes resourceAttributes) {
    this.resourceAttributes = resourceAttributes;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1SelfSubjectAccessReviewSpec v1SelfSubjectAccessReviewSpec = (V1SelfSubjectAccessReviewSpec) o;
    return Objects.equals(this.nonResourceAttributes, v1SelfSubjectAccessReviewSpec.nonResourceAttributes) &&
        Objects.equals(this.resourceAttributes, v1SelfSubjectAccessReviewSpec.resourceAttributes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nonResourceAttributes, resourceAttributes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1SelfSubjectAccessReviewSpec {\n");
    sb.append("    nonResourceAttributes: ").append(toIndentedString(nonResourceAttributes)).append("\n");
    sb.append("    resourceAttributes: ").append(toIndentedString(resourceAttributes)).append("\n");
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
    openapiFields.add("nonResourceAttributes");
    openapiFields.add("resourceAttributes");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to V1SelfSubjectAccessReviewSpec
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!V1SelfSubjectAccessReviewSpec.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in V1SelfSubjectAccessReviewSpec is not found in the empty JSON string", V1SelfSubjectAccessReviewSpec.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!V1SelfSubjectAccessReviewSpec.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `V1SelfSubjectAccessReviewSpec` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `nonResourceAttributes`
      if (jsonObj.get("nonResourceAttributes") != null && !jsonObj.get("nonResourceAttributes").isJsonNull()) {
        V1NonResourceAttributes.validateJsonElement(jsonObj.get("nonResourceAttributes"));
      }
      // validate the optional field `resourceAttributes`
      if (jsonObj.get("resourceAttributes") != null && !jsonObj.get("resourceAttributes").isJsonNull()) {
        V1ResourceAttributes.validateJsonElement(jsonObj.get("resourceAttributes"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!V1SelfSubjectAccessReviewSpec.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'V1SelfSubjectAccessReviewSpec' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<V1SelfSubjectAccessReviewSpec> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(V1SelfSubjectAccessReviewSpec.class));

       return (TypeAdapter<T>) new TypeAdapter<V1SelfSubjectAccessReviewSpec>() {
           @Override
           public void write(JsonWriter out, V1SelfSubjectAccessReviewSpec value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public V1SelfSubjectAccessReviewSpec read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of V1SelfSubjectAccessReviewSpec given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of V1SelfSubjectAccessReviewSpec
   * @throws IOException if the JSON string is invalid with respect to V1SelfSubjectAccessReviewSpec
   */
  public static V1SelfSubjectAccessReviewSpec fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, V1SelfSubjectAccessReviewSpec.class);
  }

  /**
   * Convert an instance of V1SelfSubjectAccessReviewSpec to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
