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
public class V1AzureDiskVolumeSourceFluentImpl<
        A extends io.kubernetes.client.openapi.models.V1AzureDiskVolumeSourceFluent<A>>
    extends io.kubernetes.client.fluent.BaseFluent<A>
    implements io.kubernetes.client.openapi.models.V1AzureDiskVolumeSourceFluent<A> {
  public V1AzureDiskVolumeSourceFluentImpl() {}

  public V1AzureDiskVolumeSourceFluentImpl(
      io.kubernetes.client.openapi.models.V1AzureDiskVolumeSource instance) {
    this.withCachingMode(instance.getCachingMode());

    this.withDiskName(instance.getDiskName());

    this.withDiskURI(instance.getDiskURI());

    this.withFsType(instance.getFsType());

    this.withKind(instance.getKind());

    this.withReadOnly(instance.getReadOnly());
  }

  private java.lang.String cachingMode;
  private java.lang.String diskName;
  private java.lang.String diskURI;
  private java.lang.String fsType;
  private java.lang.String kind;
  private java.lang.Boolean readOnly;

  public java.lang.String getCachingMode() {
    return this.cachingMode;
  }

  public A withCachingMode(java.lang.String cachingMode) {
    this.cachingMode = cachingMode;
    return (A) this;
  }

  public java.lang.Boolean hasCachingMode() {
    return this.cachingMode != null;
  }

  /** Method is deprecated. use withCachingMode instead. */
  @java.lang.Deprecated
  public A withNewCachingMode(java.lang.String original) {
    return (A) withCachingMode(new String(original));
  }

  public java.lang.String getDiskName() {
    return this.diskName;
  }

  public A withDiskName(java.lang.String diskName) {
    this.diskName = diskName;
    return (A) this;
  }

  public java.lang.Boolean hasDiskName() {
    return this.diskName != null;
  }

  /** Method is deprecated. use withDiskName instead. */
  @java.lang.Deprecated
  public A withNewDiskName(java.lang.String original) {
    return (A) withDiskName(new String(original));
  }

  public java.lang.String getDiskURI() {
    return this.diskURI;
  }

  public A withDiskURI(java.lang.String diskURI) {
    this.diskURI = diskURI;
    return (A) this;
  }

  public java.lang.Boolean hasDiskURI() {
    return this.diskURI != null;
  }

  /** Method is deprecated. use withDiskURI instead. */
  @java.lang.Deprecated
  public A withNewDiskURI(java.lang.String original) {
    return (A) withDiskURI(new String(original));
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

  /** Method is deprecated. use withKind instead. */
  @java.lang.Deprecated
  public A withNewKind(java.lang.String original) {
    return (A) withKind(new String(original));
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

  public boolean equals(java.lang.Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    V1AzureDiskVolumeSourceFluentImpl that = (V1AzureDiskVolumeSourceFluentImpl) o;
    if (cachingMode != null ? !cachingMode.equals(that.cachingMode) : that.cachingMode != null)
      return false;
    if (diskName != null ? !diskName.equals(that.diskName) : that.diskName != null) return false;
    if (diskURI != null ? !diskURI.equals(that.diskURI) : that.diskURI != null) return false;
    if (fsType != null ? !fsType.equals(that.fsType) : that.fsType != null) return false;
    if (kind != null ? !kind.equals(that.kind) : that.kind != null) return false;
    if (readOnly != null ? !readOnly.equals(that.readOnly) : that.readOnly != null) return false;
    return true;
  }

  public int hashCode() {
    return java.util.Objects.hash(
        cachingMode, diskName, diskURI, fsType, kind, readOnly, super.hashCode());
  }
}
