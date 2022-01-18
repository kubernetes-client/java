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
public interface V1FlexVolumeSourceFluent<
        A extends io.kubernetes.client.openapi.models.V1FlexVolumeSourceFluent<A>>
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

  public A addToOptions(java.lang.String key, java.lang.String value);

  public A addToOptions(java.util.Map<java.lang.String, java.lang.String> map);

  public A removeFromOptions(java.lang.String key);

  public A removeFromOptions(java.util.Map<java.lang.String, java.lang.String> map);

  public java.util.Map<java.lang.String, java.lang.String> getOptions();

  public <K, V> A withOptions(java.util.Map<java.lang.String, java.lang.String> options);

  public java.lang.Boolean hasOptions();

  public java.lang.Boolean getReadOnly();

  public A withReadOnly(java.lang.Boolean readOnly);

  public java.lang.Boolean hasReadOnly();

  /**
   * This method has been deprecated, please use method buildSecretRef instead.
   *
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public io.kubernetes.client.openapi.models.V1LocalObjectReference getSecretRef();

  public io.kubernetes.client.openapi.models.V1LocalObjectReference buildSecretRef();

  public A withSecretRef(io.kubernetes.client.openapi.models.V1LocalObjectReference secretRef);

  public java.lang.Boolean hasSecretRef();

  public io.kubernetes.client.openapi.models.V1FlexVolumeSourceFluent.SecretRefNested<A>
      withNewSecretRef();

  public io.kubernetes.client.openapi.models.V1FlexVolumeSourceFluent.SecretRefNested<A>
      withNewSecretRefLike(io.kubernetes.client.openapi.models.V1LocalObjectReference item);

  public io.kubernetes.client.openapi.models.V1FlexVolumeSourceFluent.SecretRefNested<A>
      editSecretRef();

  public io.kubernetes.client.openapi.models.V1FlexVolumeSourceFluent.SecretRefNested<A>
      editOrNewSecretRef();

  public io.kubernetes.client.openapi.models.V1FlexVolumeSourceFluent.SecretRefNested<A>
      editOrNewSecretRefLike(io.kubernetes.client.openapi.models.V1LocalObjectReference item);

  public interface SecretRefNested<N>
      extends io.kubernetes.client.fluent.Nested<N>,
          io.kubernetes.client.openapi.models.V1LocalObjectReferenceFluent<
              io.kubernetes.client.openapi.models.V1FlexVolumeSourceFluent.SecretRefNested<N>> {
    public N and();

    public N endSecretRef();
  }
}
