package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.SuppressWarnings;
import io.kubernetes.client.fluent.Nested;
import java.util.ArrayList;
import java.lang.String;
import java.util.function.Predicate;
import io.kubernetes.client.fluent.BaseFluent;
import java.lang.Long;
import java.util.Iterator;
import java.util.Collection;
import java.lang.Object;
import java.util.List;

/**
 * Generated
 */
@SuppressWarnings("unchecked")
public class V1beta2DeviceSubRequestFluent<A extends V1beta2DeviceSubRequestFluent<A>> extends BaseFluent<A>{
  public V1beta2DeviceSubRequestFluent() {
  }
  
  public V1beta2DeviceSubRequestFluent(V1beta2DeviceSubRequest instance) {
    this.copyInstance(instance);
  }
  private String allocationMode;
  private Long count;
  private String deviceClassName;
  private String name;
  private ArrayList<V1beta2DeviceSelectorBuilder> selectors;
  private ArrayList<V1beta2DeviceTolerationBuilder> tolerations;
  
  protected void copyInstance(V1beta2DeviceSubRequest instance) {
    instance = (instance != null ? instance : new V1beta2DeviceSubRequest());
    if (instance != null) {
          this.withAllocationMode(instance.getAllocationMode());
          this.withCount(instance.getCount());
          this.withDeviceClassName(instance.getDeviceClassName());
          this.withName(instance.getName());
          this.withSelectors(instance.getSelectors());
          this.withTolerations(instance.getTolerations());
        }
  }
  
  public String getAllocationMode() {
    return this.allocationMode;
  }
  
  public A withAllocationMode(String allocationMode) {
    this.allocationMode = allocationMode;
    return (A) this;
  }
  
  public boolean hasAllocationMode() {
    return this.allocationMode != null;
  }
  
  public Long getCount() {
    return this.count;
  }
  
  public A withCount(Long count) {
    this.count = count;
    return (A) this;
  }
  
  public boolean hasCount() {
    return this.count != null;
  }
  
  public String getDeviceClassName() {
    return this.deviceClassName;
  }
  
  public A withDeviceClassName(String deviceClassName) {
    this.deviceClassName = deviceClassName;
    return (A) this;
  }
  
  public boolean hasDeviceClassName() {
    return this.deviceClassName != null;
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
  
  public A addToSelectors(int index,V1beta2DeviceSelector item) {
    if (this.selectors == null) {this.selectors = new ArrayList<V1beta2DeviceSelectorBuilder>();}
    V1beta2DeviceSelectorBuilder builder = new V1beta2DeviceSelectorBuilder(item);
    if (index < 0 || index >= selectors.size()) {
        _visitables.get("selectors").add(builder);
        selectors.add(builder);
    } else {
        _visitables.get("selectors").add(builder);
        selectors.add(index, builder);
    }
    return (A)this;
  }
  
  public A setToSelectors(int index,V1beta2DeviceSelector item) {
    if (this.selectors == null) {this.selectors = new ArrayList<V1beta2DeviceSelectorBuilder>();}
    V1beta2DeviceSelectorBuilder builder = new V1beta2DeviceSelectorBuilder(item);
    if (index < 0 || index >= selectors.size()) {
        _visitables.get("selectors").add(builder);
        selectors.add(builder);
    } else {
        _visitables.get("selectors").add(builder);
        selectors.set(index, builder);
    }
    return (A)this;
  }
  
  public A addToSelectors(io.kubernetes.client.openapi.models.V1beta2DeviceSelector... items) {
    if (this.selectors == null) {this.selectors = new ArrayList<V1beta2DeviceSelectorBuilder>();}
    for (V1beta2DeviceSelector item : items) {V1beta2DeviceSelectorBuilder builder = new V1beta2DeviceSelectorBuilder(item);_visitables.get("selectors").add(builder);this.selectors.add(builder);} return (A)this;
  }
  
  public A addAllToSelectors(Collection<V1beta2DeviceSelector> items) {
    if (this.selectors == null) {this.selectors = new ArrayList<V1beta2DeviceSelectorBuilder>();}
    for (V1beta2DeviceSelector item : items) {V1beta2DeviceSelectorBuilder builder = new V1beta2DeviceSelectorBuilder(item);_visitables.get("selectors").add(builder);this.selectors.add(builder);} return (A)this;
  }
  
  public A removeFromSelectors(io.kubernetes.client.openapi.models.V1beta2DeviceSelector... items) {
    if (this.selectors == null) return (A)this;
    for (V1beta2DeviceSelector item : items) {V1beta2DeviceSelectorBuilder builder = new V1beta2DeviceSelectorBuilder(item);_visitables.get("selectors").remove(builder); this.selectors.remove(builder);} return (A)this;
  }
  
  public A removeAllFromSelectors(Collection<V1beta2DeviceSelector> items) {
    if (this.selectors == null) return (A)this;
    for (V1beta2DeviceSelector item : items) {V1beta2DeviceSelectorBuilder builder = new V1beta2DeviceSelectorBuilder(item);_visitables.get("selectors").remove(builder); this.selectors.remove(builder);} return (A)this;
  }
  
  public A removeMatchingFromSelectors(Predicate<V1beta2DeviceSelectorBuilder> predicate) {
    if (selectors == null) return (A) this;
    final Iterator<V1beta2DeviceSelectorBuilder> each = selectors.iterator();
    final List visitables = _visitables.get("selectors");
    while (each.hasNext()) {
      V1beta2DeviceSelectorBuilder builder = each.next();
      if (predicate.test(builder)) {
        visitables.remove(builder);
        each.remove();
      }
    }
    return (A)this;
  }
  
  public List<V1beta2DeviceSelector> buildSelectors() {
    return this.selectors != null ? build(selectors) : null;
  }
  
  public V1beta2DeviceSelector buildSelector(int index) {
    return this.selectors.get(index).build();
  }
  
  public V1beta2DeviceSelector buildFirstSelector() {
    return this.selectors.get(0).build();
  }
  
  public V1beta2DeviceSelector buildLastSelector() {
    return this.selectors.get(selectors.size() - 1).build();
  }
  
  public V1beta2DeviceSelector buildMatchingSelector(Predicate<V1beta2DeviceSelectorBuilder> predicate) {
      for (V1beta2DeviceSelectorBuilder item : selectors) {
        if (predicate.test(item)) {
          return item.build();
        }
      }
      return null;
  }
  
  public boolean hasMatchingSelector(Predicate<V1beta2DeviceSelectorBuilder> predicate) {
      for (V1beta2DeviceSelectorBuilder item : selectors) {
        if (predicate.test(item)) {
          return true;
        }
      }
      return false;
  }
  
  public A withSelectors(List<V1beta2DeviceSelector> selectors) {
    if (this.selectors != null) {
      this._visitables.get("selectors").clear();
    }
    if (selectors != null) {
        this.selectors = new ArrayList();
        for (V1beta2DeviceSelector item : selectors) {
          this.addToSelectors(item);
        }
    } else {
      this.selectors = null;
    }
    return (A) this;
  }
  
  public A withSelectors(io.kubernetes.client.openapi.models.V1beta2DeviceSelector... selectors) {
    if (this.selectors != null) {
        this.selectors.clear();
        _visitables.remove("selectors");
    }
    if (selectors != null) {
      for (V1beta2DeviceSelector item : selectors) {
        this.addToSelectors(item);
      }
    }
    return (A) this;
  }
  
  public boolean hasSelectors() {
    return this.selectors != null && !this.selectors.isEmpty();
  }
  
  public SelectorsNested<A> addNewSelector() {
    return new SelectorsNested(-1, null);
  }
  
  public SelectorsNested<A> addNewSelectorLike(V1beta2DeviceSelector item) {
    return new SelectorsNested(-1, item);
  }
  
  public SelectorsNested<A> setNewSelectorLike(int index,V1beta2DeviceSelector item) {
    return new SelectorsNested(index, item);
  }
  
  public SelectorsNested<A> editSelector(int index) {
    if (selectors.size() <= index) throw new RuntimeException("Can't edit selectors. Index exceeds size.");
    return setNewSelectorLike(index, buildSelector(index));
  }
  
  public SelectorsNested<A> editFirstSelector() {
    if (selectors.size() == 0) throw new RuntimeException("Can't edit first selectors. The list is empty.");
    return setNewSelectorLike(0, buildSelector(0));
  }
  
  public SelectorsNested<A> editLastSelector() {
    int index = selectors.size() - 1;
    if (index < 0) throw new RuntimeException("Can't edit last selectors. The list is empty.");
    return setNewSelectorLike(index, buildSelector(index));
  }
  
  public SelectorsNested<A> editMatchingSelector(Predicate<V1beta2DeviceSelectorBuilder> predicate) {
    int index = -1;
    for (int i=0;i<selectors.size();i++) { 
    if (predicate.test(selectors.get(i))) {index = i; break;}
    } 
    if (index < 0) throw new RuntimeException("Can't edit matching selectors. No match found.");
    return setNewSelectorLike(index, buildSelector(index));
  }
  
  public A addToTolerations(int index,V1beta2DeviceToleration item) {
    if (this.tolerations == null) {this.tolerations = new ArrayList<V1beta2DeviceTolerationBuilder>();}
    V1beta2DeviceTolerationBuilder builder = new V1beta2DeviceTolerationBuilder(item);
    if (index < 0 || index >= tolerations.size()) {
        _visitables.get("tolerations").add(builder);
        tolerations.add(builder);
    } else {
        _visitables.get("tolerations").add(builder);
        tolerations.add(index, builder);
    }
    return (A)this;
  }
  
  public A setToTolerations(int index,V1beta2DeviceToleration item) {
    if (this.tolerations == null) {this.tolerations = new ArrayList<V1beta2DeviceTolerationBuilder>();}
    V1beta2DeviceTolerationBuilder builder = new V1beta2DeviceTolerationBuilder(item);
    if (index < 0 || index >= tolerations.size()) {
        _visitables.get("tolerations").add(builder);
        tolerations.add(builder);
    } else {
        _visitables.get("tolerations").add(builder);
        tolerations.set(index, builder);
    }
    return (A)this;
  }
  
  public A addToTolerations(io.kubernetes.client.openapi.models.V1beta2DeviceToleration... items) {
    if (this.tolerations == null) {this.tolerations = new ArrayList<V1beta2DeviceTolerationBuilder>();}
    for (V1beta2DeviceToleration item : items) {V1beta2DeviceTolerationBuilder builder = new V1beta2DeviceTolerationBuilder(item);_visitables.get("tolerations").add(builder);this.tolerations.add(builder);} return (A)this;
  }
  
  public A addAllToTolerations(Collection<V1beta2DeviceToleration> items) {
    if (this.tolerations == null) {this.tolerations = new ArrayList<V1beta2DeviceTolerationBuilder>();}
    for (V1beta2DeviceToleration item : items) {V1beta2DeviceTolerationBuilder builder = new V1beta2DeviceTolerationBuilder(item);_visitables.get("tolerations").add(builder);this.tolerations.add(builder);} return (A)this;
  }
  
  public A removeFromTolerations(io.kubernetes.client.openapi.models.V1beta2DeviceToleration... items) {
    if (this.tolerations == null) return (A)this;
    for (V1beta2DeviceToleration item : items) {V1beta2DeviceTolerationBuilder builder = new V1beta2DeviceTolerationBuilder(item);_visitables.get("tolerations").remove(builder); this.tolerations.remove(builder);} return (A)this;
  }
  
  public A removeAllFromTolerations(Collection<V1beta2DeviceToleration> items) {
    if (this.tolerations == null) return (A)this;
    for (V1beta2DeviceToleration item : items) {V1beta2DeviceTolerationBuilder builder = new V1beta2DeviceTolerationBuilder(item);_visitables.get("tolerations").remove(builder); this.tolerations.remove(builder);} return (A)this;
  }
  
  public A removeMatchingFromTolerations(Predicate<V1beta2DeviceTolerationBuilder> predicate) {
    if (tolerations == null) return (A) this;
    final Iterator<V1beta2DeviceTolerationBuilder> each = tolerations.iterator();
    final List visitables = _visitables.get("tolerations");
    while (each.hasNext()) {
      V1beta2DeviceTolerationBuilder builder = each.next();
      if (predicate.test(builder)) {
        visitables.remove(builder);
        each.remove();
      }
    }
    return (A)this;
  }
  
  public List<V1beta2DeviceToleration> buildTolerations() {
    return this.tolerations != null ? build(tolerations) : null;
  }
  
  public V1beta2DeviceToleration buildToleration(int index) {
    return this.tolerations.get(index).build();
  }
  
  public V1beta2DeviceToleration buildFirstToleration() {
    return this.tolerations.get(0).build();
  }
  
  public V1beta2DeviceToleration buildLastToleration() {
    return this.tolerations.get(tolerations.size() - 1).build();
  }
  
  public V1beta2DeviceToleration buildMatchingToleration(Predicate<V1beta2DeviceTolerationBuilder> predicate) {
      for (V1beta2DeviceTolerationBuilder item : tolerations) {
        if (predicate.test(item)) {
          return item.build();
        }
      }
      return null;
  }
  
  public boolean hasMatchingToleration(Predicate<V1beta2DeviceTolerationBuilder> predicate) {
      for (V1beta2DeviceTolerationBuilder item : tolerations) {
        if (predicate.test(item)) {
          return true;
        }
      }
      return false;
  }
  
  public A withTolerations(List<V1beta2DeviceToleration> tolerations) {
    if (this.tolerations != null) {
      this._visitables.get("tolerations").clear();
    }
    if (tolerations != null) {
        this.tolerations = new ArrayList();
        for (V1beta2DeviceToleration item : tolerations) {
          this.addToTolerations(item);
        }
    } else {
      this.tolerations = null;
    }
    return (A) this;
  }
  
  public A withTolerations(io.kubernetes.client.openapi.models.V1beta2DeviceToleration... tolerations) {
    if (this.tolerations != null) {
        this.tolerations.clear();
        _visitables.remove("tolerations");
    }
    if (tolerations != null) {
      for (V1beta2DeviceToleration item : tolerations) {
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
  
  public TolerationsNested<A> addNewTolerationLike(V1beta2DeviceToleration item) {
    return new TolerationsNested(-1, item);
  }
  
  public TolerationsNested<A> setNewTolerationLike(int index,V1beta2DeviceToleration item) {
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
  
  public TolerationsNested<A> editMatchingToleration(Predicate<V1beta2DeviceTolerationBuilder> predicate) {
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
    V1beta2DeviceSubRequestFluent that = (V1beta2DeviceSubRequestFluent) o;
    if (!java.util.Objects.equals(allocationMode, that.allocationMode)) return false;
    if (!java.util.Objects.equals(count, that.count)) return false;
    if (!java.util.Objects.equals(deviceClassName, that.deviceClassName)) return false;
    if (!java.util.Objects.equals(name, that.name)) return false;
    if (!java.util.Objects.equals(selectors, that.selectors)) return false;
    if (!java.util.Objects.equals(tolerations, that.tolerations)) return false;
    return true;
  }
  
  public int hashCode() {
    return java.util.Objects.hash(allocationMode,  count,  deviceClassName,  name,  selectors,  tolerations,  super.hashCode());
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (allocationMode != null) { sb.append("allocationMode:"); sb.append(allocationMode + ","); }
    if (count != null) { sb.append("count:"); sb.append(count + ","); }
    if (deviceClassName != null) { sb.append("deviceClassName:"); sb.append(deviceClassName + ","); }
    if (name != null) { sb.append("name:"); sb.append(name + ","); }
    if (selectors != null && !selectors.isEmpty()) { sb.append("selectors:"); sb.append(selectors + ","); }
    if (tolerations != null && !tolerations.isEmpty()) { sb.append("tolerations:"); sb.append(tolerations); }
    sb.append("}");
    return sb.toString();
  }
  public class SelectorsNested<N> extends V1beta2DeviceSelectorFluent<SelectorsNested<N>> implements Nested<N>{
    SelectorsNested(int index,V1beta2DeviceSelector item) {
      this.index = index;
      this.builder = new V1beta2DeviceSelectorBuilder(this, item);
    }
    V1beta2DeviceSelectorBuilder builder;
    int index;
    
    public N and() {
      return (N) V1beta2DeviceSubRequestFluent.this.setToSelectors(index,builder.build());
    }
    
    public N endSelector() {
      return and();
    }
    
  
  }
  public class TolerationsNested<N> extends V1beta2DeviceTolerationFluent<TolerationsNested<N>> implements Nested<N>{
    TolerationsNested(int index,V1beta2DeviceToleration item) {
      this.index = index;
      this.builder = new V1beta2DeviceTolerationBuilder(this, item);
    }
    V1beta2DeviceTolerationBuilder builder;
    int index;
    
    public N and() {
      return (N) V1beta2DeviceSubRequestFluent.this.setToTolerations(index,builder.build());
    }
    
    public N endToleration() {
      return and();
    }
    
  
  }

}