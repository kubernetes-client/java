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
 * PolicyRule holds information that describes a policy rule, but does not contain information about who the rule applies to or which namespace the rule applies to.
 */
@ApiModel(description = "PolicyRule holds information that describes a policy rule, but does not contain information about who the rule applies to or which namespace the rule applies to.")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-09-11T18:00:16.154662Z[Etc/UTC]", comments = "Generator version: 7.13.0")
public class V1PolicyRule {
  public static final String SERIALIZED_NAME_API_GROUPS = "apiGroups";
  @SerializedName(SERIALIZED_NAME_API_GROUPS)
  @jakarta.annotation.Nullable
  private List<String> apiGroups = new ArrayList<>();

  public static final String SERIALIZED_NAME_NON_RESOURCE_U_R_LS = "nonResourceURLs";
  @SerializedName(SERIALIZED_NAME_NON_RESOURCE_U_R_LS)
  @jakarta.annotation.Nullable
  private List<String> nonResourceURLs = new ArrayList<>();

  public static final String SERIALIZED_NAME_RESOURCE_NAMES = "resourceNames";
  @SerializedName(SERIALIZED_NAME_RESOURCE_NAMES)
  @jakarta.annotation.Nullable
  private List<String> resourceNames = new ArrayList<>();

  public static final String SERIALIZED_NAME_RESOURCES = "resources";
  @SerializedName(SERIALIZED_NAME_RESOURCES)
  @jakarta.annotation.Nullable
  private List<String> resources = new ArrayList<>();

  public static final String SERIALIZED_NAME_VERBS = "verbs";
  @SerializedName(SERIALIZED_NAME_VERBS)
  @jakarta.annotation.Nonnull
  private List<String> verbs = new ArrayList<>();

  public V1PolicyRule() {
  }

  public V1PolicyRule apiGroups(@jakarta.annotation.Nullable List<String> apiGroups) {
    this.apiGroups = apiGroups;
    return this;
  }

  public V1PolicyRule addApiGroupsItem(String apiGroupsItem) {
    if (this.apiGroups == null) {
      this.apiGroups = new ArrayList<>();
    }
    this.apiGroups.add(apiGroupsItem);
    return this;
  }

  /**
   * APIGroups is the name of the APIGroup that contains the resources.  If multiple API groups are specified, any action requested against one of the enumerated resources in any API group will be allowed. \&quot;\&quot; represents the core API group and \&quot;*\&quot; represents all API groups.
   * @return apiGroups
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "APIGroups is the name of the APIGroup that contains the resources.  If multiple API groups are specified, any action requested against one of the enumerated resources in any API group will be allowed. \"\" represents the core API group and \"*\" represents all API groups.")
  public List<String> getApiGroups() {
    return apiGroups;
  }

  public void setApiGroups(@jakarta.annotation.Nullable List<String> apiGroups) {
    this.apiGroups = apiGroups;
  }


  public V1PolicyRule nonResourceURLs(@jakarta.annotation.Nullable List<String> nonResourceURLs) {
    this.nonResourceURLs = nonResourceURLs;
    return this;
  }

  public V1PolicyRule addNonResourceURLsItem(String nonResourceURLsItem) {
    if (this.nonResourceURLs == null) {
      this.nonResourceURLs = new ArrayList<>();
    }
    this.nonResourceURLs.add(nonResourceURLsItem);
    return this;
  }

  /**
   * NonResourceURLs is a set of partial urls that a user should have access to.  *s are allowed, but only as the full, final step in the path Since non-resource URLs are not namespaced, this field is only applicable for ClusterRoles referenced from a ClusterRoleBinding. Rules can either apply to API resources (such as \&quot;pods\&quot; or \&quot;secrets\&quot;) or non-resource URL paths (such as \&quot;/api\&quot;),  but not both.
   * @return nonResourceURLs
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "NonResourceURLs is a set of partial urls that a user should have access to.  *s are allowed, but only as the full, final step in the path Since non-resource URLs are not namespaced, this field is only applicable for ClusterRoles referenced from a ClusterRoleBinding. Rules can either apply to API resources (such as \"pods\" or \"secrets\") or non-resource URL paths (such as \"/api\"),  but not both.")
  public List<String> getNonResourceURLs() {
    return nonResourceURLs;
  }

  public void setNonResourceURLs(@jakarta.annotation.Nullable List<String> nonResourceURLs) {
    this.nonResourceURLs = nonResourceURLs;
  }


  public V1PolicyRule resourceNames(@jakarta.annotation.Nullable List<String> resourceNames) {
    this.resourceNames = resourceNames;
    return this;
  }

  public V1PolicyRule addResourceNamesItem(String resourceNamesItem) {
    if (this.resourceNames == null) {
      this.resourceNames = new ArrayList<>();
    }
    this.resourceNames.add(resourceNamesItem);
    return this;
  }

  /**
   * ResourceNames is an optional white list of names that the rule applies to.  An empty set means that everything is allowed.
   * @return resourceNames
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "ResourceNames is an optional white list of names that the rule applies to.  An empty set means that everything is allowed.")
  public List<String> getResourceNames() {
    return resourceNames;
  }

  public void setResourceNames(@jakarta.annotation.Nullable List<String> resourceNames) {
    this.resourceNames = resourceNames;
  }


  public V1PolicyRule resources(@jakarta.annotation.Nullable List<String> resources) {
    this.resources = resources;
    return this;
  }

  public V1PolicyRule addResourcesItem(String resourcesItem) {
    if (this.resources == null) {
      this.resources = new ArrayList<>();
    }
    this.resources.add(resourcesItem);
    return this;
  }

  /**
   * Resources is a list of resources this rule applies to. &#39;*&#39; represents all resources.
   * @return resources
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "Resources is a list of resources this rule applies to. '*' represents all resources.")
  public List<String> getResources() {
    return resources;
  }

  public void setResources(@jakarta.annotation.Nullable List<String> resources) {
    this.resources = resources;
  }


  public V1PolicyRule verbs(@jakarta.annotation.Nonnull List<String> verbs) {
    this.verbs = verbs;
    return this;
  }

  public V1PolicyRule addVerbsItem(String verbsItem) {
    if (this.verbs == null) {
      this.verbs = new ArrayList<>();
    }
    this.verbs.add(verbsItem);
    return this;
  }

  /**
   * Verbs is a list of Verbs that apply to ALL the ResourceKinds contained in this rule. &#39;*&#39; represents all verbs.
   * @return verbs
   */
  @jakarta.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Verbs is a list of Verbs that apply to ALL the ResourceKinds contained in this rule. '*' represents all verbs.")
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
    V1PolicyRule v1PolicyRule = (V1PolicyRule) o;
    return Objects.equals(this.apiGroups, v1PolicyRule.apiGroups) &&
        Objects.equals(this.nonResourceURLs, v1PolicyRule.nonResourceURLs) &&
        Objects.equals(this.resourceNames, v1PolicyRule.resourceNames) &&
        Objects.equals(this.resources, v1PolicyRule.resources) &&
        Objects.equals(this.verbs, v1PolicyRule.verbs);
  }

  @Override
  public int hashCode() {
    return Objects.hash(apiGroups, nonResourceURLs, resourceNames, resources, verbs);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1PolicyRule {\n");
    sb.append("    apiGroups: ").append(toIndentedString(apiGroups)).append("\n");
    sb.append("    nonResourceURLs: ").append(toIndentedString(nonResourceURLs)).append("\n");
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
    openapiFields.add("nonResourceURLs");
    openapiFields.add("resourceNames");
    openapiFields.add("resources");
    openapiFields.add("verbs");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("verbs");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to V1PolicyRule
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!V1PolicyRule.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in V1PolicyRule is not found in the empty JSON string", V1PolicyRule.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!V1PolicyRule.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `V1PolicyRule` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : V1PolicyRule.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // ensure the optional json data is an array if present
      if (jsonObj.get("apiGroups") != null && !jsonObj.get("apiGroups").isJsonNull() && !jsonObj.get("apiGroups").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `apiGroups` to be an array in the JSON string but got `%s`", jsonObj.get("apiGroups").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("nonResourceURLs") != null && !jsonObj.get("nonResourceURLs").isJsonNull() && !jsonObj.get("nonResourceURLs").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `nonResourceURLs` to be an array in the JSON string but got `%s`", jsonObj.get("nonResourceURLs").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("resourceNames") != null && !jsonObj.get("resourceNames").isJsonNull() && !jsonObj.get("resourceNames").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `resourceNames` to be an array in the JSON string but got `%s`", jsonObj.get("resourceNames").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("resources") != null && !jsonObj.get("resources").isJsonNull() && !jsonObj.get("resources").isJsonArray()) {
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
       if (!V1PolicyRule.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'V1PolicyRule' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<V1PolicyRule> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(V1PolicyRule.class));

       return (TypeAdapter<T>) new TypeAdapter<V1PolicyRule>() {
           @Override
           public void write(JsonWriter out, V1PolicyRule value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public V1PolicyRule read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of V1PolicyRule given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of V1PolicyRule
   * @throws IOException if the JSON string is invalid with respect to V1PolicyRule
   */
  public static V1PolicyRule fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, V1PolicyRule.class);
  }

  /**
   * Convert an instance of V1PolicyRule to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
