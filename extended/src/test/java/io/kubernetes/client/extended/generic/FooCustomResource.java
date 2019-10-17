package io.kubernetes.client.extended.generic;

import io.kubernetes.client.openapi.models.V1ObjectMeta;

public class FooCustomResource {
  private V1ObjectMeta metadata;

  public V1ObjectMeta getMetadata() {
    return metadata;
  }

  public void setMetadata(V1ObjectMeta metadata) {
    this.metadata = metadata;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;

    FooCustomResource that = (FooCustomResource) o;

    return metadata != null ? metadata.equals(that.metadata) : that.metadata == null;
  }

  @Override
  public int hashCode() {
    return metadata != null ? metadata.hashCode() : 0;
  }
}
