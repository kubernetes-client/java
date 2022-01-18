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
public interface V1CSIVolumeSourceFluent<
        A extends io.kubernetes.client.openapi.models.V1CSIVolumeSourceFluent<A>>
    extends io.kubernetes.client.fluent.Fluent<A> {
  public java.lang.String getDriver();

  public A withDriver(java.lang.String driver);

  public java.lang.Boolean hasDriver();

  /** Method is deprecated. use withDriver instead. */
  @java.lang.Deprecated
  public A withNewDriver(java.lang.String original);

  public java.lang.String getFsType();

  public A withFsType(java.lang.String fsType);

  public java.lang.Boolean hasFsType();

  /** Method is deprecated. use withFsType instead. */
  @java.lang.Deprecated
  public A withNewFsType(java.lang.String original);

  /**
   * This method has been deprecated, please use method buildNodePublishSecretRef instead.
   *
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public io.kubernetes.client.openapi.models.V1LocalObjectReference getNodePublishSecretRef();

  public io.kubernetes.client.openapi.models.V1LocalObjectReference buildNodePublishSecretRef();

  public A withNodePublishSecretRef(
      io.kubernetes.client.openapi.models.V1LocalObjectReference nodePublishSecretRef);

  public java.lang.Boolean hasNodePublishSecretRef();

  public io.kubernetes.client.openapi.models.V1CSIVolumeSourceFluent.NodePublishSecretRefNested<A>
      withNewNodePublishSecretRef();

  public io.kubernetes.client.openapi.models.V1CSIVolumeSourceFluent.NodePublishSecretRefNested<A>
      withNewNodePublishSecretRefLike(
          io.kubernetes.client.openapi.models.V1LocalObjectReference item);

  public io.kubernetes.client.openapi.models.V1CSIVolumeSourceFluent.NodePublishSecretRefNested<A>
      editNodePublishSecretRef();

  public io.kubernetes.client.openapi.models.V1CSIVolumeSourceFluent.NodePublishSecretRefNested<A>
      editOrNewNodePublishSecretRef();

  public io.kubernetes.client.openapi.models.V1CSIVolumeSourceFluent.NodePublishSecretRefNested<A>
      editOrNewNodePublishSecretRefLike(
          io.kubernetes.client.openapi.models.V1LocalObjectReference item);

  public java.lang.Boolean getReadOnly();

  public A withReadOnly(java.lang.Boolean readOnly);

  public java.lang.Boolean hasReadOnly();

  public A addToVolumeAttributes(java.lang.String key, java.lang.String value);

  public A addToVolumeAttributes(java.util.Map<java.lang.String, java.lang.String> map);

  public A removeFromVolumeAttributes(java.lang.String key);

  public A removeFromVolumeAttributes(java.util.Map<java.lang.String, java.lang.String> map);

  public java.util.Map<java.lang.String, java.lang.String> getVolumeAttributes();

  public <K, V> A withVolumeAttributes(
      java.util.Map<java.lang.String, java.lang.String> volumeAttributes);

  public java.lang.Boolean hasVolumeAttributes();

  public interface NodePublishSecretRefNested<N>
      extends io.kubernetes.client.fluent.Nested<N>,
          io.kubernetes.client.openapi.models.V1LocalObjectReferenceFluent<
              io.kubernetes.client.openapi.models.V1CSIVolumeSourceFluent
                      .NodePublishSecretRefNested<
                  N>> {
    public N and();

    public N endNodePublishSecretRef();
  }
}
