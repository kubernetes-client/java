package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.SuppressWarnings;
import io.kubernetes.client.fluent.Nested;
import java.util.ArrayList;
import io.kubernetes.client.custom.Quantity;
import java.lang.String;
import java.util.LinkedHashMap;
import java.util.function.Predicate;
import java.lang.Deprecated;
import io.kubernetes.client.fluent.BaseFluent;
import java.util.Iterator;
import java.util.Collection;
import java.lang.Object;
import java.util.List;
import java.lang.Boolean;
import java.util.Map;

 /**
  * Generated
  */
  @SuppressWarnings(value = "unchecked")
  public class V1PersistentVolumeClaimStatusFluentImpl<A extends V1PersistentVolumeClaimStatusFluent<A>> extends BaseFluent<A> implements V1PersistentVolumeClaimStatusFluent<A>{
  public V1PersistentVolumeClaimStatusFluentImpl() {
  }
  public V1PersistentVolumeClaimStatusFluentImpl(V1PersistentVolumeClaimStatus instance) {
    if (instance != null) {
      this.withAccessModes(instance.getAccessModes());
      this.withAllocatedResources(instance.getAllocatedResources());
      this.withCapacity(instance.getCapacity());
      this.withConditions(instance.getConditions());
      this.withPhase(instance.getPhase());
      this.withResizeStatus(instance.getResizeStatus());
    }
  }
  private List<String> accessModes;
  private Map<String,Quantity> allocatedResources;
  private Map<String,Quantity> capacity;
  private ArrayList<V1PersistentVolumeClaimConditionBuilder> conditions;
  private String phase;
  private String resizeStatus;
  public A addToAccessModes(int index,String item) {
    if (this.accessModes == null) {this.accessModes = new ArrayList<String>();}
    this.accessModes.add(index, item);
    return (A)this;
  }
  public A setToAccessModes(int index,String item) {
    if (this.accessModes == null) {this.accessModes = new ArrayList<String>();}
    this.accessModes.set(index, item); return (A)this;
  }
  public A addToAccessModes(java.lang.String... items) {
    if (this.accessModes == null) {this.accessModes = new ArrayList<String>();}
    for (String item : items) {this.accessModes.add(item);} return (A)this;
  }
  public A addAllToAccessModes(Collection<String> items) {
    if (this.accessModes == null) {this.accessModes = new ArrayList<String>();}
    for (String item : items) {this.accessModes.add(item);} return (A)this;
  }
  public A removeFromAccessModes(java.lang.String... items) {
    for (String item : items) {if (this.accessModes!= null){ this.accessModes.remove(item);}} return (A)this;
  }
  public A removeAllFromAccessModes(Collection<String> items) {
    for (String item : items) {if (this.accessModes!= null){ this.accessModes.remove(item);}} return (A)this;
  }
  public List<String> getAccessModes() {
    return this.accessModes;
  }
  public String getAccessMode(int index) {
    return this.accessModes.get(index);
  }
  public String getFirstAccessMode() {
    return this.accessModes.get(0);
  }
  public String getLastAccessMode() {
    return this.accessModes.get(accessModes.size() - 1);
  }
  public String getMatchingAccessMode(Predicate<String> predicate) {
    for (String item: accessModes) { if(predicate.test(item)){ return item;} } return null;
  }
  public Boolean hasMatchingAccessMode(Predicate<String> predicate) {
    for (String item: accessModes) { if(predicate.test(item)){ return true;} } return false;
  }
  public A withAccessModes(List<String> accessModes) {
    if (accessModes != null) {this.accessModes = new ArrayList(); for (String item : accessModes){this.addToAccessModes(item);}} else { this.accessModes = null;} return (A) this;
  }
  public A withAccessModes(java.lang.String... accessModes) {
    if (this.accessModes != null) {this.accessModes.clear(); _visitables.remove("accessModes"); }
    if (accessModes != null) {for (String item :accessModes){ this.addToAccessModes(item);}} return (A) this;
  }
  public Boolean hasAccessModes() {
    return accessModes != null && !accessModes.isEmpty();
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
    if (allocatedResources == null) { this.allocatedResources =  null;} else {this.allocatedResources = new LinkedHashMap(allocatedResources);} return (A) this;
  }
  public Boolean hasAllocatedResources() {
    return this.allocatedResources != null;
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
    if (capacity == null) { this.capacity =  null;} else {this.capacity = new LinkedHashMap(capacity);} return (A) this;
  }
  public Boolean hasCapacity() {
    return this.capacity != null;
  }
  public A addToConditions(int index,V1PersistentVolumeClaimCondition item) {
    if (this.conditions == null) {this.conditions = new ArrayList<V1PersistentVolumeClaimConditionBuilder>();}
    V1PersistentVolumeClaimConditionBuilder builder = new V1PersistentVolumeClaimConditionBuilder(item);
    if (index < 0 || index >= conditions.size()) { _visitables.get("conditions").add(builder); conditions.add(builder); } else { _visitables.get("conditions").add(index, builder); conditions.add(index, builder);}
    return (A)this;
  }
  public A setToConditions(int index,V1PersistentVolumeClaimCondition item) {
    if (this.conditions == null) {this.conditions = new ArrayList<V1PersistentVolumeClaimConditionBuilder>();}
    V1PersistentVolumeClaimConditionBuilder builder = new V1PersistentVolumeClaimConditionBuilder(item);
    if (index < 0 || index >= conditions.size()) { _visitables.get("conditions").add(builder); conditions.add(builder); } else { _visitables.get("conditions").set(index, builder); conditions.set(index, builder);}
    return (A)this;
  }
  public A addToConditions(io.kubernetes.client.openapi.models.V1PersistentVolumeClaimCondition... items) {
    if (this.conditions == null) {this.conditions = new ArrayList<V1PersistentVolumeClaimConditionBuilder>();}
    for (V1PersistentVolumeClaimCondition item : items) {V1PersistentVolumeClaimConditionBuilder builder = new V1PersistentVolumeClaimConditionBuilder(item);_visitables.get("conditions").add(builder);this.conditions.add(builder);} return (A)this;
  }
  public A addAllToConditions(Collection<V1PersistentVolumeClaimCondition> items) {
    if (this.conditions == null) {this.conditions = new ArrayList<V1PersistentVolumeClaimConditionBuilder>();}
    for (V1PersistentVolumeClaimCondition item : items) {V1PersistentVolumeClaimConditionBuilder builder = new V1PersistentVolumeClaimConditionBuilder(item);_visitables.get("conditions").add(builder);this.conditions.add(builder);} return (A)this;
  }
  public A removeFromConditions(io.kubernetes.client.openapi.models.V1PersistentVolumeClaimCondition... items) {
    for (V1PersistentVolumeClaimCondition item : items) {V1PersistentVolumeClaimConditionBuilder builder = new V1PersistentVolumeClaimConditionBuilder(item);_visitables.get("conditions").remove(builder);if (this.conditions != null) {this.conditions.remove(builder);}} return (A)this;
  }
  public A removeAllFromConditions(Collection<V1PersistentVolumeClaimCondition> items) {
    for (V1PersistentVolumeClaimCondition item : items) {V1PersistentVolumeClaimConditionBuilder builder = new V1PersistentVolumeClaimConditionBuilder(item);_visitables.get("conditions").remove(builder);if (this.conditions != null) {this.conditions.remove(builder);}} return (A)this;
  }
  public A removeMatchingFromConditions(Predicate<V1PersistentVolumeClaimConditionBuilder> predicate) {
    if (conditions == null) return (A) this;
    final Iterator<V1PersistentVolumeClaimConditionBuilder> each = conditions.iterator();
    final List visitables = _visitables.get("conditions");
    while (each.hasNext()) {
      V1PersistentVolumeClaimConditionBuilder builder = each.next();
      if (predicate.test(builder)) {
        visitables.remove(builder);
        each.remove();
      }
    }
    return (A)this;
  }
  
  /**
   * This method has been deprecated, please use method buildConditions instead.
   * @return The buildable object.
   */
  @Deprecated
  public List<V1PersistentVolumeClaimCondition> getConditions() {
    return conditions != null ? build(conditions) : null;
  }
  public List<V1PersistentVolumeClaimCondition> buildConditions() {
    return conditions != null ? build(conditions) : null;
  }
  public V1PersistentVolumeClaimCondition buildCondition(int index) {
    return this.conditions.get(index).build();
  }
  public V1PersistentVolumeClaimCondition buildFirstCondition() {
    return this.conditions.get(0).build();
  }
  public V1PersistentVolumeClaimCondition buildLastCondition() {
    return this.conditions.get(conditions.size() - 1).build();
  }
  public V1PersistentVolumeClaimCondition buildMatchingCondition(Predicate<V1PersistentVolumeClaimConditionBuilder> predicate) {
    for (V1PersistentVolumeClaimConditionBuilder item: conditions) { if(predicate.test(item)){ return item.build();} } return null;
  }
  public Boolean hasMatchingCondition(Predicate<V1PersistentVolumeClaimConditionBuilder> predicate) {
    for (V1PersistentVolumeClaimConditionBuilder item: conditions) { if(predicate.test(item)){ return true;} } return false;
  }
  public A withConditions(List<V1PersistentVolumeClaimCondition> conditions) {
    if (this.conditions != null) { _visitables.get("conditions").clear();}
    if (conditions != null) {this.conditions = new ArrayList(); for (V1PersistentVolumeClaimCondition item : conditions){this.addToConditions(item);}} else { this.conditions = null;} return (A) this;
  }
  public A withConditions(io.kubernetes.client.openapi.models.V1PersistentVolumeClaimCondition... conditions) {
    if (this.conditions != null) {this.conditions.clear(); _visitables.remove("conditions"); }
    if (conditions != null) {for (V1PersistentVolumeClaimCondition item :conditions){ this.addToConditions(item);}} return (A) this;
  }
  public Boolean hasConditions() {
    return conditions != null && !conditions.isEmpty();
  }
  public V1PersistentVolumeClaimStatusFluentImpl.ConditionsNested<A> addNewCondition() {
    return new V1PersistentVolumeClaimStatusFluentImpl.ConditionsNestedImpl();
  }
  public V1PersistentVolumeClaimStatusFluentImpl.ConditionsNested<A> addNewConditionLike(V1PersistentVolumeClaimCondition item) {
    return new V1PersistentVolumeClaimStatusFluentImpl.ConditionsNestedImpl(-1, item);
  }
  public V1PersistentVolumeClaimStatusFluentImpl.ConditionsNested<A> setNewConditionLike(int index,V1PersistentVolumeClaimCondition item) {
    return new V1PersistentVolumeClaimStatusFluentImpl.ConditionsNestedImpl(index, item);
  }
  public V1PersistentVolumeClaimStatusFluentImpl.ConditionsNested<A> editCondition(int index) {
    if (conditions.size() <= index) throw new RuntimeException("Can't edit conditions. Index exceeds size.");
    return setNewConditionLike(index, buildCondition(index));
  }
  public V1PersistentVolumeClaimStatusFluentImpl.ConditionsNested<A> editFirstCondition() {
    if (conditions.size() == 0) throw new RuntimeException("Can't edit first conditions. The list is empty.");
    return setNewConditionLike(0, buildCondition(0));
  }
  public V1PersistentVolumeClaimStatusFluentImpl.ConditionsNested<A> editLastCondition() {
    int index = conditions.size() - 1;
    if (index < 0) throw new RuntimeException("Can't edit last conditions. The list is empty.");
    return setNewConditionLike(index, buildCondition(index));
  }
  public V1PersistentVolumeClaimStatusFluentImpl.ConditionsNested<A> editMatchingCondition(Predicate<V1PersistentVolumeClaimConditionBuilder> predicate) {
    int index = -1;
    for (int i=0;i<conditions.size();i++) { 
    if (predicate.test(conditions.get(i))) {index = i; break;}
    } 
    if (index < 0) throw new RuntimeException("Can't edit matching conditions. No match found.");
    return setNewConditionLike(index, buildCondition(index));
  }
  public String getPhase() {
    return this.phase;
  }
  public A withPhase(String phase) {
    this.phase=phase; return (A) this;
  }
  public Boolean hasPhase() {
    return this.phase != null;
  }
  public String getResizeStatus() {
    return this.resizeStatus;
  }
  public A withResizeStatus(String resizeStatus) {
    this.resizeStatus=resizeStatus; return (A) this;
  }
  public Boolean hasResizeStatus() {
    return this.resizeStatus != null;
  }
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    V1PersistentVolumeClaimStatusFluentImpl that = (V1PersistentVolumeClaimStatusFluentImpl) o;
    if (!java.util.Objects.equals(accessModes, that.accessModes)) return false;

    if (!java.util.Objects.equals(allocatedResources, that.allocatedResources)) return false;

    if (!java.util.Objects.equals(capacity, that.capacity)) return false;

    if (!java.util.Objects.equals(conditions, that.conditions)) return false;

    if (!java.util.Objects.equals(phase, that.phase)) return false;

    if (!java.util.Objects.equals(resizeStatus, that.resizeStatus)) return false;

    return true;
  }
  public int hashCode() {
    return java.util.Objects.hash(accessModes,  allocatedResources,  capacity,  conditions,  phase,  resizeStatus,  super.hashCode());
  }
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (accessModes != null && !accessModes.isEmpty()) { sb.append("accessModes:"); sb.append(accessModes + ","); }
    if (allocatedResources != null && !allocatedResources.isEmpty()) { sb.append("allocatedResources:"); sb.append(allocatedResources + ","); }
    if (capacity != null && !capacity.isEmpty()) { sb.append("capacity:"); sb.append(capacity + ","); }
    if (conditions != null) { sb.append("conditions:"); sb.append(conditions + ","); }
    if (phase != null) { sb.append("phase:"); sb.append(phase + ","); }
    if (resizeStatus != null) { sb.append("resizeStatus:"); sb.append(resizeStatus); }
    sb.append("}");
    return sb.toString();
  }
  class ConditionsNestedImpl<N> extends V1PersistentVolumeClaimConditionFluentImpl<V1PersistentVolumeClaimStatusFluentImpl.ConditionsNested<N>> implements V1PersistentVolumeClaimStatusFluentImpl.ConditionsNested<N>,Nested<N>{
    ConditionsNestedImpl(int index,V1PersistentVolumeClaimCondition item) {
      this.index = index;
      this.builder = new V1PersistentVolumeClaimConditionBuilder(this, item);
    }
    ConditionsNestedImpl() {
      this.index = -1;
      this.builder = new V1PersistentVolumeClaimConditionBuilder(this);
    }
    V1PersistentVolumeClaimConditionBuilder builder;
    int index;
    public N and() {
      return (N) V1PersistentVolumeClaimStatusFluentImpl.this.setToConditions(index,builder.build());
    }
    public N endCondition() {
      return and();
    }
    
  }
  
}