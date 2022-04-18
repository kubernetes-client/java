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
public class V1CinderVolumeSourceFluentImpl<A extends V1CinderVolumeSourceFluent<A>>
    extends BaseFluent<A> implements V1CinderVolumeSourceFluent<A> {
  public V1CinderVolumeSourceFluentImpl() {}

  public V1CinderVolumeSourceFluentImpl(
      io.kubernetes.client.openapi.models.V1CinderVolumeSource instance) {
    this.withFsType(instance.getFsType());

    this.withReadOnly(instance.getReadOnly());

    this.withSecretRef(instance.getSecretRef());

    this.withVolumeID(instance.getVolumeID());
  }

  private String fsType;
  private Boolean readOnly;
  private V1LocalObjectReferenceBuilder secretRef;
  private java.lang.String volumeID;

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
  public V1LocalObjectReference getSecretRef() {
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

  public V1CinderVolumeSourceFluent.SecretRefNested<A> withNewSecretRef() {
    return new V1CinderVolumeSourceFluentImpl.SecretRefNestedImpl();
  }

  public io.kubernetes.client.openapi.models.V1CinderVolumeSourceFluent.SecretRefNested<A>
      withNewSecretRefLike(io.kubernetes.client.openapi.models.V1LocalObjectReference item) {
    return new V1CinderVolumeSourceFluentImpl.SecretRefNestedImpl(item);
  }

  public io.kubernetes.client.openapi.models.V1CinderVolumeSourceFluent.SecretRefNested<A>
      editSecretRef() {
    return withNewSecretRefLike(getSecretRef());
  }

  public io.kubernetes.client.openapi.models.V1CinderVolumeSourceFluent.SecretRefNested<A>
      editOrNewSecretRef() {
    return withNewSecretRefLike(
        getSecretRef() != null
            ? getSecretRef()
            : new io.kubernetes.client.openapi.models.V1LocalObjectReferenceBuilder().build());
  }

  public io.kubernetes.client.openapi.models.V1CinderVolumeSourceFluent.SecretRefNested<A>
      editOrNewSecretRefLike(io.kubernetes.client.openapi.models.V1LocalObjectReference item) {
    return withNewSecretRefLike(getSecretRef() != null ? getSecretRef() : item);
  }

  public java.lang.String getVolumeID() {
    return this.volumeID;
  }

  public A withVolumeID(java.lang.String volumeID) {
    this.volumeID = volumeID;
    return (A) this;
  }

  public java.lang.Boolean hasVolumeID() {
    return this.volumeID != null;
  }

  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    V1CinderVolumeSourceFluentImpl that = (V1CinderVolumeSourceFluentImpl) o;
    if (fsType != null ? !fsType.equals(that.fsType) : that.fsType != null) return false;
    if (readOnly != null ? !readOnly.equals(that.readOnly) : that.readOnly != null) return false;
    if (secretRef != null ? !secretRef.equals(that.secretRef) : that.secretRef != null)
      return false;
    if (volumeID != null ? !volumeID.equals(that.volumeID) : that.volumeID != null) return false;
    return true;
  }

  public int hashCode() {
    return java.util.Objects.hash(fsType, readOnly, secretRef, volumeID, super.hashCode());
  }

  public java.lang.String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (fsType != null) {
      sb.append("fsType:");
      sb.append(fsType + ",");
    }
    if (readOnly != null) {
      sb.append("readOnly:");
      sb.append(readOnly + ",");
    }
    if (secretRef != null) {
      sb.append("secretRef:");
      sb.append(secretRef + ",");
    }
    if (volumeID != null) {
      sb.append("volumeID:");
      sb.append(volumeID);
    }
    sb.append("}");
    return sb.toString();
  }

  public A withReadOnly() {
    return withReadOnly(true);
  }

  class SecretRefNestedImpl<N>
      extends V1LocalObjectReferenceFluentImpl<V1CinderVolumeSourceFluent.SecretRefNested<N>>
      implements io.kubernetes.client.openapi.models.V1CinderVolumeSourceFluent.SecretRefNested<N>,
          Nested<N> {
    SecretRefNestedImpl(V1LocalObjectReference item) {
      this.builder = new V1LocalObjectReferenceBuilder(this, item);
    }

    SecretRefNestedImpl() {
      this.builder = new io.kubernetes.client.openapi.models.V1LocalObjectReferenceBuilder(this);
    }

    io.kubernetes.client.openapi.models.V1LocalObjectReferenceBuilder builder;

    public N and() {
      return (N) V1CinderVolumeSourceFluentImpl.this.withSecretRef(builder.build());
    }

    public N endSecretRef() {
      return and();
    }
  }
}
