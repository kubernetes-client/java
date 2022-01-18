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
public interface V1PodAffinityTermFluent<
        A extends io.kubernetes.client.openapi.models.V1PodAffinityTermFluent<A>>
    extends io.kubernetes.client.fluent.Fluent<A> {

  /**
   * This method has been deprecated, please use method buildLabelSelector instead.
   *
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public io.kubernetes.client.openapi.models.V1LabelSelector getLabelSelector();

  public io.kubernetes.client.openapi.models.V1LabelSelector buildLabelSelector();

  public A withLabelSelector(io.kubernetes.client.openapi.models.V1LabelSelector labelSelector);

  public java.lang.Boolean hasLabelSelector();

  public io.kubernetes.client.openapi.models.V1PodAffinityTermFluent.LabelSelectorNested<A>
      withNewLabelSelector();

  public io.kubernetes.client.openapi.models.V1PodAffinityTermFluent.LabelSelectorNested<A>
      withNewLabelSelectorLike(io.kubernetes.client.openapi.models.V1LabelSelector item);

  public io.kubernetes.client.openapi.models.V1PodAffinityTermFluent.LabelSelectorNested<A>
      editLabelSelector();

  public io.kubernetes.client.openapi.models.V1PodAffinityTermFluent.LabelSelectorNested<A>
      editOrNewLabelSelector();

  public io.kubernetes.client.openapi.models.V1PodAffinityTermFluent.LabelSelectorNested<A>
      editOrNewLabelSelectorLike(io.kubernetes.client.openapi.models.V1LabelSelector item);

  /**
   * This method has been deprecated, please use method buildNamespaceSelector instead.
   *
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public io.kubernetes.client.openapi.models.V1LabelSelector getNamespaceSelector();

  public io.kubernetes.client.openapi.models.V1LabelSelector buildNamespaceSelector();

  public A withNamespaceSelector(
      io.kubernetes.client.openapi.models.V1LabelSelector namespaceSelector);

  public java.lang.Boolean hasNamespaceSelector();

  public io.kubernetes.client.openapi.models.V1PodAffinityTermFluent.NamespaceSelectorNested<A>
      withNewNamespaceSelector();

  public io.kubernetes.client.openapi.models.V1PodAffinityTermFluent.NamespaceSelectorNested<A>
      withNewNamespaceSelectorLike(io.kubernetes.client.openapi.models.V1LabelSelector item);

  public io.kubernetes.client.openapi.models.V1PodAffinityTermFluent.NamespaceSelectorNested<A>
      editNamespaceSelector();

  public io.kubernetes.client.openapi.models.V1PodAffinityTermFluent.NamespaceSelectorNested<A>
      editOrNewNamespaceSelector();

  public io.kubernetes.client.openapi.models.V1PodAffinityTermFluent.NamespaceSelectorNested<A>
      editOrNewNamespaceSelectorLike(io.kubernetes.client.openapi.models.V1LabelSelector item);

  public A addToNamespaces(java.lang.Integer index, java.lang.String item);

  public A setToNamespaces(java.lang.Integer index, java.lang.String item);

  public A addToNamespaces(java.lang.String... items);

  public A addAllToNamespaces(java.util.Collection<java.lang.String> items);

  public A removeFromNamespaces(java.lang.String... items);

  public A removeAllFromNamespaces(java.util.Collection<java.lang.String> items);

  public java.util.List<java.lang.String> getNamespaces();

  public java.lang.String getNamespace(java.lang.Integer index);

  public java.lang.String getFirstNamespace();

  public java.lang.String getLastNamespace();

  public java.lang.String getMatchingNamespace(
      java.util.function.Predicate<java.lang.String> predicate);

  public java.lang.Boolean hasMatchingNamespace(
      java.util.function.Predicate<java.lang.String> predicate);

  public A withNamespaces(java.util.List<java.lang.String> namespaces);

  public A withNamespaces(java.lang.String... namespaces);

  public java.lang.Boolean hasNamespaces();

  public A addNewNamespace(java.lang.String original);

  public java.lang.String getTopologyKey();

  public A withTopologyKey(java.lang.String topologyKey);

  public java.lang.Boolean hasTopologyKey();

  /** Method is deprecated. use withTopologyKey instead. */
  @java.lang.Deprecated
  public A withNewTopologyKey(java.lang.String original);

  public interface LabelSelectorNested<N>
      extends io.kubernetes.client.fluent.Nested<N>,
          io.kubernetes.client.openapi.models.V1LabelSelectorFluent<
              io.kubernetes.client.openapi.models.V1PodAffinityTermFluent.LabelSelectorNested<N>> {
    public N and();

    public N endLabelSelector();
  }

  public interface NamespaceSelectorNested<N>
      extends io.kubernetes.client.fluent.Nested<N>,
          io.kubernetes.client.openapi.models.V1LabelSelectorFluent<
              io.kubernetes.client.openapi.models.V1PodAffinityTermFluent.NamespaceSelectorNested<
                  N>> {
    public N and();

    public N endNamespaceSelector();
  }
}
