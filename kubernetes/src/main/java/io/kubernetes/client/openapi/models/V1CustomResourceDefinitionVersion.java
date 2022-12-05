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

/** CustomResourceDefinitionVersion describes a version for CRD. */
@ApiModel(description = "CustomResourceDefinitionVersion describes a version for CRD.")
@javax.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    date = "2022-12-05T08:14:34.919Z[Etc/UTC]")
public class V1CustomResourceDefinitionVersion {
  public static final String SERIALIZED_NAME_ADDITIONAL_PRINTER_COLUMNS =
      "additionalPrinterColumns";

  @SerializedName(SERIALIZED_NAME_ADDITIONAL_PRINTER_COLUMNS)
  private List<V1CustomResourceColumnDefinition> additionalPrinterColumns = null;

  public static final String SERIALIZED_NAME_DEPRECATED = "deprecated";

  @SerializedName(SERIALIZED_NAME_DEPRECATED)
  private Boolean deprecated;

  public static final String SERIALIZED_NAME_DEPRECATION_WARNING = "deprecationWarning";

  @SerializedName(SERIALIZED_NAME_DEPRECATION_WARNING)
  private String deprecationWarning;

  public static final String SERIALIZED_NAME_NAME = "name";

  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_SCHEMA = "schema";

  @SerializedName(SERIALIZED_NAME_SCHEMA)
  private V1CustomResourceValidation schema;

  public static final String SERIALIZED_NAME_SERVED = "served";

  @SerializedName(SERIALIZED_NAME_SERVED)
  private Boolean served;

  public static final String SERIALIZED_NAME_STORAGE = "storage";

  @SerializedName(SERIALIZED_NAME_STORAGE)
  private Boolean storage;

  public static final String SERIALIZED_NAME_SUBRESOURCES = "subresources";

  @SerializedName(SERIALIZED_NAME_SUBRESOURCES)
  private V1CustomResourceSubresources subresources;

  public V1CustomResourceDefinitionVersion additionalPrinterColumns(
      List<V1CustomResourceColumnDefinition> additionalPrinterColumns) {

    this.additionalPrinterColumns = additionalPrinterColumns;
    return this;
  }

  public V1CustomResourceDefinitionVersion addAdditionalPrinterColumnsItem(
      V1CustomResourceColumnDefinition additionalPrinterColumnsItem) {
    if (this.additionalPrinterColumns == null) {
      this.additionalPrinterColumns = new ArrayList<>();
    }
    this.additionalPrinterColumns.add(additionalPrinterColumnsItem);
    return this;
  }

  /**
   * additionalPrinterColumns specifies additional columns returned in Table output. See
   * https://kubernetes.io/docs/reference/using-api/api-concepts/#receiving-resources-as-tables for
   * details. If no columns are specified, a single column displaying the age of the custom resource
   * is used.
   *
   * @return additionalPrinterColumns
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "additionalPrinterColumns specifies additional columns returned in Table output. See https://kubernetes.io/docs/reference/using-api/api-concepts/#receiving-resources-as-tables for details. If no columns are specified, a single column displaying the age of the custom resource is used.")
  public List<V1CustomResourceColumnDefinition> getAdditionalPrinterColumns() {
    return additionalPrinterColumns;
  }

  public void setAdditionalPrinterColumns(
      List<V1CustomResourceColumnDefinition> additionalPrinterColumns) {
    this.additionalPrinterColumns = additionalPrinterColumns;
  }

  public V1CustomResourceDefinitionVersion deprecated(Boolean deprecated) {

    this.deprecated = deprecated;
    return this;
  }

  /**
   * deprecated indicates this version of the custom resource API is deprecated. When set to true,
   * API requests to this version receive a warning header in the server response. Defaults to
   * false.
   *
   * @return deprecated
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "deprecated indicates this version of the custom resource API is deprecated. When set to true, API requests to this version receive a warning header in the server response. Defaults to false.")
  public Boolean getDeprecated() {
    return deprecated;
  }

  public void setDeprecated(Boolean deprecated) {
    this.deprecated = deprecated;
  }

  public V1CustomResourceDefinitionVersion deprecationWarning(String deprecationWarning) {

    this.deprecationWarning = deprecationWarning;
    return this;
  }

  /**
   * deprecationWarning overrides the default warning returned to API clients. May only be set when
   * &#x60;deprecated&#x60; is true. The default warning indicates this version is deprecated and
   * recommends use of the newest served version of equal or greater stability, if one exists.
   *
   * @return deprecationWarning
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "deprecationWarning overrides the default warning returned to API clients. May only be set when `deprecated` is true. The default warning indicates this version is deprecated and recommends use of the newest served version of equal or greater stability, if one exists.")
  public String getDeprecationWarning() {
    return deprecationWarning;
  }

  public void setDeprecationWarning(String deprecationWarning) {
    this.deprecationWarning = deprecationWarning;
  }

  public V1CustomResourceDefinitionVersion name(String name) {

    this.name = name;
    return this;
  }

  /**
   * name is the version name, e.g. “v1”, “v2beta1”, etc. The custom resources are served under this
   * version at &#x60;/apis/&lt;group&gt;/&lt;version&gt;/...&#x60; if &#x60;served&#x60; is true.
   *
   * @return name
   */
  @ApiModelProperty(
      required = true,
      value =
          "name is the version name, e.g. “v1”, “v2beta1”, etc. The custom resources are served under this version at `/apis/<group>/<version>/...` if `served` is true.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public V1CustomResourceDefinitionVersion schema(V1CustomResourceValidation schema) {

    this.schema = schema;
    return this;
  }

  /**
   * Get schema
   *
   * @return schema
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  public V1CustomResourceValidation getSchema() {
    return schema;
  }

  public void setSchema(V1CustomResourceValidation schema) {
    this.schema = schema;
  }

  public V1CustomResourceDefinitionVersion served(Boolean served) {

    this.served = served;
    return this;
  }

  /**
   * served is a flag enabling/disabling this version from being served via REST APIs
   *
   * @return served
   */
  @ApiModelProperty(
      required = true,
      value = "served is a flag enabling/disabling this version from being served via REST APIs")
  public Boolean getServed() {
    return served;
  }

  public void setServed(Boolean served) {
    this.served = served;
  }

  public V1CustomResourceDefinitionVersion storage(Boolean storage) {

    this.storage = storage;
    return this;
  }

  /**
   * storage indicates this version should be used when persisting custom resources to storage.
   * There must be exactly one version with storage&#x3D;true.
   *
   * @return storage
   */
  @ApiModelProperty(
      required = true,
      value =
          "storage indicates this version should be used when persisting custom resources to storage. There must be exactly one version with storage=true.")
  public Boolean getStorage() {
    return storage;
  }

  public void setStorage(Boolean storage) {
    this.storage = storage;
  }

  public V1CustomResourceDefinitionVersion subresources(V1CustomResourceSubresources subresources) {

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
  public V1CustomResourceSubresources getSubresources() {
    return subresources;
  }

  public void setSubresources(V1CustomResourceSubresources subresources) {
    this.subresources = subresources;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1CustomResourceDefinitionVersion v1CustomResourceDefinitionVersion =
        (V1CustomResourceDefinitionVersion) o;
    return Objects.equals(
            this.additionalPrinterColumns,
            v1CustomResourceDefinitionVersion.additionalPrinterColumns)
        && Objects.equals(this.deprecated, v1CustomResourceDefinitionVersion.deprecated)
        && Objects.equals(
            this.deprecationWarning, v1CustomResourceDefinitionVersion.deprecationWarning)
        && Objects.equals(this.name, v1CustomResourceDefinitionVersion.name)
        && Objects.equals(this.schema, v1CustomResourceDefinitionVersion.schema)
        && Objects.equals(this.served, v1CustomResourceDefinitionVersion.served)
        && Objects.equals(this.storage, v1CustomResourceDefinitionVersion.storage)
        && Objects.equals(this.subresources, v1CustomResourceDefinitionVersion.subresources);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        additionalPrinterColumns,
        deprecated,
        deprecationWarning,
        name,
        schema,
        served,
        storage,
        subresources);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1CustomResourceDefinitionVersion {\n");
    sb.append("    additionalPrinterColumns: ")
        .append(toIndentedString(additionalPrinterColumns))
        .append("\n");
    sb.append("    deprecated: ").append(toIndentedString(deprecated)).append("\n");
    sb.append("    deprecationWarning: ").append(toIndentedString(deprecationWarning)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    schema: ").append(toIndentedString(schema)).append("\n");
    sb.append("    served: ").append(toIndentedString(served)).append("\n");
    sb.append("    storage: ").append(toIndentedString(storage)).append("\n");
    sb.append("    subresources: ").append(toIndentedString(subresources)).append("\n");
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
