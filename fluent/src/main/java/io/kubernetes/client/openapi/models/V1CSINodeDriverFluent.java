package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.BaseFluent;
import io.kubernetes.client.fluent.Nested;
import java.lang.Object;
import java.lang.String;
import java.lang.StringBuilder;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.function.Predicate;

/**
 * Generated
 */
@SuppressWarnings("unchecked")
public class V1CSINodeDriverFluent<A extends io.kubernetes.client.openapi.models.V1CSINodeDriverFluent<A>> extends BaseFluent<A>{

  private V1VolumeNodeResourcesBuilder allocatable;
  private String name;
  private String nodeID;
  private List<String> topologyKeys;

  public V1CSINodeDriverFluent() {
  }
  
  public V1CSINodeDriverFluent(V1CSINodeDriver instance) {
    this.copyInstance(instance);
  }

  public A addAllToTopologyKeys(Collection<String> items) {
    if (this.topologyKeys == null) {
      this.topologyKeys = new ArrayList();
    }
    for (String item : items) {
      this.topologyKeys.add(item);
    }
    return (A) this;
  }
  
  public A addToTopologyKeys(String... items) {
    if (this.topologyKeys == null) {
      this.topologyKeys = new ArrayList();
    }
    for (String item : items) {
      this.topologyKeys.add(item);
    }
    return (A) this;
  }
  
  public A addToTopologyKeys(int index,String item) {
    if (this.topologyKeys == null) {
      this.topologyKeys = new ArrayList();
    }
    this.topologyKeys.add(index, item);
    return (A) this;
  }
  
  public V1VolumeNodeResources buildAllocatable() {
    return this.allocatable != null ? this.allocatable.build() : null;
  }
  
  protected void copyInstance(V1CSINodeDriver instance) {
    instance = instance != null ? instance : new V1CSINodeDriver();
    if (instance != null) {
        this.withAllocatable(instance.getAllocatable());
        this.withName(instance.getName());
        this.withNodeID(instance.getNodeID());
        this.withTopologyKeys(instance.getTopologyKeys());
    }
  }
  
  public AllocatableNested<A> editAllocatable() {
    return this.withNewAllocatableLike(Optional.ofNullable(this.buildAllocatable()).orElse(null));
  }
  
  public AllocatableNested<A> editOrNewAllocatable() {
    return this.withNewAllocatableLike(Optional.ofNullable(this.buildAllocatable()).orElse(new V1VolumeNodeResourcesBuilder().build()));
  }
  
  public AllocatableNested<A> editOrNewAllocatableLike(V1VolumeNodeResources item) {
    return this.withNewAllocatableLike(Optional.ofNullable(this.buildAllocatable()).orElse(item));
  }
  
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || this.getClass() != o.getClass()) {
      return false;
    }
    if (!(super.equals(o))) {
      return false;
    }
    V1CSINodeDriverFluent that = (V1CSINodeDriverFluent) o;
    if (!(Objects.equals(allocatable, that.allocatable))) {
      return false;
    }
    if (!(Objects.equals(name, that.name))) {
      return false;
    }
    if (!(Objects.equals(nodeID, that.nodeID))) {
      return false;
    }
    if (!(Objects.equals(topologyKeys, that.topologyKeys))) {
      return false;
    }
    return true;
  }
  
  public String getFirstTopologyKey() {
    return this.topologyKeys.get(0);
  }
  
  public String getLastTopologyKey() {
    return this.topologyKeys.get(topologyKeys.size() - 1);
  }
  
  public String getMatchingTopologyKey(Predicate<String> predicate) {
      for (String item : topologyKeys) {
        if (predicate.test(item)) {
          return item;
        }
      }
      return null;
  }
  
  public String getName() {
    return this.name;
  }
  
  public String getNodeID() {
    return this.nodeID;
  }
  
  public String getTopologyKey(int index) {
    return this.topologyKeys.get(index);
  }
  
  public List<String> getTopologyKeys() {
    return this.topologyKeys;
  }
  
  public boolean hasAllocatable() {
    return this.allocatable != null;
  }
  
  public boolean hasMatchingTopologyKey(Predicate<String> predicate) {
      for (String item : topologyKeys) {
        if (predicate.test(item)) {
          return true;
        }
      }
      return false;
  }
  
  public boolean hasName() {
    return this.name != null;
  }
  
  public boolean hasNodeID() {
    return this.nodeID != null;
  }
  
  public boolean hasTopologyKeys() {
    return this.topologyKeys != null && !(this.topologyKeys.isEmpty());
  }
  
  public int hashCode() {
    return Objects.hash(allocatable, name, nodeID, topologyKeys);
  }
  
  public A removeAllFromTopologyKeys(Collection<String> items) {
    if (this.topologyKeys == null) {
      return (A) this;
    }
    for (String item : items) {
      this.topologyKeys.remove(item);
    }
    return (A) this;
  }
  
  public A removeFromTopologyKeys(String... items) {
    if (this.topologyKeys == null) {
      return (A) this;
    }
    for (String item : items) {
      this.topologyKeys.remove(item);
    }
    return (A) this;
  }
  
  public A setToTopologyKeys(int index,String item) {
    if (this.topologyKeys == null) {
      this.topologyKeys = new ArrayList();
    }
    this.topologyKeys.set(index, item);
    return (A) this;
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (!(allocatable == null)) {
        sb.append("allocatable:");
        sb.append(allocatable);
        sb.append(",");
    }
    if (!(name == null)) {
        sb.append("name:");
        sb.append(name);
        sb.append(",");
    }
    if (!(nodeID == null)) {
        sb.append("nodeID:");
        sb.append(nodeID);
        sb.append(",");
    }
    if (!(topologyKeys == null) && !(topologyKeys.isEmpty())) {
        sb.append("topologyKeys:");
        sb.append(topologyKeys);
    }
    sb.append("}");
    return sb.toString();
  }
  
  public A withAllocatable(V1VolumeNodeResources allocatable) {
    this._visitables.remove("allocatable");
    if (allocatable != null) {
        this.allocatable = new V1VolumeNodeResourcesBuilder(allocatable);
        this._visitables.get("allocatable").add(this.allocatable);
    } else {
        this.allocatable = null;
        this._visitables.get("allocatable").remove(this.allocatable);
    }
    return (A) this;
  }
  
  public A withName(String name) {
    this.name = name;
    return (A) this;
  }
  
  public AllocatableNested<A> withNewAllocatable() {
    return new AllocatableNested(null);
  }
  
  public AllocatableNested<A> withNewAllocatableLike(V1VolumeNodeResources item) {
    return new AllocatableNested(item);
  }
  
  public A withNodeID(String nodeID) {
    this.nodeID = nodeID;
    return (A) this;
  }
  
  public A withTopologyKeys(List<String> topologyKeys) {
    if (topologyKeys != null) {
        this.topologyKeys = new ArrayList();
        for (String item : topologyKeys) {
          this.addToTopologyKeys(item);
        }
    } else {
      this.topologyKeys = null;
    }
    return (A) this;
  }
  
  public A withTopologyKeys(String... topologyKeys) {
    if (this.topologyKeys != null) {
        this.topologyKeys.clear();
        _visitables.remove("topologyKeys");
    }
    if (topologyKeys != null) {
      for (String item : topologyKeys) {
        this.addToTopologyKeys(item);
      }
    }
    return (A) this;
  }
  public class AllocatableNested<N> extends V1VolumeNodeResourcesFluent<AllocatableNested<N>> implements Nested<N>{
  
    V1VolumeNodeResourcesBuilder builder;
  
    AllocatableNested(V1VolumeNodeResources item) {
      this.builder = new V1VolumeNodeResourcesBuilder(this, item);
    }
  
    public N and() {
      return (N) V1CSINodeDriverFluent.this.withAllocatable(builder.build());
    }
    
    public N endAllocatable() {
      return and();
    }
    
  }
}