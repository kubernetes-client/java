package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.SuppressWarnings;
import io.kubernetes.client.fluent.Nested;
import java.util.ArrayList;
import java.lang.String;
import java.util.function.Predicate;
import io.kubernetes.client.fluent.BaseFluent;
import java.util.Iterator;
import java.util.Collection;
import java.lang.Object;
import java.util.List;

/**
 * Generated
 */
@SuppressWarnings("unchecked")
public class V1beta3PriorityLevelConfigurationStatusFluent<A extends V1beta3PriorityLevelConfigurationStatusFluent<A>> extends BaseFluent<A>{
  public V1beta3PriorityLevelConfigurationStatusFluent() {
  }
  
  public V1beta3PriorityLevelConfigurationStatusFluent(V1beta3PriorityLevelConfigurationStatus instance) {
    this.copyInstance(instance);
  }
  private ArrayList<V1beta3PriorityLevelConfigurationConditionBuilder> conditions;
  
  protected void copyInstance(V1beta3PriorityLevelConfigurationStatus instance) {
    instance = (instance != null ? instance : new V1beta3PriorityLevelConfigurationStatus());
    if (instance != null) {
          this.withConditions(instance.getConditions());
        }
  }
  
  public A addToConditions(int index,V1beta3PriorityLevelConfigurationCondition item) {
    if (this.conditions == null) {this.conditions = new ArrayList<V1beta3PriorityLevelConfigurationConditionBuilder>();}
    V1beta3PriorityLevelConfigurationConditionBuilder builder = new V1beta3PriorityLevelConfigurationConditionBuilder(item);
    if (index < 0 || index >= conditions.size()) { _visitables.get("conditions").add(builder); conditions.add(builder); } else { _visitables.get("conditions").add(index, builder); conditions.add(index, builder);}
    return (A)this;
  }
  
  public A setToConditions(int index,V1beta3PriorityLevelConfigurationCondition item) {
    if (this.conditions == null) {this.conditions = new ArrayList<V1beta3PriorityLevelConfigurationConditionBuilder>();}
    V1beta3PriorityLevelConfigurationConditionBuilder builder = new V1beta3PriorityLevelConfigurationConditionBuilder(item);
    if (index < 0 || index >= conditions.size()) { _visitables.get("conditions").add(builder); conditions.add(builder); } else { _visitables.get("conditions").set(index, builder); conditions.set(index, builder);}
    return (A)this;
  }
  
  public A addToConditions(io.kubernetes.client.openapi.models.V1beta3PriorityLevelConfigurationCondition... items) {
    if (this.conditions == null) {this.conditions = new ArrayList<V1beta3PriorityLevelConfigurationConditionBuilder>();}
    for (V1beta3PriorityLevelConfigurationCondition item : items) {V1beta3PriorityLevelConfigurationConditionBuilder builder = new V1beta3PriorityLevelConfigurationConditionBuilder(item);_visitables.get("conditions").add(builder);this.conditions.add(builder);} return (A)this;
  }
  
  public A addAllToConditions(Collection<V1beta3PriorityLevelConfigurationCondition> items) {
    if (this.conditions == null) {this.conditions = new ArrayList<V1beta3PriorityLevelConfigurationConditionBuilder>();}
    for (V1beta3PriorityLevelConfigurationCondition item : items) {V1beta3PriorityLevelConfigurationConditionBuilder builder = new V1beta3PriorityLevelConfigurationConditionBuilder(item);_visitables.get("conditions").add(builder);this.conditions.add(builder);} return (A)this;
  }
  
  public A removeFromConditions(io.kubernetes.client.openapi.models.V1beta3PriorityLevelConfigurationCondition... items) {
    if (this.conditions == null) return (A)this;
    for (V1beta3PriorityLevelConfigurationCondition item : items) {V1beta3PriorityLevelConfigurationConditionBuilder builder = new V1beta3PriorityLevelConfigurationConditionBuilder(item);_visitables.get("conditions").remove(builder); this.conditions.remove(builder);} return (A)this;
  }
  
  public A removeAllFromConditions(Collection<V1beta3PriorityLevelConfigurationCondition> items) {
    if (this.conditions == null) return (A)this;
    for (V1beta3PriorityLevelConfigurationCondition item : items) {V1beta3PriorityLevelConfigurationConditionBuilder builder = new V1beta3PriorityLevelConfigurationConditionBuilder(item);_visitables.get("conditions").remove(builder); this.conditions.remove(builder);} return (A)this;
  }
  
  public A removeMatchingFromConditions(Predicate<V1beta3PriorityLevelConfigurationConditionBuilder> predicate) {
    if (conditions == null) return (A) this;
    final Iterator<V1beta3PriorityLevelConfigurationConditionBuilder> each = conditions.iterator();
    final List visitables = _visitables.get("conditions");
    while (each.hasNext()) {
      V1beta3PriorityLevelConfigurationConditionBuilder builder = each.next();
      if (predicate.test(builder)) {
        visitables.remove(builder);
        each.remove();
      }
    }
    return (A)this;
  }
  
  public List<V1beta3PriorityLevelConfigurationCondition> buildConditions() {
    return this.conditions != null ? build(conditions) : null;
  }
  
  public V1beta3PriorityLevelConfigurationCondition buildCondition(int index) {
    return this.conditions.get(index).build();
  }
  
  public V1beta3PriorityLevelConfigurationCondition buildFirstCondition() {
    return this.conditions.get(0).build();
  }
  
  public V1beta3PriorityLevelConfigurationCondition buildLastCondition() {
    return this.conditions.get(conditions.size() - 1).build();
  }
  
  public V1beta3PriorityLevelConfigurationCondition buildMatchingCondition(Predicate<V1beta3PriorityLevelConfigurationConditionBuilder> predicate) {
      for (V1beta3PriorityLevelConfigurationConditionBuilder item : conditions) {
        if (predicate.test(item)) {
          return item.build();
        }
      }
      return null;
  }
  
  public boolean hasMatchingCondition(Predicate<V1beta3PriorityLevelConfigurationConditionBuilder> predicate) {
      for (V1beta3PriorityLevelConfigurationConditionBuilder item : conditions) {
        if (predicate.test(item)) {
          return true;
        }
      }
      return false;
  }
  
  public A withConditions(List<V1beta3PriorityLevelConfigurationCondition> conditions) {
    if (this.conditions != null) {
      this._visitables.get("conditions").clear();
    }
    if (conditions != null) {
        this.conditions = new ArrayList();
        for (V1beta3PriorityLevelConfigurationCondition item : conditions) {
          this.addToConditions(item);
        }
    } else {
      this.conditions = null;
    }
    return (A) this;
  }
  
  public A withConditions(io.kubernetes.client.openapi.models.V1beta3PriorityLevelConfigurationCondition... conditions) {
    if (this.conditions != null) {
        this.conditions.clear();
        _visitables.remove("conditions");
    }
    if (conditions != null) {
      for (V1beta3PriorityLevelConfigurationCondition item : conditions) {
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
  
  public ConditionsNested<A> addNewConditionLike(V1beta3PriorityLevelConfigurationCondition item) {
    return new ConditionsNested(-1, item);
  }
  
  public ConditionsNested<A> setNewConditionLike(int index,V1beta3PriorityLevelConfigurationCondition item) {
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
  
  public ConditionsNested<A> editMatchingCondition(Predicate<V1beta3PriorityLevelConfigurationConditionBuilder> predicate) {
    int index = -1;
    for (int i=0;i<conditions.size();i++) { 
    if (predicate.test(conditions.get(i))) {index = i; break;}
    } 
    if (index < 0) throw new RuntimeException("Can't edit matching conditions. No match found.");
    return setNewConditionLike(index, buildCondition(index));
  }
  
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    V1beta3PriorityLevelConfigurationStatusFluent that = (V1beta3PriorityLevelConfigurationStatusFluent) o;
    if (!java.util.Objects.equals(conditions, that.conditions)) return false;
    return true;
  }
  
  public int hashCode() {
    return java.util.Objects.hash(conditions,  super.hashCode());
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (conditions != null && !conditions.isEmpty()) { sb.append("conditions:"); sb.append(conditions); }
    sb.append("}");
    return sb.toString();
  }
  public class ConditionsNested<N> extends V1beta3PriorityLevelConfigurationConditionFluent<ConditionsNested<N>> implements Nested<N>{
    ConditionsNested(int index,V1beta3PriorityLevelConfigurationCondition item) {
      this.index = index;
      this.builder = new V1beta3PriorityLevelConfigurationConditionBuilder(this, item);
    }
    V1beta3PriorityLevelConfigurationConditionBuilder builder;
    int index;
    
    public N and() {
      return (N) V1beta3PriorityLevelConfigurationStatusFluent.this.setToConditions(index,builder.build());
    }
    
    public N endCondition() {
      return and();
    }
    
  
  }

}