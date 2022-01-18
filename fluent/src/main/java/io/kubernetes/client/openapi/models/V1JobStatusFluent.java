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

/** Generated */
public interface V1JobStatusFluent<
        A extends io.kubernetes.client.openapi.models.V1JobStatusFluent<A>>
    extends io.kubernetes.client.fluent.Fluent<A> {
  public java.lang.Integer getActive();

  public A withActive(java.lang.Integer active);

  public java.lang.Boolean hasActive();

  public java.lang.String getCompletedIndexes();

  public A withCompletedIndexes(java.lang.String completedIndexes);

  public java.lang.Boolean hasCompletedIndexes();

  /** Method is deprecated. use withCompletedIndexes instead. */
  @java.lang.Deprecated
  public A withNewCompletedIndexes(java.lang.String original);

  public java.time.OffsetDateTime getCompletionTime();

  public A withCompletionTime(java.time.OffsetDateTime completionTime);

  public java.lang.Boolean hasCompletionTime();

  public A addToConditions(
      java.lang.Integer index, io.kubernetes.client.openapi.models.V1JobCondition item);

  public A setToConditions(
      java.lang.Integer index, io.kubernetes.client.openapi.models.V1JobCondition item);

  public A addToConditions(io.kubernetes.client.openapi.models.V1JobCondition... items);

  public A addAllToConditions(
      java.util.Collection<io.kubernetes.client.openapi.models.V1JobCondition> items);

  public A removeFromConditions(io.kubernetes.client.openapi.models.V1JobCondition... items);

  public A removeAllFromConditions(
      java.util.Collection<io.kubernetes.client.openapi.models.V1JobCondition> items);

  public A removeMatchingFromConditions(
      java.util.function.Predicate<io.kubernetes.client.openapi.models.V1JobConditionBuilder>
          predicate);

  /**
   * This method has been deprecated, please use method buildConditions instead.
   *
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public java.util.List<io.kubernetes.client.openapi.models.V1JobCondition> getConditions();

  public java.util.List<io.kubernetes.client.openapi.models.V1JobCondition> buildConditions();

  public io.kubernetes.client.openapi.models.V1JobCondition buildCondition(java.lang.Integer index);

  public io.kubernetes.client.openapi.models.V1JobCondition buildFirstCondition();

  public io.kubernetes.client.openapi.models.V1JobCondition buildLastCondition();

  public io.kubernetes.client.openapi.models.V1JobCondition buildMatchingCondition(
      java.util.function.Predicate<io.kubernetes.client.openapi.models.V1JobConditionBuilder>
          predicate);

  public java.lang.Boolean hasMatchingCondition(
      java.util.function.Predicate<io.kubernetes.client.openapi.models.V1JobConditionBuilder>
          predicate);

  public A withConditions(
      java.util.List<io.kubernetes.client.openapi.models.V1JobCondition> conditions);

  public A withConditions(io.kubernetes.client.openapi.models.V1JobCondition... conditions);

  public java.lang.Boolean hasConditions();

  public io.kubernetes.client.openapi.models.V1JobStatusFluent.ConditionsNested<A>
      addNewCondition();

  public io.kubernetes.client.openapi.models.V1JobStatusFluent.ConditionsNested<A>
      addNewConditionLike(io.kubernetes.client.openapi.models.V1JobCondition item);

  public io.kubernetes.client.openapi.models.V1JobStatusFluent.ConditionsNested<A>
      setNewConditionLike(
          java.lang.Integer index, io.kubernetes.client.openapi.models.V1JobCondition item);

  public io.kubernetes.client.openapi.models.V1JobStatusFluent.ConditionsNested<A> editCondition(
      java.lang.Integer index);

  public io.kubernetes.client.openapi.models.V1JobStatusFluent.ConditionsNested<A>
      editFirstCondition();

  public io.kubernetes.client.openapi.models.V1JobStatusFluent.ConditionsNested<A>
      editLastCondition();

  public io.kubernetes.client.openapi.models.V1JobStatusFluent.ConditionsNested<A>
      editMatchingCondition(
          java.util.function.Predicate<io.kubernetes.client.openapi.models.V1JobConditionBuilder>
              predicate);

  public java.lang.Integer getFailed();

  public A withFailed(java.lang.Integer failed);

  public java.lang.Boolean hasFailed();

  public java.lang.Integer getReady();

  public A withReady(java.lang.Integer ready);

  public java.lang.Boolean hasReady();

  public java.time.OffsetDateTime getStartTime();

  public A withStartTime(java.time.OffsetDateTime startTime);

  public java.lang.Boolean hasStartTime();

  public java.lang.Integer getSucceeded();

  public A withSucceeded(java.lang.Integer succeeded);

  public java.lang.Boolean hasSucceeded();

  /**
   * This method has been deprecated, please use method buildUncountedTerminatedPods instead.
   *
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public io.kubernetes.client.openapi.models.V1UncountedTerminatedPods getUncountedTerminatedPods();

  public io.kubernetes.client.openapi.models.V1UncountedTerminatedPods
      buildUncountedTerminatedPods();

  public A withUncountedTerminatedPods(
      io.kubernetes.client.openapi.models.V1UncountedTerminatedPods uncountedTerminatedPods);

  public java.lang.Boolean hasUncountedTerminatedPods();

  public io.kubernetes.client.openapi.models.V1JobStatusFluent.UncountedTerminatedPodsNested<A>
      withNewUncountedTerminatedPods();

  public io.kubernetes.client.openapi.models.V1JobStatusFluent.UncountedTerminatedPodsNested<A>
      withNewUncountedTerminatedPodsLike(
          io.kubernetes.client.openapi.models.V1UncountedTerminatedPods item);

  public io.kubernetes.client.openapi.models.V1JobStatusFluent.UncountedTerminatedPodsNested<A>
      editUncountedTerminatedPods();

  public io.kubernetes.client.openapi.models.V1JobStatusFluent.UncountedTerminatedPodsNested<A>
      editOrNewUncountedTerminatedPods();

  public io.kubernetes.client.openapi.models.V1JobStatusFluent.UncountedTerminatedPodsNested<A>
      editOrNewUncountedTerminatedPodsLike(
          io.kubernetes.client.openapi.models.V1UncountedTerminatedPods item);

  public interface ConditionsNested<N>
      extends io.kubernetes.client.fluent.Nested<N>,
          io.kubernetes.client.openapi.models.V1JobConditionFluent<
              io.kubernetes.client.openapi.models.V1JobStatusFluent.ConditionsNested<N>> {
    public N and();

    public N endCondition();
  }

  public interface UncountedTerminatedPodsNested<N>
      extends io.kubernetes.client.fluent.Nested<N>,
          io.kubernetes.client.openapi.models.V1UncountedTerminatedPodsFluent<
              io.kubernetes.client.openapi.models.V1JobStatusFluent.UncountedTerminatedPodsNested<
                  N>> {
    public N and();

    public N endUncountedTerminatedPods();
  }
}
