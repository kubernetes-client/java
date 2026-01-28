package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.BaseFluent;
import io.kubernetes.client.fluent.Nested;
import java.lang.Long;
import java.lang.Object;
import java.lang.RuntimeException;
import java.lang.String;
import java.lang.StringBuilder;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.function.Predicate;

/**
 * Generated
 */
@SuppressWarnings("unchecked")
public class V1DeviceSubRequestFluent<A extends io.kubernetes.client.openapi.models.V1DeviceSubRequestFluent<A>> extends BaseFluent<A>{

  private String allocationMode;
  private V1CapacityRequirementsBuilder capacity;
  private Long count;
  private String deviceClassName;
  private String name;
  private ArrayList<V1DeviceSelectorBuilder> selectors;
  private ArrayList<V1DeviceTolerationBuilder> tolerations;

  public V1DeviceSubRequestFluent() {
  }
  
  public V1DeviceSubRequestFluent(V1DeviceSubRequest instance) {
    this.copyInstance(instance);
  }

  public A addAllToSelectors(Collection<V1DeviceSelector> items) {
    if (this.selectors == null) {
      this.selectors = new ArrayList();
    }
    for (V1DeviceSelector item : items) {
        V1DeviceSelectorBuilder builder = new V1DeviceSelectorBuilder(item);
        _visitables.get("selectors").add(builder);
        this.selectors.add(builder);
    }
    return (A) this;
  }
  
  public A addAllToTolerations(Collection<V1DeviceToleration> items) {
    if (this.tolerations == null) {
      this.tolerations = new ArrayList();
    }
    for (V1DeviceToleration item : items) {
        V1DeviceTolerationBuilder builder = new V1DeviceTolerationBuilder(item);
        _visitables.get("tolerations").add(builder);
        this.tolerations.add(builder);
    }
    return (A) this;
  }
  
  public SelectorsNested<A> addNewSelector() {
    return new SelectorsNested(-1, null);
  }
  
  public SelectorsNested<A> addNewSelectorLike(V1DeviceSelector item) {
    return new SelectorsNested(-1, item);
  }
  
  public TolerationsNested<A> addNewToleration() {
    return new TolerationsNested(-1, null);
  }
  
  public TolerationsNested<A> addNewTolerationLike(V1DeviceToleration item) {
    return new TolerationsNested(-1, item);
  }
  
  public A addToSelectors(V1DeviceSelector... items) {
    if (this.selectors == null) {
      this.selectors = new ArrayList();
    }
    for (V1DeviceSelector item : items) {
        V1DeviceSelectorBuilder builder = new V1DeviceSelectorBuilder(item);
        _visitables.get("selectors").add(builder);
        this.selectors.add(builder);
    }
    return (A) this;
  }
  
  public A addToSelectors(int index,V1DeviceSelector item) {
    if (this.selectors == null) {
      this.selectors = new ArrayList();
    }
    V1DeviceSelectorBuilder builder = new V1DeviceSelectorBuilder(item);
    if (index < 0 || index >= selectors.size()) {
        _visitables.get("selectors").add(builder);
        selectors.add(builder);
    } else {
        _visitables.get("selectors").add(builder);
        selectors.add(index, builder);
    }
    return (A) this;
  }
  
  public A addToTolerations(V1DeviceToleration... items) {
    if (this.tolerations == null) {
      this.tolerations = new ArrayList();
    }
    for (V1DeviceToleration item : items) {
        V1DeviceTolerationBuilder builder = new V1DeviceTolerationBuilder(item);
        _visitables.get("tolerations").add(builder);
        this.tolerations.add(builder);
    }
    return (A) this;
  }
  
  public A addToTolerations(int index,V1DeviceToleration item) {
    if (this.tolerations == null) {
      this.tolerations = new ArrayList();
    }
    V1DeviceTolerationBuilder builder = new V1DeviceTolerationBuilder(item);
    if (index < 0 || index >= tolerations.size()) {
        _visitables.get("tolerations").add(builder);
        tolerations.add(builder);
    } else {
        _visitables.get("tolerations").add(builder);
        tolerations.add(index, builder);
    }
    return (A) this;
  }
  
  public V1CapacityRequirements buildCapacity() {
    return this.capacity != null ? this.capacity.build() : null;
  }
  
  public V1DeviceSelector buildFirstSelector() {
    return this.selectors.get(0).build();
  }
  
  public V1DeviceToleration buildFirstToleration() {
    return this.tolerations.get(0).build();
  }
  
  public V1DeviceSelector buildLastSelector() {
    return this.selectors.get(selectors.size() - 1).build();
  }
  
  public V1DeviceToleration buildLastToleration() {
    return this.tolerations.get(tolerations.size() - 1).build();
  }
  
  public V1DeviceSelector buildMatchingSelector(Predicate<V1DeviceSelectorBuilder> predicate) {
      for (V1DeviceSelectorBuilder item : selectors) {
        if (predicate.test(item)) {
          return item.build();
        }
      }
      return null;
  }
  
  public V1DeviceToleration buildMatchingToleration(Predicate<V1DeviceTolerationBuilder> predicate) {
      for (V1DeviceTolerationBuilder item : tolerations) {
        if (predicate.test(item)) {
          return item.build();
        }
      }
      return null;
  }
  
  public V1DeviceSelector buildSelector(int index) {
    return this.selectors.get(index).build();
  }
  
  public List<V1DeviceSelector> buildSelectors() {
    return this.selectors != null ? build(selectors) : null;
  }
  
  public V1DeviceToleration buildToleration(int index) {
    return this.tolerations.get(index).build();
  }
  
  public List<V1DeviceToleration> buildTolerations() {
    return this.tolerations != null ? build(tolerations) : null;
  }
  
  protected void copyInstance(V1DeviceSubRequest instance) {
    instance = instance != null ? instance : new V1DeviceSubRequest();
    if (instance != null) {
        this.withAllocationMode(instance.getAllocationMode());
        this.withCapacity(instance.getCapacity());
        this.withCount(instance.getCount());
        this.withDeviceClassName(instance.getDeviceClassName());
        this.withName(instance.getName());
        this.withSelectors(instance.getSelectors());
        this.withTolerations(instance.getTolerations());
    }
  }
  
  public CapacityNested<A> editCapacity() {
    return this.withNewCapacityLike(Optional.ofNullable(this.buildCapacity()).orElse(null));
  }
  
  public SelectorsNested<A> editFirstSelector() {
    if (selectors.size() == 0) {
      throw new RuntimeException(String.format("Can't edit first %s. The list is empty.", "selectors"));
    }
    return this.setNewSelectorLike(0, this.buildSelector(0));
  }
  
  public TolerationsNested<A> editFirstToleration() {
    if (tolerations.size() == 0) {
      throw new RuntimeException(String.format("Can't edit first %s. The list is empty.", "tolerations"));
    }
    return this.setNewTolerationLike(0, this.buildToleration(0));
  }
  
  public SelectorsNested<A> editLastSelector() {
    int index = selectors.size() - 1;
    if (index < 0) {
      throw new RuntimeException(String.format("Can't edit last %s. The list is empty.", "selectors"));
    }
    return this.setNewSelectorLike(index, this.buildSelector(index));
  }
  
  public TolerationsNested<A> editLastToleration() {
    int index = tolerations.size() - 1;
    if (index < 0) {
      throw new RuntimeException(String.format("Can't edit last %s. The list is empty.", "tolerations"));
    }
    return this.setNewTolerationLike(index, this.buildToleration(index));
  }
  
  public SelectorsNested<A> editMatchingSelector(Predicate<V1DeviceSelectorBuilder> predicate) {
    int index = -1;
    for (int i = 0;i < selectors.size();i++) {
      if (predicate.test(selectors.get(i))) {
          index = i;
          break;
      }
    }
    if (index < 0) {
      throw new RuntimeException(String.format("Can't edit matching %s. No match found.", "selectors"));
    }
    return this.setNewSelectorLike(index, this.buildSelector(index));
  }
  
  public TolerationsNested<A> editMatchingToleration(Predicate<V1DeviceTolerationBuilder> predicate) {
    int index = -1;
    for (int i = 0;i < tolerations.size();i++) {
      if (predicate.test(tolerations.get(i))) {
          index = i;
          break;
      }
    }
    if (index < 0) {
      throw new RuntimeException(String.format("Can't edit matching %s. No match found.", "tolerations"));
    }
    return this.setNewTolerationLike(index, this.buildToleration(index));
  }
  
  public CapacityNested<A> editOrNewCapacity() {
    return this.withNewCapacityLike(Optional.ofNullable(this.buildCapacity()).orElse(new V1CapacityRequirementsBuilder().build()));
  }
  
  public CapacityNested<A> editOrNewCapacityLike(V1CapacityRequirements item) {
    return this.withNewCapacityLike(Optional.ofNullable(this.buildCapacity()).orElse(item));
  }
  
  public SelectorsNested<A> editSelector(int index) {
    if (selectors.size() <= index) {
      throw new RuntimeException(String.format("Can't edit %s. Index exceeds size.", "selectors"));
    }
    return this.setNewSelectorLike(index, this.buildSelector(index));
  }
  
  public TolerationsNested<A> editToleration(int index) {
    if (tolerations.size() <= index) {
      throw new RuntimeException(String.format("Can't edit %s. Index exceeds size.", "tolerations"));
    }
    return this.setNewTolerationLike(index, this.buildToleration(index));
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
    V1DeviceSubRequestFluent that = (V1DeviceSubRequestFluent) o;
    if (!(Objects.equals(allocationMode, that.allocationMode))) {
      return false;
    }
    if (!(Objects.equals(capacity, that.capacity))) {
      return false;
    }
    if (!(Objects.equals(count, that.count))) {
      return false;
    }
    if (!(Objects.equals(deviceClassName, that.deviceClassName))) {
      return false;
    }
    if (!(Objects.equals(name, that.name))) {
      return false;
    }
    if (!(Objects.equals(selectors, that.selectors))) {
      return false;
    }
    if (!(Objects.equals(tolerations, that.tolerations))) {
      return false;
    }
    return true;
  }
  
  public String getAllocationMode() {
    return this.allocationMode;
  }
  
  public Long getCount() {
    return this.count;
  }
  
  public String getDeviceClassName() {
    return this.deviceClassName;
  }
  
  public String getName() {
    return this.name;
  }
  
  public boolean hasAllocationMode() {
    return this.allocationMode != null;
  }
  
  public boolean hasCapacity() {
    return this.capacity != null;
  }
  
  public boolean hasCount() {
    return this.count != null;
  }
  
  public boolean hasDeviceClassName() {
    return this.deviceClassName != null;
  }
  
  public boolean hasMatchingSelector(Predicate<V1DeviceSelectorBuilder> predicate) {
      for (V1DeviceSelectorBuilder item : selectors) {
        if (predicate.test(item)) {
          return true;
        }
      }
      return false;
  }
  
  public boolean hasMatchingToleration(Predicate<V1DeviceTolerationBuilder> predicate) {
      for (V1DeviceTolerationBuilder item : tolerations) {
        if (predicate.test(item)) {
          return true;
        }
      }
      return false;
  }
  
  public boolean hasName() {
    return this.name != null;
  }
  
  public boolean hasSelectors() {
    return this.selectors != null && !(this.selectors.isEmpty());
  }
  
  public boolean hasTolerations() {
    return this.tolerations != null && !(this.tolerations.isEmpty());
  }
  
  public int hashCode() {
    return Objects.hash(allocationMode, capacity, count, deviceClassName, name, selectors, tolerations);
  }
  
  public A removeAllFromSelectors(Collection<V1DeviceSelector> items) {
    if (this.selectors == null) {
      return (A) this;
    }
    for (V1DeviceSelector item : items) {
        V1DeviceSelectorBuilder builder = new V1DeviceSelectorBuilder(item);
        _visitables.get("selectors").remove(builder);
        this.selectors.remove(builder);
    }
    return (A) this;
  }
  
  public A removeAllFromTolerations(Collection<V1DeviceToleration> items) {
    if (this.tolerations == null) {
      return (A) this;
    }
    for (V1DeviceToleration item : items) {
        V1DeviceTolerationBuilder builder = new V1DeviceTolerationBuilder(item);
        _visitables.get("tolerations").remove(builder);
        this.tolerations.remove(builder);
    }
    return (A) this;
  }
  
  public A removeFromSelectors(V1DeviceSelector... items) {
    if (this.selectors == null) {
      return (A) this;
    }
    for (V1DeviceSelector item : items) {
        V1DeviceSelectorBuilder builder = new V1DeviceSelectorBuilder(item);
        _visitables.get("selectors").remove(builder);
        this.selectors.remove(builder);
    }
    return (A) this;
  }
  
  public A removeFromTolerations(V1DeviceToleration... items) {
    if (this.tolerations == null) {
      return (A) this;
    }
    for (V1DeviceToleration item : items) {
        V1DeviceTolerationBuilder builder = new V1DeviceTolerationBuilder(item);
        _visitables.get("tolerations").remove(builder);
        this.tolerations.remove(builder);
    }
    return (A) this;
  }
  
  public A removeMatchingFromSelectors(Predicate<V1DeviceSelectorBuilder> predicate) {
    if (selectors == null) {
      return (A) this;
    }
    Iterator<V1DeviceSelectorBuilder> each = selectors.iterator();
    List visitables = _visitables.get("selectors");
    while (each.hasNext()) {
        V1DeviceSelectorBuilder builder = each.next();
        if (predicate.test(builder)) {
            visitables.remove(builder);
            each.remove();
        }
    }
    return (A) this;
  }
  
  public A removeMatchingFromTolerations(Predicate<V1DeviceTolerationBuilder> predicate) {
    if (tolerations == null) {
      return (A) this;
    }
    Iterator<V1DeviceTolerationBuilder> each = tolerations.iterator();
    List visitables = _visitables.get("tolerations");
    while (each.hasNext()) {
        V1DeviceTolerationBuilder builder = each.next();
        if (predicate.test(builder)) {
            visitables.remove(builder);
            each.remove();
        }
    }
    return (A) this;
  }
  
  public SelectorsNested<A> setNewSelectorLike(int index,V1DeviceSelector item) {
    return new SelectorsNested(index, item);
  }
  
  public TolerationsNested<A> setNewTolerationLike(int index,V1DeviceToleration item) {
    return new TolerationsNested(index, item);
  }
  
  public A setToSelectors(int index,V1DeviceSelector item) {
    if (this.selectors == null) {
      this.selectors = new ArrayList();
    }
    V1DeviceSelectorBuilder builder = new V1DeviceSelectorBuilder(item);
    if (index < 0 || index >= selectors.size()) {
        _visitables.get("selectors").add(builder);
        selectors.add(builder);
    } else {
        _visitables.get("selectors").add(builder);
        selectors.set(index, builder);
    }
    return (A) this;
  }
  
  public A setToTolerations(int index,V1DeviceToleration item) {
    if (this.tolerations == null) {
      this.tolerations = new ArrayList();
    }
    V1DeviceTolerationBuilder builder = new V1DeviceTolerationBuilder(item);
    if (index < 0 || index >= tolerations.size()) {
        _visitables.get("tolerations").add(builder);
        tolerations.add(builder);
    } else {
        _visitables.get("tolerations").add(builder);
        tolerations.set(index, builder);
    }
    return (A) this;
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (!(allocationMode == null)) {
        sb.append("allocationMode:");
        sb.append(allocationMode);
        sb.append(",");
    }
    if (!(capacity == null)) {
        sb.append("capacity:");
        sb.append(capacity);
        sb.append(",");
    }
    if (!(count == null)) {
        sb.append("count:");
        sb.append(count);
        sb.append(",");
    }
    if (!(deviceClassName == null)) {
        sb.append("deviceClassName:");
        sb.append(deviceClassName);
        sb.append(",");
    }
    if (!(name == null)) {
        sb.append("name:");
        sb.append(name);
        sb.append(",");
    }
    if (!(selectors == null) && !(selectors.isEmpty())) {
        sb.append("selectors:");
        sb.append(selectors);
        sb.append(",");
    }
    if (!(tolerations == null) && !(tolerations.isEmpty())) {
        sb.append("tolerations:");
        sb.append(tolerations);
    }
    sb.append("}");
    return sb.toString();
  }
  
  public A withAllocationMode(String allocationMode) {
    this.allocationMode = allocationMode;
    return (A) this;
  }
  
  public A withCapacity(V1CapacityRequirements capacity) {
    this._visitables.remove("capacity");
    if (capacity != null) {
        this.capacity = new V1CapacityRequirementsBuilder(capacity);
        this._visitables.get("capacity").add(this.capacity);
    } else {
        this.capacity = null;
        this._visitables.get("capacity").remove(this.capacity);
    }
    return (A) this;
  }
  
  public A withCount(Long count) {
    this.count = count;
    return (A) this;
  }
  
  public A withDeviceClassName(String deviceClassName) {
    this.deviceClassName = deviceClassName;
    return (A) this;
  }
  
  public A withName(String name) {
    this.name = name;
    return (A) this;
  }
  
  public CapacityNested<A> withNewCapacity() {
    return new CapacityNested(null);
  }
  
  public CapacityNested<A> withNewCapacityLike(V1CapacityRequirements item) {
    return new CapacityNested(item);
  }
  
  public A withSelectors(List<V1DeviceSelector> selectors) {
    if (this.selectors != null) {
      this._visitables.get("selectors").clear();
    }
    if (selectors != null) {
        this.selectors = new ArrayList();
        for (V1DeviceSelector item : selectors) {
          this.addToSelectors(item);
        }
    } else {
      this.selectors = null;
    }
    return (A) this;
  }
  
  public A withSelectors(V1DeviceSelector... selectors) {
    if (this.selectors != null) {
        this.selectors.clear();
        _visitables.remove("selectors");
    }
    if (selectors != null) {
      for (V1DeviceSelector item : selectors) {
        this.addToSelectors(item);
      }
    }
    return (A) this;
  }
  
  public A withTolerations(List<V1DeviceToleration> tolerations) {
    if (this.tolerations != null) {
      this._visitables.get("tolerations").clear();
    }
    if (tolerations != null) {
        this.tolerations = new ArrayList();
        for (V1DeviceToleration item : tolerations) {
          this.addToTolerations(item);
        }
    } else {
      this.tolerations = null;
    }
    return (A) this;
  }
  
  public A withTolerations(V1DeviceToleration... tolerations) {
    if (this.tolerations != null) {
        this.tolerations.clear();
        _visitables.remove("tolerations");
    }
    if (tolerations != null) {
      for (V1DeviceToleration item : tolerations) {
        this.addToTolerations(item);
      }
    }
    return (A) this;
  }
  public class CapacityNested<N> extends V1CapacityRequirementsFluent<CapacityNested<N>> implements Nested<N>{
  
    V1CapacityRequirementsBuilder builder;
  
    CapacityNested(V1CapacityRequirements item) {
      this.builder = new V1CapacityRequirementsBuilder(this, item);
    }
  
    public N and() {
      return (N) V1DeviceSubRequestFluent.this.withCapacity(builder.build());
    }
    
    public N endCapacity() {
      return and();
    }
    
  }
  public class SelectorsNested<N> extends V1DeviceSelectorFluent<SelectorsNested<N>> implements Nested<N>{
  
    V1DeviceSelectorBuilder builder;
    int index;
  
    SelectorsNested(int index,V1DeviceSelector item) {
      this.index = index;
      this.builder = new V1DeviceSelectorBuilder(this, item);
    }
  
    public N and() {
      return (N) V1DeviceSubRequestFluent.this.setToSelectors(index, builder.build());
    }
    
    public N endSelector() {
      return and();
    }
    
  }
  public class TolerationsNested<N> extends V1DeviceTolerationFluent<TolerationsNested<N>> implements Nested<N>{
  
    V1DeviceTolerationBuilder builder;
    int index;
  
    TolerationsNested(int index,V1DeviceToleration item) {
      this.index = index;
      this.builder = new V1DeviceTolerationBuilder(this, item);
    }
  
    public N and() {
      return (N) V1DeviceSubRequestFluent.this.setToTolerations(index, builder.build());
    }
    
    public N endToleration() {
      return and();
    }
    
  }
}