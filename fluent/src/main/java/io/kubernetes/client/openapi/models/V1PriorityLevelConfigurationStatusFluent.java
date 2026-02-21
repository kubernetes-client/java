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
public class V1PriorityLevelConfigurationStatusFluent<A extends io.kubernetes.client.openapi.models.V1PriorityLevelConfigurationStatusFluent<A>> extends BaseFluent<A>{

  private ArrayList<V1PriorityLevelConfigurationConditionBuilder> conditions;

  public V1PriorityLevelConfigurationStatusFluent() {
  }
  
  public V1PriorityLevelConfigurationStatusFluent(V1PriorityLevelConfigurationStatus instance) {
    this.copyInstance(instance);
  }

  public A addAllToConditions(Collection<V1PriorityLevelConfigurationCondition> items) {
    if (this.conditions == null) {
      this.conditions = new ArrayList();
    }
    for (V1PriorityLevelConfigurationCondition item : items) {
        V1PriorityLevelConfigurationConditionBuilder builder = new V1PriorityLevelConfigurationConditionBuilder(item);
        _visitables.get("conditions").add(builder);
        this.conditions.add(builder);
    }
    return (A) this;
  }
  
  public ConditionsNested<A> addNewCondition() {
    return new ConditionsNested(-1, null);
  }
  
  public ConditionsNested<A> addNewConditionLike(V1PriorityLevelConfigurationCondition item) {
    return new ConditionsNested(-1, item);
  }
  
  public A addToConditions(V1PriorityLevelConfigurationCondition... items) {
    if (this.conditions == null) {
      this.conditions = new ArrayList();
    }
    for (V1PriorityLevelConfigurationCondition item : items) {
        V1PriorityLevelConfigurationConditionBuilder builder = new V1PriorityLevelConfigurationConditionBuilder(item);
        _visitables.get("conditions").add(builder);
        this.conditions.add(builder);
    }
    return (A) this;
  }
  
  public A addToConditions(int index,V1PriorityLevelConfigurationCondition item) {
    if (this.conditions == null) {
      this.conditions = new ArrayList();
    }
    V1PriorityLevelConfigurationConditionBuilder builder = new V1PriorityLevelConfigurationConditionBuilder(item);
    if (index < 0 || index >= conditions.size()) {
        _visitables.get("conditions").add(builder);
        conditions.add(builder);
    } else {
        _visitables.get("conditions").add(builder);
        conditions.add(index, builder);
    }
    return (A) this;
  }
  
  public V1PriorityLevelConfigurationCondition buildCondition(int index) {
    return this.conditions.get(index).build();
  }
  
  public List<V1PriorityLevelConfigurationCondition> buildConditions() {
    return this.conditions != null ? build(conditions) : null;
  }
  
  public V1PriorityLevelConfigurationCondition buildFirstCondition() {
    return this.conditions.get(0).build();
  }
  
  public V1PriorityLevelConfigurationCondition buildLastCondition() {
    return this.conditions.get(conditions.size() - 1).build();
  }
  
  public V1PriorityLevelConfigurationCondition buildMatchingCondition(Predicate<V1PriorityLevelConfigurationConditionBuilder> predicate) {
      for (V1PriorityLevelConfigurationConditionBuilder item : conditions) {
        if (predicate.test(item)) {
          return item.build();
        }
      }
      return null;
  }
  
  protected void copyInstance(V1PriorityLevelConfigurationStatus instance) {
    instance = instance != null ? instance : new V1PriorityLevelConfigurationStatus();
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
  
  public ConditionsNested<A> editMatchingCondition(Predicate<V1PriorityLevelConfigurationConditionBuilder> predicate) {
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
    V1PriorityLevelConfigurationStatusFluent that = (V1PriorityLevelConfigurationStatusFluent) o;
    if (!(Objects.equals(conditions, that.conditions))) {
      return false;
    }
    return true;
  }
  
  public boolean hasConditions() {
    return this.conditions != null && !(this.conditions.isEmpty());
  }
  
  public boolean hasMatchingCondition(Predicate<V1PriorityLevelConfigurationConditionBuilder> predicate) {
      for (V1PriorityLevelConfigurationConditionBuilder item : conditions) {
        if (predicate.test(item)) {
          return true;
        }
      }
      return false;
  }
  
  public int hashCode() {
    return Objects.hash(conditions);
  }
  
  public A removeAllFromConditions(Collection<V1PriorityLevelConfigurationCondition> items) {
    if (this.conditions == null) {
      return (A) this;
    }
    for (V1PriorityLevelConfigurationCondition item : items) {
        V1PriorityLevelConfigurationConditionBuilder builder = new V1PriorityLevelConfigurationConditionBuilder(item);
        _visitables.get("conditions").remove(builder);
        this.conditions.remove(builder);
    }
    return (A) this;
  }
  
  public A removeFromConditions(V1PriorityLevelConfigurationCondition... items) {
    if (this.conditions == null) {
      return (A) this;
    }
    for (V1PriorityLevelConfigurationCondition item : items) {
        V1PriorityLevelConfigurationConditionBuilder builder = new V1PriorityLevelConfigurationConditionBuilder(item);
        _visitables.get("conditions").remove(builder);
        this.conditions.remove(builder);
    }
    return (A) this;
  }
  
  public A removeMatchingFromConditions(Predicate<V1PriorityLevelConfigurationConditionBuilder> predicate) {
    if (conditions == null) {
      return (A) this;
    }
    Iterator<V1PriorityLevelConfigurationConditionBuilder> each = conditions.iterator();
    List visitables = _visitables.get("conditions");
    while (each.hasNext()) {
        V1PriorityLevelConfigurationConditionBuilder builder = each.next();
        if (predicate.test(builder)) {
            visitables.remove(builder);
            each.remove();
        }
    }
    return (A) this;
  }
  
  public ConditionsNested<A> setNewConditionLike(int index,V1PriorityLevelConfigurationCondition item) {
    return new ConditionsNested(index, item);
  }
  
  public A setToConditions(int index,V1PriorityLevelConfigurationCondition item) {
    if (this.conditions == null) {
      this.conditions = new ArrayList();
    }
    V1PriorityLevelConfigurationConditionBuilder builder = new V1PriorityLevelConfigurationConditionBuilder(item);
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
  
  public A withConditions(List<V1PriorityLevelConfigurationCondition> conditions) {
    if (this.conditions != null) {
      this._visitables.get("conditions").clear();
    }
    if (conditions != null) {
        this.conditions = new ArrayList();
        for (V1PriorityLevelConfigurationCondition item : conditions) {
          this.addToConditions(item);
        }
    } else {
      this.conditions = null;
    }
    return (A) this;
  }
  
  public A withConditions(V1PriorityLevelConfigurationCondition... conditions) {
    if (this.conditions != null) {
        this.conditions.clear();
        _visitables.remove("conditions");
    }
    if (conditions != null) {
      for (V1PriorityLevelConfigurationCondition item : conditions) {
        this.addToConditions(item);
      }
    }
    return (A) this;
  }
  public class ConditionsNested<N> extends V1PriorityLevelConfigurationConditionFluent<ConditionsNested<N>> implements Nested<N>{
  
    V1PriorityLevelConfigurationConditionBuilder builder;
    int index;
  
    ConditionsNested(int index,V1PriorityLevelConfigurationCondition item) {
      this.index = index;
      this.builder = new V1PriorityLevelConfigurationConditionBuilder(this, item);
    }
  
    public N and() {
      return (N) V1PriorityLevelConfigurationStatusFluent.this.setToConditions(index, builder.build());
    }
    
    public N endCondition() {
      return and();
    }
    
  }
}