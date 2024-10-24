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
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.kubernetes.client.openapi.models.V1LabelSelector;
import io.kubernetes.client.openapi.models.V1alpha1NamedRuleWithOperations;
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

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import io.kubernetes.client.openapi.JSON;

/**
 * MatchResources decides whether to run the admission control policy on an object based on whether it meets the match criteria. The exclude rules take precedence over include rules (if a resource matches both, it is excluded)
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-04T19:37:38.574271Z[Etc/UTC]", comments = "Generator version: 7.6.0")
public class V1alpha1MatchResources {
  public static final String SERIALIZED_NAME_EXCLUDE_RESOURCE_RULES = "excludeResourceRules";
  @SerializedName(SERIALIZED_NAME_EXCLUDE_RESOURCE_RULES)
  private List<V1alpha1NamedRuleWithOperations> excludeResourceRules = new ArrayList<>();

  public static final String SERIALIZED_NAME_MATCH_POLICY = "matchPolicy";
  @SerializedName(SERIALIZED_NAME_MATCH_POLICY)
  private String matchPolicy;

  public static final String SERIALIZED_NAME_NAMESPACE_SELECTOR = "namespaceSelector";
  @SerializedName(SERIALIZED_NAME_NAMESPACE_SELECTOR)
  private V1LabelSelector namespaceSelector;

  public static final String SERIALIZED_NAME_OBJECT_SELECTOR = "objectSelector";
  @SerializedName(SERIALIZED_NAME_OBJECT_SELECTOR)
  private V1LabelSelector objectSelector;

  public static final String SERIALIZED_NAME_RESOURCE_RULES = "resourceRules";
  @SerializedName(SERIALIZED_NAME_RESOURCE_RULES)
  private List<V1alpha1NamedRuleWithOperations> resourceRules = new ArrayList<>();

  public V1alpha1MatchResources() {
  }

  public V1alpha1MatchResources excludeResourceRules(List<V1alpha1NamedRuleWithOperations> excludeResourceRules) {
    this.excludeResourceRules = excludeResourceRules;
    return this;
  }

  public V1alpha1MatchResources addExcludeResourceRulesItem(V1alpha1NamedRuleWithOperations excludeResourceRulesItem) {
    if (this.excludeResourceRules == null) {
      this.excludeResourceRules = new ArrayList<>();
    }
    this.excludeResourceRules.add(excludeResourceRulesItem);
    return this;
  }

   /**
   * ExcludeResourceRules describes what operations on what resources/subresources the ValidatingAdmissionPolicy should not care about. The exclude rules take precedence over include rules (if a resource matches both, it is excluded)
   * @return excludeResourceRules
  **/
  @jakarta.annotation.Nullable
  public List<V1alpha1NamedRuleWithOperations> getExcludeResourceRules() {
    return excludeResourceRules;
  }

  public void setExcludeResourceRules(List<V1alpha1NamedRuleWithOperations> excludeResourceRules) {
    this.excludeResourceRules = excludeResourceRules;
  }


  public V1alpha1MatchResources matchPolicy(String matchPolicy) {
    this.matchPolicy = matchPolicy;
    return this;
  }

   /**
   * matchPolicy defines how the \&quot;MatchResources\&quot; list is used to match incoming requests. Allowed values are \&quot;Exact\&quot; or \&quot;Equivalent\&quot;.  - Exact: match a request only if it exactly matches a specified rule. For example, if deployments can be modified via apps/v1, apps/v1beta1, and extensions/v1beta1, but \&quot;rules\&quot; only included &#x60;apiGroups:[\&quot;apps\&quot;], apiVersions:[\&quot;v1\&quot;], resources: [\&quot;deployments\&quot;]&#x60;, a request to apps/v1beta1 or extensions/v1beta1 would not be sent to the ValidatingAdmissionPolicy.  - Equivalent: match a request if modifies a resource listed in rules, even via another API group or version. For example, if deployments can be modified via apps/v1, apps/v1beta1, and extensions/v1beta1, and \&quot;rules\&quot; only included &#x60;apiGroups:[\&quot;apps\&quot;], apiVersions:[\&quot;v1\&quot;], resources: [\&quot;deployments\&quot;]&#x60;, a request to apps/v1beta1 or extensions/v1beta1 would be converted to apps/v1 and sent to the ValidatingAdmissionPolicy.  Defaults to \&quot;Equivalent\&quot;
   * @return matchPolicy
  **/
  @jakarta.annotation.Nullable
  public String getMatchPolicy() {
    return matchPolicy;
  }

  public void setMatchPolicy(String matchPolicy) {
    this.matchPolicy = matchPolicy;
  }


  public V1alpha1MatchResources namespaceSelector(V1LabelSelector namespaceSelector) {
    this.namespaceSelector = namespaceSelector;
    return this;
  }

   /**
   * Get namespaceSelector
   * @return namespaceSelector
  **/
  @jakarta.annotation.Nullable
  public V1LabelSelector getNamespaceSelector() {
    return namespaceSelector;
  }

  public void setNamespaceSelector(V1LabelSelector namespaceSelector) {
    this.namespaceSelector = namespaceSelector;
  }


  public V1alpha1MatchResources objectSelector(V1LabelSelector objectSelector) {
    this.objectSelector = objectSelector;
    return this;
  }

   /**
   * Get objectSelector
   * @return objectSelector
  **/
  @jakarta.annotation.Nullable
  public V1LabelSelector getObjectSelector() {
    return objectSelector;
  }

  public void setObjectSelector(V1LabelSelector objectSelector) {
    this.objectSelector = objectSelector;
  }


  public V1alpha1MatchResources resourceRules(List<V1alpha1NamedRuleWithOperations> resourceRules) {
    this.resourceRules = resourceRules;
    return this;
  }

  public V1alpha1MatchResources addResourceRulesItem(V1alpha1NamedRuleWithOperations resourceRulesItem) {
    if (this.resourceRules == null) {
      this.resourceRules = new ArrayList<>();
    }
    this.resourceRules.add(resourceRulesItem);
    return this;
  }

   /**
   * ResourceRules describes what operations on what resources/subresources the ValidatingAdmissionPolicy matches. The policy cares about an operation if it matches _any_ Rule.
   * @return resourceRules
  **/
  @jakarta.annotation.Nullable
  public List<V1alpha1NamedRuleWithOperations> getResourceRules() {
    return resourceRules;
  }

  public void setResourceRules(List<V1alpha1NamedRuleWithOperations> resourceRules) {
    this.resourceRules = resourceRules;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1alpha1MatchResources v1alpha1MatchResources = (V1alpha1MatchResources) o;
    return Objects.equals(this.excludeResourceRules, v1alpha1MatchResources.excludeResourceRules) &&
        Objects.equals(this.matchPolicy, v1alpha1MatchResources.matchPolicy) &&
        Objects.equals(this.namespaceSelector, v1alpha1MatchResources.namespaceSelector) &&
        Objects.equals(this.objectSelector, v1alpha1MatchResources.objectSelector) &&
        Objects.equals(this.resourceRules, v1alpha1MatchResources.resourceRules);
  }

  @Override
  public int hashCode() {
    return Objects.hash(excludeResourceRules, matchPolicy, namespaceSelector, objectSelector, resourceRules);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1alpha1MatchResources {\n");
    sb.append("    excludeResourceRules: ").append(toIndentedString(excludeResourceRules)).append("\n");
    sb.append("    matchPolicy: ").append(toIndentedString(matchPolicy)).append("\n");
    sb.append("    namespaceSelector: ").append(toIndentedString(namespaceSelector)).append("\n");
    sb.append("    objectSelector: ").append(toIndentedString(objectSelector)).append("\n");
    sb.append("    resourceRules: ").append(toIndentedString(resourceRules)).append("\n");
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
    openapiFields.add("excludeResourceRules");
    openapiFields.add("matchPolicy");
    openapiFields.add("namespaceSelector");
    openapiFields.add("objectSelector");
    openapiFields.add("resourceRules");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to V1alpha1MatchResources
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!V1alpha1MatchResources.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in V1alpha1MatchResources is not found in the empty JSON string", V1alpha1MatchResources.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!V1alpha1MatchResources.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `V1alpha1MatchResources` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (jsonObj.get("excludeResourceRules") != null && !jsonObj.get("excludeResourceRules").isJsonNull()) {
        JsonArray jsonArrayexcludeResourceRules = jsonObj.getAsJsonArray("excludeResourceRules");
        if (jsonArrayexcludeResourceRules != null) {
          // ensure the json data is an array
          if (!jsonObj.get("excludeResourceRules").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `excludeResourceRules` to be an array in the JSON string but got `%s`", jsonObj.get("excludeResourceRules").toString()));
          }

          // validate the optional field `excludeResourceRules` (array)
          for (int i = 0; i < jsonArrayexcludeResourceRules.size(); i++) {
            V1alpha1NamedRuleWithOperations.validateJsonElement(jsonArrayexcludeResourceRules.get(i));
          };
        }
      }
      if ((jsonObj.get("matchPolicy") != null && !jsonObj.get("matchPolicy").isJsonNull()) && !jsonObj.get("matchPolicy").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `matchPolicy` to be a primitive type in the JSON string but got `%s`", jsonObj.get("matchPolicy").toString()));
      }
      // validate the optional field `namespaceSelector`
      if (jsonObj.get("namespaceSelector") != null && !jsonObj.get("namespaceSelector").isJsonNull()) {
        V1LabelSelector.validateJsonElement(jsonObj.get("namespaceSelector"));
      }
      // validate the optional field `objectSelector`
      if (jsonObj.get("objectSelector") != null && !jsonObj.get("objectSelector").isJsonNull()) {
        V1LabelSelector.validateJsonElement(jsonObj.get("objectSelector"));
      }
      if (jsonObj.get("resourceRules") != null && !jsonObj.get("resourceRules").isJsonNull()) {
        JsonArray jsonArrayresourceRules = jsonObj.getAsJsonArray("resourceRules");
        if (jsonArrayresourceRules != null) {
          // ensure the json data is an array
          if (!jsonObj.get("resourceRules").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `resourceRules` to be an array in the JSON string but got `%s`", jsonObj.get("resourceRules").toString()));
          }

          // validate the optional field `resourceRules` (array)
          for (int i = 0; i < jsonArrayresourceRules.size(); i++) {
            V1alpha1NamedRuleWithOperations.validateJsonElement(jsonArrayresourceRules.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!V1alpha1MatchResources.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'V1alpha1MatchResources' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<V1alpha1MatchResources> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(V1alpha1MatchResources.class));

       return (TypeAdapter<T>) new TypeAdapter<V1alpha1MatchResources>() {
           @Override
           public void write(JsonWriter out, V1alpha1MatchResources value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public V1alpha1MatchResources read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of V1alpha1MatchResources given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of V1alpha1MatchResources
  * @throws IOException if the JSON string is invalid with respect to V1alpha1MatchResources
  */
  public static V1alpha1MatchResources fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, V1alpha1MatchResources.class);
  }

 /**
  * Convert an instance of V1alpha1MatchResources to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
