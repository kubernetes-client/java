package io.kubernetes.client.openapi.models;

import java.lang.StringBuilder;
import java.lang.SuppressWarnings;
import io.kubernetes.client.fluent.Nested;
import java.util.ArrayList;
import java.lang.String;
import java.util.function.Predicate;
import java.lang.RuntimeException;
import io.kubernetes.client.fluent.BaseFluent;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import java.util.Objects;
import java.util.Collection;
import java.lang.Object;

/**
 * Generated
 */
@SuppressWarnings("unchecked")
public class V1ServiceStatusFluent<A extends io.kubernetes.client.openapi.models.V1ServiceStatusFluent<A>> extends BaseFluent<A>{
  public V1ServiceStatusFluent() {
  }
  
  public V1ServiceStatusFluent(V1ServiceStatus instance) {
    this.copyInstance(instance);
  }
  private ArrayList<V1ConditionBuilder> conditions;
  private V1LoadBalancerStatusBuilder loadBalancer;
  
  protected void copyInstance(V1ServiceStatus instance) {
    instance = instance != null ? instance : new V1ServiceStatus();
    if (instance != null) {
        this.withConditions(instance.getConditions());
        this.withLoadBalancer(instance.getLoadBalancer());
    }
  }
  
  public A addToConditions(int index,V1Condition item) {
    if (this.conditions == null) {
      this.conditions = new ArrayList();
    }
    V1ConditionBuilder builder = new V1ConditionBuilder(item);
    if (index < 0 || index >= conditions.size()) {
        _visitables.get("conditions").add(builder);
        conditions.add(builder);
    } else {
        _visitables.get("conditions").add(builder);
        conditions.add(index, builder);
    }
    return (A) this;
  }
  
  public A setToConditions(int index,V1Condition item) {
    if (this.conditions == null) {
      this.conditions = new ArrayList();
    }
    V1ConditionBuilder builder = new V1ConditionBuilder(item);
    if (index < 0 || index >= conditions.size()) {
        _visitables.get("conditions").add(builder);
        conditions.add(builder);
    } else {
        _visitables.get("conditions").add(builder);
        conditions.set(index, builder);
    }
    return (A) this;
  }
  
  public A addToConditions(V1Condition... items) {
    if (this.conditions == null) {
      this.conditions = new ArrayList();
    }
    for (V1Condition item : items) {
        V1ConditionBuilder builder = new V1ConditionBuilder(item);
        _visitables.get("conditions").add(builder);
        this.conditions.add(builder);
    }
    return (A) this;
  }
  
  public A addAllToConditions(Collection<V1Condition> items) {
    if (this.conditions == null) {
      this.conditions = new ArrayList();
    }
    for (V1Condition item : items) {
        V1ConditionBuilder builder = new V1ConditionBuilder(item);
        _visitables.get("conditions").add(builder);
        this.conditions.add(builder);
    }
    return (A) this;
  }
  
  public A removeFromConditions(V1Condition... items) {
    if (this.conditions == null) {
      return (A) this;
    }
    for (V1Condition item : items) {
        V1ConditionBuilder builder = new V1ConditionBuilder(item);
        _visitables.get("conditions").remove(builder);
        this.conditions.remove(builder);
    }
    return (A) this;
  }
  
  public A removeAllFromConditions(Collection<V1Condition> items) {
    if (this.conditions == null) {
      return (A) this;
    }
    for (V1Condition item : items) {
        V1ConditionBuilder builder = new V1ConditionBuilder(item);
        _visitables.get("conditions").remove(builder);
        this.conditions.remove(builder);
    }
    return (A) this;
  }
  
  public A removeMatchingFromConditions(Predicate<V1ConditionBuilder> predicate) {
    if (conditions == null) {
      return (A) this;
    }
    Iterator<V1ConditionBuilder> each = conditions.iterator();
    List visitables = _visitables.get("conditions");
    while (each.hasNext()) {
        V1ConditionBuilder builder = each.next();
        if (predicate.test(builder)) {
            visitables.remove(builder);
            each.remove();
        }
    }
    return (A) this;
  }
  
  public List<V1Condition> buildConditions() {
    return this.conditions != null ? build(conditions) : null;
  }
  
  public V1Condition buildCondition(int index) {
    return this.conditions.get(index).build();
  }
  
  public V1Condition buildFirstCondition() {
    return this.conditions.get(0).build();
  }
  
  public V1Condition buildLastCondition() {
    return this.conditions.get(conditions.size() - 1).build();
  }
  
  public V1Condition buildMatchingCondition(Predicate<V1ConditionBuilder> predicate) {
      for (V1ConditionBuilder item : conditions) {
        if (predicate.test(item)) {
          return item.build();
        }
      }
      return null;
  }
  
  public boolean hasMatchingCondition(Predicate<V1ConditionBuilder> predicate) {
      for (V1ConditionBuilder item : conditions) {
        if (predicate.test(item)) {
          return true;
        }
      }
      return false;
  }
  
  public A withConditions(List<V1Condition> conditions) {
    if (this.conditions != null) {
      this._visitables.get("conditions").clear();
    }
    if (conditions != null) {
        this.conditions = new ArrayList();
        for (V1Condition item : conditions) {
          this.addToConditions(item);
        }
    } else {
      this.conditions = null;
    }
    return (A) this;
  }
  
  public A withConditions(V1Condition... conditions) {
    if (this.conditions != null) {
        this.conditions.clear();
        _visitables.remove("conditions");
    }
    if (conditions != null) {
      for (V1Condition item : conditions) {
        this.addToConditions(item);
      }
    }
    return (A) this;
  }
  
  public boolean hasConditions() {
    return this.conditions != null && !(this.conditions.isEmpty());
  }
  
  public ConditionsNested<A> addNewCondition() {
    return new ConditionsNested(-1, null);
  }
  
  public ConditionsNested<A> addNewConditionLike(V1Condition item) {
    return new ConditionsNested(-1, item);
  }
  
  public ConditionsNested<A> setNewConditionLike(int index,V1Condition item) {
    return new ConditionsNested(index, item);
  }
  
  public ConditionsNested<A> editCondition(int index) {
    if (index <= conditions.size()) {
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
  
  public ConditionsNested<A> editMatchingCondition(Predicate<V1ConditionBuilder> predicate) {
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
  
  public V1LoadBalancerStatus buildLoadBalancer() {
    return this.loadBalancer != null ? this.loadBalancer.build() : null;
  }
  
  public A withLoadBalancer(V1LoadBalancerStatus loadBalancer) {
    this._visitables.remove("loadBalancer");
    if (loadBalancer != null) {
        this.loadBalancer = new V1LoadBalancerStatusBuilder(loadBalancer);
        this._visitables.get("loadBalancer").add(this.loadBalancer);
    } else {
        this.loadBalancer = null;
        this._visitables.get("loadBalancer").remove(this.loadBalancer);
    }
    return (A) this;
  }
  
  public boolean hasLoadBalancer() {
    return this.loadBalancer != null;
  }
  
  public LoadBalancerNested<A> withNewLoadBalancer() {
    return new LoadBalancerNested(null);
  }
  
  public LoadBalancerNested<A> withNewLoadBalancerLike(V1LoadBalancerStatus item) {
    return new LoadBalancerNested(item);
  }
  
  public LoadBalancerNested<A> editLoadBalancer() {
    return this.withNewLoadBalancerLike(Optional.ofNullable(this.buildLoadBalancer()).orElse(null));
  }
  
  public LoadBalancerNested<A> editOrNewLoadBalancer() {
    return this.withNewLoadBalancerLike(Optional.ofNullable(this.buildLoadBalancer()).orElse(new V1LoadBalancerStatusBuilder().build()));
  }
  
  public LoadBalancerNested<A> editOrNewLoadBalancerLike(V1LoadBalancerStatus item) {
    return this.withNewLoadBalancerLike(Optional.ofNullable(this.buildLoadBalancer()).orElse(item));
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
    V1ServiceStatusFluent that = (V1ServiceStatusFluent) o;
    if (!(Objects.equals(conditions, that.conditions))) {
      return false;
    }
    if (!(Objects.equals(loadBalancer, that.loadBalancer))) {
      return false;
    }
    return true;
  }
  
  public int hashCode() {
    return Objects.hash(conditions, loadBalancer);
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (!(conditions == null) && !(conditions.isEmpty())) {
        sb.append("conditions:");
        sb.append(conditions);
        sb.append(",");
    }
    if (!(loadBalancer == null)) {
        sb.append("loadBalancer:");
        sb.append(loadBalancer);
    }
    sb.append("}");
    return sb.toString();
  }
  public class ConditionsNested<N> extends V1ConditionFluent<ConditionsNested<N>> implements Nested<N>{
    ConditionsNested(int index,V1Condition item) {
      this.index = index;
      this.builder = new V1ConditionBuilder(this, item);
    }
    V1ConditionBuilder builder;
    int index;
    
    public N and() {
      return (N) V1ServiceStatusFluent.this.setToConditions(index, builder.build());
    }
    
    public N endCondition() {
      return and();
    }
    
  
  }
  public class LoadBalancerNested<N> extends V1LoadBalancerStatusFluent<LoadBalancerNested<N>> implements Nested<N>{
    LoadBalancerNested(V1LoadBalancerStatus item) {
      this.builder = new V1LoadBalancerStatusBuilder(this, item);
    }
    V1LoadBalancerStatusBuilder builder;
    
    public N and() {
      return (N) V1ServiceStatusFluent.this.withLoadBalancer(builder.build());
    }
    
    public N endLoadBalancer() {
      return and();
    }
    
  
  }

}