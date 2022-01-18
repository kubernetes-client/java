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
public class V1alpha1RuntimeClassSpecFluentImpl<
        A extends io.kubernetes.client.openapi.models.V1alpha1RuntimeClassSpecFluent<A>>
    extends io.kubernetes.client.fluent.BaseFluent<A>
    implements io.kubernetes.client.openapi.models.V1alpha1RuntimeClassSpecFluent<A> {
  public V1alpha1RuntimeClassSpecFluentImpl() {}

  public V1alpha1RuntimeClassSpecFluentImpl(
      io.kubernetes.client.openapi.models.V1alpha1RuntimeClassSpec instance) {
    this.withOverhead(instance.getOverhead());

    this.withRuntimeHandler(instance.getRuntimeHandler());

    this.withScheduling(instance.getScheduling());
  }

  private io.kubernetes.client.openapi.models.V1alpha1OverheadBuilder overhead;
  private java.lang.String runtimeHandler;
  private io.kubernetes.client.openapi.models.V1alpha1SchedulingBuilder scheduling;

  /**
   * This method has been deprecated, please use method buildOverhead instead.
   *
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public io.kubernetes.client.openapi.models.V1alpha1Overhead getOverhead() {
    return this.overhead != null ? this.overhead.build() : null;
  }

  public io.kubernetes.client.openapi.models.V1alpha1Overhead buildOverhead() {
    return this.overhead != null ? this.overhead.build() : null;
  }

  public A withOverhead(io.kubernetes.client.openapi.models.V1alpha1Overhead overhead) {
    _visitables.get("overhead").remove(this.overhead);
    if (overhead != null) {
      this.overhead = new io.kubernetes.client.openapi.models.V1alpha1OverheadBuilder(overhead);
      _visitables.get("overhead").add(this.overhead);
    }
    return (A) this;
  }

  public java.lang.Boolean hasOverhead() {
    return this.overhead != null;
  }

  public io.kubernetes.client.openapi.models.V1alpha1RuntimeClassSpecFluent.OverheadNested<A>
      withNewOverhead() {
    return new io.kubernetes.client.openapi.models.V1alpha1RuntimeClassSpecFluentImpl
        .OverheadNestedImpl();
  }

  public io.kubernetes.client.openapi.models.V1alpha1RuntimeClassSpecFluent.OverheadNested<A>
      withNewOverheadLike(io.kubernetes.client.openapi.models.V1alpha1Overhead item) {
    return new io.kubernetes.client.openapi.models.V1alpha1RuntimeClassSpecFluentImpl
        .OverheadNestedImpl(item);
  }

  public io.kubernetes.client.openapi.models.V1alpha1RuntimeClassSpecFluent.OverheadNested<A>
      editOverhead() {
    return withNewOverheadLike(getOverhead());
  }

  public io.kubernetes.client.openapi.models.V1alpha1RuntimeClassSpecFluent.OverheadNested<A>
      editOrNewOverhead() {
    return withNewOverheadLike(
        getOverhead() != null
            ? getOverhead()
            : new io.kubernetes.client.openapi.models.V1alpha1OverheadBuilder().build());
  }

  public io.kubernetes.client.openapi.models.V1alpha1RuntimeClassSpecFluent.OverheadNested<A>
      editOrNewOverheadLike(io.kubernetes.client.openapi.models.V1alpha1Overhead item) {
    return withNewOverheadLike(getOverhead() != null ? getOverhead() : item);
  }

  public java.lang.String getRuntimeHandler() {
    return this.runtimeHandler;
  }

  public A withRuntimeHandler(java.lang.String runtimeHandler) {
    this.runtimeHandler = runtimeHandler;
    return (A) this;
  }

  public java.lang.Boolean hasRuntimeHandler() {
    return this.runtimeHandler != null;
  }

  /** Method is deprecated. use withRuntimeHandler instead. */
  @java.lang.Deprecated
  public A withNewRuntimeHandler(java.lang.String original) {
    return (A) withRuntimeHandler(new String(original));
  }

  /**
   * This method has been deprecated, please use method buildScheduling instead.
   *
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public io.kubernetes.client.openapi.models.V1alpha1Scheduling getScheduling() {
    return this.scheduling != null ? this.scheduling.build() : null;
  }

  public io.kubernetes.client.openapi.models.V1alpha1Scheduling buildScheduling() {
    return this.scheduling != null ? this.scheduling.build() : null;
  }

  public A withScheduling(io.kubernetes.client.openapi.models.V1alpha1Scheduling scheduling) {
    _visitables.get("scheduling").remove(this.scheduling);
    if (scheduling != null) {
      this.scheduling =
          new io.kubernetes.client.openapi.models.V1alpha1SchedulingBuilder(scheduling);
      _visitables.get("scheduling").add(this.scheduling);
    }
    return (A) this;
  }

  public java.lang.Boolean hasScheduling() {
    return this.scheduling != null;
  }

  public io.kubernetes.client.openapi.models.V1alpha1RuntimeClassSpecFluent.SchedulingNested<A>
      withNewScheduling() {
    return new io.kubernetes.client.openapi.models.V1alpha1RuntimeClassSpecFluentImpl
        .SchedulingNestedImpl();
  }

  public io.kubernetes.client.openapi.models.V1alpha1RuntimeClassSpecFluent.SchedulingNested<A>
      withNewSchedulingLike(io.kubernetes.client.openapi.models.V1alpha1Scheduling item) {
    return new io.kubernetes.client.openapi.models.V1alpha1RuntimeClassSpecFluentImpl
        .SchedulingNestedImpl(item);
  }

  public io.kubernetes.client.openapi.models.V1alpha1RuntimeClassSpecFluent.SchedulingNested<A>
      editScheduling() {
    return withNewSchedulingLike(getScheduling());
  }

  public io.kubernetes.client.openapi.models.V1alpha1RuntimeClassSpecFluent.SchedulingNested<A>
      editOrNewScheduling() {
    return withNewSchedulingLike(
        getScheduling() != null
            ? getScheduling()
            : new io.kubernetes.client.openapi.models.V1alpha1SchedulingBuilder().build());
  }

  public io.kubernetes.client.openapi.models.V1alpha1RuntimeClassSpecFluent.SchedulingNested<A>
      editOrNewSchedulingLike(io.kubernetes.client.openapi.models.V1alpha1Scheduling item) {
    return withNewSchedulingLike(getScheduling() != null ? getScheduling() : item);
  }

  public boolean equals(java.lang.Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    V1alpha1RuntimeClassSpecFluentImpl that = (V1alpha1RuntimeClassSpecFluentImpl) o;
    if (overhead != null ? !overhead.equals(that.overhead) : that.overhead != null) return false;
    if (runtimeHandler != null
        ? !runtimeHandler.equals(that.runtimeHandler)
        : that.runtimeHandler != null) return false;
    if (scheduling != null ? !scheduling.equals(that.scheduling) : that.scheduling != null)
      return false;
    return true;
  }

  public int hashCode() {
    return java.util.Objects.hash(overhead, runtimeHandler, scheduling, super.hashCode());
  }

  public class OverheadNestedImpl<N>
      extends io.kubernetes.client.openapi.models.V1alpha1OverheadFluentImpl<
          io.kubernetes.client.openapi.models.V1alpha1RuntimeClassSpecFluent.OverheadNested<N>>
      implements io.kubernetes.client.openapi.models.V1alpha1RuntimeClassSpecFluent.OverheadNested<
              N>,
          io.kubernetes.client.fluent.Nested<N> {
    OverheadNestedImpl(io.kubernetes.client.openapi.models.V1alpha1Overhead item) {
      this.builder = new io.kubernetes.client.openapi.models.V1alpha1OverheadBuilder(this, item);
    }

    OverheadNestedImpl() {
      this.builder = new io.kubernetes.client.openapi.models.V1alpha1OverheadBuilder(this);
    }

    io.kubernetes.client.openapi.models.V1alpha1OverheadBuilder builder;

    public N and() {
      return (N) V1alpha1RuntimeClassSpecFluentImpl.this.withOverhead(builder.build());
    }

    public N endOverhead() {
      return and();
    }
  }

  public class SchedulingNestedImpl<N>
      extends io.kubernetes.client.openapi.models.V1alpha1SchedulingFluentImpl<
          io.kubernetes.client.openapi.models.V1alpha1RuntimeClassSpecFluent.SchedulingNested<N>>
      implements io.kubernetes.client.openapi.models.V1alpha1RuntimeClassSpecFluent
                  .SchedulingNested<
              N>,
          io.kubernetes.client.fluent.Nested<N> {
    SchedulingNestedImpl(io.kubernetes.client.openapi.models.V1alpha1Scheduling item) {
      this.builder = new io.kubernetes.client.openapi.models.V1alpha1SchedulingBuilder(this, item);
    }

    SchedulingNestedImpl() {
      this.builder = new io.kubernetes.client.openapi.models.V1alpha1SchedulingBuilder(this);
    }

    io.kubernetes.client.openapi.models.V1alpha1SchedulingBuilder builder;

    public N and() {
      return (N) V1alpha1RuntimeClassSpecFluentImpl.this.withScheduling(builder.build());
    }

    public N endScheduling() {
      return and();
    }
  }
}
