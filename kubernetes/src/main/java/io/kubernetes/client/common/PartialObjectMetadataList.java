/*
Copyright 2020 The Kubernetes Authors.
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
package io.kubernetes.client.common;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;
import io.kubernetes.client.openapi.models.V1ListMeta;


public class PartialObjectMetadataList implements KubernetesListObject {
  private String apiVersion;
  private String kind;
  private V1ListMeta metadata;
  private List<PartialObjectMetadata> items;

  public PartialObjectMetadataList apiVersion(String apiVersion) {
    this.apiVersion = apiVersion;
    return this;
  }

  @Override
  @Nullable
  public String getApiVersion() {
    return apiVersion;
  }

  public void setApiVersion(String apiVersion) {
    this.apiVersion = apiVersion;
  }

  public PartialObjectMetadataList kind(String kind) {
    this.kind = kind;
    return this;
  }

  @Override
  @Nullable
  public String getKind() {
    return kind;
  }

  public void setKind(String kind) {
    this.kind = kind;
  }

  public PartialObjectMetadataList metadata(V1ListMeta metadata) {
    this.metadata = metadata;
    return this;
  }

  @Override
  @Nullable
  public V1ListMeta getMetadata() {
    return metadata;
  }

  public void setMetadata(V1ListMeta metadata) {
    this.metadata = metadata;
  }

  public PartialObjectMetadataList items(List<PartialObjectMetadata> items) {
    this.items = items;
    return this;
  }

  public PartialObjectMetadataList addItemsItem(PartialObjectMetadata item) {
    if (items == null) {
      items = new ArrayList<>();
    }
    items.add(item);
    return this;
  }

  @Override
  @Nullable
  public List<PartialObjectMetadata> getItems() {
    return items;
  }

  public void setItems(List<PartialObjectMetadata> items) {
    this.items = items;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PartialObjectMetadataList other = (PartialObjectMetadataList) o;
    return Objects.equals(this.apiVersion, other.apiVersion)
        && Objects.equals(this.kind, other.kind)
        && Objects.equals(this.metadata, other.metadata)
        && Objects.equals(this.items, other.items);
  }

  @Override
  public int hashCode() {
    return Objects.hash(apiVersion, kind, metadata, items);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PartialObjectMetadataList {\n");
    sb.append("    apiVersion: ").append(toIndentedString(apiVersion)).append("\n");
    sb.append("    kind: ").append(toIndentedString(kind)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    items: ").append(toIndentedString(items)).append("\n");
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
