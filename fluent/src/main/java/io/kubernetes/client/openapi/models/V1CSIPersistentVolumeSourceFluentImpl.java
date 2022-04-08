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
public class V1CSIPersistentVolumeSourceFluentImpl<A extends V1CSIPersistentVolumeSourceFluent<A>>
    extends BaseFluent<A> implements V1CSIPersistentVolumeSourceFluent<A> {
  public V1CSIPersistentVolumeSourceFluentImpl() {}

  public V1CSIPersistentVolumeSourceFluentImpl(
      io.kubernetes.client.openapi.models.V1CSIPersistentVolumeSource instance) {
    this.withControllerExpandSecretRef(instance.getControllerExpandSecretRef());

    this.withControllerPublishSecretRef(instance.getControllerPublishSecretRef());

    this.withDriver(instance.getDriver());

    this.withFsType(instance.getFsType());

    this.withNodePublishSecretRef(instance.getNodePublishSecretRef());

    this.withNodeStageSecretRef(instance.getNodeStageSecretRef());

    this.withReadOnly(instance.getReadOnly());

    this.withVolumeAttributes(instance.getVolumeAttributes());

    this.withVolumeHandle(instance.getVolumeHandle());
  }

  private V1SecretReferenceBuilder controllerExpandSecretRef;
  private V1SecretReferenceBuilder controllerPublishSecretRef;
  private String driver;
  private java.lang.String fsType;
  private io.kubernetes.client.openapi.models.V1SecretReferenceBuilder nodePublishSecretRef;
  private io.kubernetes.client.openapi.models.V1SecretReferenceBuilder nodeStageSecretRef;
  private Boolean readOnly;
  private Map<java.lang.String, java.lang.String> volumeAttributes;
  private java.lang.String volumeHandle;

  /**
   * This method has been deprecated, please use method buildControllerExpandSecretRef instead.
   *
   * @return The buildable object.
   */
  @Deprecated
  public io.kubernetes.client.openapi.models.V1SecretReference getControllerExpandSecretRef() {
    return this.controllerExpandSecretRef != null ? this.controllerExpandSecretRef.build() : null;
  }

  public io.kubernetes.client.openapi.models.V1SecretReference buildControllerExpandSecretRef() {
    return this.controllerExpandSecretRef != null ? this.controllerExpandSecretRef.build() : null;
  }

  public A withControllerExpandSecretRef(
      io.kubernetes.client.openapi.models.V1SecretReference controllerExpandSecretRef) {
    _visitables.get("controllerExpandSecretRef").remove(this.controllerExpandSecretRef);
    if (controllerExpandSecretRef != null) {
      this.controllerExpandSecretRef =
          new io.kubernetes.client.openapi.models.V1SecretReferenceBuilder(
              controllerExpandSecretRef);
      _visitables.get("controllerExpandSecretRef").add(this.controllerExpandSecretRef);
    }
    return (A) this;
  }

  public java.lang.Boolean hasControllerExpandSecretRef() {
    return this.controllerExpandSecretRef != null;
  }

  public V1CSIPersistentVolumeSourceFluent.ControllerExpandSecretRefNested<A>
      withNewControllerExpandSecretRef() {
    return new V1CSIPersistentVolumeSourceFluentImpl.ControllerExpandSecretRefNestedImpl();
  }

  public io.kubernetes.client.openapi.models.V1CSIPersistentVolumeSourceFluent
              .ControllerExpandSecretRefNested<
          A>
      withNewControllerExpandSecretRefLike(
          io.kubernetes.client.openapi.models.V1SecretReference item) {
    return new V1CSIPersistentVolumeSourceFluentImpl.ControllerExpandSecretRefNestedImpl(item);
  }

  public io.kubernetes.client.openapi.models.V1CSIPersistentVolumeSourceFluent
              .ControllerExpandSecretRefNested<
          A>
      editControllerExpandSecretRef() {
    return withNewControllerExpandSecretRefLike(getControllerExpandSecretRef());
  }

  public io.kubernetes.client.openapi.models.V1CSIPersistentVolumeSourceFluent
              .ControllerExpandSecretRefNested<
          A>
      editOrNewControllerExpandSecretRef() {
    return withNewControllerExpandSecretRefLike(
        getControllerExpandSecretRef() != null
            ? getControllerExpandSecretRef()
            : new io.kubernetes.client.openapi.models.V1SecretReferenceBuilder().build());
  }

  public io.kubernetes.client.openapi.models.V1CSIPersistentVolumeSourceFluent
              .ControllerExpandSecretRefNested<
          A>
      editOrNewControllerExpandSecretRefLike(
          io.kubernetes.client.openapi.models.V1SecretReference item) {
    return withNewControllerExpandSecretRefLike(
        getControllerExpandSecretRef() != null ? getControllerExpandSecretRef() : item);
  }

  /**
   * This method has been deprecated, please use method buildControllerPublishSecretRef instead.
   *
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public io.kubernetes.client.openapi.models.V1SecretReference getControllerPublishSecretRef() {
    return this.controllerPublishSecretRef != null ? this.controllerPublishSecretRef.build() : null;
  }

  public io.kubernetes.client.openapi.models.V1SecretReference buildControllerPublishSecretRef() {
    return this.controllerPublishSecretRef != null ? this.controllerPublishSecretRef.build() : null;
  }

  public A withControllerPublishSecretRef(
      io.kubernetes.client.openapi.models.V1SecretReference controllerPublishSecretRef) {
    _visitables.get("controllerPublishSecretRef").remove(this.controllerPublishSecretRef);
    if (controllerPublishSecretRef != null) {
      this.controllerPublishSecretRef =
          new io.kubernetes.client.openapi.models.V1SecretReferenceBuilder(
              controllerPublishSecretRef);
      _visitables.get("controllerPublishSecretRef").add(this.controllerPublishSecretRef);
    }
    return (A) this;
  }

  public java.lang.Boolean hasControllerPublishSecretRef() {
    return this.controllerPublishSecretRef != null;
  }

  public V1CSIPersistentVolumeSourceFluent.ControllerPublishSecretRefNested<A>
      withNewControllerPublishSecretRef() {
    return new V1CSIPersistentVolumeSourceFluentImpl.ControllerPublishSecretRefNestedImpl();
  }

  public io.kubernetes.client.openapi.models.V1CSIPersistentVolumeSourceFluent
              .ControllerPublishSecretRefNested<
          A>
      withNewControllerPublishSecretRefLike(
          io.kubernetes.client.openapi.models.V1SecretReference item) {
    return new io.kubernetes.client.openapi.models.V1CSIPersistentVolumeSourceFluentImpl
        .ControllerPublishSecretRefNestedImpl(item);
  }

  public io.kubernetes.client.openapi.models.V1CSIPersistentVolumeSourceFluent
              .ControllerPublishSecretRefNested<
          A>
      editControllerPublishSecretRef() {
    return withNewControllerPublishSecretRefLike(getControllerPublishSecretRef());
  }

  public io.kubernetes.client.openapi.models.V1CSIPersistentVolumeSourceFluent
              .ControllerPublishSecretRefNested<
          A>
      editOrNewControllerPublishSecretRef() {
    return withNewControllerPublishSecretRefLike(
        getControllerPublishSecretRef() != null
            ? getControllerPublishSecretRef()
            : new io.kubernetes.client.openapi.models.V1SecretReferenceBuilder().build());
  }

  public io.kubernetes.client.openapi.models.V1CSIPersistentVolumeSourceFluent
              .ControllerPublishSecretRefNested<
          A>
      editOrNewControllerPublishSecretRefLike(
          io.kubernetes.client.openapi.models.V1SecretReference item) {
    return withNewControllerPublishSecretRefLike(
        getControllerPublishSecretRef() != null ? getControllerPublishSecretRef() : item);
  }

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
  @java.lang.Deprecated
  public io.kubernetes.client.openapi.models.V1SecretReference getNodePublishSecretRef() {
    return this.nodePublishSecretRef != null ? this.nodePublishSecretRef.build() : null;
  }

  public io.kubernetes.client.openapi.models.V1SecretReference buildNodePublishSecretRef() {
    return this.nodePublishSecretRef != null ? this.nodePublishSecretRef.build() : null;
  }

  public A withNodePublishSecretRef(
      io.kubernetes.client.openapi.models.V1SecretReference nodePublishSecretRef) {
    _visitables.get("nodePublishSecretRef").remove(this.nodePublishSecretRef);
    if (nodePublishSecretRef != null) {
      this.nodePublishSecretRef =
          new io.kubernetes.client.openapi.models.V1SecretReferenceBuilder(nodePublishSecretRef);
      _visitables.get("nodePublishSecretRef").add(this.nodePublishSecretRef);
    }
    return (A) this;
  }

  public java.lang.Boolean hasNodePublishSecretRef() {
    return this.nodePublishSecretRef != null;
  }

  public V1CSIPersistentVolumeSourceFluent.NodePublishSecretRefNested<A>
      withNewNodePublishSecretRef() {
    return new V1CSIPersistentVolumeSourceFluentImpl.NodePublishSecretRefNestedImpl();
  }

  public io.kubernetes.client.openapi.models.V1CSIPersistentVolumeSourceFluent
              .NodePublishSecretRefNested<
          A>
      withNewNodePublishSecretRefLike(io.kubernetes.client.openapi.models.V1SecretReference item) {
    return new io.kubernetes.client.openapi.models.V1CSIPersistentVolumeSourceFluentImpl
        .NodePublishSecretRefNestedImpl(item);
  }

  public io.kubernetes.client.openapi.models.V1CSIPersistentVolumeSourceFluent
              .NodePublishSecretRefNested<
          A>
      editNodePublishSecretRef() {
    return withNewNodePublishSecretRefLike(getNodePublishSecretRef());
  }

  public io.kubernetes.client.openapi.models.V1CSIPersistentVolumeSourceFluent
              .NodePublishSecretRefNested<
          A>
      editOrNewNodePublishSecretRef() {
    return withNewNodePublishSecretRefLike(
        getNodePublishSecretRef() != null
            ? getNodePublishSecretRef()
            : new io.kubernetes.client.openapi.models.V1SecretReferenceBuilder().build());
  }

  public io.kubernetes.client.openapi.models.V1CSIPersistentVolumeSourceFluent
              .NodePublishSecretRefNested<
          A>
      editOrNewNodePublishSecretRefLike(
          io.kubernetes.client.openapi.models.V1SecretReference item) {
    return withNewNodePublishSecretRefLike(
        getNodePublishSecretRef() != null ? getNodePublishSecretRef() : item);
  }

  /**
   * This method has been deprecated, please use method buildNodeStageSecretRef instead.
   *
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public io.kubernetes.client.openapi.models.V1SecretReference getNodeStageSecretRef() {
    return this.nodeStageSecretRef != null ? this.nodeStageSecretRef.build() : null;
  }

  public io.kubernetes.client.openapi.models.V1SecretReference buildNodeStageSecretRef() {
    return this.nodeStageSecretRef != null ? this.nodeStageSecretRef.build() : null;
  }

  public A withNodeStageSecretRef(
      io.kubernetes.client.openapi.models.V1SecretReference nodeStageSecretRef) {
    _visitables.get("nodeStageSecretRef").remove(this.nodeStageSecretRef);
    if (nodeStageSecretRef != null) {
      this.nodeStageSecretRef =
          new io.kubernetes.client.openapi.models.V1SecretReferenceBuilder(nodeStageSecretRef);
      _visitables.get("nodeStageSecretRef").add(this.nodeStageSecretRef);
    }
    return (A) this;
  }

  public java.lang.Boolean hasNodeStageSecretRef() {
    return this.nodeStageSecretRef != null;
  }

  public V1CSIPersistentVolumeSourceFluent.NodeStageSecretRefNested<A> withNewNodeStageSecretRef() {
    return new V1CSIPersistentVolumeSourceFluentImpl.NodeStageSecretRefNestedImpl();
  }

  public io.kubernetes.client.openapi.models.V1CSIPersistentVolumeSourceFluent
              .NodeStageSecretRefNested<
          A>
      withNewNodeStageSecretRefLike(io.kubernetes.client.openapi.models.V1SecretReference item) {
    return new io.kubernetes.client.openapi.models.V1CSIPersistentVolumeSourceFluentImpl
        .NodeStageSecretRefNestedImpl(item);
  }

  public io.kubernetes.client.openapi.models.V1CSIPersistentVolumeSourceFluent
              .NodeStageSecretRefNested<
          A>
      editNodeStageSecretRef() {
    return withNewNodeStageSecretRefLike(getNodeStageSecretRef());
  }

  public io.kubernetes.client.openapi.models.V1CSIPersistentVolumeSourceFluent
              .NodeStageSecretRefNested<
          A>
      editOrNewNodeStageSecretRef() {
    return withNewNodeStageSecretRefLike(
        getNodeStageSecretRef() != null
            ? getNodeStageSecretRef()
            : new io.kubernetes.client.openapi.models.V1SecretReferenceBuilder().build());
  }

  public io.kubernetes.client.openapi.models.V1CSIPersistentVolumeSourceFluent
              .NodeStageSecretRefNested<
          A>
      editOrNewNodeStageSecretRefLike(io.kubernetes.client.openapi.models.V1SecretReference item) {
    return withNewNodeStageSecretRefLike(
        getNodeStageSecretRef() != null ? getNodeStageSecretRef() : item);
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

  public java.lang.String getVolumeHandle() {
    return this.volumeHandle;
  }

  public A withVolumeHandle(java.lang.String volumeHandle) {
    this.volumeHandle = volumeHandle;
    return (A) this;
  }

  public java.lang.Boolean hasVolumeHandle() {
    return this.volumeHandle != null;
  }

  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    V1CSIPersistentVolumeSourceFluentImpl that = (V1CSIPersistentVolumeSourceFluentImpl) o;
    if (controllerExpandSecretRef != null
        ? !controllerExpandSecretRef.equals(that.controllerExpandSecretRef)
        : that.controllerExpandSecretRef != null) return false;
    if (controllerPublishSecretRef != null
        ? !controllerPublishSecretRef.equals(that.controllerPublishSecretRef)
        : that.controllerPublishSecretRef != null) return false;
    if (driver != null ? !driver.equals(that.driver) : that.driver != null) return false;
    if (fsType != null ? !fsType.equals(that.fsType) : that.fsType != null) return false;
    if (nodePublishSecretRef != null
        ? !nodePublishSecretRef.equals(that.nodePublishSecretRef)
        : that.nodePublishSecretRef != null) return false;
    if (nodeStageSecretRef != null
        ? !nodeStageSecretRef.equals(that.nodeStageSecretRef)
        : that.nodeStageSecretRef != null) return false;
    if (readOnly != null ? !readOnly.equals(that.readOnly) : that.readOnly != null) return false;
    if (volumeAttributes != null
        ? !volumeAttributes.equals(that.volumeAttributes)
        : that.volumeAttributes != null) return false;
    if (volumeHandle != null ? !volumeHandle.equals(that.volumeHandle) : that.volumeHandle != null)
      return false;
    return true;
  }

  public int hashCode() {
    return java.util.Objects.hash(
        controllerExpandSecretRef,
        controllerPublishSecretRef,
        driver,
        fsType,
        nodePublishSecretRef,
        nodeStageSecretRef,
        readOnly,
        volumeAttributes,
        volumeHandle,
        super.hashCode());
  }

  public java.lang.String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (controllerExpandSecretRef != null) {
      sb.append("controllerExpandSecretRef:");
      sb.append(controllerExpandSecretRef + ",");
    }
    if (controllerPublishSecretRef != null) {
      sb.append("controllerPublishSecretRef:");
      sb.append(controllerPublishSecretRef + ",");
    }
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
    if (nodeStageSecretRef != null) {
      sb.append("nodeStageSecretRef:");
      sb.append(nodeStageSecretRef + ",");
    }
    if (readOnly != null) {
      sb.append("readOnly:");
      sb.append(readOnly + ",");
    }
    if (volumeAttributes != null && !volumeAttributes.isEmpty()) {
      sb.append("volumeAttributes:");
      sb.append(volumeAttributes + ",");
    }
    if (volumeHandle != null) {
      sb.append("volumeHandle:");
      sb.append(volumeHandle);
    }
    sb.append("}");
    return sb.toString();
  }

  public A withReadOnly() {
    return withReadOnly(true);
  }

  class ControllerExpandSecretRefNestedImpl<N>
      extends V1SecretReferenceFluentImpl<
          V1CSIPersistentVolumeSourceFluent.ControllerExpandSecretRefNested<N>>
      implements io.kubernetes.client.openapi.models.V1CSIPersistentVolumeSourceFluent
                  .ControllerExpandSecretRefNested<
              N>,
          Nested<N> {
    ControllerExpandSecretRefNestedImpl(V1SecretReference item) {
      this.builder = new V1SecretReferenceBuilder(this, item);
    }

    ControllerExpandSecretRefNestedImpl() {
      this.builder = new io.kubernetes.client.openapi.models.V1SecretReferenceBuilder(this);
    }

    io.kubernetes.client.openapi.models.V1SecretReferenceBuilder builder;

    public N and() {
      return (N)
          V1CSIPersistentVolumeSourceFluentImpl.this.withControllerExpandSecretRef(builder.build());
    }

    public N endControllerExpandSecretRef() {
      return and();
    }
  }

  class ControllerPublishSecretRefNestedImpl<N>
      extends V1SecretReferenceFluentImpl<
          V1CSIPersistentVolumeSourceFluent.ControllerPublishSecretRefNested<N>>
      implements io.kubernetes.client.openapi.models.V1CSIPersistentVolumeSourceFluent
                  .ControllerPublishSecretRefNested<
              N>,
          io.kubernetes.client.fluent.Nested<N> {
    ControllerPublishSecretRefNestedImpl(V1SecretReference item) {
      this.builder = new V1SecretReferenceBuilder(this, item);
    }

    ControllerPublishSecretRefNestedImpl() {
      this.builder = new io.kubernetes.client.openapi.models.V1SecretReferenceBuilder(this);
    }

    io.kubernetes.client.openapi.models.V1SecretReferenceBuilder builder;

    public N and() {
      return (N)
          V1CSIPersistentVolumeSourceFluentImpl.this.withControllerPublishSecretRef(
              builder.build());
    }

    public N endControllerPublishSecretRef() {
      return and();
    }
  }

  class NodePublishSecretRefNestedImpl<N>
      extends V1SecretReferenceFluentImpl<
          V1CSIPersistentVolumeSourceFluent.NodePublishSecretRefNested<N>>
      implements io.kubernetes.client.openapi.models.V1CSIPersistentVolumeSourceFluent
                  .NodePublishSecretRefNested<
              N>,
          io.kubernetes.client.fluent.Nested<N> {
    NodePublishSecretRefNestedImpl(V1SecretReference item) {
      this.builder = new V1SecretReferenceBuilder(this, item);
    }

    NodePublishSecretRefNestedImpl() {
      this.builder = new io.kubernetes.client.openapi.models.V1SecretReferenceBuilder(this);
    }

    io.kubernetes.client.openapi.models.V1SecretReferenceBuilder builder;

    public N and() {
      return (N)
          V1CSIPersistentVolumeSourceFluentImpl.this.withNodePublishSecretRef(builder.build());
    }

    public N endNodePublishSecretRef() {
      return and();
    }
  }

  class NodeStageSecretRefNestedImpl<N>
      extends V1SecretReferenceFluentImpl<
          V1CSIPersistentVolumeSourceFluent.NodeStageSecretRefNested<N>>
      implements io.kubernetes.client.openapi.models.V1CSIPersistentVolumeSourceFluent
                  .NodeStageSecretRefNested<
              N>,
          io.kubernetes.client.fluent.Nested<N> {
    NodeStageSecretRefNestedImpl(V1SecretReference item) {
      this.builder = new V1SecretReferenceBuilder(this, item);
    }

    NodeStageSecretRefNestedImpl() {
      this.builder = new io.kubernetes.client.openapi.models.V1SecretReferenceBuilder(this);
    }

    io.kubernetes.client.openapi.models.V1SecretReferenceBuilder builder;

    public N and() {
      return (N) V1CSIPersistentVolumeSourceFluentImpl.this.withNodeStageSecretRef(builder.build());
    }

    public N endNodeStageSecretRef() {
      return and();
    }
  }
}
