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
public interface V1NetworkPolicyStatusFluent<A extends V1NetworkPolicyStatusFluent<A>>
    extends Fluent<A> {
  public A addToConditions(Integer index, V1Condition item);

  public A setToConditions(Integer index, V1Condition item);

  public A addToConditions(io.kubernetes.client.openapi.models.V1Condition... items);

  public A addAllToConditions(Collection<V1Condition> items);

  public A removeFromConditions(io.kubernetes.client.openapi.models.V1Condition... items);

  public A removeAllFromConditions(Collection<V1Condition> items);

  public A removeMatchingFromConditions(Predicate<V1ConditionBuilder> predicate);

  /**
   * This method has been deprecated, please use method buildConditions instead.
   *
   * @return The buildable object.
   */
  @Deprecated
  public List<V1Condition> getConditions();

  public List<V1Condition> buildConditions();

  public V1Condition buildCondition(Integer index);

  public V1Condition buildFirstCondition();

  public V1Condition buildLastCondition();

  public V1Condition buildMatchingCondition(Predicate<V1ConditionBuilder> predicate);

  public Boolean hasMatchingCondition(Predicate<V1ConditionBuilder> predicate);

  public A withConditions(List<V1Condition> conditions);

  public A withConditions(io.kubernetes.client.openapi.models.V1Condition... conditions);

  public Boolean hasConditions();

  public V1NetworkPolicyStatusFluent.ConditionsNested<A> addNewCondition();

  public V1NetworkPolicyStatusFluent.ConditionsNested<A> addNewConditionLike(V1Condition item);

  public V1NetworkPolicyStatusFluent.ConditionsNested<A> setNewConditionLike(
      Integer index, V1Condition item);

  public V1NetworkPolicyStatusFluent.ConditionsNested<A> editCondition(Integer index);

  public V1NetworkPolicyStatusFluent.ConditionsNested<A> editFirstCondition();

  public V1NetworkPolicyStatusFluent.ConditionsNested<A> editLastCondition();

  public V1NetworkPolicyStatusFluent.ConditionsNested<A> editMatchingCondition(
      Predicate<V1ConditionBuilder> predicate);

  public interface ConditionsNested<N>
      extends Nested<N>, V1ConditionFluent<V1NetworkPolicyStatusFluent.ConditionsNested<N>> {
    public N and();

    public N endCondition();
  }
}
