package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.BaseFluent;
import java.lang.Object;
import java.lang.String;
import java.lang.StringBuilder;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Objects;
import java.util.function.Predicate;

/**
 * Generated
 */
@SuppressWarnings("unchecked")
public class V1IPBlockFluent<A extends io.kubernetes.client.openapi.models.V1IPBlockFluent<A>> extends BaseFluent<A>{

  private String cidr;
  private List<String> except;

  public V1IPBlockFluent() {
  }
  
  public V1IPBlockFluent(V1IPBlock instance) {
    this.copyInstance(instance);
  }

  public A addAllToExcept(Collection<String> items) {
    if (this.except == null) {
      this.except = new ArrayList();
    }
    for (String item : items) {
      this.except.add(item);
    }
    return (A) this;
  }
  
  public A addToExcept(String... items) {
    if (this.except == null) {
      this.except = new ArrayList();
    }
    for (String item : items) {
      this.except.add(item);
    }
    return (A) this;
  }
  
  public A addToExcept(int index,String item) {
    if (this.except == null) {
      this.except = new ArrayList();
    }
    this.except.add(index, item);
    return (A) this;
  }
  
  protected void copyInstance(V1IPBlock instance) {
    instance = instance != null ? instance : new V1IPBlock();
    if (instance != null) {
        this.withCidr(instance.getCidr());
        this.withExcept(instance.getExcept());
    }
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
    V1IPBlockFluent that = (V1IPBlockFluent) o;
    if (!(Objects.equals(cidr, that.cidr))) {
      return false;
    }
    if (!(Objects.equals(except, that.except))) {
      return false;
    }
    return true;
  }
  
  public String getCidr() {
    return this.cidr;
  }
  
  public List<String> getExcept() {
    return this.except;
  }
  
  public String getExcept(int index) {
    return this.except.get(index);
  }
  
  public String getFirstExcept() {
    return this.except.get(0);
  }
  
  public String getLastExcept() {
    return this.except.get(except.size() - 1);
  }
  
  public String getMatchingExcept(Predicate<String> predicate) {
      for (String item : except) {
        if (predicate.test(item)) {
          return item;
        }
      }
      return null;
  }
  
  public boolean hasCidr() {
    return this.cidr != null;
  }
  
  public boolean hasExcept() {
    return this.except != null && !(this.except.isEmpty());
  }
  
  public boolean hasMatchingExcept(Predicate<String> predicate) {
      for (String item : except) {
        if (predicate.test(item)) {
          return true;
        }
      }
      return false;
  }
  
  public int hashCode() {
    return Objects.hash(cidr, except);
  }
  
  public A removeAllFromExcept(Collection<String> items) {
    if (this.except == null) {
      return (A) this;
    }
    for (String item : items) {
      this.except.remove(item);
    }
    return (A) this;
  }
  
  public A removeFromExcept(String... items) {
    if (this.except == null) {
      return (A) this;
    }
    for (String item : items) {
      this.except.remove(item);
    }
    return (A) this;
  }
  
  public A setToExcept(int index,String item) {
    if (this.except == null) {
      this.except = new ArrayList();
    }
    this.except.set(index, item);
    return (A) this;
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (!(cidr == null)) {
        sb.append("cidr:");
        sb.append(cidr);
        sb.append(",");
    }
    if (!(except == null) && !(except.isEmpty())) {
        sb.append("except:");
        sb.append(except);
    }
    sb.append("}");
    return sb.toString();
  }
  
  public A withCidr(String cidr) {
    this.cidr = cidr;
    return (A) this;
  }
  
  public A withExcept(List<String> except) {
    if (except != null) {
        this.except = new ArrayList();
        for (String item : except) {
          this.addToExcept(item);
        }
    } else {
      this.except = null;
    }
    return (A) this;
  }
  
  public A withExcept(String... except) {
    if (this.except != null) {
        this.except.clear();
        _visitables.remove("except");
    }
    if (except != null) {
      for (String item : except) {
        this.addToExcept(item);
      }
    }
    return (A) this;
  }
  
}