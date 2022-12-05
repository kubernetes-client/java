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
 * RuleWithOperations is a tuple of Operations and Resources. It is recommended to make sure that
 * all the tuple expansions are valid.
 */
@ApiModel(
    description =
        "RuleWithOperations is a tuple of Operations and Resources. It is recommended to make sure that all the tuple expansions are valid.")
@javax.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    date = "2022-12-05T08:14:34.919Z[Etc/UTC]")
public class V1RuleWithOperations {
  public static final String SERIALIZED_NAME_API_GROUPS = "apiGroups";

  @SerializedName(SERIALIZED_NAME_API_GROUPS)
  private List<String> apiGroups = null;

  public static final String SERIALIZED_NAME_API_VERSIONS = "apiVersions";

  @SerializedName(SERIALIZED_NAME_API_VERSIONS)
  private List<String> apiVersions = null;

  public static final String SERIALIZED_NAME_OPERATIONS = "operations";

  @SerializedName(SERIALIZED_NAME_OPERATIONS)
  private List<String> operations = null;

  public static final String SERIALIZED_NAME_RESOURCES = "resources";

  @SerializedName(SERIALIZED_NAME_RESOURCES)
  private List<String> resources = null;

  public static final String SERIALIZED_NAME_SCOPE = "scope";

  @SerializedName(SERIALIZED_NAME_SCOPE)
  private String scope;

  public V1RuleWithOperations apiGroups(List<String> apiGroups) {

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
   * APIGroups is the API groups the resources belong to. &#39;*&#39; is all groups. If &#39;*&#39;
   * is present, the length of the slice must be one. Required.
   *
   * @return apiGroups
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "APIGroups is the API groups the resources belong to. '*' is all groups. If '*' is present, the length of the slice must be one. Required.")
  public List<String> getApiGroups() {
    return apiGroups;
  }

  public void setApiGroups(List<String> apiGroups) {
    this.apiGroups = apiGroups;
  }

  public V1RuleWithOperations apiVersions(List<String> apiVersions) {

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
   * APIVersions is the API versions the resources belong to. &#39;*&#39; is all versions. If
   * &#39;*&#39; is present, the length of the slice must be one. Required.
   *
   * @return apiVersions
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "APIVersions is the API versions the resources belong to. '*' is all versions. If '*' is present, the length of the slice must be one. Required.")
  public List<String> getApiVersions() {
    return apiVersions;
  }

  public void setApiVersions(List<String> apiVersions) {
    this.apiVersions = apiVersions;
  }

  public V1RuleWithOperations operations(List<String> operations) {

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
   * Operations is the operations the admission hook cares about - CREATE, UPDATE, DELETE, CONNECT
   * or * for all of those operations and any future admission operations that are added. If
   * &#39;*&#39; is present, the length of the slice must be one. Required.
   *
   * @return operations
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "Operations is the operations the admission hook cares about - CREATE, UPDATE, DELETE, CONNECT or * for all of those operations and any future admission operations that are added. If '*' is present, the length of the slice must be one. Required.")
  public List<String> getOperations() {
    return operations;
  }

  public void setOperations(List<String> operations) {
    this.operations = operations;
  }

  public V1RuleWithOperations resources(List<String> resources) {

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
   * Resources is a list of resources this rule applies to. For example: &#39;pods&#39; means pods.
   * &#39;pods/log&#39; means the log subresource of pods. &#39;*&#39; means all resources, but not
   * subresources. &#39;pods/_*&#39; means all subresources of pods. &#39;*_/scale&#39; means all
   * scale subresources. &#39;*_/_*&#39; means all resources and their subresources. If wildcard is
   * present, the validation rule will ensure resources do not overlap with each other. Depending on
   * the enclosing object, subresources might not be allowed. Required.
   *
   * @return resources
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "Resources is a list of resources this rule applies to.  For example: 'pods' means pods. 'pods/log' means the log subresource of pods. '*' means all resources, but not subresources. 'pods/_*' means all subresources of pods. '*_/scale' means all scale subresources. '*_/_*' means all resources and their subresources.  If wildcard is present, the validation rule will ensure resources do not overlap with each other.  Depending on the enclosing object, subresources might not be allowed. Required.")
  public List<String> getResources() {
    return resources;
  }

  public void setResources(List<String> resources) {
    this.resources = resources;
  }

  public V1RuleWithOperations scope(String scope) {

    this.scope = scope;
    return this;
  }

  /**
   * scope specifies the scope of this rule. Valid values are \&quot;Cluster\&quot;,
   * \&quot;Namespaced\&quot;, and \&quot;*\&quot; \&quot;Cluster\&quot; means that only
   * cluster-scoped resources will match this rule. Namespace API objects are cluster-scoped.
   * \&quot;Namespaced\&quot; means that only namespaced resources will match this rule.
   * \&quot;*\&quot; means that there are no scope restrictions. Subresources match the scope of
   * their parent resource. Default is \&quot;*\&quot;.
   *
   * @return scope
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "scope specifies the scope of this rule. Valid values are \"Cluster\", \"Namespaced\", and \"*\" \"Cluster\" means that only cluster-scoped resources will match this rule. Namespace API objects are cluster-scoped. \"Namespaced\" means that only namespaced resources will match this rule. \"*\" means that there are no scope restrictions. Subresources match the scope of their parent resource. Default is \"*\".")
  public String getScope() {
    return scope;
  }

  public void setScope(String scope) {
    this.scope = scope;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1RuleWithOperations v1RuleWithOperations = (V1RuleWithOperations) o;
    return Objects.equals(this.apiGroups, v1RuleWithOperations.apiGroups)
        && Objects.equals(this.apiVersions, v1RuleWithOperations.apiVersions)
        && Objects.equals(this.operations, v1RuleWithOperations.operations)
        && Objects.equals(this.resources, v1RuleWithOperations.resources)
        && Objects.equals(this.scope, v1RuleWithOperations.scope);
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
   * Convert the given object to string with each line indented by 4 spaces (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
