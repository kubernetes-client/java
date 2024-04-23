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
import io.kubernetes.client.openapi.models.V1LabelSelector;
import io.kubernetes.client.openapi.models.V1NamedRuleWithOperations;
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
 * MatchResources decides whether to run the admission control policy on an object based on whether it meets the match criteria. The exclude rules take precedence over include rules (if a resource matches both, it is excluded)
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-23T13:45:09.091597Z[Etc/UTC]")
public class V1MatchResources {
  public static final String SERIALIZED_NAME_EXCLUDE_RESOURCE_RULES = "excludeResourceRules";
  @SerializedName(SERIALIZED_NAME_EXCLUDE_RESOURCE_RULES)
  private List<V1NamedRuleWithOperations> excludeResourceRules;

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
  private List<V1NamedRuleWithOperations> resourceRules;

  public V1MatchResources() {
  }

  public V1MatchResources excludeResourceRules(List<V1NamedRuleWithOperations> excludeResourceRules) {

    this.excludeResourceRules = excludeResourceRules;
    return this;
  }

  public V1MatchResources addExcludeResourceRulesItem(V1NamedRuleWithOperations excludeResourceRulesItem) {
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
  public List<V1NamedRuleWithOperations> getExcludeResourceRules() {
    return excludeResourceRules;
  }


  public void setExcludeResourceRules(List<V1NamedRuleWithOperations> excludeResourceRules) {
    this.excludeResourceRules = excludeResourceRules;
  }


  public V1MatchResources matchPolicy(String matchPolicy) {

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


  public V1MatchResources namespaceSelector(V1LabelSelector namespaceSelector) {

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


  public V1MatchResources objectSelector(V1LabelSelector objectSelector) {

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


  public V1MatchResources resourceRules(List<V1NamedRuleWithOperations> resourceRules) {

    this.resourceRules = resourceRules;
    return this;
  }

  public V1MatchResources addResourceRulesItem(V1NamedRuleWithOperations resourceRulesItem) {
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
  public List<V1NamedRuleWithOperations> getResourceRules() {
    return resourceRules;
  }


  public void setResourceRules(List<V1NamedRuleWithOperations> resourceRules) {
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
    V1MatchResources v1MatchResources = (V1MatchResources) o;
    return Objects.equals(this.excludeResourceRules, v1MatchResources.excludeResourceRules) &&
        Objects.equals(this.matchPolicy, v1MatchResources.matchPolicy) &&
        Objects.equals(this.namespaceSelector, v1MatchResources.namespaceSelector) &&
        Objects.equals(this.objectSelector, v1MatchResources.objectSelector) &&
        Objects.equals(this.resourceRules, v1MatchResources.resourceRules);
  }

  @Override
  public int hashCode() {
    return Objects.hash(excludeResourceRules, matchPolicy, namespaceSelector, objectSelector, resourceRules);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1MatchResources {\n");
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
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to V1MatchResources
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!V1MatchResources.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in V1MatchResources is not found in the empty JSON string", V1MatchResources.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!V1MatchResources.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `V1MatchResources` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("excludeResourceRules") != null && !jsonObj.get("excludeResourceRules").isJsonNull()) {
        JsonArray jsonArrayexcludeResourceRules = jsonObj.getAsJsonArray("excludeResourceRules");
        if (jsonArrayexcludeResourceRules != null) {
          // ensure the json data is an array
          if (!jsonObj.get("excludeResourceRules").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `excludeResourceRules` to be an array in the JSON string but got `%s`", jsonObj.get("excludeResourceRules").toString()));
          }

          // validate the optional field `excludeResourceRules` (array)
          for (int i = 0; i < jsonArrayexcludeResourceRules.size(); i++) {
            V1NamedRuleWithOperations.validateJsonObject(jsonArrayexcludeResourceRules.get(i).getAsJsonObject());
          };
        }
      }
      if ((jsonObj.get("matchPolicy") != null && !jsonObj.get("matchPolicy").isJsonNull()) && !jsonObj.get("matchPolicy").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `matchPolicy` to be a primitive type in the JSON string but got `%s`", jsonObj.get("matchPolicy").toString()));
      }
      // validate the optional field `namespaceSelector`
      if (jsonObj.get("namespaceSelector") != null && !jsonObj.get("namespaceSelector").isJsonNull()) {
        V1LabelSelector.validateJsonObject(jsonObj.getAsJsonObject("namespaceSelector"));
      }
      // validate the optional field `objectSelector`
      if (jsonObj.get("objectSelector") != null && !jsonObj.get("objectSelector").isJsonNull()) {
        V1LabelSelector.validateJsonObject(jsonObj.getAsJsonObject("objectSelector"));
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
            V1NamedRuleWithOperations.validateJsonObject(jsonArrayresourceRules.get(i).getAsJsonObject());
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!V1MatchResources.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'V1MatchResources' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<V1MatchResources> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(V1MatchResources.class));

       return (TypeAdapter<T>) new TypeAdapter<V1MatchResources>() {
           @Override
           public void write(JsonWriter out, V1MatchResources value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public V1MatchResources read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of V1MatchResources given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of V1MatchResources
  * @throws IOException if the JSON string is invalid with respect to V1MatchResources
  */
  public static V1MatchResources fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, V1MatchResources.class);
  }

 /**
  * Convert an instance of V1MatchResources to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
