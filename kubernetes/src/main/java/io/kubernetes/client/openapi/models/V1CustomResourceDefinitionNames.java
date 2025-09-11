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
 * CustomResourceDefinitionNames indicates the names to serve this CustomResourceDefinition
 */
@ApiModel(description = "CustomResourceDefinitionNames indicates the names to serve this CustomResourceDefinition")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-09-11T18:00:16.154662Z[Etc/UTC]", comments = "Generator version: 7.13.0")
public class V1CustomResourceDefinitionNames {
  public static final String SERIALIZED_NAME_CATEGORIES = "categories";
  @SerializedName(SERIALIZED_NAME_CATEGORIES)
  @jakarta.annotation.Nullable
  private List<String> categories = new ArrayList<>();

  public static final String SERIALIZED_NAME_KIND = "kind";
  @SerializedName(SERIALIZED_NAME_KIND)
  @jakarta.annotation.Nonnull
  private String kind;

  public static final String SERIALIZED_NAME_LIST_KIND = "listKind";
  @SerializedName(SERIALIZED_NAME_LIST_KIND)
  @jakarta.annotation.Nullable
  private String listKind;

  public static final String SERIALIZED_NAME_PLURAL = "plural";
  @SerializedName(SERIALIZED_NAME_PLURAL)
  @jakarta.annotation.Nonnull
  private String plural;

  public static final String SERIALIZED_NAME_SHORT_NAMES = "shortNames";
  @SerializedName(SERIALIZED_NAME_SHORT_NAMES)
  @jakarta.annotation.Nullable
  private List<String> shortNames = new ArrayList<>();

  public static final String SERIALIZED_NAME_SINGULAR = "singular";
  @SerializedName(SERIALIZED_NAME_SINGULAR)
  @jakarta.annotation.Nullable
  private String singular;

  public V1CustomResourceDefinitionNames() {
  }

  public V1CustomResourceDefinitionNames categories(@jakarta.annotation.Nullable List<String> categories) {
    this.categories = categories;
    return this;
  }

  public V1CustomResourceDefinitionNames addCategoriesItem(String categoriesItem) {
    if (this.categories == null) {
      this.categories = new ArrayList<>();
    }
    this.categories.add(categoriesItem);
    return this;
  }

  /**
   * categories is a list of grouped resources this custom resource belongs to (e.g. &#39;all&#39;). This is published in API discovery documents, and used by clients to support invocations like &#x60;kubectl get all&#x60;.
   * @return categories
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "categories is a list of grouped resources this custom resource belongs to (e.g. 'all'). This is published in API discovery documents, and used by clients to support invocations like `kubectl get all`.")
  public List<String> getCategories() {
    return categories;
  }

  public void setCategories(@jakarta.annotation.Nullable List<String> categories) {
    this.categories = categories;
  }


  public V1CustomResourceDefinitionNames kind(@jakarta.annotation.Nonnull String kind) {
    this.kind = kind;
    return this;
  }

  /**
   * kind is the serialized kind of the resource. It is normally CamelCase and singular. Custom resource instances will use this value as the &#x60;kind&#x60; attribute in API calls.
   * @return kind
   */
  @jakarta.annotation.Nonnull
  @ApiModelProperty(required = true, value = "kind is the serialized kind of the resource. It is normally CamelCase and singular. Custom resource instances will use this value as the `kind` attribute in API calls.")
  public String getKind() {
    return kind;
  }

  public void setKind(@jakarta.annotation.Nonnull String kind) {
    this.kind = kind;
  }


  public V1CustomResourceDefinitionNames listKind(@jakarta.annotation.Nullable String listKind) {
    this.listKind = listKind;
    return this;
  }

  /**
   * listKind is the serialized kind of the list for this resource. Defaults to \&quot;&#x60;kind&#x60;List\&quot;.
   * @return listKind
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "listKind is the serialized kind of the list for this resource. Defaults to \"`kind`List\".")
  public String getListKind() {
    return listKind;
  }

  public void setListKind(@jakarta.annotation.Nullable String listKind) {
    this.listKind = listKind;
  }


  public V1CustomResourceDefinitionNames plural(@jakarta.annotation.Nonnull String plural) {
    this.plural = plural;
    return this;
  }

  /**
   * plural is the plural name of the resource to serve. The custom resources are served under &#x60;/apis/&lt;group&gt;/&lt;version&gt;/.../&lt;plural&gt;&#x60;. Must match the name of the CustomResourceDefinition (in the form &#x60;&lt;names.plural&gt;.&lt;group&gt;&#x60;). Must be all lowercase.
   * @return plural
   */
  @jakarta.annotation.Nonnull
  @ApiModelProperty(required = true, value = "plural is the plural name of the resource to serve. The custom resources are served under `/apis/<group>/<version>/.../<plural>`. Must match the name of the CustomResourceDefinition (in the form `<names.plural>.<group>`). Must be all lowercase.")
  public String getPlural() {
    return plural;
  }

  public void setPlural(@jakarta.annotation.Nonnull String plural) {
    this.plural = plural;
  }


  public V1CustomResourceDefinitionNames shortNames(@jakarta.annotation.Nullable List<String> shortNames) {
    this.shortNames = shortNames;
    return this;
  }

  public V1CustomResourceDefinitionNames addShortNamesItem(String shortNamesItem) {
    if (this.shortNames == null) {
      this.shortNames = new ArrayList<>();
    }
    this.shortNames.add(shortNamesItem);
    return this;
  }

  /**
   * shortNames are short names for the resource, exposed in API discovery documents, and used by clients to support invocations like &#x60;kubectl get &lt;shortname&gt;&#x60;. It must be all lowercase.
   * @return shortNames
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "shortNames are short names for the resource, exposed in API discovery documents, and used by clients to support invocations like `kubectl get <shortname>`. It must be all lowercase.")
  public List<String> getShortNames() {
    return shortNames;
  }

  public void setShortNames(@jakarta.annotation.Nullable List<String> shortNames) {
    this.shortNames = shortNames;
  }


  public V1CustomResourceDefinitionNames singular(@jakarta.annotation.Nullable String singular) {
    this.singular = singular;
    return this;
  }

  /**
   * singular is the singular name of the resource. It must be all lowercase. Defaults to lowercased &#x60;kind&#x60;.
   * @return singular
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "singular is the singular name of the resource. It must be all lowercase. Defaults to lowercased `kind`.")
  public String getSingular() {
    return singular;
  }

  public void setSingular(@jakarta.annotation.Nullable String singular) {
    this.singular = singular;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1CustomResourceDefinitionNames v1CustomResourceDefinitionNames = (V1CustomResourceDefinitionNames) o;
    return Objects.equals(this.categories, v1CustomResourceDefinitionNames.categories) &&
        Objects.equals(this.kind, v1CustomResourceDefinitionNames.kind) &&
        Objects.equals(this.listKind, v1CustomResourceDefinitionNames.listKind) &&
        Objects.equals(this.plural, v1CustomResourceDefinitionNames.plural) &&
        Objects.equals(this.shortNames, v1CustomResourceDefinitionNames.shortNames) &&
        Objects.equals(this.singular, v1CustomResourceDefinitionNames.singular);
  }

  @Override
  public int hashCode() {
    return Objects.hash(categories, kind, listKind, plural, shortNames, singular);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1CustomResourceDefinitionNames {\n");
    sb.append("    categories: ").append(toIndentedString(categories)).append("\n");
    sb.append("    kind: ").append(toIndentedString(kind)).append("\n");
    sb.append("    listKind: ").append(toIndentedString(listKind)).append("\n");
    sb.append("    plural: ").append(toIndentedString(plural)).append("\n");
    sb.append("    shortNames: ").append(toIndentedString(shortNames)).append("\n");
    sb.append("    singular: ").append(toIndentedString(singular)).append("\n");
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
    openapiFields.add("categories");
    openapiFields.add("kind");
    openapiFields.add("listKind");
    openapiFields.add("plural");
    openapiFields.add("shortNames");
    openapiFields.add("singular");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("kind");
    openapiRequiredFields.add("plural");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to V1CustomResourceDefinitionNames
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!V1CustomResourceDefinitionNames.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in V1CustomResourceDefinitionNames is not found in the empty JSON string", V1CustomResourceDefinitionNames.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!V1CustomResourceDefinitionNames.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `V1CustomResourceDefinitionNames` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : V1CustomResourceDefinitionNames.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // ensure the optional json data is an array if present
      if (jsonObj.get("categories") != null && !jsonObj.get("categories").isJsonNull() && !jsonObj.get("categories").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `categories` to be an array in the JSON string but got `%s`", jsonObj.get("categories").toString()));
      }
      if (!jsonObj.get("kind").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `kind` to be a primitive type in the JSON string but got `%s`", jsonObj.get("kind").toString()));
      }
      if ((jsonObj.get("listKind") != null && !jsonObj.get("listKind").isJsonNull()) && !jsonObj.get("listKind").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `listKind` to be a primitive type in the JSON string but got `%s`", jsonObj.get("listKind").toString()));
      }
      if (!jsonObj.get("plural").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `plural` to be a primitive type in the JSON string but got `%s`", jsonObj.get("plural").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("shortNames") != null && !jsonObj.get("shortNames").isJsonNull() && !jsonObj.get("shortNames").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `shortNames` to be an array in the JSON string but got `%s`", jsonObj.get("shortNames").toString()));
      }
      if ((jsonObj.get("singular") != null && !jsonObj.get("singular").isJsonNull()) && !jsonObj.get("singular").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `singular` to be a primitive type in the JSON string but got `%s`", jsonObj.get("singular").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!V1CustomResourceDefinitionNames.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'V1CustomResourceDefinitionNames' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<V1CustomResourceDefinitionNames> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(V1CustomResourceDefinitionNames.class));

       return (TypeAdapter<T>) new TypeAdapter<V1CustomResourceDefinitionNames>() {
           @Override
           public void write(JsonWriter out, V1CustomResourceDefinitionNames value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public V1CustomResourceDefinitionNames read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of V1CustomResourceDefinitionNames given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of V1CustomResourceDefinitionNames
   * @throws IOException if the JSON string is invalid with respect to V1CustomResourceDefinitionNames
   */
  public static V1CustomResourceDefinitionNames fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, V1CustomResourceDefinitionNames.class);
  }

  /**
   * Convert an instance of V1CustomResourceDefinitionNames to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
