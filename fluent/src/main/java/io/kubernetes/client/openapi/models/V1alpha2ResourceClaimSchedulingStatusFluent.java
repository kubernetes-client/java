package io.kubernetes.client.openapi.models;

import java.lang.SuppressWarnings;
import io.kubernetes.client.fluent.BaseFluent;
import java.util.ArrayList;
import java.util.Collection;
import java.lang.Object;
import java.util.List;
import java.lang.String;
import java.util.function.Predicate;

/**
 * Generated
 */
@SuppressWarnings("unchecked")
public class V1alpha2ResourceClaimSchedulingStatusFluent<A extends V1alpha2ResourceClaimSchedulingStatusFluent<A>> extends BaseFluent<A>{
  public V1alpha2ResourceClaimSchedulingStatusFluent() {
  }
  
  public V1alpha2ResourceClaimSchedulingStatusFluent(V1alpha2ResourceClaimSchedulingStatus instance) {
    this.copyInstance(instance);
  }
  private String name;
  private List<String> unsuitableNodes;
  
  protected void copyInstance(V1alpha2ResourceClaimSchedulingStatus instance) {
    instance = (instance != null ? instance : new V1alpha2ResourceClaimSchedulingStatus());
    if (instance != null) {
          this.withName(instance.getName());
          this.withUnsuitableNodes(instance.getUnsuitableNodes());
        }
  }
  
  public String getName() {
    return this.name;
  }
  
  public A withName(String name) {
    this.name = name;
    return (A) this;
  }
  
  public boolean hasName() {
    return this.name != null;
  }
  
  public A addToUnsuitableNodes(int index,String item) {
    if (this.unsuitableNodes == null) {this.unsuitableNodes = new ArrayList<String>();}
    this.unsuitableNodes.add(index, item);
    return (A)this;
  }
  
  public A setToUnsuitableNodes(int index,String item) {
    if (this.unsuitableNodes == null) {this.unsuitableNodes = new ArrayList<String>();}
    this.unsuitableNodes.set(index, item); return (A)this;
  }
  
  public A addToUnsuitableNodes(java.lang.String... items) {
    if (this.unsuitableNodes == null) {this.unsuitableNodes = new ArrayList<String>();}
    for (String item : items) {this.unsuitableNodes.add(item);} return (A)this;
  }
  
  public A addAllToUnsuitableNodes(Collection<String> items) {
    if (this.unsuitableNodes == null) {this.unsuitableNodes = new ArrayList<String>();}
    for (String item : items) {this.unsuitableNodes.add(item);} return (A)this;
  }
  
  public A removeFromUnsuitableNodes(java.lang.String... items) {
    if (this.unsuitableNodes == null) return (A)this;
    for (String item : items) { this.unsuitableNodes.remove(item);} return (A)this;
  }
  
  public A removeAllFromUnsuitableNodes(Collection<String> items) {
    if (this.unsuitableNodes == null) return (A)this;
    for (String item : items) { this.unsuitableNodes.remove(item);} return (A)this;
  }
  
  public List<String> getUnsuitableNodes() {
    return this.unsuitableNodes;
  }
  
  public String getUnsuitableNode(int index) {
    return this.unsuitableNodes.get(index);
  }
  
  public String getFirstUnsuitableNode() {
    return this.unsuitableNodes.get(0);
  }
  
  public String getLastUnsuitableNode() {
    return this.unsuitableNodes.get(unsuitableNodes.size() - 1);
  }
  
  public String getMatchingUnsuitableNode(Predicate<String> predicate) {
      for (String item : unsuitableNodes) {
        if (predicate.test(item)) {
          return item;
        }
      }
      return null;
  }
  
  public boolean hasMatchingUnsuitableNode(Predicate<String> predicate) {
      for (String item : unsuitableNodes) {
        if (predicate.test(item)) {
          return true;
        }
      }
      return false;
  }
  
  public A withUnsuitableNodes(List<String> unsuitableNodes) {
    if (unsuitableNodes != null) {
        this.unsuitableNodes = new ArrayList();
        for (String item : unsuitableNodes) {
          this.addToUnsuitableNodes(item);
        }
    } else {
      this.unsuitableNodes = null;
    }
    return (A) this;
  }
  
  public A withUnsuitableNodes(java.lang.String... unsuitableNodes) {
    if (this.unsuitableNodes != null) {
        this.unsuitableNodes.clear();
        _visitables.remove("unsuitableNodes");
    }
    if (unsuitableNodes != null) {
      for (String item : unsuitableNodes) {
        this.addToUnsuitableNodes(item);
      }
    }
    return (A) this;
  }
  
  public boolean hasUnsuitableNodes() {
    return this.unsuitableNodes != null && !this.unsuitableNodes.isEmpty();
  }
  
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    V1alpha2ResourceClaimSchedulingStatusFluent that = (V1alpha2ResourceClaimSchedulingStatusFluent) o;
    if (!java.util.Objects.equals(name, that.name)) return false;
    if (!java.util.Objects.equals(unsuitableNodes, that.unsuitableNodes)) return false;
    return true;
  }
  
  public int hashCode() {
    return java.util.Objects.hash(name,  unsuitableNodes,  super.hashCode());
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (name != null) { sb.append("name:"); sb.append(name + ","); }
    if (unsuitableNodes != null && !unsuitableNodes.isEmpty()) { sb.append("unsuitableNodes:"); sb.append(unsuitableNodes); }
    sb.append("}");
    return sb.toString();
  }
  

}