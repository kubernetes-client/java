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

/** Generated */
@SuppressWarnings(value = "unchecked")
public class V1ContainerStatusFluentImpl<A extends V1ContainerStatusFluent<A>> extends BaseFluent<A>
    implements V1ContainerStatusFluent<A> {
  public V1ContainerStatusFluentImpl() {}

  public V1ContainerStatusFluentImpl(
      io.kubernetes.client.openapi.models.V1ContainerStatus instance) {
    this.withContainerID(instance.getContainerID());

    this.withImage(instance.getImage());

    this.withImageID(instance.getImageID());

    this.withLastState(instance.getLastState());

    this.withName(instance.getName());

    this.withReady(instance.getReady());

    this.withRestartCount(instance.getRestartCount());

    this.withStarted(instance.getStarted());

    this.withState(instance.getState());
  }

  private String containerID;
  private java.lang.String image;
  private java.lang.String imageID;
  private V1ContainerStateBuilder lastState;
  private java.lang.String name;
  private Boolean ready;
  private Integer restartCount;
  private java.lang.Boolean started;
  private V1ContainerStateBuilder state;

  public java.lang.String getContainerID() {
    return this.containerID;
  }

  public A withContainerID(java.lang.String containerID) {
    this.containerID = containerID;
    return (A) this;
  }

  public java.lang.Boolean hasContainerID() {
    return this.containerID != null;
  }

  public java.lang.String getImage() {
    return this.image;
  }

  public A withImage(java.lang.String image) {
    this.image = image;
    return (A) this;
  }

  public java.lang.Boolean hasImage() {
    return this.image != null;
  }

  public java.lang.String getImageID() {
    return this.imageID;
  }

  public A withImageID(java.lang.String imageID) {
    this.imageID = imageID;
    return (A) this;
  }

  public java.lang.Boolean hasImageID() {
    return this.imageID != null;
  }

  /**
   * This method has been deprecated, please use method buildLastState instead.
   *
   * @return The buildable object.
   */
  @Deprecated
  public io.kubernetes.client.openapi.models.V1ContainerState getLastState() {
    return this.lastState != null ? this.lastState.build() : null;
  }

  public io.kubernetes.client.openapi.models.V1ContainerState buildLastState() {
    return this.lastState != null ? this.lastState.build() : null;
  }

  public A withLastState(io.kubernetes.client.openapi.models.V1ContainerState lastState) {
    _visitables.get("lastState").remove(this.lastState);
    if (lastState != null) {
      this.lastState = new io.kubernetes.client.openapi.models.V1ContainerStateBuilder(lastState);
      _visitables.get("lastState").add(this.lastState);
    }
    return (A) this;
  }

  public java.lang.Boolean hasLastState() {
    return this.lastState != null;
  }

  public V1ContainerStatusFluent.LastStateNested<A> withNewLastState() {
    return new V1ContainerStatusFluentImpl.LastStateNestedImpl();
  }

  public io.kubernetes.client.openapi.models.V1ContainerStatusFluent.LastStateNested<A>
      withNewLastStateLike(io.kubernetes.client.openapi.models.V1ContainerState item) {
    return new V1ContainerStatusFluentImpl.LastStateNestedImpl(item);
  }

  public io.kubernetes.client.openapi.models.V1ContainerStatusFluent.LastStateNested<A>
      editLastState() {
    return withNewLastStateLike(getLastState());
  }

  public io.kubernetes.client.openapi.models.V1ContainerStatusFluent.LastStateNested<A>
      editOrNewLastState() {
    return withNewLastStateLike(
        getLastState() != null
            ? getLastState()
            : new io.kubernetes.client.openapi.models.V1ContainerStateBuilder().build());
  }

  public io.kubernetes.client.openapi.models.V1ContainerStatusFluent.LastStateNested<A>
      editOrNewLastStateLike(io.kubernetes.client.openapi.models.V1ContainerState item) {
    return withNewLastStateLike(getLastState() != null ? getLastState() : item);
  }

  public java.lang.String getName() {
    return this.name;
  }

  public A withName(java.lang.String name) {
    this.name = name;
    return (A) this;
  }

  public java.lang.Boolean hasName() {
    return this.name != null;
  }

  public java.lang.Boolean getReady() {
    return this.ready;
  }

  public A withReady(java.lang.Boolean ready) {
    this.ready = ready;
    return (A) this;
  }

  public java.lang.Boolean hasReady() {
    return this.ready != null;
  }

  public java.lang.Integer getRestartCount() {
    return this.restartCount;
  }

  public A withRestartCount(java.lang.Integer restartCount) {
    this.restartCount = restartCount;
    return (A) this;
  }

  public java.lang.Boolean hasRestartCount() {
    return this.restartCount != null;
  }

  public java.lang.Boolean getStarted() {
    return this.started;
  }

  public A withStarted(java.lang.Boolean started) {
    this.started = started;
    return (A) this;
  }

  public java.lang.Boolean hasStarted() {
    return this.started != null;
  }

  /**
   * This method has been deprecated, please use method buildState instead.
   *
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public io.kubernetes.client.openapi.models.V1ContainerState getState() {
    return this.state != null ? this.state.build() : null;
  }

  public io.kubernetes.client.openapi.models.V1ContainerState buildState() {
    return this.state != null ? this.state.build() : null;
  }

  public A withState(io.kubernetes.client.openapi.models.V1ContainerState state) {
    _visitables.get("state").remove(this.state);
    if (state != null) {
      this.state = new io.kubernetes.client.openapi.models.V1ContainerStateBuilder(state);
      _visitables.get("state").add(this.state);
    }
    return (A) this;
  }

  public java.lang.Boolean hasState() {
    return this.state != null;
  }

  public V1ContainerStatusFluent.StateNested<A> withNewState() {
    return new V1ContainerStatusFluentImpl.StateNestedImpl();
  }

  public io.kubernetes.client.openapi.models.V1ContainerStatusFluent.StateNested<A>
      withNewStateLike(io.kubernetes.client.openapi.models.V1ContainerState item) {
    return new io.kubernetes.client.openapi.models.V1ContainerStatusFluentImpl.StateNestedImpl(
        item);
  }

  public io.kubernetes.client.openapi.models.V1ContainerStatusFluent.StateNested<A> editState() {
    return withNewStateLike(getState());
  }

  public io.kubernetes.client.openapi.models.V1ContainerStatusFluent.StateNested<A>
      editOrNewState() {
    return withNewStateLike(
        getState() != null
            ? getState()
            : new io.kubernetes.client.openapi.models.V1ContainerStateBuilder().build());
  }

  public io.kubernetes.client.openapi.models.V1ContainerStatusFluent.StateNested<A>
      editOrNewStateLike(io.kubernetes.client.openapi.models.V1ContainerState item) {
    return withNewStateLike(getState() != null ? getState() : item);
  }

  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    V1ContainerStatusFluentImpl that = (V1ContainerStatusFluentImpl) o;
    if (containerID != null ? !containerID.equals(that.containerID) : that.containerID != null)
      return false;
    if (image != null ? !image.equals(that.image) : that.image != null) return false;
    if (imageID != null ? !imageID.equals(that.imageID) : that.imageID != null) return false;
    if (lastState != null ? !lastState.equals(that.lastState) : that.lastState != null)
      return false;
    if (name != null ? !name.equals(that.name) : that.name != null) return false;
    if (ready != null ? !ready.equals(that.ready) : that.ready != null) return false;
    if (restartCount != null ? !restartCount.equals(that.restartCount) : that.restartCount != null)
      return false;
    if (started != null ? !started.equals(that.started) : that.started != null) return false;
    if (state != null ? !state.equals(that.state) : that.state != null) return false;
    return true;
  }

  public int hashCode() {
    return java.util.Objects.hash(
        containerID,
        image,
        imageID,
        lastState,
        name,
        ready,
        restartCount,
        started,
        state,
        super.hashCode());
  }

  public java.lang.String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (containerID != null) {
      sb.append("containerID:");
      sb.append(containerID + ",");
    }
    if (image != null) {
      sb.append("image:");
      sb.append(image + ",");
    }
    if (imageID != null) {
      sb.append("imageID:");
      sb.append(imageID + ",");
    }
    if (lastState != null) {
      sb.append("lastState:");
      sb.append(lastState + ",");
    }
    if (name != null) {
      sb.append("name:");
      sb.append(name + ",");
    }
    if (ready != null) {
      sb.append("ready:");
      sb.append(ready + ",");
    }
    if (restartCount != null) {
      sb.append("restartCount:");
      sb.append(restartCount + ",");
    }
    if (started != null) {
      sb.append("started:");
      sb.append(started + ",");
    }
    if (state != null) {
      sb.append("state:");
      sb.append(state);
    }
    sb.append("}");
    return sb.toString();
  }

  public A withReady() {
    return withReady(true);
  }

  public A withStarted() {
    return withStarted(true);
  }

  class LastStateNestedImpl<N>
      extends V1ContainerStateFluentImpl<V1ContainerStatusFluent.LastStateNested<N>>
      implements io.kubernetes.client.openapi.models.V1ContainerStatusFluent.LastStateNested<N>,
          Nested<N> {
    LastStateNestedImpl(io.kubernetes.client.openapi.models.V1ContainerState item) {
      this.builder = new V1ContainerStateBuilder(this, item);
    }

    LastStateNestedImpl() {
      this.builder = new io.kubernetes.client.openapi.models.V1ContainerStateBuilder(this);
    }

    io.kubernetes.client.openapi.models.V1ContainerStateBuilder builder;

    public N and() {
      return (N) V1ContainerStatusFluentImpl.this.withLastState(builder.build());
    }

    public N endLastState() {
      return and();
    }
  }

  class StateNestedImpl<N>
      extends V1ContainerStateFluentImpl<V1ContainerStatusFluent.StateNested<N>>
      implements io.kubernetes.client.openapi.models.V1ContainerStatusFluent.StateNested<N>,
          io.kubernetes.client.fluent.Nested<N> {
    StateNestedImpl(io.kubernetes.client.openapi.models.V1ContainerState item) {
      this.builder = new V1ContainerStateBuilder(this, item);
    }

    StateNestedImpl() {
      this.builder = new io.kubernetes.client.openapi.models.V1ContainerStateBuilder(this);
    }

    io.kubernetes.client.openapi.models.V1ContainerStateBuilder builder;

    public N and() {
      return (N) V1ContainerStatusFluentImpl.this.withState(builder.build());
    }

    public N endState() {
      return and();
    }
  }
}
