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
public class V1LifecycleFluentImpl<
        A extends io.kubernetes.client.openapi.models.V1LifecycleFluent<A>>
    extends io.kubernetes.client.fluent.BaseFluent<A>
    implements io.kubernetes.client.openapi.models.V1LifecycleFluent<A> {
  public V1LifecycleFluentImpl() {}

  public V1LifecycleFluentImpl(io.kubernetes.client.openapi.models.V1Lifecycle instance) {
    this.withPostStart(instance.getPostStart());

    this.withPreStop(instance.getPreStop());
  }

  private io.kubernetes.client.openapi.models.V1LifecycleHandlerBuilder postStart;
  private io.kubernetes.client.openapi.models.V1LifecycleHandlerBuilder preStop;

  /**
   * This method has been deprecated, please use method buildPostStart instead.
   *
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public io.kubernetes.client.openapi.models.V1LifecycleHandler getPostStart() {
    return this.postStart != null ? this.postStart.build() : null;
  }

  public io.kubernetes.client.openapi.models.V1LifecycleHandler buildPostStart() {
    return this.postStart != null ? this.postStart.build() : null;
  }

  public A withPostStart(io.kubernetes.client.openapi.models.V1LifecycleHandler postStart) {
    _visitables.get("postStart").remove(this.postStart);
    if (postStart != null) {
      this.postStart = new io.kubernetes.client.openapi.models.V1LifecycleHandlerBuilder(postStart);
      _visitables.get("postStart").add(this.postStart);
    }
    return (A) this;
  }

  public java.lang.Boolean hasPostStart() {
    return this.postStart != null;
  }

  public io.kubernetes.client.openapi.models.V1LifecycleFluent.PostStartNested<A>
      withNewPostStart() {
    return new io.kubernetes.client.openapi.models.V1LifecycleFluentImpl.PostStartNestedImpl();
  }

  public io.kubernetes.client.openapi.models.V1LifecycleFluent.PostStartNested<A>
      withNewPostStartLike(io.kubernetes.client.openapi.models.V1LifecycleHandler item) {
    return new io.kubernetes.client.openapi.models.V1LifecycleFluentImpl.PostStartNestedImpl(item);
  }

  public io.kubernetes.client.openapi.models.V1LifecycleFluent.PostStartNested<A> editPostStart() {
    return withNewPostStartLike(getPostStart());
  }

  public io.kubernetes.client.openapi.models.V1LifecycleFluent.PostStartNested<A>
      editOrNewPostStart() {
    return withNewPostStartLike(
        getPostStart() != null
            ? getPostStart()
            : new io.kubernetes.client.openapi.models.V1LifecycleHandlerBuilder().build());
  }

  public io.kubernetes.client.openapi.models.V1LifecycleFluent.PostStartNested<A>
      editOrNewPostStartLike(io.kubernetes.client.openapi.models.V1LifecycleHandler item) {
    return withNewPostStartLike(getPostStart() != null ? getPostStart() : item);
  }

  /**
   * This method has been deprecated, please use method buildPreStop instead.
   *
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public io.kubernetes.client.openapi.models.V1LifecycleHandler getPreStop() {
    return this.preStop != null ? this.preStop.build() : null;
  }

  public io.kubernetes.client.openapi.models.V1LifecycleHandler buildPreStop() {
    return this.preStop != null ? this.preStop.build() : null;
  }

  public A withPreStop(io.kubernetes.client.openapi.models.V1LifecycleHandler preStop) {
    _visitables.get("preStop").remove(this.preStop);
    if (preStop != null) {
      this.preStop = new io.kubernetes.client.openapi.models.V1LifecycleHandlerBuilder(preStop);
      _visitables.get("preStop").add(this.preStop);
    }
    return (A) this;
  }

  public java.lang.Boolean hasPreStop() {
    return this.preStop != null;
  }

  public io.kubernetes.client.openapi.models.V1LifecycleFluent.PreStopNested<A> withNewPreStop() {
    return new io.kubernetes.client.openapi.models.V1LifecycleFluentImpl.PreStopNestedImpl();
  }

  public io.kubernetes.client.openapi.models.V1LifecycleFluent.PreStopNested<A> withNewPreStopLike(
      io.kubernetes.client.openapi.models.V1LifecycleHandler item) {
    return new io.kubernetes.client.openapi.models.V1LifecycleFluentImpl.PreStopNestedImpl(item);
  }

  public io.kubernetes.client.openapi.models.V1LifecycleFluent.PreStopNested<A> editPreStop() {
    return withNewPreStopLike(getPreStop());
  }

  public io.kubernetes.client.openapi.models.V1LifecycleFluent.PreStopNested<A> editOrNewPreStop() {
    return withNewPreStopLike(
        getPreStop() != null
            ? getPreStop()
            : new io.kubernetes.client.openapi.models.V1LifecycleHandlerBuilder().build());
  }

  public io.kubernetes.client.openapi.models.V1LifecycleFluent.PreStopNested<A>
      editOrNewPreStopLike(io.kubernetes.client.openapi.models.V1LifecycleHandler item) {
    return withNewPreStopLike(getPreStop() != null ? getPreStop() : item);
  }

  public boolean equals(java.lang.Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    V1LifecycleFluentImpl that = (V1LifecycleFluentImpl) o;
    if (postStart != null ? !postStart.equals(that.postStart) : that.postStart != null)
      return false;
    if (preStop != null ? !preStop.equals(that.preStop) : that.preStop != null) return false;
    return true;
  }

  public int hashCode() {
    return java.util.Objects.hash(postStart, preStop, super.hashCode());
  }

  public class PostStartNestedImpl<N>
      extends io.kubernetes.client.openapi.models.V1LifecycleHandlerFluentImpl<
          io.kubernetes.client.openapi.models.V1LifecycleFluent.PostStartNested<N>>
      implements io.kubernetes.client.openapi.models.V1LifecycleFluent.PostStartNested<N>,
          io.kubernetes.client.fluent.Nested<N> {
    PostStartNestedImpl(io.kubernetes.client.openapi.models.V1LifecycleHandler item) {
      this.builder = new io.kubernetes.client.openapi.models.V1LifecycleHandlerBuilder(this, item);
    }

    PostStartNestedImpl() {
      this.builder = new io.kubernetes.client.openapi.models.V1LifecycleHandlerBuilder(this);
    }

    io.kubernetes.client.openapi.models.V1LifecycleHandlerBuilder builder;

    public N and() {
      return (N) V1LifecycleFluentImpl.this.withPostStart(builder.build());
    }

    public N endPostStart() {
      return and();
    }
  }

  public class PreStopNestedImpl<N>
      extends io.kubernetes.client.openapi.models.V1LifecycleHandlerFluentImpl<
          io.kubernetes.client.openapi.models.V1LifecycleFluent.PreStopNested<N>>
      implements io.kubernetes.client.openapi.models.V1LifecycleFluent.PreStopNested<N>,
          io.kubernetes.client.fluent.Nested<N> {
    PreStopNestedImpl(io.kubernetes.client.openapi.models.V1LifecycleHandler item) {
      this.builder = new io.kubernetes.client.openapi.models.V1LifecycleHandlerBuilder(this, item);
    }

    PreStopNestedImpl() {
      this.builder = new io.kubernetes.client.openapi.models.V1LifecycleHandlerBuilder(this);
    }

    io.kubernetes.client.openapi.models.V1LifecycleHandlerBuilder builder;

    public N and() {
      return (N) V1LifecycleFluentImpl.this.withPreStop(builder.build());
    }

    public N endPreStop() {
      return and();
    }
  }
}
