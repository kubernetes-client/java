package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.SuppressWarnings;
import io.kubernetes.client.fluent.Nested;
import java.util.ArrayList;
import java.lang.String;
import java.util.function.Predicate;
import java.lang.Integer;
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
  public class V1LoadBalancerStatusFluentImpl<A extends V1LoadBalancerStatusFluent<A>> extends BaseFluent<A> implements V1LoadBalancerStatusFluent<A>{
  public V1LoadBalancerStatusFluentImpl() {
  }
  public V1LoadBalancerStatusFluentImpl(V1LoadBalancerStatus instance) {
    this.withIngress(instance.getIngress());

  }
  private ArrayList<V1LoadBalancerIngressBuilder> ingress;
  public A addToIngress(Integer index,V1LoadBalancerIngress item) {
    if (this.ingress == null) {this.ingress = new ArrayList<V1LoadBalancerIngressBuilder>();}
    V1LoadBalancerIngressBuilder builder = new V1LoadBalancerIngressBuilder(item);_visitables.get("ingress").add(index >= 0 ? index : _visitables.get("ingress").size(), builder);this.ingress.add(index >= 0 ? index : ingress.size(), builder); return (A)this;
  }
  public A setToIngress(Integer index,V1LoadBalancerIngress item) {
    if (this.ingress == null) {this.ingress = new ArrayList<V1LoadBalancerIngressBuilder>();}
    V1LoadBalancerIngressBuilder builder = new V1LoadBalancerIngressBuilder(item);
    if (index < 0 || index >= _visitables.get("ingress").size()) { _visitables.get("ingress").add(builder); } else { _visitables.get("ingress").set(index, builder);}
    if (index < 0 || index >= ingress.size()) { ingress.add(builder); } else { ingress.set(index, builder);}
     return (A)this;
  }
  public A addToIngress(io.kubernetes.client.openapi.models.V1LoadBalancerIngress... items) {
    if (this.ingress == null) {this.ingress = new ArrayList<V1LoadBalancerIngressBuilder>();}
    for (V1LoadBalancerIngress item : items) {V1LoadBalancerIngressBuilder builder = new V1LoadBalancerIngressBuilder(item);_visitables.get("ingress").add(builder);this.ingress.add(builder);} return (A)this;
  }
  public A addAllToIngress(Collection<V1LoadBalancerIngress> items) {
    if (this.ingress == null) {this.ingress = new ArrayList<V1LoadBalancerIngressBuilder>();}
    for (V1LoadBalancerIngress item : items) {V1LoadBalancerIngressBuilder builder = new V1LoadBalancerIngressBuilder(item);_visitables.get("ingress").add(builder);this.ingress.add(builder);} return (A)this;
  }
  public A removeFromIngress(io.kubernetes.client.openapi.models.V1LoadBalancerIngress... items) {
    for (V1LoadBalancerIngress item : items) {V1LoadBalancerIngressBuilder builder = new V1LoadBalancerIngressBuilder(item);_visitables.get("ingress").remove(builder);if (this.ingress != null) {this.ingress.remove(builder);}} return (A)this;
  }
  public A removeAllFromIngress(Collection<V1LoadBalancerIngress> items) {
    for (V1LoadBalancerIngress item : items) {V1LoadBalancerIngressBuilder builder = new V1LoadBalancerIngressBuilder(item);_visitables.get("ingress").remove(builder);if (this.ingress != null) {this.ingress.remove(builder);}} return (A)this;
  }
  public A removeMatchingFromIngress(Predicate<V1LoadBalancerIngressBuilder> predicate) {
    if (ingress == null) return (A) this;
    final Iterator<V1LoadBalancerIngressBuilder> each = ingress.iterator();
    final List visitables = _visitables.get("ingress");
    while (each.hasNext()) {
      V1LoadBalancerIngressBuilder builder = each.next();
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
  public List<V1LoadBalancerIngress> getIngress() {
    return ingress != null ? build(ingress) : null;
  }
  public List<V1LoadBalancerIngress> buildIngress() {
    return ingress != null ? build(ingress) : null;
  }
  public V1LoadBalancerIngress buildIngress(Integer index) {
    return this.ingress.get(index).build();
  }
  public V1LoadBalancerIngress buildFirstIngress() {
    return this.ingress.get(0).build();
  }
  public V1LoadBalancerIngress buildLastIngress() {
    return this.ingress.get(ingress.size() - 1).build();
  }
  public V1LoadBalancerIngress buildMatchingIngress(Predicate<V1LoadBalancerIngressBuilder> predicate) {
    for (V1LoadBalancerIngressBuilder item: ingress) { if(predicate.test(item)){ return item.build();} } return null;
  }
  public Boolean hasMatchingIngress(Predicate<V1LoadBalancerIngressBuilder> predicate) {
    for (V1LoadBalancerIngressBuilder item: ingress) { if(predicate.test(item)){ return true;} } return false;
  }
  public A withIngress(List<V1LoadBalancerIngress> ingress) {
    if (this.ingress != null) { _visitables.get("ingress").removeAll(this.ingress);}
    if (ingress != null) {this.ingress = new ArrayList(); for (V1LoadBalancerIngress item : ingress){this.addToIngress(item);}} else { this.ingress = null;} return (A) this;
  }
  public A withIngress(io.kubernetes.client.openapi.models.V1LoadBalancerIngress... ingress) {
    if (this.ingress != null) {this.ingress.clear();}
    if (ingress != null) {for (V1LoadBalancerIngress item :ingress){ this.addToIngress(item);}} return (A) this;
  }
  public Boolean hasIngress() {
    return ingress != null && !ingress.isEmpty();
  }
  public V1LoadBalancerStatusFluent.IngressNested<A> addNewIngress() {
    return new V1LoadBalancerStatusFluentImpl.IngressNestedImpl();
  }
  public V1LoadBalancerStatusFluent.IngressNested<A> addNewIngressLike(V1LoadBalancerIngress item) {
    return new V1LoadBalancerStatusFluentImpl.IngressNestedImpl(-1, item);
  }
  public V1LoadBalancerStatusFluent.IngressNested<A> setNewIngressLike(Integer index,V1LoadBalancerIngress item) {
    return new V1LoadBalancerStatusFluentImpl.IngressNestedImpl(index, item);
  }
  public V1LoadBalancerStatusFluent.IngressNested<A> editIngress(Integer index) {
    if (ingress.size() <= index) throw new RuntimeException("Can't edit ingress. Index exceeds size.");
    return setNewIngressLike(index, buildIngress(index));
  }
  public V1LoadBalancerStatusFluent.IngressNested<A> editFirstIngress() {
    if (ingress.size() == 0) throw new RuntimeException("Can't edit first ingress. The list is empty.");
    return setNewIngressLike(0, buildIngress(0));
  }
  public V1LoadBalancerStatusFluent.IngressNested<A> editLastIngress() {
    int index = ingress.size() - 1;
    if (index < 0) throw new RuntimeException("Can't edit last ingress. The list is empty.");
    return setNewIngressLike(index, buildIngress(index));
  }
  public V1LoadBalancerStatusFluent.IngressNested<A> editMatchingIngress(Predicate<V1LoadBalancerIngressBuilder> predicate) {
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
    V1LoadBalancerStatusFluentImpl that = (V1LoadBalancerStatusFluentImpl) o;
    if (ingress != null ? !ingress.equals(that.ingress) :that.ingress != null) return false;
    return true;
  }
  public int hashCode() {
    return java.util.Objects.hash(ingress,  super.hashCode());
  }
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (ingress != null && !ingress.isEmpty()) { sb.append("ingress:"); sb.append(ingress); }
    sb.append("}");
    return sb.toString();
  }
  class IngressNestedImpl<N> extends V1LoadBalancerIngressFluentImpl<V1LoadBalancerStatusFluent.IngressNested<N>> implements V1LoadBalancerStatusFluent.IngressNested<N>,Nested<N>{
    IngressNestedImpl(Integer index,V1LoadBalancerIngress item) {
      this.index = index;
      this.builder = new V1LoadBalancerIngressBuilder(this, item);
    }
    IngressNestedImpl() {
      this.index = -1;
      this.builder = new V1LoadBalancerIngressBuilder(this);
    }
    V1LoadBalancerIngressBuilder builder;
    Integer index;
    public N and() {
      return (N) V1LoadBalancerStatusFluentImpl.this.setToIngress(index,builder.build());
    }
    public N endIngress() {
      return and();
    }
    
  }
  
}