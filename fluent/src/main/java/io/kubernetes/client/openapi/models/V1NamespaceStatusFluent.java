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
public interface V1NamespaceStatusFluent<A extends V1NamespaceStatusFluent<A>> extends Fluent<A> {
  public A addToConditions(Integer index, V1NamespaceCondition item);

  public A setToConditions(Integer index, V1NamespaceCondition item);

  public A addToConditions(io.kubernetes.client.openapi.models.V1NamespaceCondition... items);

  public A addAllToConditions(Collection<V1NamespaceCondition> items);

  public A removeFromConditions(io.kubernetes.client.openapi.models.V1NamespaceCondition... items);

  public A removeAllFromConditions(Collection<V1NamespaceCondition> items);

  public A removeMatchingFromConditions(Predicate<V1NamespaceConditionBuilder> predicate);

  /**
   * This method has been deprecated, please use method buildConditions instead.
   *
   * @return The buildable object.
   */
  @Deprecated
  public List<V1NamespaceCondition> getConditions();

  public List<V1NamespaceCondition> buildConditions();

  public V1NamespaceCondition buildCondition(Integer index);

  public V1NamespaceCondition buildFirstCondition();

  public V1NamespaceCondition buildLastCondition();

  public V1NamespaceCondition buildMatchingCondition(
      Predicate<V1NamespaceConditionBuilder> predicate);

  public Boolean hasMatchingCondition(Predicate<V1NamespaceConditionBuilder> predicate);

  public A withConditions(List<V1NamespaceCondition> conditions);

  public A withConditions(io.kubernetes.client.openapi.models.V1NamespaceCondition... conditions);

  public Boolean hasConditions();

  public V1NamespaceStatusFluent.ConditionsNested<A> addNewCondition();

  public V1NamespaceStatusFluent.ConditionsNested<A> addNewConditionLike(V1NamespaceCondition item);

  public V1NamespaceStatusFluent.ConditionsNested<A> setNewConditionLike(
      Integer index, V1NamespaceCondition item);

  public V1NamespaceStatusFluent.ConditionsNested<A> editCondition(Integer index);

  public V1NamespaceStatusFluent.ConditionsNested<A> editFirstCondition();

  public V1NamespaceStatusFluent.ConditionsNested<A> editLastCondition();

  public V1NamespaceStatusFluent.ConditionsNested<A> editMatchingCondition(
      Predicate<V1NamespaceConditionBuilder> predicate);

  public String getPhase();

  public A withPhase(String phase);

  public Boolean hasPhase();

  public interface ConditionsNested<N>
      extends Nested<N>, V1NamespaceConditionFluent<V1NamespaceStatusFluent.ConditionsNested<N>> {
    public N and();

    public N endCondition();
  }
}
