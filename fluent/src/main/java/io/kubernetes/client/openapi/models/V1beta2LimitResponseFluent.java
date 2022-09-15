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
public interface V1beta2LimitResponseFluent<A extends V1beta2LimitResponseFluent<A>>
    extends Fluent<A> {

  /**
   * This method has been deprecated, please use method buildQueuing instead.
   *
   * @return The buildable object.
   */
  @Deprecated
  public V1beta2QueuingConfiguration getQueuing();

  public V1beta2QueuingConfiguration buildQueuing();

  public A withQueuing(V1beta2QueuingConfiguration queuing);

  public Boolean hasQueuing();

  public V1beta2LimitResponseFluent.QueuingNested<A> withNewQueuing();

  public V1beta2LimitResponseFluent.QueuingNested<A> withNewQueuingLike(
      V1beta2QueuingConfiguration item);

  public V1beta2LimitResponseFluent.QueuingNested<A> editQueuing();

  public V1beta2LimitResponseFluent.QueuingNested<A> editOrNewQueuing();

  public V1beta2LimitResponseFluent.QueuingNested<A> editOrNewQueuingLike(
      V1beta2QueuingConfiguration item);

  public String getType();

  public A withType(String type);

  public Boolean hasType();

  public interface QueuingNested<N>
      extends Nested<N>,
          V1beta2QueuingConfigurationFluent<V1beta2LimitResponseFluent.QueuingNested<N>> {
    public N and();

    public N endQueuing();
  }
}
