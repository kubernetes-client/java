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
public interface V1StatefulSetStatusFluent<A extends V1StatefulSetStatusFluent<A>>
    extends Fluent<A> {
  public Integer getAvailableReplicas();

  public A withAvailableReplicas(Integer availableReplicas);

  public Boolean hasAvailableReplicas();

  public Integer getCollisionCount();

  public A withCollisionCount(Integer collisionCount);

  public Boolean hasCollisionCount();

  public A addToConditions(Integer index, V1StatefulSetCondition item);

  public A setToConditions(Integer index, V1StatefulSetCondition item);

  public A addToConditions(io.kubernetes.client.openapi.models.V1StatefulSetCondition... items);

  public A addAllToConditions(Collection<V1StatefulSetCondition> items);

  public A removeFromConditions(
      io.kubernetes.client.openapi.models.V1StatefulSetCondition... items);

  public A removeAllFromConditions(Collection<V1StatefulSetCondition> items);

  public A removeMatchingFromConditions(Predicate<V1StatefulSetConditionBuilder> predicate);

  /**
   * This method has been deprecated, please use method buildConditions instead.
   *
   * @return The buildable object.
   */
  @Deprecated
  public List<V1StatefulSetCondition> getConditions();

  public List<V1StatefulSetCondition> buildConditions();

  public V1StatefulSetCondition buildCondition(Integer index);

  public V1StatefulSetCondition buildFirstCondition();

  public V1StatefulSetCondition buildLastCondition();

  public V1StatefulSetCondition buildMatchingCondition(
      Predicate<V1StatefulSetConditionBuilder> predicate);

  public Boolean hasMatchingCondition(Predicate<V1StatefulSetConditionBuilder> predicate);

  public A withConditions(List<V1StatefulSetCondition> conditions);

  public A withConditions(io.kubernetes.client.openapi.models.V1StatefulSetCondition... conditions);

  public Boolean hasConditions();

  public V1StatefulSetStatusFluent.ConditionsNested<A> addNewCondition();

  public V1StatefulSetStatusFluent.ConditionsNested<A> addNewConditionLike(
      V1StatefulSetCondition item);

  public V1StatefulSetStatusFluent.ConditionsNested<A> setNewConditionLike(
      Integer index, V1StatefulSetCondition item);

  public V1StatefulSetStatusFluent.ConditionsNested<A> editCondition(Integer index);

  public V1StatefulSetStatusFluent.ConditionsNested<A> editFirstCondition();

  public V1StatefulSetStatusFluent.ConditionsNested<A> editLastCondition();

  public V1StatefulSetStatusFluent.ConditionsNested<A> editMatchingCondition(
      Predicate<V1StatefulSetConditionBuilder> predicate);

  public Integer getCurrentReplicas();

  public A withCurrentReplicas(Integer currentReplicas);

  public Boolean hasCurrentReplicas();

  public String getCurrentRevision();

  public A withCurrentRevision(String currentRevision);

  public Boolean hasCurrentRevision();

  public Long getObservedGeneration();

  public A withObservedGeneration(Long observedGeneration);

  public Boolean hasObservedGeneration();

  public Integer getReadyReplicas();

  public A withReadyReplicas(Integer readyReplicas);

  public Boolean hasReadyReplicas();

  public Integer getReplicas();

  public A withReplicas(Integer replicas);

  public Boolean hasReplicas();

  public String getUpdateRevision();

  public A withUpdateRevision(String updateRevision);

  public Boolean hasUpdateRevision();

  public Integer getUpdatedReplicas();

  public A withUpdatedReplicas(Integer updatedReplicas);

  public Boolean hasUpdatedReplicas();

  public interface ConditionsNested<N>
      extends Nested<N>,
          V1StatefulSetConditionFluent<V1StatefulSetStatusFluent.ConditionsNested<N>> {
    public N and();

    public N endCondition();
  }
}
