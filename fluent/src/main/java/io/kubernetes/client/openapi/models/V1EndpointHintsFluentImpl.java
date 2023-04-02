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
  public class V1EndpointHintsFluentImpl<A extends V1EndpointHintsFluent<A>> extends BaseFluent<A> implements V1EndpointHintsFluent<A>{
  public V1EndpointHintsFluentImpl() {
  }
  public V1EndpointHintsFluentImpl(V1EndpointHints instance) {
    this.withForZones(instance.getForZones());

  }
  private ArrayList<V1ForZoneBuilder> forZones;
  public A addToForZones(Integer index,V1ForZone item) {
    if (this.forZones == null) {this.forZones = new ArrayList<V1ForZoneBuilder>();}
    V1ForZoneBuilder builder = new V1ForZoneBuilder(item);_visitables.get("forZones").add(index >= 0 ? index : _visitables.get("forZones").size(), builder);this.forZones.add(index >= 0 ? index : forZones.size(), builder); return (A)this;
  }
  public A setToForZones(Integer index,V1ForZone item) {
    if (this.forZones == null) {this.forZones = new ArrayList<V1ForZoneBuilder>();}
    V1ForZoneBuilder builder = new V1ForZoneBuilder(item);
    if (index < 0 || index >= _visitables.get("forZones").size()) { _visitables.get("forZones").add(builder); } else { _visitables.get("forZones").set(index, builder);}
    if (index < 0 || index >= forZones.size()) { forZones.add(builder); } else { forZones.set(index, builder);}
     return (A)this;
  }
  public A addToForZones(io.kubernetes.client.openapi.models.V1ForZone... items) {
    if (this.forZones == null) {this.forZones = new ArrayList<V1ForZoneBuilder>();}
    for (V1ForZone item : items) {V1ForZoneBuilder builder = new V1ForZoneBuilder(item);_visitables.get("forZones").add(builder);this.forZones.add(builder);} return (A)this;
  }
  public A addAllToForZones(Collection<V1ForZone> items) {
    if (this.forZones == null) {this.forZones = new ArrayList<V1ForZoneBuilder>();}
    for (V1ForZone item : items) {V1ForZoneBuilder builder = new V1ForZoneBuilder(item);_visitables.get("forZones").add(builder);this.forZones.add(builder);} return (A)this;
  }
  public A removeFromForZones(io.kubernetes.client.openapi.models.V1ForZone... items) {
    for (V1ForZone item : items) {V1ForZoneBuilder builder = new V1ForZoneBuilder(item);_visitables.get("forZones").remove(builder);if (this.forZones != null) {this.forZones.remove(builder);}} return (A)this;
  }
  public A removeAllFromForZones(Collection<V1ForZone> items) {
    for (V1ForZone item : items) {V1ForZoneBuilder builder = new V1ForZoneBuilder(item);_visitables.get("forZones").remove(builder);if (this.forZones != null) {this.forZones.remove(builder);}} return (A)this;
  }
  public A removeMatchingFromForZones(Predicate<V1ForZoneBuilder> predicate) {
    if (forZones == null) return (A) this;
    final Iterator<V1ForZoneBuilder> each = forZones.iterator();
    final List visitables = _visitables.get("forZones");
    while (each.hasNext()) {
      V1ForZoneBuilder builder = each.next();
      if (predicate.test(builder)) {
        visitables.remove(builder);
        each.remove();
      }
    }
    return (A)this;
  }
  
  /**
   * This method has been deprecated, please use method buildForZones instead.
   * @return The buildable object.
   */
  @Deprecated
  public List<V1ForZone> getForZones() {
    return forZones != null ? build(forZones) : null;
  }
  public List<V1ForZone> buildForZones() {
    return forZones != null ? build(forZones) : null;
  }
  public V1ForZone buildForZone(Integer index) {
    return this.forZones.get(index).build();
  }
  public V1ForZone buildFirstForZone() {
    return this.forZones.get(0).build();
  }
  public V1ForZone buildLastForZone() {
    return this.forZones.get(forZones.size() - 1).build();
  }
  public V1ForZone buildMatchingForZone(Predicate<V1ForZoneBuilder> predicate) {
    for (V1ForZoneBuilder item: forZones) { if(predicate.test(item)){ return item.build();} } return null;
  }
  public Boolean hasMatchingForZone(Predicate<V1ForZoneBuilder> predicate) {
    for (V1ForZoneBuilder item: forZones) { if(predicate.test(item)){ return true;} } return false;
  }
  public A withForZones(List<V1ForZone> forZones) {
    if (this.forZones != null) { _visitables.get("forZones").removeAll(this.forZones);}
    if (forZones != null) {this.forZones = new ArrayList(); for (V1ForZone item : forZones){this.addToForZones(item);}} else { this.forZones = null;} return (A) this;
  }
  public A withForZones(io.kubernetes.client.openapi.models.V1ForZone... forZones) {
    if (this.forZones != null) {this.forZones.clear();}
    if (forZones != null) {for (V1ForZone item :forZones){ this.addToForZones(item);}} return (A) this;
  }
  public Boolean hasForZones() {
    return forZones != null && !forZones.isEmpty();
  }
  public V1EndpointHintsFluent.ForZonesNested<A> addNewForZone() {
    return new V1EndpointHintsFluentImpl.ForZonesNestedImpl();
  }
  public V1EndpointHintsFluent.ForZonesNested<A> addNewForZoneLike(V1ForZone item) {
    return new V1EndpointHintsFluentImpl.ForZonesNestedImpl(-1, item);
  }
  public V1EndpointHintsFluent.ForZonesNested<A> setNewForZoneLike(Integer index,V1ForZone item) {
    return new V1EndpointHintsFluentImpl.ForZonesNestedImpl(index, item);
  }
  public V1EndpointHintsFluent.ForZonesNested<A> editForZone(Integer index) {
    if (forZones.size() <= index) throw new RuntimeException("Can't edit forZones. Index exceeds size.");
    return setNewForZoneLike(index, buildForZone(index));
  }
  public V1EndpointHintsFluent.ForZonesNested<A> editFirstForZone() {
    if (forZones.size() == 0) throw new RuntimeException("Can't edit first forZones. The list is empty.");
    return setNewForZoneLike(0, buildForZone(0));
  }
  public V1EndpointHintsFluent.ForZonesNested<A> editLastForZone() {
    int index = forZones.size() - 1;
    if (index < 0) throw new RuntimeException("Can't edit last forZones. The list is empty.");
    return setNewForZoneLike(index, buildForZone(index));
  }
  public V1EndpointHintsFluent.ForZonesNested<A> editMatchingForZone(Predicate<V1ForZoneBuilder> predicate) {
    int index = -1;
    for (int i=0;i<forZones.size();i++) { 
    if (predicate.test(forZones.get(i))) {index = i; break;}
    } 
    if (index < 0) throw new RuntimeException("Can't edit matching forZones. No match found.");
    return setNewForZoneLike(index, buildForZone(index));
  }
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    V1EndpointHintsFluentImpl that = (V1EndpointHintsFluentImpl) o;
    if (forZones != null ? !forZones.equals(that.forZones) :that.forZones != null) return false;
    return true;
  }
  public int hashCode() {
    return java.util.Objects.hash(forZones,  super.hashCode());
  }
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (forZones != null && !forZones.isEmpty()) { sb.append("forZones:"); sb.append(forZones); }
    sb.append("}");
    return sb.toString();
  }
  class ForZonesNestedImpl<N> extends V1ForZoneFluentImpl<V1EndpointHintsFluent.ForZonesNested<N>> implements V1EndpointHintsFluent.ForZonesNested<N>,Nested<N>{
    ForZonesNestedImpl(Integer index,V1ForZone item) {
      this.index = index;
      this.builder = new V1ForZoneBuilder(this, item);
    }
    ForZonesNestedImpl() {
      this.index = -1;
      this.builder = new V1ForZoneBuilder(this);
    }
    V1ForZoneBuilder builder;
    Integer index;
    public N and() {
      return (N) V1EndpointHintsFluentImpl.this.setToForZones(index,builder.build());
    }
    public N endForZone() {
      return and();
    }
    
  }
  
}