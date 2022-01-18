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
public interface V1beta2PriorityLevelConfigurationStatusFluent<
        A extends
            io.kubernetes.client.openapi.models.V1beta2PriorityLevelConfigurationStatusFluent<A>>
    extends io.kubernetes.client.fluent.Fluent<A> {
  public A addToConditions(
      java.lang.Integer index,
      io.kubernetes.client.openapi.models.V1beta2PriorityLevelConfigurationCondition item);

  public A setToConditions(
      java.lang.Integer index,
      io.kubernetes.client.openapi.models.V1beta2PriorityLevelConfigurationCondition item);

  public A addToConditions(
      io.kubernetes.client.openapi.models.V1beta2PriorityLevelConfigurationCondition... items);

  public A addAllToConditions(
      java.util.Collection<
              io.kubernetes.client.openapi.models.V1beta2PriorityLevelConfigurationCondition>
          items);

  public A removeFromConditions(
      io.kubernetes.client.openapi.models.V1beta2PriorityLevelConfigurationCondition... items);

  public A removeAllFromConditions(
      java.util.Collection<
              io.kubernetes.client.openapi.models.V1beta2PriorityLevelConfigurationCondition>
          items);

  public A removeMatchingFromConditions(
      java.util.function.Predicate<
              io.kubernetes.client.openapi.models.V1beta2PriorityLevelConfigurationConditionBuilder>
          predicate);

  /**
   * This method has been deprecated, please use method buildConditions instead.
   *
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public java.util.List<
          io.kubernetes.client.openapi.models.V1beta2PriorityLevelConfigurationCondition>
      getConditions();

  public java.util.List<
          io.kubernetes.client.openapi.models.V1beta2PriorityLevelConfigurationCondition>
      buildConditions();

  public io.kubernetes.client.openapi.models.V1beta2PriorityLevelConfigurationCondition
      buildCondition(java.lang.Integer index);

  public io.kubernetes.client.openapi.models.V1beta2PriorityLevelConfigurationCondition
      buildFirstCondition();

  public io.kubernetes.client.openapi.models.V1beta2PriorityLevelConfigurationCondition
      buildLastCondition();

  public io.kubernetes.client.openapi.models.V1beta2PriorityLevelConfigurationCondition
      buildMatchingCondition(
          java.util.function.Predicate<
                  io.kubernetes.client.openapi.models
                      .V1beta2PriorityLevelConfigurationConditionBuilder>
              predicate);

  public java.lang.Boolean hasMatchingCondition(
      java.util.function.Predicate<
              io.kubernetes.client.openapi.models.V1beta2PriorityLevelConfigurationConditionBuilder>
          predicate);

  public A withConditions(
      java.util.List<io.kubernetes.client.openapi.models.V1beta2PriorityLevelConfigurationCondition>
          conditions);

  public A withConditions(
      io.kubernetes.client.openapi.models.V1beta2PriorityLevelConfigurationCondition... conditions);

  public java.lang.Boolean hasConditions();

  public io.kubernetes.client.openapi.models.V1beta2PriorityLevelConfigurationStatusFluent
              .ConditionsNested<
          A>
      addNewCondition();

  public io.kubernetes.client.openapi.models.V1beta2PriorityLevelConfigurationStatusFluent
              .ConditionsNested<
          A>
      addNewConditionLike(
          io.kubernetes.client.openapi.models.V1beta2PriorityLevelConfigurationCondition item);

  public io.kubernetes.client.openapi.models.V1beta2PriorityLevelConfigurationStatusFluent
              .ConditionsNested<
          A>
      setNewConditionLike(
          java.lang.Integer index,
          io.kubernetes.client.openapi.models.V1beta2PriorityLevelConfigurationCondition item);

  public io.kubernetes.client.openapi.models.V1beta2PriorityLevelConfigurationStatusFluent
              .ConditionsNested<
          A>
      editCondition(java.lang.Integer index);

  public io.kubernetes.client.openapi.models.V1beta2PriorityLevelConfigurationStatusFluent
              .ConditionsNested<
          A>
      editFirstCondition();

  public io.kubernetes.client.openapi.models.V1beta2PriorityLevelConfigurationStatusFluent
              .ConditionsNested<
          A>
      editLastCondition();

  public io.kubernetes.client.openapi.models.V1beta2PriorityLevelConfigurationStatusFluent
              .ConditionsNested<
          A>
      editMatchingCondition(
          java.util.function.Predicate<
                  io.kubernetes.client.openapi.models
                      .V1beta2PriorityLevelConfigurationConditionBuilder>
              predicate);

  public interface ConditionsNested<N>
      extends io.kubernetes.client.fluent.Nested<N>,
          io.kubernetes.client.openapi.models.V1beta2PriorityLevelConfigurationConditionFluent<
              io.kubernetes.client.openapi.models.V1beta2PriorityLevelConfigurationStatusFluent
                      .ConditionsNested<
                  N>> {
    public N and();

    public N endCondition();
  }
}
