package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.SuppressWarnings;
import io.kubernetes.client.fluent.Nested;
import java.util.ArrayList;
import java.lang.String;
import java.util.function.Predicate;
import java.lang.Deprecated;
import io.kubernetes.client.fluent.BaseFluent;
import java.util.Iterator;
import java.util.Collection;
import java.lang.Object;
import java.util.List;
import java.lang.Boolean;

 /**
  * Generated
  */
  @SuppressWarnings(value = "unchecked")
  public class V1IngressLoadBalancerStatusFluentImpl<A extends V1IngressLoadBalancerStatusFluent<A>> extends BaseFluent<A> implements V1IngressLoadBalancerStatusFluent<A>{
  public V1IngressLoadBalancerStatusFluentImpl() {
  }
  public V1IngressLoadBalancerStatusFluentImpl(V1IngressLoadBalancerStatus instance) {
    if (instance != null) {
      this.withIngress(instance.getIngress());
    }
  }
  private ArrayList<V1IngressLoadBalancerIngressBuilder> ingress;
  public A addToIngress(int index,V1IngressLoadBalancerIngress item) {
    if (this.ingress == null) {this.ingress = new ArrayList<V1IngressLoadBalancerIngressBuilder>();}
    V1IngressLoadBalancerIngressBuilder builder = new V1IngressLoadBalancerIngressBuilder(item);
    if (index < 0 || index >= ingress.size()) { _visitables.get("ingress").add(builder); ingress.add(builder); } else { _visitables.get("ingress").add(index, builder); ingress.add(index, builder);}
    return (A)this;
  }
  public A setToIngress(int index,V1IngressLoadBalancerIngress item) {
    if (this.ingress == null) {this.ingress = new ArrayList<V1IngressLoadBalancerIngressBuilder>();}
    V1IngressLoadBalancerIngressBuilder builder = new V1IngressLoadBalancerIngressBuilder(item);
    if (index < 0 || index >= ingress.size()) { _visitables.get("ingress").add(builder); ingress.add(builder); } else { _visitables.get("ingress").set(index, builder); ingress.set(index, builder);}
    return (A)this;
  }
  public A addToIngress(io.kubernetes.client.openapi.models.V1IngressLoadBalancerIngress... items) {
    if (this.ingress == null) {this.ingress = new ArrayList<V1IngressLoadBalancerIngressBuilder>();}
    for (V1IngressLoadBalancerIngress item : items) {V1IngressLoadBalancerIngressBuilder builder = new V1IngressLoadBalancerIngressBuilder(item);_visitables.get("ingress").add(builder);this.ingress.add(builder);} return (A)this;
  }
  public A addAllToIngress(Collection<V1IngressLoadBalancerIngress> items) {
    if (this.ingress == null) {this.ingress = new ArrayList<V1IngressLoadBalancerIngressBuilder>();}
    for (V1IngressLoadBalancerIngress item : items) {V1IngressLoadBalancerIngressBuilder builder = new V1IngressLoadBalancerIngressBuilder(item);_visitables.get("ingress").add(builder);this.ingress.add(builder);} return (A)this;
  }
  public A removeFromIngress(io.kubernetes.client.openapi.models.V1IngressLoadBalancerIngress... items) {
    for (V1IngressLoadBalancerIngress item : items) {V1IngressLoadBalancerIngressBuilder builder = new V1IngressLoadBalancerIngressBuilder(item);_visitables.get("ingress").remove(builder);if (this.ingress != null) {this.ingress.remove(builder);}} return (A)this;
  }
  public A removeAllFromIngress(Collection<V1IngressLoadBalancerIngress> items) {
    for (V1IngressLoadBalancerIngress item : items) {V1IngressLoadBalancerIngressBuilder builder = new V1IngressLoadBalancerIngressBuilder(item);_visitables.get("ingress").remove(builder);if (this.ingress != null) {this.ingress.remove(builder);}} return (A)this;
  }
  public A removeMatchingFromIngress(Predicate<V1IngressLoadBalancerIngressBuilder> predicate) {
    if (ingress == null) return (A) this;
    final Iterator<V1IngressLoadBalancerIngressBuilder> each = ingress.iterator();
    final List visitables = _visitables.get("ingress");
    while (each.hasNext()) {
      V1IngressLoadBalancerIngressBuilder builder = each.next();
      if (predicate.test(builder)) {
        visitables.remove(builder);
        each.remove();
      }
    }
    return (A)this;
  }
  
  /**
   * This method has been deprecated, please use method buildIngress instead.
   * @return The buildable object.
   */
  @Deprecated
  public List<V1IngressLoadBalancerIngress> getIngress() {
    return ingress != null ? build(ingress) : null;
  }
  public List<V1IngressLoadBalancerIngress> buildIngress() {
    return ingress != null ? build(ingress) : null;
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
    for (V1IngressLoadBalancerIngressBuilder item: ingress) { if(predicate.test(item)){ return item.build();} } return null;
  }
  public Boolean hasMatchingIngress(Predicate<V1IngressLoadBalancerIngressBuilder> predicate) {
    for (V1IngressLoadBalancerIngressBuilder item: ingress) { if(predicate.test(item)){ return true;} } return false;
  }
  public A withIngress(List<V1IngressLoadBalancerIngress> ingress) {
    if (this.ingress != null) { _visitables.get("ingress").clear();}
    if (ingress != null) {this.ingress = new ArrayList(); for (V1IngressLoadBalancerIngress item : ingress){this.addToIngress(item);}} else { this.ingress = null;} return (A) this;
  }
  public A withIngress(io.kubernetes.client.openapi.models.V1IngressLoadBalancerIngress... ingress) {
    if (this.ingress != null) {this.ingress.clear(); _visitables.remove("ingress"); }
    if (ingress != null) {for (V1IngressLoadBalancerIngress item :ingress){ this.addToIngress(item);}} return (A) this;
  }
  public Boolean hasIngress() {
    return ingress != null && !ingress.isEmpty();
  }
  public V1IngressLoadBalancerStatusFluentImpl.IngressNested<A> addNewIngress() {
    return new V1IngressLoadBalancerStatusFluentImpl.IngressNestedImpl();
  }
  public V1IngressLoadBalancerStatusFluentImpl.IngressNested<A> addNewIngressLike(V1IngressLoadBalancerIngress item) {
    return new V1IngressLoadBalancerStatusFluentImpl.IngressNestedImpl(-1, item);
  }
  public V1IngressLoadBalancerStatusFluentImpl.IngressNested<A> setNewIngressLike(int index,V1IngressLoadBalancerIngress item) {
    return new V1IngressLoadBalancerStatusFluentImpl.IngressNestedImpl(index, item);
  }
  public V1IngressLoadBalancerStatusFluentImpl.IngressNested<A> editIngress(int index) {
    if (ingress.size() <= index) throw new RuntimeException("Can't edit ingress. Index exceeds size.");
    return setNewIngressLike(index, buildIngress(index));
  }
  public V1IngressLoadBalancerStatusFluentImpl.IngressNested<A> editFirstIngress() {
    if (ingress.size() == 0) throw new RuntimeException("Can't edit first ingress. The list is empty.");
    return setNewIngressLike(0, buildIngress(0));
  }
  public V1IngressLoadBalancerStatusFluentImpl.IngressNested<A> editLastIngress() {
    int index = ingress.size() - 1;
    if (index < 0) throw new RuntimeException("Can't edit last ingress. The list is empty.");
    return setNewIngressLike(index, buildIngress(index));
  }
  public V1IngressLoadBalancerStatusFluentImpl.IngressNested<A> editMatchingIngress(Predicate<V1IngressLoadBalancerIngressBuilder> predicate) {
    int index = -1;
    for (int i=0;i<ingress.size();i++) { 
    if (predicate.test(ingress.get(i))) {index = i; break;}
    } 
    if (index < 0) throw new RuntimeException("Can't edit matching ingress. No match found.");
    return setNewIngressLike(index, buildIngress(index));
  }
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    V1IngressLoadBalancerStatusFluentImpl that = (V1IngressLoadBalancerStatusFluentImpl) o;
    if (!java.util.Objects.equals(ingress, that.ingress)) return false;

    return true;
  }
  public int hashCode() {
    return java.util.Objects.hash(ingress,  super.hashCode());
  }
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (ingress != null) { sb.append("ingress:"); sb.append(ingress); }
    sb.append("}");
    return sb.toString();
  }
  class IngressNestedImpl<N> extends V1IngressLoadBalancerIngressFluentImpl<V1IngressLoadBalancerStatusFluentImpl.IngressNested<N>> implements V1IngressLoadBalancerStatusFluentImpl.IngressNested<N>,Nested<N>{
    IngressNestedImpl(int index,V1IngressLoadBalancerIngress item) {
      this.index = index;
      this.builder = new V1IngressLoadBalancerIngressBuilder(this, item);
    }
    IngressNestedImpl() {
      this.index = -1;
      this.builder = new V1IngressLoadBalancerIngressBuilder(this);
    }
    V1IngressLoadBalancerIngressBuilder builder;
    int index;
    public N and() {
      return (N) V1IngressLoadBalancerStatusFluentImpl.this.setToIngress(index,builder.build());
    }
    public N endIngress() {
      return and();
    }
    
  }
  
}