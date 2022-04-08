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

/** Generated */
@SuppressWarnings(value = "unchecked")
public class V1ScaleIOPersistentVolumeSourceFluentImpl<
        A extends V1ScaleIOPersistentVolumeSourceFluent<A>>
    extends BaseFluent<A> implements V1ScaleIOPersistentVolumeSourceFluent<A> {
  public V1ScaleIOPersistentVolumeSourceFluentImpl() {}

  public V1ScaleIOPersistentVolumeSourceFluentImpl(
      io.kubernetes.client.openapi.models.V1ScaleIOPersistentVolumeSource instance) {
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

  private String fsType;
  private java.lang.String gateway;
  private java.lang.String protectionDomain;
  private Boolean readOnly;
  private V1SecretReferenceBuilder secretRef;
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
  @Deprecated
  public V1SecretReference getSecretRef() {
    return this.secretRef != null ? this.secretRef.build() : null;
  }

  public io.kubernetes.client.openapi.models.V1SecretReference buildSecretRef() {
    return this.secretRef != null ? this.secretRef.build() : null;
  }

  public A withSecretRef(io.kubernetes.client.openapi.models.V1SecretReference secretRef) {
    _visitables.get("secretRef").remove(this.secretRef);
    if (secretRef != null) {
      this.secretRef = new io.kubernetes.client.openapi.models.V1SecretReferenceBuilder(secretRef);
      _visitables.get("secretRef").add(this.secretRef);
    }
    return (A) this;
  }

  public java.lang.Boolean hasSecretRef() {
    return this.secretRef != null;
  }

  public V1ScaleIOPersistentVolumeSourceFluent.SecretRefNested<A> withNewSecretRef() {
    return new V1ScaleIOPersistentVolumeSourceFluentImpl.SecretRefNestedImpl();
  }

  public io.kubernetes.client.openapi.models.V1ScaleIOPersistentVolumeSourceFluent.SecretRefNested<
          A>
      withNewSecretRefLike(io.kubernetes.client.openapi.models.V1SecretReference item) {
    return new V1ScaleIOPersistentVolumeSourceFluentImpl.SecretRefNestedImpl(item);
  }

  public io.kubernetes.client.openapi.models.V1ScaleIOPersistentVolumeSourceFluent.SecretRefNested<
          A>
      editSecretRef() {
    return withNewSecretRefLike(getSecretRef());
  }

  public io.kubernetes.client.openapi.models.V1ScaleIOPersistentVolumeSourceFluent.SecretRefNested<
          A>
      editOrNewSecretRef() {
    return withNewSecretRefLike(
        getSecretRef() != null
            ? getSecretRef()
            : new io.kubernetes.client.openapi.models.V1SecretReferenceBuilder().build());
  }

  public io.kubernetes.client.openapi.models.V1ScaleIOPersistentVolumeSourceFluent.SecretRefNested<
          A>
      editOrNewSecretRefLike(io.kubernetes.client.openapi.models.V1SecretReference item) {
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

  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    V1ScaleIOPersistentVolumeSourceFluentImpl that = (V1ScaleIOPersistentVolumeSourceFluentImpl) o;
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

  public java.lang.String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (fsType != null) {
      sb.append("fsType:");
      sb.append(fsType + ",");
    }
    if (gateway != null) {
      sb.append("gateway:");
      sb.append(gateway + ",");
    }
    if (protectionDomain != null) {
      sb.append("protectionDomain:");
      sb.append(protectionDomain + ",");
    }
    if (readOnly != null) {
      sb.append("readOnly:");
      sb.append(readOnly + ",");
    }
    if (secretRef != null) {
      sb.append("secretRef:");
      sb.append(secretRef + ",");
    }
    if (sslEnabled != null) {
      sb.append("sslEnabled:");
      sb.append(sslEnabled + ",");
    }
    if (storageMode != null) {
      sb.append("storageMode:");
      sb.append(storageMode + ",");
    }
    if (storagePool != null) {
      sb.append("storagePool:");
      sb.append(storagePool + ",");
    }
    if (system != null) {
      sb.append("system:");
      sb.append(system + ",");
    }
    if (volumeName != null) {
      sb.append("volumeName:");
      sb.append(volumeName);
    }
    sb.append("}");
    return sb.toString();
  }

  public A withReadOnly() {
    return withReadOnly(true);
  }

  public A withSslEnabled() {
    return withSslEnabled(true);
  }

  class SecretRefNestedImpl<N>
      extends V1SecretReferenceFluentImpl<V1ScaleIOPersistentVolumeSourceFluent.SecretRefNested<N>>
      implements io.kubernetes.client.openapi.models.V1ScaleIOPersistentVolumeSourceFluent
                  .SecretRefNested<
              N>,
          Nested<N> {
    SecretRefNestedImpl(V1SecretReference item) {
      this.builder = new V1SecretReferenceBuilder(this, item);
    }

    SecretRefNestedImpl() {
      this.builder = new io.kubernetes.client.openapi.models.V1SecretReferenceBuilder(this);
    }

    io.kubernetes.client.openapi.models.V1SecretReferenceBuilder builder;

    public N and() {
      return (N) V1ScaleIOPersistentVolumeSourceFluentImpl.this.withSecretRef(builder.build());
    }

    public N endSecretRef() {
      return and();
    }
  }
}
