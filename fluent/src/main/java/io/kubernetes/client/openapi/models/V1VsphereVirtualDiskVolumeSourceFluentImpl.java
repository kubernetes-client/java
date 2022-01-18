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
public class V1VsphereVirtualDiskVolumeSourceFluentImpl<
        A extends io.kubernetes.client.openapi.models.V1VsphereVirtualDiskVolumeSourceFluent<A>>
    extends io.kubernetes.client.fluent.BaseFluent<A>
    implements io.kubernetes.client.openapi.models.V1VsphereVirtualDiskVolumeSourceFluent<A> {
  public V1VsphereVirtualDiskVolumeSourceFluentImpl() {}

  public V1VsphereVirtualDiskVolumeSourceFluentImpl(
      io.kubernetes.client.openapi.models.V1VsphereVirtualDiskVolumeSource instance) {
    this.withFsType(instance.getFsType());

    this.withStoragePolicyID(instance.getStoragePolicyID());

    this.withStoragePolicyName(instance.getStoragePolicyName());

    this.withVolumePath(instance.getVolumePath());
  }

  private java.lang.String fsType;
  private java.lang.String storagePolicyID;
  private java.lang.String storagePolicyName;
  private java.lang.String volumePath;

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

  public java.lang.String getStoragePolicyID() {
    return this.storagePolicyID;
  }

  public A withStoragePolicyID(java.lang.String storagePolicyID) {
    this.storagePolicyID = storagePolicyID;
    return (A) this;
  }

  public java.lang.Boolean hasStoragePolicyID() {
    return this.storagePolicyID != null;
  }

  /** Method is deprecated. use withStoragePolicyID instead. */
  @java.lang.Deprecated
  public A withNewStoragePolicyID(java.lang.String original) {
    return (A) withStoragePolicyID(new String(original));
  }

  public java.lang.String getStoragePolicyName() {
    return this.storagePolicyName;
  }

  public A withStoragePolicyName(java.lang.String storagePolicyName) {
    this.storagePolicyName = storagePolicyName;
    return (A) this;
  }

  public java.lang.Boolean hasStoragePolicyName() {
    return this.storagePolicyName != null;
  }

  /** Method is deprecated. use withStoragePolicyName instead. */
  @java.lang.Deprecated
  public A withNewStoragePolicyName(java.lang.String original) {
    return (A) withStoragePolicyName(new String(original));
  }

  public java.lang.String getVolumePath() {
    return this.volumePath;
  }

  public A withVolumePath(java.lang.String volumePath) {
    this.volumePath = volumePath;
    return (A) this;
  }

  public java.lang.Boolean hasVolumePath() {
    return this.volumePath != null;
  }

  /** Method is deprecated. use withVolumePath instead. */
  @java.lang.Deprecated
  public A withNewVolumePath(java.lang.String original) {
    return (A) withVolumePath(new String(original));
  }

  public boolean equals(java.lang.Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    V1VsphereVirtualDiskVolumeSourceFluentImpl that =
        (V1VsphereVirtualDiskVolumeSourceFluentImpl) o;
    if (fsType != null ? !fsType.equals(that.fsType) : that.fsType != null) return false;
    if (storagePolicyID != null
        ? !storagePolicyID.equals(that.storagePolicyID)
        : that.storagePolicyID != null) return false;
    if (storagePolicyName != null
        ? !storagePolicyName.equals(that.storagePolicyName)
        : that.storagePolicyName != null) return false;
    if (volumePath != null ? !volumePath.equals(that.volumePath) : that.volumePath != null)
      return false;
    return true;
  }

  public int hashCode() {
    return java.util.Objects.hash(
        fsType, storagePolicyID, storagePolicyName, volumePath, super.hashCode());
  }
}
