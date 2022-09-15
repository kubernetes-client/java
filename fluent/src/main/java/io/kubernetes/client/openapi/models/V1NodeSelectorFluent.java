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
public interface V1NodeSelectorFluent<A extends V1NodeSelectorFluent<A>> extends Fluent<A> {
  public A addToNodeSelectorTerms(Integer index, V1NodeSelectorTerm item);

  public A setToNodeSelectorTerms(Integer index, V1NodeSelectorTerm item);

  public A addToNodeSelectorTerms(io.kubernetes.client.openapi.models.V1NodeSelectorTerm... items);

  public A addAllToNodeSelectorTerms(Collection<V1NodeSelectorTerm> items);

  public A removeFromNodeSelectorTerms(
      io.kubernetes.client.openapi.models.V1NodeSelectorTerm... items);

  public A removeAllFromNodeSelectorTerms(Collection<V1NodeSelectorTerm> items);

  public A removeMatchingFromNodeSelectorTerms(Predicate<V1NodeSelectorTermBuilder> predicate);

  /**
   * This method has been deprecated, please use method buildNodeSelectorTerms instead.
   *
   * @return The buildable object.
   */
  @Deprecated
  public List<V1NodeSelectorTerm> getNodeSelectorTerms();

  public List<V1NodeSelectorTerm> buildNodeSelectorTerms();

  public V1NodeSelectorTerm buildNodeSelectorTerm(Integer index);

  public V1NodeSelectorTerm buildFirstNodeSelectorTerm();

  public V1NodeSelectorTerm buildLastNodeSelectorTerm();

  public V1NodeSelectorTerm buildMatchingNodeSelectorTerm(
      Predicate<V1NodeSelectorTermBuilder> predicate);

  public Boolean hasMatchingNodeSelectorTerm(Predicate<V1NodeSelectorTermBuilder> predicate);

  public A withNodeSelectorTerms(List<V1NodeSelectorTerm> nodeSelectorTerms);

  public A withNodeSelectorTerms(
      io.kubernetes.client.openapi.models.V1NodeSelectorTerm... nodeSelectorTerms);

  public Boolean hasNodeSelectorTerms();

  public V1NodeSelectorFluent.NodeSelectorTermsNested<A> addNewNodeSelectorTerm();

  public V1NodeSelectorFluent.NodeSelectorTermsNested<A> addNewNodeSelectorTermLike(
      V1NodeSelectorTerm item);

  public V1NodeSelectorFluent.NodeSelectorTermsNested<A> setNewNodeSelectorTermLike(
      Integer index, V1NodeSelectorTerm item);

  public V1NodeSelectorFluent.NodeSelectorTermsNested<A> editNodeSelectorTerm(Integer index);

  public V1NodeSelectorFluent.NodeSelectorTermsNested<A> editFirstNodeSelectorTerm();

  public V1NodeSelectorFluent.NodeSelectorTermsNested<A> editLastNodeSelectorTerm();

  public V1NodeSelectorFluent.NodeSelectorTermsNested<A> editMatchingNodeSelectorTerm(
      Predicate<V1NodeSelectorTermBuilder> predicate);

  public interface NodeSelectorTermsNested<N>
      extends Nested<N>, V1NodeSelectorTermFluent<V1NodeSelectorFluent.NodeSelectorTermsNested<N>> {
    public N and();

    public N endNodeSelectorTerm();
  }
}
