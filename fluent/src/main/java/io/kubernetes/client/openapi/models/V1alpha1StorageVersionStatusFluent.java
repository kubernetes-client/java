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
public interface V1alpha1StorageVersionStatusFluent<A extends V1alpha1StorageVersionStatusFluent<A>>
    extends Fluent<A> {
  public String getCommonEncodingVersion();

  public A withCommonEncodingVersion(java.lang.String commonEncodingVersion);

  public Boolean hasCommonEncodingVersion();

  public A addToConditions(Integer index, V1alpha1StorageVersionCondition item);

  public A setToConditions(
      java.lang.Integer index,
      io.kubernetes.client.openapi.models.V1alpha1StorageVersionCondition item);

  public A addToConditions(
      io.kubernetes.client.openapi.models.V1alpha1StorageVersionCondition... items);

  public A addAllToConditions(
      Collection<io.kubernetes.client.openapi.models.V1alpha1StorageVersionCondition> items);

  public A removeFromConditions(
      io.kubernetes.client.openapi.models.V1alpha1StorageVersionCondition... items);

  public A removeAllFromConditions(
      java.util.Collection<io.kubernetes.client.openapi.models.V1alpha1StorageVersionCondition>
          items);

  public A removeMatchingFromConditions(
      Predicate<V1alpha1StorageVersionConditionBuilder> predicate);

  /**
   * This method has been deprecated, please use method buildConditions instead.
   *
   * @return The buildable object.
   */
  @Deprecated
  public List<io.kubernetes.client.openapi.models.V1alpha1StorageVersionCondition> getConditions();

  public java.util.List<io.kubernetes.client.openapi.models.V1alpha1StorageVersionCondition>
      buildConditions();

  public io.kubernetes.client.openapi.models.V1alpha1StorageVersionCondition buildCondition(
      java.lang.Integer index);

  public io.kubernetes.client.openapi.models.V1alpha1StorageVersionCondition buildFirstCondition();

  public io.kubernetes.client.openapi.models.V1alpha1StorageVersionCondition buildLastCondition();

  public io.kubernetes.client.openapi.models.V1alpha1StorageVersionCondition buildMatchingCondition(
      java.util.function.Predicate<
              io.kubernetes.client.openapi.models.V1alpha1StorageVersionConditionBuilder>
          predicate);

  public java.lang.Boolean hasMatchingCondition(
      java.util.function.Predicate<
              io.kubernetes.client.openapi.models.V1alpha1StorageVersionConditionBuilder>
          predicate);

  public A withConditions(
      java.util.List<io.kubernetes.client.openapi.models.V1alpha1StorageVersionCondition>
          conditions);

  public A withConditions(
      io.kubernetes.client.openapi.models.V1alpha1StorageVersionCondition... conditions);

  public java.lang.Boolean hasConditions();

  public V1alpha1StorageVersionStatusFluent.ConditionsNested<A> addNewCondition();

  public io.kubernetes.client.openapi.models.V1alpha1StorageVersionStatusFluent.ConditionsNested<A>
      addNewConditionLike(io.kubernetes.client.openapi.models.V1alpha1StorageVersionCondition item);

  public io.kubernetes.client.openapi.models.V1alpha1StorageVersionStatusFluent.ConditionsNested<A>
      setNewConditionLike(
          java.lang.Integer index,
          io.kubernetes.client.openapi.models.V1alpha1StorageVersionCondition item);

  public io.kubernetes.client.openapi.models.V1alpha1StorageVersionStatusFluent.ConditionsNested<A>
      editCondition(java.lang.Integer index);

  public io.kubernetes.client.openapi.models.V1alpha1StorageVersionStatusFluent.ConditionsNested<A>
      editFirstCondition();

  public io.kubernetes.client.openapi.models.V1alpha1StorageVersionStatusFluent.ConditionsNested<A>
      editLastCondition();

  public io.kubernetes.client.openapi.models.V1alpha1StorageVersionStatusFluent.ConditionsNested<A>
      editMatchingCondition(
          java.util.function.Predicate<
                  io.kubernetes.client.openapi.models.V1alpha1StorageVersionConditionBuilder>
              predicate);

  public A addToStorageVersions(java.lang.Integer index, V1alpha1ServerStorageVersion item);

  public A setToStorageVersions(
      java.lang.Integer index,
      io.kubernetes.client.openapi.models.V1alpha1ServerStorageVersion item);

  public A addToStorageVersions(
      io.kubernetes.client.openapi.models.V1alpha1ServerStorageVersion... items);

  public A addAllToStorageVersions(
      java.util.Collection<io.kubernetes.client.openapi.models.V1alpha1ServerStorageVersion> items);

  public A removeFromStorageVersions(
      io.kubernetes.client.openapi.models.V1alpha1ServerStorageVersion... items);

  public A removeAllFromStorageVersions(
      java.util.Collection<io.kubernetes.client.openapi.models.V1alpha1ServerStorageVersion> items);

  public A removeMatchingFromStorageVersions(
      java.util.function.Predicate<V1alpha1ServerStorageVersionBuilder> predicate);

  /**
   * This method has been deprecated, please use method buildStorageVersions instead.
   *
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public java.util.List<io.kubernetes.client.openapi.models.V1alpha1ServerStorageVersion>
      getStorageVersions();

  public java.util.List<io.kubernetes.client.openapi.models.V1alpha1ServerStorageVersion>
      buildStorageVersions();

  public io.kubernetes.client.openapi.models.V1alpha1ServerStorageVersion buildStorageVersion(
      java.lang.Integer index);

  public io.kubernetes.client.openapi.models.V1alpha1ServerStorageVersion
      buildFirstStorageVersion();

  public io.kubernetes.client.openapi.models.V1alpha1ServerStorageVersion buildLastStorageVersion();

  public io.kubernetes.client.openapi.models.V1alpha1ServerStorageVersion
      buildMatchingStorageVersion(
          java.util.function.Predicate<
                  io.kubernetes.client.openapi.models.V1alpha1ServerStorageVersionBuilder>
              predicate);

  public java.lang.Boolean hasMatchingStorageVersion(
      java.util.function.Predicate<
              io.kubernetes.client.openapi.models.V1alpha1ServerStorageVersionBuilder>
          predicate);

  public A withStorageVersions(
      java.util.List<io.kubernetes.client.openapi.models.V1alpha1ServerStorageVersion>
          storageVersions);

  public A withStorageVersions(
      io.kubernetes.client.openapi.models.V1alpha1ServerStorageVersion... storageVersions);

  public java.lang.Boolean hasStorageVersions();

  public V1alpha1StorageVersionStatusFluent.StorageVersionsNested<A> addNewStorageVersion();

  public io.kubernetes.client.openapi.models.V1alpha1StorageVersionStatusFluent
              .StorageVersionsNested<
          A>
      addNewStorageVersionLike(
          io.kubernetes.client.openapi.models.V1alpha1ServerStorageVersion item);

  public io.kubernetes.client.openapi.models.V1alpha1StorageVersionStatusFluent
              .StorageVersionsNested<
          A>
      setNewStorageVersionLike(
          java.lang.Integer index,
          io.kubernetes.client.openapi.models.V1alpha1ServerStorageVersion item);

  public io.kubernetes.client.openapi.models.V1alpha1StorageVersionStatusFluent
              .StorageVersionsNested<
          A>
      editStorageVersion(java.lang.Integer index);

  public io.kubernetes.client.openapi.models.V1alpha1StorageVersionStatusFluent
              .StorageVersionsNested<
          A>
      editFirstStorageVersion();

  public io.kubernetes.client.openapi.models.V1alpha1StorageVersionStatusFluent
              .StorageVersionsNested<
          A>
      editLastStorageVersion();

  public io.kubernetes.client.openapi.models.V1alpha1StorageVersionStatusFluent
              .StorageVersionsNested<
          A>
      editMatchingStorageVersion(
          java.util.function.Predicate<
                  io.kubernetes.client.openapi.models.V1alpha1ServerStorageVersionBuilder>
              predicate);

  public interface ConditionsNested<N>
      extends Nested<N>,
          V1alpha1StorageVersionConditionFluent<
              V1alpha1StorageVersionStatusFluent.ConditionsNested<N>> {
    public N and();

    public N endCondition();
  }

  public interface StorageVersionsNested<N>
      extends io.kubernetes.client.fluent.Nested<N>,
          V1alpha1ServerStorageVersionFluent<
              V1alpha1StorageVersionStatusFluent.StorageVersionsNested<N>> {
    public N and();

    public N endStorageVersion();
  }
}
