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
public interface V1ReplicationControllerStatusFluent<
        A extends io.kubernetes.client.openapi.models.V1ReplicationControllerStatusFluent<A>>
    extends io.kubernetes.client.fluent.Fluent<A> {
  public java.lang.Integer getAvailableReplicas();

  public A withAvailableReplicas(java.lang.Integer availableReplicas);

  public java.lang.Boolean hasAvailableReplicas();

  public A addToConditions(
      java.lang.Integer index,
      io.kubernetes.client.openapi.models.V1ReplicationControllerCondition item);

  public A setToConditions(
      java.lang.Integer index,
      io.kubernetes.client.openapi.models.V1ReplicationControllerCondition item);

  public A addToConditions(
      io.kubernetes.client.openapi.models.V1ReplicationControllerCondition... items);

  public A addAllToConditions(
      java.util.Collection<io.kubernetes.client.openapi.models.V1ReplicationControllerCondition>
          items);

  public A removeFromConditions(
      io.kubernetes.client.openapi.models.V1ReplicationControllerCondition... items);

  public A removeAllFromConditions(
      java.util.Collection<io.kubernetes.client.openapi.models.V1ReplicationControllerCondition>
          items);

  public A removeMatchingFromConditions(
      java.util.function.Predicate<
              io.kubernetes.client.openapi.models.V1ReplicationControllerConditionBuilder>
          predicate);

  /**
   * This method has been deprecated, please use method buildConditions instead.
   *
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public java.util.List<io.kubernetes.client.openapi.models.V1ReplicationControllerCondition>
      getConditions();

  public java.util.List<io.kubernetes.client.openapi.models.V1ReplicationControllerCondition>
      buildConditions();

  public io.kubernetes.client.openapi.models.V1ReplicationControllerCondition buildCondition(
      java.lang.Integer index);

  public io.kubernetes.client.openapi.models.V1ReplicationControllerCondition buildFirstCondition();

  public io.kubernetes.client.openapi.models.V1ReplicationControllerCondition buildLastCondition();

  public io.kubernetes.client.openapi.models.V1ReplicationControllerCondition
      buildMatchingCondition(
          java.util.function.Predicate<
                  io.kubernetes.client.openapi.models.V1ReplicationControllerConditionBuilder>
              predicate);

  public java.lang.Boolean hasMatchingCondition(
      java.util.function.Predicate<
              io.kubernetes.client.openapi.models.V1ReplicationControllerConditionBuilder>
          predicate);

  public A withConditions(
      java.util.List<io.kubernetes.client.openapi.models.V1ReplicationControllerCondition>
          conditions);

  public A withConditions(
      io.kubernetes.client.openapi.models.V1ReplicationControllerCondition... conditions);

  public java.lang.Boolean hasConditions();

  public io.kubernetes.client.openapi.models.V1ReplicationControllerStatusFluent.ConditionsNested<A>
      addNewCondition();

  public io.kubernetes.client.openapi.models.V1ReplicationControllerStatusFluent.ConditionsNested<A>
      addNewConditionLike(
          io.kubernetes.client.openapi.models.V1ReplicationControllerCondition item);

  public io.kubernetes.client.openapi.models.V1ReplicationControllerStatusFluent.ConditionsNested<A>
      setNewConditionLike(
          java.lang.Integer index,
          io.kubernetes.client.openapi.models.V1ReplicationControllerCondition item);

  public io.kubernetes.client.openapi.models.V1ReplicationControllerStatusFluent.ConditionsNested<A>
      editCondition(java.lang.Integer index);

  public io.kubernetes.client.openapi.models.V1ReplicationControllerStatusFluent.ConditionsNested<A>
      editFirstCondition();

  public io.kubernetes.client.openapi.models.V1ReplicationControllerStatusFluent.ConditionsNested<A>
      editLastCondition();

  public io.kubernetes.client.openapi.models.V1ReplicationControllerStatusFluent.ConditionsNested<A>
      editMatchingCondition(
          java.util.function.Predicate<
                  io.kubernetes.client.openapi.models.V1ReplicationControllerConditionBuilder>
              predicate);

  public java.lang.Integer getFullyLabeledReplicas();

  public A withFullyLabeledReplicas(java.lang.Integer fullyLabeledReplicas);

  public java.lang.Boolean hasFullyLabeledReplicas();

  public java.lang.Long getObservedGeneration();

  public A withObservedGeneration(java.lang.Long observedGeneration);

  public java.lang.Boolean hasObservedGeneration();

  public java.lang.Integer getReadyReplicas();

  public A withReadyReplicas(java.lang.Integer readyReplicas);

  public java.lang.Boolean hasReadyReplicas();

  public java.lang.Integer getReplicas();

  public A withReplicas(java.lang.Integer replicas);

  public java.lang.Boolean hasReplicas();

  public interface ConditionsNested<N>
      extends io.kubernetes.client.fluent.Nested<N>,
          io.kubernetes.client.openapi.models.V1ReplicationControllerConditionFluent<
              io.kubernetes.client.openapi.models.V1ReplicationControllerStatusFluent
                      .ConditionsNested<
                  N>> {
    public N and();

    public N endCondition();
  }
}
