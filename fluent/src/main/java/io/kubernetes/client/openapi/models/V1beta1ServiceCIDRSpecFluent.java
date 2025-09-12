package io.kubernetes.client.openapi.models;

import java.lang.StringBuilder;
import java.lang.SuppressWarnings;
import io.kubernetes.client.fluent.BaseFluent;
import java.util.ArrayList;
import java.util.Objects;
import java.util.Collection;
import java.lang.Object;
import java.util.List;
import java.lang.String;
import java.util.function.Predicate;

/**
 * Generated
 */
@SuppressWarnings("unchecked")
public class V1beta1ServiceCIDRSpecFluent<A extends io.kubernetes.client.openapi.models.V1beta1ServiceCIDRSpecFluent<A>> extends BaseFluent<A>{
  public V1beta1ServiceCIDRSpecFluent() {
  }
  
  public V1beta1ServiceCIDRSpecFluent(V1beta1ServiceCIDRSpec instance) {
    this.copyInstance(instance);
  }
  private List<String> cidrs;
  
  protected void copyInstance(V1beta1ServiceCIDRSpec instance) {
    instance = instance != null ? instance : new V1beta1ServiceCIDRSpec();
    if (instance != null) {
      this.withCidrs(instance.getCidrs());
    }
  }
  
  public A addToCidrs(int index,String item) {
    if (this.cidrs == null) {
      this.cidrs = new ArrayList();
    }
    this.cidrs.add(index, item);
    return (A) this;
  }
  
  public A setToCidrs(int index,String item) {
    if (this.cidrs == null) {
      this.cidrs = new ArrayList();
    }
    this.cidrs.set(index, item);
    return (A) this;
  }
  
  public A addToCidrs(String... items) {
    if (this.cidrs == null) {
      this.cidrs = new ArrayList();
    }
    for (String item : items) {
      this.cidrs.add(item);
    }
    return (A) this;
  }
  
  public A addAllToCidrs(Collection<String> items) {
    if (this.cidrs == null) {
      this.cidrs = new ArrayList();
    }
    for (String item : items) {
      this.cidrs.add(item);
    }
    return (A) this;
  }
  
  public A removeFromCidrs(String... items) {
    if (this.cidrs == null) {
      return (A) this;
    }
    for (String item : items) {
      this.cidrs.remove(item);
    }
    return (A) this;
  }
  
  public A removeAllFromCidrs(Collection<String> items) {
    if (this.cidrs == null) {
      return (A) this;
    }
    for (String item : items) {
      this.cidrs.remove(item);
    }
    return (A) this;
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
  
  public A withCidrs(String... cidrs) {
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
    return this.cidrs != null && !(this.cidrs.isEmpty());
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
    V1beta1ServiceCIDRSpecFluent that = (V1beta1ServiceCIDRSpecFluent) o;
    if (!(Objects.equals(cidrs, that.cidrs))) {
      return false;
    }
    return true;
  }
  
  public int hashCode() {
    return Objects.hash(cidrs);
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (!(cidrs == null) && !(cidrs.isEmpty())) {
        sb.append("cidrs:");
        sb.append(cidrs);
    }
    sb.append("}");
    return sb.toString();
  }
  

}