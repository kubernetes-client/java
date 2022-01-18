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
public interface V1CSINodeDriverFluent<
        A extends io.kubernetes.client.openapi.models.V1CSINodeDriverFluent<A>>
    extends io.kubernetes.client.fluent.Fluent<A> {

  /**
   * This method has been deprecated, please use method buildAllocatable instead.
   *
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public io.kubernetes.client.openapi.models.V1VolumeNodeResources getAllocatable();

  public io.kubernetes.client.openapi.models.V1VolumeNodeResources buildAllocatable();

  public A withAllocatable(io.kubernetes.client.openapi.models.V1VolumeNodeResources allocatable);

  public java.lang.Boolean hasAllocatable();

  public io.kubernetes.client.openapi.models.V1CSINodeDriverFluent.AllocatableNested<A>
      withNewAllocatable();

  public io.kubernetes.client.openapi.models.V1CSINodeDriverFluent.AllocatableNested<A>
      withNewAllocatableLike(io.kubernetes.client.openapi.models.V1VolumeNodeResources item);

  public io.kubernetes.client.openapi.models.V1CSINodeDriverFluent.AllocatableNested<A>
      editAllocatable();

  public io.kubernetes.client.openapi.models.V1CSINodeDriverFluent.AllocatableNested<A>
      editOrNewAllocatable();

  public io.kubernetes.client.openapi.models.V1CSINodeDriverFluent.AllocatableNested<A>
      editOrNewAllocatableLike(io.kubernetes.client.openapi.models.V1VolumeNodeResources item);

  public java.lang.String getName();

  public A withName(java.lang.String name);

  public java.lang.Boolean hasName();

  /** Method is deprecated. use withName instead. */
  @java.lang.Deprecated
  public A withNewName(java.lang.String original);

  public java.lang.String getNodeID();

  public A withNodeID(java.lang.String nodeID);

  public java.lang.Boolean hasNodeID();

  /** Method is deprecated. use withNodeID instead. */
  @java.lang.Deprecated
  public A withNewNodeID(java.lang.String original);

  public A addToTopologyKeys(java.lang.Integer index, java.lang.String item);

  public A setToTopologyKeys(java.lang.Integer index, java.lang.String item);

  public A addToTopologyKeys(java.lang.String... items);

  public A addAllToTopologyKeys(java.util.Collection<java.lang.String> items);

  public A removeFromTopologyKeys(java.lang.String... items);

  public A removeAllFromTopologyKeys(java.util.Collection<java.lang.String> items);

  public java.util.List<java.lang.String> getTopologyKeys();

  public java.lang.String getTopologyKey(java.lang.Integer index);

  public java.lang.String getFirstTopologyKey();

  public java.lang.String getLastTopologyKey();

  public java.lang.String getMatchingTopologyKey(
      java.util.function.Predicate<java.lang.String> predicate);

  public java.lang.Boolean hasMatchingTopologyKey(
      java.util.function.Predicate<java.lang.String> predicate);

  public A withTopologyKeys(java.util.List<java.lang.String> topologyKeys);

  public A withTopologyKeys(java.lang.String... topologyKeys);

  public java.lang.Boolean hasTopologyKeys();

  public A addNewTopologyKey(java.lang.String original);

  public interface AllocatableNested<N>
      extends io.kubernetes.client.fluent.Nested<N>,
          io.kubernetes.client.openapi.models.V1VolumeNodeResourcesFluent<
              io.kubernetes.client.openapi.models.V1CSINodeDriverFluent.AllocatableNested<N>> {
    public N and();

    public N endAllocatable();
  }
}
