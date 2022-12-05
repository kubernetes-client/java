package io.kubernetes.client.openapi.models;

import java.lang.SuppressWarnings;
import io.kubernetes.client.fluent.Nested;
import java.util.ArrayList;
import java.lang.String;
import java.util.function.Predicate;
import java.lang.Integer;
import java.lang.Deprecated;
import io.kubernetes.client.fluent.BaseFluent;
import java.util.Collection;
import java.lang.Object;
import java.util.List;
import java.lang.Boolean;

 /**
  * Generated
  */
  @SuppressWarnings(value = "unchecked")
  public class V1CSINodeDriverFluentImpl<A extends V1CSINodeDriverFluent<A>> extends BaseFluent<A> implements V1CSINodeDriverFluent<A>{
  public V1CSINodeDriverFluentImpl() {
  }
  public V1CSINodeDriverFluentImpl(V1CSINodeDriver instance) {
    this.withAllocatable(instance.getAllocatable());

    this.withName(instance.getName());

    this.withNodeID(instance.getNodeID());

    this.withTopologyKeys(instance.getTopologyKeys());

  }
  private V1VolumeNodeResourcesBuilder allocatable;
  private String name;
  private String nodeID;
  private List<String> topologyKeys;
  
  /**
   * This method has been deprecated, please use method buildAllocatable instead.
   * @return The buildable object.
   */
  @Deprecated
  public V1VolumeNodeResources getAllocatable() {
    return this.allocatable!=null ?this.allocatable.build():null;
  }
  public V1VolumeNodeResources buildAllocatable() {
    return this.allocatable!=null ?this.allocatable.build():null;
  }
  public A withAllocatable(V1VolumeNodeResources allocatable) {
    _visitables.get("allocatable").remove(this.allocatable);
    if (allocatable!=null){ this.allocatable= new V1VolumeNodeResourcesBuilder(allocatable); _visitables.get("allocatable").add(this.allocatable);} else { this.allocatable = null; _visitables.get("allocatable").remove(this.allocatable); } return (A) this;
  }
  public Boolean hasAllocatable() {
    return this.allocatable != null;
  }
  public V1CSINodeDriverFluent.AllocatableNested<A> withNewAllocatable() {
    return new V1CSINodeDriverFluentImpl.AllocatableNestedImpl();
  }
  public V1CSINodeDriverFluent.AllocatableNested<A> withNewAllocatableLike(V1VolumeNodeResources item) {
    return new V1CSINodeDriverFluentImpl.AllocatableNestedImpl(item);
  }
  public V1CSINodeDriverFluent.AllocatableNested<A> editAllocatable() {
    return withNewAllocatableLike(getAllocatable());
  }
  public V1CSINodeDriverFluent.AllocatableNested<A> editOrNewAllocatable() {
    return withNewAllocatableLike(getAllocatable() != null ? getAllocatable(): new V1VolumeNodeResourcesBuilder().build());
  }
  public V1CSINodeDriverFluent.AllocatableNested<A> editOrNewAllocatableLike(V1VolumeNodeResources item) {
    return withNewAllocatableLike(getAllocatable() != null ? getAllocatable(): item);
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
  public String getNodeID() {
    return this.nodeID;
  }
  public A withNodeID(String nodeID) {
    this.nodeID=nodeID; return (A) this;
  }
  public Boolean hasNodeID() {
    return this.nodeID != null;
  }
  public A addToTopologyKeys(Integer index,String item) {
    if (this.topologyKeys == null) {this.topologyKeys = new ArrayList<String>();}
    this.topologyKeys.add(index, item);
    return (A)this;
  }
  public A setToTopologyKeys(Integer index,String item) {
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
    for (String item : items) {if (this.topologyKeys!= null){ this.topologyKeys.remove(item);}} return (A)this;
  }
  public A removeAllFromTopologyKeys(Collection<String> items) {
    for (String item : items) {if (this.topologyKeys!= null){ this.topologyKeys.remove(item);}} return (A)this;
  }
  public List<String> getTopologyKeys() {
    return this.topologyKeys;
  }
  public String getTopologyKey(Integer index) {
    return this.topologyKeys.get(index);
  }
  public String getFirstTopologyKey() {
    return this.topologyKeys.get(0);
  }
  public String getLastTopologyKey() {
    return this.topologyKeys.get(topologyKeys.size() - 1);
  }
  public String getMatchingTopologyKey(Predicate<String> predicate) {
    for (String item: topologyKeys) { if(predicate.test(item)){ return item;} } return null;
  }
  public Boolean hasMatchingTopologyKey(Predicate<String> predicate) {
    for (String item: topologyKeys) { if(predicate.test(item)){ return true;} } return false;
  }
  public A withTopologyKeys(List<String> topologyKeys) {
    if (topologyKeys != null) {this.topologyKeys = new ArrayList(); for (String item : topologyKeys){this.addToTopologyKeys(item);}} else { this.topologyKeys = null;} return (A) this;
  }
  public A withTopologyKeys(java.lang.String... topologyKeys) {
    if (this.topologyKeys != null) {this.topologyKeys.clear();}
    if (topologyKeys != null) {for (String item :topologyKeys){ this.addToTopologyKeys(item);}} return (A) this;
  }
  public Boolean hasTopologyKeys() {
    return topologyKeys != null && !topologyKeys.isEmpty();
  }
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    V1CSINodeDriverFluentImpl that = (V1CSINodeDriverFluentImpl) o;
    if (allocatable != null ? !allocatable.equals(that.allocatable) :that.allocatable != null) return false;
    if (name != null ? !name.equals(that.name) :that.name != null) return false;
    if (nodeID != null ? !nodeID.equals(that.nodeID) :that.nodeID != null) return false;
    if (topologyKeys != null ? !topologyKeys.equals(that.topologyKeys) :that.topologyKeys != null) return false;
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
  class AllocatableNestedImpl<N> extends V1VolumeNodeResourcesFluentImpl<V1CSINodeDriverFluent.AllocatableNested<N>> implements V1CSINodeDriverFluent.AllocatableNested<N>,Nested<N>{
    AllocatableNestedImpl(V1VolumeNodeResources item) {
      this.builder = new V1VolumeNodeResourcesBuilder(this, item);
    }
    AllocatableNestedImpl() {
      this.builder = new V1VolumeNodeResourcesBuilder(this);
    }
    V1VolumeNodeResourcesBuilder builder;
    public N and() {
      return (N) V1CSINodeDriverFluentImpl.this.withAllocatable(builder.build());
    }
    public N endAllocatable() {
      return and();
    }
    
  }
  
}