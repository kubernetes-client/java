package io.kubernetes.client.openapi.models;

import java.lang.SuppressWarnings;
import io.kubernetes.client.fluent.Nested;
import java.lang.String;
import java.lang.Integer;
import java.lang.Deprecated;
import io.kubernetes.client.fluent.BaseFluent;
import java.lang.Object;
import java.lang.Boolean;

 /**
  * Generated
  */
  @SuppressWarnings(value = "unchecked")
  public class V1ContainerStatusFluentImpl<A extends V1ContainerStatusFluent<A>> extends BaseFluent<A> implements V1ContainerStatusFluent<A>{
  public V1ContainerStatusFluentImpl() {
  }
  public V1ContainerStatusFluentImpl(V1ContainerStatus instance) {
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
  private String image;
  private String imageID;
  private V1ContainerStateBuilder lastState;
  private String name;
  private Boolean ready;
  private Integer restartCount;
  private Boolean started;
  private V1ContainerStateBuilder state;
  public String getContainerID() {
    return this.containerID;
  }
  public A withContainerID(String containerID) {
    this.containerID=containerID; return (A) this;
  }
  public Boolean hasContainerID() {
    return this.containerID != null;
  }
  public String getImage() {
    return this.image;
  }
  public A withImage(String image) {
    this.image=image; return (A) this;
  }
  public Boolean hasImage() {
    return this.image != null;
  }
  public String getImageID() {
    return this.imageID;
  }
  public A withImageID(String imageID) {
    this.imageID=imageID; return (A) this;
  }
  public Boolean hasImageID() {
    return this.imageID != null;
  }
  
  /**
   * This method has been deprecated, please use method buildLastState instead.
   * @return The buildable object.
   */
  @Deprecated
  public V1ContainerState getLastState() {
    return this.lastState!=null ?this.lastState.build():null;
  }
  public V1ContainerState buildLastState() {
    return this.lastState!=null ?this.lastState.build():null;
  }
  public A withLastState(V1ContainerState lastState) {
    _visitables.get("lastState").remove(this.lastState);
    if (lastState!=null){ this.lastState= new V1ContainerStateBuilder(lastState); _visitables.get("lastState").add(this.lastState);} else { this.lastState = null; _visitables.get("lastState").remove(this.lastState); } return (A) this;
  }
  public Boolean hasLastState() {
    return this.lastState != null;
  }
  public V1ContainerStatusFluent.LastStateNested<A> withNewLastState() {
    return new V1ContainerStatusFluentImpl.LastStateNestedImpl();
  }
  public V1ContainerStatusFluent.LastStateNested<A> withNewLastStateLike(V1ContainerState item) {
    return new V1ContainerStatusFluentImpl.LastStateNestedImpl(item);
  }
  public V1ContainerStatusFluent.LastStateNested<A> editLastState() {
    return withNewLastStateLike(getLastState());
  }
  public V1ContainerStatusFluent.LastStateNested<A> editOrNewLastState() {
    return withNewLastStateLike(getLastState() != null ? getLastState(): new V1ContainerStateBuilder().build());
  }
  public V1ContainerStatusFluent.LastStateNested<A> editOrNewLastStateLike(V1ContainerState item) {
    return withNewLastStateLike(getLastState() != null ? getLastState(): item);
  }
  public String getName() {
    return this.name;
  }
  public A withName(String name) {
    this.name=name; return (A) this;
  }
  public Boolean hasName() {
    return this.name != null;
  }
  public Boolean getReady() {
    return this.ready;
  }
  public A withReady(Boolean ready) {
    this.ready=ready; return (A) this;
  }
  public Boolean hasReady() {
    return this.ready != null;
  }
  public Integer getRestartCount() {
    return this.restartCount;
  }
  public A withRestartCount(Integer restartCount) {
    this.restartCount=restartCount; return (A) this;
  }
  public Boolean hasRestartCount() {
    return this.restartCount != null;
  }
  public Boolean getStarted() {
    return this.started;
  }
  public A withStarted(Boolean started) {
    this.started=started; return (A) this;
  }
  public Boolean hasStarted() {
    return this.started != null;
  }
  
  /**
   * This method has been deprecated, please use method buildState instead.
   * @return The buildable object.
   */
  @Deprecated
  public V1ContainerState getState() {
    return this.state!=null ?this.state.build():null;
  }
  public V1ContainerState buildState() {
    return this.state!=null ?this.state.build():null;
  }
  public A withState(V1ContainerState state) {
    _visitables.get("state").remove(this.state);
    if (state!=null){ this.state= new V1ContainerStateBuilder(state); _visitables.get("state").add(this.state);} else { this.state = null; _visitables.get("state").remove(this.state); } return (A) this;
  }
  public Boolean hasState() {
    return this.state != null;
  }
  public V1ContainerStatusFluent.StateNested<A> withNewState() {
    return new V1ContainerStatusFluentImpl.StateNestedImpl();
  }
  public V1ContainerStatusFluent.StateNested<A> withNewStateLike(V1ContainerState item) {
    return new V1ContainerStatusFluentImpl.StateNestedImpl(item);
  }
  public V1ContainerStatusFluent.StateNested<A> editState() {
    return withNewStateLike(getState());
  }
  public V1ContainerStatusFluent.StateNested<A> editOrNewState() {
    return withNewStateLike(getState() != null ? getState(): new V1ContainerStateBuilder().build());
  }
  public V1ContainerStatusFluent.StateNested<A> editOrNewStateLike(V1ContainerState item) {
    return withNewStateLike(getState() != null ? getState(): item);
  }
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    V1ContainerStatusFluentImpl that = (V1ContainerStatusFluentImpl) o;
    if (containerID != null ? !containerID.equals(that.containerID) :that.containerID != null) return false;
    if (image != null ? !image.equals(that.image) :that.image != null) return false;
    if (imageID != null ? !imageID.equals(that.imageID) :that.imageID != null) return false;
    if (lastState != null ? !lastState.equals(that.lastState) :that.lastState != null) return false;
    if (name != null ? !name.equals(that.name) :that.name != null) return false;
    if (ready != null ? !ready.equals(that.ready) :that.ready != null) return false;
    if (restartCount != null ? !restartCount.equals(that.restartCount) :that.restartCount != null) return false;
    if (started != null ? !started.equals(that.started) :that.started != null) return false;
    if (state != null ? !state.equals(that.state) :that.state != null) return false;
    return true;
  }
  public int hashCode() {
    return java.util.Objects.hash(containerID,  image,  imageID,  lastState,  name,  ready,  restartCount,  started,  state,  super.hashCode());
  }
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (containerID != null) { sb.append("containerID:"); sb.append(containerID + ","); }
    if (image != null) { sb.append("image:"); sb.append(image + ","); }
    if (imageID != null) { sb.append("imageID:"); sb.append(imageID + ","); }
    if (lastState != null) { sb.append("lastState:"); sb.append(lastState + ","); }
    if (name != null) { sb.append("name:"); sb.append(name + ","); }
    if (ready != null) { sb.append("ready:"); sb.append(ready + ","); }
    if (restartCount != null) { sb.append("restartCount:"); sb.append(restartCount + ","); }
    if (started != null) { sb.append("started:"); sb.append(started + ","); }
    if (state != null) { sb.append("state:"); sb.append(state); }
    sb.append("}");
    return sb.toString();
  }
  public A withReady() {
    return withReady(true);
  }
  public A withStarted() {
    return withStarted(true);
  }
  class LastStateNestedImpl<N> extends V1ContainerStateFluentImpl<V1ContainerStatusFluent.LastStateNested<N>> implements V1ContainerStatusFluent.LastStateNested<N>,Nested<N>{
    LastStateNestedImpl(V1ContainerState item) {
      this.builder = new V1ContainerStateBuilder(this, item);
    }
    LastStateNestedImpl() {
      this.builder = new V1ContainerStateBuilder(this);
    }
    V1ContainerStateBuilder builder;
    public N and() {
      return (N) V1ContainerStatusFluentImpl.this.withLastState(builder.build());
    }
    public N endLastState() {
      return and();
    }
    
  }
  class StateNestedImpl<N> extends V1ContainerStateFluentImpl<V1ContainerStatusFluent.StateNested<N>> implements V1ContainerStatusFluent.StateNested<N>,Nested<N>{
    StateNestedImpl(V1ContainerState item) {
      this.builder = new V1ContainerStateBuilder(this, item);
    }
    StateNestedImpl() {
      this.builder = new V1ContainerStateBuilder(this);
    }
    V1ContainerStateBuilder builder;
    public N and() {
      return (N) V1ContainerStatusFluentImpl.this.withState(builder.build());
    }
    public N endState() {
      return and();
    }
    
  }
  
}