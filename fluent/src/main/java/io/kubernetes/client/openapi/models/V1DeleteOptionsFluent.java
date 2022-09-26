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

  public A withApiVersion(String apiVersion);

  public Boolean hasApiVersion();

  public A addToDryRun(Integer index, String item);

  public A setToDryRun(Integer index, String item);

  public A addToDryRun(java.lang.String... items);

  public A addAllToDryRun(Collection<String> items);

  public A removeFromDryRun(java.lang.String... items);

  public A removeAllFromDryRun(Collection<String> items);

  public List<String> getDryRun();

  public String getDryRun(Integer index);

  public String getFirstDryRun();

  public String getLastDryRun();

  public String getMatchingDryRun(Predicate<String> predicate);

  public Boolean hasMatchingDryRun(Predicate<String> predicate);

  public A withDryRun(List<String> dryRun);

  public A withDryRun(java.lang.String... dryRun);

  public Boolean hasDryRun();

  public Long getGracePeriodSeconds();

  public A withGracePeriodSeconds(Long gracePeriodSeconds);

  public Boolean hasGracePeriodSeconds();

  public String getKind();

  public A withKind(String kind);

  public Boolean hasKind();

  public Boolean getOrphanDependents();

  public A withOrphanDependents(Boolean orphanDependents);

  public Boolean hasOrphanDependents();

  /**
   * This method has been deprecated, please use method buildPreconditions instead.
   *
   * @return The buildable object.
   */
  @Deprecated
  public V1Preconditions getPreconditions();

  public V1Preconditions buildPreconditions();

  public A withPreconditions(V1Preconditions preconditions);

  public Boolean hasPreconditions();

  public V1DeleteOptionsFluent.PreconditionsNested<A> withNewPreconditions();

  public V1DeleteOptionsFluent.PreconditionsNested<A> withNewPreconditionsLike(
      V1Preconditions item);

  public V1DeleteOptionsFluent.PreconditionsNested<A> editPreconditions();

  public V1DeleteOptionsFluent.PreconditionsNested<A> editOrNewPreconditions();

  public V1DeleteOptionsFluent.PreconditionsNested<A> editOrNewPreconditionsLike(
      V1Preconditions item);

  public String getPropagationPolicy();

  public A withPropagationPolicy(String propagationPolicy);

  public Boolean hasPropagationPolicy();

  public A withOrphanDependents();

  public interface PreconditionsNested<N>
      extends Nested<N>, V1PreconditionsFluent<V1DeleteOptionsFluent.PreconditionsNested<N>> {
    public N and();

    public N endPreconditions();
  }
}
