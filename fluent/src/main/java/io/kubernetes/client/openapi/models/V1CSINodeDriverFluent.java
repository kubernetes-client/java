package io.kubernetes.client.openapi.models;

import java.lang.SuppressWarnings;
import io.kubernetes.client.fluent.Nested;
import java.util.ArrayList;
import java.lang.String;
import java.util.function.Predicate;
import io.kubernetes.client.fluent.BaseFluent;
import java.util.Collection;
import java.lang.Object;
import java.util.List;

/**
 * Generated
 */
@SuppressWarnings("unchecked")
public class V1CSINodeDriverFluent<A extends V1CSINodeDriverFluent<A>> extends BaseFluent<A>{
  public V1CSINodeDriverFluent() {
  }
  
  public V1CSINodeDriverFluent(V1CSINodeDriver instance) {
    this.copyInstance(instance);
  }
  private V1VolumeNodeResourcesBuilder allocatable;
  private String name;
  private String nodeID;
  private List<String> topologyKeys;
  
  protected void copyInstance(V1CSINodeDriver instance) {
    instance = (instance != null ? instance : new V1CSINodeDriver());
    if (instance != null) {
          this.withAllocatable(instance.getAllocatable());
          this.withName(instance.getName());
          this.withNodeID(instance.getNodeID());
          this.withTopologyKeys(instance.getTopologyKeys());
        }
  }
  
  public V1VolumeNodeResources buildAllocatable() {
    return this.allocatable != null ? this.allocatable.build() : null;
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
  
  public boolean hasAllocatable() {
    return this.allocatable != null;
  }
  
  public AllocatableNested<A> withNewAllocatable() {
    return new AllocatableNested(null);
  }
  
  public AllocatableNested<A> withNewAllocatableLike(V1VolumeNodeResources item) {
    return new AllocatableNested(item);
  }
  
  public AllocatableNested<A> editAllocatable() {
    return withNewAllocatableLike(java.util.Optional.ofNullable(buildAllocatable()).orElse(null));
  }
  
  public AllocatableNested<A> editOrNewAllocatable() {
    return withNewAllocatableLike(java.util.Optional.ofNullable(buildAllocatable()).orElse(new V1VolumeNodeResourcesBuilder().build()));
  }
  
  public AllocatableNested<A> editOrNewAllocatableLike(V1VolumeNodeResources item) {
    return withNewAllocatableLike(java.util.Optional.ofNullable(buildAllocatable()).orElse(item));
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
  
  public String getNodeID() {
    return this.nodeID;
  }
  
  public A withNodeID(String nodeID) {
    this.nodeID = nodeID;
    return (A) this;
  }
  
  public boolean hasNodeID() {
    return this.nodeID != null;
  }
  
  public A addToTopologyKeys(int index,String item) {
    if (this.topologyKeys == null) {this.topologyKeys = new ArrayList<String>();}
    this.topologyKeys.add(index, item);
    return (A)this;
  }
  
  public A setToTopologyKeys(int index,String item) {
    if (this.topologyKeys == null) {this.topologyKeys = new ArrayList<String>();}
    this.topologyKeys.set(index, item); return (A)this;
  }
  
  public A addToTopologyKeys(java.lang.String... items) {
    if (this.topologyKeys == null) {this.topologyKeys = new ArrayList<String>();}
    for (String item : items) {this.topologyKeys.add(item);} return (A)this;
  }
  
  public A addAllToTopologyKeys(Collection<String> items) {
    if (this.topologyKeys == null) {this.topologyKeys = new ArrayList<String>();}
    for (String item : items) {this.topologyKeys.add(item);} return (A)this;
  }
  
  public A removeFromTopologyKeys(java.lang.String... items) {
    if (this.topologyKeys == null) return (A)this;
    for (String item : items) { this.topologyKeys.remove(item);} return (A)this;
  }
  
  public A removeAllFromTopologyKeys(Collection<String> items) {
    if (this.topologyKeys == null) return (A)this;
    for (String item : items) { this.topologyKeys.remove(item);} return (A)this;
  }
  
  public List<String> getTopologyKeys() {
    return this.topologyKeys;
  }
  
  public String getTopologyKey(int index) {
    return this.topologyKeys.get(index);
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
  
  public boolean hasMatchingTopologyKey(Predicate<String> predicate) {
      for (String item : topologyKeys) {
        if (predicate.test(item)) {
          return true;
        }
      }
      return false;
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
  
  public A withTopologyKeys(java.lang.String... topologyKeys) {
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
  
  public boolean hasTopologyKeys() {
    return this.topologyKeys != null && !this.topologyKeys.isEmpty();
  }
  
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    V1CSINodeDriverFluent that = (V1CSINodeDriverFluent) o;
    if (!java.util.Objects.equals(allocatable, that.allocatable)) return false;
    if (!java.util.Objects.equals(name, that.name)) return false;
    if (!java.util.Objects.equals(nodeID, that.nodeID)) return false;
    if (!java.util.Objects.equals(topologyKeys, that.topologyKeys)) return false;
    return true;
  }
  
  public int hashCode() {
    return java.util.Objects.hash(allocatable,  name,  nodeID,  topologyKeys,  super.hashCode());
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (allocatable != null) { sb.append("allocatable:"); sb.append(allocatable + ","); }
    if (name != null) { sb.append("name:"); sb.append(name + ","); }
    if (nodeID != null) { sb.append("nodeID:"); sb.append(nodeID + ","); }
    if (topologyKeys != null && !topologyKeys.isEmpty()) { sb.append("topologyKeys:"); sb.append(topologyKeys); }
    sb.append("}");
    return sb.toString();
  }
  public class AllocatableNested<N> extends V1VolumeNodeResourcesFluent<AllocatableNested<N>> implements Nested<N>{
    AllocatableNested(V1VolumeNodeResources item) {
      this.builder = new V1VolumeNodeResourcesBuilder(this, item);
    }
    V1VolumeNodeResourcesBuilder builder;
    
    public N and() {
      return (N) V1CSINodeDriverFluent.this.withAllocatable(builder.build());
    }
    
    public N endAllocatable() {
      return and();
    }
    
  
  }

}