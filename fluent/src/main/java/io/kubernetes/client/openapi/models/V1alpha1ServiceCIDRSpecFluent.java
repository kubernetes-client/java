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
public class V1alpha1ServiceCIDRSpecFluent<A extends V1alpha1ServiceCIDRSpecFluent<A>> extends BaseFluent<A>{
  public V1alpha1ServiceCIDRSpecFluent() {
  }
  
  public V1alpha1ServiceCIDRSpecFluent(V1alpha1ServiceCIDRSpec instance) {
    this.copyInstance(instance);
  }
  private List<String> cidrs;
  
  protected void copyInstance(V1alpha1ServiceCIDRSpec instance) {
    instance = (instance != null ? instance : new V1alpha1ServiceCIDRSpec());
    if (instance != null) {
          this.withCidrs(instance.getCidrs());
        }
  }
  
  public A addToCidrs(int index,String item) {
    if (this.cidrs == null) {this.cidrs = new ArrayList<String>();}
    this.cidrs.add(index, item);
    return (A)this;
  }
  
  public A setToCidrs(int index,String item) {
    if (this.cidrs == null) {this.cidrs = new ArrayList<String>();}
    this.cidrs.set(index, item); return (A)this;
  }
  
  public A addToCidrs(java.lang.String... items) {
    if (this.cidrs == null) {this.cidrs = new ArrayList<String>();}
    for (String item : items) {this.cidrs.add(item);} return (A)this;
  }
  
  public A addAllToCidrs(Collection<String> items) {
    if (this.cidrs == null) {this.cidrs = new ArrayList<String>();}
    for (String item : items) {this.cidrs.add(item);} return (A)this;
  }
  
  public A removeFromCidrs(java.lang.String... items) {
    if (this.cidrs == null) return (A)this;
    for (String item : items) { this.cidrs.remove(item);} return (A)this;
  }
  
  public A removeAllFromCidrs(Collection<String> items) {
    if (this.cidrs == null) return (A)this;
    for (String item : items) { this.cidrs.remove(item);} return (A)this;
  }
  
  public List<String> getCidrs() {
    return this.cidrs;
  }
  
  public String getCidr(int index) {
    return this.cidrs.get(index);
  }
  
  public String getFirstCidr() {
    return this.cidrs.get(0);
  }
  
  public String getLastCidr() {
    return this.cidrs.get(cidrs.size() - 1);
  }
  
  public String getMatchingCidr(Predicate<String> predicate) {
      for (String item : cidrs) {
        if (predicate.test(item)) {
          return item;
        }
      }
      return null;
  }
  
  public boolean hasMatchingCidr(Predicate<String> predicate) {
      for (String item : cidrs) {
        if (predicate.test(item)) {
          return true;
        }
      }
      return false;
  }
  
  public A withCidrs(List<String> cidrs) {
    if (cidrs != null) {
        this.cidrs = new ArrayList();
        for (String item : cidrs) {
          this.addToCidrs(item);
        }
    } else {
      this.cidrs = null;
    }
    return (A) this;
  }
  
  public A withCidrs(java.lang.String... cidrs) {
    if (this.cidrs != null) {
        this.cidrs.clear();
        _visitables.remove("cidrs");
    }
    if (cidrs != null) {
      for (String item : cidrs) {
        this.addToCidrs(item);
      }
    }
    return (A) this;
  }
  
  public boolean hasCidrs() {
    return this.cidrs != null && !this.cidrs.isEmpty();
  }
  
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    V1alpha1ServiceCIDRSpecFluent that = (V1alpha1ServiceCIDRSpecFluent) o;
    if (!java.util.Objects.equals(cidrs, that.cidrs)) return false;
    return true;
  }
  
  public int hashCode() {
    return java.util.Objects.hash(cidrs,  super.hashCode());
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (cidrs != null && !cidrs.isEmpty()) { sb.append("cidrs:"); sb.append(cidrs); }
    sb.append("}");
    return sb.toString();
  }
  

}