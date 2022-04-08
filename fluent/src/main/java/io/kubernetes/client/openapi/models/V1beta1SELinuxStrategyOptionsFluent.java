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
public interface V1beta1SELinuxStrategyOptionsFluent<
        A extends V1beta1SELinuxStrategyOptionsFluent<A>>
    extends Fluent<A> {
  public String getRule();

  public A withRule(java.lang.String rule);

  public Boolean hasRule();

  /**
   * This method has been deprecated, please use method buildSeLinuxOptions instead.
   *
   * @return The buildable object.
   */
  @Deprecated
  public V1SELinuxOptions getSeLinuxOptions();

  public io.kubernetes.client.openapi.models.V1SELinuxOptions buildSeLinuxOptions();

  public A withSeLinuxOptions(io.kubernetes.client.openapi.models.V1SELinuxOptions seLinuxOptions);

  public java.lang.Boolean hasSeLinuxOptions();

  public V1beta1SELinuxStrategyOptionsFluent.SeLinuxOptionsNested<A> withNewSeLinuxOptions();

  public io.kubernetes.client.openapi.models.V1beta1SELinuxStrategyOptionsFluent
              .SeLinuxOptionsNested<
          A>
      withNewSeLinuxOptionsLike(io.kubernetes.client.openapi.models.V1SELinuxOptions item);

  public io.kubernetes.client.openapi.models.V1beta1SELinuxStrategyOptionsFluent
              .SeLinuxOptionsNested<
          A>
      editSeLinuxOptions();

  public io.kubernetes.client.openapi.models.V1beta1SELinuxStrategyOptionsFluent
              .SeLinuxOptionsNested<
          A>
      editOrNewSeLinuxOptions();

  public io.kubernetes.client.openapi.models.V1beta1SELinuxStrategyOptionsFluent
              .SeLinuxOptionsNested<
          A>
      editOrNewSeLinuxOptionsLike(io.kubernetes.client.openapi.models.V1SELinuxOptions item);

  public interface SeLinuxOptionsNested<N>
      extends Nested<N>,
          V1SELinuxOptionsFluent<V1beta1SELinuxStrategyOptionsFluent.SeLinuxOptionsNested<N>> {
    public N and();

    public N endSeLinuxOptions();
  }
}
