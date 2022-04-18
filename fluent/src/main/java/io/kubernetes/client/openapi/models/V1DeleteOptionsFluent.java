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
public interface V1DeleteOptionsFluent<A extends V1DeleteOptionsFluent<A>> extends Fluent<A> {
  public String getApiVersion();

  public A withApiVersion(java.lang.String apiVersion);

  public Boolean hasApiVersion();

  public A addToDryRun(Integer index, java.lang.String item);

  public A setToDryRun(java.lang.Integer index, java.lang.String item);

  public A addToDryRun(java.lang.String... items);

  public A addAllToDryRun(Collection<java.lang.String> items);

  public A removeFromDryRun(java.lang.String... items);

  public A removeAllFromDryRun(java.util.Collection<java.lang.String> items);

  public List<java.lang.String> getDryRun();

  public java.lang.String getDryRun(java.lang.Integer index);

  public java.lang.String getFirstDryRun();

  public java.lang.String getLastDryRun();

  public java.lang.String getMatchingDryRun(Predicate<java.lang.String> predicate);

  public java.lang.Boolean hasMatchingDryRun(
      java.util.function.Predicate<java.lang.String> predicate);

  public A withDryRun(java.util.List<java.lang.String> dryRun);

  public A withDryRun(java.lang.String... dryRun);

  public java.lang.Boolean hasDryRun();

  public Long getGracePeriodSeconds();

  public A withGracePeriodSeconds(java.lang.Long gracePeriodSeconds);

  public java.lang.Boolean hasGracePeriodSeconds();

  public java.lang.String getKind();

  public A withKind(java.lang.String kind);

  public java.lang.Boolean hasKind();

  public java.lang.Boolean getOrphanDependents();

  public A withOrphanDependents(java.lang.Boolean orphanDependents);

  public java.lang.Boolean hasOrphanDependents();

  /**
   * This method has been deprecated, please use method buildPreconditions instead.
   *
   * @return The buildable object.
   */
  @Deprecated
  public V1Preconditions getPreconditions();

  public io.kubernetes.client.openapi.models.V1Preconditions buildPreconditions();

  public A withPreconditions(io.kubernetes.client.openapi.models.V1Preconditions preconditions);

  public java.lang.Boolean hasPreconditions();

  public V1DeleteOptionsFluent.PreconditionsNested<A> withNewPreconditions();

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

  public A withOrphanDependents();

  public interface PreconditionsNested<N>
      extends Nested<N>, V1PreconditionsFluent<V1DeleteOptionsFluent.PreconditionsNested<N>> {
    public N and();

    public N endPreconditions();
  }
}
