package io.kubernetes.client.openapi.models;

import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.lang.String;
import java.util.function.Predicate;
import java.lang.Integer;
import io.kubernetes.client.fluent.BaseFluent;
import java.util.Collection;
import java.lang.Object;
import java.util.List;
import java.lang.Boolean;

 /**
  * Generated
  */
  @SuppressWarnings(value = "unchecked")
  public class V1CapabilitiesFluentImpl<A extends V1CapabilitiesFluent<A>> extends BaseFluent<A> implements V1CapabilitiesFluent<A>{
  public V1CapabilitiesFluentImpl() {
  }
  public V1CapabilitiesFluentImpl(V1Capabilities instance) {
    this.withAdd(instance.getAdd());

    this.withDrop(instance.getDrop());

  }
  private List<String> add;
  private List<String> drop;
  public A addToAdd(Integer index,String item) {
    if (this.add == null) {this.add = new ArrayList<String>();}
    this.add.add(index, item);
    return (A)this;
  }
  public A setToAdd(Integer index,String item) {
    if (this.add == null) {this.add = new ArrayList<String>();}
    this.add.set(index, item); return (A)this;
  }
  public A addToAdd(java.lang.String... items) {
    if (this.add == null) {this.add = new ArrayList<String>();}
    for (String item : items) {this.add.add(item);} return (A)this;
  }
  public A addAllToAdd(Collection<String> items) {
    if (this.add == null) {this.add = new ArrayList<String>();}
    for (String item : items) {this.add.add(item);} return (A)this;
  }
  public A removeFromAdd(java.lang.String... items) {
    for (String item : items) {if (this.add!= null){ this.add.remove(item);}} return (A)this;
  }
  public A removeAllFromAdd(Collection<String> items) {
    for (String item : items) {if (this.add!= null){ this.add.remove(item);}} return (A)this;
  }
  public List<String> getAdd() {
    return this.add;
  }
  public String getAdd(Integer index) {
    return this.add.get(index);
  }
  public String getFirstAdd() {
    return this.add.get(0);
  }
  public String getLastAdd() {
    return this.add.get(add.size() - 1);
  }
  public String getMatchingAdd(Predicate<String> predicate) {
    for (String item: add) { if(predicate.test(item)){ return item;} } return null;
  }
  public Boolean hasMatchingAdd(Predicate<String> predicate) {
    for (String item: add) { if(predicate.test(item)){ return true;} } return false;
  }
  public A withAdd(List<String> add) {
    if (add != null) {this.add = new ArrayList(); for (String item : add){this.addToAdd(item);}} else { this.add = null;} return (A) this;
  }
  public A withAdd(java.lang.String... add) {
    if (this.add != null) {this.add.clear();}
    if (add != null) {for (String item :add){ this.addToAdd(item);}} return (A) this;
  }
  public Boolean hasAdd() {
    return add != null && !add.isEmpty();
  }
  public A addToDrop(Integer index,String item) {
    if (this.drop == null) {this.drop = new ArrayList<String>();}
    this.drop.add(index, item);
    return (A)this;
  }
  public A setToDrop(Integer index,String item) {
    if (this.drop == null) {this.drop = new ArrayList<String>();}
    this.drop.set(index, item); return (A)this;
  }
  public A addToDrop(java.lang.String... items) {
    if (this.drop == null) {this.drop = new ArrayList<String>();}
    for (String item : items) {this.drop.add(item);} return (A)this;
  }
  public A addAllToDrop(Collection<String> items) {
    if (this.drop == null) {this.drop = new ArrayList<String>();}
    for (String item : items) {this.drop.add(item);} return (A)this;
  }
  public A removeFromDrop(java.lang.String... items) {
    for (String item : items) {if (this.drop!= null){ this.drop.remove(item);}} return (A)this;
  }
  public A removeAllFromDrop(Collection<String> items) {
    for (String item : items) {if (this.drop!= null){ this.drop.remove(item);}} return (A)this;
  }
  public List<String> getDrop() {
    return this.drop;
  }
  public String getDrop(Integer index) {
    return this.drop.get(index);
  }
  public String getFirstDrop() {
    return this.drop.get(0);
  }
  public String getLastDrop() {
    return this.drop.get(drop.size() - 1);
  }
  public String getMatchingDrop(Predicate<String> predicate) {
    for (String item: drop) { if(predicate.test(item)){ return item;} } return null;
  }
  public Boolean hasMatchingDrop(Predicate<String> predicate) {
    for (String item: drop) { if(predicate.test(item)){ return true;} } return false;
  }
  public A withDrop(List<String> drop) {
    if (drop != null) {this.drop = new ArrayList(); for (String item : drop){this.addToDrop(item);}} else { this.drop = null;} return (A) this;
  }
  public A withDrop(java.lang.String... drop) {
    if (this.drop != null) {this.drop.clear();}
    if (drop != null) {for (String item :drop){ this.addToDrop(item);}} return (A) this;
  }
  public Boolean hasDrop() {
    return drop != null && !drop.isEmpty();
  }
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    V1CapabilitiesFluentImpl that = (V1CapabilitiesFluentImpl) o;
    if (add != null ? !add.equals(that.add) :that.add != null) return false;
    if (drop != null ? !drop.equals(that.drop) :that.drop != null) return false;
    return true;
  }
  public int hashCode() {
    return java.util.Objects.hash(add,  drop,  super.hashCode());
  }
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (add != null && !add.isEmpty()) { sb.append("add:"); sb.append(add + ","); }
    if (drop != null && !drop.isEmpty()) { sb.append("drop:"); sb.append(drop); }
    sb.append("}");
    return sb.toString();
  }
  
}