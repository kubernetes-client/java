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

/** CustomResourceDefinitionNames indicates the names to serve this CustomResourceDefinition */
@ApiModel(
    description =
        "CustomResourceDefinitionNames indicates the names to serve this CustomResourceDefinition")
@javax.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    date = "2022-12-05T08:14:34.919Z[Etc/UTC]")
public class V1CustomResourceDefinitionNames {
  public static final String SERIALIZED_NAME_CATEGORIES = "categories";

  @SerializedName(SERIALIZED_NAME_CATEGORIES)
  private List<String> categories = null;

  public static final String SERIALIZED_NAME_KIND = "kind";

  @SerializedName(SERIALIZED_NAME_KIND)
  private String kind;

  public static final String SERIALIZED_NAME_LIST_KIND = "listKind";

  @SerializedName(SERIALIZED_NAME_LIST_KIND)
  private String listKind;

  public static final String SERIALIZED_NAME_PLURAL = "plural";

  @SerializedName(SERIALIZED_NAME_PLURAL)
  private String plural;

  public static final String SERIALIZED_NAME_SHORT_NAMES = "shortNames";

  @SerializedName(SERIALIZED_NAME_SHORT_NAMES)
  private List<String> shortNames = null;

  public static final String SERIALIZED_NAME_SINGULAR = "singular";

  @SerializedName(SERIALIZED_NAME_SINGULAR)
  private String singular;

  public V1CustomResourceDefinitionNames categories(List<String> categories) {

    this.categories = categories;
    return this;
  }

  public V1CustomResourceDefinitionNames addCategoriesItem(String categoriesItem) {
    if (this.categories == null) {
      this.categories = new ArrayList<>();
    }
    this.categories.add(categoriesItem);
    return this;
  }

  /**
   * categories is a list of grouped resources this custom resource belongs to (e.g. &#39;all&#39;).
   * This is published in API discovery documents, and used by clients to support invocations like
   * &#x60;kubectl get all&#x60;.
   *
   * @return categories
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "categories is a list of grouped resources this custom resource belongs to (e.g. 'all'). This is published in API discovery documents, and used by clients to support invocations like `kubectl get all`.")
  public List<String> getCategories() {
    return categories;
  }

  public void setCategories(List<String> categories) {
    this.categories = categories;
  }

  public V1CustomResourceDefinitionNames kind(String kind) {

    this.kind = kind;
    return this;
  }

  /**
   * kind is the serialized kind of the resource. It is normally CamelCase and singular. Custom
   * resource instances will use this value as the &#x60;kind&#x60; attribute in API calls.
   *
   * @return kind
   */
  @ApiModelProperty(
      required = true,
      value =
          "kind is the serialized kind of the resource. It is normally CamelCase and singular. Custom resource instances will use this value as the `kind` attribute in API calls.")
  public String getKind() {
    return kind;
  }

  public void setKind(String kind) {
    this.kind = kind;
  }

  public V1CustomResourceDefinitionNames listKind(String listKind) {

    this.listKind = listKind;
    return this;
  }

  /**
   * listKind is the serialized kind of the list for this resource. Defaults to
   * \&quot;&#x60;kind&#x60;List\&quot;.
   *
   * @return listKind
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "listKind is the serialized kind of the list for this resource. Defaults to \"`kind`List\".")
  public String getListKind() {
    return listKind;
  }

  public void setListKind(String listKind) {
    this.listKind = listKind;
  }

  public V1CustomResourceDefinitionNames plural(String plural) {

    this.plural = plural;
    return this;
  }

  /**
   * plural is the plural name of the resource to serve. The custom resources are served under
   * &#x60;/apis/&lt;group&gt;/&lt;version&gt;/.../&lt;plural&gt;&#x60;. Must match the name of the
   * CustomResourceDefinition (in the form &#x60;&lt;names.plural&gt;.&lt;group&gt;&#x60;). Must be
   * all lowercase.
   *
   * @return plural
   */
  @ApiModelProperty(
      required = true,
      value =
          "plural is the plural name of the resource to serve. The custom resources are served under `/apis/<group>/<version>/.../<plural>`. Must match the name of the CustomResourceDefinition (in the form `<names.plural>.<group>`). Must be all lowercase.")
  public String getPlural() {
    return plural;
  }

  public void setPlural(String plural) {
    this.plural = plural;
  }

  public V1CustomResourceDefinitionNames shortNames(List<String> shortNames) {

    this.shortNames = shortNames;
    return this;
  }

  public V1CustomResourceDefinitionNames addShortNamesItem(String shortNamesItem) {
    if (this.shortNames == null) {
      this.shortNames = new ArrayList<>();
    }
    this.shortNames.add(shortNamesItem);
    return this;
  }

  /**
   * shortNames are short names for the resource, exposed in API discovery documents, and used by
   * clients to support invocations like &#x60;kubectl get &lt;shortname&gt;&#x60;. It must be all
   * lowercase.
   *
   * @return shortNames
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "shortNames are short names for the resource, exposed in API discovery documents, and used by clients to support invocations like `kubectl get <shortname>`. It must be all lowercase.")
  public List<String> getShortNames() {
    return shortNames;
  }

  public void setShortNames(List<String> shortNames) {
    this.shortNames = shortNames;
  }

  public V1CustomResourceDefinitionNames singular(String singular) {

    this.singular = singular;
    return this;
  }

  /**
   * singular is the singular name of the resource. It must be all lowercase. Defaults to lowercased
   * &#x60;kind&#x60;.
   *
   * @return singular
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "singular is the singular name of the resource. It must be all lowercase. Defaults to lowercased `kind`.")
  public String getSingular() {
    return singular;
  }

  public void setSingular(String singular) {
    this.singular = singular;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1CustomResourceDefinitionNames v1CustomResourceDefinitionNames =
        (V1CustomResourceDefinitionNames) o;
    return Objects.equals(this.categories, v1CustomResourceDefinitionNames.categories)
        && Objects.equals(this.kind, v1CustomResourceDefinitionNames.kind)
        && Objects.equals(this.listKind, v1CustomResourceDefinitionNames.listKind)
        && Objects.equals(this.plural, v1CustomResourceDefinitionNames.plural)
        && Objects.equals(this.shortNames, v1CustomResourceDefinitionNames.shortNames)
        && Objects.equals(this.singular, v1CustomResourceDefinitionNames.singular);
  }

  @Override
  public int hashCode() {
    return Objects.hash(categories, kind, listKind, plural, shortNames, singular);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1CustomResourceDefinitionNames {\n");
    sb.append("    categories: ").append(toIndentedString(categories)).append("\n");
    sb.append("    kind: ").append(toIndentedString(kind)).append("\n");
    sb.append("    listKind: ").append(toIndentedString(listKind)).append("\n");
    sb.append("    plural: ").append(toIndentedString(plural)).append("\n");
    sb.append("    shortNames: ").append(toIndentedString(shortNames)).append("\n");
    sb.append("    singular: ").append(toIndentedString(singular)).append("\n");
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
