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
public class V1CSIVolumeSourceFluentImpl<A extends V1CSIVolumeSourceFluent<A>> extends BaseFluent<A>
    implements V1CSIVolumeSourceFluent<A> {
  public V1CSIVolumeSourceFluentImpl() {}

  public V1CSIVolumeSourceFluentImpl(
      io.kubernetes.client.openapi.models.V1CSIVolumeSource instance) {
    this.withDriver(instance.getDriver());

    this.withFsType(instance.getFsType());

    this.withNodePublishSecretRef(instance.getNodePublishSecretRef());

    this.withReadOnly(instance.getReadOnly());

    this.withVolumeAttributes(instance.getVolumeAttributes());
  }

  private String driver;
  private java.lang.String fsType;
  private V1LocalObjectReferenceBuilder nodePublishSecretRef;
  private Boolean readOnly;
  private Map<java.lang.String, java.lang.String> volumeAttributes;

  public java.lang.String getDriver() {
    return this.driver;
  }

  public A withDriver(java.lang.String driver) {
    this.driver = driver;
    return (A) this;
  }

  public java.lang.Boolean hasDriver() {
    return this.driver != null;
  }

  public java.lang.String getFsType() {
    return this.fsType;
  }

  public A withFsType(java.lang.String fsType) {
    this.fsType = fsType;
    return (A) this;
  }

  public java.lang.Boolean hasFsType() {
    return this.fsType != null;
  }

  /**
   * This method has been deprecated, please use method buildNodePublishSecretRef instead.
   *
   * @return The buildable object.
   */
  @Deprecated
  public V1LocalObjectReference getNodePublishSecretRef() {
    return this.nodePublishSecretRef != null ? this.nodePublishSecretRef.build() : null;
  }

  public io.kubernetes.client.openapi.models.V1LocalObjectReference buildNodePublishSecretRef() {
    return this.nodePublishSecretRef != null ? this.nodePublishSecretRef.build() : null;
  }

  public A withNodePublishSecretRef(
      io.kubernetes.client.openapi.models.V1LocalObjectReference nodePublishSecretRef) {
    _visitables.get("nodePublishSecretRef").remove(this.nodePublishSecretRef);
    if (nodePublishSecretRef != null) {
      this.nodePublishSecretRef =
          new io.kubernetes.client.openapi.models.V1LocalObjectReferenceBuilder(
              nodePublishSecretRef);
      _visitables.get("nodePublishSecretRef").add(this.nodePublishSecretRef);
    }
    return (A) this;
  }

  public java.lang.Boolean hasNodePublishSecretRef() {
    return this.nodePublishSecretRef != null;
  }

  public V1CSIVolumeSourceFluent.NodePublishSecretRefNested<A> withNewNodePublishSecretRef() {
    return new V1CSIVolumeSourceFluentImpl.NodePublishSecretRefNestedImpl();
  }

  public io.kubernetes.client.openapi.models.V1CSIVolumeSourceFluent.NodePublishSecretRefNested<A>
      withNewNodePublishSecretRefLike(
          io.kubernetes.client.openapi.models.V1LocalObjectReference item) {
    return new V1CSIVolumeSourceFluentImpl.NodePublishSecretRefNestedImpl(item);
  }

  public io.kubernetes.client.openapi.models.V1CSIVolumeSourceFluent.NodePublishSecretRefNested<A>
      editNodePublishSecretRef() {
    return withNewNodePublishSecretRefLike(getNodePublishSecretRef());
  }

  public io.kubernetes.client.openapi.models.V1CSIVolumeSourceFluent.NodePublishSecretRefNested<A>
      editOrNewNodePublishSecretRef() {
    return withNewNodePublishSecretRefLike(
        getNodePublishSecretRef() != null
            ? getNodePublishSecretRef()
            : new io.kubernetes.client.openapi.models.V1LocalObjectReferenceBuilder().build());
  }

  public io.kubernetes.client.openapi.models.V1CSIVolumeSourceFluent.NodePublishSecretRefNested<A>
      editOrNewNodePublishSecretRefLike(
          io.kubernetes.client.openapi.models.V1LocalObjectReference item) {
    return withNewNodePublishSecretRefLike(
        getNodePublishSecretRef() != null ? getNodePublishSecretRef() : item);
  }

  public java.lang.Boolean getReadOnly() {
    return this.readOnly;
  }

  public A withReadOnly(java.lang.Boolean readOnly) {
    this.readOnly = readOnly;
    return (A) this;
  }

  public java.lang.Boolean hasReadOnly() {
    return this.readOnly != null;
  }

  public A addToVolumeAttributes(java.lang.String key, java.lang.String value) {
    if (this.volumeAttributes == null && key != null && value != null) {
      this.volumeAttributes = new LinkedHashMap();
    }
    if (key != null && value != null) {
      this.volumeAttributes.put(key, value);
    }
    return (A) this;
  }

  public A addToVolumeAttributes(java.util.Map<java.lang.String, java.lang.String> map) {
    if (this.volumeAttributes == null && map != null) {
      this.volumeAttributes = new java.util.LinkedHashMap();
    }
    if (map != null) {
      this.volumeAttributes.putAll(map);
    }
    return (A) this;
  }

  public A removeFromVolumeAttributes(java.lang.String key) {
    if (this.volumeAttributes == null) {
      return (A) this;
    }
    if (key != null && this.volumeAttributes != null) {
      this.volumeAttributes.remove(key);
    }
    return (A) this;
  }

  public A removeFromVolumeAttributes(java.util.Map<java.lang.String, java.lang.String> map) {
    if (this.volumeAttributes == null) {
      return (A) this;
    }
    if (map != null) {
      for (Object key : map.keySet()) {
        if (this.volumeAttributes != null) {
          this.volumeAttributes.remove(key);
        }
      }
    }
    return (A) this;
  }

  public java.util.Map<java.lang.String, java.lang.String> getVolumeAttributes() {
    return this.volumeAttributes;
  }

  public <K, V> A withVolumeAttributes(
      java.util.Map<java.lang.String, java.lang.String> volumeAttributes) {
    if (volumeAttributes == null) {
      this.volumeAttributes = null;
    } else {
      this.volumeAttributes = new java.util.LinkedHashMap(volumeAttributes);
    }
    return (A) this;
  }

  public java.lang.Boolean hasVolumeAttributes() {
    return this.volumeAttributes != null;
  }

  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    V1CSIVolumeSourceFluentImpl that = (V1CSIVolumeSourceFluentImpl) o;
    if (driver != null ? !driver.equals(that.driver) : that.driver != null) return false;
    if (fsType != null ? !fsType.equals(that.fsType) : that.fsType != null) return false;
    if (nodePublishSecretRef != null
        ? !nodePublishSecretRef.equals(that.nodePublishSecretRef)
        : that.nodePublishSecretRef != null) return false;
    if (readOnly != null ? !readOnly.equals(that.readOnly) : that.readOnly != null) return false;
    if (volumeAttributes != null
        ? !volumeAttributes.equals(that.volumeAttributes)
        : that.volumeAttributes != null) return false;
    return true;
  }

  public int hashCode() {
    return java.util.Objects.hash(
        driver, fsType, nodePublishSecretRef, readOnly, volumeAttributes, super.hashCode());
  }

  public java.lang.String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (driver != null) {
      sb.append("driver:");
      sb.append(driver + ",");
    }
    if (fsType != null) {
      sb.append("fsType:");
      sb.append(fsType + ",");
    }
    if (nodePublishSecretRef != null) {
      sb.append("nodePublishSecretRef:");
      sb.append(nodePublishSecretRef + ",");
    }
    if (readOnly != null) {
      sb.append("readOnly:");
      sb.append(readOnly + ",");
    }
    if (volumeAttributes != null && !volumeAttributes.isEmpty()) {
      sb.append("volumeAttributes:");
      sb.append(volumeAttributes);
    }
    sb.append("}");
    return sb.toString();
  }

  public A withReadOnly() {
    return withReadOnly(true);
  }

  class NodePublishSecretRefNestedImpl<N>
      extends V1LocalObjectReferenceFluentImpl<
          V1CSIVolumeSourceFluent.NodePublishSecretRefNested<N>>
      implements io.kubernetes.client.openapi.models.V1CSIVolumeSourceFluent
                  .NodePublishSecretRefNested<
              N>,
          Nested<N> {
    NodePublishSecretRefNestedImpl(V1LocalObjectReference item) {
      this.builder = new V1LocalObjectReferenceBuilder(this, item);
    }

    NodePublishSecretRefNestedImpl() {
      this.builder = new io.kubernetes.client.openapi.models.V1LocalObjectReferenceBuilder(this);
    }

    io.kubernetes.client.openapi.models.V1LocalObjectReferenceBuilder builder;

    public N and() {
      return (N) V1CSIVolumeSourceFluentImpl.this.withNodePublishSecretRef(builder.build());
    }

    public N endNodePublishSecretRef() {
      return and();
    }
  }
}
