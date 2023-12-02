package io.kubernetes.client.openapi.models;

import java.lang.SuppressWarnings;
import io.kubernetes.client.fluent.BaseFluent;
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
public class V1NamespaceSpecFluent<A extends V1NamespaceSpecFluent<A>> extends BaseFluent<A>{
  public V1NamespaceSpecFluent() {
  }
  
  public V1NamespaceSpecFluent(V1NamespaceSpec instance) {
    this.copyInstance(instance);
  }
  private List<String> finalizers;
  
  protected void copyInstance(V1NamespaceSpec instance) {
    instance = (instance != null ? instance : new V1NamespaceSpec());
    if (instance != null) {
          this.withFinalizers(instance.getFinalizers());
        }
  }
  
  public A addToFinalizers(int index,String item) {
    if (this.finalizers == null) {this.finalizers = new ArrayList<String>();}
    this.finalizers.add(index, item);
    return (A)this;
  }
  
  public A setToFinalizers(int index,String item) {
    if (this.finalizers == null) {this.finalizers = new ArrayList<String>();}
    this.finalizers.set(index, item); return (A)this;
  }
  
  public A addToFinalizers(java.lang.String... items) {
    if (this.finalizers == null) {this.finalizers = new ArrayList<String>();}
    for (String item : items) {this.finalizers.add(item);} return (A)this;
  }
  
  public A addAllToFinalizers(Collection<String> items) {
    if (this.finalizers == null) {this.finalizers = new ArrayList<String>();}
    for (String item : items) {this.finalizers.add(item);} return (A)this;
  }
  
  public A removeFromFinalizers(java.lang.String... items) {
    if (this.finalizers == null) return (A)this;
    for (String item : items) { this.finalizers.remove(item);} return (A)this;
  }
  
  public A removeAllFromFinalizers(Collection<String> items) {
    if (this.finalizers == null) return (A)this;
    for (String item : items) { this.finalizers.remove(item);} return (A)this;
  }
  
  public List<String> getFinalizers() {
    return this.finalizers;
  }
  
  public String getFinalizer(int index) {
    return this.finalizers.get(index);
  }
  
  public String getFirstFinalizer() {
    return this.finalizers.get(0);
  }
  
  public String getLastFinalizer() {
    return this.finalizers.get(finalizers.size() - 1);
  }
  
  public String getMatchingFinalizer(Predicate<String> predicate) {
      for (String item : finalizers) {
        if (predicate.test(item)) {
          return item;
        }
      }
      return null;
  }
  
  public boolean hasMatchingFinalizer(Predicate<String> predicate) {
      for (String item : finalizers) {
        if (predicate.test(item)) {
          return true;
        }
      }
      return false;
  }
  
  public A withFinalizers(List<String> finalizers) {
    if (finalizers != null) {
        this.finalizers = new ArrayList();
        for (String item : finalizers) {
          this.addToFinalizers(item);
        }
    } else {
      this.finalizers = null;
    }
    return (A) this;
  }
  
  public A withFinalizers(java.lang.String... finalizers) {
    if (this.finalizers != null) {
        this.finalizers.clear();
        _visitables.remove("finalizers");
    }
    if (finalizers != null) {
      for (String item : finalizers) {
        this.addToFinalizers(item);
      }
    }
    return (A) this;
  }
  
  public boolean hasFinalizers() {
    return this.finalizers != null && !this.finalizers.isEmpty();
  }
  
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    V1NamespaceSpecFluent that = (V1NamespaceSpecFluent) o;
    if (!java.util.Objects.equals(finalizers, that.finalizers)) return false;
    return true;
  }
  
  public int hashCode() {
    return java.util.Objects.hash(finalizers,  super.hashCode());
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (finalizers != null && !finalizers.isEmpty()) { sb.append("finalizers:"); sb.append(finalizers); }
    sb.append("}");
    return sb.toString();
  }
  

}