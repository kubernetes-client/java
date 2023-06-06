package io.kubernetes.client.openapi.models;

import java.lang.SuppressWarnings;
import io.kubernetes.client.fluent.Nested;
import java.lang.String;
import java.util.LinkedHashMap;
import java.lang.Deprecated;
import io.kubernetes.client.fluent.BaseFluent;
import java.lang.Boolean;
import io.kubernetes.client.custom.Quantity;
import java.lang.Integer;
import java.lang.Object;
import java.util.Map;

 /**
  * Generated
  */
  @SuppressWarnings(value = "unchecked")
  public class V1ContainerStatusFluentImpl<A extends V1ContainerStatusFluent<A>> extends BaseFluent<A> implements V1ContainerStatusFluent<A>{
  public V1ContainerStatusFluentImpl() {
  }
  public V1ContainerStatusFluentImpl(V1ContainerStatus instance) {
    if (instance != null) {
      this.withAllocatedResources(instance.getAllocatedResources());
      this.withContainerID(instance.getContainerID());
      this.withImage(instance.getImage());
      this.withImageID(instance.getImageID());
      this.withLastState(instance.getLastState());
      this.withName(instance.getName());
      this.withReady(instance.getReady());
      this.withResources(instance.getResources());
      this.withRestartCount(instance.getRestartCount());
      this.withStarted(instance.getStarted());
      this.withState(instance.getState());
    }
  }
  private Map<String,Quantity> allocatedResources;
  private String containerID;
  private String image;
  private String imageID;
  private V1ContainerStateBuilder lastState;
  private String name;
  private Boolean ready;
  private V1ResourceRequirementsBuilder resources;
  private Integer restartCount;
  private Boolean started;
  private V1ContainerStateBuilder state;
  public A addToAllocatedResources(String key,Quantity value) {
    if(this.allocatedResources == null && key != null && value != null) { this.allocatedResources = new LinkedHashMap(); }
    if(key != null && value != null) {this.allocatedResources.put(key, value);} return (A)this;
  }
  public A addToAllocatedResources(Map<String,Quantity> map) {
    if(this.allocatedResources == null && map != null) { this.allocatedResources = new LinkedHashMap(); }
    if(map != null) { this.allocatedResources.putAll(map);} return (A)this;
  }
  public A removeFromAllocatedResources(String key) {
    if(this.allocatedResources == null) { return (A) this; }
    if(key != null && this.allocatedResources != null) {this.allocatedResources.remove(key);} return (A)this;
  }
  public A removeFromAllocatedResources(Map<String,Quantity> map) {
    if(this.allocatedResources == null) { return (A) this; }
    if(map != null) { for(Object key : map.keySet()) {if (this.allocatedResources != null){this.allocatedResources.remove(key);}}} return (A)this;
  }
  public Map<String,Quantity> getAllocatedResources() {
    return this.allocatedResources;
  }
  public <K,V>A withAllocatedResources(Map<String,Quantity> allocatedResources) {
    if (allocatedResources == null) { this.allocatedResources =  null;} else {this.allocatedResources = new LinkedHashMap(allocatedResources);} return (A) this;
  }
  public Boolean hasAllocatedResources() {
    return this.allocatedResources != null;
  }
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
  public V1ContainerStatusFluentImpl.LastStateNested<A> withNewLastState() {
    return new V1ContainerStatusFluentImpl.LastStateNestedImpl();
  }
  public V1ContainerStatusFluentImpl.LastStateNested<A> withNewLastStateLike(V1ContainerState item) {
    return new V1ContainerStatusFluentImpl.LastStateNestedImpl(item);
  }
  public V1ContainerStatusFluentImpl.LastStateNested<A> editLastState() {
    return withNewLastStateLike(getLastState());
  }
  public V1ContainerStatusFluentImpl.LastStateNested<A> editOrNewLastState() {
    return withNewLastStateLike(getLastState() != null ? getLastState(): new V1ContainerStateBuilder().build());
  }
  public V1ContainerStatusFluentImpl.LastStateNested<A> editOrNewLastStateLike(V1ContainerState item) {
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
  
  /**
   * This method has been deprecated, please use method buildResources instead.
   * @return The buildable object.
   */
  @Deprecated
  public V1ResourceRequirements getResources() {
    return this.resources!=null ?this.resources.build():null;
  }
  public V1ResourceRequirements buildResources() {
    return this.resources!=null ?this.resources.build():null;
  }
  public A withResources(V1ResourceRequirements resources) {
    _visitables.get("resources").remove(this.resources);
    if (resources!=null){ this.resources= new V1ResourceRequirementsBuilder(resources); _visitables.get("resources").add(this.resources);} else { this.resources = null; _visitables.get("resources").remove(this.resources); } return (A) this;
  }
  public Boolean hasResources() {
    return this.resources != null;
  }
  public V1ContainerStatusFluentImpl.ResourcesNested<A> withNewResources() {
    return new V1ContainerStatusFluentImpl.ResourcesNestedImpl();
  }
  public V1ContainerStatusFluentImpl.ResourcesNested<A> withNewResourcesLike(V1ResourceRequirements item) {
    return new V1ContainerStatusFluentImpl.ResourcesNestedImpl(item);
  }
  public V1ContainerStatusFluentImpl.ResourcesNested<A> editResources() {
    return withNewResourcesLike(getResources());
  }
  public V1ContainerStatusFluentImpl.ResourcesNested<A> editOrNewResources() {
    return withNewResourcesLike(getResources() != null ? getResources(): new V1ResourceRequirementsBuilder().build());
  }
  public V1ContainerStatusFluentImpl.ResourcesNested<A> editOrNewResourcesLike(V1ResourceRequirements item) {
    return withNewResourcesLike(getResources() != null ? getResources(): item);
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
  public V1ContainerStatusFluentImpl.StateNested<A> withNewState() {
    return new V1ContainerStatusFluentImpl.StateNestedImpl();
  }
  public V1ContainerStatusFluentImpl.StateNested<A> withNewStateLike(V1ContainerState item) {
    return new V1ContainerStatusFluentImpl.StateNestedImpl(item);
  }
  public V1ContainerStatusFluentImpl.StateNested<A> editState() {
    return withNewStateLike(getState());
  }
  public V1ContainerStatusFluentImpl.StateNested<A> editOrNewState() {
    return withNewStateLike(getState() != null ? getState(): new V1ContainerStateBuilder().build());
  }
  public V1ContainerStatusFluentImpl.StateNested<A> editOrNewStateLike(V1ContainerState item) {
    return withNewStateLike(getState() != null ? getState(): item);
  }
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    V1ContainerStatusFluentImpl that = (V1ContainerStatusFluentImpl) o;
    if (!java.util.Objects.equals(allocatedResources, that.allocatedResources)) return false;

    if (!java.util.Objects.equals(containerID, that.containerID)) return false;

    if (!java.util.Objects.equals(image, that.image)) return false;

    if (!java.util.Objects.equals(imageID, that.imageID)) return false;

    if (!java.util.Objects.equals(lastState, that.lastState)) return false;

    if (!java.util.Objects.equals(name, that.name)) return false;

    if (!java.util.Objects.equals(ready, that.ready)) return false;

    if (!java.util.Objects.equals(resources, that.resources)) return false;

    if (!java.util.Objects.equals(restartCount, that.restartCount)) return false;

    if (!java.util.Objects.equals(started, that.started)) return false;

    if (!java.util.Objects.equals(state, that.state)) return false;

    return true;
  }
  public int hashCode() {
    return java.util.Objects.hash(allocatedResources,  containerID,  image,  imageID,  lastState,  name,  ready,  resources,  restartCount,  started,  state,  super.hashCode());
  }
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (allocatedResources != null && !allocatedResources.isEmpty()) { sb.append("allocatedResources:"); sb.append(allocatedResources + ","); }
    if (containerID != null) { sb.append("containerID:"); sb.append(containerID + ","); }
    if (image != null) { sb.append("image:"); sb.append(image + ","); }
    if (imageID != null) { sb.append("imageID:"); sb.append(imageID + ","); }
    if (lastState != null) { sb.append("lastState:"); sb.append(lastState + ","); }
    if (name != null) { sb.append("name:"); sb.append(name + ","); }
    if (ready != null) { sb.append("ready:"); sb.append(ready + ","); }
    if (resources != null) { sb.append("resources:"); sb.append(resources + ","); }
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
  class LastStateNestedImpl<N> extends V1ContainerStateFluentImpl<V1ContainerStatusFluentImpl.LastStateNested<N>> implements V1ContainerStatusFluentImpl.LastStateNested<N>,Nested<N>{
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
  class ResourcesNestedImpl<N> extends V1ResourceRequirementsFluentImpl<V1ContainerStatusFluentImpl.ResourcesNested<N>> implements V1ContainerStatusFluentImpl.ResourcesNested<N>,Nested<N>{
    ResourcesNestedImpl(V1ResourceRequirements item) {
      this.builder = new V1ResourceRequirementsBuilder(this, item);
    }
    ResourcesNestedImpl() {
      this.builder = new V1ResourceRequirementsBuilder(this);
    }
    V1ResourceRequirementsBuilder builder;
    public N and() {
      return (N) V1ContainerStatusFluentImpl.this.withResources(builder.build());
    }
    public N endResources() {
      return and();
    }
    
  }
  class StateNestedImpl<N> extends V1ContainerStateFluentImpl<V1ContainerStatusFluentImpl.StateNested<N>> implements V1ContainerStatusFluentImpl.StateNested<N>,Nested<N>{
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