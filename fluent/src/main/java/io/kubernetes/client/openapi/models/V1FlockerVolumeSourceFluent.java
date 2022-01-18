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
public interface V1FlockerVolumeSourceFluent<
        A extends io.kubernetes.client.openapi.models.V1FlockerVolumeSourceFluent<A>>
    extends io.kubernetes.client.fluent.Fluent<A> {
  public java.lang.String getDatasetName();

  public A withDatasetName(java.lang.String datasetName);

  public java.lang.Boolean hasDatasetName();

  /** Method is deprecated. use withDatasetName instead. */
  @java.lang.Deprecated
  public A withNewDatasetName(java.lang.String original);

  public java.lang.String getDatasetUUID();

  public A withDatasetUUID(java.lang.String datasetUUID);

  public java.lang.Boolean hasDatasetUUID();

  /** Method is deprecated. use withDatasetUUID instead. */
  @java.lang.Deprecated
  public A withNewDatasetUUID(java.lang.String original);
}
