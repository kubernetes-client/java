package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.SuppressWarnings;
import io.kubernetes.client.fluent.Nested;
import java.util.ArrayList;
import java.lang.String;
import java.util.function.Predicate;
import io.kubernetes.client.fluent.BaseFluent;
import java.util.Iterator;
import java.util.Collection;
import java.lang.Object;
import java.util.List;

/**
 * Generated
 */
@SuppressWarnings("unchecked")
public class V1EndpointHintsFluent<A extends V1EndpointHintsFluent<A>> extends BaseFluent<A>{
  public V1EndpointHintsFluent() {
  }
  
  public V1EndpointHintsFluent(V1EndpointHints instance) {
    this.copyInstance(instance);
  }
  private ArrayList<V1ForZoneBuilder> forZones;
  
  protected void copyInstance(V1EndpointHints instance) {
    instance = (instance != null ? instance : new V1EndpointHints());
    if (instance != null) {
          this.withForZones(instance.getForZones());
        }
  }
  
  public A addToForZones(int index,V1ForZone item) {
    if (this.forZones == null) {this.forZones = new ArrayList<V1ForZoneBuilder>();}
    V1ForZoneBuilder builder = new V1ForZoneBuilder(item);
    if (index < 0 || index >= forZones.size()) { _visitables.get("forZones").add(builder); forZones.add(builder); } else { _visitables.get("forZones").add(index, builder); forZones.add(index, builder);}
    return (A)this;
  }
  
  public A setToForZones(int index,V1ForZone item) {
    if (this.forZones == null) {this.forZones = new ArrayList<V1ForZoneBuilder>();}
    V1ForZoneBuilder builder = new V1ForZoneBuilder(item);
    if (index < 0 || index >= forZones.size()) { _visitables.get("forZones").add(builder); forZones.add(builder); } else { _visitables.get("forZones").set(index, builder); forZones.set(index, builder);}
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
    if (this.forZones == null) return (A)this;
    for (V1ForZone item : items) {V1ForZoneBuilder builder = new V1ForZoneBuilder(item);_visitables.get("forZones").remove(builder); this.forZones.remove(builder);} return (A)this;
  }
  
  public A removeAllFromForZones(Collection<V1ForZone> items) {
    if (this.forZones == null) return (A)this;
    for (V1ForZone item : items) {V1ForZoneBuilder builder = new V1ForZoneBuilder(item);_visitables.get("forZones").remove(builder); this.forZones.remove(builder);} return (A)this;
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
  
  public List<V1ForZone> buildForZones() {
    return this.forZones != null ? build(forZones) : null;
  }
  
  public V1ForZone buildForZone(int index) {
    return this.forZones.get(index).build();
  }
  
  public V1ForZone buildFirstForZone() {
    return this.forZones.get(0).build();
  }
  
  public V1ForZone buildLastForZone() {
    return this.forZones.get(forZones.size() - 1).build();
  }
  
  public V1ForZone buildMatchingForZone(Predicate<V1ForZoneBuilder> predicate) {
      for (V1ForZoneBuilder item : forZones) {
        if (predicate.test(item)) {
          return item.build();
        }
      }
      return null;
  }
  
  public boolean hasMatchingForZone(Predicate<V1ForZoneBuilder> predicate) {
      for (V1ForZoneBuilder item : forZones) {
        if (predicate.test(item)) {
          return true;
        }
      }
      return false;
  }
  
  public A withForZones(List<V1ForZone> forZones) {
    if (this.forZones != null) {
      this._visitables.get("forZones").clear();
    }
    if (forZones != null) {
        this.forZones = new ArrayList();
        for (V1ForZone item : forZones) {
          this.addToForZones(item);
        }
    } else {
      this.forZones = null;
    }
    return (A) this;
  }
  
  public A withForZones(io.kubernetes.client.openapi.models.V1ForZone... forZones) {
    if (this.forZones != null) {
        this.forZones.clear();
        _visitables.remove("forZones");
    }
    if (forZones != null) {
      for (V1ForZone item : forZones) {
        this.addToForZones(item);
      }
    }
    return (A) this;
  }
  
  public boolean hasForZones() {
    return this.forZones != null && !this.forZones.isEmpty();
  }
  
  public ForZonesNested<A> addNewForZone() {
    return new ForZonesNested(-1, null);
  }
  
  public ForZonesNested<A> addNewForZoneLike(V1ForZone item) {
    return new ForZonesNested(-1, item);
  }
  
  public ForZonesNested<A> setNewForZoneLike(int index,V1ForZone item) {
    return new ForZonesNested(index, item);
  }
  
  public ForZonesNested<A> editForZone(int index) {
    if (forZones.size() <= index) throw new RuntimeException("Can't edit forZones. Index exceeds size.");
    return setNewForZoneLike(index, buildForZone(index));
  }
  
  public ForZonesNested<A> editFirstForZone() {
    if (forZones.size() == 0) throw new RuntimeException("Can't edit first forZones. The list is empty.");
    return setNewForZoneLike(0, buildForZone(0));
  }
  
  public ForZonesNested<A> editLastForZone() {
    int index = forZones.size() - 1;
    if (index < 0) throw new RuntimeException("Can't edit last forZones. The list is empty.");
    return setNewForZoneLike(index, buildForZone(index));
  }
  
  public ForZonesNested<A> editMatchingForZone(Predicate<V1ForZoneBuilder> predicate) {
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
    if (!super.equals(o)) return false;
    V1EndpointHintsFluent that = (V1EndpointHintsFluent) o;
    if (!java.util.Objects.equals(forZones, that.forZones)) return false;
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
  public class ForZonesNested<N> extends V1ForZoneFluent<ForZonesNested<N>> implements Nested<N>{
    ForZonesNested(int index,V1ForZone item) {
      this.index = index;
      this.builder = new V1ForZoneBuilder(this, item);
    }
    V1ForZoneBuilder builder;
    int index;
    
    public N and() {
      return (N) V1EndpointHintsFluent.this.setToForZones(index,builder.build());
    }
    
    public N endForZone() {
      return and();
    }
    
  
  }

}