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
 * NamedRuleWithOperations is a tuple of Operations and Resources with ResourceNames.
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-23T13:45:09.091597Z[Etc/UTC]")
public class V1NamedRuleWithOperations {
  public static final String SERIALIZED_NAME_API_GROUPS = "apiGroups";
  @SerializedName(SERIALIZED_NAME_API_GROUPS)
  private List<String> apiGroups;

  public static final String SERIALIZED_NAME_API_VERSIONS = "apiVersions";
  @SerializedName(SERIALIZED_NAME_API_VERSIONS)
  private List<String> apiVersions;

  public static final String SERIALIZED_NAME_OPERATIONS = "operations";
  @SerializedName(SERIALIZED_NAME_OPERATIONS)
  private List<String> operations;

  public static final String SERIALIZED_NAME_RESOURCE_NAMES = "resourceNames";
  @SerializedName(SERIALIZED_NAME_RESOURCE_NAMES)
  private List<String> resourceNames;

  public static final String SERIALIZED_NAME_RESOURCES = "resources";
  @SerializedName(SERIALIZED_NAME_RESOURCES)
  private List<String> resources;

  public static final String SERIALIZED_NAME_SCOPE = "scope";
  @SerializedName(SERIALIZED_NAME_SCOPE)
  private String scope;

  public V1NamedRuleWithOperations() {
  }

  public V1NamedRuleWithOperations apiGroups(List<String> apiGroups) {

    this.apiGroups = apiGroups;
    return this;
  }

  public V1NamedRuleWithOperations addApiGroupsItem(String apiGroupsItem) {
    if (this.apiGroups == null) {
      this.apiGroups = new ArrayList<>();
    }
    this.apiGroups.add(apiGroupsItem);
    return this;
  }

   /**
   * APIGroups is the API groups the resources belong to. &#39;*&#39; is all groups. If &#39;*&#39; is present, the length of the slice must be one. Required.
   * @return apiGroups
  **/
  @jakarta.annotation.Nullable
  public List<String> getApiGroups() {
    return apiGroups;
  }


  public void setApiGroups(List<String> apiGroups) {
    this.apiGroups = apiGroups;
  }


  public V1NamedRuleWithOperations apiVersions(List<String> apiVersions) {

    this.apiVersions = apiVersions;
    return this;
  }

  public V1NamedRuleWithOperations addApiVersionsItem(String apiVersionsItem) {
    if (this.apiVersions == null) {
      this.apiVersions = new ArrayList<>();
    }
    this.apiVersions.add(apiVersionsItem);
    return this;
  }

   /**
   * APIVersions is the API versions the resources belong to. &#39;*&#39; is all versions. If &#39;*&#39; is present, the length of the slice must be one. Required.
   * @return apiVersions
  **/
  @jakarta.annotation.Nullable
  public List<String> getApiVersions() {
    return apiVersions;
  }


  public void setApiVersions(List<String> apiVersions) {
    this.apiVersions = apiVersions;
  }


  public V1NamedRuleWithOperations operations(List<String> operations) {

    this.operations = operations;
    return this;
  }

  public V1NamedRuleWithOperations addOperationsItem(String operationsItem) {
    if (this.operations == null) {
      this.operations = new ArrayList<>();
    }
    this.operations.add(operationsItem);
    return this;
  }

   /**
   * Operations is the operations the admission hook cares about - CREATE, UPDATE, DELETE, CONNECT or * for all of those operations and any future admission operations that are added. If &#39;*&#39; is present, the length of the slice must be one. Required.
   * @return operations
  **/
  @jakarta.annotation.Nullable
  public List<String> getOperations() {
    return operations;
  }


  public void setOperations(List<String> operations) {
    this.operations = operations;
  }


  public V1NamedRuleWithOperations resourceNames(List<String> resourceNames) {

    this.resourceNames = resourceNames;
    return this;
  }

  public V1NamedRuleWithOperations addResourceNamesItem(String resourceNamesItem) {
    if (this.resourceNames == null) {
      this.resourceNames = new ArrayList<>();
    }
    this.resourceNames.add(resourceNamesItem);
    return this;
  }

   /**
   * ResourceNames is an optional white list of names that the rule applies to.  An empty set means that everything is allowed.
   * @return resourceNames
  **/
  @jakarta.annotation.Nullable
  public List<String> getResourceNames() {
    return resourceNames;
  }


  public void setResourceNames(List<String> resourceNames) {
    this.resourceNames = resourceNames;
  }


  public V1NamedRuleWithOperations resources(List<String> resources) {

    this.resources = resources;
    return this;
  }

  public V1NamedRuleWithOperations addResourcesItem(String resourcesItem) {
    if (this.resources == null) {
      this.resources = new ArrayList<>();
    }
    this.resources.add(resourcesItem);
    return this;
  }

   /**
   * Resources is a list of resources this rule applies to.  For example: &#39;pods&#39; means pods. &#39;pods/log&#39; means the log subresource of pods. &#39;*&#39; means all resources, but not subresources. &#39;pods/_*&#39; means all subresources of pods. &#39;*_/scale&#39; means all scale subresources. &#39;*_/_*&#39; means all resources and their subresources.  If wildcard is present, the validation rule will ensure resources do not overlap with each other.  Depending on the enclosing object, subresources might not be allowed. Required.
   * @return resources
  **/
  @jakarta.annotation.Nullable
  public List<String> getResources() {
    return resources;
  }


  public void setResources(List<String> resources) {
    this.resources = resources;
  }


  public V1NamedRuleWithOperations scope(String scope) {

    this.scope = scope;
    return this;
  }

   /**
   * scope specifies the scope of this rule. Valid values are \&quot;Cluster\&quot;, \&quot;Namespaced\&quot;, and \&quot;*\&quot; \&quot;Cluster\&quot; means that only cluster-scoped resources will match this rule. Namespace API objects are cluster-scoped. \&quot;Namespaced\&quot; means that only namespaced resources will match this rule. \&quot;*\&quot; means that there are no scope restrictions. Subresources match the scope of their parent resource. Default is \&quot;*\&quot;.
   * @return scope
  **/
  @jakarta.annotation.Nullable
  public String getScope() {
    return scope;
  }


  public void setScope(String scope) {
    this.scope = scope;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1NamedRuleWithOperations v1NamedRuleWithOperations = (V1NamedRuleWithOperations) o;
    return Objects.equals(this.apiGroups, v1NamedRuleWithOperations.apiGroups) &&
        Objects.equals(this.apiVersions, v1NamedRuleWithOperations.apiVersions) &&
        Objects.equals(this.operations, v1NamedRuleWithOperations.operations) &&
        Objects.equals(this.resourceNames, v1NamedRuleWithOperations.resourceNames) &&
        Objects.equals(this.resources, v1NamedRuleWithOperations.resources) &&
        Objects.equals(this.scope, v1NamedRuleWithOperations.scope);
  }

  @Override
  public int hashCode() {
    return Objects.hash(apiGroups, apiVersions, operations, resourceNames, resources, scope);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1NamedRuleWithOperations {\n");
    sb.append("    apiGroups: ").append(toIndentedString(apiGroups)).append("\n");
    sb.append("    apiVersions: ").append(toIndentedString(apiVersions)).append("\n");
    sb.append("    operations: ").append(toIndentedString(operations)).append("\n");
    sb.append("    resourceNames: ").append(toIndentedString(resourceNames)).append("\n");
    sb.append("    resources: ").append(toIndentedString(resources)).append("\n");
    sb.append("    scope: ").append(toIndentedString(scope)).append("\n");
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
    openapiFields.add("apiVersions");
    openapiFields.add("operations");
    openapiFields.add("resourceNames");
    openapiFields.add("resources");
    openapiFields.add("scope");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to V1NamedRuleWithOperations
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!V1NamedRuleWithOperations.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in V1NamedRuleWithOperations is not found in the empty JSON string", V1NamedRuleWithOperations.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!V1NamedRuleWithOperations.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `V1NamedRuleWithOperations` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("apiGroups") != null && !jsonObj.get("apiGroups").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `apiGroups` to be an array in the JSON string but got `%s`", jsonObj.get("apiGroups").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("apiVersions") != null && !jsonObj.get("apiVersions").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `apiVersions` to be an array in the JSON string but got `%s`", jsonObj.get("apiVersions").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("operations") != null && !jsonObj.get("operations").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `operations` to be an array in the JSON string but got `%s`", jsonObj.get("operations").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("resourceNames") != null && !jsonObj.get("resourceNames").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `resourceNames` to be an array in the JSON string but got `%s`", jsonObj.get("resourceNames").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("resources") != null && !jsonObj.get("resources").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `resources` to be an array in the JSON string but got `%s`", jsonObj.get("resources").toString()));
      }
      if ((jsonObj.get("scope") != null && !jsonObj.get("scope").isJsonNull()) && !jsonObj.get("scope").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `scope` to be a primitive type in the JSON string but got `%s`", jsonObj.get("scope").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!V1NamedRuleWithOperations.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'V1NamedRuleWithOperations' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<V1NamedRuleWithOperations> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(V1NamedRuleWithOperations.class));

       return (TypeAdapter<T>) new TypeAdapter<V1NamedRuleWithOperations>() {
           @Override
           public void write(JsonWriter out, V1NamedRuleWithOperations value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public V1NamedRuleWithOperations read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of V1NamedRuleWithOperations given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of V1NamedRuleWithOperations
  * @throws IOException if the JSON string is invalid with respect to V1NamedRuleWithOperations
  */
  public static V1NamedRuleWithOperations fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, V1NamedRuleWithOperations.class);
  }

 /**
  * Convert an instance of V1NamedRuleWithOperations to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
