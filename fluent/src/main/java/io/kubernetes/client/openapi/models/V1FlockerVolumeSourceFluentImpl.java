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
public class V1FlockerVolumeSourceFluentImpl<
        A extends io.kubernetes.client.openapi.models.V1FlockerVolumeSourceFluent<A>>
    extends io.kubernetes.client.fluent.BaseFluent<A>
    implements io.kubernetes.client.openapi.models.V1FlockerVolumeSourceFluent<A> {
  public V1FlockerVolumeSourceFluentImpl() {}

  public V1FlockerVolumeSourceFluentImpl(
      io.kubernetes.client.openapi.models.V1FlockerVolumeSource instance) {
    this.withDatasetName(instance.getDatasetName());

    this.withDatasetUUID(instance.getDatasetUUID());
  }

  private java.lang.String datasetName;
  private java.lang.String datasetUUID;

  public java.lang.String getDatasetName() {
    return this.datasetName;
  }

  public A withDatasetName(java.lang.String datasetName) {
    this.datasetName = datasetName;
    return (A) this;
  }

  public java.lang.Boolean hasDatasetName() {
    return this.datasetName != null;
  }

  /** Method is deprecated. use withDatasetName instead. */
  @java.lang.Deprecated
  public A withNewDatasetName(java.lang.String original) {
    return (A) withDatasetName(new String(original));
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

  /** Method is deprecated. use withDatasetUUID instead. */
  @java.lang.Deprecated
  public A withNewDatasetUUID(java.lang.String original) {
    return (A) withDatasetUUID(new String(original));
  }

  public boolean equals(java.lang.Object o) {
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
}
