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
public class V1ScaleIOVolumeSourceFluentImpl<
        A extends io.kubernetes.client.openapi.models.V1ScaleIOVolumeSourceFluent<A>>
    extends io.kubernetes.client.fluent.BaseFluent<A>
    implements io.kubernetes.client.openapi.models.V1ScaleIOVolumeSourceFluent<A> {
  public V1ScaleIOVolumeSourceFluentImpl() {}

  public V1ScaleIOVolumeSourceFluentImpl(
      io.kubernetes.client.openapi.models.V1ScaleIOVolumeSource instance) {
    this.withFsType(instance.getFsType());

    this.withGateway(instance.getGateway());

    this.withProtectionDomain(instance.getProtectionDomain());

    this.withReadOnly(instance.getReadOnly());

    this.withSecretRef(instance.getSecretRef());

    this.withSslEnabled(instance.getSslEnabled());

    this.withStorageMode(instance.getStorageMode());

    this.withStoragePool(instance.getStoragePool());

    this.withSystem(instance.getSystem());

    this.withVolumeName(instance.getVolumeName());
  }

  private java.lang.String fsType;
  private java.lang.String gateway;
  private java.lang.String protectionDomain;
  private java.lang.Boolean readOnly;
  private io.kubernetes.client.openapi.models.V1LocalObjectReferenceBuilder secretRef;
  private java.lang.Boolean sslEnabled;
  private java.lang.String storageMode;
  private java.lang.String storagePool;
  private java.lang.String system;
  private java.lang.String volumeName;

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

  public java.lang.String getGateway() {
    return this.gateway;
  }

  public A withGateway(java.lang.String gateway) {
    this.gateway = gateway;
    return (A) this;
  }

  public java.lang.Boolean hasGateway() {
    return this.gateway != null;
  }

  /** Method is deprecated. use withGateway instead. */
  @java.lang.Deprecated
  public A withNewGateway(java.lang.String original) {
    return (A) withGateway(new String(original));
  }

  public java.lang.String getProtectionDomain() {
    return this.protectionDomain;
  }

  public A withProtectionDomain(java.lang.String protectionDomain) {
    this.protectionDomain = protectionDomain;
    return (A) this;
  }

  public java.lang.Boolean hasProtectionDomain() {
    return this.protectionDomain != null;
  }

  /** Method is deprecated. use withProtectionDomain instead. */
  @java.lang.Deprecated
  public A withNewProtectionDomain(java.lang.String original) {
    return (A) withProtectionDomain(new String(original));
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

  public io.kubernetes.client.openapi.models.V1ScaleIOVolumeSourceFluent.SecretRefNested<A>
      withNewSecretRef() {
    return new io.kubernetes.client.openapi.models.V1ScaleIOVolumeSourceFluentImpl
        .SecretRefNestedImpl();
  }

  public io.kubernetes.client.openapi.models.V1ScaleIOVolumeSourceFluent.SecretRefNested<A>
      withNewSecretRefLike(io.kubernetes.client.openapi.models.V1LocalObjectReference item) {
    return new io.kubernetes.client.openapi.models.V1ScaleIOVolumeSourceFluentImpl
        .SecretRefNestedImpl(item);
  }

  public io.kubernetes.client.openapi.models.V1ScaleIOVolumeSourceFluent.SecretRefNested<A>
      editSecretRef() {
    return withNewSecretRefLike(getSecretRef());
  }

  public io.kubernetes.client.openapi.models.V1ScaleIOVolumeSourceFluent.SecretRefNested<A>
      editOrNewSecretRef() {
    return withNewSecretRefLike(
        getSecretRef() != null
            ? getSecretRef()
            : new io.kubernetes.client.openapi.models.V1LocalObjectReferenceBuilder().build());
  }

  public io.kubernetes.client.openapi.models.V1ScaleIOVolumeSourceFluent.SecretRefNested<A>
      editOrNewSecretRefLike(io.kubernetes.client.openapi.models.V1LocalObjectReference item) {
    return withNewSecretRefLike(getSecretRef() != null ? getSecretRef() : item);
  }

  public java.lang.Boolean getSslEnabled() {
    return this.sslEnabled;
  }

  public A withSslEnabled(java.lang.Boolean sslEnabled) {
    this.sslEnabled = sslEnabled;
    return (A) this;
  }

  public java.lang.Boolean hasSslEnabled() {
    return this.sslEnabled != null;
  }

  public java.lang.String getStorageMode() {
    return this.storageMode;
  }

  public A withStorageMode(java.lang.String storageMode) {
    this.storageMode = storageMode;
    return (A) this;
  }

  public java.lang.Boolean hasStorageMode() {
    return this.storageMode != null;
  }

  /** Method is deprecated. use withStorageMode instead. */
  @java.lang.Deprecated
  public A withNewStorageMode(java.lang.String original) {
    return (A) withStorageMode(new String(original));
  }

  public java.lang.String getStoragePool() {
    return this.storagePool;
  }

  public A withStoragePool(java.lang.String storagePool) {
    this.storagePool = storagePool;
    return (A) this;
  }

  public java.lang.Boolean hasStoragePool() {
    return this.storagePool != null;
  }

  /** Method is deprecated. use withStoragePool instead. */
  @java.lang.Deprecated
  public A withNewStoragePool(java.lang.String original) {
    return (A) withStoragePool(new String(original));
  }

  public java.lang.String getSystem() {
    return this.system;
  }

  public A withSystem(java.lang.String system) {
    this.system = system;
    return (A) this;
  }

  public java.lang.Boolean hasSystem() {
    return this.system != null;
  }

  /** Method is deprecated. use withSystem instead. */
  @java.lang.Deprecated
  public A withNewSystem(java.lang.String original) {
    return (A) withSystem(new String(original));
  }

  public java.lang.String getVolumeName() {
    return this.volumeName;
  }

  public A withVolumeName(java.lang.String volumeName) {
    this.volumeName = volumeName;
    return (A) this;
  }

  public java.lang.Boolean hasVolumeName() {
    return this.volumeName != null;
  }

  /** Method is deprecated. use withVolumeName instead. */
  @java.lang.Deprecated
  public A withNewVolumeName(java.lang.String original) {
    return (A) withVolumeName(new String(original));
  }

  public boolean equals(java.lang.Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    V1ScaleIOVolumeSourceFluentImpl that = (V1ScaleIOVolumeSourceFluentImpl) o;
    if (fsType != null ? !fsType.equals(that.fsType) : that.fsType != null) return false;
    if (gateway != null ? !gateway.equals(that.gateway) : that.gateway != null) return false;
    if (protectionDomain != null
        ? !protectionDomain.equals(that.protectionDomain)
        : that.protectionDomain != null) return false;
    if (readOnly != null ? !readOnly.equals(that.readOnly) : that.readOnly != null) return false;
    if (secretRef != null ? !secretRef.equals(that.secretRef) : that.secretRef != null)
      return false;
    if (sslEnabled != null ? !sslEnabled.equals(that.sslEnabled) : that.sslEnabled != null)
      return false;
    if (storageMode != null ? !storageMode.equals(that.storageMode) : that.storageMode != null)
      return false;
    if (storagePool != null ? !storagePool.equals(that.storagePool) : that.storagePool != null)
      return false;
    if (system != null ? !system.equals(that.system) : that.system != null) return false;
    if (volumeName != null ? !volumeName.equals(that.volumeName) : that.volumeName != null)
      return false;
    return true;
  }

  public int hashCode() {
    return java.util.Objects.hash(
        fsType,
        gateway,
        protectionDomain,
        readOnly,
        secretRef,
        sslEnabled,
        storageMode,
        storagePool,
        system,
        volumeName,
        super.hashCode());
  }

  public class SecretRefNestedImpl<N>
      extends io.kubernetes.client.openapi.models.V1LocalObjectReferenceFluentImpl<
          io.kubernetes.client.openapi.models.V1ScaleIOVolumeSourceFluent.SecretRefNested<N>>
      implements io.kubernetes.client.openapi.models.V1ScaleIOVolumeSourceFluent.SecretRefNested<N>,
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
      return (N) V1ScaleIOVolumeSourceFluentImpl.this.withSecretRef(builder.build());
    }

    public N endSecretRef() {
      return and();
    }
  }
}
