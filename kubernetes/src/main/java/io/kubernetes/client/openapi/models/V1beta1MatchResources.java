/*
Copyright 2023 The Kubernetes Authors.
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
import io.kubernetes.client.openapi.models.V1beta1NamedRuleWithOperations;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * MatchResources decides whether to run the admission control policy on an object based on whether it meets the match criteria. The exclude rules take precedence over include rules (if a resource matches both, it is excluded)
 */
@ApiModel(description = "MatchResources decides whether to run the admission control policy on an object based on whether it meets the match criteria. The exclude rules take precedence over include rules (if a resource matches both, it is excluded)")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-12-01T19:05:21.333462Z[Etc/UTC]")
public class V1beta1MatchResources {
  public static final String SERIALIZED_NAME_EXCLUDE_RESOURCE_RULES = "excludeResourceRules";
  @SerializedName(SERIALIZED_NAME_EXCLUDE_RESOURCE_RULES)
  private List<V1beta1NamedRuleWithOperations> excludeResourceRules = null;

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
  private List<V1beta1NamedRuleWithOperations> resourceRules = null;


  public V1beta1MatchResources excludeResourceRules(List<V1beta1NamedRuleWithOperations> excludeResourceRules) {

    this.excludeResourceRules = excludeResourceRules;
    return this;
  }

  public V1beta1MatchResources addExcludeResourceRulesItem(V1beta1NamedRuleWithOperations excludeResourceRulesItem) {
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
  @javax.annotation.Nullable
  @ApiModelProperty(value = "ExcludeResourceRules describes what operations on what resources/subresources the ValidatingAdmissionPolicy should not care about. The exclude rules take precedence over include rules (if a resource matches both, it is excluded)")

  public List<V1beta1NamedRuleWithOperations> getExcludeResourceRules() {
    return excludeResourceRules;
  }


  public void setExcludeResourceRules(List<V1beta1NamedRuleWithOperations> excludeResourceRules) {
    this.excludeResourceRules = excludeResourceRules;
  }


  public V1beta1MatchResources matchPolicy(String matchPolicy) {

    this.matchPolicy = matchPolicy;
    return this;
  }

   /**
   * matchPolicy defines how the \&quot;MatchResources\&quot; list is used to match incoming requests. Allowed values are \&quot;Exact\&quot; or \&quot;Equivalent\&quot;.  - Exact: match a request only if it exactly matches a specified rule. For example, if deployments can be modified via apps/v1, apps/v1beta1, and extensions/v1beta1, but \&quot;rules\&quot; only included &#x60;apiGroups:[\&quot;apps\&quot;], apiVersions:[\&quot;v1\&quot;], resources: [\&quot;deployments\&quot;]&#x60;, a request to apps/v1beta1 or extensions/v1beta1 would not be sent to the ValidatingAdmissionPolicy.  - Equivalent: match a request if modifies a resource listed in rules, even via another API group or version. For example, if deployments can be modified via apps/v1, apps/v1beta1, and extensions/v1beta1, and \&quot;rules\&quot; only included &#x60;apiGroups:[\&quot;apps\&quot;], apiVersions:[\&quot;v1\&quot;], resources: [\&quot;deployments\&quot;]&#x60;, a request to apps/v1beta1 or extensions/v1beta1 would be converted to apps/v1 and sent to the ValidatingAdmissionPolicy.  Defaults to \&quot;Equivalent\&quot;
   * @return matchPolicy
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "matchPolicy defines how the \"MatchResources\" list is used to match incoming requests. Allowed values are \"Exact\" or \"Equivalent\".  - Exact: match a request only if it exactly matches a specified rule. For example, if deployments can be modified via apps/v1, apps/v1beta1, and extensions/v1beta1, but \"rules\" only included `apiGroups:[\"apps\"], apiVersions:[\"v1\"], resources: [\"deployments\"]`, a request to apps/v1beta1 or extensions/v1beta1 would not be sent to the ValidatingAdmissionPolicy.  - Equivalent: match a request if modifies a resource listed in rules, even via another API group or version. For example, if deployments can be modified via apps/v1, apps/v1beta1, and extensions/v1beta1, and \"rules\" only included `apiGroups:[\"apps\"], apiVersions:[\"v1\"], resources: [\"deployments\"]`, a request to apps/v1beta1 or extensions/v1beta1 would be converted to apps/v1 and sent to the ValidatingAdmissionPolicy.  Defaults to \"Equivalent\"")

  public String getMatchPolicy() {
    return matchPolicy;
  }


  public void setMatchPolicy(String matchPolicy) {
    this.matchPolicy = matchPolicy;
  }


  public V1beta1MatchResources namespaceSelector(V1LabelSelector namespaceSelector) {

    this.namespaceSelector = namespaceSelector;
    return this;
  }

   /**
   * Get namespaceSelector
   * @return namespaceSelector
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public V1LabelSelector getNamespaceSelector() {
    return namespaceSelector;
  }


  public void setNamespaceSelector(V1LabelSelector namespaceSelector) {
    this.namespaceSelector = namespaceSelector;
  }


  public V1beta1MatchResources objectSelector(V1LabelSelector objectSelector) {

    this.objectSelector = objectSelector;
    return this;
  }

   /**
   * Get objectSelector
   * @return objectSelector
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public V1LabelSelector getObjectSelector() {
    return objectSelector;
  }


  public void setObjectSelector(V1LabelSelector objectSelector) {
    this.objectSelector = objectSelector;
  }


  public V1beta1MatchResources resourceRules(List<V1beta1NamedRuleWithOperations> resourceRules) {

    this.resourceRules = resourceRules;
    return this;
  }

  public V1beta1MatchResources addResourceRulesItem(V1beta1NamedRuleWithOperations resourceRulesItem) {
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
  @javax.annotation.Nullable
  @ApiModelProperty(value = "ResourceRules describes what operations on what resources/subresources the ValidatingAdmissionPolicy matches. The policy cares about an operation if it matches _any_ Rule.")

  public List<V1beta1NamedRuleWithOperations> getResourceRules() {
    return resourceRules;
  }


  public void setResourceRules(List<V1beta1NamedRuleWithOperations> resourceRules) {
    this.resourceRules = resourceRules;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1beta1MatchResources v1beta1MatchResources = (V1beta1MatchResources) o;
    return Objects.equals(this.excludeResourceRules, v1beta1MatchResources.excludeResourceRules) &&
        Objects.equals(this.matchPolicy, v1beta1MatchResources.matchPolicy) &&
        Objects.equals(this.namespaceSelector, v1beta1MatchResources.namespaceSelector) &&
        Objects.equals(this.objectSelector, v1beta1MatchResources.objectSelector) &&
        Objects.equals(this.resourceRules, v1beta1MatchResources.resourceRules);
  }

  @Override
  public int hashCode() {
    return Objects.hash(excludeResourceRules, matchPolicy, namespaceSelector, objectSelector, resourceRules);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1beta1MatchResources {\n");
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}
