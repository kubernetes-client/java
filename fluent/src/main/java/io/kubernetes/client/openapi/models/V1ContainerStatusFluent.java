package io.kubernetes.client.openapi.models;

import java.lang.SuppressWarnings;
import io.kubernetes.client.fluent.Nested;
import io.kubernetes.client.custom.Quantity;
import java.lang.String;
import java.util.LinkedHashMap;
import java.lang.Integer;
import io.kubernetes.client.fluent.BaseFluent;
import java.lang.Object;
import java.lang.Boolean;
import java.util.Map;

/**
 * Generated
 */
@SuppressWarnings("unchecked")
public class V1ContainerStatusFluent<A extends V1ContainerStatusFluent<A>> extends BaseFluent<A>{
  public V1ContainerStatusFluent() {
  }
  
  public V1ContainerStatusFluent(V1ContainerStatus instance) {
    this.copyInstance(instance);
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
  
  protected void copyInstance(V1ContainerStatus instance) {
    instance = (instance != null ? instance : new V1ContainerStatus());
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
    if (allocatedResources == null) {
      this.allocatedResources = null;
    } else {
      this.allocatedResources = new LinkedHashMap(allocatedResources);
    }
    return (A) this;
  }
  
  public boolean hasAllocatedResources() {
    return this.allocatedResources != null;
  }
  
  public String getContainerID() {
    return this.containerID;
  }
  
  public A withContainerID(String containerID) {
    this.containerID = containerID;
    return (A) this;
  }
  
  public boolean hasContainerID() {
    return this.containerID != null;
  }
  
  public String getImage() {
    return this.image;
  }
  
  public A withImage(String image) {
    this.image = image;
    return (A) this;
  }
  
  public boolean hasImage() {
    return this.image != null;
  }
  
  public String getImageID() {
    return this.imageID;
  }
  
  public A withImageID(String imageID) {
    this.imageID = imageID;
    return (A) this;
  }
  
  public boolean hasImageID() {
    return this.imageID != null;
  }
  
  public V1ContainerState buildLastState() {
    return this.lastState != null ? this.lastState.build() : null;
  }
  
  public A withLastState(V1ContainerState lastState) {
    this._visitables.remove("lastState");
    if (lastState != null) {
        this.lastState = new V1ContainerStateBuilder(lastState);
        this._visitables.get("lastState").add(this.lastState);
    } else {
        this.lastState = null;
        this._visitables.get("lastState").remove(this.lastState);
    }
    return (A) this;
  }
  
  public boolean hasLastState() {
    return this.lastState != null;
  }
  
  public LastStateNested<A> withNewLastState() {
    return new LastStateNested(null);
  }
  
  public LastStateNested<A> withNewLastStateLike(V1ContainerState item) {
    return new LastStateNested(item);
  }
  
  public LastStateNested<A> editLastState() {
    return withNewLastStateLike(java.util.Optional.ofNullable(buildLastState()).orElse(null));
  }
  
  public LastStateNested<A> editOrNewLastState() {
    return withNewLastStateLike(java.util.Optional.ofNullable(buildLastState()).orElse(new V1ContainerStateBuilder().build()));
  }
  
  public LastStateNested<A> editOrNewLastStateLike(V1ContainerState item) {
    return withNewLastStateLike(java.util.Optional.ofNullable(buildLastState()).orElse(item));
  }
  
  public String getName() {
    return this.name;
  }
  
  public A withName(String name) {
    this.name = name;
    return (A) this;
  }
  
  public boolean hasName() {
    return this.name != null;
  }
  
  public Boolean getReady() {
    return this.ready;
  }
  
  public A withReady(Boolean ready) {
    this.ready = ready;
    return (A) this;
  }
  
  public boolean hasReady() {
    return this.ready != null;
  }
  
  public V1ResourceRequirements buildResources() {
    return this.resources != null ? this.resources.build() : null;
  }
  
  public A withResources(V1ResourceRequirements resources) {
    this._visitables.remove("resources");
    if (resources != null) {
        this.resources = new V1ResourceRequirementsBuilder(resources);
        this._visitables.get("resources").add(this.resources);
    } else {
        this.resources = null;
        this._visitables.get("resources").remove(this.resources);
    }
    return (A) this;
  }
  
  public boolean hasResources() {
    return this.resources != null;
  }
  
  public ResourcesNested<A> withNewResources() {
    return new ResourcesNested(null);
  }
  
  public ResourcesNested<A> withNewResourcesLike(V1ResourceRequirements item) {
    return new ResourcesNested(item);
  }
  
  public ResourcesNested<A> editResources() {
    return withNewResourcesLike(java.util.Optional.ofNullable(buildResources()).orElse(null));
  }
  
  public ResourcesNested<A> editOrNewResources() {
    return withNewResourcesLike(java.util.Optional.ofNullable(buildResources()).orElse(new V1ResourceRequirementsBuilder().build()));
  }
  
  public ResourcesNested<A> editOrNewResourcesLike(V1ResourceRequirements item) {
    return withNewResourcesLike(java.util.Optional.ofNullable(buildResources()).orElse(item));
  }
  
  public Integer getRestartCount() {
    return this.restartCount;
  }
  
  public A withRestartCount(Integer restartCount) {
    this.restartCount = restartCount;
    return (A) this;
  }
  
  public boolean hasRestartCount() {
    return this.restartCount != null;
  }
  
  public Boolean getStarted() {
    return this.started;
  }
  
  public A withStarted(Boolean started) {
    this.started = started;
    return (A) this;
  }
  
  public boolean hasStarted() {
    return this.started != null;
  }
  
  public V1ContainerState buildState() {
    return this.state != null ? this.state.build() : null;
  }
  
  public A withState(V1ContainerState state) {
    this._visitables.remove("state");
    if (state != null) {
        this.state = new V1ContainerStateBuilder(state);
        this._visitables.get("state").add(this.state);
    } else {
        this.state = null;
        this._visitables.get("state").remove(this.state);
    }
    return (A) this;
  }
  
  public boolean hasState() {
    return this.state != null;
  }
  
  public StateNested<A> withNewState() {
    return new StateNested(null);
  }
  
  public StateNested<A> withNewStateLike(V1ContainerState item) {
    return new StateNested(item);
  }
  
  public StateNested<A> editState() {
    return withNewStateLike(java.util.Optional.ofNullable(buildState()).orElse(null));
  }
  
  public StateNested<A> editOrNewState() {
    return withNewStateLike(java.util.Optional.ofNullable(buildState()).orElse(new V1ContainerStateBuilder().build()));
  }
  
  public StateNested<A> editOrNewStateLike(V1ContainerState item) {
    return withNewStateLike(java.util.Optional.ofNullable(buildState()).orElse(item));
  }
  
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    V1ContainerStatusFluent that = (V1ContainerStatusFluent) o;
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
  public class LastStateNested<N> extends V1ContainerStateFluent<LastStateNested<N>> implements Nested<N>{
    LastStateNested(V1ContainerState item) {
      this.builder = new V1ContainerStateBuilder(this, item);
    }
    V1ContainerStateBuilder builder;
    
    public N and() {
      return (N) V1ContainerStatusFluent.this.withLastState(builder.build());
    }
    
    public N endLastState() {
      return and();
    }
    
  
  }
  public class ResourcesNested<N> extends V1ResourceRequirementsFluent<ResourcesNested<N>> implements Nested<N>{
    ResourcesNested(V1ResourceRequirements item) {
      this.builder = new V1ResourceRequirementsBuilder(this, item);
    }
    V1ResourceRequirementsBuilder builder;
    
    public N and() {
      return (N) V1ContainerStatusFluent.this.withResources(builder.build());
    }
    
    public N endResources() {
      return and();
    }
    
  
  }
  public class StateNested<N> extends V1ContainerStateFluent<StateNested<N>> implements Nested<N>{
    StateNested(V1ContainerState item) {
      this.builder = new V1ContainerStateBuilder(this, item);
    }
    V1ContainerStateBuilder builder;
    
    public N and() {
      return (N) V1ContainerStatusFluent.this.withState(builder.build());
    }
    
    public N endState() {
      return and();
    }
    
  
  }

}