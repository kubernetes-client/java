package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.BaseFluent;
import io.kubernetes.client.fluent.Nested;
import java.lang.Object;
import java.lang.RuntimeException;
import java.lang.String;
import java.lang.StringBuilder;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.function.Predicate;

/**
 * Generated
 */
@SuppressWarnings("unchecked")
public class V1FlowSchemaStatusFluent<A extends io.kubernetes.client.openapi.models.V1FlowSchemaStatusFluent<A>> extends BaseFluent<A>{

  private ArrayList<V1FlowSchemaConditionBuilder> conditions;

  public V1FlowSchemaStatusFluent() {
  }
  
  public V1FlowSchemaStatusFluent(V1FlowSchemaStatus instance) {
    this.copyInstance(instance);
  }

  public A addAllToConditions(Collection<V1FlowSchemaCondition> items) {
    if (this.conditions == null) {
      this.conditions = new ArrayList();
    }
    for (V1FlowSchemaCondition item : items) {
        V1FlowSchemaConditionBuilder builder = new V1FlowSchemaConditionBuilder(item);
        _visitables.get("conditions").add(builder);
        this.conditions.add(builder);
    }
    return (A) this;
  }
  
  public ConditionsNested<A> addNewCondition() {
    return new ConditionsNested(-1, null);
  }
  
  public ConditionsNested<A> addNewConditionLike(V1FlowSchemaCondition item) {
    return new ConditionsNested(-1, item);
  }
  
  public A addToConditions(V1FlowSchemaCondition... items) {
    if (this.conditions == null) {
      this.conditions = new ArrayList();
    }
    for (V1FlowSchemaCondition item : items) {
        V1FlowSchemaConditionBuilder builder = new V1FlowSchemaConditionBuilder(item);
        _visitables.get("conditions").add(builder);
        this.conditions.add(builder);
    }
    return (A) this;
  }
  
  public A addToConditions(int index,V1FlowSchemaCondition item) {
    if (this.conditions == null) {
      this.conditions = new ArrayList();
    }
    V1FlowSchemaConditionBuilder builder = new V1FlowSchemaConditionBuilder(item);
    if (index < 0 || index >= conditions.size()) {
        _visitables.get("conditions").add(builder);
        conditions.add(builder);
    } else {
        _visitables.get("conditions").add(builder);
        conditions.add(index, builder);
    }
    return (A) this;
  }
  
  public V1FlowSchemaCondition buildCondition(int index) {
    return this.conditions.get(index).build();
  }
  
  public List<V1FlowSchemaCondition> buildConditions() {
    return this.conditions != null ? build(conditions) : null;
  }
  
  public V1FlowSchemaCondition buildFirstCondition() {
    return this.conditions.get(0).build();
  }
  
  public V1FlowSchemaCondition buildLastCondition() {
    return this.conditions.get(conditions.size() - 1).build();
  }
  
  public V1FlowSchemaCondition buildMatchingCondition(Predicate<V1FlowSchemaConditionBuilder> predicate) {
      for (V1FlowSchemaConditionBuilder item : conditions) {
        if (predicate.test(item)) {
          return item.build();
        }
      }
      return null;
  }
  
  protected void copyInstance(V1FlowSchemaStatus instance) {
    instance = instance != null ? instance : new V1FlowSchemaStatus();
    if (instance != null) {
      this.withConditions(instance.getConditions());
    }
  }
  
  public ConditionsNested<A> editCondition(int index) {
    if (conditions.size() <= index) {
      throw new RuntimeException(String.format("Can't edit %s. Index exceeds size.", "conditions"));
    }
    return this.setNewConditionLike(index, this.buildCondition(index));
  }
  
  public ConditionsNested<A> editFirstCondition() {
    if (conditions.size() == 0) {
      throw new RuntimeException(String.format("Can't edit first %s. The list is empty.", "conditions"));
    }
    return this.setNewConditionLike(0, this.buildCondition(0));
  }
  
  public ConditionsNested<A> editLastCondition() {
    int index = conditions.size() - 1;
    if (index < 0) {
      throw new RuntimeException(String.format("Can't edit last %s. The list is empty.", "conditions"));
    }
    return this.setNewConditionLike(index, this.buildCondition(index));
  }
  
  public ConditionsNested<A> editMatchingCondition(Predicate<V1FlowSchemaConditionBuilder> predicate) {
    int index = -1;
    for (int i = 0;i < conditions.size();i++) {
      if (predicate.test(conditions.get(i))) {
          index = i;
          break;
      }
    }
    if (index < 0) {
      throw new RuntimeException(String.format("Can't edit matching %s. No match found.", "conditions"));
    }
    return this.setNewConditionLike(index, this.buildCondition(index));
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
    V1FlowSchemaStatusFluent that = (V1FlowSchemaStatusFluent) o;
    if (!(Objects.equals(conditions, that.conditions))) {
      return false;
    }
    return true;
  }
  
  public boolean hasConditions() {
    return this.conditions != null && !(this.conditions.isEmpty());
  }
  
  public boolean hasMatchingCondition(Predicate<V1FlowSchemaConditionBuilder> predicate) {
      for (V1FlowSchemaConditionBuilder item : conditions) {
        if (predicate.test(item)) {
          return true;
        }
      }
      return false;
  }
  
  public int hashCode() {
    return Objects.hash(conditions);
  }
  
  public A removeAllFromConditions(Collection<V1FlowSchemaCondition> items) {
    if (this.conditions == null) {
      return (A) this;
    }
    for (V1FlowSchemaCondition item : items) {
        V1FlowSchemaConditionBuilder builder = new V1FlowSchemaConditionBuilder(item);
        _visitables.get("conditions").remove(builder);
        this.conditions.remove(builder);
    }
    return (A) this;
  }
  
  public A removeFromConditions(V1FlowSchemaCondition... items) {
    if (this.conditions == null) {
      return (A) this;
    }
    for (V1FlowSchemaCondition item : items) {
        V1FlowSchemaConditionBuilder builder = new V1FlowSchemaConditionBuilder(item);
        _visitables.get("conditions").remove(builder);
        this.conditions.remove(builder);
    }
    return (A) this;
  }
  
  public A removeMatchingFromConditions(Predicate<V1FlowSchemaConditionBuilder> predicate) {
    if (conditions == null) {
      return (A) this;
    }
    Iterator<V1FlowSchemaConditionBuilder> each = conditions.iterator();
    List visitables = _visitables.get("conditions");
    while (each.hasNext()) {
        V1FlowSchemaConditionBuilder builder = each.next();
        if (predicate.test(builder)) {
            visitables.remove(builder);
            each.remove();
        }
    }
    return (A) this;
  }
  
  public ConditionsNested<A> setNewConditionLike(int index,V1FlowSchemaCondition item) {
    return new ConditionsNested(index, item);
  }
  
  public A setToConditions(int index,V1FlowSchemaCondition item) {
    if (this.conditions == null) {
      this.conditions = new ArrayList();
    }
    V1FlowSchemaConditionBuilder builder = new V1FlowSchemaConditionBuilder(item);
    if (index < 0 || index >= conditions.size()) {
        _visitables.get("conditions").add(builder);
        conditions.add(builder);
    } else {
        _visitables.get("conditions").add(builder);
        conditions.set(index, builder);
    }
    return (A) this;
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (!(conditions == null) && !(conditions.isEmpty())) {
        sb.append("conditions:");
        sb.append(conditions);
    }
    sb.append("}");
    return sb.toString();
  }
  
  public A withConditions(List<V1FlowSchemaCondition> conditions) {
    if (this.conditions != null) {
      this._visitables.get("conditions").clear();
    }
    if (conditions != null) {
        this.conditions = new ArrayList();
        for (V1FlowSchemaCondition item : conditions) {
          this.addToConditions(item);
        }
    } else {
      this.conditions = null;
    }
    return (A) this;
  }
  
  public A withConditions(V1FlowSchemaCondition... conditions) {
    if (this.conditions != null) {
        this.conditions.clear();
        _visitables.remove("conditions");
    }
    if (conditions != null) {
      for (V1FlowSchemaCondition item : conditions) {
        this.addToConditions(item);
      }
    }
    return (A) this;
  }
  public class ConditionsNested<N> extends V1FlowSchemaConditionFluent<ConditionsNested<N>> implements Nested<N>{
  
    V1FlowSchemaConditionBuilder builder;
    int index;
  
    ConditionsNested(int index,V1FlowSchemaCondition item) {
      this.index = index;
      this.builder = new V1FlowSchemaConditionBuilder(this, item);
    }
  
    public N and() {
      return (N) V1FlowSchemaStatusFluent.this.setToConditions(index, builder.build());
    }
    
    public N endCondition() {
      return and();
    }
    
  }
}