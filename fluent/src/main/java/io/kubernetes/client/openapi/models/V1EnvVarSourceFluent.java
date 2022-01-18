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
public interface V1EnvVarSourceFluent<
        A extends io.kubernetes.client.openapi.models.V1EnvVarSourceFluent<A>>
    extends io.kubernetes.client.fluent.Fluent<A> {

  /**
   * This method has been deprecated, please use method buildConfigMapKeyRef instead.
   *
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public io.kubernetes.client.openapi.models.V1ConfigMapKeySelector getConfigMapKeyRef();

  public io.kubernetes.client.openapi.models.V1ConfigMapKeySelector buildConfigMapKeyRef();

  public A withConfigMapKeyRef(
      io.kubernetes.client.openapi.models.V1ConfigMapKeySelector configMapKeyRef);

  public java.lang.Boolean hasConfigMapKeyRef();

  public io.kubernetes.client.openapi.models.V1EnvVarSourceFluent.ConfigMapKeyRefNested<A>
      withNewConfigMapKeyRef();

  public io.kubernetes.client.openapi.models.V1EnvVarSourceFluent.ConfigMapKeyRefNested<A>
      withNewConfigMapKeyRefLike(io.kubernetes.client.openapi.models.V1ConfigMapKeySelector item);

  public io.kubernetes.client.openapi.models.V1EnvVarSourceFluent.ConfigMapKeyRefNested<A>
      editConfigMapKeyRef();

  public io.kubernetes.client.openapi.models.V1EnvVarSourceFluent.ConfigMapKeyRefNested<A>
      editOrNewConfigMapKeyRef();

  public io.kubernetes.client.openapi.models.V1EnvVarSourceFluent.ConfigMapKeyRefNested<A>
      editOrNewConfigMapKeyRefLike(io.kubernetes.client.openapi.models.V1ConfigMapKeySelector item);

  /**
   * This method has been deprecated, please use method buildFieldRef instead.
   *
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public io.kubernetes.client.openapi.models.V1ObjectFieldSelector getFieldRef();

  public io.kubernetes.client.openapi.models.V1ObjectFieldSelector buildFieldRef();

  public A withFieldRef(io.kubernetes.client.openapi.models.V1ObjectFieldSelector fieldRef);

  public java.lang.Boolean hasFieldRef();

  public io.kubernetes.client.openapi.models.V1EnvVarSourceFluent.FieldRefNested<A>
      withNewFieldRef();

  public io.kubernetes.client.openapi.models.V1EnvVarSourceFluent.FieldRefNested<A>
      withNewFieldRefLike(io.kubernetes.client.openapi.models.V1ObjectFieldSelector item);

  public io.kubernetes.client.openapi.models.V1EnvVarSourceFluent.FieldRefNested<A> editFieldRef();

  public io.kubernetes.client.openapi.models.V1EnvVarSourceFluent.FieldRefNested<A>
      editOrNewFieldRef();

  public io.kubernetes.client.openapi.models.V1EnvVarSourceFluent.FieldRefNested<A>
      editOrNewFieldRefLike(io.kubernetes.client.openapi.models.V1ObjectFieldSelector item);

  /**
   * This method has been deprecated, please use method buildResourceFieldRef instead.
   *
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public io.kubernetes.client.openapi.models.V1ResourceFieldSelector getResourceFieldRef();

  public io.kubernetes.client.openapi.models.V1ResourceFieldSelector buildResourceFieldRef();

  public A withResourceFieldRef(
      io.kubernetes.client.openapi.models.V1ResourceFieldSelector resourceFieldRef);

  public java.lang.Boolean hasResourceFieldRef();

  public io.kubernetes.client.openapi.models.V1EnvVarSourceFluent.ResourceFieldRefNested<A>
      withNewResourceFieldRef();

  public io.kubernetes.client.openapi.models.V1EnvVarSourceFluent.ResourceFieldRefNested<A>
      withNewResourceFieldRefLike(io.kubernetes.client.openapi.models.V1ResourceFieldSelector item);

  public io.kubernetes.client.openapi.models.V1EnvVarSourceFluent.ResourceFieldRefNested<A>
      editResourceFieldRef();

  public io.kubernetes.client.openapi.models.V1EnvVarSourceFluent.ResourceFieldRefNested<A>
      editOrNewResourceFieldRef();

  public io.kubernetes.client.openapi.models.V1EnvVarSourceFluent.ResourceFieldRefNested<A>
      editOrNewResourceFieldRefLike(
          io.kubernetes.client.openapi.models.V1ResourceFieldSelector item);

  /**
   * This method has been deprecated, please use method buildSecretKeyRef instead.
   *
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public io.kubernetes.client.openapi.models.V1SecretKeySelector getSecretKeyRef();

  public io.kubernetes.client.openapi.models.V1SecretKeySelector buildSecretKeyRef();

  public A withSecretKeyRef(io.kubernetes.client.openapi.models.V1SecretKeySelector secretKeyRef);

  public java.lang.Boolean hasSecretKeyRef();

  public io.kubernetes.client.openapi.models.V1EnvVarSourceFluent.SecretKeyRefNested<A>
      withNewSecretKeyRef();

  public io.kubernetes.client.openapi.models.V1EnvVarSourceFluent.SecretKeyRefNested<A>
      withNewSecretKeyRefLike(io.kubernetes.client.openapi.models.V1SecretKeySelector item);

  public io.kubernetes.client.openapi.models.V1EnvVarSourceFluent.SecretKeyRefNested<A>
      editSecretKeyRef();

  public io.kubernetes.client.openapi.models.V1EnvVarSourceFluent.SecretKeyRefNested<A>
      editOrNewSecretKeyRef();

  public io.kubernetes.client.openapi.models.V1EnvVarSourceFluent.SecretKeyRefNested<A>
      editOrNewSecretKeyRefLike(io.kubernetes.client.openapi.models.V1SecretKeySelector item);

  public interface ConfigMapKeyRefNested<N>
      extends io.kubernetes.client.fluent.Nested<N>,
          io.kubernetes.client.openapi.models.V1ConfigMapKeySelectorFluent<
              io.kubernetes.client.openapi.models.V1EnvVarSourceFluent.ConfigMapKeyRefNested<N>> {
    public N and();

    public N endConfigMapKeyRef();
  }

  public interface FieldRefNested<N>
      extends io.kubernetes.client.fluent.Nested<N>,
          io.kubernetes.client.openapi.models.V1ObjectFieldSelectorFluent<
              io.kubernetes.client.openapi.models.V1EnvVarSourceFluent.FieldRefNested<N>> {
    public N and();

    public N endFieldRef();
  }

  public interface ResourceFieldRefNested<N>
      extends io.kubernetes.client.fluent.Nested<N>,
          io.kubernetes.client.openapi.models.V1ResourceFieldSelectorFluent<
              io.kubernetes.client.openapi.models.V1EnvVarSourceFluent.ResourceFieldRefNested<N>> {
    public N and();

    public N endResourceFieldRef();
  }

  public interface SecretKeyRefNested<N>
      extends io.kubernetes.client.fluent.Nested<N>,
          io.kubernetes.client.openapi.models.V1SecretKeySelectorFluent<
              io.kubernetes.client.openapi.models.V1EnvVarSourceFluent.SecretKeyRefNested<N>> {
    public N and();

    public N endSecretKeyRef();
  }
}
