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

import io.kubernetes.client.custom.Quantity;
import io.kubernetes.client.fluent.Fluent;
import io.kubernetes.client.fluent.Nested;

/** Generated */
public interface V1beta1CSIStorageCapacityFluent<A extends V1beta1CSIStorageCapacityFluent<A>>
    extends Fluent<A> {
  public String getApiVersion();

  public A withApiVersion(java.lang.String apiVersion);

  public Boolean hasApiVersion();

  public Quantity getCapacity();

  public A withCapacity(io.kubernetes.client.custom.Quantity capacity);

  public java.lang.Boolean hasCapacity();

  public A withNewCapacity(java.lang.String value);

  public java.lang.String getKind();

  public A withKind(java.lang.String kind);

  public java.lang.Boolean hasKind();

  public io.kubernetes.client.custom.Quantity getMaximumVolumeSize();

  public A withMaximumVolumeSize(io.kubernetes.client.custom.Quantity maximumVolumeSize);

  public java.lang.Boolean hasMaximumVolumeSize();

  public A withNewMaximumVolumeSize(java.lang.String value);

  /**
   * This method has been deprecated, please use method buildMetadata instead.
   *
   * @return The buildable object.
   */
  @Deprecated
  public V1ObjectMeta getMetadata();

  public io.kubernetes.client.openapi.models.V1ObjectMeta buildMetadata();

  public A withMetadata(io.kubernetes.client.openapi.models.V1ObjectMeta metadata);

  public java.lang.Boolean hasMetadata();

  public V1beta1CSIStorageCapacityFluent.MetadataNested<A> withNewMetadata();

  public io.kubernetes.client.openapi.models.V1beta1CSIStorageCapacityFluent.MetadataNested<A>
      withNewMetadataLike(io.kubernetes.client.openapi.models.V1ObjectMeta item);

  public io.kubernetes.client.openapi.models.V1beta1CSIStorageCapacityFluent.MetadataNested<A>
      editMetadata();

  public io.kubernetes.client.openapi.models.V1beta1CSIStorageCapacityFluent.MetadataNested<A>
      editOrNewMetadata();

  public io.kubernetes.client.openapi.models.V1beta1CSIStorageCapacityFluent.MetadataNested<A>
      editOrNewMetadataLike(io.kubernetes.client.openapi.models.V1ObjectMeta item);

  /**
   * This method has been deprecated, please use method buildNodeTopology instead.
   *
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public V1LabelSelector getNodeTopology();

  public io.kubernetes.client.openapi.models.V1LabelSelector buildNodeTopology();

  public A withNodeTopology(io.kubernetes.client.openapi.models.V1LabelSelector nodeTopology);

  public java.lang.Boolean hasNodeTopology();

  public V1beta1CSIStorageCapacityFluent.NodeTopologyNested<A> withNewNodeTopology();

  public io.kubernetes.client.openapi.models.V1beta1CSIStorageCapacityFluent.NodeTopologyNested<A>
      withNewNodeTopologyLike(io.kubernetes.client.openapi.models.V1LabelSelector item);

  public io.kubernetes.client.openapi.models.V1beta1CSIStorageCapacityFluent.NodeTopologyNested<A>
      editNodeTopology();

  public io.kubernetes.client.openapi.models.V1beta1CSIStorageCapacityFluent.NodeTopologyNested<A>
      editOrNewNodeTopology();

  public io.kubernetes.client.openapi.models.V1beta1CSIStorageCapacityFluent.NodeTopologyNested<A>
      editOrNewNodeTopologyLike(io.kubernetes.client.openapi.models.V1LabelSelector item);

  public java.lang.String getStorageClassName();

  public A withStorageClassName(java.lang.String storageClassName);

  public java.lang.Boolean hasStorageClassName();

  public interface MetadataNested<N>
      extends Nested<N>, V1ObjectMetaFluent<V1beta1CSIStorageCapacityFluent.MetadataNested<N>> {
    public N and();

    public N endMetadata();
  }

  public interface NodeTopologyNested<N>
      extends io.kubernetes.client.fluent.Nested<N>,
          V1LabelSelectorFluent<V1beta1CSIStorageCapacityFluent.NodeTopologyNested<N>> {
    public N and();

    public N endNodeTopology();
  }
}
