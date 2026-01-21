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
public class V1IngressLoadBalancerStatusFluent<A extends io.kubernetes.client.openapi.models.V1IngressLoadBalancerStatusFluent<A>> extends BaseFluent<A>{

  private ArrayList<V1IngressLoadBalancerIngressBuilder> ingress;

  public V1IngressLoadBalancerStatusFluent() {
  }
  
  public V1IngressLoadBalancerStatusFluent(V1IngressLoadBalancerStatus instance) {
    this.copyInstance(instance);
  }

  public A addAllToIngress(Collection<V1IngressLoadBalancerIngress> items) {
    if (this.ingress == null) {
      this.ingress = new ArrayList();
    }
    for (V1IngressLoadBalancerIngress item : items) {
        V1IngressLoadBalancerIngressBuilder builder = new V1IngressLoadBalancerIngressBuilder(item);
        _visitables.get("ingress").add(builder);
        this.ingress.add(builder);
    }
    return (A) this;
  }
  
  public IngressNested<A> addNewIngress() {
    return new IngressNested(-1, null);
  }
  
  public IngressNested<A> addNewIngressLike(V1IngressLoadBalancerIngress item) {
    return new IngressNested(-1, item);
  }
  
  public A addToIngress(V1IngressLoadBalancerIngress... items) {
    if (this.ingress == null) {
      this.ingress = new ArrayList();
    }
    for (V1IngressLoadBalancerIngress item : items) {
        V1IngressLoadBalancerIngressBuilder builder = new V1IngressLoadBalancerIngressBuilder(item);
        _visitables.get("ingress").add(builder);
        this.ingress.add(builder);
    }
    return (A) this;
  }
  
  public A addToIngress(int index,V1IngressLoadBalancerIngress item) {
    if (this.ingress == null) {
      this.ingress = new ArrayList();
    }
    V1IngressLoadBalancerIngressBuilder builder = new V1IngressLoadBalancerIngressBuilder(item);
    if (index < 0 || index >= ingress.size()) {
        _visitables.get("ingress").add(builder);
        ingress.add(builder);
    } else {
        _visitables.get("ingress").add(builder);
        ingress.add(index, builder);
    }
    return (A) this;
  }
  
  public V1IngressLoadBalancerIngress buildFirstIngress() {
    return this.ingress.get(0).build();
  }
  
  public List<V1IngressLoadBalancerIngress> buildIngress() {
    return this.ingress != null ? build(ingress) : null;
  }
  
  public V1IngressLoadBalancerIngress buildIngress(int index) {
    return this.ingress.get(index).build();
  }
  
  public V1IngressLoadBalancerIngress buildLastIngress() {
    return this.ingress.get(ingress.size() - 1).build();
  }
  
  public V1IngressLoadBalancerIngress buildMatchingIngress(Predicate<V1IngressLoadBalancerIngressBuilder> predicate) {
      for (V1IngressLoadBalancerIngressBuilder item : ingress) {
        if (predicate.test(item)) {
          return item.build();
        }
      }
      return null;
  }
  
  protected void copyInstance(V1IngressLoadBalancerStatus instance) {
    instance = instance != null ? instance : new V1IngressLoadBalancerStatus();
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
  
  public IngressNested<A> editMatchingIngress(Predicate<V1IngressLoadBalancerIngressBuilder> predicate) {
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
    V1IngressLoadBalancerStatusFluent that = (V1IngressLoadBalancerStatusFluent) o;
    if (!(Objects.equals(ingress, that.ingress))) {
      return false;
    }
    return true;
  }
  
  public boolean hasIngress() {
    return this.ingress != null && !(this.ingress.isEmpty());
  }
  
  public boolean hasMatchingIngress(Predicate<V1IngressLoadBalancerIngressBuilder> predicate) {
      for (V1IngressLoadBalancerIngressBuilder item : ingress) {
        if (predicate.test(item)) {
          return true;
        }
      }
      return false;
  }
  
  public int hashCode() {
    return Objects.hash(ingress);
  }
  
  public A removeAllFromIngress(Collection<V1IngressLoadBalancerIngress> items) {
    if (this.ingress == null) {
      return (A) this;
    }
    for (V1IngressLoadBalancerIngress item : items) {
        V1IngressLoadBalancerIngressBuilder builder = new V1IngressLoadBalancerIngressBuilder(item);
        _visitables.get("ingress").remove(builder);
        this.ingress.remove(builder);
    }
    return (A) this;
  }
  
  public A removeFromIngress(V1IngressLoadBalancerIngress... items) {
    if (this.ingress == null) {
      return (A) this;
    }
    for (V1IngressLoadBalancerIngress item : items) {
        V1IngressLoadBalancerIngressBuilder builder = new V1IngressLoadBalancerIngressBuilder(item);
        _visitables.get("ingress").remove(builder);
        this.ingress.remove(builder);
    }
    return (A) this;
  }
  
  public A removeMatchingFromIngress(Predicate<V1IngressLoadBalancerIngressBuilder> predicate) {
    if (ingress == null) {
      return (A) this;
    }
    Iterator<V1IngressLoadBalancerIngressBuilder> each = ingress.iterator();
    List visitables = _visitables.get("ingress");
    while (each.hasNext()) {
        V1IngressLoadBalancerIngressBuilder builder = each.next();
        if (predicate.test(builder)) {
            visitables.remove(builder);
            each.remove();
        }
    }
    return (A) this;
  }
  
  public IngressNested<A> setNewIngressLike(int index,V1IngressLoadBalancerIngress item) {
    return new IngressNested(index, item);
  }
  
  public A setToIngress(int index,V1IngressLoadBalancerIngress item) {
    if (this.ingress == null) {
      this.ingress = new ArrayList();
    }
    V1IngressLoadBalancerIngressBuilder builder = new V1IngressLoadBalancerIngressBuilder(item);
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
  
  public A withIngress(List<V1IngressLoadBalancerIngress> ingress) {
    if (this.ingress != null) {
      this._visitables.get("ingress").clear();
    }
    if (ingress != null) {
        this.ingress = new ArrayList();
        for (V1IngressLoadBalancerIngress item : ingress) {
          this.addToIngress(item);
        }
    } else {
      this.ingress = null;
    }
    return (A) this;
  }
  
  public A withIngress(V1IngressLoadBalancerIngress... ingress) {
    if (this.ingress != null) {
        this.ingress.clear();
        _visitables.remove("ingress");
    }
    if (ingress != null) {
      for (V1IngressLoadBalancerIngress item : ingress) {
        this.addToIngress(item);
      }
    }
    return (A) this;
  }
  public class IngressNested<N> extends V1IngressLoadBalancerIngressFluent<IngressNested<N>> implements Nested<N>{
  
    V1IngressLoadBalancerIngressBuilder builder;
    int index;
  
    IngressNested(int index,V1IngressLoadBalancerIngress item) {
      this.index = index;
      this.builder = new V1IngressLoadBalancerIngressBuilder(this, item);
    }
  
    public N and() {
      return (N) V1IngressLoadBalancerStatusFluent.this.setToIngress(index, builder.build());
    }
    
    public N endIngress() {
      return and();
    }
    
  }
}