/*
Copyright 2021 The Kubernetes Authors.
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
    date = "2021-01-04T09:55:14.976Z[Etc/UTC]")
public class V1beta1CustomResourceDefinitionSpec {
  public static final String SERIALIZED_NAME_ADDITIONAL_PRINTER_COLUMNS =
      "additionalPrinterColumns";

  @SerializedName(SERIALIZED_NAME_ADDITIONAL_PRINTER_COLUMNS)
  private List<V1beta1CustomResourceColumnDefinition> additionalPrinterColumns = null;

  public static final String SERIALIZED_NAME_CONVERSION = "conversion";

  @SerializedName(SERIALIZED_NAME_CONVERSION)
  private V1beta1CustomResourceConversion conversion;

  public static final String SERIALIZED_NAME_GROUP = "group";

  @SerializedName(SERIALIZED_NAME_GROUP)
  private String group;

  public static final String SERIALIZED_NAME_NAMES = "names";

  @SerializedName(SERIALIZED_NAME_NAMES)
  private V1beta1CustomResourceDefinitionNames names;

  public static final String SERIALIZED_NAME_PRESERVE_UNKNOWN_FIELDS = "preserveUnknownFields";

  @SerializedName(SERIALIZED_NAME_PRESERVE_UNKNOWN_FIELDS)
  private Boolean preserveUnknownFields;

  public static final String SERIALIZED_NAME_SCOPE = "scope";

  @SerializedName(SERIALIZED_NAME_SCOPE)
  private String scope;

  public static final String SERIALIZED_NAME_SUBRESOURCES = "subresources";

  @SerializedName(SERIALIZED_NAME_SUBRESOURCES)
  private V1beta1CustomResourceSubresources subresources;

  public static final String SERIALIZED_NAME_VALIDATION = "validation";

  @SerializedName(SERIALIZED_NAME_VALIDATION)
  private V1beta1CustomResourceValidation validation;

  public static final String SERIALIZED_NAME_VERSION = "version";

  @SerializedName(SERIALIZED_NAME_VERSION)
  private String version;

  public static final String SERIALIZED_NAME_VERSIONS = "versions";

  @SerializedName(SERIALIZED_NAME_VERSIONS)
  private List<V1beta1CustomResourceDefinitionVersion> versions = null;

  public V1beta1CustomResourceDefinitionSpec additionalPrinterColumns(
      List<V1beta1CustomResourceColumnDefinition> additionalPrinterColumns) {

    this.additionalPrinterColumns = additionalPrinterColumns;
    return this;
  }

  public V1beta1CustomResourceDefinitionSpec addAdditionalPrinterColumnsItem(
      V1beta1CustomResourceColumnDefinition additionalPrinterColumnsItem) {
    if (this.additionalPrinterColumns == null) {
      this.additionalPrinterColumns = new ArrayList<>();
    }
    this.additionalPrinterColumns.add(additionalPrinterColumnsItem);
    return this;
  }

  /**
   * additionalPrinterColumns specifies additional columns returned in Table output. See
   * https://kubernetes.io/docs/reference/using-api/api-concepts/#receiving-resources-as-tables for
   * details. If present, this field configures columns for all versions. Top-level and per-version
   * columns are mutually exclusive. If no top-level or per-version columns are specified, a single
   * column displaying the age of the custom resource is used.
   *
   * @return additionalPrinterColumns
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "additionalPrinterColumns specifies additional columns returned in Table output. See https://kubernetes.io/docs/reference/using-api/api-concepts/#receiving-resources-as-tables for details. If present, this field configures columns for all versions. Top-level and per-version columns are mutually exclusive. If no top-level or per-version columns are specified, a single column displaying the age of the custom resource is used.")
  public List<V1beta1CustomResourceColumnDefinition> getAdditionalPrinterColumns() {
    return additionalPrinterColumns;
  }

  public void setAdditionalPrinterColumns(
      List<V1beta1CustomResourceColumnDefinition> additionalPrinterColumns) {
    this.additionalPrinterColumns = additionalPrinterColumns;
  }

  public V1beta1CustomResourceDefinitionSpec conversion(
      V1beta1CustomResourceConversion conversion) {

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
  public V1beta1CustomResourceConversion getConversion() {
    return conversion;
  }

  public void setConversion(V1beta1CustomResourceConversion conversion) {
    this.conversion = conversion;
  }

  public V1beta1CustomResourceDefinitionSpec group(String group) {

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

  public V1beta1CustomResourceDefinitionSpec names(V1beta1CustomResourceDefinitionNames names) {

    this.names = names;
    return this;
  }

  /**
   * Get names
   *
   * @return names
   */
  @ApiModelProperty(required = true, value = "")
  public V1beta1CustomResourceDefinitionNames getNames() {
    return names;
  }

  public void setNames(V1beta1CustomResourceDefinitionNames names) {
    this.names = names;
  }

  public V1beta1CustomResourceDefinitionSpec preserveUnknownFields(Boolean preserveUnknownFields) {

    this.preserveUnknownFields = preserveUnknownFields;
    return this;
  }

  /**
   * preserveUnknownFields indicates that object fields which are not specified in the OpenAPI
   * schema should be preserved when persisting to storage. apiVersion, kind, metadata and known
   * fields inside metadata are always preserved. If false, schemas must be defined for all
   * versions. Defaults to true in v1beta for backwards compatibility. Deprecated: will be required
   * to be false in v1. Preservation of unknown fields can be specified in the validation schema
   * using the &#x60;x-kubernetes-preserve-unknown-fields: true&#x60; extension. See
   * https://kubernetes.io/docs/tasks/access-kubernetes-api/custom-resources/custom-resource-definitions/#pruning-versus-preserving-unknown-fields
   * for details.
   *
   * @return preserveUnknownFields
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "preserveUnknownFields indicates that object fields which are not specified in the OpenAPI schema should be preserved when persisting to storage. apiVersion, kind, metadata and known fields inside metadata are always preserved. If false, schemas must be defined for all versions. Defaults to true in v1beta for backwards compatibility. Deprecated: will be required to be false in v1. Preservation of unknown fields can be specified in the validation schema using the `x-kubernetes-preserve-unknown-fields: true` extension. See https://kubernetes.io/docs/tasks/access-kubernetes-api/custom-resources/custom-resource-definitions/#pruning-versus-preserving-unknown-fields for details.")
  public Boolean getPreserveUnknownFields() {
    return preserveUnknownFields;
  }

  public void setPreserveUnknownFields(Boolean preserveUnknownFields) {
    this.preserveUnknownFields = preserveUnknownFields;
  }

  public V1beta1CustomResourceDefinitionSpec scope(String scope) {

    this.scope = scope;
    return this;
  }

  /**
   * scope indicates whether the defined custom resource is cluster- or namespace-scoped. Allowed
   * values are &#x60;Cluster&#x60; and &#x60;Namespaced&#x60;. Default is &#x60;Namespaced&#x60;.
   *
   * @return scope
   */
  @ApiModelProperty(
      required = true,
      value =
          "scope indicates whether the defined custom resource is cluster- or namespace-scoped. Allowed values are `Cluster` and `Namespaced`. Default is `Namespaced`.")
  public String getScope() {
    return scope;
  }

  public void setScope(String scope) {
    this.scope = scope;
  }

  public V1beta1CustomResourceDefinitionSpec subresources(
      V1beta1CustomResourceSubresources subresources) {

    this.subresources = subresources;
    return this;
  }

  /**
   * Get subresources
   *
   * @return subresources
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  public V1beta1CustomResourceSubresources getSubresources() {
    return subresources;
  }

  public void setSubresources(V1beta1CustomResourceSubresources subresources) {
    this.subresources = subresources;
  }

  public V1beta1CustomResourceDefinitionSpec validation(
      V1beta1CustomResourceValidation validation) {

    this.validation = validation;
    return this;
  }

  /**
   * Get validation
   *
   * @return validation
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  public V1beta1CustomResourceValidation getValidation() {
    return validation;
  }

  public void setValidation(V1beta1CustomResourceValidation validation) {
    this.validation = validation;
  }

  public V1beta1CustomResourceDefinitionSpec version(String version) {

    this.version = version;
    return this;
  }

  /**
   * version is the API version of the defined custom resource. The custom resources are served
   * under &#x60;/apis/&lt;group&gt;/&lt;version&gt;/...&#x60;. Must match the name of the first
   * item in the &#x60;versions&#x60; list if &#x60;version&#x60; and &#x60;versions&#x60; are both
   * specified. Optional if &#x60;versions&#x60; is specified. Deprecated: use &#x60;versions&#x60;
   * instead.
   *
   * @return version
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "version is the API version of the defined custom resource. The custom resources are served under `/apis/<group>/<version>/...`. Must match the name of the first item in the `versions` list if `version` and `versions` are both specified. Optional if `versions` is specified. Deprecated: use `versions` instead.")
  public String getVersion() {
    return version;
  }

  public void setVersion(String version) {
    this.version = version;
  }

  public V1beta1CustomResourceDefinitionSpec versions(
      List<V1beta1CustomResourceDefinitionVersion> versions) {

    this.versions = versions;
    return this;
  }

  public V1beta1CustomResourceDefinitionSpec addVersionsItem(
      V1beta1CustomResourceDefinitionVersion versionsItem) {
    if (this.versions == null) {
      this.versions = new ArrayList<>();
    }
    this.versions.add(versionsItem);
    return this;
  }

  /**
   * versions is the list of all API versions of the defined custom resource. Optional if
   * &#x60;version&#x60; is specified. The name of the first item in the &#x60;versions&#x60; list
   * must match the &#x60;version&#x60; field if &#x60;version&#x60; and &#x60;versions&#x60; are
   * both specified. Version names are used to compute the order in which served versions are listed
   * in API discovery. If the version string is \&quot;kube-like\&quot;, it will sort above non
   * \&quot;kube-like\&quot; version strings, which are ordered lexicographically.
   * \&quot;Kube-like\&quot; versions start with a \&quot;v\&quot;, then are followed by a number
   * (the major version), then optionally the string \&quot;alpha\&quot; or \&quot;beta\&quot; and
   * another number (the minor version). These are sorted first by GA &gt; beta &gt; alpha (where GA
   * is a version with no suffix such as beta or alpha), and then by comparing major version, then
   * minor version. An example sorted list of versions: v10, v2, v1, v11beta2, v10beta3, v3beta1,
   * v12alpha1, v11alpha2, foo1, foo10.
   *
   * @return versions
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "versions is the list of all API versions of the defined custom resource. Optional if `version` is specified. The name of the first item in the `versions` list must match the `version` field if `version` and `versions` are both specified. Version names are used to compute the order in which served versions are listed in API discovery. If the version string is \"kube-like\", it will sort above non \"kube-like\" version strings, which are ordered lexicographically. \"Kube-like\" versions start with a \"v\", then are followed by a number (the major version), then optionally the string \"alpha\" or \"beta\" and another number (the minor version). These are sorted first by GA > beta > alpha (where GA is a version with no suffix such as beta or alpha), and then by comparing major version, then minor version. An example sorted list of versions: v10, v2, v1, v11beta2, v10beta3, v3beta1, v12alpha1, v11alpha2, foo1, foo10.")
  public List<V1beta1CustomResourceDefinitionVersion> getVersions() {
    return versions;
  }

  public void setVersions(List<V1beta1CustomResourceDefinitionVersion> versions) {
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
    V1beta1CustomResourceDefinitionSpec v1beta1CustomResourceDefinitionSpec =
        (V1beta1CustomResourceDefinitionSpec) o;
    return Objects.equals(
            this.additionalPrinterColumns,
            v1beta1CustomResourceDefinitionSpec.additionalPrinterColumns)
        && Objects.equals(this.conversion, v1beta1CustomResourceDefinitionSpec.conversion)
        && Objects.equals(this.group, v1beta1CustomResourceDefinitionSpec.group)
        && Objects.equals(this.names, v1beta1CustomResourceDefinitionSpec.names)
        && Objects.equals(
            this.preserveUnknownFields, v1beta1CustomResourceDefinitionSpec.preserveUnknownFields)
        && Objects.equals(this.scope, v1beta1CustomResourceDefinitionSpec.scope)
        && Objects.equals(this.subresources, v1beta1CustomResourceDefinitionSpec.subresources)
        && Objects.equals(this.validation, v1beta1CustomResourceDefinitionSpec.validation)
        && Objects.equals(this.version, v1beta1CustomResourceDefinitionSpec.version)
        && Objects.equals(this.versions, v1beta1CustomResourceDefinitionSpec.versions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        additionalPrinterColumns,
        conversion,
        group,
        names,
        preserveUnknownFields,
        scope,
        subresources,
        validation,
        version,
        versions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1beta1CustomResourceDefinitionSpec {\n");
    sb.append("    additionalPrinterColumns: ")
        .append(toIndentedString(additionalPrinterColumns))
        .append("\n");
    sb.append("    conversion: ").append(toIndentedString(conversion)).append("\n");
    sb.append("    group: ").append(toIndentedString(group)).append("\n");
    sb.append("    names: ").append(toIndentedString(names)).append("\n");
    sb.append("    preserveUnknownFields: ")
        .append(toIndentedString(preserveUnknownFields))
        .append("\n");
    sb.append("    scope: ").append(toIndentedString(scope)).append("\n");
    sb.append("    subresources: ").append(toIndentedString(subresources)).append("\n");
    sb.append("    validation: ").append(toIndentedString(validation)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
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
