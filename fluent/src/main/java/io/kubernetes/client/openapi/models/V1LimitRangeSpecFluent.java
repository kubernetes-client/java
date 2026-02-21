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
public class V1LimitRangeSpecFluent<A extends io.kubernetes.client.openapi.models.V1LimitRangeSpecFluent<A>> extends BaseFluent<A>{

  private ArrayList<V1LimitRangeItemBuilder> limits;

  public V1LimitRangeSpecFluent() {
  }
  
  public V1LimitRangeSpecFluent(V1LimitRangeSpec instance) {
    this.copyInstance(instance);
  }

  public A addAllToLimits(Collection<V1LimitRangeItem> items) {
    if (this.limits == null) {
      this.limits = new ArrayList();
    }
    for (V1LimitRangeItem item : items) {
        V1LimitRangeItemBuilder builder = new V1LimitRangeItemBuilder(item);
        _visitables.get("limits").add(builder);
        this.limits.add(builder);
    }
    return (A) this;
  }
  
  public LimitsNested<A> addNewLimit() {
    return new LimitsNested(-1, null);
  }
  
  public LimitsNested<A> addNewLimitLike(V1LimitRangeItem item) {
    return new LimitsNested(-1, item);
  }
  
  public A addToLimits(V1LimitRangeItem... items) {
    if (this.limits == null) {
      this.limits = new ArrayList();
    }
    for (V1LimitRangeItem item : items) {
        V1LimitRangeItemBuilder builder = new V1LimitRangeItemBuilder(item);
        _visitables.get("limits").add(builder);
        this.limits.add(builder);
    }
    return (A) this;
  }
  
  public A addToLimits(int index,V1LimitRangeItem item) {
    if (this.limits == null) {
      this.limits = new ArrayList();
    }
    V1LimitRangeItemBuilder builder = new V1LimitRangeItemBuilder(item);
    if (index < 0 || index >= limits.size()) {
        _visitables.get("limits").add(builder);
        limits.add(builder);
    } else {
        _visitables.get("limits").add(builder);
        limits.add(index, builder);
    }
    return (A) this;
  }
  
  public V1LimitRangeItem buildFirstLimit() {
    return this.limits.get(0).build();
  }
  
  public V1LimitRangeItem buildLastLimit() {
    return this.limits.get(limits.size() - 1).build();
  }
  
  public V1LimitRangeItem buildLimit(int index) {
    return this.limits.get(index).build();
  }
  
  public List<V1LimitRangeItem> buildLimits() {
    return this.limits != null ? build(limits) : null;
  }
  
  public V1LimitRangeItem buildMatchingLimit(Predicate<V1LimitRangeItemBuilder> predicate) {
      for (V1LimitRangeItemBuilder item : limits) {
        if (predicate.test(item)) {
          return item.build();
        }
      }
      return null;
  }
  
  protected void copyInstance(V1LimitRangeSpec instance) {
    instance = instance != null ? instance : new V1LimitRangeSpec();
    if (instance != null) {
      this.withLimits(instance.getLimits());
    }
  }
  
  public LimitsNested<A> editFirstLimit() {
    if (limits.size() == 0) {
      throw new RuntimeException(String.format("Can't edit first %s. The list is empty.", "limits"));
    }
    return this.setNewLimitLike(0, this.buildLimit(0));
  }
  
  public LimitsNested<A> editLastLimit() {
    int index = limits.size() - 1;
    if (index < 0) {
      throw new RuntimeException(String.format("Can't edit last %s. The list is empty.", "limits"));
    }
    return this.setNewLimitLike(index, this.buildLimit(index));
  }
  
  public LimitsNested<A> editLimit(int index) {
    if (limits.size() <= index) {
      throw new RuntimeException(String.format("Can't edit %s. Index exceeds size.", "limits"));
    }
    return this.setNewLimitLike(index, this.buildLimit(index));
  }
  
  public LimitsNested<A> editMatchingLimit(Predicate<V1LimitRangeItemBuilder> predicate) {
    int index = -1;
    for (int i = 0;i < limits.size();i++) {
      if (predicate.test(limits.get(i))) {
          index = i;
          break;
      }
    }
    if (index < 0) {
      throw new RuntimeException(String.format("Can't edit matching %s. No match found.", "limits"));
    }
    return this.setNewLimitLike(index, this.buildLimit(index));
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
    V1LimitRangeSpecFluent that = (V1LimitRangeSpecFluent) o;
    if (!(Objects.equals(limits, that.limits))) {
      return false;
    }
    return true;
  }
  
  public boolean hasLimits() {
    return this.limits != null && !(this.limits.isEmpty());
  }
  
  public boolean hasMatchingLimit(Predicate<V1LimitRangeItemBuilder> predicate) {
      for (V1LimitRangeItemBuilder item : limits) {
        if (predicate.test(item)) {
          return true;
        }
      }
      return false;
  }
  
  public int hashCode() {
    return Objects.hash(limits);
  }
  
  public A removeAllFromLimits(Collection<V1LimitRangeItem> items) {
    if (this.limits == null) {
      return (A) this;
    }
    for (V1LimitRangeItem item : items) {
        V1LimitRangeItemBuilder builder = new V1LimitRangeItemBuilder(item);
        _visitables.get("limits").remove(builder);
        this.limits.remove(builder);
    }
    return (A) this;
  }
  
  public A removeFromLimits(V1LimitRangeItem... items) {
    if (this.limits == null) {
      return (A) this;
    }
    for (V1LimitRangeItem item : items) {
        V1LimitRangeItemBuilder builder = new V1LimitRangeItemBuilder(item);
        _visitables.get("limits").remove(builder);
        this.limits.remove(builder);
    }
    return (A) this;
  }
  
  public A removeMatchingFromLimits(Predicate<V1LimitRangeItemBuilder> predicate) {
    if (limits == null) {
      return (A) this;
    }
    Iterator<V1LimitRangeItemBuilder> each = limits.iterator();
    List visitables = _visitables.get("limits");
    while (each.hasNext()) {
        V1LimitRangeItemBuilder builder = each.next();
        if (predicate.test(builder)) {
            visitables.remove(builder);
            each.remove();
        }
    }
    return (A) this;
  }
  
  public LimitsNested<A> setNewLimitLike(int index,V1LimitRangeItem item) {
    return new LimitsNested(index, item);
  }
  
  public A setToLimits(int index,V1LimitRangeItem item) {
    if (this.limits == null) {
      this.limits = new ArrayList();
    }
    V1LimitRangeItemBuilder builder = new V1LimitRangeItemBuilder(item);
    if (index < 0 || index >= limits.size()) {
        _visitables.get("limits").add(builder);
        limits.add(builder);
    } else {
        _visitables.get("limits").add(builder);
        limits.set(index, builder);
    }
    return (A) this;
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (!(limits == null) && !(limits.isEmpty())) {
        sb.append("limits:");
        sb.append(limits);
    }
    sb.append("}");
    return sb.toString();
  }
  
  public A withLimits(List<V1LimitRangeItem> limits) {
    if (this.limits != null) {
      this._visitables.get("limits").clear();
    }
    if (limits != null) {
        this.limits = new ArrayList();
        for (V1LimitRangeItem item : limits) {
          this.addToLimits(item);
        }
    } else {
      this.limits = null;
    }
    return (A) this;
  }
  
  public A withLimits(V1LimitRangeItem... limits) {
    if (this.limits != null) {
        this.limits.clear();
        _visitables.remove("limits");
    }
    if (limits != null) {
      for (V1LimitRangeItem item : limits) {
        this.addToLimits(item);
      }
    }
    return (A) this;
  }
  public class LimitsNested<N> extends V1LimitRangeItemFluent<LimitsNested<N>> implements Nested<N>{
  
    V1LimitRangeItemBuilder builder;
    int index;
  
    LimitsNested(int index,V1LimitRangeItem item) {
      this.index = index;
      this.builder = new V1LimitRangeItemBuilder(this, item);
    }
  
    public N and() {
      return (N) V1LimitRangeSpecFluent.this.setToLimits(index, builder.build());
    }
    
    public N endLimit() {
      return and();
    }
    
  }
}