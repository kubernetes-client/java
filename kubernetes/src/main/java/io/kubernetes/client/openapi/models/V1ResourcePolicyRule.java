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
 * ResourcePolicyRule is a predicate that matches some resource requests, testing the request&#39;s verb and the target resource. A ResourcePolicyRule matches a resource request if and only if: (a) at least one member of verbs matches the request, (b) at least one member of apiGroups matches the request, (c) at least one member of resources matches the request, and (d) either (d1) the request does not specify a namespace (i.e., &#x60;Namespace&#x3D;&#x3D;\&quot;\&quot;&#x60;) and clusterScope is true or (d2) the request specifies a namespace and least one member of namespaces matches the request&#39;s namespace.
 */
@ApiModel(description = "ResourcePolicyRule is a predicate that matches some resource requests, testing the request's verb and the target resource. A ResourcePolicyRule matches a resource request if and only if: (a) at least one member of verbs matches the request, (b) at least one member of apiGroups matches the request, (c) at least one member of resources matches the request, and (d) either (d1) the request does not specify a namespace (i.e., `Namespace==\"\"`) and clusterScope is true or (d2) the request specifies a namespace and least one member of namespaces matches the request's namespace.")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-09-11T18:00:16.154662Z[Etc/UTC]", comments = "Generator version: 7.13.0")
public class V1ResourcePolicyRule {
  public static final String SERIALIZED_NAME_API_GROUPS = "apiGroups";
  @SerializedName(SERIALIZED_NAME_API_GROUPS)
  @jakarta.annotation.Nonnull
  private List<String> apiGroups = new ArrayList<>();

  public static final String SERIALIZED_NAME_CLUSTER_SCOPE = "clusterScope";
  @SerializedName(SERIALIZED_NAME_CLUSTER_SCOPE)
  @jakarta.annotation.Nullable
  private Boolean clusterScope;

  public static final String SERIALIZED_NAME_NAMESPACES = "namespaces";
  @SerializedName(SERIALIZED_NAME_NAMESPACES)
  @jakarta.annotation.Nullable
  private List<String> namespaces = new ArrayList<>();

  public static final String SERIALIZED_NAME_RESOURCES = "resources";
  @SerializedName(SERIALIZED_NAME_RESOURCES)
  @jakarta.annotation.Nonnull
  private List<String> resources = new ArrayList<>();

  public static final String SERIALIZED_NAME_VERBS = "verbs";
  @SerializedName(SERIALIZED_NAME_VERBS)
  @jakarta.annotation.Nonnull
  private List<String> verbs = new ArrayList<>();

  public V1ResourcePolicyRule() {
  }

  public V1ResourcePolicyRule apiGroups(@jakarta.annotation.Nonnull List<String> apiGroups) {
    this.apiGroups = apiGroups;
    return this;
  }

  public V1ResourcePolicyRule addApiGroupsItem(String apiGroupsItem) {
    if (this.apiGroups == null) {
      this.apiGroups = new ArrayList<>();
    }
    this.apiGroups.add(apiGroupsItem);
    return this;
  }

  /**
   * &#x60;apiGroups&#x60; is a list of matching API groups and may not be empty. \&quot;*\&quot; matches all API groups and, if present, must be the only entry. Required.
   * @return apiGroups
   */
  @jakarta.annotation.Nonnull
  @ApiModelProperty(required = true, value = "`apiGroups` is a list of matching API groups and may not be empty. \"*\" matches all API groups and, if present, must be the only entry. Required.")
  public List<String> getApiGroups() {
    return apiGroups;
  }

  public void setApiGroups(@jakarta.annotation.Nonnull List<String> apiGroups) {
    this.apiGroups = apiGroups;
  }


  public V1ResourcePolicyRule clusterScope(@jakarta.annotation.Nullable Boolean clusterScope) {
    this.clusterScope = clusterScope;
    return this;
  }

  /**
   * &#x60;clusterScope&#x60; indicates whether to match requests that do not specify a namespace (which happens either because the resource is not namespaced or the request targets all namespaces). If this field is omitted or false then the &#x60;namespaces&#x60; field must contain a non-empty list.
   * @return clusterScope
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "`clusterScope` indicates whether to match requests that do not specify a namespace (which happens either because the resource is not namespaced or the request targets all namespaces). If this field is omitted or false then the `namespaces` field must contain a non-empty list.")
  public Boolean getClusterScope() {
    return clusterScope;
  }

  public void setClusterScope(@jakarta.annotation.Nullable Boolean clusterScope) {
    this.clusterScope = clusterScope;
  }


  public V1ResourcePolicyRule namespaces(@jakarta.annotation.Nullable List<String> namespaces) {
    this.namespaces = namespaces;
    return this;
  }

  public V1ResourcePolicyRule addNamespacesItem(String namespacesItem) {
    if (this.namespaces == null) {
      this.namespaces = new ArrayList<>();
    }
    this.namespaces.add(namespacesItem);
    return this;
  }

  /**
   * &#x60;namespaces&#x60; is a list of target namespaces that restricts matches.  A request that specifies a target namespace matches only if either (a) this list contains that target namespace or (b) this list contains \&quot;*\&quot;.  Note that \&quot;*\&quot; matches any specified namespace but does not match a request that _does not specify_ a namespace (see the &#x60;clusterScope&#x60; field for that). This list may be empty, but only if &#x60;clusterScope&#x60; is true.
   * @return namespaces
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "`namespaces` is a list of target namespaces that restricts matches.  A request that specifies a target namespace matches only if either (a) this list contains that target namespace or (b) this list contains \"*\".  Note that \"*\" matches any specified namespace but does not match a request that _does not specify_ a namespace (see the `clusterScope` field for that). This list may be empty, but only if `clusterScope` is true.")
  public List<String> getNamespaces() {
    return namespaces;
  }

  public void setNamespaces(@jakarta.annotation.Nullable List<String> namespaces) {
    this.namespaces = namespaces;
  }


  public V1ResourcePolicyRule resources(@jakarta.annotation.Nonnull List<String> resources) {
    this.resources = resources;
    return this;
  }

  public V1ResourcePolicyRule addResourcesItem(String resourcesItem) {
    if (this.resources == null) {
      this.resources = new ArrayList<>();
    }
    this.resources.add(resourcesItem);
    return this;
  }

  /**
   * &#x60;resources&#x60; is a list of matching resources (i.e., lowercase and plural) with, if desired, subresource.  For example, [ \&quot;services\&quot;, \&quot;nodes/status\&quot; ].  This list may not be empty. \&quot;*\&quot; matches all resources and, if present, must be the only entry. Required.
   * @return resources
   */
  @jakarta.annotation.Nonnull
  @ApiModelProperty(required = true, value = "`resources` is a list of matching resources (i.e., lowercase and plural) with, if desired, subresource.  For example, [ \"services\", \"nodes/status\" ].  This list may not be empty. \"*\" matches all resources and, if present, must be the only entry. Required.")
  public List<String> getResources() {
    return resources;
  }

  public void setResources(@jakarta.annotation.Nonnull List<String> resources) {
    this.resources = resources;
  }


  public V1ResourcePolicyRule verbs(@jakarta.annotation.Nonnull List<String> verbs) {
    this.verbs = verbs;
    return this;
  }

  public V1ResourcePolicyRule addVerbsItem(String verbsItem) {
    if (this.verbs == null) {
      this.verbs = new ArrayList<>();
    }
    this.verbs.add(verbsItem);
    return this;
  }

  /**
   * &#x60;verbs&#x60; is a list of matching verbs and may not be empty. \&quot;*\&quot; matches all verbs and, if present, must be the only entry. Required.
   * @return verbs
   */
  @jakarta.annotation.Nonnull
  @ApiModelProperty(required = true, value = "`verbs` is a list of matching verbs and may not be empty. \"*\" matches all verbs and, if present, must be the only entry. Required.")
  public List<String> getVerbs() {
    return verbs;
  }

  public void setVerbs(@jakarta.annotation.Nonnull List<String> verbs) {
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
    V1ResourcePolicyRule v1ResourcePolicyRule = (V1ResourcePolicyRule) o;
    return Objects.equals(this.apiGroups, v1ResourcePolicyRule.apiGroups) &&
        Objects.equals(this.clusterScope, v1ResourcePolicyRule.clusterScope) &&
        Objects.equals(this.namespaces, v1ResourcePolicyRule.namespaces) &&
        Objects.equals(this.resources, v1ResourcePolicyRule.resources) &&
        Objects.equals(this.verbs, v1ResourcePolicyRule.verbs);
  }

  @Override
  public int hashCode() {
    return Objects.hash(apiGroups, clusterScope, namespaces, resources, verbs);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1ResourcePolicyRule {\n");
    sb.append("    apiGroups: ").append(toIndentedString(apiGroups)).append("\n");
    sb.append("    clusterScope: ").append(toIndentedString(clusterScope)).append("\n");
    sb.append("    namespaces: ").append(toIndentedString(namespaces)).append("\n");
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
    openapiFields.add("clusterScope");
    openapiFields.add("namespaces");
    openapiFields.add("resources");
    openapiFields.add("verbs");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("apiGroups");
    openapiRequiredFields.add("resources");
    openapiRequiredFields.add("verbs");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to V1ResourcePolicyRule
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!V1ResourcePolicyRule.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in V1ResourcePolicyRule is not found in the empty JSON string", V1ResourcePolicyRule.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!V1ResourcePolicyRule.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `V1ResourcePolicyRule` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : V1ResourcePolicyRule.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // ensure the required json array is present
      if (jsonObj.get("apiGroups") == null) {
        throw new IllegalArgumentException("Expected the field `linkedContent` to be an array in the JSON string but got `null`");
      } else if (!jsonObj.get("apiGroups").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `apiGroups` to be an array in the JSON string but got `%s`", jsonObj.get("apiGroups").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("namespaces") != null && !jsonObj.get("namespaces").isJsonNull() && !jsonObj.get("namespaces").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `namespaces` to be an array in the JSON string but got `%s`", jsonObj.get("namespaces").toString()));
      }
      // ensure the required json array is present
      if (jsonObj.get("resources") == null) {
        throw new IllegalArgumentException("Expected the field `linkedContent` to be an array in the JSON string but got `null`");
      } else if (!jsonObj.get("resources").isJsonArray()) {
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
       if (!V1ResourcePolicyRule.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'V1ResourcePolicyRule' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<V1ResourcePolicyRule> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(V1ResourcePolicyRule.class));

       return (TypeAdapter<T>) new TypeAdapter<V1ResourcePolicyRule>() {
           @Override
           public void write(JsonWriter out, V1ResourcePolicyRule value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public V1ResourcePolicyRule read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of V1ResourcePolicyRule given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of V1ResourcePolicyRule
   * @throws IOException if the JSON string is invalid with respect to V1ResourcePolicyRule
   */
  public static V1ResourcePolicyRule fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, V1ResourcePolicyRule.class);
  }

  /**
   * Convert an instance of V1ResourcePolicyRule to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
