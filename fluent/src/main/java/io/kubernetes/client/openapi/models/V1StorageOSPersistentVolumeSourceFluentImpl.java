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
public class V1StorageOSPersistentVolumeSourceFluentImpl<
        A extends io.kubernetes.client.openapi.models.V1StorageOSPersistentVolumeSourceFluent<A>>
    extends io.kubernetes.client.fluent.BaseFluent<A>
    implements io.kubernetes.client.openapi.models.V1StorageOSPersistentVolumeSourceFluent<A> {
  public V1StorageOSPersistentVolumeSourceFluentImpl() {}

  public V1StorageOSPersistentVolumeSourceFluentImpl(
      io.kubernetes.client.openapi.models.V1StorageOSPersistentVolumeSource instance) {
    this.withFsType(instance.getFsType());

    this.withReadOnly(instance.getReadOnly());

    this.withSecretRef(instance.getSecretRef());

    this.withVolumeName(instance.getVolumeName());

    this.withVolumeNamespace(instance.getVolumeNamespace());
  }

  private java.lang.String fsType;
  private java.lang.Boolean readOnly;
  private io.kubernetes.client.openapi.models.V1ObjectReferenceBuilder secretRef;
  private java.lang.String volumeName;
  private java.lang.String volumeNamespace;

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
  public io.kubernetes.client.openapi.models.V1ObjectReference getSecretRef() {
    return this.secretRef != null ? this.secretRef.build() : null;
  }

  public io.kubernetes.client.openapi.models.V1ObjectReference buildSecretRef() {
    return this.secretRef != null ? this.secretRef.build() : null;
  }

  public A withSecretRef(io.kubernetes.client.openapi.models.V1ObjectReference secretRef) {
    _visitables.get("secretRef").remove(this.secretRef);
    if (secretRef != null) {
      this.secretRef = new io.kubernetes.client.openapi.models.V1ObjectReferenceBuilder(secretRef);
      _visitables.get("secretRef").add(this.secretRef);
    }
    return (A) this;
  }

  public java.lang.Boolean hasSecretRef() {
    return this.secretRef != null;
  }

  public io.kubernetes.client.openapi.models.V1StorageOSPersistentVolumeSourceFluent
              .SecretRefNested<
          A>
      withNewSecretRef() {
    return new io.kubernetes.client.openapi.models.V1StorageOSPersistentVolumeSourceFluentImpl
        .SecretRefNestedImpl();
  }

  public io.kubernetes.client.openapi.models.V1StorageOSPersistentVolumeSourceFluent
              .SecretRefNested<
          A>
      withNewSecretRefLike(io.kubernetes.client.openapi.models.V1ObjectReference item) {
    return new io.kubernetes.client.openapi.models.V1StorageOSPersistentVolumeSourceFluentImpl
        .SecretRefNestedImpl(item);
  }

  public io.kubernetes.client.openapi.models.V1StorageOSPersistentVolumeSourceFluent
              .SecretRefNested<
          A>
      editSecretRef() {
    return withNewSecretRefLike(getSecretRef());
  }

  public io.kubernetes.client.openapi.models.V1StorageOSPersistentVolumeSourceFluent
              .SecretRefNested<
          A>
      editOrNewSecretRef() {
    return withNewSecretRefLike(
        getSecretRef() != null
            ? getSecretRef()
            : new io.kubernetes.client.openapi.models.V1ObjectReferenceBuilder().build());
  }

  public io.kubernetes.client.openapi.models.V1StorageOSPersistentVolumeSourceFluent
              .SecretRefNested<
          A>
      editOrNewSecretRefLike(io.kubernetes.client.openapi.models.V1ObjectReference item) {
    return withNewSecretRefLike(getSecretRef() != null ? getSecretRef() : item);
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

  public java.lang.String getVolumeNamespace() {
    return this.volumeNamespace;
  }

  public A withVolumeNamespace(java.lang.String volumeNamespace) {
    this.volumeNamespace = volumeNamespace;
    return (A) this;
  }

  public java.lang.Boolean hasVolumeNamespace() {
    return this.volumeNamespace != null;
  }

  /** Method is deprecated. use withVolumeNamespace instead. */
  @java.lang.Deprecated
  public A withNewVolumeNamespace(java.lang.String original) {
    return (A) withVolumeNamespace(new String(original));
  }

  public boolean equals(java.lang.Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    V1StorageOSPersistentVolumeSourceFluentImpl that =
        (V1StorageOSPersistentVolumeSourceFluentImpl) o;
    if (fsType != null ? !fsType.equals(that.fsType) : that.fsType != null) return false;
    if (readOnly != null ? !readOnly.equals(that.readOnly) : that.readOnly != null) return false;
    if (secretRef != null ? !secretRef.equals(that.secretRef) : that.secretRef != null)
      return false;
    if (volumeName != null ? !volumeName.equals(that.volumeName) : that.volumeName != null)
      return false;
    if (volumeNamespace != null
        ? !volumeNamespace.equals(that.volumeNamespace)
        : that.volumeNamespace != null) return false;
    return true;
  }

  public int hashCode() {
    return java.util.Objects.hash(
        fsType, readOnly, secretRef, volumeName, volumeNamespace, super.hashCode());
  }

  public class SecretRefNestedImpl<N>
      extends io.kubernetes.client.openapi.models.V1ObjectReferenceFluentImpl<
          io.kubernetes.client.openapi.models.V1StorageOSPersistentVolumeSourceFluent
                  .SecretRefNested<
              N>>
      implements io.kubernetes.client.openapi.models.V1StorageOSPersistentVolumeSourceFluent
                  .SecretRefNested<
              N>,
          io.kubernetes.client.fluent.Nested<N> {
    SecretRefNestedImpl(io.kubernetes.client.openapi.models.V1ObjectReference item) {
      this.builder = new io.kubernetes.client.openapi.models.V1ObjectReferenceBuilder(this, item);
    }

    SecretRefNestedImpl() {
      this.builder = new io.kubernetes.client.openapi.models.V1ObjectReferenceBuilder(this);
    }

    io.kubernetes.client.openapi.models.V1ObjectReferenceBuilder builder;

    public N and() {
      return (N) V1StorageOSPersistentVolumeSourceFluentImpl.this.withSecretRef(builder.build());
    }

    public N endSecretRef() {
      return and();
    }
  }
}
