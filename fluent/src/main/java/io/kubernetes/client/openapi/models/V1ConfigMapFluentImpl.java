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

import io.kubernetes.client.fluent.BaseFluent;
import io.kubernetes.client.fluent.Nested;
import java.util.LinkedHashMap;
import java.util.Map;

/** Generated */
@SuppressWarnings(value = "unchecked")
public class V1ConfigMapFluentImpl<A extends V1ConfigMapFluent<A>> extends BaseFluent<A>
    implements V1ConfigMapFluent<A> {
  public V1ConfigMapFluentImpl() {}

  public V1ConfigMapFluentImpl(io.kubernetes.client.openapi.models.V1ConfigMap instance) {
    this.withApiVersion(instance.getApiVersion());

    this.withBinaryData(instance.getBinaryData());

    this.withData(instance.getData());

    this.withImmutable(instance.getImmutable());

    this.withKind(instance.getKind());

    this.withMetadata(instance.getMetadata());
  }

  private String apiVersion;
  private Map<java.lang.String, byte[]> binaryData;
  private java.util.Map<java.lang.String, java.lang.String> data;
  private Boolean immutable;
  private java.lang.String kind;
  private V1ObjectMetaBuilder metadata;

  public java.lang.String getApiVersion() {
    return this.apiVersion;
  }

  public A withApiVersion(java.lang.String apiVersion) {
    this.apiVersion = apiVersion;
    return (A) this;
  }

  public java.lang.Boolean hasApiVersion() {
    return this.apiVersion != null;
  }

  public A addToBinaryData(java.lang.String key, byte[] value) {
    if (this.binaryData == null && key != null && value != null) {
      this.binaryData = new LinkedHashMap();
    }
    if (key != null && value != null) {
      this.binaryData.put(key, value);
    }
    return (A) this;
  }

  public A addToBinaryData(java.util.Map<java.lang.String, byte[]> map) {
    if (this.binaryData == null && map != null) {
      this.binaryData = new java.util.LinkedHashMap();
    }
    if (map != null) {
      this.binaryData.putAll(map);
    }
    return (A) this;
  }

  public A removeFromBinaryData(java.lang.String key) {
    if (this.binaryData == null) {
      return (A) this;
    }
    if (key != null && this.binaryData != null) {
      this.binaryData.remove(key);
    }
    return (A) this;
  }

  public A removeFromBinaryData(java.util.Map<java.lang.String, byte[]> map) {
    if (this.binaryData == null) {
      return (A) this;
    }
    if (map != null) {
      for (Object key : map.keySet()) {
        if (this.binaryData != null) {
          this.binaryData.remove(key);
        }
      }
    }
    return (A) this;
  }

  public java.util.Map<java.lang.String, byte[]> getBinaryData() {
    return this.binaryData;
  }

  public <K, V> A withBinaryData(java.util.Map<java.lang.String, byte[]> binaryData) {
    if (binaryData == null) {
      this.binaryData = null;
    } else {
      this.binaryData = new java.util.LinkedHashMap(binaryData);
    }
    return (A) this;
  }

  public java.lang.Boolean hasBinaryData() {
    return this.binaryData != null;
  }

  public A addToData(java.lang.String key, java.lang.String value) {
    if (this.data == null && key != null && value != null) {
      this.data = new java.util.LinkedHashMap();
    }
    if (key != null && value != null) {
      this.data.put(key, value);
    }
    return (A) this;
  }

  public A addToData(java.util.Map<java.lang.String, java.lang.String> map) {
    if (this.data == null && map != null) {
      this.data = new java.util.LinkedHashMap();
    }
    if (map != null) {
      this.data.putAll(map);
    }
    return (A) this;
  }

  public A removeFromData(java.lang.String key) {
    if (this.data == null) {
      return (A) this;
    }
    if (key != null && this.data != null) {
      this.data.remove(key);
    }
    return (A) this;
  }

  public A removeFromData(java.util.Map<java.lang.String, java.lang.String> map) {
    if (this.data == null) {
      return (A) this;
    }
    if (map != null) {
      for (Object key : map.keySet()) {
        if (this.data != null) {
          this.data.remove(key);
        }
      }
    }
    return (A) this;
  }

  public java.util.Map<java.lang.String, java.lang.String> getData() {
    return this.data;
  }

  public <K, V> A withData(java.util.Map<java.lang.String, java.lang.String> data) {
    if (data == null) {
      this.data = null;
    } else {
      this.data = new java.util.LinkedHashMap(data);
    }
    return (A) this;
  }

  public java.lang.Boolean hasData() {
    return this.data != null;
  }

  public java.lang.Boolean getImmutable() {
    return this.immutable;
  }

  public A withImmutable(java.lang.Boolean immutable) {
    this.immutable = immutable;
    return (A) this;
  }

  public java.lang.Boolean hasImmutable() {
    return this.immutable != null;
  }

  public java.lang.String getKind() {
    return this.kind;
  }

  public A withKind(java.lang.String kind) {
    this.kind = kind;
    return (A) this;
  }

  public java.lang.Boolean hasKind() {
    return this.kind != null;
  }

  /**
   * This method has been deprecated, please use method buildMetadata instead.
   *
   * @return The buildable object.
   */
  @Deprecated
  public io.kubernetes.client.openapi.models.V1ObjectMeta getMetadata() {
    return this.metadata != null ? this.metadata.build() : null;
  }

  public io.kubernetes.client.openapi.models.V1ObjectMeta buildMetadata() {
    return this.metadata != null ? this.metadata.build() : null;
  }

  public A withMetadata(io.kubernetes.client.openapi.models.V1ObjectMeta metadata) {
    _visitables.get("metadata").remove(this.metadata);
    if (metadata != null) {
      this.metadata = new V1ObjectMetaBuilder(metadata);
      _visitables.get("metadata").add(this.metadata);
    }
    return (A) this;
  }

  public java.lang.Boolean hasMetadata() {
    return this.metadata != null;
  }

  public V1ConfigMapFluent.MetadataNested<A> withNewMetadata() {
    return new V1ConfigMapFluentImpl.MetadataNestedImpl();
  }

  public io.kubernetes.client.openapi.models.V1ConfigMapFluent.MetadataNested<A>
      withNewMetadataLike(io.kubernetes.client.openapi.models.V1ObjectMeta item) {
    return new V1ConfigMapFluentImpl.MetadataNestedImpl(item);
  }

  public io.kubernetes.client.openapi.models.V1ConfigMapFluent.MetadataNested<A> editMetadata() {
    return withNewMetadataLike(getMetadata());
  }

  public io.kubernetes.client.openapi.models.V1ConfigMapFluent.MetadataNested<A>
      editOrNewMetadata() {
    return withNewMetadataLike(
        getMetadata() != null
            ? getMetadata()
            : new io.kubernetes.client.openapi.models.V1ObjectMetaBuilder().build());
  }

  public io.kubernetes.client.openapi.models.V1ConfigMapFluent.MetadataNested<A>
      editOrNewMetadataLike(io.kubernetes.client.openapi.models.V1ObjectMeta item) {
    return withNewMetadataLike(getMetadata() != null ? getMetadata() : item);
  }

  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    V1ConfigMapFluentImpl that = (V1ConfigMapFluentImpl) o;
    if (apiVersion != null ? !apiVersion.equals(that.apiVersion) : that.apiVersion != null)
      return false;
    if (binaryData != null ? !binaryData.equals(that.binaryData) : that.binaryData != null)
      return false;
    if (data != null ? !data.equals(that.data) : that.data != null) return false;
    if (immutable != null ? !immutable.equals(that.immutable) : that.immutable != null)
      return false;
    if (kind != null ? !kind.equals(that.kind) : that.kind != null) return false;
    if (metadata != null ? !metadata.equals(that.metadata) : that.metadata != null) return false;
    return true;
  }

  public int hashCode() {
    return java.util.Objects.hash(
        apiVersion, binaryData, data, immutable, kind, metadata, super.hashCode());
  }

  public java.lang.String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (apiVersion != null) {
      sb.append("apiVersion:");
      sb.append(apiVersion + ",");
    }
    if (binaryData != null && !binaryData.isEmpty()) {
      sb.append("binaryData:");
      sb.append(binaryData + ",");
    }
    if (data != null && !data.isEmpty()) {
      sb.append("data:");
      sb.append(data + ",");
    }
    if (immutable != null) {
      sb.append("immutable:");
      sb.append(immutable + ",");
    }
    if (kind != null) {
      sb.append("kind:");
      sb.append(kind + ",");
    }
    if (metadata != null) {
      sb.append("metadata:");
      sb.append(metadata);
    }
    sb.append("}");
    return sb.toString();
  }

  public A withImmutable() {
    return withImmutable(true);
  }

  class MetadataNestedImpl<N> extends V1ObjectMetaFluentImpl<V1ConfigMapFluent.MetadataNested<N>>
      implements io.kubernetes.client.openapi.models.V1ConfigMapFluent.MetadataNested<N>,
          Nested<N> {
    MetadataNestedImpl(V1ObjectMeta item) {
      this.builder = new V1ObjectMetaBuilder(this, item);
    }

    MetadataNestedImpl() {
      this.builder = new io.kubernetes.client.openapi.models.V1ObjectMetaBuilder(this);
    }

    io.kubernetes.client.openapi.models.V1ObjectMetaBuilder builder;

    public N and() {
      return (N) V1ConfigMapFluentImpl.this.withMetadata(builder.build());
    }

    public N endMetadata() {
      return and();
    }
  }
}
