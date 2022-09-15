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
import java.util.Collection;
import java.util.List;
import java.util.function.Predicate;

/** Generated */
public interface V1APIServiceStatusFluent<A extends V1APIServiceStatusFluent<A>> extends Fluent<A> {
  public A addToConditions(Integer index, V1APIServiceCondition item);

  public A setToConditions(Integer index, V1APIServiceCondition item);

  public A addToConditions(io.kubernetes.client.openapi.models.V1APIServiceCondition... items);

  public A addAllToConditions(Collection<V1APIServiceCondition> items);

  public A removeFromConditions(io.kubernetes.client.openapi.models.V1APIServiceCondition... items);

  public A removeAllFromConditions(Collection<V1APIServiceCondition> items);

  public A removeMatchingFromConditions(Predicate<V1APIServiceConditionBuilder> predicate);

  /**
   * This method has been deprecated, please use method buildConditions instead.
   *
   * @return The buildable object.
   */
  @Deprecated
  public List<V1APIServiceCondition> getConditions();

  public List<V1APIServiceCondition> buildConditions();

  public V1APIServiceCondition buildCondition(Integer index);

  public V1APIServiceCondition buildFirstCondition();

  public V1APIServiceCondition buildLastCondition();

  public V1APIServiceCondition buildMatchingCondition(
      Predicate<V1APIServiceConditionBuilder> predicate);

  public Boolean hasMatchingCondition(Predicate<V1APIServiceConditionBuilder> predicate);

  public A withConditions(List<V1APIServiceCondition> conditions);

  public A withConditions(io.kubernetes.client.openapi.models.V1APIServiceCondition... conditions);

  public Boolean hasConditions();

  public V1APIServiceStatusFluent.ConditionsNested<A> addNewCondition();

  public V1APIServiceStatusFluent.ConditionsNested<A> addNewConditionLike(
      V1APIServiceCondition item);

  public V1APIServiceStatusFluent.ConditionsNested<A> setNewConditionLike(
      Integer index, V1APIServiceCondition item);

  public V1APIServiceStatusFluent.ConditionsNested<A> editCondition(Integer index);

  public V1APIServiceStatusFluent.ConditionsNested<A> editFirstCondition();

  public V1APIServiceStatusFluent.ConditionsNested<A> editLastCondition();

  public V1APIServiceStatusFluent.ConditionsNested<A> editMatchingCondition(
      Predicate<V1APIServiceConditionBuilder> predicate);

  public interface ConditionsNested<N>
      extends Nested<N>, V1APIServiceConditionFluent<V1APIServiceStatusFluent.ConditionsNested<N>> {
    public N and();

    public N endCondition();
  }
}
