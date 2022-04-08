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

import io.kubernetes.client.fluent.Fluent;
import io.kubernetes.client.fluent.Nested;
import java.util.Map;

/** Generated */
public interface V1CSIPersistentVolumeSourceFluent<A extends V1CSIPersistentVolumeSourceFluent<A>>
    extends Fluent<A> {

  /**
   * This method has been deprecated, please use method buildControllerExpandSecretRef instead.
   *
   * @return The buildable object.
   */
  @Deprecated
  public V1SecretReference getControllerExpandSecretRef();

  public io.kubernetes.client.openapi.models.V1SecretReference buildControllerExpandSecretRef();

  public A withControllerExpandSecretRef(
      io.kubernetes.client.openapi.models.V1SecretReference controllerExpandSecretRef);

  public Boolean hasControllerExpandSecretRef();

  public V1CSIPersistentVolumeSourceFluent.ControllerExpandSecretRefNested<A>
      withNewControllerExpandSecretRef();

  public io.kubernetes.client.openapi.models.V1CSIPersistentVolumeSourceFluent
              .ControllerExpandSecretRefNested<
          A>
      withNewControllerExpandSecretRefLike(
          io.kubernetes.client.openapi.models.V1SecretReference item);

  public io.kubernetes.client.openapi.models.V1CSIPersistentVolumeSourceFluent
              .ControllerExpandSecretRefNested<
          A>
      editControllerExpandSecretRef();

  public io.kubernetes.client.openapi.models.V1CSIPersistentVolumeSourceFluent
              .ControllerExpandSecretRefNested<
          A>
      editOrNewControllerExpandSecretRef();

  public io.kubernetes.client.openapi.models.V1CSIPersistentVolumeSourceFluent
              .ControllerExpandSecretRefNested<
          A>
      editOrNewControllerExpandSecretRefLike(
          io.kubernetes.client.openapi.models.V1SecretReference item);

  /**
   * This method has been deprecated, please use method buildControllerPublishSecretRef instead.
   *
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public io.kubernetes.client.openapi.models.V1SecretReference getControllerPublishSecretRef();

  public io.kubernetes.client.openapi.models.V1SecretReference buildControllerPublishSecretRef();

  public A withControllerPublishSecretRef(
      io.kubernetes.client.openapi.models.V1SecretReference controllerPublishSecretRef);

  public java.lang.Boolean hasControllerPublishSecretRef();

  public V1CSIPersistentVolumeSourceFluent.ControllerPublishSecretRefNested<A>
      withNewControllerPublishSecretRef();

  public io.kubernetes.client.openapi.models.V1CSIPersistentVolumeSourceFluent
              .ControllerPublishSecretRefNested<
          A>
      withNewControllerPublishSecretRefLike(
          io.kubernetes.client.openapi.models.V1SecretReference item);

  public io.kubernetes.client.openapi.models.V1CSIPersistentVolumeSourceFluent
              .ControllerPublishSecretRefNested<
          A>
      editControllerPublishSecretRef();

  public io.kubernetes.client.openapi.models.V1CSIPersistentVolumeSourceFluent
              .ControllerPublishSecretRefNested<
          A>
      editOrNewControllerPublishSecretRef();

  public io.kubernetes.client.openapi.models.V1CSIPersistentVolumeSourceFluent
              .ControllerPublishSecretRefNested<
          A>
      editOrNewControllerPublishSecretRefLike(
          io.kubernetes.client.openapi.models.V1SecretReference item);

  public String getDriver();

  public A withDriver(java.lang.String driver);

  public java.lang.Boolean hasDriver();

  public java.lang.String getFsType();

  public A withFsType(java.lang.String fsType);

  public java.lang.Boolean hasFsType();

  /**
   * This method has been deprecated, please use method buildNodePublishSecretRef instead.
   *
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public io.kubernetes.client.openapi.models.V1SecretReference getNodePublishSecretRef();

  public io.kubernetes.client.openapi.models.V1SecretReference buildNodePublishSecretRef();

  public A withNodePublishSecretRef(
      io.kubernetes.client.openapi.models.V1SecretReference nodePublishSecretRef);

  public java.lang.Boolean hasNodePublishSecretRef();

  public V1CSIPersistentVolumeSourceFluent.NodePublishSecretRefNested<A>
      withNewNodePublishSecretRef();

  public io.kubernetes.client.openapi.models.V1CSIPersistentVolumeSourceFluent
              .NodePublishSecretRefNested<
          A>
      withNewNodePublishSecretRefLike(io.kubernetes.client.openapi.models.V1SecretReference item);

  public io.kubernetes.client.openapi.models.V1CSIPersistentVolumeSourceFluent
              .NodePublishSecretRefNested<
          A>
      editNodePublishSecretRef();

  public io.kubernetes.client.openapi.models.V1CSIPersistentVolumeSourceFluent
              .NodePublishSecretRefNested<
          A>
      editOrNewNodePublishSecretRef();

  public io.kubernetes.client.openapi.models.V1CSIPersistentVolumeSourceFluent
              .NodePublishSecretRefNested<
          A>
      editOrNewNodePublishSecretRefLike(io.kubernetes.client.openapi.models.V1SecretReference item);

  /**
   * This method has been deprecated, please use method buildNodeStageSecretRef instead.
   *
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public io.kubernetes.client.openapi.models.V1SecretReference getNodeStageSecretRef();

  public io.kubernetes.client.openapi.models.V1SecretReference buildNodeStageSecretRef();

  public A withNodeStageSecretRef(
      io.kubernetes.client.openapi.models.V1SecretReference nodeStageSecretRef);

  public java.lang.Boolean hasNodeStageSecretRef();

  public V1CSIPersistentVolumeSourceFluent.NodeStageSecretRefNested<A> withNewNodeStageSecretRef();

  public io.kubernetes.client.openapi.models.V1CSIPersistentVolumeSourceFluent
              .NodeStageSecretRefNested<
          A>
      withNewNodeStageSecretRefLike(io.kubernetes.client.openapi.models.V1SecretReference item);

  public io.kubernetes.client.openapi.models.V1CSIPersistentVolumeSourceFluent
              .NodeStageSecretRefNested<
          A>
      editNodeStageSecretRef();

  public io.kubernetes.client.openapi.models.V1CSIPersistentVolumeSourceFluent
              .NodeStageSecretRefNested<
          A>
      editOrNewNodeStageSecretRef();

  public io.kubernetes.client.openapi.models.V1CSIPersistentVolumeSourceFluent
              .NodeStageSecretRefNested<
          A>
      editOrNewNodeStageSecretRefLike(io.kubernetes.client.openapi.models.V1SecretReference item);

  public java.lang.Boolean getReadOnly();

  public A withReadOnly(java.lang.Boolean readOnly);

  public java.lang.Boolean hasReadOnly();

  public A addToVolumeAttributes(java.lang.String key, java.lang.String value);

  public A addToVolumeAttributes(Map<java.lang.String, java.lang.String> map);

  public A removeFromVolumeAttributes(java.lang.String key);

  public A removeFromVolumeAttributes(java.util.Map<java.lang.String, java.lang.String> map);

  public java.util.Map<java.lang.String, java.lang.String> getVolumeAttributes();

  public <K, V> A withVolumeAttributes(
      java.util.Map<java.lang.String, java.lang.String> volumeAttributes);

  public java.lang.Boolean hasVolumeAttributes();

  public java.lang.String getVolumeHandle();

  public A withVolumeHandle(java.lang.String volumeHandle);

  public java.lang.Boolean hasVolumeHandle();

  public A withReadOnly();

  public interface ControllerExpandSecretRefNested<N>
      extends Nested<N>,
          V1SecretReferenceFluent<
              V1CSIPersistentVolumeSourceFluent.ControllerExpandSecretRefNested<N>> {
    public N and();

    public N endControllerExpandSecretRef();
  }

  public interface ControllerPublishSecretRefNested<N>
      extends io.kubernetes.client.fluent.Nested<N>,
          V1SecretReferenceFluent<
              V1CSIPersistentVolumeSourceFluent.ControllerPublishSecretRefNested<N>> {
    public N and();

    public N endControllerPublishSecretRef();
  }

  public interface NodePublishSecretRefNested<N>
      extends io.kubernetes.client.fluent.Nested<N>,
          V1SecretReferenceFluent<V1CSIPersistentVolumeSourceFluent.NodePublishSecretRefNested<N>> {
    public N and();

    public N endNodePublishSecretRef();
  }

  public interface NodeStageSecretRefNested<N>
      extends io.kubernetes.client.fluent.Nested<N>,
          V1SecretReferenceFluent<V1CSIPersistentVolumeSourceFluent.NodeStageSecretRefNested<N>> {
    public N and();

    public N endNodeStageSecretRef();
  }
}
