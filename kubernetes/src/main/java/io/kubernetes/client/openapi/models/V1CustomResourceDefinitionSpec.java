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

/** CustomResourceDefinitionSpec describes how a user wants their resource to appear */
@ApiModel(
    description =
        "CustomResourceDefinitionSpec describes how a user wants their resource to appear")
@javax.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    date = "2022-12-05T08:14:34.919Z[Etc/UTC]")
public class V1CustomResourceDefinitionSpec {
  public static final String SERIALIZED_NAME_CONVERSION = "conversion";

  @SerializedName(SERIALIZED_NAME_CONVERSION)
  private V1CustomResourceConversion conversion;

  public static final String SERIALIZED_NAME_GROUP = "group";

  @SerializedName(SERIALIZED_NAME_GROUP)
  private String group;

  public static final String SERIALIZED_NAME_NAMES = "names";

  @SerializedName(SERIALIZED_NAME_NAMES)
  private V1CustomResourceDefinitionNames names;

  public static final String SERIALIZED_NAME_PRESERVE_UNKNOWN_FIELDS = "preserveUnknownFields";

  @SerializedName(SERIALIZED_NAME_PRESERVE_UNKNOWN_FIELDS)
  private Boolean preserveUnknownFields;

  public static final String SERIALIZED_NAME_SCOPE = "scope";

  @SerializedName(SERIALIZED_NAME_SCOPE)
  private String scope;

  public static final String SERIALIZED_NAME_VERSIONS = "versions";

  @SerializedName(SERIALIZED_NAME_VERSIONS)
  private List<V1CustomResourceDefinitionVersion> versions = new ArrayList<>();

  public V1CustomResourceDefinitionSpec conversion(V1CustomResourceConversion conversion) {

    this.conversion = conversion;
    return this;
  }

  /**
   * Get conversion
   *
   * @return conversion
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  public V1CustomResourceConversion getConversion() {
    return conversion;
  }

  public void setConversion(V1CustomResourceConversion conversion) {
    this.conversion = conversion;
  }

  public V1CustomResourceDefinitionSpec group(String group) {

    this.group = group;
    return this;
  }

  /**
   * group is the API group of the defined custom resource. The custom resources are served under
   * &#x60;/apis/&lt;group&gt;/...&#x60;. Must match the name of the CustomResourceDefinition (in
   * the form &#x60;&lt;names.plural&gt;.&lt;group&gt;&#x60;).
   *
   * @return group
   */
  @ApiModelProperty(
      required = true,
      value =
          "group is the API group of the defined custom resource. The custom resources are served under `/apis/<group>/...`. Must match the name of the CustomResourceDefinition (in the form `<names.plural>.<group>`).")
  public String getGroup() {
    return group;
  }

  public void setGroup(String group) {
    this.group = group;
  }

  public V1CustomResourceDefinitionSpec names(V1CustomResourceDefinitionNames names) {

    this.names = names;
    return this;
  }

  /**
   * Get names
   *
   * @return names
   */
  @ApiModelProperty(required = true, value = "")
  public V1CustomResourceDefinitionNames getNames() {
    return names;
  }

  public void setNames(V1CustomResourceDefinitionNames names) {
    this.names = names;
  }

  public V1CustomResourceDefinitionSpec preserveUnknownFields(Boolean preserveUnknownFields) {

    this.preserveUnknownFields = preserveUnknownFields;
    return this;
  }

  /**
   * preserveUnknownFields indicates that object fields which are not specified in the OpenAPI
   * schema should be preserved when persisting to storage. apiVersion, kind, metadata and known
   * fields inside metadata are always preserved. This field is deprecated in favor of setting
   * &#x60;x-preserve-unknown-fields&#x60; to true in
   * &#x60;spec.versions[*].schema.openAPIV3Schema&#x60;. See
   * https://kubernetes.io/docs/tasks/access-kubernetes-api/custom-resources/custom-resource-definitions/#pruning-versus-preserving-unknown-fields
   * for details.
   *
   * @return preserveUnknownFields
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "preserveUnknownFields indicates that object fields which are not specified in the OpenAPI schema should be preserved when persisting to storage. apiVersion, kind, metadata and known fields inside metadata are always preserved. This field is deprecated in favor of setting `x-preserve-unknown-fields` to true in `spec.versions[*].schema.openAPIV3Schema`. See https://kubernetes.io/docs/tasks/access-kubernetes-api/custom-resources/custom-resource-definitions/#pruning-versus-preserving-unknown-fields for details.")
  public Boolean getPreserveUnknownFields() {
    return preserveUnknownFields;
  }

  public void setPreserveUnknownFields(Boolean preserveUnknownFields) {
    this.preserveUnknownFields = preserveUnknownFields;
  }

  public V1CustomResourceDefinitionSpec scope(String scope) {

    this.scope = scope;
    return this;
  }

  /**
   * scope indicates whether the defined custom resource is cluster- or namespace-scoped. Allowed
   * values are &#x60;Cluster&#x60; and &#x60;Namespaced&#x60;.
   *
   * @return scope
   */
  @ApiModelProperty(
      required = true,
      value =
          "scope indicates whether the defined custom resource is cluster- or namespace-scoped. Allowed values are `Cluster` and `Namespaced`.")
  public String getScope() {
    return scope;
  }

  public void setScope(String scope) {
    this.scope = scope;
  }

  public V1CustomResourceDefinitionSpec versions(List<V1CustomResourceDefinitionVersion> versions) {

    this.versions = versions;
    return this;
  }

  public V1CustomResourceDefinitionSpec addVersionsItem(
      V1CustomResourceDefinitionVersion versionsItem) {
    this.versions.add(versionsItem);
    return this;
  }

  /**
   * versions is the list of all API versions of the defined custom resource. Version names are used
   * to compute the order in which served versions are listed in API discovery. If the version
   * string is \&quot;kube-like\&quot;, it will sort above non \&quot;kube-like\&quot; version
   * strings, which are ordered lexicographically. \&quot;Kube-like\&quot; versions start with a
   * \&quot;v\&quot;, then are followed by a number (the major version), then optionally the string
   * \&quot;alpha\&quot; or \&quot;beta\&quot; and another number (the minor version). These are
   * sorted first by GA &gt; beta &gt; alpha (where GA is a version with no suffix such as beta or
   * alpha), and then by comparing major version, then minor version. An example sorted list of
   * versions: v10, v2, v1, v11beta2, v10beta3, v3beta1, v12alpha1, v11alpha2, foo1, foo10.
   *
   * @return versions
   */
  @ApiModelProperty(
      required = true,
      value =
          "versions is the list of all API versions of the defined custom resource. Version names are used to compute the order in which served versions are listed in API discovery. If the version string is \"kube-like\", it will sort above non \"kube-like\" version strings, which are ordered lexicographically. \"Kube-like\" versions start with a \"v\", then are followed by a number (the major version), then optionally the string \"alpha\" or \"beta\" and another number (the minor version). These are sorted first by GA > beta > alpha (where GA is a version with no suffix such as beta or alpha), and then by comparing major version, then minor version. An example sorted list of versions: v10, v2, v1, v11beta2, v10beta3, v3beta1, v12alpha1, v11alpha2, foo1, foo10.")
  public List<V1CustomResourceDefinitionVersion> getVersions() {
    return versions;
  }

  public void setVersions(List<V1CustomResourceDefinitionVersion> versions) {
    this.versions = versions;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1CustomResourceDefinitionSpec v1CustomResourceDefinitionSpec =
        (V1CustomResourceDefinitionSpec) o;
    return Objects.equals(this.conversion, v1CustomResourceDefinitionSpec.conversion)
        && Objects.equals(this.group, v1CustomResourceDefinitionSpec.group)
        && Objects.equals(this.names, v1CustomResourceDefinitionSpec.names)
        && Objects.equals(
            this.preserveUnknownFields, v1CustomResourceDefinitionSpec.preserveUnknownFields)
        && Objects.equals(this.scope, v1CustomResourceDefinitionSpec.scope)
        && Objects.equals(this.versions, v1CustomResourceDefinitionSpec.versions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(conversion, group, names, preserveUnknownFields, scope, versions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1CustomResourceDefinitionSpec {\n");
    sb.append("    conversion: ").append(toIndentedString(conversion)).append("\n");
    sb.append("    group: ").append(toIndentedString(group)).append("\n");
    sb.append("    names: ").append(toIndentedString(names)).append("\n");
    sb.append("    preserveUnknownFields: ")
        .append(toIndentedString(preserveUnknownFields))
        .append("\n");
    sb.append("    scope: ").append(toIndentedString(scope)).append("\n");
    sb.append("    versions: ").append(toIndentedString(versions)).append("\n");
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
