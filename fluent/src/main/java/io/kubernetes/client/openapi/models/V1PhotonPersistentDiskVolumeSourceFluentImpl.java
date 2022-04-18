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
public class V1PhotonPersistentDiskVolumeSourceFluentImpl<
        A extends V1PhotonPersistentDiskVolumeSourceFluent<A>>
    extends BaseFluent<A> implements V1PhotonPersistentDiskVolumeSourceFluent<A> {
  public V1PhotonPersistentDiskVolumeSourceFluentImpl() {}

  public V1PhotonPersistentDiskVolumeSourceFluentImpl(
      io.kubernetes.client.openapi.models.V1PhotonPersistentDiskVolumeSource instance) {
    this.withFsType(instance.getFsType());

    this.withPdID(instance.getPdID());
  }

  private String fsType;
  private java.lang.String pdID;

  public java.lang.String getFsType() {
    return this.fsType;
  }

  public A withFsType(java.lang.String fsType) {
    this.fsType = fsType;
    return (A) this;
  }

  public Boolean hasFsType() {
    return this.fsType != null;
  }

  public java.lang.String getPdID() {
    return this.pdID;
  }

  public A withPdID(java.lang.String pdID) {
    this.pdID = pdID;
    return (A) this;
  }

  public java.lang.Boolean hasPdID() {
    return this.pdID != null;
  }

  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    V1PhotonPersistentDiskVolumeSourceFluentImpl that =
        (V1PhotonPersistentDiskVolumeSourceFluentImpl) o;
    if (fsType != null ? !fsType.equals(that.fsType) : that.fsType != null) return false;
    if (pdID != null ? !pdID.equals(that.pdID) : that.pdID != null) return false;
    return true;
  }

  public int hashCode() {
    return java.util.Objects.hash(fsType, pdID, super.hashCode());
  }

  public java.lang.String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (fsType != null) {
      sb.append("fsType:");
      sb.append(fsType + ",");
    }
    if (pdID != null) {
      sb.append("pdID:");
      sb.append(pdID);
    }
    sb.append("}");
    return sb.toString();
  }
}
