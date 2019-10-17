package io.kubernetes.client.extended.generic;

import io.kubernetes.client.openapi.models.V1ListMeta;
import java.util.List;

public class FooCustomResourceList {
  private V1ListMeta metadata;
  private List<FooCustomResource> items;

  public V1ListMeta getMetadata() {
    return metadata;
  }

  public void setMetadata(V1ListMeta metadata) {
    this.metadata = metadata;
  }

  public List<FooCustomResource> getItems() {
    return items;
  }

  public void setItems(List<FooCustomResource> items) {
    this.items = items;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;

    FooCustomResourceList that = (FooCustomResourceList) o;

    if (metadata != null ? !metadata.equals(that.metadata) : that.metadata != null) return false;
    return items != null ? items.equals(that.items) : that.items == null;
  }

  @Override
  public int hashCode() {
    int result = metadata != null ? metadata.hashCode() : 0;
    result = 31 * result + (items != null ? items.hashCode() : 0);
    return result;
  }
}
