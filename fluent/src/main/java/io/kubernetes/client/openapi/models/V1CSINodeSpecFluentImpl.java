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
  public class V1CSINodeSpecFluentImpl<A extends V1CSINodeSpecFluent<A>> extends BaseFluent<A> implements V1CSINodeSpecFluent<A>{
  public V1CSINodeSpecFluentImpl() {
  }
  public V1CSINodeSpecFluentImpl(V1CSINodeSpec instance) {
    this.withDrivers(instance.getDrivers());

  }
  private ArrayList<V1CSINodeDriverBuilder> drivers;
  public A addToDrivers(Integer index,V1CSINodeDriver item) {
    if (this.drivers == null) {this.drivers = new ArrayList<V1CSINodeDriverBuilder>();}
    V1CSINodeDriverBuilder builder = new V1CSINodeDriverBuilder(item);_visitables.get("drivers").add(index >= 0 ? index : _visitables.get("drivers").size(), builder);this.drivers.add(index >= 0 ? index : drivers.size(), builder); return (A)this;
  }
  public A setToDrivers(Integer index,V1CSINodeDriver item) {
    if (this.drivers == null) {this.drivers = new ArrayList<V1CSINodeDriverBuilder>();}
    V1CSINodeDriverBuilder builder = new V1CSINodeDriverBuilder(item);
    if (index < 0 || index >= _visitables.get("drivers").size()) { _visitables.get("drivers").add(builder); } else { _visitables.get("drivers").set(index, builder);}
    if (index < 0 || index >= drivers.size()) { drivers.add(builder); } else { drivers.set(index, builder);}
     return (A)this;
  }
  public A addToDrivers(io.kubernetes.client.openapi.models.V1CSINodeDriver... items) {
    if (this.drivers == null) {this.drivers = new ArrayList<V1CSINodeDriverBuilder>();}
    for (V1CSINodeDriver item : items) {V1CSINodeDriverBuilder builder = new V1CSINodeDriverBuilder(item);_visitables.get("drivers").add(builder);this.drivers.add(builder);} return (A)this;
  }
  public A addAllToDrivers(Collection<V1CSINodeDriver> items) {
    if (this.drivers == null) {this.drivers = new ArrayList<V1CSINodeDriverBuilder>();}
    for (V1CSINodeDriver item : items) {V1CSINodeDriverBuilder builder = new V1CSINodeDriverBuilder(item);_visitables.get("drivers").add(builder);this.drivers.add(builder);} return (A)this;
  }
  public A removeFromDrivers(io.kubernetes.client.openapi.models.V1CSINodeDriver... items) {
    for (V1CSINodeDriver item : items) {V1CSINodeDriverBuilder builder = new V1CSINodeDriverBuilder(item);_visitables.get("drivers").remove(builder);if (this.drivers != null) {this.drivers.remove(builder);}} return (A)this;
  }
  public A removeAllFromDrivers(Collection<V1CSINodeDriver> items) {
    for (V1CSINodeDriver item : items) {V1CSINodeDriverBuilder builder = new V1CSINodeDriverBuilder(item);_visitables.get("drivers").remove(builder);if (this.drivers != null) {this.drivers.remove(builder);}} return (A)this;
  }
  public A removeMatchingFromDrivers(Predicate<V1CSINodeDriverBuilder> predicate) {
    if (drivers == null) return (A) this;
    final Iterator<V1CSINodeDriverBuilder> each = drivers.iterator();
    final List visitables = _visitables.get("drivers");
    while (each.hasNext()) {
      V1CSINodeDriverBuilder builder = each.next();
      if (predicate.test(builder)) {
        visitables.remove(builder);
        each.remove();
      }
    }
    return (A)this;
  }
  
  /**
   * This method has been deprecated, please use method buildDrivers instead.
   * @return The buildable object.
   */
  @Deprecated
  public List<V1CSINodeDriver> getDrivers() {
    return drivers != null ? build(drivers) : null;
  }
  public List<V1CSINodeDriver> buildDrivers() {
    return drivers != null ? build(drivers) : null;
  }
  public V1CSINodeDriver buildDriver(Integer index) {
    return this.drivers.get(index).build();
  }
  public V1CSINodeDriver buildFirstDriver() {
    return this.drivers.get(0).build();
  }
  public V1CSINodeDriver buildLastDriver() {
    return this.drivers.get(drivers.size() - 1).build();
  }
  public V1CSINodeDriver buildMatchingDriver(Predicate<V1CSINodeDriverBuilder> predicate) {
    for (V1CSINodeDriverBuilder item: drivers) { if(predicate.test(item)){ return item.build();} } return null;
  }
  public Boolean hasMatchingDriver(Predicate<V1CSINodeDriverBuilder> predicate) {
    for (V1CSINodeDriverBuilder item: drivers) { if(predicate.test(item)){ return true;} } return false;
  }
  public A withDrivers(List<V1CSINodeDriver> drivers) {
    if (this.drivers != null) { _visitables.get("drivers").removeAll(this.drivers);}
    if (drivers != null) {this.drivers = new ArrayList(); for (V1CSINodeDriver item : drivers){this.addToDrivers(item);}} else { this.drivers = null;} return (A) this;
  }
  public A withDrivers(io.kubernetes.client.openapi.models.V1CSINodeDriver... drivers) {
    if (this.drivers != null) {this.drivers.clear();}
    if (drivers != null) {for (V1CSINodeDriver item :drivers){ this.addToDrivers(item);}} return (A) this;
  }
  public Boolean hasDrivers() {
    return drivers != null && !drivers.isEmpty();
  }
  public V1CSINodeSpecFluent.DriversNested<A> addNewDriver() {
    return new V1CSINodeSpecFluentImpl.DriversNestedImpl();
  }
  public V1CSINodeSpecFluent.DriversNested<A> addNewDriverLike(V1CSINodeDriver item) {
    return new V1CSINodeSpecFluentImpl.DriversNestedImpl(-1, item);
  }
  public V1CSINodeSpecFluent.DriversNested<A> setNewDriverLike(Integer index,V1CSINodeDriver item) {
    return new V1CSINodeSpecFluentImpl.DriversNestedImpl(index, item);
  }
  public V1CSINodeSpecFluent.DriversNested<A> editDriver(Integer index) {
    if (drivers.size() <= index) throw new RuntimeException("Can't edit drivers. Index exceeds size.");
    return setNewDriverLike(index, buildDriver(index));
  }
  public V1CSINodeSpecFluent.DriversNested<A> editFirstDriver() {
    if (drivers.size() == 0) throw new RuntimeException("Can't edit first drivers. The list is empty.");
    return setNewDriverLike(0, buildDriver(0));
  }
  public V1CSINodeSpecFluent.DriversNested<A> editLastDriver() {
    int index = drivers.size() - 1;
    if (index < 0) throw new RuntimeException("Can't edit last drivers. The list is empty.");
    return setNewDriverLike(index, buildDriver(index));
  }
  public V1CSINodeSpecFluent.DriversNested<A> editMatchingDriver(Predicate<V1CSINodeDriverBuilder> predicate) {
    int index = -1;
    for (int i=0;i<drivers.size();i++) { 
    if (predicate.test(drivers.get(i))) {index = i; break;}
    } 
    if (index < 0) throw new RuntimeException("Can't edit matching drivers. No match found.");
    return setNewDriverLike(index, buildDriver(index));
  }
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    V1CSINodeSpecFluentImpl that = (V1CSINodeSpecFluentImpl) o;
    if (drivers != null ? !drivers.equals(that.drivers) :that.drivers != null) return false;
    return true;
  }
  public int hashCode() {
    return java.util.Objects.hash(drivers,  super.hashCode());
  }
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (drivers != null && !drivers.isEmpty()) { sb.append("drivers:"); sb.append(drivers); }
    sb.append("}");
    return sb.toString();
  }
  class DriversNestedImpl<N> extends V1CSINodeDriverFluentImpl<V1CSINodeSpecFluent.DriversNested<N>> implements V1CSINodeSpecFluent.DriversNested<N>,Nested<N>{
    DriversNestedImpl(Integer index,V1CSINodeDriver item) {
      this.index = index;
      this.builder = new V1CSINodeDriverBuilder(this, item);
    }
    DriversNestedImpl() {
      this.index = -1;
      this.builder = new V1CSINodeDriverBuilder(this);
    }
    V1CSINodeDriverBuilder builder;
    Integer index;
    public N and() {
      return (N) V1CSINodeSpecFluentImpl.this.setToDrivers(index,builder.build());
    }
    public N endDriver() {
      return and();
    }
    
  }
  
}