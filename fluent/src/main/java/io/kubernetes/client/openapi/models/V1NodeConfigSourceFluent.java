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
public interface V1NodeConfigSourceFluent<A extends V1NodeConfigSourceFluent<A>> extends Fluent<A> {

  /**
   * This method has been deprecated, please use method buildConfigMap instead.
   *
   * @return The buildable object.
   */
  @Deprecated
  public V1ConfigMapNodeConfigSource getConfigMap();

  public io.kubernetes.client.openapi.models.V1ConfigMapNodeConfigSource buildConfigMap();

  public A withConfigMap(io.kubernetes.client.openapi.models.V1ConfigMapNodeConfigSource configMap);

  public Boolean hasConfigMap();

  public V1NodeConfigSourceFluent.ConfigMapNested<A> withNewConfigMap();

  public io.kubernetes.client.openapi.models.V1NodeConfigSourceFluent.ConfigMapNested<A>
      withNewConfigMapLike(io.kubernetes.client.openapi.models.V1ConfigMapNodeConfigSource item);

  public io.kubernetes.client.openapi.models.V1NodeConfigSourceFluent.ConfigMapNested<A>
      editConfigMap();

  public io.kubernetes.client.openapi.models.V1NodeConfigSourceFluent.ConfigMapNested<A>
      editOrNewConfigMap();

  public io.kubernetes.client.openapi.models.V1NodeConfigSourceFluent.ConfigMapNested<A>
      editOrNewConfigMapLike(io.kubernetes.client.openapi.models.V1ConfigMapNodeConfigSource item);

  public interface ConfigMapNested<N>
      extends Nested<N>,
          V1ConfigMapNodeConfigSourceFluent<V1NodeConfigSourceFluent.ConfigMapNested<N>> {
    public N and();

    public N endConfigMap();
  }
}
