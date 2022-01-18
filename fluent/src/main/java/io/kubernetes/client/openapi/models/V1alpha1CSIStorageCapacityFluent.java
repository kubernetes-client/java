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
public interface V1alpha1CSIStorageCapacityFluent<
        A extends io.kubernetes.client.openapi.models.V1alpha1CSIStorageCapacityFluent<A>>
    extends io.kubernetes.client.fluent.Fluent<A> {
  public java.lang.String getApiVersion();

  public A withApiVersion(java.lang.String apiVersion);

  public java.lang.Boolean hasApiVersion();

  /** Method is deprecated. use withApiVersion instead. */
  @java.lang.Deprecated
  public A withNewApiVersion(java.lang.String original);

  public io.kubernetes.client.custom.Quantity getCapacity();

  public A withCapacity(io.kubernetes.client.custom.Quantity capacity);

  public java.lang.Boolean hasCapacity();

  public A withNewCapacity(java.lang.String value);

  public java.lang.String getKind();

  public A withKind(java.lang.String kind);

  public java.lang.Boolean hasKind();

  /** Method is deprecated. use withKind instead. */
  @java.lang.Deprecated
  public A withNewKind(java.lang.String original);

  public io.kubernetes.client.custom.Quantity getMaximumVolumeSize();

  public A withMaximumVolumeSize(io.kubernetes.client.custom.Quantity maximumVolumeSize);

  public java.lang.Boolean hasMaximumVolumeSize();

  public A withNewMaximumVolumeSize(java.lang.String value);

  /**
   * This method has been deprecated, please use method buildMetadata instead.
   *
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public io.kubernetes.client.openapi.models.V1ObjectMeta getMetadata();

  public io.kubernetes.client.openapi.models.V1ObjectMeta buildMetadata();

  public A withMetadata(io.kubernetes.client.openapi.models.V1ObjectMeta metadata);

  public java.lang.Boolean hasMetadata();

  public io.kubernetes.client.openapi.models.V1alpha1CSIStorageCapacityFluent.MetadataNested<A>
      withNewMetadata();

  public io.kubernetes.client.openapi.models.V1alpha1CSIStorageCapacityFluent.MetadataNested<A>
      withNewMetadataLike(io.kubernetes.client.openapi.models.V1ObjectMeta item);

  public io.kubernetes.client.openapi.models.V1alpha1CSIStorageCapacityFluent.MetadataNested<A>
      editMetadata();

  public io.kubernetes.client.openapi.models.V1alpha1CSIStorageCapacityFluent.MetadataNested<A>
      editOrNewMetadata();

  public io.kubernetes.client.openapi.models.V1alpha1CSIStorageCapacityFluent.MetadataNested<A>
      editOrNewMetadataLike(io.kubernetes.client.openapi.models.V1ObjectMeta item);

  /**
   * This method has been deprecated, please use method buildNodeTopology instead.
   *
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public io.kubernetes.client.openapi.models.V1LabelSelector getNodeTopology();

  public io.kubernetes.client.openapi.models.V1LabelSelector buildNodeTopology();

  public A withNodeTopology(io.kubernetes.client.openapi.models.V1LabelSelector nodeTopology);

  public java.lang.Boolean hasNodeTopology();

  public io.kubernetes.client.openapi.models.V1alpha1CSIStorageCapacityFluent.NodeTopologyNested<A>
      withNewNodeTopology();

  public io.kubernetes.client.openapi.models.V1alpha1CSIStorageCapacityFluent.NodeTopologyNested<A>
      withNewNodeTopologyLike(io.kubernetes.client.openapi.models.V1LabelSelector item);

  public io.kubernetes.client.openapi.models.V1alpha1CSIStorageCapacityFluent.NodeTopologyNested<A>
      editNodeTopology();

  public io.kubernetes.client.openapi.models.V1alpha1CSIStorageCapacityFluent.NodeTopologyNested<A>
      editOrNewNodeTopology();

  public io.kubernetes.client.openapi.models.V1alpha1CSIStorageCapacityFluent.NodeTopologyNested<A>
      editOrNewNodeTopologyLike(io.kubernetes.client.openapi.models.V1LabelSelector item);

  public java.lang.String getStorageClassName();

  public A withStorageClassName(java.lang.String storageClassName);

  public java.lang.Boolean hasStorageClassName();

  /** Method is deprecated. use withStorageClassName instead. */
  @java.lang.Deprecated
  public A withNewStorageClassName(java.lang.String original);

  public interface MetadataNested<N>
      extends io.kubernetes.client.fluent.Nested<N>,
          io.kubernetes.client.openapi.models.V1ObjectMetaFluent<
              io.kubernetes.client.openapi.models.V1alpha1CSIStorageCapacityFluent.MetadataNested<
                  N>> {
    public N and();

    public N endMetadata();
  }

  public interface NodeTopologyNested<N>
      extends io.kubernetes.client.fluent.Nested<N>,
          io.kubernetes.client.openapi.models.V1LabelSelectorFluent<
              io.kubernetes.client.openapi.models.V1alpha1CSIStorageCapacityFluent
                      .NodeTopologyNested<
                  N>> {
    public N and();

    public N endNodeTopology();
  }
}
