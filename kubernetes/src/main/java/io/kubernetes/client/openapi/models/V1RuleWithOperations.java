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
 * RuleWithOperations is a tuple of Operations and Resources. It is recommended to make sure that all the tuple expansions are valid.
 */
@ApiModel(description = "RuleWithOperations is a tuple of Operations and Resources. It is recommended to make sure that all the tuple expansions are valid.")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-09-11T18:00:16.154662Z[Etc/UTC]", comments = "Generator version: 7.13.0")
public class V1RuleWithOperations {
  public static final String SERIALIZED_NAME_API_GROUPS = "apiGroups";
  @SerializedName(SERIALIZED_NAME_API_GROUPS)
  @jakarta.annotation.Nullable
  private List<String> apiGroups = new ArrayList<>();

  public static final String SERIALIZED_NAME_API_VERSIONS = "apiVersions";
  @SerializedName(SERIALIZED_NAME_API_VERSIONS)
  @jakarta.annotation.Nullable
  private List<String> apiVersions = new ArrayList<>();

  public static final String SERIALIZED_NAME_OPERATIONS = "operations";
  @SerializedName(SERIALIZED_NAME_OPERATIONS)
  @jakarta.annotation.Nullable
  private List<String> operations = new ArrayList<>();

  public static final String SERIALIZED_NAME_RESOURCES = "resources";
  @SerializedName(SERIALIZED_NAME_RESOURCES)
  @jakarta.annotation.Nullable
  private List<String> resources = new ArrayList<>();

  public static final String SERIALIZED_NAME_SCOPE = "scope";
  @SerializedName(SERIALIZED_NAME_SCOPE)
  @jakarta.annotation.Nullable
  private String scope;

  public V1RuleWithOperations() {
  }

  public V1RuleWithOperations apiGroups(@jakarta.annotation.Nullable List<String> apiGroups) {
    this.apiGroups = apiGroups;
    return this;
  }

  public V1RuleWithOperations addApiGroupsItem(String apiGroupsItem) {
    if (this.apiGroups == null) {
      this.apiGroups = new ArrayList<>();
    }
    this.apiGroups.add(apiGroupsItem);
    return this;
  }

  /**
   * APIGroups is the API groups the resources belong to. &#39;*&#39; is all groups. If &#39;*&#39; is present, the length of the slice must be one. Required.
   * @return apiGroups
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "APIGroups is the API groups the resources belong to. '*' is all groups. If '*' is present, the length of the slice must be one. Required.")
  public List<String> getApiGroups() {
    return apiGroups;
  }

  public void setApiGroups(@jakarta.annotation.Nullable List<String> apiGroups) {
    this.apiGroups = apiGroups;
  }


  public V1RuleWithOperations apiVersions(@jakarta.annotation.Nullable List<String> apiVersions) {
    this.apiVersions = apiVersions;
    return this;
  }

  public V1RuleWithOperations addApiVersionsItem(String apiVersionsItem) {
    if (this.apiVersions == null) {
      this.apiVersions = new ArrayList<>();
    }
    this.apiVersions.add(apiVersionsItem);
    return this;
  }

  /**
   * APIVersions is the API versions the resources belong to. &#39;*&#39; is all versions. If &#39;*&#39; is present, the length of the slice must be one. Required.
   * @return apiVersions
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "APIVersions is the API versions the resources belong to. '*' is all versions. If '*' is present, the length of the slice must be one. Required.")
  public List<String> getApiVersions() {
    return apiVersions;
  }

  public void setApiVersions(@jakarta.annotation.Nullable List<String> apiVersions) {
    this.apiVersions = apiVersions;
  }


  public V1RuleWithOperations operations(@jakarta.annotation.Nullable List<String> operations) {
    this.operations = operations;
    return this;
  }

  public V1RuleWithOperations addOperationsItem(String operationsItem) {
    if (this.operations == null) {
      this.operations = new ArrayList<>();
    }
    this.operations.add(operationsItem);
    return this;
  }

  /**
   * Operations is the operations the admission hook cares about - CREATE, UPDATE, DELETE, CONNECT or * for all of those operations and any future admission operations that are added. If &#39;*&#39; is present, the length of the slice must be one. Required.
   * @return operations
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "Operations is the operations the admission hook cares about - CREATE, UPDATE, DELETE, CONNECT or * for all of those operations and any future admission operations that are added. If '*' is present, the length of the slice must be one. Required.")
  public List<String> getOperations() {
    return operations;
  }

  public void setOperations(@jakarta.annotation.Nullable List<String> operations) {
    this.operations = operations;
  }


  public V1RuleWithOperations resources(@jakarta.annotation.Nullable List<String> resources) {
    this.resources = resources;
    return this;
  }

  public V1RuleWithOperations addResourcesItem(String resourcesItem) {
    if (this.resources == null) {
      this.resources = new ArrayList<>();
    }
    this.resources.add(resourcesItem);
    return this;
  }

  /**
   * Resources is a list of resources this rule applies to.  For example: &#39;pods&#39; means pods. &#39;pods/log&#39; means the log subresource of pods. &#39;*&#39; means all resources, but not subresources. &#39;pods/_*&#39; means all subresources of pods. &#39;*_/scale&#39; means all scale subresources. &#39;*_/_*&#39; means all resources and their subresources.  If wildcard is present, the validation rule will ensure resources do not overlap with each other.  Depending on the enclosing object, subresources might not be allowed. Required.
   * @return resources
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "Resources is a list of resources this rule applies to.  For example: 'pods' means pods. 'pods/log' means the log subresource of pods. '*' means all resources, but not subresources. 'pods/_*' means all subresources of pods. '*_/scale' means all scale subresources. '*_/_*' means all resources and their subresources.  If wildcard is present, the validation rule will ensure resources do not overlap with each other.  Depending on the enclosing object, subresources might not be allowed. Required.")
  public List<String> getResources() {
    return resources;
  }

  public void setResources(@jakarta.annotation.Nullable List<String> resources) {
    this.resources = resources;
  }


  public V1RuleWithOperations scope(@jakarta.annotation.Nullable String scope) {
    this.scope = scope;
    return this;
  }

  /**
   * scope specifies the scope of this rule. Valid values are \&quot;Cluster\&quot;, \&quot;Namespaced\&quot;, and \&quot;*\&quot; \&quot;Cluster\&quot; means that only cluster-scoped resources will match this rule. Namespace API objects are cluster-scoped. \&quot;Namespaced\&quot; means that only namespaced resources will match this rule. \&quot;*\&quot; means that there are no scope restrictions. Subresources match the scope of their parent resource. Default is \&quot;*\&quot;.
   * @return scope
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "scope specifies the scope of this rule. Valid values are \"Cluster\", \"Namespaced\", and \"*\" \"Cluster\" means that only cluster-scoped resources will match this rule. Namespace API objects are cluster-scoped. \"Namespaced\" means that only namespaced resources will match this rule. \"*\" means that there are no scope restrictions. Subresources match the scope of their parent resource. Default is \"*\".")
  public String getScope() {
    return scope;
  }

  public void setScope(@jakarta.annotation.Nullable String scope) {
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
    V1RuleWithOperations v1RuleWithOperations = (V1RuleWithOperations) o;
    return Objects.equals(this.apiGroups, v1RuleWithOperations.apiGroups) &&
        Objects.equals(this.apiVersions, v1RuleWithOperations.apiVersions) &&
        Objects.equals(this.operations, v1RuleWithOperations.operations) &&
        Objects.equals(this.resources, v1RuleWithOperations.resources) &&
        Objects.equals(this.scope, v1RuleWithOperations.scope);
  }

  @Override
  public int hashCode() {
    return Objects.hash(apiGroups, apiVersions, operations, resources, scope);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1RuleWithOperations {\n");
    sb.append("    apiGroups: ").append(toIndentedString(apiGroups)).append("\n");
    sb.append("    apiVersions: ").append(toIndentedString(apiVersions)).append("\n");
    sb.append("    operations: ").append(toIndentedString(operations)).append("\n");
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
    openapiFields.add("resources");
    openapiFields.add("scope");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to V1RuleWithOperations
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!V1RuleWithOperations.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in V1RuleWithOperations is not found in the empty JSON string", V1RuleWithOperations.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!V1RuleWithOperations.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `V1RuleWithOperations` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // ensure the optional json data is an array if present
      if (jsonObj.get("apiGroups") != null && !jsonObj.get("apiGroups").isJsonNull() && !jsonObj.get("apiGroups").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `apiGroups` to be an array in the JSON string but got `%s`", jsonObj.get("apiGroups").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("apiVersions") != null && !jsonObj.get("apiVersions").isJsonNull() && !jsonObj.get("apiVersions").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `apiVersions` to be an array in the JSON string but got `%s`", jsonObj.get("apiVersions").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("operations") != null && !jsonObj.get("operations").isJsonNull() && !jsonObj.get("operations").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `operations` to be an array in the JSON string but got `%s`", jsonObj.get("operations").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("resources") != null && !jsonObj.get("resources").isJsonNull() && !jsonObj.get("resources").isJsonArray()) {
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
       if (!V1RuleWithOperations.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'V1RuleWithOperations' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<V1RuleWithOperations> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(V1RuleWithOperations.class));

       return (TypeAdapter<T>) new TypeAdapter<V1RuleWithOperations>() {
           @Override
           public void write(JsonWriter out, V1RuleWithOperations value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public V1RuleWithOperations read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of V1RuleWithOperations given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of V1RuleWithOperations
   * @throws IOException if the JSON string is invalid with respect to V1RuleWithOperations
   */
  public static V1RuleWithOperations fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, V1RuleWithOperations.class);
  }

  /**
   * Convert an instance of V1RuleWithOperations to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
