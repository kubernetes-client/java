package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.SuppressWarnings;
import io.kubernetes.client.fluent.Nested;
import java.util.ArrayList;
import java.lang.String;
import java.util.function.Predicate;
import java.lang.Deprecated;
import io.kubernetes.client.fluent.BaseFluent;
import java.util.Iterator;
import java.util.Collection;
import java.lang.Object;
import java.util.List;
import java.lang.Boolean;

 /**
  * Generated
  */
  @SuppressWarnings(value = "unchecked")
  public class V1LimitRangeSpecFluentImpl<A extends V1LimitRangeSpecFluent<A>> extends BaseFluent<A> implements V1LimitRangeSpecFluent<A>{
  public V1LimitRangeSpecFluentImpl() {
  }
  public V1LimitRangeSpecFluentImpl(V1LimitRangeSpec instance) {
    if (instance != null) {
      this.withLimits(instance.getLimits());
    }
  }
  private ArrayList<V1LimitRangeItemBuilder> limits;
  public A addToLimits(int index,V1LimitRangeItem item) {
    if (this.limits == null) {this.limits = new ArrayList<V1LimitRangeItemBuilder>();}
    V1LimitRangeItemBuilder builder = new V1LimitRangeItemBuilder(item);
    if (index < 0 || index >= limits.size()) { _visitables.get("limits").add(builder); limits.add(builder); } else { _visitables.get("limits").add(index, builder); limits.add(index, builder);}
    return (A)this;
  }
  public A setToLimits(int index,V1LimitRangeItem item) {
    if (this.limits == null) {this.limits = new ArrayList<V1LimitRangeItemBuilder>();}
    V1LimitRangeItemBuilder builder = new V1LimitRangeItemBuilder(item);
    if (index < 0 || index >= limits.size()) { _visitables.get("limits").add(builder); limits.add(builder); } else { _visitables.get("limits").set(index, builder); limits.set(index, builder);}
    return (A)this;
  }
  public A addToLimits(io.kubernetes.client.openapi.models.V1LimitRangeItem... items) {
    if (this.limits == null) {this.limits = new ArrayList<V1LimitRangeItemBuilder>();}
    for (V1LimitRangeItem item : items) {V1LimitRangeItemBuilder builder = new V1LimitRangeItemBuilder(item);_visitables.get("limits").add(builder);this.limits.add(builder);} return (A)this;
  }
  public A addAllToLimits(Collection<V1LimitRangeItem> items) {
    if (this.limits == null) {this.limits = new ArrayList<V1LimitRangeItemBuilder>();}
    for (V1LimitRangeItem item : items) {V1LimitRangeItemBuilder builder = new V1LimitRangeItemBuilder(item);_visitables.get("limits").add(builder);this.limits.add(builder);} return (A)this;
  }
  public A removeFromLimits(io.kubernetes.client.openapi.models.V1LimitRangeItem... items) {
    for (V1LimitRangeItem item : items) {V1LimitRangeItemBuilder builder = new V1LimitRangeItemBuilder(item);_visitables.get("limits").remove(builder);if (this.limits != null) {this.limits.remove(builder);}} return (A)this;
  }
  public A removeAllFromLimits(Collection<V1LimitRangeItem> items) {
    for (V1LimitRangeItem item : items) {V1LimitRangeItemBuilder builder = new V1LimitRangeItemBuilder(item);_visitables.get("limits").remove(builder);if (this.limits != null) {this.limits.remove(builder);}} return (A)this;
  }
  public A removeMatchingFromLimits(Predicate<V1LimitRangeItemBuilder> predicate) {
    if (limits == null) return (A) this;
    final Iterator<V1LimitRangeItemBuilder> each = limits.iterator();
    final List visitables = _visitables.get("limits");
    while (each.hasNext()) {
      V1LimitRangeItemBuilder builder = each.next();
      if (predicate.test(builder)) {
        visitables.remove(builder);
        each.remove();
      }
    }
    return (A)this;
  }
  
  /**
   * This method has been deprecated, please use method buildLimits instead.
   * @return The buildable object.
   */
  @Deprecated
  public List<V1LimitRangeItem> getLimits() {
    return limits != null ? build(limits) : null;
  }
  public List<V1LimitRangeItem> buildLimits() {
    return limits != null ? build(limits) : null;
  }
  public V1LimitRangeItem buildLimit(int index) {
    return this.limits.get(index).build();
  }
  public V1LimitRangeItem buildFirstLimit() {
    return this.limits.get(0).build();
  }
  public V1LimitRangeItem buildLastLimit() {
    return this.limits.get(limits.size() - 1).build();
  }
  public V1LimitRangeItem buildMatchingLimit(Predicate<V1LimitRangeItemBuilder> predicate) {
    for (V1LimitRangeItemBuilder item: limits) { if(predicate.test(item)){ return item.build();} } return null;
  }
  public Boolean hasMatchingLimit(Predicate<V1LimitRangeItemBuilder> predicate) {
    for (V1LimitRangeItemBuilder item: limits) { if(predicate.test(item)){ return true;} } return false;
  }
  public A withLimits(List<V1LimitRangeItem> limits) {
    if (this.limits != null) { _visitables.get("limits").clear();}
    if (limits != null) {this.limits = new ArrayList(); for (V1LimitRangeItem item : limits){this.addToLimits(item);}} else { this.limits = null;} return (A) this;
  }
  public A withLimits(io.kubernetes.client.openapi.models.V1LimitRangeItem... limits) {
    if (this.limits != null) {this.limits.clear(); _visitables.remove("limits"); }
    if (limits != null) {for (V1LimitRangeItem item :limits){ this.addToLimits(item);}} return (A) this;
  }
  public Boolean hasLimits() {
    return limits != null && !limits.isEmpty();
  }
  public V1LimitRangeSpecFluentImpl.LimitsNested<A> addNewLimit() {
    return new V1LimitRangeSpecFluentImpl.LimitsNestedImpl();
  }
  public V1LimitRangeSpecFluentImpl.LimitsNested<A> addNewLimitLike(V1LimitRangeItem item) {
    return new V1LimitRangeSpecFluentImpl.LimitsNestedImpl(-1, item);
  }
  public V1LimitRangeSpecFluentImpl.LimitsNested<A> setNewLimitLike(int index,V1LimitRangeItem item) {
    return new V1LimitRangeSpecFluentImpl.LimitsNestedImpl(index, item);
  }
  public V1LimitRangeSpecFluentImpl.LimitsNested<A> editLimit(int index) {
    if (limits.size() <= index) throw new RuntimeException("Can't edit limits. Index exceeds size.");
    return setNewLimitLike(index, buildLimit(index));
  }
  public V1LimitRangeSpecFluentImpl.LimitsNested<A> editFirstLimit() {
    if (limits.size() == 0) throw new RuntimeException("Can't edit first limits. The list is empty.");
    return setNewLimitLike(0, buildLimit(0));
  }
  public V1LimitRangeSpecFluentImpl.LimitsNested<A> editLastLimit() {
    int index = limits.size() - 1;
    if (index < 0) throw new RuntimeException("Can't edit last limits. The list is empty.");
    return setNewLimitLike(index, buildLimit(index));
  }
  public V1LimitRangeSpecFluentImpl.LimitsNested<A> editMatchingLimit(Predicate<V1LimitRangeItemBuilder> predicate) {
    int index = -1;
    for (int i=0;i<limits.size();i++) { 
    if (predicate.test(limits.get(i))) {index = i; break;}
    } 
    if (index < 0) throw new RuntimeException("Can't edit matching limits. No match found.");
    return setNewLimitLike(index, buildLimit(index));
  }
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    V1LimitRangeSpecFluentImpl that = (V1LimitRangeSpecFluentImpl) o;
    if (!java.util.Objects.equals(limits, that.limits)) return false;

    return true;
  }
  public int hashCode() {
    return java.util.Objects.hash(limits,  super.hashCode());
  }
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (limits != null) { sb.append("limits:"); sb.append(limits); }
    sb.append("}");
    return sb.toString();
  }
  class LimitsNestedImpl<N> extends V1LimitRangeItemFluentImpl<V1LimitRangeSpecFluentImpl.LimitsNested<N>> implements V1LimitRangeSpecFluentImpl.LimitsNested<N>,Nested<N>{
    LimitsNestedImpl(int index,V1LimitRangeItem item) {
      this.index = index;
      this.builder = new V1LimitRangeItemBuilder(this, item);
    }
    LimitsNestedImpl() {
      this.index = -1;
      this.builder = new V1LimitRangeItemBuilder(this);
    }
    V1LimitRangeItemBuilder builder;
    int index;
    public N and() {
      return (N) V1LimitRangeSpecFluentImpl.this.setToLimits(index,builder.build());
    }
    public N endLimit() {
      return and();
    }
    
  }
  
}