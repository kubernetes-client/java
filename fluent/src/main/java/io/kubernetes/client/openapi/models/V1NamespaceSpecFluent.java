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
public class V1NamespaceSpecFluent<A extends io.kubernetes.client.openapi.models.V1NamespaceSpecFluent<A>> extends BaseFluent<A>{

  private List<String> finalizers;

  public V1NamespaceSpecFluent() {
  }
  
  public V1NamespaceSpecFluent(V1NamespaceSpec instance) {
    this.copyInstance(instance);
  }

  public A addAllToFinalizers(Collection<String> items) {
    if (this.finalizers == null) {
      this.finalizers = new ArrayList();
    }
    for (String item : items) {
      this.finalizers.add(item);
    }
    return (A) this;
  }
  
  public A addToFinalizers(String... items) {
    if (this.finalizers == null) {
      this.finalizers = new ArrayList();
    }
    for (String item : items) {
      this.finalizers.add(item);
    }
    return (A) this;
  }
  
  public A addToFinalizers(int index,String item) {
    if (this.finalizers == null) {
      this.finalizers = new ArrayList();
    }
    this.finalizers.add(index, item);
    return (A) this;
  }
  
  protected void copyInstance(V1NamespaceSpec instance) {
    instance = instance != null ? instance : new V1NamespaceSpec();
    if (instance != null) {
      this.withFinalizers(instance.getFinalizers());
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
    V1NamespaceSpecFluent that = (V1NamespaceSpecFluent) o;
    if (!(Objects.equals(finalizers, that.finalizers))) {
      return false;
    }
    return true;
  }
  
  public String getFinalizer(int index) {
    return this.finalizers.get(index);
  }
  
  public List<String> getFinalizers() {
    return this.finalizers;
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
  
  public boolean hasFinalizers() {
    return this.finalizers != null && !(this.finalizers.isEmpty());
  }
  
  public boolean hasMatchingFinalizer(Predicate<String> predicate) {
      for (String item : finalizers) {
        if (predicate.test(item)) {
          return true;
        }
      }
      return false;
  }
  
  public int hashCode() {
    return Objects.hash(finalizers);
  }
  
  public A removeAllFromFinalizers(Collection<String> items) {
    if (this.finalizers == null) {
      return (A) this;
    }
    for (String item : items) {
      this.finalizers.remove(item);
    }
    return (A) this;
  }
  
  public A removeFromFinalizers(String... items) {
    if (this.finalizers == null) {
      return (A) this;
    }
    for (String item : items) {
      this.finalizers.remove(item);
    }
    return (A) this;
  }
  
  public A setToFinalizers(int index,String item) {
    if (this.finalizers == null) {
      this.finalizers = new ArrayList();
    }
    this.finalizers.set(index, item);
    return (A) this;
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (!(finalizers == null) && !(finalizers.isEmpty())) {
        sb.append("finalizers:");
        sb.append(finalizers);
    }
    sb.append("}");
    return sb.toString();
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
  
  public A withFinalizers(String... finalizers) {
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
  
}