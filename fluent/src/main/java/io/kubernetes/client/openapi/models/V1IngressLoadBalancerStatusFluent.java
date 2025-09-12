package io.kubernetes.client.openapi.models;

import java.lang.StringBuilder;
import java.lang.SuppressWarnings;
import io.kubernetes.client.fluent.Nested;
import java.util.ArrayList;
import java.lang.String;
import java.util.function.Predicate;
import java.lang.RuntimeException;
import io.kubernetes.client.fluent.BaseFluent;
import java.util.Iterator;
import java.util.Objects;
import java.util.Collection;
import java.lang.Object;
import java.util.List;

/**
 * Generated
 */
@SuppressWarnings("unchecked")
public class V1IngressLoadBalancerStatusFluent<A extends io.kubernetes.client.openapi.models.V1IngressLoadBalancerStatusFluent<A>> extends BaseFluent<A>{
  public V1IngressLoadBalancerStatusFluent() {
  }
  
  public V1IngressLoadBalancerStatusFluent(V1IngressLoadBalancerStatus instance) {
    this.copyInstance(instance);
  }
  private ArrayList<V1IngressLoadBalancerIngressBuilder> ingress;
  
  protected void copyInstance(V1IngressLoadBalancerStatus instance) {
    instance = instance != null ? instance : new V1IngressLoadBalancerStatus();
    if (instance != null) {
      this.withIngress(instance.getIngress());
    }
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
  
  public List<V1IngressLoadBalancerIngress> buildIngress() {
    return this.ingress != null ? build(ingress) : null;
  }
  
  public V1IngressLoadBalancerIngress buildIngress(int index) {
    return this.ingress.get(index).build();
  }
  
  public V1IngressLoadBalancerIngress buildFirstIngress() {
    return this.ingress.get(0).build();
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
  
  public boolean hasMatchingIngress(Predicate<V1IngressLoadBalancerIngressBuilder> predicate) {
      for (V1IngressLoadBalancerIngressBuilder item : ingress) {
        if (predicate.test(item)) {
          return true;
        }
      }
      return false;
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
  
  public boolean hasIngress() {
    return this.ingress != null && !(this.ingress.isEmpty());
  }
  
  public IngressNested<A> addNewIngress() {
    return new IngressNested(-1, null);
  }
  
  public IngressNested<A> addNewIngressLike(V1IngressLoadBalancerIngress item) {
    return new IngressNested(-1, item);
  }
  
  public IngressNested<A> setNewIngressLike(int index,V1IngressLoadBalancerIngress item) {
    return new IngressNested(index, item);
  }
  
  public IngressNested<A> editIngress(int index) {
    if (index <= ingress.size()) {
      throw new RuntimeException(String.format("Can't edit %s. Index exceeds size.", "ingress"));
    }
    return this.setNewIngressLike(index, this.buildIngress(index));
  }
  
  public IngressNested<A> editFirstIngress() {
    if (ingress.size() == 0) {
      throw new RuntimeException(String.format("Can't edit first %s. The list is empty.", "ingress"));
    }
    return this.setNewIngressLike(0, this.buildIngress(0));
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
  
  public int hashCode() {
    return Objects.hash(ingress);
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
  public class IngressNested<N> extends V1IngressLoadBalancerIngressFluent<IngressNested<N>> implements Nested<N>{
    IngressNested(int index,V1IngressLoadBalancerIngress item) {
      this.index = index;
      this.builder = new V1IngressLoadBalancerIngressBuilder(this, item);
    }
    V1IngressLoadBalancerIngressBuilder builder;
    int index;
    
    public N and() {
      return (N) V1IngressLoadBalancerStatusFluent.this.setToIngress(index, builder.build());
    }
    
    public N endIngress() {
      return and();
    }
    
  
  }

}