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
public class V1CSINodeSpecFluent<A extends V1CSINodeSpecFluent<A>> extends BaseFluent<A>{
  public V1CSINodeSpecFluent() {
  }
  
  public V1CSINodeSpecFluent(V1CSINodeSpec instance) {
    this.copyInstance(instance);
  }
  private ArrayList<V1CSINodeDriverBuilder> drivers;
  
  protected void copyInstance(V1CSINodeSpec instance) {
    instance = (instance != null ? instance : new V1CSINodeSpec());
    if (instance != null) {
          this.withDrivers(instance.getDrivers());
        }
  }
  
  public A addToDrivers(int index,V1CSINodeDriver item) {
    if (this.drivers == null) {this.drivers = new ArrayList<V1CSINodeDriverBuilder>();}
    V1CSINodeDriverBuilder builder = new V1CSINodeDriverBuilder(item);
    if (index < 0 || index >= drivers.size()) { _visitables.get("drivers").add(builder); drivers.add(builder); } else { _visitables.get("drivers").add(index, builder); drivers.add(index, builder);}
    return (A)this;
  }
  
  public A setToDrivers(int index,V1CSINodeDriver item) {
    if (this.drivers == null) {this.drivers = new ArrayList<V1CSINodeDriverBuilder>();}
    V1CSINodeDriverBuilder builder = new V1CSINodeDriverBuilder(item);
    if (index < 0 || index >= drivers.size()) { _visitables.get("drivers").add(builder); drivers.add(builder); } else { _visitables.get("drivers").set(index, builder); drivers.set(index, builder);}
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
    if (this.drivers == null) return (A)this;
    for (V1CSINodeDriver item : items) {V1CSINodeDriverBuilder builder = new V1CSINodeDriverBuilder(item);_visitables.get("drivers").remove(builder); this.drivers.remove(builder);} return (A)this;
  }
  
  public A removeAllFromDrivers(Collection<V1CSINodeDriver> items) {
    if (this.drivers == null) return (A)this;
    for (V1CSINodeDriver item : items) {V1CSINodeDriverBuilder builder = new V1CSINodeDriverBuilder(item);_visitables.get("drivers").remove(builder); this.drivers.remove(builder);} return (A)this;
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
  
  public List<V1CSINodeDriver> buildDrivers() {
    return this.drivers != null ? build(drivers) : null;
  }
  
  public V1CSINodeDriver buildDriver(int index) {
    return this.drivers.get(index).build();
  }
  
  public V1CSINodeDriver buildFirstDriver() {
    return this.drivers.get(0).build();
  }
  
  public V1CSINodeDriver buildLastDriver() {
    return this.drivers.get(drivers.size() - 1).build();
  }
  
  public V1CSINodeDriver buildMatchingDriver(Predicate<V1CSINodeDriverBuilder> predicate) {
      for (V1CSINodeDriverBuilder item : drivers) {
        if (predicate.test(item)) {
          return item.build();
        }
      }
      return null;
  }
  
  public boolean hasMatchingDriver(Predicate<V1CSINodeDriverBuilder> predicate) {
      for (V1CSINodeDriverBuilder item : drivers) {
        if (predicate.test(item)) {
          return true;
        }
      }
      return false;
  }
  
  public A withDrivers(List<V1CSINodeDriver> drivers) {
    if (this.drivers != null) {
      this._visitables.get("drivers").clear();
    }
    if (drivers != null) {
        this.drivers = new ArrayList();
        for (V1CSINodeDriver item : drivers) {
          this.addToDrivers(item);
        }
    } else {
      this.drivers = null;
    }
    return (A) this;
  }
  
  public A withDrivers(io.kubernetes.client.openapi.models.V1CSINodeDriver... drivers) {
    if (this.drivers != null) {
        this.drivers.clear();
        _visitables.remove("drivers");
    }
    if (drivers != null) {
      for (V1CSINodeDriver item : drivers) {
        this.addToDrivers(item);
      }
    }
    return (A) this;
  }
  
  public boolean hasDrivers() {
    return this.drivers != null && !this.drivers.isEmpty();
  }
  
  public DriversNested<A> addNewDriver() {
    return new DriversNested(-1, null);
  }
  
  public DriversNested<A> addNewDriverLike(V1CSINodeDriver item) {
    return new DriversNested(-1, item);
  }
  
  public DriversNested<A> setNewDriverLike(int index,V1CSINodeDriver item) {
    return new DriversNested(index, item);
  }
  
  public DriversNested<A> editDriver(int index) {
    if (drivers.size() <= index) throw new RuntimeException("Can't edit drivers. Index exceeds size.");
    return setNewDriverLike(index, buildDriver(index));
  }
  
  public DriversNested<A> editFirstDriver() {
    if (drivers.size() == 0) throw new RuntimeException("Can't edit first drivers. The list is empty.");
    return setNewDriverLike(0, buildDriver(0));
  }
  
  public DriversNested<A> editLastDriver() {
    int index = drivers.size() - 1;
    if (index < 0) throw new RuntimeException("Can't edit last drivers. The list is empty.");
    return setNewDriverLike(index, buildDriver(index));
  }
  
  public DriversNested<A> editMatchingDriver(Predicate<V1CSINodeDriverBuilder> predicate) {
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
    if (!super.equals(o)) return false;
    V1CSINodeSpecFluent that = (V1CSINodeSpecFluent) o;
    if (!java.util.Objects.equals(drivers, that.drivers)) return false;
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
  public class DriversNested<N> extends V1CSINodeDriverFluent<DriversNested<N>> implements Nested<N>{
    DriversNested(int index,V1CSINodeDriver item) {
      this.index = index;
      this.builder = new V1CSINodeDriverBuilder(this, item);
    }
    V1CSINodeDriverBuilder builder;
    int index;
    
    public N and() {
      return (N) V1CSINodeSpecFluent.this.setToDrivers(index,builder.build());
    }
    
    public N endDriver() {
      return and();
    }
    
  
  }

}