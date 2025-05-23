package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.SuppressWarnings;
import io.kubernetes.client.fluent.Nested;
import java.util.ArrayList;
import java.lang.String;
import java.util.LinkedHashMap;
import java.util.function.Predicate;
import io.kubernetes.client.fluent.BaseFluent;
import java.util.Iterator;
import java.util.List;
import java.lang.Boolean;
import io.kubernetes.client.custom.Quantity;
import java.util.Collection;
import java.lang.Object;
import java.util.Map;

/**
 * Generated
 */
@SuppressWarnings("unchecked")
public class V1alpha3BasicDeviceFluent<A extends V1alpha3BasicDeviceFluent<A>> extends BaseFluent<A>{
  public V1alpha3BasicDeviceFluent() {
  }
  
  public V1alpha3BasicDeviceFluent(V1alpha3BasicDevice instance) {
    this.copyInstance(instance);
  }
  private Boolean allNodes;
  private Map<String,V1alpha3DeviceAttribute> attributes;
  private Map<String,Quantity> capacity;
  private ArrayList<V1alpha3DeviceCounterConsumptionBuilder> consumesCounters;
  private String nodeName;
  private V1NodeSelectorBuilder nodeSelector;
  private ArrayList<V1alpha3DeviceTaintBuilder> taints;
  
  protected void copyInstance(V1alpha3BasicDevice instance) {
    instance = (instance != null ? instance : new V1alpha3BasicDevice());
    if (instance != null) {
          this.withAllNodes(instance.getAllNodes());
          this.withAttributes(instance.getAttributes());
          this.withCapacity(instance.getCapacity());
          this.withConsumesCounters(instance.getConsumesCounters());
          this.withNodeName(instance.getNodeName());
          this.withNodeSelector(instance.getNodeSelector());
          this.withTaints(instance.getTaints());
        }
  }
  
  public Boolean getAllNodes() {
    return this.allNodes;
  }
  
  public A withAllNodes(Boolean allNodes) {
    this.allNodes = allNodes;
    return (A) this;
  }
  
  public boolean hasAllNodes() {
    return this.allNodes != null;
  }
  
  public A addToAttributes(String key,V1alpha3DeviceAttribute value) {
    if(this.attributes == null && key != null && value != null) { this.attributes = new LinkedHashMap(); }
    if(key != null && value != null) {this.attributes.put(key, value);} return (A)this;
  }
  
  public A addToAttributes(Map<String,V1alpha3DeviceAttribute> map) {
    if(this.attributes == null && map != null) { this.attributes = new LinkedHashMap(); }
    if(map != null) { this.attributes.putAll(map);} return (A)this;
  }
  
  public A removeFromAttributes(String key) {
    if(this.attributes == null) { return (A) this; }
    if(key != null && this.attributes != null) {this.attributes.remove(key);} return (A)this;
  }
  
  public A removeFromAttributes(Map<String,V1alpha3DeviceAttribute> map) {
    if(this.attributes == null) { return (A) this; }
    if(map != null) { for(Object key : map.keySet()) {if (this.attributes != null){this.attributes.remove(key);}}} return (A)this;
  }
  
  public Map<String,V1alpha3DeviceAttribute> getAttributes() {
    return this.attributes;
  }
  
  public <K,V>A withAttributes(Map<String,V1alpha3DeviceAttribute> attributes) {
    if (attributes == null) {
      this.attributes = null;
    } else {
      this.attributes = new LinkedHashMap(attributes);
    }
    return (A) this;
  }
  
  public boolean hasAttributes() {
    return this.attributes != null;
  }
  
  public A addToCapacity(String key,Quantity value) {
    if(this.capacity == null && key != null && value != null) { this.capacity = new LinkedHashMap(); }
    if(key != null && value != null) {this.capacity.put(key, value);} return (A)this;
  }
  
  public A addToCapacity(Map<String,Quantity> map) {
    if(this.capacity == null && map != null) { this.capacity = new LinkedHashMap(); }
    if(map != null) { this.capacity.putAll(map);} return (A)this;
  }
  
  public A removeFromCapacity(String key) {
    if(this.capacity == null) { return (A) this; }
    if(key != null && this.capacity != null) {this.capacity.remove(key);} return (A)this;
  }
  
  public A removeFromCapacity(Map<String,Quantity> map) {
    if(this.capacity == null) { return (A) this; }
    if(map != null) { for(Object key : map.keySet()) {if (this.capacity != null){this.capacity.remove(key);}}} return (A)this;
  }
  
  public Map<String,Quantity> getCapacity() {
    return this.capacity;
  }
  
  public <K,V>A withCapacity(Map<String,Quantity> capacity) {
    if (capacity == null) {
      this.capacity = null;
    } else {
      this.capacity = new LinkedHashMap(capacity);
    }
    return (A) this;
  }
  
  public boolean hasCapacity() {
    return this.capacity != null;
  }
  
  public A addToConsumesCounters(int index,V1alpha3DeviceCounterConsumption item) {
    if (this.consumesCounters == null) {this.consumesCounters = new ArrayList<V1alpha3DeviceCounterConsumptionBuilder>();}
    V1alpha3DeviceCounterConsumptionBuilder builder = new V1alpha3DeviceCounterConsumptionBuilder(item);
    if (index < 0 || index >= consumesCounters.size()) {
        _visitables.get("consumesCounters").add(builder);
        consumesCounters.add(builder);
    } else {
        _visitables.get("consumesCounters").add(builder);
        consumesCounters.add(index, builder);
    }
    return (A)this;
  }
  
  public A setToConsumesCounters(int index,V1alpha3DeviceCounterConsumption item) {
    if (this.consumesCounters == null) {this.consumesCounters = new ArrayList<V1alpha3DeviceCounterConsumptionBuilder>();}
    V1alpha3DeviceCounterConsumptionBuilder builder = new V1alpha3DeviceCounterConsumptionBuilder(item);
    if (index < 0 || index >= consumesCounters.size()) {
        _visitables.get("consumesCounters").add(builder);
        consumesCounters.add(builder);
    } else {
        _visitables.get("consumesCounters").add(builder);
        consumesCounters.set(index, builder);
    }
    return (A)this;
  }
  
  public A addToConsumesCounters(io.kubernetes.client.openapi.models.V1alpha3DeviceCounterConsumption... items) {
    if (this.consumesCounters == null) {this.consumesCounters = new ArrayList<V1alpha3DeviceCounterConsumptionBuilder>();}
    for (V1alpha3DeviceCounterConsumption item : items) {V1alpha3DeviceCounterConsumptionBuilder builder = new V1alpha3DeviceCounterConsumptionBuilder(item);_visitables.get("consumesCounters").add(builder);this.consumesCounters.add(builder);} return (A)this;
  }
  
  public A addAllToConsumesCounters(Collection<V1alpha3DeviceCounterConsumption> items) {
    if (this.consumesCounters == null) {this.consumesCounters = new ArrayList<V1alpha3DeviceCounterConsumptionBuilder>();}
    for (V1alpha3DeviceCounterConsumption item : items) {V1alpha3DeviceCounterConsumptionBuilder builder = new V1alpha3DeviceCounterConsumptionBuilder(item);_visitables.get("consumesCounters").add(builder);this.consumesCounters.add(builder);} return (A)this;
  }
  
  public A removeFromConsumesCounters(io.kubernetes.client.openapi.models.V1alpha3DeviceCounterConsumption... items) {
    if (this.consumesCounters == null) return (A)this;
    for (V1alpha3DeviceCounterConsumption item : items) {V1alpha3DeviceCounterConsumptionBuilder builder = new V1alpha3DeviceCounterConsumptionBuilder(item);_visitables.get("consumesCounters").remove(builder); this.consumesCounters.remove(builder);} return (A)this;
  }
  
  public A removeAllFromConsumesCounters(Collection<V1alpha3DeviceCounterConsumption> items) {
    if (this.consumesCounters == null) return (A)this;
    for (V1alpha3DeviceCounterConsumption item : items) {V1alpha3DeviceCounterConsumptionBuilder builder = new V1alpha3DeviceCounterConsumptionBuilder(item);_visitables.get("consumesCounters").remove(builder); this.consumesCounters.remove(builder);} return (A)this;
  }
  
  public A removeMatchingFromConsumesCounters(Predicate<V1alpha3DeviceCounterConsumptionBuilder> predicate) {
    if (consumesCounters == null) return (A) this;
    final Iterator<V1alpha3DeviceCounterConsumptionBuilder> each = consumesCounters.iterator();
    final List visitables = _visitables.get("consumesCounters");
    while (each.hasNext()) {
      V1alpha3DeviceCounterConsumptionBuilder builder = each.next();
      if (predicate.test(builder)) {
        visitables.remove(builder);
        each.remove();
      }
    }
    return (A)this;
  }
  
  public List<V1alpha3DeviceCounterConsumption> buildConsumesCounters() {
    return this.consumesCounters != null ? build(consumesCounters) : null;
  }
  
  public V1alpha3DeviceCounterConsumption buildConsumesCounter(int index) {
    return this.consumesCounters.get(index).build();
  }
  
  public V1alpha3DeviceCounterConsumption buildFirstConsumesCounter() {
    return this.consumesCounters.get(0).build();
  }
  
  public V1alpha3DeviceCounterConsumption buildLastConsumesCounter() {
    return this.consumesCounters.get(consumesCounters.size() - 1).build();
  }
  
  public V1alpha3DeviceCounterConsumption buildMatchingConsumesCounter(Predicate<V1alpha3DeviceCounterConsumptionBuilder> predicate) {
      for (V1alpha3DeviceCounterConsumptionBuilder item : consumesCounters) {
        if (predicate.test(item)) {
          return item.build();
        }
      }
      return null;
  }
  
  public boolean hasMatchingConsumesCounter(Predicate<V1alpha3DeviceCounterConsumptionBuilder> predicate) {
      for (V1alpha3DeviceCounterConsumptionBuilder item : consumesCounters) {
        if (predicate.test(item)) {
          return true;
        }
      }
      return false;
  }
  
  public A withConsumesCounters(List<V1alpha3DeviceCounterConsumption> consumesCounters) {
    if (this.consumesCounters != null) {
      this._visitables.get("consumesCounters").clear();
    }
    if (consumesCounters != null) {
        this.consumesCounters = new ArrayList();
        for (V1alpha3DeviceCounterConsumption item : consumesCounters) {
          this.addToConsumesCounters(item);
        }
    } else {
      this.consumesCounters = null;
    }
    return (A) this;
  }
  
  public A withConsumesCounters(io.kubernetes.client.openapi.models.V1alpha3DeviceCounterConsumption... consumesCounters) {
    if (this.consumesCounters != null) {
        this.consumesCounters.clear();
        _visitables.remove("consumesCounters");
    }
    if (consumesCounters != null) {
      for (V1alpha3DeviceCounterConsumption item : consumesCounters) {
        this.addToConsumesCounters(item);
      }
    }
    return (A) this;
  }
  
  public boolean hasConsumesCounters() {
    return this.consumesCounters != null && !this.consumesCounters.isEmpty();
  }
  
  public ConsumesCountersNested<A> addNewConsumesCounter() {
    return new ConsumesCountersNested(-1, null);
  }
  
  public ConsumesCountersNested<A> addNewConsumesCounterLike(V1alpha3DeviceCounterConsumption item) {
    return new ConsumesCountersNested(-1, item);
  }
  
  public ConsumesCountersNested<A> setNewConsumesCounterLike(int index,V1alpha3DeviceCounterConsumption item) {
    return new ConsumesCountersNested(index, item);
  }
  
  public ConsumesCountersNested<A> editConsumesCounter(int index) {
    if (consumesCounters.size() <= index) throw new RuntimeException("Can't edit consumesCounters. Index exceeds size.");
    return setNewConsumesCounterLike(index, buildConsumesCounter(index));
  }
  
  public ConsumesCountersNested<A> editFirstConsumesCounter() {
    if (consumesCounters.size() == 0) throw new RuntimeException("Can't edit first consumesCounters. The list is empty.");
    return setNewConsumesCounterLike(0, buildConsumesCounter(0));
  }
  
  public ConsumesCountersNested<A> editLastConsumesCounter() {
    int index = consumesCounters.size() - 1;
    if (index < 0) throw new RuntimeException("Can't edit last consumesCounters. The list is empty.");
    return setNewConsumesCounterLike(index, buildConsumesCounter(index));
  }
  
  public ConsumesCountersNested<A> editMatchingConsumesCounter(Predicate<V1alpha3DeviceCounterConsumptionBuilder> predicate) {
    int index = -1;
    for (int i=0;i<consumesCounters.size();i++) { 
    if (predicate.test(consumesCounters.get(i))) {index = i; break;}
    } 
    if (index < 0) throw new RuntimeException("Can't edit matching consumesCounters. No match found.");
    return setNewConsumesCounterLike(index, buildConsumesCounter(index));
  }
  
  public String getNodeName() {
    return this.nodeName;
  }
  
  public A withNodeName(String nodeName) {
    this.nodeName = nodeName;
    return (A) this;
  }
  
  public boolean hasNodeName() {
    return this.nodeName != null;
  }
  
  public V1NodeSelector buildNodeSelector() {
    return this.nodeSelector != null ? this.nodeSelector.build() : null;
  }
  
  public A withNodeSelector(V1NodeSelector nodeSelector) {
    this._visitables.remove("nodeSelector");
    if (nodeSelector != null) {
        this.nodeSelector = new V1NodeSelectorBuilder(nodeSelector);
        this._visitables.get("nodeSelector").add(this.nodeSelector);
    } else {
        this.nodeSelector = null;
        this._visitables.get("nodeSelector").remove(this.nodeSelector);
    }
    return (A) this;
  }
  
  public boolean hasNodeSelector() {
    return this.nodeSelector != null;
  }
  
  public NodeSelectorNested<A> withNewNodeSelector() {
    return new NodeSelectorNested(null);
  }
  
  public NodeSelectorNested<A> withNewNodeSelectorLike(V1NodeSelector item) {
    return new NodeSelectorNested(item);
  }
  
  public NodeSelectorNested<A> editNodeSelector() {
    return withNewNodeSelectorLike(java.util.Optional.ofNullable(buildNodeSelector()).orElse(null));
  }
  
  public NodeSelectorNested<A> editOrNewNodeSelector() {
    return withNewNodeSelectorLike(java.util.Optional.ofNullable(buildNodeSelector()).orElse(new V1NodeSelectorBuilder().build()));
  }
  
  public NodeSelectorNested<A> editOrNewNodeSelectorLike(V1NodeSelector item) {
    return withNewNodeSelectorLike(java.util.Optional.ofNullable(buildNodeSelector()).orElse(item));
  }
  
  public A addToTaints(int index,V1alpha3DeviceTaint item) {
    if (this.taints == null) {this.taints = new ArrayList<V1alpha3DeviceTaintBuilder>();}
    V1alpha3DeviceTaintBuilder builder = new V1alpha3DeviceTaintBuilder(item);
    if (index < 0 || index >= taints.size()) {
        _visitables.get("taints").add(builder);
        taints.add(builder);
    } else {
        _visitables.get("taints").add(builder);
        taints.add(index, builder);
    }
    return (A)this;
  }
  
  public A setToTaints(int index,V1alpha3DeviceTaint item) {
    if (this.taints == null) {this.taints = new ArrayList<V1alpha3DeviceTaintBuilder>();}
    V1alpha3DeviceTaintBuilder builder = new V1alpha3DeviceTaintBuilder(item);
    if (index < 0 || index >= taints.size()) {
        _visitables.get("taints").add(builder);
        taints.add(builder);
    } else {
        _visitables.get("taints").add(builder);
        taints.set(index, builder);
    }
    return (A)this;
  }
  
  public A addToTaints(io.kubernetes.client.openapi.models.V1alpha3DeviceTaint... items) {
    if (this.taints == null) {this.taints = new ArrayList<V1alpha3DeviceTaintBuilder>();}
    for (V1alpha3DeviceTaint item : items) {V1alpha3DeviceTaintBuilder builder = new V1alpha3DeviceTaintBuilder(item);_visitables.get("taints").add(builder);this.taints.add(builder);} return (A)this;
  }
  
  public A addAllToTaints(Collection<V1alpha3DeviceTaint> items) {
    if (this.taints == null) {this.taints = new ArrayList<V1alpha3DeviceTaintBuilder>();}
    for (V1alpha3DeviceTaint item : items) {V1alpha3DeviceTaintBuilder builder = new V1alpha3DeviceTaintBuilder(item);_visitables.get("taints").add(builder);this.taints.add(builder);} return (A)this;
  }
  
  public A removeFromTaints(io.kubernetes.client.openapi.models.V1alpha3DeviceTaint... items) {
    if (this.taints == null) return (A)this;
    for (V1alpha3DeviceTaint item : items) {V1alpha3DeviceTaintBuilder builder = new V1alpha3DeviceTaintBuilder(item);_visitables.get("taints").remove(builder); this.taints.remove(builder);} return (A)this;
  }
  
  public A removeAllFromTaints(Collection<V1alpha3DeviceTaint> items) {
    if (this.taints == null) return (A)this;
    for (V1alpha3DeviceTaint item : items) {V1alpha3DeviceTaintBuilder builder = new V1alpha3DeviceTaintBuilder(item);_visitables.get("taints").remove(builder); this.taints.remove(builder);} return (A)this;
  }
  
  public A removeMatchingFromTaints(Predicate<V1alpha3DeviceTaintBuilder> predicate) {
    if (taints == null) return (A) this;
    final Iterator<V1alpha3DeviceTaintBuilder> each = taints.iterator();
    final List visitables = _visitables.get("taints");
    while (each.hasNext()) {
      V1alpha3DeviceTaintBuilder builder = each.next();
      if (predicate.test(builder)) {
        visitables.remove(builder);
        each.remove();
      }
    }
    return (A)this;
  }
  
  public List<V1alpha3DeviceTaint> buildTaints() {
    return this.taints != null ? build(taints) : null;
  }
  
  public V1alpha3DeviceTaint buildTaint(int index) {
    return this.taints.get(index).build();
  }
  
  public V1alpha3DeviceTaint buildFirstTaint() {
    return this.taints.get(0).build();
  }
  
  public V1alpha3DeviceTaint buildLastTaint() {
    return this.taints.get(taints.size() - 1).build();
  }
  
  public V1alpha3DeviceTaint buildMatchingTaint(Predicate<V1alpha3DeviceTaintBuilder> predicate) {
      for (V1alpha3DeviceTaintBuilder item : taints) {
        if (predicate.test(item)) {
          return item.build();
        }
      }
      return null;
  }
  
  public boolean hasMatchingTaint(Predicate<V1alpha3DeviceTaintBuilder> predicate) {
      for (V1alpha3DeviceTaintBuilder item : taints) {
        if (predicate.test(item)) {
          return true;
        }
      }
      return false;
  }
  
  public A withTaints(List<V1alpha3DeviceTaint> taints) {
    if (this.taints != null) {
      this._visitables.get("taints").clear();
    }
    if (taints != null) {
        this.taints = new ArrayList();
        for (V1alpha3DeviceTaint item : taints) {
          this.addToTaints(item);
        }
    } else {
      this.taints = null;
    }
    return (A) this;
  }
  
  public A withTaints(io.kubernetes.client.openapi.models.V1alpha3DeviceTaint... taints) {
    if (this.taints != null) {
        this.taints.clear();
        _visitables.remove("taints");
    }
    if (taints != null) {
      for (V1alpha3DeviceTaint item : taints) {
        this.addToTaints(item);
      }
    }
    return (A) this;
  }
  
  public boolean hasTaints() {
    return this.taints != null && !this.taints.isEmpty();
  }
  
  public TaintsNested<A> addNewTaint() {
    return new TaintsNested(-1, null);
  }
  
  public TaintsNested<A> addNewTaintLike(V1alpha3DeviceTaint item) {
    return new TaintsNested(-1, item);
  }
  
  public TaintsNested<A> setNewTaintLike(int index,V1alpha3DeviceTaint item) {
    return new TaintsNested(index, item);
  }
  
  public TaintsNested<A> editTaint(int index) {
    if (taints.size() <= index) throw new RuntimeException("Can't edit taints. Index exceeds size.");
    return setNewTaintLike(index, buildTaint(index));
  }
  
  public TaintsNested<A> editFirstTaint() {
    if (taints.size() == 0) throw new RuntimeException("Can't edit first taints. The list is empty.");
    return setNewTaintLike(0, buildTaint(0));
  }
  
  public TaintsNested<A> editLastTaint() {
    int index = taints.size() - 1;
    if (index < 0) throw new RuntimeException("Can't edit last taints. The list is empty.");
    return setNewTaintLike(index, buildTaint(index));
  }
  
  public TaintsNested<A> editMatchingTaint(Predicate<V1alpha3DeviceTaintBuilder> predicate) {
    int index = -1;
    for (int i=0;i<taints.size();i++) { 
    if (predicate.test(taints.get(i))) {index = i; break;}
    } 
    if (index < 0) throw new RuntimeException("Can't edit matching taints. No match found.");
    return setNewTaintLike(index, buildTaint(index));
  }
  
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    V1alpha3BasicDeviceFluent that = (V1alpha3BasicDeviceFluent) o;
    if (!java.util.Objects.equals(allNodes, that.allNodes)) return false;
    if (!java.util.Objects.equals(attributes, that.attributes)) return false;
    if (!java.util.Objects.equals(capacity, that.capacity)) return false;
    if (!java.util.Objects.equals(consumesCounters, that.consumesCounters)) return false;
    if (!java.util.Objects.equals(nodeName, that.nodeName)) return false;
    if (!java.util.Objects.equals(nodeSelector, that.nodeSelector)) return false;
    if (!java.util.Objects.equals(taints, that.taints)) return false;
    return true;
  }
  
  public int hashCode() {
    return java.util.Objects.hash(allNodes,  attributes,  capacity,  consumesCounters,  nodeName,  nodeSelector,  taints,  super.hashCode());
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (allNodes != null) { sb.append("allNodes:"); sb.append(allNodes + ","); }
    if (attributes != null && !attributes.isEmpty()) { sb.append("attributes:"); sb.append(attributes + ","); }
    if (capacity != null && !capacity.isEmpty()) { sb.append("capacity:"); sb.append(capacity + ","); }
    if (consumesCounters != null && !consumesCounters.isEmpty()) { sb.append("consumesCounters:"); sb.append(consumesCounters + ","); }
    if (nodeName != null) { sb.append("nodeName:"); sb.append(nodeName + ","); }
    if (nodeSelector != null) { sb.append("nodeSelector:"); sb.append(nodeSelector + ","); }
    if (taints != null && !taints.isEmpty()) { sb.append("taints:"); sb.append(taints); }
    sb.append("}");
    return sb.toString();
  }
  
  public A withAllNodes() {
    return withAllNodes(true);
  }
  public class ConsumesCountersNested<N> extends V1alpha3DeviceCounterConsumptionFluent<ConsumesCountersNested<N>> implements Nested<N>{
    ConsumesCountersNested(int index,V1alpha3DeviceCounterConsumption item) {
      this.index = index;
      this.builder = new V1alpha3DeviceCounterConsumptionBuilder(this, item);
    }
    V1alpha3DeviceCounterConsumptionBuilder builder;
    int index;
    
    public N and() {
      return (N) V1alpha3BasicDeviceFluent.this.setToConsumesCounters(index,builder.build());
    }
    
    public N endConsumesCounter() {
      return and();
    }
    
  
  }
  public class NodeSelectorNested<N> extends V1NodeSelectorFluent<NodeSelectorNested<N>> implements Nested<N>{
    NodeSelectorNested(V1NodeSelector item) {
      this.builder = new V1NodeSelectorBuilder(this, item);
    }
    V1NodeSelectorBuilder builder;
    
    public N and() {
      return (N) V1alpha3BasicDeviceFluent.this.withNodeSelector(builder.build());
    }
    
    public N endNodeSelector() {
      return and();
    }
    
  
  }
  public class TaintsNested<N> extends V1alpha3DeviceTaintFluent<TaintsNested<N>> implements Nested<N>{
    TaintsNested(int index,V1alpha3DeviceTaint item) {
      this.index = index;
      this.builder = new V1alpha3DeviceTaintBuilder(this, item);
    }
    V1alpha3DeviceTaintBuilder builder;
    int index;
    
    public N and() {
      return (N) V1alpha3BasicDeviceFluent.this.setToTaints(index,builder.build());
    }
    
    public N endTaint() {
      return and();
    }
    
  
  }

}