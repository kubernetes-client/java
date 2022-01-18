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
public class V1ContainerStateFluentImpl<
        A extends io.kubernetes.client.openapi.models.V1ContainerStateFluent<A>>
    extends io.kubernetes.client.fluent.BaseFluent<A>
    implements io.kubernetes.client.openapi.models.V1ContainerStateFluent<A> {
  public V1ContainerStateFluentImpl() {}

  public V1ContainerStateFluentImpl(io.kubernetes.client.openapi.models.V1ContainerState instance) {
    this.withRunning(instance.getRunning());

    this.withTerminated(instance.getTerminated());

    this.withWaiting(instance.getWaiting());
  }

  private io.kubernetes.client.openapi.models.V1ContainerStateRunningBuilder running;
  private io.kubernetes.client.openapi.models.V1ContainerStateTerminatedBuilder terminated;
  private io.kubernetes.client.openapi.models.V1ContainerStateWaitingBuilder waiting;

  /**
   * This method has been deprecated, please use method buildRunning instead.
   *
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public io.kubernetes.client.openapi.models.V1ContainerStateRunning getRunning() {
    return this.running != null ? this.running.build() : null;
  }

  public io.kubernetes.client.openapi.models.V1ContainerStateRunning buildRunning() {
    return this.running != null ? this.running.build() : null;
  }

  public A withRunning(io.kubernetes.client.openapi.models.V1ContainerStateRunning running) {
    _visitables.get("running").remove(this.running);
    if (running != null) {
      this.running =
          new io.kubernetes.client.openapi.models.V1ContainerStateRunningBuilder(running);
      _visitables.get("running").add(this.running);
    }
    return (A) this;
  }

  public java.lang.Boolean hasRunning() {
    return this.running != null;
  }

  public io.kubernetes.client.openapi.models.V1ContainerStateFluent.RunningNested<A>
      withNewRunning() {
    return new io.kubernetes.client.openapi.models.V1ContainerStateFluentImpl.RunningNestedImpl();
  }

  public io.kubernetes.client.openapi.models.V1ContainerStateFluent.RunningNested<A>
      withNewRunningLike(io.kubernetes.client.openapi.models.V1ContainerStateRunning item) {
    return new io.kubernetes.client.openapi.models.V1ContainerStateFluentImpl.RunningNestedImpl(
        item);
  }

  public io.kubernetes.client.openapi.models.V1ContainerStateFluent.RunningNested<A> editRunning() {
    return withNewRunningLike(getRunning());
  }

  public io.kubernetes.client.openapi.models.V1ContainerStateFluent.RunningNested<A>
      editOrNewRunning() {
    return withNewRunningLike(
        getRunning() != null
            ? getRunning()
            : new io.kubernetes.client.openapi.models.V1ContainerStateRunningBuilder().build());
  }

  public io.kubernetes.client.openapi.models.V1ContainerStateFluent.RunningNested<A>
      editOrNewRunningLike(io.kubernetes.client.openapi.models.V1ContainerStateRunning item) {
    return withNewRunningLike(getRunning() != null ? getRunning() : item);
  }

  /**
   * This method has been deprecated, please use method buildTerminated instead.
   *
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public io.kubernetes.client.openapi.models.V1ContainerStateTerminated getTerminated() {
    return this.terminated != null ? this.terminated.build() : null;
  }

  public io.kubernetes.client.openapi.models.V1ContainerStateTerminated buildTerminated() {
    return this.terminated != null ? this.terminated.build() : null;
  }

  public A withTerminated(
      io.kubernetes.client.openapi.models.V1ContainerStateTerminated terminated) {
    _visitables.get("terminated").remove(this.terminated);
    if (terminated != null) {
      this.terminated =
          new io.kubernetes.client.openapi.models.V1ContainerStateTerminatedBuilder(terminated);
      _visitables.get("terminated").add(this.terminated);
    }
    return (A) this;
  }

  public java.lang.Boolean hasTerminated() {
    return this.terminated != null;
  }

  public io.kubernetes.client.openapi.models.V1ContainerStateFluent.TerminatedNested<A>
      withNewTerminated() {
    return new io.kubernetes.client.openapi.models.V1ContainerStateFluentImpl
        .TerminatedNestedImpl();
  }

  public io.kubernetes.client.openapi.models.V1ContainerStateFluent.TerminatedNested<A>
      withNewTerminatedLike(io.kubernetes.client.openapi.models.V1ContainerStateTerminated item) {
    return new io.kubernetes.client.openapi.models.V1ContainerStateFluentImpl.TerminatedNestedImpl(
        item);
  }

  public io.kubernetes.client.openapi.models.V1ContainerStateFluent.TerminatedNested<A>
      editTerminated() {
    return withNewTerminatedLike(getTerminated());
  }

  public io.kubernetes.client.openapi.models.V1ContainerStateFluent.TerminatedNested<A>
      editOrNewTerminated() {
    return withNewTerminatedLike(
        getTerminated() != null
            ? getTerminated()
            : new io.kubernetes.client.openapi.models.V1ContainerStateTerminatedBuilder().build());
  }

  public io.kubernetes.client.openapi.models.V1ContainerStateFluent.TerminatedNested<A>
      editOrNewTerminatedLike(io.kubernetes.client.openapi.models.V1ContainerStateTerminated item) {
    return withNewTerminatedLike(getTerminated() != null ? getTerminated() : item);
  }

  /**
   * This method has been deprecated, please use method buildWaiting instead.
   *
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public io.kubernetes.client.openapi.models.V1ContainerStateWaiting getWaiting() {
    return this.waiting != null ? this.waiting.build() : null;
  }

  public io.kubernetes.client.openapi.models.V1ContainerStateWaiting buildWaiting() {
    return this.waiting != null ? this.waiting.build() : null;
  }

  public A withWaiting(io.kubernetes.client.openapi.models.V1ContainerStateWaiting waiting) {
    _visitables.get("waiting").remove(this.waiting);
    if (waiting != null) {
      this.waiting =
          new io.kubernetes.client.openapi.models.V1ContainerStateWaitingBuilder(waiting);
      _visitables.get("waiting").add(this.waiting);
    }
    return (A) this;
  }

  public java.lang.Boolean hasWaiting() {
    return this.waiting != null;
  }

  public io.kubernetes.client.openapi.models.V1ContainerStateFluent.WaitingNested<A>
      withNewWaiting() {
    return new io.kubernetes.client.openapi.models.V1ContainerStateFluentImpl.WaitingNestedImpl();
  }

  public io.kubernetes.client.openapi.models.V1ContainerStateFluent.WaitingNested<A>
      withNewWaitingLike(io.kubernetes.client.openapi.models.V1ContainerStateWaiting item) {
    return new io.kubernetes.client.openapi.models.V1ContainerStateFluentImpl.WaitingNestedImpl(
        item);
  }

  public io.kubernetes.client.openapi.models.V1ContainerStateFluent.WaitingNested<A> editWaiting() {
    return withNewWaitingLike(getWaiting());
  }

  public io.kubernetes.client.openapi.models.V1ContainerStateFluent.WaitingNested<A>
      editOrNewWaiting() {
    return withNewWaitingLike(
        getWaiting() != null
            ? getWaiting()
            : new io.kubernetes.client.openapi.models.V1ContainerStateWaitingBuilder().build());
  }

  public io.kubernetes.client.openapi.models.V1ContainerStateFluent.WaitingNested<A>
      editOrNewWaitingLike(io.kubernetes.client.openapi.models.V1ContainerStateWaiting item) {
    return withNewWaitingLike(getWaiting() != null ? getWaiting() : item);
  }

  public boolean equals(java.lang.Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    V1ContainerStateFluentImpl that = (V1ContainerStateFluentImpl) o;
    if (running != null ? !running.equals(that.running) : that.running != null) return false;
    if (terminated != null ? !terminated.equals(that.terminated) : that.terminated != null)
      return false;
    if (waiting != null ? !waiting.equals(that.waiting) : that.waiting != null) return false;
    return true;
  }

  public int hashCode() {
    return java.util.Objects.hash(running, terminated, waiting, super.hashCode());
  }

  public class RunningNestedImpl<N>
      extends io.kubernetes.client.openapi.models.V1ContainerStateRunningFluentImpl<
          io.kubernetes.client.openapi.models.V1ContainerStateFluent.RunningNested<N>>
      implements io.kubernetes.client.openapi.models.V1ContainerStateFluent.RunningNested<N>,
          io.kubernetes.client.fluent.Nested<N> {
    RunningNestedImpl(io.kubernetes.client.openapi.models.V1ContainerStateRunning item) {
      this.builder =
          new io.kubernetes.client.openapi.models.V1ContainerStateRunningBuilder(this, item);
    }

    RunningNestedImpl() {
      this.builder = new io.kubernetes.client.openapi.models.V1ContainerStateRunningBuilder(this);
    }

    io.kubernetes.client.openapi.models.V1ContainerStateRunningBuilder builder;

    public N and() {
      return (N) V1ContainerStateFluentImpl.this.withRunning(builder.build());
    }

    public N endRunning() {
      return and();
    }
  }

  public class TerminatedNestedImpl<N>
      extends io.kubernetes.client.openapi.models.V1ContainerStateTerminatedFluentImpl<
          io.kubernetes.client.openapi.models.V1ContainerStateFluent.TerminatedNested<N>>
      implements io.kubernetes.client.openapi.models.V1ContainerStateFluent.TerminatedNested<N>,
          io.kubernetes.client.fluent.Nested<N> {
    TerminatedNestedImpl(io.kubernetes.client.openapi.models.V1ContainerStateTerminated item) {
      this.builder =
          new io.kubernetes.client.openapi.models.V1ContainerStateTerminatedBuilder(this, item);
    }

    TerminatedNestedImpl() {
      this.builder =
          new io.kubernetes.client.openapi.models.V1ContainerStateTerminatedBuilder(this);
    }

    io.kubernetes.client.openapi.models.V1ContainerStateTerminatedBuilder builder;

    public N and() {
      return (N) V1ContainerStateFluentImpl.this.withTerminated(builder.build());
    }

    public N endTerminated() {
      return and();
    }
  }

  public class WaitingNestedImpl<N>
      extends io.kubernetes.client.openapi.models.V1ContainerStateWaitingFluentImpl<
          io.kubernetes.client.openapi.models.V1ContainerStateFluent.WaitingNested<N>>
      implements io.kubernetes.client.openapi.models.V1ContainerStateFluent.WaitingNested<N>,
          io.kubernetes.client.fluent.Nested<N> {
    WaitingNestedImpl(io.kubernetes.client.openapi.models.V1ContainerStateWaiting item) {
      this.builder =
          new io.kubernetes.client.openapi.models.V1ContainerStateWaitingBuilder(this, item);
    }

    WaitingNestedImpl() {
      this.builder = new io.kubernetes.client.openapi.models.V1ContainerStateWaitingBuilder(this);
    }

    io.kubernetes.client.openapi.models.V1ContainerStateWaitingBuilder builder;

    public N and() {
      return (N) V1ContainerStateFluentImpl.this.withWaiting(builder.build());
    }

    public N endWaiting() {
      return and();
    }
  }
}
