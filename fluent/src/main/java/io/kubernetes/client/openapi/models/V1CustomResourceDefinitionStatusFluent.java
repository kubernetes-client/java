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
public interface V1CustomResourceDefinitionStatusFluent<
        A extends V1CustomResourceDefinitionStatusFluent<A>>
    extends Fluent<A> {

  /**
   * This method has been deprecated, please use method buildAcceptedNames instead.
   *
   * @return The buildable object.
   */
  @Deprecated
  public V1CustomResourceDefinitionNames getAcceptedNames();

  public io.kubernetes.client.openapi.models.V1CustomResourceDefinitionNames buildAcceptedNames();

  public A withAcceptedNames(
      io.kubernetes.client.openapi.models.V1CustomResourceDefinitionNames acceptedNames);

  public Boolean hasAcceptedNames();

  public V1CustomResourceDefinitionStatusFluent.AcceptedNamesNested<A> withNewAcceptedNames();

  public io.kubernetes.client.openapi.models.V1CustomResourceDefinitionStatusFluent
              .AcceptedNamesNested<
          A>
      withNewAcceptedNamesLike(
          io.kubernetes.client.openapi.models.V1CustomResourceDefinitionNames item);

  public io.kubernetes.client.openapi.models.V1CustomResourceDefinitionStatusFluent
              .AcceptedNamesNested<
          A>
      editAcceptedNames();

  public io.kubernetes.client.openapi.models.V1CustomResourceDefinitionStatusFluent
              .AcceptedNamesNested<
          A>
      editOrNewAcceptedNames();

  public io.kubernetes.client.openapi.models.V1CustomResourceDefinitionStatusFluent
              .AcceptedNamesNested<
          A>
      editOrNewAcceptedNamesLike(
          io.kubernetes.client.openapi.models.V1CustomResourceDefinitionNames item);

  public A addToConditions(Integer index, V1CustomResourceDefinitionCondition item);

  public A setToConditions(
      java.lang.Integer index,
      io.kubernetes.client.openapi.models.V1CustomResourceDefinitionCondition item);

  public A addToConditions(
      io.kubernetes.client.openapi.models.V1CustomResourceDefinitionCondition... items);

  public A addAllToConditions(
      Collection<io.kubernetes.client.openapi.models.V1CustomResourceDefinitionCondition> items);

  public A removeFromConditions(
      io.kubernetes.client.openapi.models.V1CustomResourceDefinitionCondition... items);

  public A removeAllFromConditions(
      java.util.Collection<io.kubernetes.client.openapi.models.V1CustomResourceDefinitionCondition>
          items);

  public A removeMatchingFromConditions(
      Predicate<V1CustomResourceDefinitionConditionBuilder> predicate);

  /**
   * This method has been deprecated, please use method buildConditions instead.
   *
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public List<io.kubernetes.client.openapi.models.V1CustomResourceDefinitionCondition>
      getConditions();

  public java.util.List<io.kubernetes.client.openapi.models.V1CustomResourceDefinitionCondition>
      buildConditions();

  public io.kubernetes.client.openapi.models.V1CustomResourceDefinitionCondition buildCondition(
      java.lang.Integer index);

  public io.kubernetes.client.openapi.models.V1CustomResourceDefinitionCondition
      buildFirstCondition();

  public io.kubernetes.client.openapi.models.V1CustomResourceDefinitionCondition
      buildLastCondition();

  public io.kubernetes.client.openapi.models.V1CustomResourceDefinitionCondition
      buildMatchingCondition(
          java.util.function.Predicate<
                  io.kubernetes.client.openapi.models.V1CustomResourceDefinitionConditionBuilder>
              predicate);

  public java.lang.Boolean hasMatchingCondition(
      java.util.function.Predicate<
              io.kubernetes.client.openapi.models.V1CustomResourceDefinitionConditionBuilder>
          predicate);

  public A withConditions(
      java.util.List<io.kubernetes.client.openapi.models.V1CustomResourceDefinitionCondition>
          conditions);

  public A withConditions(
      io.kubernetes.client.openapi.models.V1CustomResourceDefinitionCondition... conditions);

  public java.lang.Boolean hasConditions();

  public V1CustomResourceDefinitionStatusFluent.ConditionsNested<A> addNewCondition();

  public io.kubernetes.client.openapi.models.V1CustomResourceDefinitionStatusFluent
              .ConditionsNested<
          A>
      addNewConditionLike(
          io.kubernetes.client.openapi.models.V1CustomResourceDefinitionCondition item);

  public io.kubernetes.client.openapi.models.V1CustomResourceDefinitionStatusFluent
              .ConditionsNested<
          A>
      setNewConditionLike(
          java.lang.Integer index,
          io.kubernetes.client.openapi.models.V1CustomResourceDefinitionCondition item);

  public io.kubernetes.client.openapi.models.V1CustomResourceDefinitionStatusFluent
              .ConditionsNested<
          A>
      editCondition(java.lang.Integer index);

  public io.kubernetes.client.openapi.models.V1CustomResourceDefinitionStatusFluent
              .ConditionsNested<
          A>
      editFirstCondition();

  public io.kubernetes.client.openapi.models.V1CustomResourceDefinitionStatusFluent
              .ConditionsNested<
          A>
      editLastCondition();

  public io.kubernetes.client.openapi.models.V1CustomResourceDefinitionStatusFluent
              .ConditionsNested<
          A>
      editMatchingCondition(
          java.util.function.Predicate<
                  io.kubernetes.client.openapi.models.V1CustomResourceDefinitionConditionBuilder>
              predicate);

  public A addToStoredVersions(java.lang.Integer index, String item);

  public A setToStoredVersions(java.lang.Integer index, java.lang.String item);

  public A addToStoredVersions(java.lang.String... items);

  public A addAllToStoredVersions(java.util.Collection<java.lang.String> items);

  public A removeFromStoredVersions(java.lang.String... items);

  public A removeAllFromStoredVersions(java.util.Collection<java.lang.String> items);

  public java.util.List<java.lang.String> getStoredVersions();

  public java.lang.String getStoredVersion(java.lang.Integer index);

  public java.lang.String getFirstStoredVersion();

  public java.lang.String getLastStoredVersion();

  public java.lang.String getMatchingStoredVersion(
      java.util.function.Predicate<java.lang.String> predicate);

  public java.lang.Boolean hasMatchingStoredVersion(
      java.util.function.Predicate<java.lang.String> predicate);

  public A withStoredVersions(java.util.List<java.lang.String> storedVersions);

  public A withStoredVersions(java.lang.String... storedVersions);

  public java.lang.Boolean hasStoredVersions();

  public interface AcceptedNamesNested<N>
      extends Nested<N>,
          V1CustomResourceDefinitionNamesFluent<
              V1CustomResourceDefinitionStatusFluent.AcceptedNamesNested<N>> {
    public N and();

    public N endAcceptedNames();
  }

  public interface ConditionsNested<N>
      extends io.kubernetes.client.fluent.Nested<N>,
          V1CustomResourceDefinitionConditionFluent<
              V1CustomResourceDefinitionStatusFluent.ConditionsNested<N>> {
    public N and();

    public N endCondition();
  }
}
