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
public interface V1IngressClassSpecFluent<A extends V1IngressClassSpecFluent<A>> extends Fluent<A> {
  public String getController();

  public A withController(java.lang.String controller);

  public Boolean hasController();

  /**
   * This method has been deprecated, please use method buildParameters instead.
   *
   * @return The buildable object.
   */
  @Deprecated
  public V1IngressClassParametersReference getParameters();

  public io.kubernetes.client.openapi.models.V1IngressClassParametersReference buildParameters();

  public A withParameters(
      io.kubernetes.client.openapi.models.V1IngressClassParametersReference parameters);

  public java.lang.Boolean hasParameters();

  public V1IngressClassSpecFluent.ParametersNested<A> withNewParameters();

  public io.kubernetes.client.openapi.models.V1IngressClassSpecFluent.ParametersNested<A>
      withNewParametersLike(
          io.kubernetes.client.openapi.models.V1IngressClassParametersReference item);

  public io.kubernetes.client.openapi.models.V1IngressClassSpecFluent.ParametersNested<A>
      editParameters();

  public io.kubernetes.client.openapi.models.V1IngressClassSpecFluent.ParametersNested<A>
      editOrNewParameters();

  public io.kubernetes.client.openapi.models.V1IngressClassSpecFluent.ParametersNested<A>
      editOrNewParametersLike(
          io.kubernetes.client.openapi.models.V1IngressClassParametersReference item);

  public interface ParametersNested<N>
      extends Nested<N>,
          V1IngressClassParametersReferenceFluent<V1IngressClassSpecFluent.ParametersNested<N>> {
    public N and();

    public N endParameters();
  }
}
