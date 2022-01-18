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
public class V1AWSElasticBlockStoreVolumeSourceFluentImpl<
        A extends io.kubernetes.client.openapi.models.V1AWSElasticBlockStoreVolumeSourceFluent<A>>
    extends io.kubernetes.client.fluent.BaseFluent<A>
    implements io.kubernetes.client.openapi.models.V1AWSElasticBlockStoreVolumeSourceFluent<A> {
  public V1AWSElasticBlockStoreVolumeSourceFluentImpl() {}

  public V1AWSElasticBlockStoreVolumeSourceFluentImpl(
      io.kubernetes.client.openapi.models.V1AWSElasticBlockStoreVolumeSource instance) {
    this.withFsType(instance.getFsType());

    this.withPartition(instance.getPartition());

    this.withReadOnly(instance.getReadOnly());

    this.withVolumeID(instance.getVolumeID());
  }

  private java.lang.String fsType;
  private java.lang.Integer partition;
  private java.lang.Boolean readOnly;
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

  /** Method is deprecated. use withFsType instead. */
  @java.lang.Deprecated
  public A withNewFsType(java.lang.String original) {
    return (A) withFsType(new String(original));
  }

  public java.lang.Integer getPartition() {
    return this.partition;
  }

  public A withPartition(java.lang.Integer partition) {
    this.partition = partition;
    return (A) this;
  }

  public java.lang.Boolean hasPartition() {
    return this.partition != null;
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

  /** Method is deprecated. use withVolumeID instead. */
  @java.lang.Deprecated
  public A withNewVolumeID(java.lang.String original) {
    return (A) withVolumeID(new String(original));
  }

  public boolean equals(java.lang.Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    V1AWSElasticBlockStoreVolumeSourceFluentImpl that =
        (V1AWSElasticBlockStoreVolumeSourceFluentImpl) o;
    if (fsType != null ? !fsType.equals(that.fsType) : that.fsType != null) return false;
    if (partition != null ? !partition.equals(that.partition) : that.partition != null)
      return false;
    if (readOnly != null ? !readOnly.equals(that.readOnly) : that.readOnly != null) return false;
    if (volumeID != null ? !volumeID.equals(that.volumeID) : that.volumeID != null) return false;
    return true;
  }

  public int hashCode() {
    return java.util.Objects.hash(fsType, partition, readOnly, volumeID, super.hashCode());
  }
}
