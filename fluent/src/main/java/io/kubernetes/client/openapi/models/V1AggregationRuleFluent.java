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
public interface V1AggregationRuleFluent<A extends V1AggregationRuleFluent<A>> extends Fluent<A> {
  public A addToClusterRoleSelectors(Integer index, V1LabelSelector item);

  public A setToClusterRoleSelectors(
      java.lang.Integer index, io.kubernetes.client.openapi.models.V1LabelSelector item);

  public A addToClusterRoleSelectors(io.kubernetes.client.openapi.models.V1LabelSelector... items);

  public A addAllToClusterRoleSelectors(
      Collection<io.kubernetes.client.openapi.models.V1LabelSelector> items);

  public A removeFromClusterRoleSelectors(
      io.kubernetes.client.openapi.models.V1LabelSelector... items);

  public A removeAllFromClusterRoleSelectors(
      java.util.Collection<io.kubernetes.client.openapi.models.V1LabelSelector> items);

  public A removeMatchingFromClusterRoleSelectors(Predicate<V1LabelSelectorBuilder> predicate);

  /**
   * This method has been deprecated, please use method buildClusterRoleSelectors instead.
   *
   * @return The buildable object.
   */
  @Deprecated
  public List<io.kubernetes.client.openapi.models.V1LabelSelector> getClusterRoleSelectors();

  public java.util.List<io.kubernetes.client.openapi.models.V1LabelSelector>
      buildClusterRoleSelectors();

  public io.kubernetes.client.openapi.models.V1LabelSelector buildClusterRoleSelector(
      java.lang.Integer index);

  public io.kubernetes.client.openapi.models.V1LabelSelector buildFirstClusterRoleSelector();

  public io.kubernetes.client.openapi.models.V1LabelSelector buildLastClusterRoleSelector();

  public io.kubernetes.client.openapi.models.V1LabelSelector buildMatchingClusterRoleSelector(
      java.util.function.Predicate<io.kubernetes.client.openapi.models.V1LabelSelectorBuilder>
          predicate);

  public Boolean hasMatchingClusterRoleSelector(
      java.util.function.Predicate<io.kubernetes.client.openapi.models.V1LabelSelectorBuilder>
          predicate);

  public A withClusterRoleSelectors(
      java.util.List<io.kubernetes.client.openapi.models.V1LabelSelector> clusterRoleSelectors);

  public A withClusterRoleSelectors(
      io.kubernetes.client.openapi.models.V1LabelSelector... clusterRoleSelectors);

  public java.lang.Boolean hasClusterRoleSelectors();

  public V1AggregationRuleFluent.ClusterRoleSelectorsNested<A> addNewClusterRoleSelector();

  public io.kubernetes.client.openapi.models.V1AggregationRuleFluent.ClusterRoleSelectorsNested<A>
      addNewClusterRoleSelectorLike(io.kubernetes.client.openapi.models.V1LabelSelector item);

  public io.kubernetes.client.openapi.models.V1AggregationRuleFluent.ClusterRoleSelectorsNested<A>
      setNewClusterRoleSelectorLike(
          java.lang.Integer index, io.kubernetes.client.openapi.models.V1LabelSelector item);

  public io.kubernetes.client.openapi.models.V1AggregationRuleFluent.ClusterRoleSelectorsNested<A>
      editClusterRoleSelector(java.lang.Integer index);

  public io.kubernetes.client.openapi.models.V1AggregationRuleFluent.ClusterRoleSelectorsNested<A>
      editFirstClusterRoleSelector();

  public io.kubernetes.client.openapi.models.V1AggregationRuleFluent.ClusterRoleSelectorsNested<A>
      editLastClusterRoleSelector();

  public io.kubernetes.client.openapi.models.V1AggregationRuleFluent.ClusterRoleSelectorsNested<A>
      editMatchingClusterRoleSelector(
          java.util.function.Predicate<io.kubernetes.client.openapi.models.V1LabelSelectorBuilder>
              predicate);

  public interface ClusterRoleSelectorsNested<N>
      extends Nested<N>,
          V1LabelSelectorFluent<V1AggregationRuleFluent.ClusterRoleSelectorsNested<N>> {
    public N and();

    public N endClusterRoleSelector();
  }
}
