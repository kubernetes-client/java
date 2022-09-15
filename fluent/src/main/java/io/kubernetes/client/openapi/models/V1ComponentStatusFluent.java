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
public interface V1ComponentStatusFluent<A extends V1ComponentStatusFluent<A>> extends Fluent<A> {
  public String getApiVersion();

  public A withApiVersion(String apiVersion);

  public Boolean hasApiVersion();

  public A addToConditions(Integer index, V1ComponentCondition item);

  public A setToConditions(Integer index, V1ComponentCondition item);

  public A addToConditions(io.kubernetes.client.openapi.models.V1ComponentCondition... items);

  public A addAllToConditions(Collection<V1ComponentCondition> items);

  public A removeFromConditions(io.kubernetes.client.openapi.models.V1ComponentCondition... items);

  public A removeAllFromConditions(Collection<V1ComponentCondition> items);

  public A removeMatchingFromConditions(Predicate<V1ComponentConditionBuilder> predicate);

  /**
   * This method has been deprecated, please use method buildConditions instead.
   *
   * @return The buildable object.
   */
  @Deprecated
  public List<V1ComponentCondition> getConditions();

  public List<V1ComponentCondition> buildConditions();

  public V1ComponentCondition buildCondition(Integer index);

  public V1ComponentCondition buildFirstCondition();

  public V1ComponentCondition buildLastCondition();

  public V1ComponentCondition buildMatchingCondition(
      Predicate<V1ComponentConditionBuilder> predicate);

  public Boolean hasMatchingCondition(Predicate<V1ComponentConditionBuilder> predicate);

  public A withConditions(List<V1ComponentCondition> conditions);

  public A withConditions(io.kubernetes.client.openapi.models.V1ComponentCondition... conditions);

  public Boolean hasConditions();

  public V1ComponentStatusFluent.ConditionsNested<A> addNewCondition();

  public V1ComponentStatusFluent.ConditionsNested<A> addNewConditionLike(V1ComponentCondition item);

  public V1ComponentStatusFluent.ConditionsNested<A> setNewConditionLike(
      Integer index, V1ComponentCondition item);

  public V1ComponentStatusFluent.ConditionsNested<A> editCondition(Integer index);

  public V1ComponentStatusFluent.ConditionsNested<A> editFirstCondition();

  public V1ComponentStatusFluent.ConditionsNested<A> editLastCondition();

  public V1ComponentStatusFluent.ConditionsNested<A> editMatchingCondition(
      Predicate<V1ComponentConditionBuilder> predicate);

  public String getKind();

  public A withKind(String kind);

  public Boolean hasKind();

  /**
   * This method has been deprecated, please use method buildMetadata instead.
   *
   * @return The buildable object.
   */
  @Deprecated
  public V1ObjectMeta getMetadata();

  public V1ObjectMeta buildMetadata();

  public A withMetadata(V1ObjectMeta metadata);

  public Boolean hasMetadata();

  public V1ComponentStatusFluent.MetadataNested<A> withNewMetadata();

  public V1ComponentStatusFluent.MetadataNested<A> withNewMetadataLike(V1ObjectMeta item);

  public V1ComponentStatusFluent.MetadataNested<A> editMetadata();

  public V1ComponentStatusFluent.MetadataNested<A> editOrNewMetadata();

  public V1ComponentStatusFluent.MetadataNested<A> editOrNewMetadataLike(V1ObjectMeta item);

  public interface ConditionsNested<N>
      extends Nested<N>, V1ComponentConditionFluent<V1ComponentStatusFluent.ConditionsNested<N>> {
    public N and();

    public N endCondition();
  }

  public interface MetadataNested<N>
      extends Nested<N>, V1ObjectMetaFluent<V1ComponentStatusFluent.MetadataNested<N>> {
    public N and();

    public N endMetadata();
  }
}
