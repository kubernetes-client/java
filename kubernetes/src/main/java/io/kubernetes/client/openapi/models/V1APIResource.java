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

/** APIResource specifies the name of a resource and whether it is namespaced. */
@ApiModel(
    description = "APIResource specifies the name of a resource and whether it is namespaced.")
@javax.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    date = "2022-12-05T08:14:34.919Z[Etc/UTC]")
public class V1APIResource {
  public static final String SERIALIZED_NAME_CATEGORIES = "categories";

  @SerializedName(SERIALIZED_NAME_CATEGORIES)
  private List<String> categories = null;

  public static final String SERIALIZED_NAME_GROUP = "group";

  @SerializedName(SERIALIZED_NAME_GROUP)
  private String group;

  public static final String SERIALIZED_NAME_KIND = "kind";

  @SerializedName(SERIALIZED_NAME_KIND)
  private String kind;

  public static final String SERIALIZED_NAME_NAME = "name";

  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_NAMESPACED = "namespaced";

  @SerializedName(SERIALIZED_NAME_NAMESPACED)
  private Boolean namespaced;

  public static final String SERIALIZED_NAME_SHORT_NAMES = "shortNames";

  @SerializedName(SERIALIZED_NAME_SHORT_NAMES)
  private List<String> shortNames = null;

  public static final String SERIALIZED_NAME_SINGULAR_NAME = "singularName";

  @SerializedName(SERIALIZED_NAME_SINGULAR_NAME)
  private String singularName;

  public static final String SERIALIZED_NAME_STORAGE_VERSION_HASH = "storageVersionHash";

  @SerializedName(SERIALIZED_NAME_STORAGE_VERSION_HASH)
  private String storageVersionHash;

  public static final String SERIALIZED_NAME_VERBS = "verbs";

  @SerializedName(SERIALIZED_NAME_VERBS)
  private List<String> verbs = new ArrayList<>();

  public static final String SERIALIZED_NAME_VERSION = "version";

  @SerializedName(SERIALIZED_NAME_VERSION)
  private String version;

  public V1APIResource categories(List<String> categories) {

    this.categories = categories;
    return this;
  }

  public V1APIResource addCategoriesItem(String categoriesItem) {
    if (this.categories == null) {
      this.categories = new ArrayList<>();
    }
    this.categories.add(categoriesItem);
    return this;
  }

  /**
   * categories is a list of the grouped resources this resource belongs to (e.g. &#39;all&#39;)
   *
   * @return categories
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value = "categories is a list of the grouped resources this resource belongs to (e.g. 'all')")
  public List<String> getCategories() {
    return categories;
  }

  public void setCategories(List<String> categories) {
    this.categories = categories;
  }

  public V1APIResource group(String group) {

    this.group = group;
    return this;
  }

  /**
   * group is the preferred group of the resource. Empty implies the group of the containing
   * resource list. For subresources, this may have a different value, for example: Scale\&quot;.
   *
   * @return group
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "group is the preferred group of the resource.  Empty implies the group of the containing resource list. For subresources, this may have a different value, for example: Scale\".")
  public String getGroup() {
    return group;
  }

  public void setGroup(String group) {
    this.group = group;
  }

  public V1APIResource kind(String kind) {

    this.kind = kind;
    return this;
  }

  /**
   * kind is the kind for the resource (e.g. &#39;Foo&#39; is the kind for a resource &#39;foo&#39;)
   *
   * @return kind
   */
  @ApiModelProperty(
      required = true,
      value = "kind is the kind for the resource (e.g. 'Foo' is the kind for a resource 'foo')")
  public String getKind() {
    return kind;
  }

  public void setKind(String kind) {
    this.kind = kind;
  }

  public V1APIResource name(String name) {

    this.name = name;
    return this;
  }

  /**
   * name is the plural name of the resource.
   *
   * @return name
   */
  @ApiModelProperty(required = true, value = "name is the plural name of the resource.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public V1APIResource namespaced(Boolean namespaced) {

    this.namespaced = namespaced;
    return this;
  }

  /**
   * namespaced indicates if a resource is namespaced or not.
   *
   * @return namespaced
   */
  @ApiModelProperty(
      required = true,
      value = "namespaced indicates if a resource is namespaced or not.")
  public Boolean getNamespaced() {
    return namespaced;
  }

  public void setNamespaced(Boolean namespaced) {
    this.namespaced = namespaced;
  }

  public V1APIResource shortNames(List<String> shortNames) {

    this.shortNames = shortNames;
    return this;
  }

  public V1APIResource addShortNamesItem(String shortNamesItem) {
    if (this.shortNames == null) {
      this.shortNames = new ArrayList<>();
    }
    this.shortNames.add(shortNamesItem);
    return this;
  }

  /**
   * shortNames is a list of suggested short names of the resource.
   *
   * @return shortNames
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "shortNames is a list of suggested short names of the resource.")
  public List<String> getShortNames() {
    return shortNames;
  }

  public void setShortNames(List<String> shortNames) {
    this.shortNames = shortNames;
  }

  public V1APIResource singularName(String singularName) {

    this.singularName = singularName;
    return this;
  }

  /**
   * singularName is the singular name of the resource. This allows clients to handle plural and
   * singular opaquely. The singularName is more correct for reporting status on a single item and
   * both singular and plural are allowed from the kubectl CLI interface.
   *
   * @return singularName
   */
  @ApiModelProperty(
      required = true,
      value =
          "singularName is the singular name of the resource.  This allows clients to handle plural and singular opaquely. The singularName is more correct for reporting status on a single item and both singular and plural are allowed from the kubectl CLI interface.")
  public String getSingularName() {
    return singularName;
  }

  public void setSingularName(String singularName) {
    this.singularName = singularName;
  }

  public V1APIResource storageVersionHash(String storageVersionHash) {

    this.storageVersionHash = storageVersionHash;
    return this;
  }

  /**
   * The hash value of the storage version, the version this resource is converted to when written
   * to the data store. Value must be treated as opaque by clients. Only equality comparison on the
   * value is valid. This is an alpha feature and may change or be removed in the future. The field
   * is populated by the apiserver only if the StorageVersionHash feature gate is enabled. This
   * field will remain optional even if it graduates.
   *
   * @return storageVersionHash
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "The hash value of the storage version, the version this resource is converted to when written to the data store. Value must be treated as opaque by clients. Only equality comparison on the value is valid. This is an alpha feature and may change or be removed in the future. The field is populated by the apiserver only if the StorageVersionHash feature gate is enabled. This field will remain optional even if it graduates.")
  public String getStorageVersionHash() {
    return storageVersionHash;
  }

  public void setStorageVersionHash(String storageVersionHash) {
    this.storageVersionHash = storageVersionHash;
  }

  public V1APIResource verbs(List<String> verbs) {

    this.verbs = verbs;
    return this;
  }

  public V1APIResource addVerbsItem(String verbsItem) {
    this.verbs.add(verbsItem);
    return this;
  }

  /**
   * verbs is a list of supported kube verbs (this includes get, list, watch, create, update, patch,
   * delete, deletecollection, and proxy)
   *
   * @return verbs
   */
  @ApiModelProperty(
      required = true,
      value =
          "verbs is a list of supported kube verbs (this includes get, list, watch, create, update, patch, delete, deletecollection, and proxy)")
  public List<String> getVerbs() {
    return verbs;
  }

  public void setVerbs(List<String> verbs) {
    this.verbs = verbs;
  }

  public V1APIResource version(String version) {

    this.version = version;
    return this;
  }

  /**
   * version is the preferred version of the resource. Empty implies the version of the containing
   * resource list For subresources, this may have a different value, for example: v1 (while inside
   * a v1beta1 version of the core resource&#39;s group)\&quot;.
   *
   * @return version
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "version is the preferred version of the resource.  Empty implies the version of the containing resource list For subresources, this may have a different value, for example: v1 (while inside a v1beta1 version of the core resource's group)\".")
  public String getVersion() {
    return version;
  }

  public void setVersion(String version) {
    this.version = version;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1APIResource v1APIResource = (V1APIResource) o;
    return Objects.equals(this.categories, v1APIResource.categories)
        && Objects.equals(this.group, v1APIResource.group)
        && Objects.equals(this.kind, v1APIResource.kind)
        && Objects.equals(this.name, v1APIResource.name)
        && Objects.equals(this.namespaced, v1APIResource.namespaced)
        && Objects.equals(this.shortNames, v1APIResource.shortNames)
        && Objects.equals(this.singularName, v1APIResource.singularName)
        && Objects.equals(this.storageVersionHash, v1APIResource.storageVersionHash)
        && Objects.equals(this.verbs, v1APIResource.verbs)
        && Objects.equals(this.version, v1APIResource.version);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        categories,
        group,
        kind,
        name,
        namespaced,
        shortNames,
        singularName,
        storageVersionHash,
        verbs,
        version);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1APIResource {\n");
    sb.append("    categories: ").append(toIndentedString(categories)).append("\n");
    sb.append("    group: ").append(toIndentedString(group)).append("\n");
    sb.append("    kind: ").append(toIndentedString(kind)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    namespaced: ").append(toIndentedString(namespaced)).append("\n");
    sb.append("    shortNames: ").append(toIndentedString(shortNames)).append("\n");
    sb.append("    singularName: ").append(toIndentedString(singularName)).append("\n");
    sb.append("    storageVersionHash: ").append(toIndentedString(storageVersionHash)).append("\n");
    sb.append("    verbs: ").append(toIndentedString(verbs)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
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
