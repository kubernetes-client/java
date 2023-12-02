package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.SuppressWarnings;
import io.kubernetes.client.fluent.Nested;
import java.util.ArrayList;
import java.lang.String;
import java.util.LinkedHashMap;
import java.util.function.Predicate;
import io.kubernetes.client.fluent.BaseFluent;
import java.util.Iterator;
import java.util.Collection;
import java.lang.Object;
import java.util.List;
import java.util.Map;

/**
 * Generated
 */
@SuppressWarnings("unchecked")
public class V1SchedulingFluent<A extends V1SchedulingFluent<A>> extends BaseFluent<A>{
  public V1SchedulingFluent() {
  }
  
  public V1SchedulingFluent(V1Scheduling instance) {
    this.copyInstance(instance);
  }
  private Map<String,String> nodeSelector;
  private ArrayList<V1TolerationBuilder> tolerations;
  
  protected void copyInstance(V1Scheduling instance) {
    instance = (instance != null ? instance : new V1Scheduling());
    if (instance != null) {
          this.withNodeSelector(instance.getNodeSelector());
          this.withTolerations(instance.getTolerations());
        }
  }
  
  public A addToNodeSelector(String key,String value) {
    if(this.nodeSelector == null && key != null && value != null) { this.nodeSelector = new LinkedHashMap(); }
    if(key != null && value != null) {this.nodeSelector.put(key, value);} return (A)this;
  }
  
  public A addToNodeSelector(Map<String,String> map) {
    if(this.nodeSelector == null && map != null) { this.nodeSelector = new LinkedHashMap(); }
    if(map != null) { this.nodeSelector.putAll(map);} return (A)this;
  }
  
  public A removeFromNodeSelector(String key) {
    if(this.nodeSelector == null) { return (A) this; }
    if(key != null && this.nodeSelector != null) {this.nodeSelector.remove(key);} return (A)this;
  }
  
  public A removeFromNodeSelector(Map<String,String> map) {
    if(this.nodeSelector == null) { return (A) this; }
    if(map != null) { for(Object key : map.keySet()) {if (this.nodeSelector != null){this.nodeSelector.remove(key);}}} return (A)this;
  }
  
  public Map<String,String> getNodeSelector() {
    return this.nodeSelector;
  }
  
  public <K,V>A withNodeSelector(Map<String,String> nodeSelector) {
    if (nodeSelector == null) {
      this.nodeSelector = null;
    } else {
      this.nodeSelector = new LinkedHashMap(nodeSelector);
    }
    return (A) this;
  }
  
  public boolean hasNodeSelector() {
    return this.nodeSelector != null;
  }
  
  public A addToTolerations(int index,V1Toleration item) {
    if (this.tolerations == null) {this.tolerations = new ArrayList<V1TolerationBuilder>();}
    V1TolerationBuilder builder = new V1TolerationBuilder(item);
    if (index < 0 || index >= tolerations.size()) { _visitables.get("tolerations").add(builder); tolerations.add(builder); } else { _visitables.get("tolerations").add(index, builder); tolerations.add(index, builder);}
    return (A)this;
  }
  
  public A setToTolerations(int index,V1Toleration item) {
    if (this.tolerations == null) {this.tolerations = new ArrayList<V1TolerationBuilder>();}
    V1TolerationBuilder builder = new V1TolerationBuilder(item);
    if (index < 0 || index >= tolerations.size()) { _visitables.get("tolerations").add(builder); tolerations.add(builder); } else { _visitables.get("tolerations").set(index, builder); tolerations.set(index, builder);}
    return (A)this;
  }
  
  public A addToTolerations(io.kubernetes.client.openapi.models.V1Toleration... items) {
    if (this.tolerations == null) {this.tolerations = new ArrayList<V1TolerationBuilder>();}
    for (V1Toleration item : items) {V1TolerationBuilder builder = new V1TolerationBuilder(item);_visitables.get("tolerations").add(builder);this.tolerations.add(builder);} return (A)this;
  }
  
  public A addAllToTolerations(Collection<V1Toleration> items) {
    if (this.tolerations == null) {this.tolerations = new ArrayList<V1TolerationBuilder>();}
    for (V1Toleration item : items) {V1TolerationBuilder builder = new V1TolerationBuilder(item);_visitables.get("tolerations").add(builder);this.tolerations.add(builder);} return (A)this;
  }
  
  public A removeFromTolerations(io.kubernetes.client.openapi.models.V1Toleration... items) {
    if (this.tolerations == null) return (A)this;
    for (V1Toleration item : items) {V1TolerationBuilder builder = new V1TolerationBuilder(item);_visitables.get("tolerations").remove(builder); this.tolerations.remove(builder);} return (A)this;
  }
  
  public A removeAllFromTolerations(Collection<V1Toleration> items) {
    if (this.tolerations == null) return (A)this;
    for (V1Toleration item : items) {V1TolerationBuilder builder = new V1TolerationBuilder(item);_visitables.get("tolerations").remove(builder); this.tolerations.remove(builder);} return (A)this;
  }
  
  public A removeMatchingFromTolerations(Predicate<V1TolerationBuilder> predicate) {
    if (tolerations == null) return (A) this;
    final Iterator<V1TolerationBuilder> each = tolerations.iterator();
    final List visitables = _visitables.get("tolerations");
    while (each.hasNext()) {
      V1TolerationBuilder builder = each.next();
      if (predicate.test(builder)) {
        visitables.remove(builder);
        each.remove();
      }
    }
    return (A)this;
  }
  
  public List<V1Toleration> buildTolerations() {
    return this.tolerations != null ? build(tolerations) : null;
  }
  
  public V1Toleration buildToleration(int index) {
    return this.tolerations.get(index).build();
  }
  
  public V1Toleration buildFirstToleration() {
    return this.tolerations.get(0).build();
  }
  
  public V1Toleration buildLastToleration() {
    return this.tolerations.get(tolerations.size() - 1).build();
  }
  
  public V1Toleration buildMatchingToleration(Predicate<V1TolerationBuilder> predicate) {
      for (V1TolerationBuilder item : tolerations) {
        if (predicate.test(item)) {
          return item.build();
        }
      }
      return null;
  }
  
  public boolean hasMatchingToleration(Predicate<V1TolerationBuilder> predicate) {
      for (V1TolerationBuilder item : tolerations) {
        if (predicate.test(item)) {
          return true;
        }
      }
      return false;
  }
  
  public A withTolerations(List<V1Toleration> tolerations) {
    if (this.tolerations != null) {
      this._visitables.get("tolerations").clear();
    }
    if (tolerations != null) {
        this.tolerations = new ArrayList();
        for (V1Toleration item : tolerations) {
          this.addToTolerations(item);
        }
    } else {
      this.tolerations = null;
    }
    return (A) this;
  }
  
  public A withTolerations(io.kubernetes.client.openapi.models.V1Toleration... tolerations) {
    if (this.tolerations != null) {
        this.tolerations.clear();
        _visitables.remove("tolerations");
    }
    if (tolerations != null) {
      for (V1Toleration item : tolerations) {
        this.addToTolerations(item);
      }
    }
    return (A) this;
  }
  
  public boolean hasTolerations() {
    return this.tolerations != null && !this.tolerations.isEmpty();
  }
  
  public TolerationsNested<A> addNewToleration() {
    return new TolerationsNested(-1, null);
  }
  
  public TolerationsNested<A> addNewTolerationLike(V1Toleration item) {
    return new TolerationsNested(-1, item);
  }
  
  public TolerationsNested<A> setNewTolerationLike(int index,V1Toleration item) {
    return new TolerationsNested(index, item);
  }
  
  public TolerationsNested<A> editToleration(int index) {
    if (tolerations.size() <= index) throw new RuntimeException("Can't edit tolerations. Index exceeds size.");
    return setNewTolerationLike(index, buildToleration(index));
  }
  
  public TolerationsNested<A> editFirstToleration() {
    if (tolerations.size() == 0) throw new RuntimeException("Can't edit first tolerations. The list is empty.");
    return setNewTolerationLike(0, buildToleration(0));
  }
  
  public TolerationsNested<A> editLastToleration() {
    int index = tolerations.size() - 1;
    if (index < 0) throw new RuntimeException("Can't edit last tolerations. The list is empty.");
    return setNewTolerationLike(index, buildToleration(index));
  }
  
  public TolerationsNested<A> editMatchingToleration(Predicate<V1TolerationBuilder> predicate) {
    int index = -1;
    for (int i=0;i<tolerations.size();i++) { 
    if (predicate.test(tolerations.get(i))) {index = i; break;}
    } 
    if (index < 0) throw new RuntimeException("Can't edit matching tolerations. No match found.");
    return setNewTolerationLike(index, buildToleration(index));
  }
  
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    V1SchedulingFluent that = (V1SchedulingFluent) o;
    if (!java.util.Objects.equals(nodeSelector, that.nodeSelector)) return false;
    if (!java.util.Objects.equals(tolerations, that.tolerations)) return false;
    return true;
  }
  
  public int hashCode() {
    return java.util.Objects.hash(nodeSelector,  tolerations,  super.hashCode());
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (nodeSelector != null && !nodeSelector.isEmpty()) { sb.append("nodeSelector:"); sb.append(nodeSelector + ","); }
    if (tolerations != null && !tolerations.isEmpty()) { sb.append("tolerations:"); sb.append(tolerations); }
    sb.append("}");
    return sb.toString();
  }
  public class TolerationsNested<N> extends V1TolerationFluent<TolerationsNested<N>> implements Nested<N>{
    TolerationsNested(int index,V1Toleration item) {
      this.index = index;
      this.builder = new V1TolerationBuilder(this, item);
    }
    V1TolerationBuilder builder;
    int index;
    
    public N and() {
      return (N) V1SchedulingFluent.this.setToTolerations(index,builder.build());
    }
    
    public N endToleration() {
      return and();
    }
    
  
  }

}