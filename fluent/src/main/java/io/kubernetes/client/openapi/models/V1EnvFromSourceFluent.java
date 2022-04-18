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

/** Generated */
public interface V1EnvFromSourceFluent<A extends V1EnvFromSourceFluent<A>> extends Fluent<A> {

  /**
   * This method has been deprecated, please use method buildConfigMapRef instead.
   *
   * @return The buildable object.
   */
  @Deprecated
  public V1ConfigMapEnvSource getConfigMapRef();

  public io.kubernetes.client.openapi.models.V1ConfigMapEnvSource buildConfigMapRef();

  public A withConfigMapRef(io.kubernetes.client.openapi.models.V1ConfigMapEnvSource configMapRef);

  public Boolean hasConfigMapRef();

  public V1EnvFromSourceFluent.ConfigMapRefNested<A> withNewConfigMapRef();

  public io.kubernetes.client.openapi.models.V1EnvFromSourceFluent.ConfigMapRefNested<A>
      withNewConfigMapRefLike(io.kubernetes.client.openapi.models.V1ConfigMapEnvSource item);

  public io.kubernetes.client.openapi.models.V1EnvFromSourceFluent.ConfigMapRefNested<A>
      editConfigMapRef();

  public io.kubernetes.client.openapi.models.V1EnvFromSourceFluent.ConfigMapRefNested<A>
      editOrNewConfigMapRef();

  public io.kubernetes.client.openapi.models.V1EnvFromSourceFluent.ConfigMapRefNested<A>
      editOrNewConfigMapRefLike(io.kubernetes.client.openapi.models.V1ConfigMapEnvSource item);

  public String getPrefix();

  public A withPrefix(java.lang.String prefix);

  public java.lang.Boolean hasPrefix();

  /**
   * This method has been deprecated, please use method buildSecretRef instead.
   *
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public V1SecretEnvSource getSecretRef();

  public io.kubernetes.client.openapi.models.V1SecretEnvSource buildSecretRef();

  public A withSecretRef(io.kubernetes.client.openapi.models.V1SecretEnvSource secretRef);

  public java.lang.Boolean hasSecretRef();

  public V1EnvFromSourceFluent.SecretRefNested<A> withNewSecretRef();

  public io.kubernetes.client.openapi.models.V1EnvFromSourceFluent.SecretRefNested<A>
      withNewSecretRefLike(io.kubernetes.client.openapi.models.V1SecretEnvSource item);

  public io.kubernetes.client.openapi.models.V1EnvFromSourceFluent.SecretRefNested<A>
      editSecretRef();

  public io.kubernetes.client.openapi.models.V1EnvFromSourceFluent.SecretRefNested<A>
      editOrNewSecretRef();

  public io.kubernetes.client.openapi.models.V1EnvFromSourceFluent.SecretRefNested<A>
      editOrNewSecretRefLike(io.kubernetes.client.openapi.models.V1SecretEnvSource item);

  public interface ConfigMapRefNested<N>
      extends Nested<N>, V1ConfigMapEnvSourceFluent<V1EnvFromSourceFluent.ConfigMapRefNested<N>> {
    public N and();

    public N endConfigMapRef();
  }

  public interface SecretRefNested<N>
      extends io.kubernetes.client.fluent.Nested<N>,
          V1SecretEnvSourceFluent<V1EnvFromSourceFluent.SecretRefNested<N>> {
    public N and();

    public N endSecretRef();
  }
}
