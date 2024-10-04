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
import java.lang.Boolean;

/**
 * Generated
 */
@SuppressWarnings("unchecked")
public class V1alpha3DeviceRequestFluent<A extends V1alpha3DeviceRequestFluent<A>> extends BaseFluent<A>{
  public V1alpha3DeviceRequestFluent() {
  }
  
  public V1alpha3DeviceRequestFluent(V1alpha3DeviceRequest instance) {
    this.copyInstance(instance);
  }
  private Boolean adminAccess;
  private String allocationMode;
  private Long count;
  private String deviceClassName;
  private String name;
  private ArrayList<V1alpha3DeviceSelectorBuilder> selectors;
  
  protected void copyInstance(V1alpha3DeviceRequest instance) {
    instance = (instance != null ? instance : new V1alpha3DeviceRequest());
    if (instance != null) {
          this.withAdminAccess(instance.getAdminAccess());
          this.withAllocationMode(instance.getAllocationMode());
          this.withCount(instance.getCount());
          this.withDeviceClassName(instance.getDeviceClassName());
          this.withName(instance.getName());
          this.withSelectors(instance.getSelectors());
        }
  }
  
  public Boolean getAdminAccess() {
    return this.adminAccess;
  }
  
  public A withAdminAccess(Boolean adminAccess) {
    this.adminAccess = adminAccess;
    return (A) this;
  }
  
  public boolean hasAdminAccess() {
    return this.adminAccess != null;
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
  
  public A addToSelectors(int index,V1alpha3DeviceSelector item) {
    if (this.selectors == null) {this.selectors = new ArrayList<V1alpha3DeviceSelectorBuilder>();}
    V1alpha3DeviceSelectorBuilder builder = new V1alpha3DeviceSelectorBuilder(item);
    if (index < 0 || index >= selectors.size()) { _visitables.get("selectors").add(builder); selectors.add(builder); } else { _visitables.get("selectors").add(index, builder); selectors.add(index, builder);}
    return (A)this;
  }
  
  public A setToSelectors(int index,V1alpha3DeviceSelector item) {
    if (this.selectors == null) {this.selectors = new ArrayList<V1alpha3DeviceSelectorBuilder>();}
    V1alpha3DeviceSelectorBuilder builder = new V1alpha3DeviceSelectorBuilder(item);
    if (index < 0 || index >= selectors.size()) { _visitables.get("selectors").add(builder); selectors.add(builder); } else { _visitables.get("selectors").set(index, builder); selectors.set(index, builder);}
    return (A)this;
  }
  
  public A addToSelectors(io.kubernetes.client.openapi.models.V1alpha3DeviceSelector... items) {
    if (this.selectors == null) {this.selectors = new ArrayList<V1alpha3DeviceSelectorBuilder>();}
    for (V1alpha3DeviceSelector item : items) {V1alpha3DeviceSelectorBuilder builder = new V1alpha3DeviceSelectorBuilder(item);_visitables.get("selectors").add(builder);this.selectors.add(builder);} return (A)this;
  }
  
  public A addAllToSelectors(Collection<V1alpha3DeviceSelector> items) {
    if (this.selectors == null) {this.selectors = new ArrayList<V1alpha3DeviceSelectorBuilder>();}
    for (V1alpha3DeviceSelector item : items) {V1alpha3DeviceSelectorBuilder builder = new V1alpha3DeviceSelectorBuilder(item);_visitables.get("selectors").add(builder);this.selectors.add(builder);} return (A)this;
  }
  
  public A removeFromSelectors(io.kubernetes.client.openapi.models.V1alpha3DeviceSelector... items) {
    if (this.selectors == null) return (A)this;
    for (V1alpha3DeviceSelector item : items) {V1alpha3DeviceSelectorBuilder builder = new V1alpha3DeviceSelectorBuilder(item);_visitables.get("selectors").remove(builder); this.selectors.remove(builder);} return (A)this;
  }
  
  public A removeAllFromSelectors(Collection<V1alpha3DeviceSelector> items) {
    if (this.selectors == null) return (A)this;
    for (V1alpha3DeviceSelector item : items) {V1alpha3DeviceSelectorBuilder builder = new V1alpha3DeviceSelectorBuilder(item);_visitables.get("selectors").remove(builder); this.selectors.remove(builder);} return (A)this;
  }
  
  public A removeMatchingFromSelectors(Predicate<V1alpha3DeviceSelectorBuilder> predicate) {
    if (selectors == null) return (A) this;
    final Iterator<V1alpha3DeviceSelectorBuilder> each = selectors.iterator();
    final List visitables = _visitables.get("selectors");
    while (each.hasNext()) {
      V1alpha3DeviceSelectorBuilder builder = each.next();
      if (predicate.test(builder)) {
        visitables.remove(builder);
        each.remove();
      }
    }
    return (A)this;
  }
  
  public List<V1alpha3DeviceSelector> buildSelectors() {
    return this.selectors != null ? build(selectors) : null;
  }
  
  public V1alpha3DeviceSelector buildSelector(int index) {
    return this.selectors.get(index).build();
  }
  
  public V1alpha3DeviceSelector buildFirstSelector() {
    return this.selectors.get(0).build();
  }
  
  public V1alpha3DeviceSelector buildLastSelector() {
    return this.selectors.get(selectors.size() - 1).build();
  }
  
  public V1alpha3DeviceSelector buildMatchingSelector(Predicate<V1alpha3DeviceSelectorBuilder> predicate) {
      for (V1alpha3DeviceSelectorBuilder item : selectors) {
        if (predicate.test(item)) {
          return item.build();
        }
      }
      return null;
  }
  
  public boolean hasMatchingSelector(Predicate<V1alpha3DeviceSelectorBuilder> predicate) {
      for (V1alpha3DeviceSelectorBuilder item : selectors) {
        if (predicate.test(item)) {
          return true;
        }
      }
      return false;
  }
  
  public A withSelectors(List<V1alpha3DeviceSelector> selectors) {
    if (this.selectors != null) {
      this._visitables.get("selectors").clear();
    }
    if (selectors != null) {
        this.selectors = new ArrayList();
        for (V1alpha3DeviceSelector item : selectors) {
          this.addToSelectors(item);
        }
    } else {
      this.selectors = null;
    }
    return (A) this;
  }
  
  public A withSelectors(io.kubernetes.client.openapi.models.V1alpha3DeviceSelector... selectors) {
    if (this.selectors != null) {
        this.selectors.clear();
        _visitables.remove("selectors");
    }
    if (selectors != null) {
      for (V1alpha3DeviceSelector item : selectors) {
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
  
  public SelectorsNested<A> addNewSelectorLike(V1alpha3DeviceSelector item) {
    return new SelectorsNested(-1, item);
  }
  
  public SelectorsNested<A> setNewSelectorLike(int index,V1alpha3DeviceSelector item) {
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
  
  public SelectorsNested<A> editMatchingSelector(Predicate<V1alpha3DeviceSelectorBuilder> predicate) {
    int index = -1;
    for (int i=0;i<selectors.size();i++) { 
    if (predicate.test(selectors.get(i))) {index = i; break;}
    } 
    if (index < 0) throw new RuntimeException("Can't edit matching selectors. No match found.");
    return setNewSelectorLike(index, buildSelector(index));
  }
  
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    V1alpha3DeviceRequestFluent that = (V1alpha3DeviceRequestFluent) o;
    if (!java.util.Objects.equals(adminAccess, that.adminAccess)) return false;
    if (!java.util.Objects.equals(allocationMode, that.allocationMode)) return false;
    if (!java.util.Objects.equals(count, that.count)) return false;
    if (!java.util.Objects.equals(deviceClassName, that.deviceClassName)) return false;
    if (!java.util.Objects.equals(name, that.name)) return false;
    if (!java.util.Objects.equals(selectors, that.selectors)) return false;
    return true;
  }
  
  public int hashCode() {
    return java.util.Objects.hash(adminAccess,  allocationMode,  count,  deviceClassName,  name,  selectors,  super.hashCode());
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (adminAccess != null) { sb.append("adminAccess:"); sb.append(adminAccess + ","); }
    if (allocationMode != null) { sb.append("allocationMode:"); sb.append(allocationMode + ","); }
    if (count != null) { sb.append("count:"); sb.append(count + ","); }
    if (deviceClassName != null) { sb.append("deviceClassName:"); sb.append(deviceClassName + ","); }
    if (name != null) { sb.append("name:"); sb.append(name + ","); }
    if (selectors != null && !selectors.isEmpty()) { sb.append("selectors:"); sb.append(selectors); }
    sb.append("}");
    return sb.toString();
  }
  
  public A withAdminAccess() {
    return withAdminAccess(true);
  }
  public class SelectorsNested<N> extends V1alpha3DeviceSelectorFluent<SelectorsNested<N>> implements Nested<N>{
    SelectorsNested(int index,V1alpha3DeviceSelector item) {
      this.index = index;
      this.builder = new V1alpha3DeviceSelectorBuilder(this, item);
    }
    V1alpha3DeviceSelectorBuilder builder;
    int index;
    
    public N and() {
      return (N) V1alpha3DeviceRequestFluent.this.setToSelectors(index,builder.build());
    }
    
    public N endSelector() {
      return and();
    }
    
  
  }

}