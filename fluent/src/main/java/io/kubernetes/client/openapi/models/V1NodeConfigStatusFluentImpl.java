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
public class V1NodeConfigStatusFluentImpl<
        A extends io.kubernetes.client.openapi.models.V1NodeConfigStatusFluent<A>>
    extends io.kubernetes.client.fluent.BaseFluent<A>
    implements io.kubernetes.client.openapi.models.V1NodeConfigStatusFluent<A> {
  public V1NodeConfigStatusFluentImpl() {}

  public V1NodeConfigStatusFluentImpl(
      io.kubernetes.client.openapi.models.V1NodeConfigStatus instance) {
    this.withActive(instance.getActive());

    this.withAssigned(instance.getAssigned());

    this.withError(instance.getError());

    this.withLastKnownGood(instance.getLastKnownGood());
  }

  private io.kubernetes.client.openapi.models.V1NodeConfigSourceBuilder active;
  private io.kubernetes.client.openapi.models.V1NodeConfigSourceBuilder assigned;
  private java.lang.String error;
  private io.kubernetes.client.openapi.models.V1NodeConfigSourceBuilder lastKnownGood;

  /**
   * This method has been deprecated, please use method buildActive instead.
   *
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public io.kubernetes.client.openapi.models.V1NodeConfigSource getActive() {
    return this.active != null ? this.active.build() : null;
  }

  public io.kubernetes.client.openapi.models.V1NodeConfigSource buildActive() {
    return this.active != null ? this.active.build() : null;
  }

  public A withActive(io.kubernetes.client.openapi.models.V1NodeConfigSource active) {
    _visitables.get("active").remove(this.active);
    if (active != null) {
      this.active = new io.kubernetes.client.openapi.models.V1NodeConfigSourceBuilder(active);
      _visitables.get("active").add(this.active);
    }
    return (A) this;
  }

  public java.lang.Boolean hasActive() {
    return this.active != null;
  }

  public io.kubernetes.client.openapi.models.V1NodeConfigStatusFluent.ActiveNested<A>
      withNewActive() {
    return new io.kubernetes.client.openapi.models.V1NodeConfigStatusFluentImpl.ActiveNestedImpl();
  }

  public io.kubernetes.client.openapi.models.V1NodeConfigStatusFluent.ActiveNested<A>
      withNewActiveLike(io.kubernetes.client.openapi.models.V1NodeConfigSource item) {
    return new io.kubernetes.client.openapi.models.V1NodeConfigStatusFluentImpl.ActiveNestedImpl(
        item);
  }

  public io.kubernetes.client.openapi.models.V1NodeConfigStatusFluent.ActiveNested<A> editActive() {
    return withNewActiveLike(getActive());
  }

  public io.kubernetes.client.openapi.models.V1NodeConfigStatusFluent.ActiveNested<A>
      editOrNewActive() {
    return withNewActiveLike(
        getActive() != null
            ? getActive()
            : new io.kubernetes.client.openapi.models.V1NodeConfigSourceBuilder().build());
  }

  public io.kubernetes.client.openapi.models.V1NodeConfigStatusFluent.ActiveNested<A>
      editOrNewActiveLike(io.kubernetes.client.openapi.models.V1NodeConfigSource item) {
    return withNewActiveLike(getActive() != null ? getActive() : item);
  }

  /**
   * This method has been deprecated, please use method buildAssigned instead.
   *
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public io.kubernetes.client.openapi.models.V1NodeConfigSource getAssigned() {
    return this.assigned != null ? this.assigned.build() : null;
  }

  public io.kubernetes.client.openapi.models.V1NodeConfigSource buildAssigned() {
    return this.assigned != null ? this.assigned.build() : null;
  }

  public A withAssigned(io.kubernetes.client.openapi.models.V1NodeConfigSource assigned) {
    _visitables.get("assigned").remove(this.assigned);
    if (assigned != null) {
      this.assigned = new io.kubernetes.client.openapi.models.V1NodeConfigSourceBuilder(assigned);
      _visitables.get("assigned").add(this.assigned);
    }
    return (A) this;
  }

  public java.lang.Boolean hasAssigned() {
    return this.assigned != null;
  }

  public io.kubernetes.client.openapi.models.V1NodeConfigStatusFluent.AssignedNested<A>
      withNewAssigned() {
    return new io.kubernetes.client.openapi.models.V1NodeConfigStatusFluentImpl
        .AssignedNestedImpl();
  }

  public io.kubernetes.client.openapi.models.V1NodeConfigStatusFluent.AssignedNested<A>
      withNewAssignedLike(io.kubernetes.client.openapi.models.V1NodeConfigSource item) {
    return new io.kubernetes.client.openapi.models.V1NodeConfigStatusFluentImpl.AssignedNestedImpl(
        item);
  }

  public io.kubernetes.client.openapi.models.V1NodeConfigStatusFluent.AssignedNested<A>
      editAssigned() {
    return withNewAssignedLike(getAssigned());
  }

  public io.kubernetes.client.openapi.models.V1NodeConfigStatusFluent.AssignedNested<A>
      editOrNewAssigned() {
    return withNewAssignedLike(
        getAssigned() != null
            ? getAssigned()
            : new io.kubernetes.client.openapi.models.V1NodeConfigSourceBuilder().build());
  }

  public io.kubernetes.client.openapi.models.V1NodeConfigStatusFluent.AssignedNested<A>
      editOrNewAssignedLike(io.kubernetes.client.openapi.models.V1NodeConfigSource item) {
    return withNewAssignedLike(getAssigned() != null ? getAssigned() : item);
  }

  public java.lang.String getError() {
    return this.error;
  }

  public A withError(java.lang.String error) {
    this.error = error;
    return (A) this;
  }

  public java.lang.Boolean hasError() {
    return this.error != null;
  }

  /** Method is deprecated. use withError instead. */
  @java.lang.Deprecated
  public A withNewError(java.lang.String original) {
    return (A) withError(new String(original));
  }

  /**
   * This method has been deprecated, please use method buildLastKnownGood instead.
   *
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public io.kubernetes.client.openapi.models.V1NodeConfigSource getLastKnownGood() {
    return this.lastKnownGood != null ? this.lastKnownGood.build() : null;
  }

  public io.kubernetes.client.openapi.models.V1NodeConfigSource buildLastKnownGood() {
    return this.lastKnownGood != null ? this.lastKnownGood.build() : null;
  }

  public A withLastKnownGood(io.kubernetes.client.openapi.models.V1NodeConfigSource lastKnownGood) {
    _visitables.get("lastKnownGood").remove(this.lastKnownGood);
    if (lastKnownGood != null) {
      this.lastKnownGood =
          new io.kubernetes.client.openapi.models.V1NodeConfigSourceBuilder(lastKnownGood);
      _visitables.get("lastKnownGood").add(this.lastKnownGood);
    }
    return (A) this;
  }

  public java.lang.Boolean hasLastKnownGood() {
    return this.lastKnownGood != null;
  }

  public io.kubernetes.client.openapi.models.V1NodeConfigStatusFluent.LastKnownGoodNested<A>
      withNewLastKnownGood() {
    return new io.kubernetes.client.openapi.models.V1NodeConfigStatusFluentImpl
        .LastKnownGoodNestedImpl();
  }

  public io.kubernetes.client.openapi.models.V1NodeConfigStatusFluent.LastKnownGoodNested<A>
      withNewLastKnownGoodLike(io.kubernetes.client.openapi.models.V1NodeConfigSource item) {
    return new io.kubernetes.client.openapi.models.V1NodeConfigStatusFluentImpl
        .LastKnownGoodNestedImpl(item);
  }

  public io.kubernetes.client.openapi.models.V1NodeConfigStatusFluent.LastKnownGoodNested<A>
      editLastKnownGood() {
    return withNewLastKnownGoodLike(getLastKnownGood());
  }

  public io.kubernetes.client.openapi.models.V1NodeConfigStatusFluent.LastKnownGoodNested<A>
      editOrNewLastKnownGood() {
    return withNewLastKnownGoodLike(
        getLastKnownGood() != null
            ? getLastKnownGood()
            : new io.kubernetes.client.openapi.models.V1NodeConfigSourceBuilder().build());
  }

  public io.kubernetes.client.openapi.models.V1NodeConfigStatusFluent.LastKnownGoodNested<A>
      editOrNewLastKnownGoodLike(io.kubernetes.client.openapi.models.V1NodeConfigSource item) {
    return withNewLastKnownGoodLike(getLastKnownGood() != null ? getLastKnownGood() : item);
  }

  public boolean equals(java.lang.Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    V1NodeConfigStatusFluentImpl that = (V1NodeConfigStatusFluentImpl) o;
    if (active != null ? !active.equals(that.active) : that.active != null) return false;
    if (assigned != null ? !assigned.equals(that.assigned) : that.assigned != null) return false;
    if (error != null ? !error.equals(that.error) : that.error != null) return false;
    if (lastKnownGood != null
        ? !lastKnownGood.equals(that.lastKnownGood)
        : that.lastKnownGood != null) return false;
    return true;
  }

  public int hashCode() {
    return java.util.Objects.hash(active, assigned, error, lastKnownGood, super.hashCode());
  }

  public class ActiveNestedImpl<N>
      extends io.kubernetes.client.openapi.models.V1NodeConfigSourceFluentImpl<
          io.kubernetes.client.openapi.models.V1NodeConfigStatusFluent.ActiveNested<N>>
      implements io.kubernetes.client.openapi.models.V1NodeConfigStatusFluent.ActiveNested<N>,
          io.kubernetes.client.fluent.Nested<N> {
    ActiveNestedImpl(io.kubernetes.client.openapi.models.V1NodeConfigSource item) {
      this.builder = new io.kubernetes.client.openapi.models.V1NodeConfigSourceBuilder(this, item);
    }

    ActiveNestedImpl() {
      this.builder = new io.kubernetes.client.openapi.models.V1NodeConfigSourceBuilder(this);
    }

    io.kubernetes.client.openapi.models.V1NodeConfigSourceBuilder builder;

    public N and() {
      return (N) V1NodeConfigStatusFluentImpl.this.withActive(builder.build());
    }

    public N endActive() {
      return and();
    }
  }

  public class AssignedNestedImpl<N>
      extends io.kubernetes.client.openapi.models.V1NodeConfigSourceFluentImpl<
          io.kubernetes.client.openapi.models.V1NodeConfigStatusFluent.AssignedNested<N>>
      implements io.kubernetes.client.openapi.models.V1NodeConfigStatusFluent.AssignedNested<N>,
          io.kubernetes.client.fluent.Nested<N> {
    AssignedNestedImpl(io.kubernetes.client.openapi.models.V1NodeConfigSource item) {
      this.builder = new io.kubernetes.client.openapi.models.V1NodeConfigSourceBuilder(this, item);
    }

    AssignedNestedImpl() {
      this.builder = new io.kubernetes.client.openapi.models.V1NodeConfigSourceBuilder(this);
    }

    io.kubernetes.client.openapi.models.V1NodeConfigSourceBuilder builder;

    public N and() {
      return (N) V1NodeConfigStatusFluentImpl.this.withAssigned(builder.build());
    }

    public N endAssigned() {
      return and();
    }
  }

  public class LastKnownGoodNestedImpl<N>
      extends io.kubernetes.client.openapi.models.V1NodeConfigSourceFluentImpl<
          io.kubernetes.client.openapi.models.V1NodeConfigStatusFluent.LastKnownGoodNested<N>>
      implements io.kubernetes.client.openapi.models.V1NodeConfigStatusFluent.LastKnownGoodNested<
              N>,
          io.kubernetes.client.fluent.Nested<N> {
    LastKnownGoodNestedImpl(io.kubernetes.client.openapi.models.V1NodeConfigSource item) {
      this.builder = new io.kubernetes.client.openapi.models.V1NodeConfigSourceBuilder(this, item);
    }

    LastKnownGoodNestedImpl() {
      this.builder = new io.kubernetes.client.openapi.models.V1NodeConfigSourceBuilder(this);
    }

    io.kubernetes.client.openapi.models.V1NodeConfigSourceBuilder builder;

    public N and() {
      return (N) V1NodeConfigStatusFluentImpl.this.withLastKnownGood(builder.build());
    }

    public N endLastKnownGood() {
      return and();
    }
  }
}
