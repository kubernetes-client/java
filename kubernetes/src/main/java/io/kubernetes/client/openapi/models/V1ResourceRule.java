/*
Copyright 2022 The Kubernetes Authors.
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

import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * ResourceRule is the list of actions the subject is allowed to perform on resources. The list
 * ordering isn&#39;t significant, may contain duplicates, and possibly be incomplete.
 */
@ApiModel(
    description =
        "ResourceRule is the list of actions the subject is allowed to perform on resources. The list ordering isn't significant, may contain duplicates, and possibly be incomplete.")
@javax.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    date = "2022-12-05T08:14:34.919Z[Etc/UTC]")
public class V1ResourceRule {
  public static final String SERIALIZED_NAME_API_GROUPS = "apiGroups";

  @SerializedName(SERIALIZED_NAME_API_GROUPS)
  private List<String> apiGroups = null;

  public static final String SERIALIZED_NAME_RESOURCE_NAMES = "resourceNames";

  @SerializedName(SERIALIZED_NAME_RESOURCE_NAMES)
  private List<String> resourceNames = null;

  public static final String SERIALIZED_NAME_RESOURCES = "resources";

  @SerializedName(SERIALIZED_NAME_RESOURCES)
  private List<String> resources = null;

  public static final String SERIALIZED_NAME_VERBS = "verbs";

  @SerializedName(SERIALIZED_NAME_VERBS)
  private List<String> verbs = new ArrayList<>();

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
   * APIGroups is the name of the APIGroup that contains the resources. If multiple API groups are
   * specified, any action requested against one of the enumerated resources in any API group will
   * be allowed. \&quot;*\&quot; means all.
   *
   * @return apiGroups
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "APIGroups is the name of the APIGroup that contains the resources.  If multiple API groups are specified, any action requested against one of the enumerated resources in any API group will be allowed.  \"*\" means all.")
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
   * ResourceNames is an optional white list of names that the rule applies to. An empty set means
   * that everything is allowed. \&quot;*\&quot; means all.
   *
   * @return resourceNames
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "ResourceNames is an optional white list of names that the rule applies to.  An empty set means that everything is allowed.  \"*\" means all.")
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
   * Resources is a list of resources this rule applies to. \&quot;*\&quot; means all in the
   * specified apiGroups. \&quot;*_/foo\&quot; represents the subresource &#39;foo&#39; for all
   * resources in the specified apiGroups.
   *
   * @return resources
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "Resources is a list of resources this rule applies to.  \"*\" means all in the specified apiGroups.  \"*_/foo\" represents the subresource 'foo' for all resources in the specified apiGroups.")
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
    this.verbs.add(verbsItem);
    return this;
  }

  /**
   * Verb is a list of kubernetes resource API verbs, like: get, list, watch, create, update,
   * delete, proxy. \&quot;*\&quot; means all.
   *
   * @return verbs
   */
  @ApiModelProperty(
      required = true,
      value =
          "Verb is a list of kubernetes resource API verbs, like: get, list, watch, create, update, delete, proxy.  \"*\" means all.")
  public List<String> getVerbs() {
    return verbs;
  }

  public void setVerbs(List<String> verbs) {
    this.verbs = verbs;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1ResourceRule v1ResourceRule = (V1ResourceRule) o;
    return Objects.equals(this.apiGroups, v1ResourceRule.apiGroups)
        && Objects.equals(this.resourceNames, v1ResourceRule.resourceNames)
        && Objects.equals(this.resources, v1ResourceRule.resources)
        && Objects.equals(this.verbs, v1ResourceRule.verbs);
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
   * Convert the given object to string with each line indented by 4 spaces (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
