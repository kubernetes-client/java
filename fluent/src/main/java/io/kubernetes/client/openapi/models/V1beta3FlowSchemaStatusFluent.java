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
public class V1beta3FlowSchemaStatusFluent<A extends V1beta3FlowSchemaStatusFluent<A>> extends BaseFluent<A>{
  public V1beta3FlowSchemaStatusFluent() {
  }
  
  public V1beta3FlowSchemaStatusFluent(V1beta3FlowSchemaStatus instance) {
    this.copyInstance(instance);
  }
  private ArrayList<V1beta3FlowSchemaConditionBuilder> conditions;
  
  protected void copyInstance(V1beta3FlowSchemaStatus instance) {
    instance = (instance != null ? instance : new V1beta3FlowSchemaStatus());
    if (instance != null) {
          this.withConditions(instance.getConditions());
        }
  }
  
  public A addToConditions(int index,V1beta3FlowSchemaCondition item) {
    if (this.conditions == null) {this.conditions = new ArrayList<V1beta3FlowSchemaConditionBuilder>();}
    V1beta3FlowSchemaConditionBuilder builder = new V1beta3FlowSchemaConditionBuilder(item);
    if (index < 0 || index >= conditions.size()) { _visitables.get("conditions").add(builder); conditions.add(builder); } else { _visitables.get("conditions").add(index, builder); conditions.add(index, builder);}
    return (A)this;
  }
  
  public A setToConditions(int index,V1beta3FlowSchemaCondition item) {
    if (this.conditions == null) {this.conditions = new ArrayList<V1beta3FlowSchemaConditionBuilder>();}
    V1beta3FlowSchemaConditionBuilder builder = new V1beta3FlowSchemaConditionBuilder(item);
    if (index < 0 || index >= conditions.size()) { _visitables.get("conditions").add(builder); conditions.add(builder); } else { _visitables.get("conditions").set(index, builder); conditions.set(index, builder);}
    return (A)this;
  }
  
  public A addToConditions(io.kubernetes.client.openapi.models.V1beta3FlowSchemaCondition... items) {
    if (this.conditions == null) {this.conditions = new ArrayList<V1beta3FlowSchemaConditionBuilder>();}
    for (V1beta3FlowSchemaCondition item : items) {V1beta3FlowSchemaConditionBuilder builder = new V1beta3FlowSchemaConditionBuilder(item);_visitables.get("conditions").add(builder);this.conditions.add(builder);} return (A)this;
  }
  
  public A addAllToConditions(Collection<V1beta3FlowSchemaCondition> items) {
    if (this.conditions == null) {this.conditions = new ArrayList<V1beta3FlowSchemaConditionBuilder>();}
    for (V1beta3FlowSchemaCondition item : items) {V1beta3FlowSchemaConditionBuilder builder = new V1beta3FlowSchemaConditionBuilder(item);_visitables.get("conditions").add(builder);this.conditions.add(builder);} return (A)this;
  }
  
  public A removeFromConditions(io.kubernetes.client.openapi.models.V1beta3FlowSchemaCondition... items) {
    if (this.conditions == null) return (A)this;
    for (V1beta3FlowSchemaCondition item : items) {V1beta3FlowSchemaConditionBuilder builder = new V1beta3FlowSchemaConditionBuilder(item);_visitables.get("conditions").remove(builder); this.conditions.remove(builder);} return (A)this;
  }
  
  public A removeAllFromConditions(Collection<V1beta3FlowSchemaCondition> items) {
    if (this.conditions == null) return (A)this;
    for (V1beta3FlowSchemaCondition item : items) {V1beta3FlowSchemaConditionBuilder builder = new V1beta3FlowSchemaConditionBuilder(item);_visitables.get("conditions").remove(builder); this.conditions.remove(builder);} return (A)this;
  }
  
  public A removeMatchingFromConditions(Predicate<V1beta3FlowSchemaConditionBuilder> predicate) {
    if (conditions == null) return (A) this;
    final Iterator<V1beta3FlowSchemaConditionBuilder> each = conditions.iterator();
    final List visitables = _visitables.get("conditions");
    while (each.hasNext()) {
      V1beta3FlowSchemaConditionBuilder builder = each.next();
      if (predicate.test(builder)) {
        visitables.remove(builder);
        each.remove();
      }
    }
    return (A)this;
  }
  
  public List<V1beta3FlowSchemaCondition> buildConditions() {
    return this.conditions != null ? build(conditions) : null;
  }
  
  public V1beta3FlowSchemaCondition buildCondition(int index) {
    return this.conditions.get(index).build();
  }
  
  public V1beta3FlowSchemaCondition buildFirstCondition() {
    return this.conditions.get(0).build();
  }
  
  public V1beta3FlowSchemaCondition buildLastCondition() {
    return this.conditions.get(conditions.size() - 1).build();
  }
  
  public V1beta3FlowSchemaCondition buildMatchingCondition(Predicate<V1beta3FlowSchemaConditionBuilder> predicate) {
      for (V1beta3FlowSchemaConditionBuilder item : conditions) {
        if (predicate.test(item)) {
          return item.build();
        }
      }
      return null;
  }
  
  public boolean hasMatchingCondition(Predicate<V1beta3FlowSchemaConditionBuilder> predicate) {
      for (V1beta3FlowSchemaConditionBuilder item : conditions) {
        if (predicate.test(item)) {
          return true;
        }
      }
      return false;
  }
  
  public A withConditions(List<V1beta3FlowSchemaCondition> conditions) {
    if (this.conditions != null) {
      this._visitables.get("conditions").clear();
    }
    if (conditions != null) {
        this.conditions = new ArrayList();
        for (V1beta3FlowSchemaCondition item : conditions) {
          this.addToConditions(item);
        }
    } else {
      this.conditions = null;
    }
    return (A) this;
  }
  
  public A withConditions(io.kubernetes.client.openapi.models.V1beta3FlowSchemaCondition... conditions) {
    if (this.conditions != null) {
        this.conditions.clear();
        _visitables.remove("conditions");
    }
    if (conditions != null) {
      for (V1beta3FlowSchemaCondition item : conditions) {
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
  
  public ConditionsNested<A> addNewConditionLike(V1beta3FlowSchemaCondition item) {
    return new ConditionsNested(-1, item);
  }
  
  public ConditionsNested<A> setNewConditionLike(int index,V1beta3FlowSchemaCondition item) {
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
  
  public ConditionsNested<A> editMatchingCondition(Predicate<V1beta3FlowSchemaConditionBuilder> predicate) {
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
    V1beta3FlowSchemaStatusFluent that = (V1beta3FlowSchemaStatusFluent) o;
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
  public class ConditionsNested<N> extends V1beta3FlowSchemaConditionFluent<ConditionsNested<N>> implements Nested<N>{
    ConditionsNested(int index,V1beta3FlowSchemaCondition item) {
      this.index = index;
      this.builder = new V1beta3FlowSchemaConditionBuilder(this, item);
    }
    V1beta3FlowSchemaConditionBuilder builder;
    int index;
    
    public N and() {
      return (N) V1beta3FlowSchemaStatusFluent.this.setToConditions(index,builder.build());
    }
    
    public N endCondition() {
      return and();
    }
    
  
  }

}