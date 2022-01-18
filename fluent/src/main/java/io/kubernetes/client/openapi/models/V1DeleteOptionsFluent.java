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
public interface V1DeleteOptionsFluent<
        A extends io.kubernetes.client.openapi.models.V1DeleteOptionsFluent<A>>
    extends io.kubernetes.client.fluent.Fluent<A> {
  public java.lang.String getApiVersion();

  public A withApiVersion(java.lang.String apiVersion);

  public java.lang.Boolean hasApiVersion();

  /** Method is deprecated. use withApiVersion instead. */
  @java.lang.Deprecated
  public A withNewApiVersion(java.lang.String original);

  public A addToDryRun(java.lang.Integer index, java.lang.String item);

  public A setToDryRun(java.lang.Integer index, java.lang.String item);

  public A addToDryRun(java.lang.String... items);

  public A addAllToDryRun(java.util.Collection<java.lang.String> items);

  public A removeFromDryRun(java.lang.String... items);

  public A removeAllFromDryRun(java.util.Collection<java.lang.String> items);

  public java.util.List<java.lang.String> getDryRun();

  public java.lang.String getDryRun(java.lang.Integer index);

  public java.lang.String getFirstDryRun();

  public java.lang.String getLastDryRun();

  public java.lang.String getMatchingDryRun(
      java.util.function.Predicate<java.lang.String> predicate);

  public java.lang.Boolean hasMatchingDryRun(
      java.util.function.Predicate<java.lang.String> predicate);

  public A withDryRun(java.util.List<java.lang.String> dryRun);

  public A withDryRun(java.lang.String... dryRun);

  public java.lang.Boolean hasDryRun();

  public A addNewDryRun(java.lang.String original);

  public java.lang.Long getGracePeriodSeconds();

  public A withGracePeriodSeconds(java.lang.Long gracePeriodSeconds);

  public java.lang.Boolean hasGracePeriodSeconds();

  public java.lang.String getKind();

  public A withKind(java.lang.String kind);

  public java.lang.Boolean hasKind();

  /** Method is deprecated. use withKind instead. */
  @java.lang.Deprecated
  public A withNewKind(java.lang.String original);

  public java.lang.Boolean getOrphanDependents();

  public A withOrphanDependents(java.lang.Boolean orphanDependents);

  public java.lang.Boolean hasOrphanDependents();

  /**
   * This method has been deprecated, please use method buildPreconditions instead.
   *
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public io.kubernetes.client.openapi.models.V1Preconditions getPreconditions();

  public io.kubernetes.client.openapi.models.V1Preconditions buildPreconditions();

  public A withPreconditions(io.kubernetes.client.openapi.models.V1Preconditions preconditions);

  public java.lang.Boolean hasPreconditions();

  public io.kubernetes.client.openapi.models.V1DeleteOptionsFluent.PreconditionsNested<A>
      withNewPreconditions();

  public io.kubernetes.client.openapi.models.V1DeleteOptionsFluent.PreconditionsNested<A>
      withNewPreconditionsLike(io.kubernetes.client.openapi.models.V1Preconditions item);

  public io.kubernetes.client.openapi.models.V1DeleteOptionsFluent.PreconditionsNested<A>
      editPreconditions();

  public io.kubernetes.client.openapi.models.V1DeleteOptionsFluent.PreconditionsNested<A>
      editOrNewPreconditions();

  public io.kubernetes.client.openapi.models.V1DeleteOptionsFluent.PreconditionsNested<A>
      editOrNewPreconditionsLike(io.kubernetes.client.openapi.models.V1Preconditions item);

  public java.lang.String getPropagationPolicy();

  public A withPropagationPolicy(java.lang.String propagationPolicy);

  public java.lang.Boolean hasPropagationPolicy();

  /** Method is deprecated. use withPropagationPolicy instead. */
  @java.lang.Deprecated
  public A withNewPropagationPolicy(java.lang.String original);

  public interface PreconditionsNested<N>
      extends io.kubernetes.client.fluent.Nested<N>,
          io.kubernetes.client.openapi.models.V1PreconditionsFluent<
              io.kubernetes.client.openapi.models.V1DeleteOptionsFluent.PreconditionsNested<N>> {
    public N and();

    public N endPreconditions();
  }
}
