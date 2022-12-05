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

/** PersistentVolumeClaimList is a list of PersistentVolumeClaim items. */
@ApiModel(description = "PersistentVolumeClaimList is a list of PersistentVolumeClaim items.")
@javax.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    date = "2022-12-05T08:14:34.919Z[Etc/UTC]")
public class V1PersistentVolumeClaimList
    implements io.kubernetes.client.common.KubernetesListObject {
  public static final String SERIALIZED_NAME_API_VERSION = "apiVersion";

  @SerializedName(SERIALIZED_NAME_API_VERSION)
  private String apiVersion;

  public static final String SERIALIZED_NAME_ITEMS = "items";

  @SerializedName(SERIALIZED_NAME_ITEMS)
  private List<V1PersistentVolumeClaim> items = new ArrayList<>();

  public static final String SERIALIZED_NAME_KIND = "kind";

  @SerializedName(SERIALIZED_NAME_KIND)
  private String kind;

  public static final String SERIALIZED_NAME_METADATA = "metadata";

  @SerializedName(SERIALIZED_NAME_METADATA)
  private V1ListMeta metadata;

  public V1PersistentVolumeClaimList apiVersion(String apiVersion) {

    this.apiVersion = apiVersion;
    return this;
  }

  /**
   * APIVersion defines the versioned schema of this representation of an object. Servers should
   * convert recognized schemas to the latest internal value, and may reject unrecognized values.
   * More info:
   * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
   *
   * @return apiVersion
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources")
  public String getApiVersion() {
    return apiVersion;
  }

  public void setApiVersion(String apiVersion) {
    this.apiVersion = apiVersion;
  }

  public V1PersistentVolumeClaimList items(List<V1PersistentVolumeClaim> items) {

    this.items = items;
    return this;
  }

  public V1PersistentVolumeClaimList addItemsItem(V1PersistentVolumeClaim itemsItem) {
    this.items.add(itemsItem);
    return this;
  }

  /**
   * items is a list of persistent volume claims. More info:
   * https://kubernetes.io/docs/concepts/storage/persistent-volumes#persistentvolumeclaims
   *
   * @return items
   */
  @ApiModelProperty(
      required = true,
      value =
          "items is a list of persistent volume claims. More info: https://kubernetes.io/docs/concepts/storage/persistent-volumes#persistentvolumeclaims")
  public List<V1PersistentVolumeClaim> getItems() {
    return items;
  }

  public void setItems(List<V1PersistentVolumeClaim> items) {
    this.items = items;
  }

  public V1PersistentVolumeClaimList kind(String kind) {

    this.kind = kind;
    return this;
  }

  /**
   * Kind is a string value representing the REST resource this object represents. Servers may infer
   * this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More
   * info:
   * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
   *
   * @return kind
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds")
  public String getKind() {
    return kind;
  }

  public void setKind(String kind) {
    this.kind = kind;
  }

  public V1PersistentVolumeClaimList metadata(V1ListMeta metadata) {

    this.metadata = metadata;
    return this;
  }

  /**
   * Get metadata
   *
   * @return metadata
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  public V1ListMeta getMetadata() {
    return metadata;
  }

  public void setMetadata(V1ListMeta metadata) {
    this.metadata = metadata;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1PersistentVolumeClaimList v1PersistentVolumeClaimList = (V1PersistentVolumeClaimList) o;
    return Objects.equals(this.apiVersion, v1PersistentVolumeClaimList.apiVersion)
        && Objects.equals(this.items, v1PersistentVolumeClaimList.items)
        && Objects.equals(this.kind, v1PersistentVolumeClaimList.kind)
        && Objects.equals(this.metadata, v1PersistentVolumeClaimList.metadata);
  }

  @Override
  public int hashCode() {
    return Objects.hash(apiVersion, items, kind, metadata);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1PersistentVolumeClaimList {\n");
    sb.append("    apiVersion: ").append(toIndentedString(apiVersion)).append("\n");
    sb.append("    items: ").append(toIndentedString(items)).append("\n");
    sb.append("    kind: ").append(toIndentedString(kind)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
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
