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
public interface V1DaemonSetStatusFluent<A extends V1DaemonSetStatusFluent<A>> extends Fluent<A> {
  public Integer getCollisionCount();

  public A withCollisionCount(Integer collisionCount);

  public Boolean hasCollisionCount();

  public A addToConditions(Integer index, V1DaemonSetCondition item);

  public A setToConditions(Integer index, V1DaemonSetCondition item);

  public A addToConditions(io.kubernetes.client.openapi.models.V1DaemonSetCondition... items);

  public A addAllToConditions(Collection<V1DaemonSetCondition> items);

  public A removeFromConditions(io.kubernetes.client.openapi.models.V1DaemonSetCondition... items);

  public A removeAllFromConditions(Collection<V1DaemonSetCondition> items);

  public A removeMatchingFromConditions(Predicate<V1DaemonSetConditionBuilder> predicate);

  /**
   * This method has been deprecated, please use method buildConditions instead.
   *
   * @return The buildable object.
   */
  @Deprecated
  public List<V1DaemonSetCondition> getConditions();

  public List<V1DaemonSetCondition> buildConditions();

  public V1DaemonSetCondition buildCondition(Integer index);

  public V1DaemonSetCondition buildFirstCondition();

  public V1DaemonSetCondition buildLastCondition();

  public V1DaemonSetCondition buildMatchingCondition(
      Predicate<V1DaemonSetConditionBuilder> predicate);

  public Boolean hasMatchingCondition(Predicate<V1DaemonSetConditionBuilder> predicate);

  public A withConditions(List<V1DaemonSetCondition> conditions);

  public A withConditions(io.kubernetes.client.openapi.models.V1DaemonSetCondition... conditions);

  public Boolean hasConditions();

  public V1DaemonSetStatusFluent.ConditionsNested<A> addNewCondition();

  public V1DaemonSetStatusFluent.ConditionsNested<A> addNewConditionLike(V1DaemonSetCondition item);

  public V1DaemonSetStatusFluent.ConditionsNested<A> setNewConditionLike(
      Integer index, V1DaemonSetCondition item);

  public V1DaemonSetStatusFluent.ConditionsNested<A> editCondition(Integer index);

  public V1DaemonSetStatusFluent.ConditionsNested<A> editFirstCondition();

  public V1DaemonSetStatusFluent.ConditionsNested<A> editLastCondition();

  public V1DaemonSetStatusFluent.ConditionsNested<A> editMatchingCondition(
      Predicate<V1DaemonSetConditionBuilder> predicate);

  public Integer getCurrentNumberScheduled();

  public A withCurrentNumberScheduled(Integer currentNumberScheduled);

  public Boolean hasCurrentNumberScheduled();

  public Integer getDesiredNumberScheduled();

  public A withDesiredNumberScheduled(Integer desiredNumberScheduled);

  public Boolean hasDesiredNumberScheduled();

  public Integer getNumberAvailable();

  public A withNumberAvailable(Integer numberAvailable);

  public Boolean hasNumberAvailable();

  public Integer getNumberMisscheduled();

  public A withNumberMisscheduled(Integer numberMisscheduled);

  public Boolean hasNumberMisscheduled();

  public Integer getNumberReady();

  public A withNumberReady(Integer numberReady);

  public Boolean hasNumberReady();

  public Integer getNumberUnavailable();

  public A withNumberUnavailable(Integer numberUnavailable);

  public Boolean hasNumberUnavailable();

  public Long getObservedGeneration();

  public A withObservedGeneration(Long observedGeneration);

  public Boolean hasObservedGeneration();

  public Integer getUpdatedNumberScheduled();

  public A withUpdatedNumberScheduled(Integer updatedNumberScheduled);

  public Boolean hasUpdatedNumberScheduled();

  public interface ConditionsNested<N>
      extends Nested<N>, V1DaemonSetConditionFluent<V1DaemonSetStatusFluent.ConditionsNested<N>> {
    public N and();

    public N endCondition();
  }
}
