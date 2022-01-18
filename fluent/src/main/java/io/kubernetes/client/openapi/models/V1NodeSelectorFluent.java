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
public interface V1NodeSelectorFluent<
        A extends io.kubernetes.client.openapi.models.V1NodeSelectorFluent<A>>
    extends io.kubernetes.client.fluent.Fluent<A> {
  public A addToNodeSelectorTerms(
      java.lang.Integer index, io.kubernetes.client.openapi.models.V1NodeSelectorTerm item);

  public A setToNodeSelectorTerms(
      java.lang.Integer index, io.kubernetes.client.openapi.models.V1NodeSelectorTerm item);

  public A addToNodeSelectorTerms(io.kubernetes.client.openapi.models.V1NodeSelectorTerm... items);

  public A addAllToNodeSelectorTerms(
      java.util.Collection<io.kubernetes.client.openapi.models.V1NodeSelectorTerm> items);

  public A removeFromNodeSelectorTerms(
      io.kubernetes.client.openapi.models.V1NodeSelectorTerm... items);

  public A removeAllFromNodeSelectorTerms(
      java.util.Collection<io.kubernetes.client.openapi.models.V1NodeSelectorTerm> items);

  public A removeMatchingFromNodeSelectorTerms(
      java.util.function.Predicate<io.kubernetes.client.openapi.models.V1NodeSelectorTermBuilder>
          predicate);

  /**
   * This method has been deprecated, please use method buildNodeSelectorTerms instead.
   *
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public java.util.List<io.kubernetes.client.openapi.models.V1NodeSelectorTerm>
      getNodeSelectorTerms();

  public java.util.List<io.kubernetes.client.openapi.models.V1NodeSelectorTerm>
      buildNodeSelectorTerms();

  public io.kubernetes.client.openapi.models.V1NodeSelectorTerm buildNodeSelectorTerm(
      java.lang.Integer index);

  public io.kubernetes.client.openapi.models.V1NodeSelectorTerm buildFirstNodeSelectorTerm();

  public io.kubernetes.client.openapi.models.V1NodeSelectorTerm buildLastNodeSelectorTerm();

  public io.kubernetes.client.openapi.models.V1NodeSelectorTerm buildMatchingNodeSelectorTerm(
      java.util.function.Predicate<io.kubernetes.client.openapi.models.V1NodeSelectorTermBuilder>
          predicate);

  public java.lang.Boolean hasMatchingNodeSelectorTerm(
      java.util.function.Predicate<io.kubernetes.client.openapi.models.V1NodeSelectorTermBuilder>
          predicate);

  public A withNodeSelectorTerms(
      java.util.List<io.kubernetes.client.openapi.models.V1NodeSelectorTerm> nodeSelectorTerms);

  public A withNodeSelectorTerms(
      io.kubernetes.client.openapi.models.V1NodeSelectorTerm... nodeSelectorTerms);

  public java.lang.Boolean hasNodeSelectorTerms();

  public io.kubernetes.client.openapi.models.V1NodeSelectorFluent.NodeSelectorTermsNested<A>
      addNewNodeSelectorTerm();

  public io.kubernetes.client.openapi.models.V1NodeSelectorFluent.NodeSelectorTermsNested<A>
      addNewNodeSelectorTermLike(io.kubernetes.client.openapi.models.V1NodeSelectorTerm item);

  public io.kubernetes.client.openapi.models.V1NodeSelectorFluent.NodeSelectorTermsNested<A>
      setNewNodeSelectorTermLike(
          java.lang.Integer index, io.kubernetes.client.openapi.models.V1NodeSelectorTerm item);

  public io.kubernetes.client.openapi.models.V1NodeSelectorFluent.NodeSelectorTermsNested<A>
      editNodeSelectorTerm(java.lang.Integer index);

  public io.kubernetes.client.openapi.models.V1NodeSelectorFluent.NodeSelectorTermsNested<A>
      editFirstNodeSelectorTerm();

  public io.kubernetes.client.openapi.models.V1NodeSelectorFluent.NodeSelectorTermsNested<A>
      editLastNodeSelectorTerm();

  public io.kubernetes.client.openapi.models.V1NodeSelectorFluent.NodeSelectorTermsNested<A>
      editMatchingNodeSelectorTerm(
          java.util.function.Predicate<
                  io.kubernetes.client.openapi.models.V1NodeSelectorTermBuilder>
              predicate);

  public interface NodeSelectorTermsNested<N>
      extends io.kubernetes.client.fluent.Nested<N>,
          io.kubernetes.client.openapi.models.V1NodeSelectorTermFluent<
              io.kubernetes.client.openapi.models.V1NodeSelectorFluent.NodeSelectorTermsNested<N>> {
    public N and();

    public N endNodeSelectorTerm();
  }
}
