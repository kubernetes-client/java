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
public class V1FlockerVolumeSourceFluentImpl<A extends V1FlockerVolumeSourceFluent<A>>
    extends BaseFluent<A> implements V1FlockerVolumeSourceFluent<A> {
  public V1FlockerVolumeSourceFluentImpl() {}

  public V1FlockerVolumeSourceFluentImpl(
      io.kubernetes.client.openapi.models.V1FlockerVolumeSource instance) {
    this.withDatasetName(instance.getDatasetName());

    this.withDatasetUUID(instance.getDatasetUUID());
  }

  private String datasetName;
  private java.lang.String datasetUUID;

  public java.lang.String getDatasetName() {
    return this.datasetName;
  }

  public A withDatasetName(java.lang.String datasetName) {
    this.datasetName = datasetName;
    return (A) this;
  }

  public Boolean hasDatasetName() {
    return this.datasetName != null;
  }

  public java.lang.String getDatasetUUID() {
    return this.datasetUUID;
  }

  public A withDatasetUUID(java.lang.String datasetUUID) {
    this.datasetUUID = datasetUUID;
    return (A) this;
  }

  public java.lang.Boolean hasDatasetUUID() {
    return this.datasetUUID != null;
  }

  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    V1FlockerVolumeSourceFluentImpl that = (V1FlockerVolumeSourceFluentImpl) o;
    if (datasetName != null ? !datasetName.equals(that.datasetName) : that.datasetName != null)
      return false;
    if (datasetUUID != null ? !datasetUUID.equals(that.datasetUUID) : that.datasetUUID != null)
      return false;
    return true;
  }

  public int hashCode() {
    return java.util.Objects.hash(datasetName, datasetUUID, super.hashCode());
  }

  public java.lang.String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (datasetName != null) {
      sb.append("datasetName:");
      sb.append(datasetName + ",");
    }
    if (datasetUUID != null) {
      sb.append("datasetUUID:");
      sb.append(datasetUUID);
    }
    sb.append("}");
    return sb.toString();
  }
}
