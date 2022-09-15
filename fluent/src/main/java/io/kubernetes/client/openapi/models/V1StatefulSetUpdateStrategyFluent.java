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
public interface V1StatefulSetUpdateStrategyFluent<A extends V1StatefulSetUpdateStrategyFluent<A>>
    extends Fluent<A> {

  /**
   * This method has been deprecated, please use method buildRollingUpdate instead.
   *
   * @return The buildable object.
   */
  @Deprecated
  public V1RollingUpdateStatefulSetStrategy getRollingUpdate();

  public V1RollingUpdateStatefulSetStrategy buildRollingUpdate();

  public A withRollingUpdate(V1RollingUpdateStatefulSetStrategy rollingUpdate);

  public Boolean hasRollingUpdate();

  public V1StatefulSetUpdateStrategyFluent.RollingUpdateNested<A> withNewRollingUpdate();

  public V1StatefulSetUpdateStrategyFluent.RollingUpdateNested<A> withNewRollingUpdateLike(
      V1RollingUpdateStatefulSetStrategy item);

  public V1StatefulSetUpdateStrategyFluent.RollingUpdateNested<A> editRollingUpdate();

  public V1StatefulSetUpdateStrategyFluent.RollingUpdateNested<A> editOrNewRollingUpdate();

  public V1StatefulSetUpdateStrategyFluent.RollingUpdateNested<A> editOrNewRollingUpdateLike(
      V1RollingUpdateStatefulSetStrategy item);

  public String getType();

  public A withType(String type);

  public Boolean hasType();

  public interface RollingUpdateNested<N>
      extends Nested<N>,
          V1RollingUpdateStatefulSetStrategyFluent<
              V1StatefulSetUpdateStrategyFluent.RollingUpdateNested<N>> {
    public N and();

    public N endRollingUpdate();
  }
}
