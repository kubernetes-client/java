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
 * ResourceRule is the list of actions the subject is allowed to perform on resources. The list ordering isn&#39;t significant, may contain duplicates, and possibly be incomplete.
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-23T13:45:09.091597Z[Etc/UTC]")
public class V1ResourceRule {
  public static final String SERIALIZED_NAME_API_GROUPS = "apiGroups";
  @SerializedName(SERIALIZED_NAME_API_GROUPS)
  private List<String> apiGroups;

  public static final String SERIALIZED_NAME_RESOURCE_NAMES = "resourceNames";
  @SerializedName(SERIALIZED_NAME_RESOURCE_NAMES)
  private List<String> resourceNames;

  public static final String SERIALIZED_NAME_RESOURCES = "resources";
  @SerializedName(SERIALIZED_NAME_RESOURCES)
  private List<String> resources;

  public static final String SERIALIZED_NAME_VERBS = "verbs";
  @SerializedName(SERIALIZED_NAME_VERBS)
  private List<String> verbs = new ArrayList<>();

  public V1ResourceRule() {
  }

  public V1ResourceRule apiGroups(List<String> apiGroups) {

    this.apiGroups = apiGroups;
    return this;
  }

  public V1ResourceRule addApiGroupsItem(String apiGroupsItem) {
    if (this.apiGroups == null) {
      this.apiGroups = new ArrayList<>();
    }
    this.apiGroups.add(apiGroupsItem);
    return this;
  }

   /**
   * APIGroups is the name of the APIGroup that contains the resources.  If multiple API groups are specified, any action requested against one of the enumerated resources in any API group will be allowed.  \&quot;*\&quot; means all.
   * @return apiGroups
  **/
  @jakarta.annotation.Nullable
  public List<String> getApiGroups() {
    return apiGroups;
  }


  public void setApiGroups(List<String> apiGroups) {
    this.apiGroups = apiGroups;
  }


  public V1ResourceRule resourceNames(List<String> resourceNames) {

    this.resourceNames = resourceNames;
    return this;
  }

  public V1ResourceRule addResourceNamesItem(String resourceNamesItem) {
    if (this.resourceNames == null) {
      this.resourceNames = new ArrayList<>();
    }
    this.resourceNames.add(resourceNamesItem);
    return this;
  }

   /**
   * ResourceNames is an optional white list of names that the rule applies to.  An empty set means that everything is allowed.  \&quot;*\&quot; means all.
   * @return resourceNames
  **/
  @jakarta.annotation.Nullable
  public List<String> getResourceNames() {
    return resourceNames;
  }


  public void setResourceNames(List<String> resourceNames) {
    this.resourceNames = resourceNames;
  }


  public V1ResourceRule resources(List<String> resources) {

    this.resources = resources;
    return this;
  }

  public V1ResourceRule addResourcesItem(String resourcesItem) {
    if (this.resources == null) {
      this.resources = new ArrayList<>();
    }
    this.resources.add(resourcesItem);
    return this;
  }

   /**
   * Resources is a list of resources this rule applies to.  \&quot;*\&quot; means all in the specified apiGroups.  \&quot;*_/foo\&quot; represents the subresource &#39;foo&#39; for all resources in the specified apiGroups.
   * @return resources
  **/
  @jakarta.annotation.Nullable
  public List<String> getResources() {
    return resources;
  }


  public void setResources(List<String> resources) {
    this.resources = resources;
  }


  public V1ResourceRule verbs(List<String> verbs) {

    this.verbs = verbs;
    return this;
  }

  public V1ResourceRule addVerbsItem(String verbsItem) {
    if (this.verbs == null) {
      this.verbs = new ArrayList<>();
    }
    this.verbs.add(verbsItem);
    return this;
  }

   /**
   * Verb is a list of kubernetes resource API verbs, like: get, list, watch, create, update, delete, proxy.  \&quot;*\&quot; means all.
   * @return verbs
  **/
  @jakarta.annotation.Nonnull
  public List<String> getVerbs() {
    return verbs;
  }


  public void setVerbs(List<String> verbs) {
    this.verbs = verbs;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1ResourceRule v1ResourceRule = (V1ResourceRule) o;
    return Objects.equals(this.apiGroups, v1ResourceRule.apiGroups) &&
        Objects.equals(this.resourceNames, v1ResourceRule.resourceNames) &&
        Objects.equals(this.resources, v1ResourceRule.resources) &&
        Objects.equals(this.verbs, v1ResourceRule.verbs);
  }

  @Override
  public int hashCode() {
    return Objects.hash(apiGroups, resourceNames, resources, verbs);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1ResourceRule {\n");
    sb.append("    apiGroups: ").append(toIndentedString(apiGroups)).append("\n");
    sb.append("    resourceNames: ").append(toIndentedString(resourceNames)).append("\n");
    sb.append("    resources: ").append(toIndentedString(resources)).append("\n");
    sb.append("    verbs: ").append(toIndentedString(verbs)).append("\n");
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
    openapiFields.add("apiGroups");
    openapiFields.add("resourceNames");
    openapiFields.add("resources");
    openapiFields.add("verbs");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("verbs");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to V1ResourceRule
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!V1ResourceRule.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in V1ResourceRule is not found in the empty JSON string", V1ResourceRule.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!V1ResourceRule.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `V1ResourceRule` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : V1ResourceRule.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("apiGroups") != null && !jsonObj.get("apiGroups").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `apiGroups` to be an array in the JSON string but got `%s`", jsonObj.get("apiGroups").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("resourceNames") != null && !jsonObj.get("resourceNames").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `resourceNames` to be an array in the JSON string but got `%s`", jsonObj.get("resourceNames").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("resources") != null && !jsonObj.get("resources").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `resources` to be an array in the JSON string but got `%s`", jsonObj.get("resources").toString()));
      }
      // ensure the required json array is present
      if (jsonObj.get("verbs") == null) {
        throw new IllegalArgumentException("Expected the field `linkedContent` to be an array in the JSON string but got `null`");
      } else if (!jsonObj.get("verbs").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `verbs` to be an array in the JSON string but got `%s`", jsonObj.get("verbs").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!V1ResourceRule.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'V1ResourceRule' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<V1ResourceRule> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(V1ResourceRule.class));

       return (TypeAdapter<T>) new TypeAdapter<V1ResourceRule>() {
           @Override
           public void write(JsonWriter out, V1ResourceRule value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public V1ResourceRule read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of V1ResourceRule given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of V1ResourceRule
  * @throws IOException if the JSON string is invalid with respect to V1ResourceRule
  */
  public static V1ResourceRule fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, V1ResourceRule.class);
  }

 /**
  * Convert an instance of V1ResourceRule to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
