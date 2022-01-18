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
public interface V1beta2FlowSchemaStatusFluent<
        A extends io.kubernetes.client.openapi.models.V1beta2FlowSchemaStatusFluent<A>>
    extends io.kubernetes.client.fluent.Fluent<A> {
  public A addToConditions(
      java.lang.Integer index, io.kubernetes.client.openapi.models.V1beta2FlowSchemaCondition item);

  public A setToConditions(
      java.lang.Integer index, io.kubernetes.client.openapi.models.V1beta2FlowSchemaCondition item);

  public A addToConditions(io.kubernetes.client.openapi.models.V1beta2FlowSchemaCondition... items);

  public A addAllToConditions(
      java.util.Collection<io.kubernetes.client.openapi.models.V1beta2FlowSchemaCondition> items);

  public A removeFromConditions(
      io.kubernetes.client.openapi.models.V1beta2FlowSchemaCondition... items);

  public A removeAllFromConditions(
      java.util.Collection<io.kubernetes.client.openapi.models.V1beta2FlowSchemaCondition> items);

  public A removeMatchingFromConditions(
      java.util.function.Predicate<
              io.kubernetes.client.openapi.models.V1beta2FlowSchemaConditionBuilder>
          predicate);

  /**
   * This method has been deprecated, please use method buildConditions instead.
   *
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public java.util.List<io.kubernetes.client.openapi.models.V1beta2FlowSchemaCondition>
      getConditions();

  public java.util.List<io.kubernetes.client.openapi.models.V1beta2FlowSchemaCondition>
      buildConditions();

  public io.kubernetes.client.openapi.models.V1beta2FlowSchemaCondition buildCondition(
      java.lang.Integer index);

  public io.kubernetes.client.openapi.models.V1beta2FlowSchemaCondition buildFirstCondition();

  public io.kubernetes.client.openapi.models.V1beta2FlowSchemaCondition buildLastCondition();

  public io.kubernetes.client.openapi.models.V1beta2FlowSchemaCondition buildMatchingCondition(
      java.util.function.Predicate<
              io.kubernetes.client.openapi.models.V1beta2FlowSchemaConditionBuilder>
          predicate);

  public java.lang.Boolean hasMatchingCondition(
      java.util.function.Predicate<
              io.kubernetes.client.openapi.models.V1beta2FlowSchemaConditionBuilder>
          predicate);

  public A withConditions(
      java.util.List<io.kubernetes.client.openapi.models.V1beta2FlowSchemaCondition> conditions);

  public A withConditions(
      io.kubernetes.client.openapi.models.V1beta2FlowSchemaCondition... conditions);

  public java.lang.Boolean hasConditions();

  public io.kubernetes.client.openapi.models.V1beta2FlowSchemaStatusFluent.ConditionsNested<A>
      addNewCondition();

  public io.kubernetes.client.openapi.models.V1beta2FlowSchemaStatusFluent.ConditionsNested<A>
      addNewConditionLike(io.kubernetes.client.openapi.models.V1beta2FlowSchemaCondition item);

  public io.kubernetes.client.openapi.models.V1beta2FlowSchemaStatusFluent.ConditionsNested<A>
      setNewConditionLike(
          java.lang.Integer index,
          io.kubernetes.client.openapi.models.V1beta2FlowSchemaCondition item);

  public io.kubernetes.client.openapi.models.V1beta2FlowSchemaStatusFluent.ConditionsNested<A>
      editCondition(java.lang.Integer index);

  public io.kubernetes.client.openapi.models.V1beta2FlowSchemaStatusFluent.ConditionsNested<A>
      editFirstCondition();

  public io.kubernetes.client.openapi.models.V1beta2FlowSchemaStatusFluent.ConditionsNested<A>
      editLastCondition();

  public io.kubernetes.client.openapi.models.V1beta2FlowSchemaStatusFluent.ConditionsNested<A>
      editMatchingCondition(
          java.util.function.Predicate<
                  io.kubernetes.client.openapi.models.V1beta2FlowSchemaConditionBuilder>
              predicate);

  public interface ConditionsNested<N>
      extends io.kubernetes.client.fluent.Nested<N>,
          io.kubernetes.client.openapi.models.V1beta2FlowSchemaConditionFluent<
              io.kubernetes.client.openapi.models.V1beta2FlowSchemaStatusFluent.ConditionsNested<
                  N>> {
    public N and();

    public N endCondition();
  }
}
