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

/** Generated */
@SuppressWarnings(value = "unchecked")
public class V1GCEPersistentDiskVolumeSourceFluentImpl<
        A extends V1GCEPersistentDiskVolumeSourceFluent<A>>
    extends BaseFluent<A> implements V1GCEPersistentDiskVolumeSourceFluent<A> {
  public V1GCEPersistentDiskVolumeSourceFluentImpl() {}

  public V1GCEPersistentDiskVolumeSourceFluentImpl(
      io.kubernetes.client.openapi.models.V1GCEPersistentDiskVolumeSource instance) {
    this.withFsType(instance.getFsType());

    this.withPartition(instance.getPartition());

    this.withPdName(instance.getPdName());

    this.withReadOnly(instance.getReadOnly());
  }

  private String fsType;
  private Integer partition;
  private java.lang.String pdName;
  private Boolean readOnly;

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

  public java.lang.String getPdName() {
    return this.pdName;
  }

  public A withPdName(java.lang.String pdName) {
    this.pdName = pdName;
    return (A) this;
  }

  public java.lang.Boolean hasPdName() {
    return this.pdName != null;
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

  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    V1GCEPersistentDiskVolumeSourceFluentImpl that = (V1GCEPersistentDiskVolumeSourceFluentImpl) o;
    if (fsType != null ? !fsType.equals(that.fsType) : that.fsType != null) return false;
    if (partition != null ? !partition.equals(that.partition) : that.partition != null)
      return false;
    if (pdName != null ? !pdName.equals(that.pdName) : that.pdName != null) return false;
    if (readOnly != null ? !readOnly.equals(that.readOnly) : that.readOnly != null) return false;
    return true;
  }

  public int hashCode() {
    return java.util.Objects.hash(fsType, partition, pdName, readOnly, super.hashCode());
  }

  public java.lang.String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (fsType != null) {
      sb.append("fsType:");
      sb.append(fsType + ",");
    }
    if (partition != null) {
      sb.append("partition:");
      sb.append(partition + ",");
    }
    if (pdName != null) {
      sb.append("pdName:");
      sb.append(pdName + ",");
    }
    if (readOnly != null) {
      sb.append("readOnly:");
      sb.append(readOnly);
    }
    sb.append("}");
    return sb.toString();
  }

  public A withReadOnly() {
    return withReadOnly(true);
  }
}
