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

import io.kubernetes.client.fluent.BaseFluent;
import io.kubernetes.client.fluent.Nested;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.function.Predicate;

/** Generated */
@SuppressWarnings(value = "unchecked")
public class V1DeleteOptionsFluentImpl<A extends V1DeleteOptionsFluent<A>> extends BaseFluent<A>
    implements V1DeleteOptionsFluent<A> {
  public V1DeleteOptionsFluentImpl() {}

  public V1DeleteOptionsFluentImpl(io.kubernetes.client.openapi.models.V1DeleteOptions instance) {
    this.withApiVersion(instance.getApiVersion());

    this.withDryRun(instance.getDryRun());

    this.withGracePeriodSeconds(instance.getGracePeriodSeconds());

    this.withKind(instance.getKind());

    this.withOrphanDependents(instance.getOrphanDependents());

    this.withPreconditions(instance.getPreconditions());

    this.withPropagationPolicy(instance.getPropagationPolicy());
  }

  private String apiVersion;
  private List<java.lang.String> dryRun;
  private Long gracePeriodSeconds;
  private java.lang.String kind;
  private Boolean orphanDependents;
  private V1PreconditionsBuilder preconditions;
  private java.lang.String propagationPolicy;

  public java.lang.String getApiVersion() {
    return this.apiVersion;
  }

  public A withApiVersion(java.lang.String apiVersion) {
    this.apiVersion = apiVersion;
    return (A) this;
  }

  public java.lang.Boolean hasApiVersion() {
    return this.apiVersion != null;
  }

  public A addToDryRun(Integer index, java.lang.String item) {
    if (this.dryRun == null) {
      this.dryRun = new ArrayList<java.lang.String>();
    }
    this.dryRun.add(index, item);
    return (A) this;
  }

  public A setToDryRun(java.lang.Integer index, java.lang.String item) {
    if (this.dryRun == null) {
      this.dryRun = new java.util.ArrayList<java.lang.String>();
    }
    this.dryRun.set(index, item);
    return (A) this;
  }

  public A addToDryRun(java.lang.String... items) {
    if (this.dryRun == null) {
      this.dryRun = new java.util.ArrayList<java.lang.String>();
    }
    for (java.lang.String item : items) {
      this.dryRun.add(item);
    }
    return (A) this;
  }

  public A addAllToDryRun(Collection<java.lang.String> items) {
    if (this.dryRun == null) {
      this.dryRun = new java.util.ArrayList<java.lang.String>();
    }
    for (java.lang.String item : items) {
      this.dryRun.add(item);
    }
    return (A) this;
  }

  public A removeFromDryRun(java.lang.String... items) {
    for (java.lang.String item : items) {
      if (this.dryRun != null) {
        this.dryRun.remove(item);
      }
    }
    return (A) this;
  }

  public A removeAllFromDryRun(java.util.Collection<java.lang.String> items) {
    for (java.lang.String item : items) {
      if (this.dryRun != null) {
        this.dryRun.remove(item);
      }
    }
    return (A) this;
  }

  public java.util.List<java.lang.String> getDryRun() {
    return this.dryRun;
  }

  public java.lang.String getDryRun(java.lang.Integer index) {
    return this.dryRun.get(index);
  }

  public java.lang.String getFirstDryRun() {
    return this.dryRun.get(0);
  }

  public java.lang.String getLastDryRun() {
    return this.dryRun.get(dryRun.size() - 1);
  }

  public java.lang.String getMatchingDryRun(Predicate<java.lang.String> predicate) {
    for (java.lang.String item : dryRun) {
      if (predicate.test(item)) {
        return item;
      }
    }
    return null;
  }

  public java.lang.Boolean hasMatchingDryRun(
      java.util.function.Predicate<java.lang.String> predicate) {
    for (java.lang.String item : dryRun) {
      if (predicate.test(item)) {
        return true;
      }
    }
    return false;
  }

  public A withDryRun(java.util.List<java.lang.String> dryRun) {
    if (dryRun != null) {
      this.dryRun = new java.util.ArrayList();
      for (java.lang.String item : dryRun) {
        this.addToDryRun(item);
      }
    } else {
      this.dryRun = null;
    }
    return (A) this;
  }

  public A withDryRun(java.lang.String... dryRun) {
    if (this.dryRun != null) {
      this.dryRun.clear();
    }
    if (dryRun != null) {
      for (java.lang.String item : dryRun) {
        this.addToDryRun(item);
      }
    }
    return (A) this;
  }

  public java.lang.Boolean hasDryRun() {
    return dryRun != null && !dryRun.isEmpty();
  }

  public java.lang.Long getGracePeriodSeconds() {
    return this.gracePeriodSeconds;
  }

  public A withGracePeriodSeconds(java.lang.Long gracePeriodSeconds) {
    this.gracePeriodSeconds = gracePeriodSeconds;
    return (A) this;
  }

  public java.lang.Boolean hasGracePeriodSeconds() {
    return this.gracePeriodSeconds != null;
  }

  public java.lang.String getKind() {
    return this.kind;
  }

  public A withKind(java.lang.String kind) {
    this.kind = kind;
    return (A) this;
  }

  public java.lang.Boolean hasKind() {
    return this.kind != null;
  }

  public java.lang.Boolean getOrphanDependents() {
    return this.orphanDependents;
  }

  public A withOrphanDependents(java.lang.Boolean orphanDependents) {
    this.orphanDependents = orphanDependents;
    return (A) this;
  }

  public java.lang.Boolean hasOrphanDependents() {
    return this.orphanDependents != null;
  }

  /**
   * This method has been deprecated, please use method buildPreconditions instead.
   *
   * @return The buildable object.
   */
  @Deprecated
  public V1Preconditions getPreconditions() {
    return this.preconditions != null ? this.preconditions.build() : null;
  }

  public io.kubernetes.client.openapi.models.V1Preconditions buildPreconditions() {
    return this.preconditions != null ? this.preconditions.build() : null;
  }

  public A withPreconditions(io.kubernetes.client.openapi.models.V1Preconditions preconditions) {
    _visitables.get("preconditions").remove(this.preconditions);
    if (preconditions != null) {
      this.preconditions =
          new io.kubernetes.client.openapi.models.V1PreconditionsBuilder(preconditions);
      _visitables.get("preconditions").add(this.preconditions);
    }
    return (A) this;
  }

  public java.lang.Boolean hasPreconditions() {
    return this.preconditions != null;
  }

  public V1DeleteOptionsFluent.PreconditionsNested<A> withNewPreconditions() {
    return new V1DeleteOptionsFluentImpl.PreconditionsNestedImpl();
  }

  public io.kubernetes.client.openapi.models.V1DeleteOptionsFluent.PreconditionsNested<A>
      withNewPreconditionsLike(io.kubernetes.client.openapi.models.V1Preconditions item) {
    return new V1DeleteOptionsFluentImpl.PreconditionsNestedImpl(item);
  }

  public io.kubernetes.client.openapi.models.V1DeleteOptionsFluent.PreconditionsNested<A>
      editPreconditions() {
    return withNewPreconditionsLike(getPreconditions());
  }

  public io.kubernetes.client.openapi.models.V1DeleteOptionsFluent.PreconditionsNested<A>
      editOrNewPreconditions() {
    return withNewPreconditionsLike(
        getPreconditions() != null
            ? getPreconditions()
            : new io.kubernetes.client.openapi.models.V1PreconditionsBuilder().build());
  }

  public io.kubernetes.client.openapi.models.V1DeleteOptionsFluent.PreconditionsNested<A>
      editOrNewPreconditionsLike(io.kubernetes.client.openapi.models.V1Preconditions item) {
    return withNewPreconditionsLike(getPreconditions() != null ? getPreconditions() : item);
  }

  public java.lang.String getPropagationPolicy() {
    return this.propagationPolicy;
  }

  public A withPropagationPolicy(java.lang.String propagationPolicy) {
    this.propagationPolicy = propagationPolicy;
    return (A) this;
  }

  public java.lang.Boolean hasPropagationPolicy() {
    return this.propagationPolicy != null;
  }

  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    V1DeleteOptionsFluentImpl that = (V1DeleteOptionsFluentImpl) o;
    if (apiVersion != null ? !apiVersion.equals(that.apiVersion) : that.apiVersion != null)
      return false;
    if (dryRun != null ? !dryRun.equals(that.dryRun) : that.dryRun != null) return false;
    if (gracePeriodSeconds != null
        ? !gracePeriodSeconds.equals(that.gracePeriodSeconds)
        : that.gracePeriodSeconds != null) return false;
    if (kind != null ? !kind.equals(that.kind) : that.kind != null) return false;
    if (orphanDependents != null
        ? !orphanDependents.equals(that.orphanDependents)
        : that.orphanDependents != null) return false;
    if (preconditions != null
        ? !preconditions.equals(that.preconditions)
        : that.preconditions != null) return false;
    if (propagationPolicy != null
        ? !propagationPolicy.equals(that.propagationPolicy)
        : that.propagationPolicy != null) return false;
    return true;
  }

  public int hashCode() {
    return java.util.Objects.hash(
        apiVersion,
        dryRun,
        gracePeriodSeconds,
        kind,
        orphanDependents,
        preconditions,
        propagationPolicy,
        super.hashCode());
  }

  public java.lang.String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (apiVersion != null) {
      sb.append("apiVersion:");
      sb.append(apiVersion + ",");
    }
    if (dryRun != null && !dryRun.isEmpty()) {
      sb.append("dryRun:");
      sb.append(dryRun + ",");
    }
    if (gracePeriodSeconds != null) {
      sb.append("gracePeriodSeconds:");
      sb.append(gracePeriodSeconds + ",");
    }
    if (kind != null) {
      sb.append("kind:");
      sb.append(kind + ",");
    }
    if (orphanDependents != null) {
      sb.append("orphanDependents:");
      sb.append(orphanDependents + ",");
    }
    if (preconditions != null) {
      sb.append("preconditions:");
      sb.append(preconditions + ",");
    }
    if (propagationPolicy != null) {
      sb.append("propagationPolicy:");
      sb.append(propagationPolicy);
    }
    sb.append("}");
    return sb.toString();
  }

  public A withOrphanDependents() {
    return withOrphanDependents(true);
  }

  class PreconditionsNestedImpl<N>
      extends V1PreconditionsFluentImpl<V1DeleteOptionsFluent.PreconditionsNested<N>>
      implements io.kubernetes.client.openapi.models.V1DeleteOptionsFluent.PreconditionsNested<N>,
          Nested<N> {
    PreconditionsNestedImpl(io.kubernetes.client.openapi.models.V1Preconditions item) {
      this.builder = new V1PreconditionsBuilder(this, item);
    }

    PreconditionsNestedImpl() {
      this.builder = new io.kubernetes.client.openapi.models.V1PreconditionsBuilder(this);
    }

    io.kubernetes.client.openapi.models.V1PreconditionsBuilder builder;

    public N and() {
      return (N) V1DeleteOptionsFluentImpl.this.withPreconditions(builder.build());
    }

    public N endPreconditions() {
      return and();
    }
  }
}
