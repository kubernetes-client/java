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

/** Generated */
public class V1ISCSIVolumeSourceFluentImpl<
        A extends io.kubernetes.client.openapi.models.V1ISCSIVolumeSourceFluent<A>>
    extends io.kubernetes.client.fluent.BaseFluent<A>
    implements io.kubernetes.client.openapi.models.V1ISCSIVolumeSourceFluent<A> {
  public V1ISCSIVolumeSourceFluentImpl() {}

  public V1ISCSIVolumeSourceFluentImpl(
      io.kubernetes.client.openapi.models.V1ISCSIVolumeSource instance) {
    this.withChapAuthDiscovery(instance.getChapAuthDiscovery());

    this.withChapAuthSession(instance.getChapAuthSession());

    this.withFsType(instance.getFsType());

    this.withInitiatorName(instance.getInitiatorName());

    this.withIqn(instance.getIqn());

    this.withIscsiInterface(instance.getIscsiInterface());

    this.withLun(instance.getLun());

    this.withPortals(instance.getPortals());

    this.withReadOnly(instance.getReadOnly());

    this.withSecretRef(instance.getSecretRef());

    this.withTargetPortal(instance.getTargetPortal());
  }

  private java.lang.Boolean chapAuthDiscovery;
  private java.lang.Boolean chapAuthSession;
  private java.lang.String fsType;
  private java.lang.String initiatorName;
  private java.lang.String iqn;
  private java.lang.String iscsiInterface;
  private java.lang.Integer lun;
  private java.util.List<java.lang.String> portals;
  private java.lang.Boolean readOnly;
  private io.kubernetes.client.openapi.models.V1LocalObjectReferenceBuilder secretRef;
  private java.lang.String targetPortal;

  public java.lang.Boolean getChapAuthDiscovery() {
    return this.chapAuthDiscovery;
  }

  public A withChapAuthDiscovery(java.lang.Boolean chapAuthDiscovery) {
    this.chapAuthDiscovery = chapAuthDiscovery;
    return (A) this;
  }

  public java.lang.Boolean hasChapAuthDiscovery() {
    return this.chapAuthDiscovery != null;
  }

  public java.lang.Boolean getChapAuthSession() {
    return this.chapAuthSession;
  }

  public A withChapAuthSession(java.lang.Boolean chapAuthSession) {
    this.chapAuthSession = chapAuthSession;
    return (A) this;
  }

  public java.lang.Boolean hasChapAuthSession() {
    return this.chapAuthSession != null;
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

  /** Method is deprecated. use withFsType instead. */
  @java.lang.Deprecated
  public A withNewFsType(java.lang.String original) {
    return (A) withFsType(new String(original));
  }

  public java.lang.String getInitiatorName() {
    return this.initiatorName;
  }

  public A withInitiatorName(java.lang.String initiatorName) {
    this.initiatorName = initiatorName;
    return (A) this;
  }

  public java.lang.Boolean hasInitiatorName() {
    return this.initiatorName != null;
  }

  /** Method is deprecated. use withInitiatorName instead. */
  @java.lang.Deprecated
  public A withNewInitiatorName(java.lang.String original) {
    return (A) withInitiatorName(new String(original));
  }

  public java.lang.String getIqn() {
    return this.iqn;
  }

  public A withIqn(java.lang.String iqn) {
    this.iqn = iqn;
    return (A) this;
  }

  public java.lang.Boolean hasIqn() {
    return this.iqn != null;
  }

  /** Method is deprecated. use withIqn instead. */
  @java.lang.Deprecated
  public A withNewIqn(java.lang.String original) {
    return (A) withIqn(new String(original));
  }

  public java.lang.String getIscsiInterface() {
    return this.iscsiInterface;
  }

  public A withIscsiInterface(java.lang.String iscsiInterface) {
    this.iscsiInterface = iscsiInterface;
    return (A) this;
  }

  public java.lang.Boolean hasIscsiInterface() {
    return this.iscsiInterface != null;
  }

  /** Method is deprecated. use withIscsiInterface instead. */
  @java.lang.Deprecated
  public A withNewIscsiInterface(java.lang.String original) {
    return (A) withIscsiInterface(new String(original));
  }

  public java.lang.Integer getLun() {
    return this.lun;
  }

  public A withLun(java.lang.Integer lun) {
    this.lun = lun;
    return (A) this;
  }

  public java.lang.Boolean hasLun() {
    return this.lun != null;
  }

  public A addToPortals(java.lang.Integer index, java.lang.String item) {
    if (this.portals == null) {
      this.portals = new java.util.ArrayList<java.lang.String>();
    }
    this.portals.add(index, item);
    return (A) this;
  }

  public A setToPortals(java.lang.Integer index, java.lang.String item) {
    if (this.portals == null) {
      this.portals = new java.util.ArrayList<java.lang.String>();
    }
    this.portals.set(index, item);
    return (A) this;
  }

  public A addToPortals(java.lang.String... items) {
    if (this.portals == null) {
      this.portals = new java.util.ArrayList<java.lang.String>();
    }
    for (java.lang.String item : items) {
      this.portals.add(item);
    }
    return (A) this;
  }

  public A addAllToPortals(java.util.Collection<java.lang.String> items) {
    if (this.portals == null) {
      this.portals = new java.util.ArrayList<java.lang.String>();
    }
    for (java.lang.String item : items) {
      this.portals.add(item);
    }
    return (A) this;
  }

  public A removeFromPortals(java.lang.String... items) {
    for (java.lang.String item : items) {
      if (this.portals != null) {
        this.portals.remove(item);
      }
    }
    return (A) this;
  }

  public A removeAllFromPortals(java.util.Collection<java.lang.String> items) {
    for (java.lang.String item : items) {
      if (this.portals != null) {
        this.portals.remove(item);
      }
    }
    return (A) this;
  }

  public java.util.List<java.lang.String> getPortals() {
    return this.portals;
  }

  public java.lang.String getPortal(java.lang.Integer index) {
    return this.portals.get(index);
  }

  public java.lang.String getFirstPortal() {
    return this.portals.get(0);
  }

  public java.lang.String getLastPortal() {
    return this.portals.get(portals.size() - 1);
  }

  public java.lang.String getMatchingPortal(
      java.util.function.Predicate<java.lang.String> predicate) {
    for (java.lang.String item : portals) {
      if (predicate.test(item)) {
        return item;
      }
    }
    return null;
  }

  public java.lang.Boolean hasMatchingPortal(
      java.util.function.Predicate<java.lang.String> predicate) {
    for (java.lang.String item : portals) {
      if (predicate.test(item)) {
        return true;
      }
    }
    return false;
  }

  public A withPortals(java.util.List<java.lang.String> portals) {
    if (portals != null) {
      this.portals = new java.util.ArrayList();
      for (java.lang.String item : portals) {
        this.addToPortals(item);
      }
    } else {
      this.portals = null;
    }
    return (A) this;
  }

  public A withPortals(java.lang.String... portals) {
    if (this.portals != null) {
      this.portals.clear();
    }
    if (portals != null) {
      for (java.lang.String item : portals) {
        this.addToPortals(item);
      }
    }
    return (A) this;
  }

  public java.lang.Boolean hasPortals() {
    return portals != null && !portals.isEmpty();
  }

  public A addNewPortal(java.lang.String original) {
    return (A) addToPortals(new String(original));
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

  /**
   * This method has been deprecated, please use method buildSecretRef instead.
   *
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public io.kubernetes.client.openapi.models.V1LocalObjectReference getSecretRef() {
    return this.secretRef != null ? this.secretRef.build() : null;
  }

  public io.kubernetes.client.openapi.models.V1LocalObjectReference buildSecretRef() {
    return this.secretRef != null ? this.secretRef.build() : null;
  }

  public A withSecretRef(io.kubernetes.client.openapi.models.V1LocalObjectReference secretRef) {
    _visitables.get("secretRef").remove(this.secretRef);
    if (secretRef != null) {
      this.secretRef =
          new io.kubernetes.client.openapi.models.V1LocalObjectReferenceBuilder(secretRef);
      _visitables.get("secretRef").add(this.secretRef);
    }
    return (A) this;
  }

  public java.lang.Boolean hasSecretRef() {
    return this.secretRef != null;
  }

  public io.kubernetes.client.openapi.models.V1ISCSIVolumeSourceFluent.SecretRefNested<A>
      withNewSecretRef() {
    return new io.kubernetes.client.openapi.models.V1ISCSIVolumeSourceFluentImpl
        .SecretRefNestedImpl();
  }

  public io.kubernetes.client.openapi.models.V1ISCSIVolumeSourceFluent.SecretRefNested<A>
      withNewSecretRefLike(io.kubernetes.client.openapi.models.V1LocalObjectReference item) {
    return new io.kubernetes.client.openapi.models.V1ISCSIVolumeSourceFluentImpl
        .SecretRefNestedImpl(item);
  }

  public io.kubernetes.client.openapi.models.V1ISCSIVolumeSourceFluent.SecretRefNested<A>
      editSecretRef() {
    return withNewSecretRefLike(getSecretRef());
  }

  public io.kubernetes.client.openapi.models.V1ISCSIVolumeSourceFluent.SecretRefNested<A>
      editOrNewSecretRef() {
    return withNewSecretRefLike(
        getSecretRef() != null
            ? getSecretRef()
            : new io.kubernetes.client.openapi.models.V1LocalObjectReferenceBuilder().build());
  }

  public io.kubernetes.client.openapi.models.V1ISCSIVolumeSourceFluent.SecretRefNested<A>
      editOrNewSecretRefLike(io.kubernetes.client.openapi.models.V1LocalObjectReference item) {
    return withNewSecretRefLike(getSecretRef() != null ? getSecretRef() : item);
  }

  public java.lang.String getTargetPortal() {
    return this.targetPortal;
  }

  public A withTargetPortal(java.lang.String targetPortal) {
    this.targetPortal = targetPortal;
    return (A) this;
  }

  public java.lang.Boolean hasTargetPortal() {
    return this.targetPortal != null;
  }

  /** Method is deprecated. use withTargetPortal instead. */
  @java.lang.Deprecated
  public A withNewTargetPortal(java.lang.String original) {
    return (A) withTargetPortal(new String(original));
  }

  public boolean equals(java.lang.Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    V1ISCSIVolumeSourceFluentImpl that = (V1ISCSIVolumeSourceFluentImpl) o;
    if (chapAuthDiscovery != null
        ? !chapAuthDiscovery.equals(that.chapAuthDiscovery)
        : that.chapAuthDiscovery != null) return false;
    if (chapAuthSession != null
        ? !chapAuthSession.equals(that.chapAuthSession)
        : that.chapAuthSession != null) return false;
    if (fsType != null ? !fsType.equals(that.fsType) : that.fsType != null) return false;
    if (initiatorName != null
        ? !initiatorName.equals(that.initiatorName)
        : that.initiatorName != null) return false;
    if (iqn != null ? !iqn.equals(that.iqn) : that.iqn != null) return false;
    if (iscsiInterface != null
        ? !iscsiInterface.equals(that.iscsiInterface)
        : that.iscsiInterface != null) return false;
    if (lun != null ? !lun.equals(that.lun) : that.lun != null) return false;
    if (portals != null ? !portals.equals(that.portals) : that.portals != null) return false;
    if (readOnly != null ? !readOnly.equals(that.readOnly) : that.readOnly != null) return false;
    if (secretRef != null ? !secretRef.equals(that.secretRef) : that.secretRef != null)
      return false;
    if (targetPortal != null ? !targetPortal.equals(that.targetPortal) : that.targetPortal != null)
      return false;
    return true;
  }

  public int hashCode() {
    return java.util.Objects.hash(
        chapAuthDiscovery,
        chapAuthSession,
        fsType,
        initiatorName,
        iqn,
        iscsiInterface,
        lun,
        portals,
        readOnly,
        secretRef,
        targetPortal,
        super.hashCode());
  }

  public class SecretRefNestedImpl<N>
      extends io.kubernetes.client.openapi.models.V1LocalObjectReferenceFluentImpl<
          io.kubernetes.client.openapi.models.V1ISCSIVolumeSourceFluent.SecretRefNested<N>>
      implements io.kubernetes.client.openapi.models.V1ISCSIVolumeSourceFluent.SecretRefNested<N>,
          io.kubernetes.client.fluent.Nested<N> {
    SecretRefNestedImpl(io.kubernetes.client.openapi.models.V1LocalObjectReference item) {
      this.builder =
          new io.kubernetes.client.openapi.models.V1LocalObjectReferenceBuilder(this, item);
    }

    SecretRefNestedImpl() {
      this.builder = new io.kubernetes.client.openapi.models.V1LocalObjectReferenceBuilder(this);
    }

    io.kubernetes.client.openapi.models.V1LocalObjectReferenceBuilder builder;

    public N and() {
      return (N) V1ISCSIVolumeSourceFluentImpl.this.withSecretRef(builder.build());
    }

    public N endSecretRef() {
      return and();
    }
  }
}
