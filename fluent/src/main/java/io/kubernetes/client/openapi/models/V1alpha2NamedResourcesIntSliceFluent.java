package io.kubernetes.client.openapi.models;

import java.lang.SuppressWarnings;
import io.kubernetes.client.fluent.BaseFluent;
import java.lang.Long;
import java.util.ArrayList;
import java.util.Collection;
import java.lang.Object;
import java.util.List;
import java.lang.String;
import java.util.function.Predicate;

/**
 * Generated
 */
@SuppressWarnings("unchecked")
public class V1alpha2NamedResourcesIntSliceFluent<A extends V1alpha2NamedResourcesIntSliceFluent<A>> extends BaseFluent<A>{
  public V1alpha2NamedResourcesIntSliceFluent() {
  }
  
  public V1alpha2NamedResourcesIntSliceFluent(V1alpha2NamedResourcesIntSlice instance) {
    this.copyInstance(instance);
  }
  private List<Long> ints;
  
  protected void copyInstance(V1alpha2NamedResourcesIntSlice instance) {
    instance = (instance != null ? instance : new V1alpha2NamedResourcesIntSlice());
    if (instance != null) {
          this.withInts(instance.getInts());
        }
  }
  
  public A addToInts(int index,Long item) {
    if (this.ints == null) {this.ints = new ArrayList<Long>();}
    this.ints.add(index, item);
    return (A)this;
  }
  
  public A setToInts(int index,Long item) {
    if (this.ints == null) {this.ints = new ArrayList<Long>();}
    this.ints.set(index, item); return (A)this;
  }
  
  public A addToInts(java.lang.Long... items) {
    if (this.ints == null) {this.ints = new ArrayList<Long>();}
    for (Long item : items) {this.ints.add(item);} return (A)this;
  }
  
  public A addAllToInts(Collection<Long> items) {
    if (this.ints == null) {this.ints = new ArrayList<Long>();}
    for (Long item : items) {this.ints.add(item);} return (A)this;
  }
  
  public A removeFromInts(java.lang.Long... items) {
    if (this.ints == null) return (A)this;
    for (Long item : items) { this.ints.remove(item);} return (A)this;
  }
  
  public A removeAllFromInts(Collection<Long> items) {
    if (this.ints == null) return (A)this;
    for (Long item : items) { this.ints.remove(item);} return (A)this;
  }
  
  public List<Long> getInts() {
    return this.ints;
  }
  
  public Long getInt(int index) {
    return this.ints.get(index);
  }
  
  public Long getFirstInt() {
    return this.ints.get(0);
  }
  
  public Long getLastInt() {
    return this.ints.get(ints.size() - 1);
  }
  
  public Long getMatchingInt(Predicate<Long> predicate) {
      for (Long item : ints) {
        if (predicate.test(item)) {
          return item;
        }
      }
      return null;
  }
  
  public boolean hasMatchingInt(Predicate<Long> predicate) {
      for (Long item : ints) {
        if (predicate.test(item)) {
          return true;
        }
      }
      return false;
  }
  
  public A withInts(List<Long> ints) {
    if (ints != null) {
        this.ints = new ArrayList();
        for (Long item : ints) {
          this.addToInts(item);
        }
    } else {
      this.ints = null;
    }
    return (A) this;
  }
  
  public A withInts(java.lang.Long... ints) {
    if (this.ints != null) {
        this.ints.clear();
        _visitables.remove("ints");
    }
    if (ints != null) {
      for (Long item : ints) {
        this.addToInts(item);
      }
    }
    return (A) this;
  }
  
  public boolean hasInts() {
    return this.ints != null && !this.ints.isEmpty();
  }
  
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    V1alpha2NamedResourcesIntSliceFluent that = (V1alpha2NamedResourcesIntSliceFluent) o;
    if (!java.util.Objects.equals(ints, that.ints)) return false;
    return true;
  }
  
  public int hashCode() {
    return java.util.Objects.hash(ints,  super.hashCode());
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (ints != null && !ints.isEmpty()) { sb.append("ints:"); sb.append(ints); }
    sb.append("}");
    return sb.toString();
  }
  

}