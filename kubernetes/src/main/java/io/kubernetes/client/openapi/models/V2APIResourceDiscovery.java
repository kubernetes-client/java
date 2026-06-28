/*
Copyright 2026 The Kubernetes Authors.
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
import io.kubernetes.client.openapi.models.V1GroupVersionKind;
import io.kubernetes.client.openapi.models.V2APISubresourceDiscovery;
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
 * APIResourceDiscovery provides information about an API resource for discovery.
 */
@ApiModel(description = "APIResourceDiscovery provides information about an API resource for discovery.")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2026-06-26T22:35:15.319369Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class V2APIResourceDiscovery {
  public static final String SERIALIZED_NAME_RESOURCE = "resource";
  @SerializedName(SERIALIZED_NAME_RESOURCE)
  @jakarta.annotation.Nonnull
  private String resource;

  public static final String SERIALIZED_NAME_RESPONSE_KIND = "responseKind";
  @SerializedName(SERIALIZED_NAME_RESPONSE_KIND)
  @jakarta.annotation.Nullable
  private V1GroupVersionKind responseKind;

  public static final String SERIALIZED_NAME_SCOPE = "scope";
  @SerializedName(SERIALIZED_NAME_SCOPE)
  @jakarta.annotation.Nonnull
  private String scope;

  public static final String SERIALIZED_NAME_SINGULAR_RESOURCE = "singularResource";
  @SerializedName(SERIALIZED_NAME_SINGULAR_RESOURCE)
  @jakarta.annotation.Nonnull
  private String singularResource;

  public static final String SERIALIZED_NAME_VERBS = "verbs";
  @SerializedName(SERIALIZED_NAME_VERBS)
  @jakarta.annotation.Nonnull
  private List<String> verbs = new ArrayList<>();

  public static final String SERIALIZED_NAME_SHORT_NAMES = "shortNames";
  @SerializedName(SERIALIZED_NAME_SHORT_NAMES)
  @jakarta.annotation.Nullable
  private List<String> shortNames = new ArrayList<>();

  public static final String SERIALIZED_NAME_CATEGORIES = "categories";
  @SerializedName(SERIALIZED_NAME_CATEGORIES)
  @jakarta.annotation.Nullable
  private List<String> categories = new ArrayList<>();

  public static final String SERIALIZED_NAME_SUBRESOURCES = "subresources";
  @SerializedName(SERIALIZED_NAME_SUBRESOURCES)
  @jakarta.annotation.Nullable
  private List<V2APISubresourceDiscovery> subresources = new ArrayList<>();

  public V2APIResourceDiscovery() {
  }

  public V2APIResourceDiscovery resource(@jakarta.annotation.Nonnull String resource) {
    this.resource = resource;
    return this;
  }

  /**
   * resource is the plural name of the resource.
   * @return resource
   */
  @jakarta.annotation.Nonnull
  @ApiModelProperty(required = true, value = "resource is the plural name of the resource.")
  public String getResource() {
    return resource;
  }

  public void setResource(@jakarta.annotation.Nonnull String resource) {
    this.resource = resource;
  }


  public V2APIResourceDiscovery responseKind(@jakarta.annotation.Nullable V1GroupVersionKind responseKind) {
    this.responseKind = responseKind;
    return this;
  }

  /**
   * Get responseKind
   * @return responseKind
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  public V1GroupVersionKind getResponseKind() {
    return responseKind;
  }

  public void setResponseKind(@jakarta.annotation.Nullable V1GroupVersionKind responseKind) {
    this.responseKind = responseKind;
  }


  public V2APIResourceDiscovery scope(@jakarta.annotation.Nonnull String scope) {
    this.scope = scope;
    return this;
  }

  /**
   * scope indicates the scope of a resource, either Cluster or Namespaced
   * @return scope
   */
  @jakarta.annotation.Nonnull
  @ApiModelProperty(required = true, value = "scope indicates the scope of a resource, either Cluster or Namespaced")
  public String getScope() {
    return scope;
  }

  public void setScope(@jakarta.annotation.Nonnull String scope) {
    this.scope = scope;
  }


  public V2APIResourceDiscovery singularResource(@jakarta.annotation.Nonnull String singularResource) {
    this.singularResource = singularResource;
    return this;
  }

  /**
   * singularResource is the singular name of the resource.
   * @return singularResource
   */
  @jakarta.annotation.Nonnull
  @ApiModelProperty(required = true, value = "singularResource is the singular name of the resource.")
  public String getSingularResource() {
    return singularResource;
  }

  public void setSingularResource(@jakarta.annotation.Nonnull String singularResource) {
    this.singularResource = singularResource;
  }


  public V2APIResourceDiscovery verbs(@jakarta.annotation.Nonnull List<String> verbs) {
    this.verbs = verbs;
    return this;
  }

  public V2APIResourceDiscovery addVerbsItem(String verbsItem) {
    if (this.verbs == null) {
      this.verbs = new ArrayList<>();
    }
    this.verbs.add(verbsItem);
    return this;
  }

  /**
   * verbs is a list of supported API operation types
   * @return verbs
   */
  @jakarta.annotation.Nonnull
  @ApiModelProperty(required = true, value = "verbs is a list of supported API operation types")
  public List<String> getVerbs() {
    return verbs;
  }

  public void setVerbs(@jakarta.annotation.Nonnull List<String> verbs) {
    this.verbs = verbs;
  }


  public V2APIResourceDiscovery shortNames(@jakarta.annotation.Nullable List<String> shortNames) {
    this.shortNames = shortNames;
    return this;
  }

  public V2APIResourceDiscovery addShortNamesItem(String shortNamesItem) {
    if (this.shortNames == null) {
      this.shortNames = new ArrayList<>();
    }
    this.shortNames.add(shortNamesItem);
    return this;
  }

  /**
   * shortNames is a list of suggested short names of the resource.
   * @return shortNames
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "shortNames is a list of suggested short names of the resource.")
  public List<String> getShortNames() {
    return shortNames;
  }

  public void setShortNames(@jakarta.annotation.Nullable List<String> shortNames) {
    this.shortNames = shortNames;
  }


  public V2APIResourceDiscovery categories(@jakarta.annotation.Nullable List<String> categories) {
    this.categories = categories;
    return this;
  }

  public V2APIResourceDiscovery addCategoriesItem(String categoriesItem) {
    if (this.categories == null) {
      this.categories = new ArrayList<>();
    }
    this.categories.add(categoriesItem);
    return this;
  }

  /**
   * categories is a list of the grouped resources this resource belongs to.
   * @return categories
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "categories is a list of the grouped resources this resource belongs to.")
  public List<String> getCategories() {
    return categories;
  }

  public void setCategories(@jakarta.annotation.Nullable List<String> categories) {
    this.categories = categories;
  }


  public V2APIResourceDiscovery subresources(@jakarta.annotation.Nullable List<V2APISubresourceDiscovery> subresources) {
    this.subresources = subresources;
    return this;
  }

  public V2APIResourceDiscovery addSubresourcesItem(V2APISubresourceDiscovery subresourcesItem) {
    if (this.subresources == null) {
      this.subresources = new ArrayList<>();
    }
    this.subresources.add(subresourcesItem);
    return this;
  }

  /**
   * Get subresources
   * @return subresources
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  public List<V2APISubresourceDiscovery> getSubresources() {
    return subresources;
  }

  public void setSubresources(@jakarta.annotation.Nullable List<V2APISubresourceDiscovery> subresources) {
    this.subresources = subresources;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V2APIResourceDiscovery v2APIResourceDiscovery = (V2APIResourceDiscovery) o;
    return Objects.equals(this.resource, v2APIResourceDiscovery.resource) &&
        Objects.equals(this.responseKind, v2APIResourceDiscovery.responseKind) &&
        Objects.equals(this.scope, v2APIResourceDiscovery.scope) &&
        Objects.equals(this.singularResource, v2APIResourceDiscovery.singularResource) &&
        Objects.equals(this.verbs, v2APIResourceDiscovery.verbs) &&
        Objects.equals(this.shortNames, v2APIResourceDiscovery.shortNames) &&
        Objects.equals(this.categories, v2APIResourceDiscovery.categories) &&
        Objects.equals(this.subresources, v2APIResourceDiscovery.subresources);
  }

  @Override
  public int hashCode() {
    return Objects.hash(resource, responseKind, scope, singularResource, verbs, shortNames, categories, subresources);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V2APIResourceDiscovery {\n");
    sb.append("    resource: ").append(toIndentedString(resource)).append("\n");
    sb.append("    responseKind: ").append(toIndentedString(responseKind)).append("\n");
    sb.append("    scope: ").append(toIndentedString(scope)).append("\n");
    sb.append("    singularResource: ").append(toIndentedString(singularResource)).append("\n");
    sb.append("    verbs: ").append(toIndentedString(verbs)).append("\n");
    sb.append("    shortNames: ").append(toIndentedString(shortNames)).append("\n");
    sb.append("    categories: ").append(toIndentedString(categories)).append("\n");
    sb.append("    subresources: ").append(toIndentedString(subresources)).append("\n");
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
    openapiFields = new HashSet<String>(Arrays.asList("resource", "responseKind", "scope", "singularResource", "verbs", "shortNames", "categories", "subresources"));

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>(Arrays.asList("resource", "scope", "singularResource", "verbs"));
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to V2APIResourceDiscovery
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!V2APIResourceDiscovery.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format(java.util.Locale.ROOT, "The required field(s) %s in V2APIResourceDiscovery is not found in the empty JSON string", V2APIResourceDiscovery.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!V2APIResourceDiscovery.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format(java.util.Locale.ROOT, "The field `%s` in the JSON string is not defined in the `V2APIResourceDiscovery` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : V2APIResourceDiscovery.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format(java.util.Locale.ROOT, "The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("resource").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format(java.util.Locale.ROOT, "Expected the field `resource` to be a primitive type in the JSON string but got `%s`", jsonObj.get("resource").toString()));
      }
      // validate the optional field `responseKind`
      if (jsonObj.get("responseKind") != null && !jsonObj.get("responseKind").isJsonNull()) {
        V1GroupVersionKind.validateJsonElement(jsonObj.get("responseKind"));
      }
      if (!jsonObj.get("scope").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format(java.util.Locale.ROOT, "Expected the field `scope` to be a primitive type in the JSON string but got `%s`", jsonObj.get("scope").toString()));
      }
      if (!jsonObj.get("singularResource").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format(java.util.Locale.ROOT, "Expected the field `singularResource` to be a primitive type in the JSON string but got `%s`", jsonObj.get("singularResource").toString()));
      }
      // ensure the required json array is present
      if (jsonObj.get("verbs") == null) {
        throw new IllegalArgumentException("Expected the field `linkedContent` to be an array in the JSON string but got `null`");
      } else if (!jsonObj.get("verbs").isJsonArray()) {
        throw new IllegalArgumentException(String.format(java.util.Locale.ROOT, "Expected the field `verbs` to be an array in the JSON string but got `%s`", jsonObj.get("verbs").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("shortNames") != null && !jsonObj.get("shortNames").isJsonNull() && !jsonObj.get("shortNames").isJsonArray()) {
        throw new IllegalArgumentException(String.format(java.util.Locale.ROOT, "Expected the field `shortNames` to be an array in the JSON string but got `%s`", jsonObj.get("shortNames").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("categories") != null && !jsonObj.get("categories").isJsonNull() && !jsonObj.get("categories").isJsonArray()) {
        throw new IllegalArgumentException(String.format(java.util.Locale.ROOT, "Expected the field `categories` to be an array in the JSON string but got `%s`", jsonObj.get("categories").toString()));
      }
      if (jsonObj.get("subresources") != null && !jsonObj.get("subresources").isJsonNull()) {
        JsonArray jsonArraysubresources = jsonObj.getAsJsonArray("subresources");
        if (jsonArraysubresources != null) {
          // ensure the json data is an array
          if (!jsonObj.get("subresources").isJsonArray()) {
            throw new IllegalArgumentException(String.format(java.util.Locale.ROOT, "Expected the field `subresources` to be an array in the JSON string but got `%s`", jsonObj.get("subresources").toString()));
          }

          // validate the optional field `subresources` (array)
          for (int i = 0; i < jsonArraysubresources.size(); i++) {
            V2APISubresourceDiscovery.validateJsonElement(jsonArraysubresources.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!V2APIResourceDiscovery.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'V2APIResourceDiscovery' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<V2APIResourceDiscovery> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(V2APIResourceDiscovery.class));

       return (TypeAdapter<T>) new TypeAdapter<V2APIResourceDiscovery>() {
           @Override
           public void write(JsonWriter out, V2APIResourceDiscovery value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public V2APIResourceDiscovery read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of V2APIResourceDiscovery given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of V2APIResourceDiscovery
   * @throws IOException if the JSON string is invalid with respect to V2APIResourceDiscovery
   */
  public static V2APIResourceDiscovery fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, V2APIResourceDiscovery.class);
  }

  /**
   * Convert an instance of V2APIResourceDiscovery to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
