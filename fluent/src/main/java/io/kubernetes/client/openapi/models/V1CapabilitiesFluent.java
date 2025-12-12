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
public class V1CapabilitiesFluent<A extends io.kubernetes.client.openapi.models.V1CapabilitiesFluent<A>> extends BaseFluent<A>{

  private List<String> add;
  private List<String> drop;

  public V1CapabilitiesFluent() {
  }
  
  public V1CapabilitiesFluent(V1Capabilities instance) {
    this.copyInstance(instance);
  }

  public A addAllToAdd(Collection<String> items) {
    if (this.add == null) {
      this.add = new ArrayList();
    }
    for (String item : items) {
      this.add.add(item);
    }
    return (A) this;
  }
  
  public A addAllToDrop(Collection<String> items) {
    if (this.drop == null) {
      this.drop = new ArrayList();
    }
    for (String item : items) {
      this.drop.add(item);
    }
    return (A) this;
  }
  
  public A addToAdd(String... items) {
    if (this.add == null) {
      this.add = new ArrayList();
    }
    for (String item : items) {
      this.add.add(item);
    }
    return (A) this;
  }
  
  public A addToAdd(int index,String item) {
    if (this.add == null) {
      this.add = new ArrayList();
    }
    this.add.add(index, item);
    return (A) this;
  }
  
  public A addToDrop(String... items) {
    if (this.drop == null) {
      this.drop = new ArrayList();
    }
    for (String item : items) {
      this.drop.add(item);
    }
    return (A) this;
  }
  
  public A addToDrop(int index,String item) {
    if (this.drop == null) {
      this.drop = new ArrayList();
    }
    this.drop.add(index, item);
    return (A) this;
  }
  
  protected void copyInstance(V1Capabilities instance) {
    instance = instance != null ? instance : new V1Capabilities();
    if (instance != null) {
        this.withAdd(instance.getAdd());
        this.withDrop(instance.getDrop());
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
    V1CapabilitiesFluent that = (V1CapabilitiesFluent) o;
    if (!(Objects.equals(add, that.add))) {
      return false;
    }
    if (!(Objects.equals(drop, that.drop))) {
      return false;
    }
    return true;
  }
  
  public List<String> getAdd() {
    return this.add;
  }
  
  public String getAdd(int index) {
    return this.add.get(index);
  }
  
  public List<String> getDrop() {
    return this.drop;
  }
  
  public String getDrop(int index) {
    return this.drop.get(index);
  }
  
  public String getFirstAdd() {
    return this.add.get(0);
  }
  
  public String getFirstDrop() {
    return this.drop.get(0);
  }
  
  public String getLastAdd() {
    return this.add.get(add.size() - 1);
  }
  
  public String getLastDrop() {
    return this.drop.get(drop.size() - 1);
  }
  
  public String getMatchingAdd(Predicate<String> predicate) {
      for (String item : add) {
        if (predicate.test(item)) {
          return item;
        }
      }
      return null;
  }
  
  public String getMatchingDrop(Predicate<String> predicate) {
      for (String item : drop) {
        if (predicate.test(item)) {
          return item;
        }
      }
      return null;
  }
  
  public boolean hasAdd() {
    return this.add != null && !(this.add.isEmpty());
  }
  
  public boolean hasDrop() {
    return this.drop != null && !(this.drop.isEmpty());
  }
  
  public boolean hasMatchingAdd(Predicate<String> predicate) {
      for (String item : add) {
        if (predicate.test(item)) {
          return true;
        }
      }
      return false;
  }
  
  public boolean hasMatchingDrop(Predicate<String> predicate) {
      for (String item : drop) {
        if (predicate.test(item)) {
          return true;
        }
      }
      return false;
  }
  
  public int hashCode() {
    return Objects.hash(add, drop);
  }
  
  public A removeAllFromAdd(Collection<String> items) {
    if (this.add == null) {
      return (A) this;
    }
    for (String item : items) {
      this.add.remove(item);
    }
    return (A) this;
  }
  
  public A removeAllFromDrop(Collection<String> items) {
    if (this.drop == null) {
      return (A) this;
    }
    for (String item : items) {
      this.drop.remove(item);
    }
    return (A) this;
  }
  
  public A removeFromAdd(String... items) {
    if (this.add == null) {
      return (A) this;
    }
    for (String item : items) {
      this.add.remove(item);
    }
    return (A) this;
  }
  
  public A removeFromDrop(String... items) {
    if (this.drop == null) {
      return (A) this;
    }
    for (String item : items) {
      this.drop.remove(item);
    }
    return (A) this;
  }
  
  public A setToAdd(int index,String item) {
    if (this.add == null) {
      this.add = new ArrayList();
    }
    this.add.set(index, item);
    return (A) this;
  }
  
  public A setToDrop(int index,String item) {
    if (this.drop == null) {
      this.drop = new ArrayList();
    }
    this.drop.set(index, item);
    return (A) this;
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (!(add == null) && !(add.isEmpty())) {
        sb.append("add:");
        sb.append(add);
        sb.append(",");
    }
    if (!(drop == null) && !(drop.isEmpty())) {
        sb.append("drop:");
        sb.append(drop);
    }
    sb.append("}");
    return sb.toString();
  }
  
  public A withAdd(List<String> add) {
    if (add != null) {
        this.add = new ArrayList();
        for (String item : add) {
          this.addToAdd(item);
        }
    } else {
      this.add = null;
    }
    return (A) this;
  }
  
  public A withAdd(String... add) {
    if (this.add != null) {
        this.add.clear();
        _visitables.remove("add");
    }
    if (add != null) {
      for (String item : add) {
        this.addToAdd(item);
      }
    }
    return (A) this;
  }
  
  public A withDrop(List<String> drop) {
    if (drop != null) {
        this.drop = new ArrayList();
        for (String item : drop) {
          this.addToDrop(item);
        }
    } else {
      this.drop = null;
    }
    return (A) this;
  }
  
  public A withDrop(String... drop) {
    if (this.drop != null) {
        this.drop.clear();
        _visitables.remove("drop");
    }
    if (drop != null) {
      for (String item : drop) {
        this.addToDrop(item);
      }
    }
    return (A) this;
  }
  
}