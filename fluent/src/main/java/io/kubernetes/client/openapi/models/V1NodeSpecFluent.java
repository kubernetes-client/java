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
public interface V1NodeSpecFluent<A extends io.kubernetes.client.openapi.models.V1NodeSpecFluent<A>>
    extends io.kubernetes.client.fluent.Fluent<A> {

  /**
   * This method has been deprecated, please use method buildConfigSource instead.
   *
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public io.kubernetes.client.openapi.models.V1NodeConfigSource getConfigSource();

  public io.kubernetes.client.openapi.models.V1NodeConfigSource buildConfigSource();

  public A withConfigSource(io.kubernetes.client.openapi.models.V1NodeConfigSource configSource);

  public java.lang.Boolean hasConfigSource();

  public io.kubernetes.client.openapi.models.V1NodeSpecFluent.ConfigSourceNested<A>
      withNewConfigSource();

  public io.kubernetes.client.openapi.models.V1NodeSpecFluent.ConfigSourceNested<A>
      withNewConfigSourceLike(io.kubernetes.client.openapi.models.V1NodeConfigSource item);

  public io.kubernetes.client.openapi.models.V1NodeSpecFluent.ConfigSourceNested<A>
      editConfigSource();

  public io.kubernetes.client.openapi.models.V1NodeSpecFluent.ConfigSourceNested<A>
      editOrNewConfigSource();

  public io.kubernetes.client.openapi.models.V1NodeSpecFluent.ConfigSourceNested<A>
      editOrNewConfigSourceLike(io.kubernetes.client.openapi.models.V1NodeConfigSource item);

  public java.lang.String getExternalID();

  public A withExternalID(java.lang.String externalID);

  public java.lang.Boolean hasExternalID();

  /** Method is deprecated. use withExternalID instead. */
  @java.lang.Deprecated
  public A withNewExternalID(java.lang.String original);

  public java.lang.String getPodCIDR();

  public A withPodCIDR(java.lang.String podCIDR);

  public java.lang.Boolean hasPodCIDR();

  /** Method is deprecated. use withPodCIDR instead. */
  @java.lang.Deprecated
  public A withNewPodCIDR(java.lang.String original);

  public A addToPodCIDRs(java.lang.Integer index, java.lang.String item);

  public A setToPodCIDRs(java.lang.Integer index, java.lang.String item);

  public A addToPodCIDRs(java.lang.String... items);

  public A addAllToPodCIDRs(java.util.Collection<java.lang.String> items);

  public A removeFromPodCIDRs(java.lang.String... items);

  public A removeAllFromPodCIDRs(java.util.Collection<java.lang.String> items);

  public java.util.List<java.lang.String> getPodCIDRs();

  public java.lang.String getPodCIDR(java.lang.Integer index);

  public java.lang.String getFirstPodCIDR();

  public java.lang.String getLastPodCIDR();

  public java.lang.String getMatchingPodCIDR(
      java.util.function.Predicate<java.lang.String> predicate);

  public java.lang.Boolean hasMatchingPodCIDR(
      java.util.function.Predicate<java.lang.String> predicate);

  public A withPodCIDRs(java.util.List<java.lang.String> podCIDRs);

  public A withPodCIDRs(java.lang.String... podCIDRs);

  public java.lang.Boolean hasPodCIDRs();

  public A addNewPodCIDR(java.lang.String original);

  public java.lang.String getProviderID();

  public A withProviderID(java.lang.String providerID);

  public java.lang.Boolean hasProviderID();

  /** Method is deprecated. use withProviderID instead. */
  @java.lang.Deprecated
  public A withNewProviderID(java.lang.String original);

  public A addToTaints(java.lang.Integer index, io.kubernetes.client.openapi.models.V1Taint item);

  public A setToTaints(java.lang.Integer index, io.kubernetes.client.openapi.models.V1Taint item);

  public A addToTaints(io.kubernetes.client.openapi.models.V1Taint... items);

  public A addAllToTaints(java.util.Collection<io.kubernetes.client.openapi.models.V1Taint> items);

  public A removeFromTaints(io.kubernetes.client.openapi.models.V1Taint... items);

  public A removeAllFromTaints(
      java.util.Collection<io.kubernetes.client.openapi.models.V1Taint> items);

  public A removeMatchingFromTaints(
      java.util.function.Predicate<io.kubernetes.client.openapi.models.V1TaintBuilder> predicate);

  /**
   * This method has been deprecated, please use method buildTaints instead.
   *
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public java.util.List<io.kubernetes.client.openapi.models.V1Taint> getTaints();

  public java.util.List<io.kubernetes.client.openapi.models.V1Taint> buildTaints();

  public io.kubernetes.client.openapi.models.V1Taint buildTaint(java.lang.Integer index);

  public io.kubernetes.client.openapi.models.V1Taint buildFirstTaint();

  public io.kubernetes.client.openapi.models.V1Taint buildLastTaint();

  public io.kubernetes.client.openapi.models.V1Taint buildMatchingTaint(
      java.util.function.Predicate<io.kubernetes.client.openapi.models.V1TaintBuilder> predicate);

  public java.lang.Boolean hasMatchingTaint(
      java.util.function.Predicate<io.kubernetes.client.openapi.models.V1TaintBuilder> predicate);

  public A withTaints(java.util.List<io.kubernetes.client.openapi.models.V1Taint> taints);

  public A withTaints(io.kubernetes.client.openapi.models.V1Taint... taints);

  public java.lang.Boolean hasTaints();

  public io.kubernetes.client.openapi.models.V1NodeSpecFluent.TaintsNested<A> addNewTaint();

  public io.kubernetes.client.openapi.models.V1NodeSpecFluent.TaintsNested<A> addNewTaintLike(
      io.kubernetes.client.openapi.models.V1Taint item);

  public io.kubernetes.client.openapi.models.V1NodeSpecFluent.TaintsNested<A> setNewTaintLike(
      java.lang.Integer index, io.kubernetes.client.openapi.models.V1Taint item);

  public io.kubernetes.client.openapi.models.V1NodeSpecFluent.TaintsNested<A> editTaint(
      java.lang.Integer index);

  public io.kubernetes.client.openapi.models.V1NodeSpecFluent.TaintsNested<A> editFirstTaint();

  public io.kubernetes.client.openapi.models.V1NodeSpecFluent.TaintsNested<A> editLastTaint();

  public io.kubernetes.client.openapi.models.V1NodeSpecFluent.TaintsNested<A> editMatchingTaint(
      java.util.function.Predicate<io.kubernetes.client.openapi.models.V1TaintBuilder> predicate);

  public java.lang.Boolean getUnschedulable();

  public A withUnschedulable(java.lang.Boolean unschedulable);

  public java.lang.Boolean hasUnschedulable();

  public interface ConfigSourceNested<N>
      extends io.kubernetes.client.fluent.Nested<N>,
          io.kubernetes.client.openapi.models.V1NodeConfigSourceFluent<
              io.kubernetes.client.openapi.models.V1NodeSpecFluent.ConfigSourceNested<N>> {
    public N and();

    public N endConfigSource();
  }

  public interface TaintsNested<N>
      extends io.kubernetes.client.fluent.Nested<N>,
          io.kubernetes.client.openapi.models.V1TaintFluent<
              io.kubernetes.client.openapi.models.V1NodeSpecFluent.TaintsNested<N>> {
    public N and();

    public N endTaint();
  }
}
