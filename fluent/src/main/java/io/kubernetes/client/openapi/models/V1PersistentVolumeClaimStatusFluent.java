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

import io.kubernetes.client.custom.Quantity;
import io.kubernetes.client.fluent.Fluent;
import io.kubernetes.client.fluent.Nested;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;

/** Generated */
public interface V1PersistentVolumeClaimStatusFluent<
        A extends V1PersistentVolumeClaimStatusFluent<A>>
    extends Fluent<A> {
  public A addToAccessModes(Integer index, String item);

  public A setToAccessModes(java.lang.Integer index, java.lang.String item);

  public A addToAccessModes(java.lang.String... items);

  public A addAllToAccessModes(Collection<java.lang.String> items);

  public A removeFromAccessModes(java.lang.String... items);

  public A removeAllFromAccessModes(java.util.Collection<java.lang.String> items);

  public List<java.lang.String> getAccessModes();

  public java.lang.String getAccessMode(java.lang.Integer index);

  public java.lang.String getFirstAccessMode();

  public java.lang.String getLastAccessMode();

  public java.lang.String getMatchingAccessMode(Predicate<java.lang.String> predicate);

  public Boolean hasMatchingAccessMode(java.util.function.Predicate<java.lang.String> predicate);

  public A withAccessModes(java.util.List<java.lang.String> accessModes);

  public A withAccessModes(java.lang.String... accessModes);

  public java.lang.Boolean hasAccessModes();

  public A addToAllocatedResources(java.lang.String key, Quantity value);

  public A addToAllocatedResources(Map<java.lang.String, io.kubernetes.client.custom.Quantity> map);

  public A removeFromAllocatedResources(java.lang.String key);

  public A removeFromAllocatedResources(
      java.util.Map<java.lang.String, io.kubernetes.client.custom.Quantity> map);

  public java.util.Map<java.lang.String, io.kubernetes.client.custom.Quantity>
      getAllocatedResources();

  public <K, V> A withAllocatedResources(
      java.util.Map<java.lang.String, io.kubernetes.client.custom.Quantity> allocatedResources);

  public java.lang.Boolean hasAllocatedResources();

  public A addToCapacity(java.lang.String key, io.kubernetes.client.custom.Quantity value);

  public A addToCapacity(java.util.Map<java.lang.String, io.kubernetes.client.custom.Quantity> map);

  public A removeFromCapacity(java.lang.String key);

  public A removeFromCapacity(
      java.util.Map<java.lang.String, io.kubernetes.client.custom.Quantity> map);

  public java.util.Map<java.lang.String, io.kubernetes.client.custom.Quantity> getCapacity();

  public <K, V> A withCapacity(
      java.util.Map<java.lang.String, io.kubernetes.client.custom.Quantity> capacity);

  public java.lang.Boolean hasCapacity();

  public A addToConditions(java.lang.Integer index, V1PersistentVolumeClaimCondition item);

  public A setToConditions(
      java.lang.Integer index,
      io.kubernetes.client.openapi.models.V1PersistentVolumeClaimCondition item);

  public A addToConditions(
      io.kubernetes.client.openapi.models.V1PersistentVolumeClaimCondition... items);

  public A addAllToConditions(
      java.util.Collection<io.kubernetes.client.openapi.models.V1PersistentVolumeClaimCondition>
          items);

  public A removeFromConditions(
      io.kubernetes.client.openapi.models.V1PersistentVolumeClaimCondition... items);

  public A removeAllFromConditions(
      java.util.Collection<io.kubernetes.client.openapi.models.V1PersistentVolumeClaimCondition>
          items);

  public A removeMatchingFromConditions(
      java.util.function.Predicate<V1PersistentVolumeClaimConditionBuilder> predicate);

  /**
   * This method has been deprecated, please use method buildConditions instead.
   *
   * @return The buildable object.
   */
  @Deprecated
  public java.util.List<io.kubernetes.client.openapi.models.V1PersistentVolumeClaimCondition>
      getConditions();

  public java.util.List<io.kubernetes.client.openapi.models.V1PersistentVolumeClaimCondition>
      buildConditions();

  public io.kubernetes.client.openapi.models.V1PersistentVolumeClaimCondition buildCondition(
      java.lang.Integer index);

  public io.kubernetes.client.openapi.models.V1PersistentVolumeClaimCondition buildFirstCondition();

  public io.kubernetes.client.openapi.models.V1PersistentVolumeClaimCondition buildLastCondition();

  public io.kubernetes.client.openapi.models.V1PersistentVolumeClaimCondition
      buildMatchingCondition(
          java.util.function.Predicate<
                  io.kubernetes.client.openapi.models.V1PersistentVolumeClaimConditionBuilder>
              predicate);

  public java.lang.Boolean hasMatchingCondition(
      java.util.function.Predicate<
              io.kubernetes.client.openapi.models.V1PersistentVolumeClaimConditionBuilder>
          predicate);

  public A withConditions(
      java.util.List<io.kubernetes.client.openapi.models.V1PersistentVolumeClaimCondition>
          conditions);

  public A withConditions(
      io.kubernetes.client.openapi.models.V1PersistentVolumeClaimCondition... conditions);

  public java.lang.Boolean hasConditions();

  public V1PersistentVolumeClaimStatusFluent.ConditionsNested<A> addNewCondition();

  public io.kubernetes.client.openapi.models.V1PersistentVolumeClaimStatusFluent.ConditionsNested<A>
      addNewConditionLike(
          io.kubernetes.client.openapi.models.V1PersistentVolumeClaimCondition item);

  public io.kubernetes.client.openapi.models.V1PersistentVolumeClaimStatusFluent.ConditionsNested<A>
      setNewConditionLike(
          java.lang.Integer index,
          io.kubernetes.client.openapi.models.V1PersistentVolumeClaimCondition item);

  public io.kubernetes.client.openapi.models.V1PersistentVolumeClaimStatusFluent.ConditionsNested<A>
      editCondition(java.lang.Integer index);

  public io.kubernetes.client.openapi.models.V1PersistentVolumeClaimStatusFluent.ConditionsNested<A>
      editFirstCondition();

  public io.kubernetes.client.openapi.models.V1PersistentVolumeClaimStatusFluent.ConditionsNested<A>
      editLastCondition();

  public io.kubernetes.client.openapi.models.V1PersistentVolumeClaimStatusFluent.ConditionsNested<A>
      editMatchingCondition(
          java.util.function.Predicate<
                  io.kubernetes.client.openapi.models.V1PersistentVolumeClaimConditionBuilder>
              predicate);

  public java.lang.String getPhase();

  public A withPhase(java.lang.String phase);

  public java.lang.Boolean hasPhase();

  public java.lang.String getResizeStatus();

  public A withResizeStatus(java.lang.String resizeStatus);

  public java.lang.Boolean hasResizeStatus();

  public interface ConditionsNested<N>
      extends Nested<N>,
          V1PersistentVolumeClaimConditionFluent<
              V1PersistentVolumeClaimStatusFluent.ConditionsNested<N>> {
    public N and();

    public N endCondition();
  }
}
