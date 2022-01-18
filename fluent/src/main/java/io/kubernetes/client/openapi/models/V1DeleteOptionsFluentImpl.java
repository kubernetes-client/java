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
public class V1DeleteOptionsFluentImpl<
        A extends io.kubernetes.client.openapi.models.V1DeleteOptionsFluent<A>>
    extends io.kubernetes.client.fluent.BaseFluent<A>
    implements io.kubernetes.client.openapi.models.V1DeleteOptionsFluent<A> {
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

  private java.lang.String apiVersion;
  private java.util.List<java.lang.String> dryRun;
  private java.lang.Long gracePeriodSeconds;
  private java.lang.String kind;
  private java.lang.Boolean orphanDependents;
  private io.kubernetes.client.openapi.models.V1PreconditionsBuilder preconditions;
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

  /** Method is deprecated. use withApiVersion instead. */
  @java.lang.Deprecated
  public A withNewApiVersion(java.lang.String original) {
    return (A) withApiVersion(new String(original));
  }

  public A addToDryRun(java.lang.Integer index, java.lang.String item) {
    if (this.dryRun == null) {
      this.dryRun = new java.util.ArrayList<java.lang.String>();
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

  public A addAllToDryRun(java.util.Collection<java.lang.String> items) {
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

  public java.lang.String getMatchingDryRun(
      java.util.function.Predicate<java.lang.String> predicate) {
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

  public A addNewDryRun(java.lang.String original) {
    return (A) addToDryRun(new String(original));
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

  /** Method is deprecated. use withKind instead. */
  @java.lang.Deprecated
  public A withNewKind(java.lang.String original) {
    return (A) withKind(new String(original));
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
  @java.lang.Deprecated
  public io.kubernetes.client.openapi.models.V1Preconditions getPreconditions() {
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

  public io.kubernetes.client.openapi.models.V1DeleteOptionsFluent.PreconditionsNested<A>
      withNewPreconditions() {
    return new io.kubernetes.client.openapi.models.V1DeleteOptionsFluentImpl
        .PreconditionsNestedImpl();
  }

  public io.kubernetes.client.openapi.models.V1DeleteOptionsFluent.PreconditionsNested<A>
      withNewPreconditionsLike(io.kubernetes.client.openapi.models.V1Preconditions item) {
    return new io.kubernetes.client.openapi.models.V1DeleteOptionsFluentImpl
        .PreconditionsNestedImpl(item);
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

  /** Method is deprecated. use withPropagationPolicy instead. */
  @java.lang.Deprecated
  public A withNewPropagationPolicy(java.lang.String original) {
    return (A) withPropagationPolicy(new String(original));
  }

  public boolean equals(java.lang.Object o) {
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

  public class PreconditionsNestedImpl<N>
      extends io.kubernetes.client.openapi.models.V1PreconditionsFluentImpl<
          io.kubernetes.client.openapi.models.V1DeleteOptionsFluent.PreconditionsNested<N>>
      implements io.kubernetes.client.openapi.models.V1DeleteOptionsFluent.PreconditionsNested<N>,
          io.kubernetes.client.fluent.Nested<N> {
    PreconditionsNestedImpl(io.kubernetes.client.openapi.models.V1Preconditions item) {
      this.builder = new io.kubernetes.client.openapi.models.V1PreconditionsBuilder(this, item);
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
