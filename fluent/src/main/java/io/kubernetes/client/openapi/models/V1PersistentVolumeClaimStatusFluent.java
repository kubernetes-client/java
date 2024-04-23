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
import io.kubernetes.client.custom.Quantity;
import java.util.Collection;
import java.lang.Object;
import java.util.Map;

/**
 * Generated
 */
@SuppressWarnings("unchecked")
public class V1PersistentVolumeClaimStatusFluent<A extends V1PersistentVolumeClaimStatusFluent<A>> extends BaseFluent<A>{
  public V1PersistentVolumeClaimStatusFluent() {
  }
  
  public V1PersistentVolumeClaimStatusFluent(V1PersistentVolumeClaimStatus instance) {
    this.copyInstance(instance);
  }
  private List<String> accessModes;
  private Map<String,String> allocatedResourceStatuses;
  private Map<String,Quantity> allocatedResources;
  private Map<String,Quantity> capacity;
  private ArrayList<V1PersistentVolumeClaimConditionBuilder> conditions;
  private String currentVolumeAttributesClassName;
  private V1ModifyVolumeStatusBuilder modifyVolumeStatus;
  private String phase;
  
  protected void copyInstance(V1PersistentVolumeClaimStatus instance) {
    instance = (instance != null ? instance : new V1PersistentVolumeClaimStatus());
    if (instance != null) {
          this.withAccessModes(instance.getAccessModes());
          this.withAllocatedResourceStatuses(instance.getAllocatedResourceStatuses());
          this.withAllocatedResources(instance.getAllocatedResources());
          this.withCapacity(instance.getCapacity());
          this.withConditions(instance.getConditions());
          this.withCurrentVolumeAttributesClassName(instance.getCurrentVolumeAttributesClassName());
          this.withModifyVolumeStatus(instance.getModifyVolumeStatus());
          this.withPhase(instance.getPhase());
        }
  }
  
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
    if (this.accessModes == null) return (A)this;
    for (String item : items) { this.accessModes.remove(item);} return (A)this;
  }
  
  public A removeAllFromAccessModes(Collection<String> items) {
    if (this.accessModes == null) return (A)this;
    for (String item : items) { this.accessModes.remove(item);} return (A)this;
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
      for (String item : accessModes) {
        if (predicate.test(item)) {
          return item;
        }
      }
      return null;
  }
  
  public boolean hasMatchingAccessMode(Predicate<String> predicate) {
      for (String item : accessModes) {
        if (predicate.test(item)) {
          return true;
        }
      }
      return false;
  }
  
  public A withAccessModes(List<String> accessModes) {
    if (accessModes != null) {
        this.accessModes = new ArrayList();
        for (String item : accessModes) {
          this.addToAccessModes(item);
        }
    } else {
      this.accessModes = null;
    }
    return (A) this;
  }
  
  public A withAccessModes(java.lang.String... accessModes) {
    if (this.accessModes != null) {
        this.accessModes.clear();
        _visitables.remove("accessModes");
    }
    if (accessModes != null) {
      for (String item : accessModes) {
        this.addToAccessModes(item);
      }
    }
    return (A) this;
  }
  
  public boolean hasAccessModes() {
    return this.accessModes != null && !this.accessModes.isEmpty();
  }
  
  public A addToAllocatedResourceStatuses(String key,String value) {
    if(this.allocatedResourceStatuses == null && key != null && value != null) { this.allocatedResourceStatuses = new LinkedHashMap(); }
    if(key != null && value != null) {this.allocatedResourceStatuses.put(key, value);} return (A)this;
  }
  
  public A addToAllocatedResourceStatuses(Map<String,String> map) {
    if(this.allocatedResourceStatuses == null && map != null) { this.allocatedResourceStatuses = new LinkedHashMap(); }
    if(map != null) { this.allocatedResourceStatuses.putAll(map);} return (A)this;
  }
  
  public A removeFromAllocatedResourceStatuses(String key) {
    if(this.allocatedResourceStatuses == null) { return (A) this; }
    if(key != null && this.allocatedResourceStatuses != null) {this.allocatedResourceStatuses.remove(key);} return (A)this;
  }
  
  public A removeFromAllocatedResourceStatuses(Map<String,String> map) {
    if(this.allocatedResourceStatuses == null) { return (A) this; }
    if(map != null) { for(Object key : map.keySet()) {if (this.allocatedResourceStatuses != null){this.allocatedResourceStatuses.remove(key);}}} return (A)this;
  }
  
  public Map<String,String> getAllocatedResourceStatuses() {
    return this.allocatedResourceStatuses;
  }
  
  public <K,V>A withAllocatedResourceStatuses(Map<String,String> allocatedResourceStatuses) {
    if (allocatedResourceStatuses == null) {
      this.allocatedResourceStatuses = null;
    } else {
      this.allocatedResourceStatuses = new LinkedHashMap(allocatedResourceStatuses);
    }
    return (A) this;
  }
  
  public boolean hasAllocatedResourceStatuses() {
    return this.allocatedResourceStatuses != null;
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
    if (this.conditions == null) return (A)this;
    for (V1PersistentVolumeClaimCondition item : items) {V1PersistentVolumeClaimConditionBuilder builder = new V1PersistentVolumeClaimConditionBuilder(item);_visitables.get("conditions").remove(builder); this.conditions.remove(builder);} return (A)this;
  }
  
  public A removeAllFromConditions(Collection<V1PersistentVolumeClaimCondition> items) {
    if (this.conditions == null) return (A)this;
    for (V1PersistentVolumeClaimCondition item : items) {V1PersistentVolumeClaimConditionBuilder builder = new V1PersistentVolumeClaimConditionBuilder(item);_visitables.get("conditions").remove(builder); this.conditions.remove(builder);} return (A)this;
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
  
  public List<V1PersistentVolumeClaimCondition> buildConditions() {
    return this.conditions != null ? build(conditions) : null;
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
      for (V1PersistentVolumeClaimConditionBuilder item : conditions) {
        if (predicate.test(item)) {
          return item.build();
        }
      }
      return null;
  }
  
  public boolean hasMatchingCondition(Predicate<V1PersistentVolumeClaimConditionBuilder> predicate) {
      for (V1PersistentVolumeClaimConditionBuilder item : conditions) {
        if (predicate.test(item)) {
          return true;
        }
      }
      return false;
  }
  
  public A withConditions(List<V1PersistentVolumeClaimCondition> conditions) {
    if (this.conditions != null) {
      this._visitables.get("conditions").clear();
    }
    if (conditions != null) {
        this.conditions = new ArrayList();
        for (V1PersistentVolumeClaimCondition item : conditions) {
          this.addToConditions(item);
        }
    } else {
      this.conditions = null;
    }
    return (A) this;
  }
  
  public A withConditions(io.kubernetes.client.openapi.models.V1PersistentVolumeClaimCondition... conditions) {
    if (this.conditions != null) {
        this.conditions.clear();
        _visitables.remove("conditions");
    }
    if (conditions != null) {
      for (V1PersistentVolumeClaimCondition item : conditions) {
        this.addToConditions(item);
      }
    }
    return (A) this;
  }
  
  public boolean hasConditions() {
    return this.conditions != null && !this.conditions.isEmpty();
  }
  
  public ConditionsNested<A> addNewCondition() {
    return new ConditionsNested(-1, null);
  }
  
  public ConditionsNested<A> addNewConditionLike(V1PersistentVolumeClaimCondition item) {
    return new ConditionsNested(-1, item);
  }
  
  public ConditionsNested<A> setNewConditionLike(int index,V1PersistentVolumeClaimCondition item) {
    return new ConditionsNested(index, item);
  }
  
  public ConditionsNested<A> editCondition(int index) {
    if (conditions.size() <= index) throw new RuntimeException("Can't edit conditions. Index exceeds size.");
    return setNewConditionLike(index, buildCondition(index));
  }
  
  public ConditionsNested<A> editFirstCondition() {
    if (conditions.size() == 0) throw new RuntimeException("Can't edit first conditions. The list is empty.");
    return setNewConditionLike(0, buildCondition(0));
  }
  
  public ConditionsNested<A> editLastCondition() {
    int index = conditions.size() - 1;
    if (index < 0) throw new RuntimeException("Can't edit last conditions. The list is empty.");
    return setNewConditionLike(index, buildCondition(index));
  }
  
  public ConditionsNested<A> editMatchingCondition(Predicate<V1PersistentVolumeClaimConditionBuilder> predicate) {
    int index = -1;
    for (int i=0;i<conditions.size();i++) { 
    if (predicate.test(conditions.get(i))) {index = i; break;}
    } 
    if (index < 0) throw new RuntimeException("Can't edit matching conditions. No match found.");
    return setNewConditionLike(index, buildCondition(index));
  }
  
  public String getCurrentVolumeAttributesClassName() {
    return this.currentVolumeAttributesClassName;
  }
  
  public A withCurrentVolumeAttributesClassName(String currentVolumeAttributesClassName) {
    this.currentVolumeAttributesClassName = currentVolumeAttributesClassName;
    return (A) this;
  }
  
  public boolean hasCurrentVolumeAttributesClassName() {
    return this.currentVolumeAttributesClassName != null;
  }
  
  public V1ModifyVolumeStatus buildModifyVolumeStatus() {
    return this.modifyVolumeStatus != null ? this.modifyVolumeStatus.build() : null;
  }
  
  public A withModifyVolumeStatus(V1ModifyVolumeStatus modifyVolumeStatus) {
    this._visitables.remove("modifyVolumeStatus");
    if (modifyVolumeStatus != null) {
        this.modifyVolumeStatus = new V1ModifyVolumeStatusBuilder(modifyVolumeStatus);
        this._visitables.get("modifyVolumeStatus").add(this.modifyVolumeStatus);
    } else {
        this.modifyVolumeStatus = null;
        this._visitables.get("modifyVolumeStatus").remove(this.modifyVolumeStatus);
    }
    return (A) this;
  }
  
  public boolean hasModifyVolumeStatus() {
    return this.modifyVolumeStatus != null;
  }
  
  public ModifyVolumeStatusNested<A> withNewModifyVolumeStatus() {
    return new ModifyVolumeStatusNested(null);
  }
  
  public ModifyVolumeStatusNested<A> withNewModifyVolumeStatusLike(V1ModifyVolumeStatus item) {
    return new ModifyVolumeStatusNested(item);
  }
  
  public ModifyVolumeStatusNested<A> editModifyVolumeStatus() {
    return withNewModifyVolumeStatusLike(java.util.Optional.ofNullable(buildModifyVolumeStatus()).orElse(null));
  }
  
  public ModifyVolumeStatusNested<A> editOrNewModifyVolumeStatus() {
    return withNewModifyVolumeStatusLike(java.util.Optional.ofNullable(buildModifyVolumeStatus()).orElse(new V1ModifyVolumeStatusBuilder().build()));
  }
  
  public ModifyVolumeStatusNested<A> editOrNewModifyVolumeStatusLike(V1ModifyVolumeStatus item) {
    return withNewModifyVolumeStatusLike(java.util.Optional.ofNullable(buildModifyVolumeStatus()).orElse(item));
  }
  
  public String getPhase() {
    return this.phase;
  }
  
  public A withPhase(String phase) {
    this.phase = phase;
    return (A) this;
  }
  
  public boolean hasPhase() {
    return this.phase != null;
  }
  
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    V1PersistentVolumeClaimStatusFluent that = (V1PersistentVolumeClaimStatusFluent) o;
    if (!java.util.Objects.equals(accessModes, that.accessModes)) return false;
    if (!java.util.Objects.equals(allocatedResourceStatuses, that.allocatedResourceStatuses)) return false;
    if (!java.util.Objects.equals(allocatedResources, that.allocatedResources)) return false;
    if (!java.util.Objects.equals(capacity, that.capacity)) return false;
    if (!java.util.Objects.equals(conditions, that.conditions)) return false;
    if (!java.util.Objects.equals(currentVolumeAttributesClassName, that.currentVolumeAttributesClassName)) return false;
    if (!java.util.Objects.equals(modifyVolumeStatus, that.modifyVolumeStatus)) return false;
    if (!java.util.Objects.equals(phase, that.phase)) return false;
    return true;
  }
  
  public int hashCode() {
    return java.util.Objects.hash(accessModes,  allocatedResourceStatuses,  allocatedResources,  capacity,  conditions,  currentVolumeAttributesClassName,  modifyVolumeStatus,  phase,  super.hashCode());
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (accessModes != null && !accessModes.isEmpty()) { sb.append("accessModes:"); sb.append(accessModes + ","); }
    if (allocatedResourceStatuses != null && !allocatedResourceStatuses.isEmpty()) { sb.append("allocatedResourceStatuses:"); sb.append(allocatedResourceStatuses + ","); }
    if (allocatedResources != null && !allocatedResources.isEmpty()) { sb.append("allocatedResources:"); sb.append(allocatedResources + ","); }
    if (capacity != null && !capacity.isEmpty()) { sb.append("capacity:"); sb.append(capacity + ","); }
    if (conditions != null && !conditions.isEmpty()) { sb.append("conditions:"); sb.append(conditions + ","); }
    if (currentVolumeAttributesClassName != null) { sb.append("currentVolumeAttributesClassName:"); sb.append(currentVolumeAttributesClassName + ","); }
    if (modifyVolumeStatus != null) { sb.append("modifyVolumeStatus:"); sb.append(modifyVolumeStatus + ","); }
    if (phase != null) { sb.append("phase:"); sb.append(phase); }
    sb.append("}");
    return sb.toString();
  }
  public class ConditionsNested<N> extends V1PersistentVolumeClaimConditionFluent<ConditionsNested<N>> implements Nested<N>{
    ConditionsNested(int index,V1PersistentVolumeClaimCondition item) {
      this.index = index;
      this.builder = new V1PersistentVolumeClaimConditionBuilder(this, item);
    }
    V1PersistentVolumeClaimConditionBuilder builder;
    int index;
    
    public N and() {
      return (N) V1PersistentVolumeClaimStatusFluent.this.setToConditions(index,builder.build());
    }
    
    public N endCondition() {
      return and();
    }
    
  
  }
  public class ModifyVolumeStatusNested<N> extends V1ModifyVolumeStatusFluent<ModifyVolumeStatusNested<N>> implements Nested<N>{
    ModifyVolumeStatusNested(V1ModifyVolumeStatus item) {
      this.builder = new V1ModifyVolumeStatusBuilder(this, item);
    }
    V1ModifyVolumeStatusBuilder builder;
    
    public N and() {
      return (N) V1PersistentVolumeClaimStatusFluent.this.withModifyVolumeStatus(builder.build());
    }
    
    public N endModifyVolumeStatus() {
      return and();
    }
    
  
  }

}