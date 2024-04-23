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
import java.util.ArrayList;
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
import java.util.Map.Entry;
import java.util.Set;

import io.kubernetes.client.openapi.JSON;

/**
 * APIResource specifies the name of a resource and whether it is namespaced.
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-23T13:45:09.091597Z[Etc/UTC]")
public class V1APIResource {
  public static final String SERIALIZED_NAME_CATEGORIES = "categories";
  @SerializedName(SERIALIZED_NAME_CATEGORIES)
  private List<String> categories;

  public static final String SERIALIZED_NAME_GROUP = "group";
  @SerializedName(SERIALIZED_NAME_GROUP)
  private String group;

  public static final String SERIALIZED_NAME_KIND = "kind";
  @SerializedName(SERIALIZED_NAME_KIND)
  private String kind;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_NAMESPACED = "namespaced";
  @SerializedName(SERIALIZED_NAME_NAMESPACED)
  private Boolean namespaced;

  public static final String SERIALIZED_NAME_SHORT_NAMES = "shortNames";
  @SerializedName(SERIALIZED_NAME_SHORT_NAMES)
  private List<String> shortNames;

  public static final String SERIALIZED_NAME_SINGULAR_NAME = "singularName";
  @SerializedName(SERIALIZED_NAME_SINGULAR_NAME)
  private String singularName;

  public static final String SERIALIZED_NAME_STORAGE_VERSION_HASH = "storageVersionHash";
  @SerializedName(SERIALIZED_NAME_STORAGE_VERSION_HASH)
  private String storageVersionHash;

  public static final String SERIALIZED_NAME_VERBS = "verbs";
  @SerializedName(SERIALIZED_NAME_VERBS)
  private List<String> verbs = new ArrayList<>();

  public static final String SERIALIZED_NAME_VERSION = "version";
  @SerializedName(SERIALIZED_NAME_VERSION)
  private String version;

  public V1APIResource() {
  }

  public V1APIResource categories(List<String> categories) {

    this.categories = categories;
    return this;
  }

  public V1APIResource addCategoriesItem(String categoriesItem) {
    if (this.categories == null) {
      this.categories = new ArrayList<>();
    }
    this.categories.add(categoriesItem);
    return this;
  }

   /**
   * categories is a list of the grouped resources this resource belongs to (e.g. &#39;all&#39;)
   * @return categories
  **/
  @jakarta.annotation.Nullable
  public List<String> getCategories() {
    return categories;
  }


  public void setCategories(List<String> categories) {
    this.categories = categories;
  }


  public V1APIResource group(String group) {

    this.group = group;
    return this;
  }

   /**
   * group is the preferred group of the resource.  Empty implies the group of the containing resource list. For subresources, this may have a different value, for example: Scale\&quot;.
   * @return group
  **/
  @jakarta.annotation.Nullable
  public String getGroup() {
    return group;
  }


  public void setGroup(String group) {
    this.group = group;
  }


  public V1APIResource kind(String kind) {

    this.kind = kind;
    return this;
  }

   /**
   * kind is the kind for the resource (e.g. &#39;Foo&#39; is the kind for a resource &#39;foo&#39;)
   * @return kind
  **/
  @jakarta.annotation.Nonnull
  public String getKind() {
    return kind;
  }


  public void setKind(String kind) {
    this.kind = kind;
  }


  public V1APIResource name(String name) {

    this.name = name;
    return this;
  }

   /**
   * name is the plural name of the resource.
   * @return name
  **/
  @jakarta.annotation.Nonnull
  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public V1APIResource namespaced(Boolean namespaced) {

    this.namespaced = namespaced;
    return this;
  }

   /**
   * namespaced indicates if a resource is namespaced or not.
   * @return namespaced
  **/
  @jakarta.annotation.Nonnull
  public Boolean getNamespaced() {
    return namespaced;
  }


  public void setNamespaced(Boolean namespaced) {
    this.namespaced = namespaced;
  }


  public V1APIResource shortNames(List<String> shortNames) {

    this.shortNames = shortNames;
    return this;
  }

  public V1APIResource addShortNamesItem(String shortNamesItem) {
    if (this.shortNames == null) {
      this.shortNames = new ArrayList<>();
    }
    this.shortNames.add(shortNamesItem);
    return this;
  }

   /**
   * shortNames is a list of suggested short names of the resource.
   * @return shortNames
  **/
  @jakarta.annotation.Nullable
  public List<String> getShortNames() {
    return shortNames;
  }


  public void setShortNames(List<String> shortNames) {
    this.shortNames = shortNames;
  }


  public V1APIResource singularName(String singularName) {

    this.singularName = singularName;
    return this;
  }

   /**
   * singularName is the singular name of the resource.  This allows clients to handle plural and singular opaquely. The singularName is more correct for reporting status on a single item and both singular and plural are allowed from the kubectl CLI interface.
   * @return singularName
  **/
  @jakarta.annotation.Nonnull
  public String getSingularName() {
    return singularName;
  }


  public void setSingularName(String singularName) {
    this.singularName = singularName;
  }


  public V1APIResource storageVersionHash(String storageVersionHash) {

    this.storageVersionHash = storageVersionHash;
    return this;
  }

   /**
   * The hash value of the storage version, the version this resource is converted to when written to the data store. Value must be treated as opaque by clients. Only equality comparison on the value is valid. This is an alpha feature and may change or be removed in the future. The field is populated by the apiserver only if the StorageVersionHash feature gate is enabled. This field will remain optional even if it graduates.
   * @return storageVersionHash
  **/
  @jakarta.annotation.Nullable
  public String getStorageVersionHash() {
    return storageVersionHash;
  }


  public void setStorageVersionHash(String storageVersionHash) {
    this.storageVersionHash = storageVersionHash;
  }


  public V1APIResource verbs(List<String> verbs) {

    this.verbs = verbs;
    return this;
  }

  public V1APIResource addVerbsItem(String verbsItem) {
    if (this.verbs == null) {
      this.verbs = new ArrayList<>();
    }
    this.verbs.add(verbsItem);
    return this;
  }

   /**
   * verbs is a list of supported kube verbs (this includes get, list, watch, create, update, patch, delete, deletecollection, and proxy)
   * @return verbs
  **/
  @jakarta.annotation.Nonnull
  public List<String> getVerbs() {
    return verbs;
  }


  public void setVerbs(List<String> verbs) {
    this.verbs = verbs;
  }


  public V1APIResource version(String version) {

    this.version = version;
    return this;
  }

   /**
   * version is the preferred version of the resource.  Empty implies the version of the containing resource list For subresources, this may have a different value, for example: v1 (while inside a v1beta1 version of the core resource&#39;s group)\&quot;.
   * @return version
  **/
  @jakarta.annotation.Nullable
  public String getVersion() {
    return version;
  }


  public void setVersion(String version) {
    this.version = version;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1APIResource v1APIResource = (V1APIResource) o;
    return Objects.equals(this.categories, v1APIResource.categories) &&
        Objects.equals(this.group, v1APIResource.group) &&
        Objects.equals(this.kind, v1APIResource.kind) &&
        Objects.equals(this.name, v1APIResource.name) &&
        Objects.equals(this.namespaced, v1APIResource.namespaced) &&
        Objects.equals(this.shortNames, v1APIResource.shortNames) &&
        Objects.equals(this.singularName, v1APIResource.singularName) &&
        Objects.equals(this.storageVersionHash, v1APIResource.storageVersionHash) &&
        Objects.equals(this.verbs, v1APIResource.verbs) &&
        Objects.equals(this.version, v1APIResource.version);
  }

  @Override
  public int hashCode() {
    return Objects.hash(categories, group, kind, name, namespaced, shortNames, singularName, storageVersionHash, verbs, version);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1APIResource {\n");
    sb.append("    categories: ").append(toIndentedString(categories)).append("\n");
    sb.append("    group: ").append(toIndentedString(group)).append("\n");
    sb.append("    kind: ").append(toIndentedString(kind)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    namespaced: ").append(toIndentedString(namespaced)).append("\n");
    sb.append("    shortNames: ").append(toIndentedString(shortNames)).append("\n");
    sb.append("    singularName: ").append(toIndentedString(singularName)).append("\n");
    sb.append("    storageVersionHash: ").append(toIndentedString(storageVersionHash)).append("\n");
    sb.append("    verbs: ").append(toIndentedString(verbs)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
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
    openapiFields.add("group");
    openapiFields.add("kind");
    openapiFields.add("name");
    openapiFields.add("namespaced");
    openapiFields.add("shortNames");
    openapiFields.add("singularName");
    openapiFields.add("storageVersionHash");
    openapiFields.add("verbs");
    openapiFields.add("version");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("kind");
    openapiRequiredFields.add("name");
    openapiRequiredFields.add("namespaced");
    openapiRequiredFields.add("singularName");
    openapiRequiredFields.add("verbs");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to V1APIResource
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!V1APIResource.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in V1APIResource is not found in the empty JSON string", V1APIResource.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!V1APIResource.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `V1APIResource` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : V1APIResource.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("categories") != null && !jsonObj.get("categories").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `categories` to be an array in the JSON string but got `%s`", jsonObj.get("categories").toString()));
      }
      if ((jsonObj.get("group") != null && !jsonObj.get("group").isJsonNull()) && !jsonObj.get("group").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `group` to be a primitive type in the JSON string but got `%s`", jsonObj.get("group").toString()));
      }
      if (!jsonObj.get("kind").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `kind` to be a primitive type in the JSON string but got `%s`", jsonObj.get("kind").toString()));
      }
      if (!jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("shortNames") != null && !jsonObj.get("shortNames").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `shortNames` to be an array in the JSON string but got `%s`", jsonObj.get("shortNames").toString()));
      }
      if (!jsonObj.get("singularName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `singularName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("singularName").toString()));
      }
      if ((jsonObj.get("storageVersionHash") != null && !jsonObj.get("storageVersionHash").isJsonNull()) && !jsonObj.get("storageVersionHash").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `storageVersionHash` to be a primitive type in the JSON string but got `%s`", jsonObj.get("storageVersionHash").toString()));
      }
      // ensure the required json array is present
      if (jsonObj.get("verbs") == null) {
        throw new IllegalArgumentException("Expected the field `linkedContent` to be an array in the JSON string but got `null`");
      } else if (!jsonObj.get("verbs").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `verbs` to be an array in the JSON string but got `%s`", jsonObj.get("verbs").toString()));
      }
      if ((jsonObj.get("version") != null && !jsonObj.get("version").isJsonNull()) && !jsonObj.get("version").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `version` to be a primitive type in the JSON string but got `%s`", jsonObj.get("version").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!V1APIResource.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'V1APIResource' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<V1APIResource> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(V1APIResource.class));

       return (TypeAdapter<T>) new TypeAdapter<V1APIResource>() {
           @Override
           public void write(JsonWriter out, V1APIResource value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public V1APIResource read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of V1APIResource given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of V1APIResource
  * @throws IOException if the JSON string is invalid with respect to V1APIResource
  */
  public static V1APIResource fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, V1APIResource.class);
  }

 /**
  * Convert an instance of V1APIResource to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
