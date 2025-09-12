package io.kubernetes.client.openapi.models;

import java.lang.StringBuilder;
import java.lang.SuppressWarnings;
import io.kubernetes.client.fluent.Nested;
import java.util.ArrayList;
import java.lang.String;
import java.util.function.Predicate;
import java.lang.RuntimeException;
import io.kubernetes.client.fluent.BaseFluent;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import java.lang.Long;
import java.util.Objects;
import java.util.Collection;
import java.lang.Object;

/**
 * Generated
 */
@SuppressWarnings("unchecked")
public class V1beta1DeviceSubRequestFluent<A extends io.kubernetes.client.openapi.models.V1beta1DeviceSubRequestFluent<A>> extends BaseFluent<A>{
  public V1beta1DeviceSubRequestFluent() {
  }
  
  public V1beta1DeviceSubRequestFluent(V1beta1DeviceSubRequest instance) {
    this.copyInstance(instance);
  }
  private String allocationMode;
  private V1beta1CapacityRequirementsBuilder capacity;
  private Long count;
  private String deviceClassName;
  private String name;
  private ArrayList<V1beta1DeviceSelectorBuilder> selectors;
  private ArrayList<V1beta1DeviceTolerationBuilder> tolerations;
  
  protected void copyInstance(V1beta1DeviceSubRequest instance) {
    instance = instance != null ? instance : new V1beta1DeviceSubRequest();
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
  
  public V1beta1CapacityRequirements buildCapacity() {
    return this.capacity != null ? this.capacity.build() : null;
  }
  
  public A withCapacity(V1beta1CapacityRequirements capacity) {
    this._visitables.remove("capacity");
    if (capacity != null) {
        this.capacity = new V1beta1CapacityRequirementsBuilder(capacity);
        this._visitables.get("capacity").add(this.capacity);
    } else {
        this.capacity = null;
        this._visitables.get("capacity").remove(this.capacity);
    }
    return (A) this;
  }
  
  public boolean hasCapacity() {
    return this.capacity != null;
  }
  
  public CapacityNested<A> withNewCapacity() {
    return new CapacityNested(null);
  }
  
  public CapacityNested<A> withNewCapacityLike(V1beta1CapacityRequirements item) {
    return new CapacityNested(item);
  }
  
  public CapacityNested<A> editCapacity() {
    return this.withNewCapacityLike(Optional.ofNullable(this.buildCapacity()).orElse(null));
  }
  
  public CapacityNested<A> editOrNewCapacity() {
    return this.withNewCapacityLike(Optional.ofNullable(this.buildCapacity()).orElse(new V1beta1CapacityRequirementsBuilder().build()));
  }
  
  public CapacityNested<A> editOrNewCapacityLike(V1beta1CapacityRequirements item) {
    return this.withNewCapacityLike(Optional.ofNullable(this.buildCapacity()).orElse(item));
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
  
  public A addToSelectors(int index,V1beta1DeviceSelector item) {
    if (this.selectors == null) {
      this.selectors = new ArrayList();
    }
    V1beta1DeviceSelectorBuilder builder = new V1beta1DeviceSelectorBuilder(item);
    if (index < 0 || index >= selectors.size()) {
        _visitables.get("selectors").add(builder);
        selectors.add(builder);
    } else {
        _visitables.get("selectors").add(builder);
        selectors.add(index, builder);
    }
    return (A) this;
  }
  
  public A setToSelectors(int index,V1beta1DeviceSelector item) {
    if (this.selectors == null) {
      this.selectors = new ArrayList();
    }
    V1beta1DeviceSelectorBuilder builder = new V1beta1DeviceSelectorBuilder(item);
    if (index < 0 || index >= selectors.size()) {
        _visitables.get("selectors").add(builder);
        selectors.add(builder);
    } else {
        _visitables.get("selectors").add(builder);
        selectors.set(index, builder);
    }
    return (A) this;
  }
  
  public A addToSelectors(V1beta1DeviceSelector... items) {
    if (this.selectors == null) {
      this.selectors = new ArrayList();
    }
    for (V1beta1DeviceSelector item : items) {
        V1beta1DeviceSelectorBuilder builder = new V1beta1DeviceSelectorBuilder(item);
        _visitables.get("selectors").add(builder);
        this.selectors.add(builder);
    }
    return (A) this;
  }
  
  public A addAllToSelectors(Collection<V1beta1DeviceSelector> items) {
    if (this.selectors == null) {
      this.selectors = new ArrayList();
    }
    for (V1beta1DeviceSelector item : items) {
        V1beta1DeviceSelectorBuilder builder = new V1beta1DeviceSelectorBuilder(item);
        _visitables.get("selectors").add(builder);
        this.selectors.add(builder);
    }
    return (A) this;
  }
  
  public A removeFromSelectors(V1beta1DeviceSelector... items) {
    if (this.selectors == null) {
      return (A) this;
    }
    for (V1beta1DeviceSelector item : items) {
        V1beta1DeviceSelectorBuilder builder = new V1beta1DeviceSelectorBuilder(item);
        _visitables.get("selectors").remove(builder);
        this.selectors.remove(builder);
    }
    return (A) this;
  }
  
  public A removeAllFromSelectors(Collection<V1beta1DeviceSelector> items) {
    if (this.selectors == null) {
      return (A) this;
    }
    for (V1beta1DeviceSelector item : items) {
        V1beta1DeviceSelectorBuilder builder = new V1beta1DeviceSelectorBuilder(item);
        _visitables.get("selectors").remove(builder);
        this.selectors.remove(builder);
    }
    return (A) this;
  }
  
  public A removeMatchingFromSelectors(Predicate<V1beta1DeviceSelectorBuilder> predicate) {
    if (selectors == null) {
      return (A) this;
    }
    Iterator<V1beta1DeviceSelectorBuilder> each = selectors.iterator();
    List visitables = _visitables.get("selectors");
    while (each.hasNext()) {
        V1beta1DeviceSelectorBuilder builder = each.next();
        if (predicate.test(builder)) {
            visitables.remove(builder);
            each.remove();
        }
    }
    return (A) this;
  }
  
  public List<V1beta1DeviceSelector> buildSelectors() {
    return this.selectors != null ? build(selectors) : null;
  }
  
  public V1beta1DeviceSelector buildSelector(int index) {
    return this.selectors.get(index).build();
  }
  
  public V1beta1DeviceSelector buildFirstSelector() {
    return this.selectors.get(0).build();
  }
  
  public V1beta1DeviceSelector buildLastSelector() {
    return this.selectors.get(selectors.size() - 1).build();
  }
  
  public V1beta1DeviceSelector buildMatchingSelector(Predicate<V1beta1DeviceSelectorBuilder> predicate) {
      for (V1beta1DeviceSelectorBuilder item : selectors) {
        if (predicate.test(item)) {
          return item.build();
        }
      }
      return null;
  }
  
  public boolean hasMatchingSelector(Predicate<V1beta1DeviceSelectorBuilder> predicate) {
      for (V1beta1DeviceSelectorBuilder item : selectors) {
        if (predicate.test(item)) {
          return true;
        }
      }
      return false;
  }
  
  public A withSelectors(List<V1beta1DeviceSelector> selectors) {
    if (this.selectors != null) {
      this._visitables.get("selectors").clear();
    }
    if (selectors != null) {
        this.selectors = new ArrayList();
        for (V1beta1DeviceSelector item : selectors) {
          this.addToSelectors(item);
        }
    } else {
      this.selectors = null;
    }
    return (A) this;
  }
  
  public A withSelectors(V1beta1DeviceSelector... selectors) {
    if (this.selectors != null) {
        this.selectors.clear();
        _visitables.remove("selectors");
    }
    if (selectors != null) {
      for (V1beta1DeviceSelector item : selectors) {
        this.addToSelectors(item);
      }
    }
    return (A) this;
  }
  
  public boolean hasSelectors() {
    return this.selectors != null && !(this.selectors.isEmpty());
  }
  
  public SelectorsNested<A> addNewSelector() {
    return new SelectorsNested(-1, null);
  }
  
  public SelectorsNested<A> addNewSelectorLike(V1beta1DeviceSelector item) {
    return new SelectorsNested(-1, item);
  }
  
  public SelectorsNested<A> setNewSelectorLike(int index,V1beta1DeviceSelector item) {
    return new SelectorsNested(index, item);
  }
  
  public SelectorsNested<A> editSelector(int index) {
    if (index <= selectors.size()) {
      throw new RuntimeException(String.format("Can't edit %s. Index exceeds size.", "selectors"));
    }
    return this.setNewSelectorLike(index, this.buildSelector(index));
  }
  
  public SelectorsNested<A> editFirstSelector() {
    if (selectors.size() == 0) {
      throw new RuntimeException(String.format("Can't edit first %s. The list is empty.", "selectors"));
    }
    return this.setNewSelectorLike(0, this.buildSelector(0));
  }
  
  public SelectorsNested<A> editLastSelector() {
    int index = selectors.size() - 1;
    if (index < 0) {
      throw new RuntimeException(String.format("Can't edit last %s. The list is empty.", "selectors"));
    }
    return this.setNewSelectorLike(index, this.buildSelector(index));
  }
  
  public SelectorsNested<A> editMatchingSelector(Predicate<V1beta1DeviceSelectorBuilder> predicate) {
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
  
  public A addToTolerations(int index,V1beta1DeviceToleration item) {
    if (this.tolerations == null) {
      this.tolerations = new ArrayList();
    }
    V1beta1DeviceTolerationBuilder builder = new V1beta1DeviceTolerationBuilder(item);
    if (index < 0 || index >= tolerations.size()) {
        _visitables.get("tolerations").add(builder);
        tolerations.add(builder);
    } else {
        _visitables.get("tolerations").add(builder);
        tolerations.add(index, builder);
    }
    return (A) this;
  }
  
  public A setToTolerations(int index,V1beta1DeviceToleration item) {
    if (this.tolerations == null) {
      this.tolerations = new ArrayList();
    }
    V1beta1DeviceTolerationBuilder builder = new V1beta1DeviceTolerationBuilder(item);
    if (index < 0 || index >= tolerations.size()) {
        _visitables.get("tolerations").add(builder);
        tolerations.add(builder);
    } else {
        _visitables.get("tolerations").add(builder);
        tolerations.set(index, builder);
    }
    return (A) this;
  }
  
  public A addToTolerations(V1beta1DeviceToleration... items) {
    if (this.tolerations == null) {
      this.tolerations = new ArrayList();
    }
    for (V1beta1DeviceToleration item : items) {
        V1beta1DeviceTolerationBuilder builder = new V1beta1DeviceTolerationBuilder(item);
        _visitables.get("tolerations").add(builder);
        this.tolerations.add(builder);
    }
    return (A) this;
  }
  
  public A addAllToTolerations(Collection<V1beta1DeviceToleration> items) {
    if (this.tolerations == null) {
      this.tolerations = new ArrayList();
    }
    for (V1beta1DeviceToleration item : items) {
        V1beta1DeviceTolerationBuilder builder = new V1beta1DeviceTolerationBuilder(item);
        _visitables.get("tolerations").add(builder);
        this.tolerations.add(builder);
    }
    return (A) this;
  }
  
  public A removeFromTolerations(V1beta1DeviceToleration... items) {
    if (this.tolerations == null) {
      return (A) this;
    }
    for (V1beta1DeviceToleration item : items) {
        V1beta1DeviceTolerationBuilder builder = new V1beta1DeviceTolerationBuilder(item);
        _visitables.get("tolerations").remove(builder);
        this.tolerations.remove(builder);
    }
    return (A) this;
  }
  
  public A removeAllFromTolerations(Collection<V1beta1DeviceToleration> items) {
    if (this.tolerations == null) {
      return (A) this;
    }
    for (V1beta1DeviceToleration item : items) {
        V1beta1DeviceTolerationBuilder builder = new V1beta1DeviceTolerationBuilder(item);
        _visitables.get("tolerations").remove(builder);
        this.tolerations.remove(builder);
    }
    return (A) this;
  }
  
  public A removeMatchingFromTolerations(Predicate<V1beta1DeviceTolerationBuilder> predicate) {
    if (tolerations == null) {
      return (A) this;
    }
    Iterator<V1beta1DeviceTolerationBuilder> each = tolerations.iterator();
    List visitables = _visitables.get("tolerations");
    while (each.hasNext()) {
        V1beta1DeviceTolerationBuilder builder = each.next();
        if (predicate.test(builder)) {
            visitables.remove(builder);
            each.remove();
        }
    }
    return (A) this;
  }
  
  public List<V1beta1DeviceToleration> buildTolerations() {
    return this.tolerations != null ? build(tolerations) : null;
  }
  
  public V1beta1DeviceToleration buildToleration(int index) {
    return this.tolerations.get(index).build();
  }
  
  public V1beta1DeviceToleration buildFirstToleration() {
    return this.tolerations.get(0).build();
  }
  
  public V1beta1DeviceToleration buildLastToleration() {
    return this.tolerations.get(tolerations.size() - 1).build();
  }
  
  public V1beta1DeviceToleration buildMatchingToleration(Predicate<V1beta1DeviceTolerationBuilder> predicate) {
      for (V1beta1DeviceTolerationBuilder item : tolerations) {
        if (predicate.test(item)) {
          return item.build();
        }
      }
      return null;
  }
  
  public boolean hasMatchingToleration(Predicate<V1beta1DeviceTolerationBuilder> predicate) {
      for (V1beta1DeviceTolerationBuilder item : tolerations) {
        if (predicate.test(item)) {
          return true;
        }
      }
      return false;
  }
  
  public A withTolerations(List<V1beta1DeviceToleration> tolerations) {
    if (this.tolerations != null) {
      this._visitables.get("tolerations").clear();
    }
    if (tolerations != null) {
        this.tolerations = new ArrayList();
        for (V1beta1DeviceToleration item : tolerations) {
          this.addToTolerations(item);
        }
    } else {
      this.tolerations = null;
    }
    return (A) this;
  }
  
  public A withTolerations(V1beta1DeviceToleration... tolerations) {
    if (this.tolerations != null) {
        this.tolerations.clear();
        _visitables.remove("tolerations");
    }
    if (tolerations != null) {
      for (V1beta1DeviceToleration item : tolerations) {
        this.addToTolerations(item);
      }
    }
    return (A) this;
  }
  
  public boolean hasTolerations() {
    return this.tolerations != null && !(this.tolerations.isEmpty());
  }
  
  public TolerationsNested<A> addNewToleration() {
    return new TolerationsNested(-1, null);
  }
  
  public TolerationsNested<A> addNewTolerationLike(V1beta1DeviceToleration item) {
    return new TolerationsNested(-1, item);
  }
  
  public TolerationsNested<A> setNewTolerationLike(int index,V1beta1DeviceToleration item) {
    return new TolerationsNested(index, item);
  }
  
  public TolerationsNested<A> editToleration(int index) {
    if (index <= tolerations.size()) {
      throw new RuntimeException(String.format("Can't edit %s. Index exceeds size.", "tolerations"));
    }
    return this.setNewTolerationLike(index, this.buildToleration(index));
  }
  
  public TolerationsNested<A> editFirstToleration() {
    if (tolerations.size() == 0) {
      throw new RuntimeException(String.format("Can't edit first %s. The list is empty.", "tolerations"));
    }
    return this.setNewTolerationLike(0, this.buildToleration(0));
  }
  
  public TolerationsNested<A> editLastToleration() {
    int index = tolerations.size() - 1;
    if (index < 0) {
      throw new RuntimeException(String.format("Can't edit last %s. The list is empty.", "tolerations"));
    }
    return this.setNewTolerationLike(index, this.buildToleration(index));
  }
  
  public TolerationsNested<A> editMatchingToleration(Predicate<V1beta1DeviceTolerationBuilder> predicate) {
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
    V1beta1DeviceSubRequestFluent that = (V1beta1DeviceSubRequestFluent) o;
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
  
  public int hashCode() {
    return Objects.hash(allocationMode, capacity, count, deviceClassName, name, selectors, tolerations);
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
  public class CapacityNested<N> extends V1beta1CapacityRequirementsFluent<CapacityNested<N>> implements Nested<N>{
    CapacityNested(V1beta1CapacityRequirements item) {
      this.builder = new V1beta1CapacityRequirementsBuilder(this, item);
    }
    V1beta1CapacityRequirementsBuilder builder;
    
    public N and() {
      return (N) V1beta1DeviceSubRequestFluent.this.withCapacity(builder.build());
    }
    
    public N endCapacity() {
      return and();
    }
    
  
  }
  public class SelectorsNested<N> extends V1beta1DeviceSelectorFluent<SelectorsNested<N>> implements Nested<N>{
    SelectorsNested(int index,V1beta1DeviceSelector item) {
      this.index = index;
      this.builder = new V1beta1DeviceSelectorBuilder(this, item);
    }
    V1beta1DeviceSelectorBuilder builder;
    int index;
    
    public N and() {
      return (N) V1beta1DeviceSubRequestFluent.this.setToSelectors(index, builder.build());
    }
    
    public N endSelector() {
      return and();
    }
    
  
  }
  public class TolerationsNested<N> extends V1beta1DeviceTolerationFluent<TolerationsNested<N>> implements Nested<N>{
    TolerationsNested(int index,V1beta1DeviceToleration item) {
      this.index = index;
      this.builder = new V1beta1DeviceTolerationBuilder(this, item);
    }
    V1beta1DeviceTolerationBuilder builder;
    int index;
    
    public N and() {
      return (N) V1beta1DeviceSubRequestFluent.this.setToTolerations(index, builder.build());
    }
    
    public N endToleration() {
      return and();
    }
    
  
  }

}