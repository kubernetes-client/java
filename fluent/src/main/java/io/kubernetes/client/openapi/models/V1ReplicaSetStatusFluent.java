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
public interface V1ReplicaSetStatusFluent<A extends V1ReplicaSetStatusFluent<A>> extends Fluent<A> {
  public Integer getAvailableReplicas();

  public A withAvailableReplicas(Integer availableReplicas);

  public Boolean hasAvailableReplicas();

  public A addToConditions(Integer index, V1ReplicaSetCondition item);

  public A setToConditions(Integer index, V1ReplicaSetCondition item);

  public A addToConditions(io.kubernetes.client.openapi.models.V1ReplicaSetCondition... items);

  public A addAllToConditions(Collection<V1ReplicaSetCondition> items);

  public A removeFromConditions(io.kubernetes.client.openapi.models.V1ReplicaSetCondition... items);

  public A removeAllFromConditions(Collection<V1ReplicaSetCondition> items);

  public A removeMatchingFromConditions(Predicate<V1ReplicaSetConditionBuilder> predicate);

  /**
   * This method has been deprecated, please use method buildConditions instead.
   *
   * @return The buildable object.
   */
  @Deprecated
  public List<V1ReplicaSetCondition> getConditions();

  public List<V1ReplicaSetCondition> buildConditions();

  public V1ReplicaSetCondition buildCondition(Integer index);

  public V1ReplicaSetCondition buildFirstCondition();

  public V1ReplicaSetCondition buildLastCondition();

  public V1ReplicaSetCondition buildMatchingCondition(
      Predicate<V1ReplicaSetConditionBuilder> predicate);

  public Boolean hasMatchingCondition(Predicate<V1ReplicaSetConditionBuilder> predicate);

  public A withConditions(List<V1ReplicaSetCondition> conditions);

  public A withConditions(io.kubernetes.client.openapi.models.V1ReplicaSetCondition... conditions);

  public Boolean hasConditions();

  public V1ReplicaSetStatusFluent.ConditionsNested<A> addNewCondition();

  public V1ReplicaSetStatusFluent.ConditionsNested<A> addNewConditionLike(
      V1ReplicaSetCondition item);

  public V1ReplicaSetStatusFluent.ConditionsNested<A> setNewConditionLike(
      Integer index, V1ReplicaSetCondition item);

  public V1ReplicaSetStatusFluent.ConditionsNested<A> editCondition(Integer index);

  public V1ReplicaSetStatusFluent.ConditionsNested<A> editFirstCondition();

  public V1ReplicaSetStatusFluent.ConditionsNested<A> editLastCondition();

  public V1ReplicaSetStatusFluent.ConditionsNested<A> editMatchingCondition(
      Predicate<V1ReplicaSetConditionBuilder> predicate);

  public Integer getFullyLabeledReplicas();

  public A withFullyLabeledReplicas(Integer fullyLabeledReplicas);

  public Boolean hasFullyLabeledReplicas();

  public Long getObservedGeneration();

  public A withObservedGeneration(Long observedGeneration);

  public Boolean hasObservedGeneration();

  public Integer getReadyReplicas();

  public A withReadyReplicas(Integer readyReplicas);

  public Boolean hasReadyReplicas();

  public Integer getReplicas();

  public A withReplicas(Integer replicas);

  public Boolean hasReplicas();

  public interface ConditionsNested<N>
      extends Nested<N>, V1ReplicaSetConditionFluent<V1ReplicaSetStatusFluent.ConditionsNested<N>> {
    public N and();

    public N endCondition();
  }
}
