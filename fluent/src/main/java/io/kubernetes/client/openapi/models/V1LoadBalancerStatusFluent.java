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
public class V1LoadBalancerStatusFluent<A extends io.kubernetes.client.openapi.models.V1LoadBalancerStatusFluent<A>> extends BaseFluent<A>{

  private ArrayList<V1LoadBalancerIngressBuilder> ingress;

  public V1LoadBalancerStatusFluent() {
  }
  
  public V1LoadBalancerStatusFluent(V1LoadBalancerStatus instance) {
    this.copyInstance(instance);
  }

  public A addAllToIngress(Collection<V1LoadBalancerIngress> items) {
    if (this.ingress == null) {
      this.ingress = new ArrayList();
    }
    for (V1LoadBalancerIngress item : items) {
        V1LoadBalancerIngressBuilder builder = new V1LoadBalancerIngressBuilder(item);
        _visitables.get("ingress").add(builder);
        this.ingress.add(builder);
    }
    return (A) this;
  }
  
  public IngressNested<A> addNewIngress() {
    return new IngressNested(-1, null);
  }
  
  public IngressNested<A> addNewIngressLike(V1LoadBalancerIngress item) {
    return new IngressNested(-1, item);
  }
  
  public A addToIngress(V1LoadBalancerIngress... items) {
    if (this.ingress == null) {
      this.ingress = new ArrayList();
    }
    for (V1LoadBalancerIngress item : items) {
        V1LoadBalancerIngressBuilder builder = new V1LoadBalancerIngressBuilder(item);
        _visitables.get("ingress").add(builder);
        this.ingress.add(builder);
    }
    return (A) this;
  }
  
  public A addToIngress(int index,V1LoadBalancerIngress item) {
    if (this.ingress == null) {
      this.ingress = new ArrayList();
    }
    V1LoadBalancerIngressBuilder builder = new V1LoadBalancerIngressBuilder(item);
    if (index < 0 || index >= ingress.size()) {
        _visitables.get("ingress").add(builder);
        ingress.add(builder);
    } else {
        _visitables.get("ingress").add(builder);
        ingress.add(index, builder);
    }
    return (A) this;
  }
  
  public V1LoadBalancerIngress buildFirstIngress() {
    return this.ingress.get(0).build();
  }
  
  public List<V1LoadBalancerIngress> buildIngress() {
    return this.ingress != null ? build(ingress) : null;
  }
  
  public V1LoadBalancerIngress buildIngress(int index) {
    return this.ingress.get(index).build();
  }
  
  public V1LoadBalancerIngress buildLastIngress() {
    return this.ingress.get(ingress.size() - 1).build();
  }
  
  public V1LoadBalancerIngress buildMatchingIngress(Predicate<V1LoadBalancerIngressBuilder> predicate) {
      for (V1LoadBalancerIngressBuilder item : ingress) {
        if (predicate.test(item)) {
          return item.build();
        }
      }
      return null;
  }
  
  protected void copyInstance(V1LoadBalancerStatus instance) {
    instance = instance != null ? instance : new V1LoadBalancerStatus();
    if (instance != null) {
      this.withIngress(instance.getIngress());
    }
  }
  
  public IngressNested<A> editFirstIngress() {
    if (ingress.size() == 0) {
      throw new RuntimeException(String.format("Can't edit first %s. The list is empty.", "ingress"));
    }
    return this.setNewIngressLike(0, this.buildIngress(0));
  }
  
  public IngressNested<A> editIngress(int index) {
    if (ingress.size() <= index) {
      throw new RuntimeException(String.format("Can't edit %s. Index exceeds size.", "ingress"));
    }
    return this.setNewIngressLike(index, this.buildIngress(index));
  }
  
  public IngressNested<A> editLastIngress() {
    int index = ingress.size() - 1;
    if (index < 0) {
      throw new RuntimeException(String.format("Can't edit last %s. The list is empty.", "ingress"));
    }
    return this.setNewIngressLike(index, this.buildIngress(index));
  }
  
  public IngressNested<A> editMatchingIngress(Predicate<V1LoadBalancerIngressBuilder> predicate) {
    int index = -1;
    for (int i = 0;i < ingress.size();i++) {
      if (predicate.test(ingress.get(i))) {
          index = i;
          break;
      }
    }
    if (index < 0) {
      throw new RuntimeException(String.format("Can't edit matching %s. No match found.", "ingress"));
    }
    return this.setNewIngressLike(index, this.buildIngress(index));
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
    V1LoadBalancerStatusFluent that = (V1LoadBalancerStatusFluent) o;
    if (!(Objects.equals(ingress, that.ingress))) {
      return false;
    }
    return true;
  }
  
  public boolean hasIngress() {
    return this.ingress != null && !(this.ingress.isEmpty());
  }
  
  public boolean hasMatchingIngress(Predicate<V1LoadBalancerIngressBuilder> predicate) {
      for (V1LoadBalancerIngressBuilder item : ingress) {
        if (predicate.test(item)) {
          return true;
        }
      }
      return false;
  }
  
  public int hashCode() {
    return Objects.hash(ingress);
  }
  
  public A removeAllFromIngress(Collection<V1LoadBalancerIngress> items) {
    if (this.ingress == null) {
      return (A) this;
    }
    for (V1LoadBalancerIngress item : items) {
        V1LoadBalancerIngressBuilder builder = new V1LoadBalancerIngressBuilder(item);
        _visitables.get("ingress").remove(builder);
        this.ingress.remove(builder);
    }
    return (A) this;
  }
  
  public A removeFromIngress(V1LoadBalancerIngress... items) {
    if (this.ingress == null) {
      return (A) this;
    }
    for (V1LoadBalancerIngress item : items) {
        V1LoadBalancerIngressBuilder builder = new V1LoadBalancerIngressBuilder(item);
        _visitables.get("ingress").remove(builder);
        this.ingress.remove(builder);
    }
    return (A) this;
  }
  
  public A removeMatchingFromIngress(Predicate<V1LoadBalancerIngressBuilder> predicate) {
    if (ingress == null) {
      return (A) this;
    }
    Iterator<V1LoadBalancerIngressBuilder> each = ingress.iterator();
    List visitables = _visitables.get("ingress");
    while (each.hasNext()) {
        V1LoadBalancerIngressBuilder builder = each.next();
        if (predicate.test(builder)) {
            visitables.remove(builder);
            each.remove();
        }
    }
    return (A) this;
  }
  
  public IngressNested<A> setNewIngressLike(int index,V1LoadBalancerIngress item) {
    return new IngressNested(index, item);
  }
  
  public A setToIngress(int index,V1LoadBalancerIngress item) {
    if (this.ingress == null) {
      this.ingress = new ArrayList();
    }
    V1LoadBalancerIngressBuilder builder = new V1LoadBalancerIngressBuilder(item);
    if (index < 0 || index >= ingress.size()) {
        _visitables.get("ingress").add(builder);
        ingress.add(builder);
    } else {
        _visitables.get("ingress").add(builder);
        ingress.set(index, builder);
    }
    return (A) this;
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (!(ingress == null) && !(ingress.isEmpty())) {
        sb.append("ingress:");
        sb.append(ingress);
    }
    sb.append("}");
    return sb.toString();
  }
  
  public A withIngress(List<V1LoadBalancerIngress> ingress) {
    if (this.ingress != null) {
      this._visitables.get("ingress").clear();
    }
    if (ingress != null) {
        this.ingress = new ArrayList();
        for (V1LoadBalancerIngress item : ingress) {
          this.addToIngress(item);
        }
    } else {
      this.ingress = null;
    }
    return (A) this;
  }
  
  public A withIngress(V1LoadBalancerIngress... ingress) {
    if (this.ingress != null) {
        this.ingress.clear();
        _visitables.remove("ingress");
    }
    if (ingress != null) {
      for (V1LoadBalancerIngress item : ingress) {
        this.addToIngress(item);
      }
    }
    return (A) this;
  }
  public class IngressNested<N> extends V1LoadBalancerIngressFluent<IngressNested<N>> implements Nested<N>{
  
    V1LoadBalancerIngressBuilder builder;
    int index;
  
    IngressNested(int index,V1LoadBalancerIngress item) {
      this.index = index;
      this.builder = new V1LoadBalancerIngressBuilder(this, item);
    }
  
    public N and() {
      return (N) V1LoadBalancerStatusFluent.this.setToIngress(index, builder.build());
    }
    
    public N endIngress() {
      return and();
    }
    
  }
}