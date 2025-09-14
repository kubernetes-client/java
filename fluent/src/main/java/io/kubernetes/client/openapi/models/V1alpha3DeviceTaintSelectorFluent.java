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
import java.util.Objects;
import java.util.Collection;
import java.lang.Object;
import java.util.List;

/**
 * Generated
 */
@SuppressWarnings("unchecked")
public class V1alpha3DeviceTaintSelectorFluent<A extends io.kubernetes.client.openapi.models.V1alpha3DeviceTaintSelectorFluent<A>> extends BaseFluent<A>{
  public V1alpha3DeviceTaintSelectorFluent() {
  }
  
  public V1alpha3DeviceTaintSelectorFluent(V1alpha3DeviceTaintSelector instance) {
    this.copyInstance(instance);
  }
  private String device;
  private String deviceClassName;
  private String driver;
  private String pool;
  private ArrayList<V1alpha3DeviceSelectorBuilder> selectors;
  
  protected void copyInstance(V1alpha3DeviceTaintSelector instance) {
    instance = instance != null ? instance : new V1alpha3DeviceTaintSelector();
    if (instance != null) {
        this.withDevice(instance.getDevice());
        this.withDeviceClassName(instance.getDeviceClassName());
        this.withDriver(instance.getDriver());
        this.withPool(instance.getPool());
        this.withSelectors(instance.getSelectors());
    }
  }
  
  public String getDevice() {
    return this.device;
  }
  
  public A withDevice(String device) {
    this.device = device;
    return (A) this;
  }
  
  public boolean hasDevice() {
    return this.device != null;
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
  
  public String getDriver() {
    return this.driver;
  }
  
  public A withDriver(String driver) {
    this.driver = driver;
    return (A) this;
  }
  
  public boolean hasDriver() {
    return this.driver != null;
  }
  
  public String getPool() {
    return this.pool;
  }
  
  public A withPool(String pool) {
    this.pool = pool;
    return (A) this;
  }
  
  public boolean hasPool() {
    return this.pool != null;
  }
  
  public A addToSelectors(int index,V1alpha3DeviceSelector item) {
    if (this.selectors == null) {
      this.selectors = new ArrayList();
    }
    V1alpha3DeviceSelectorBuilder builder = new V1alpha3DeviceSelectorBuilder(item);
    if (index < 0 || index >= selectors.size()) {
        _visitables.get("selectors").add(builder);
        selectors.add(builder);
    } else {
        _visitables.get("selectors").add(builder);
        selectors.add(index, builder);
    }
    return (A) this;
  }
  
  public A setToSelectors(int index,V1alpha3DeviceSelector item) {
    if (this.selectors == null) {
      this.selectors = new ArrayList();
    }
    V1alpha3DeviceSelectorBuilder builder = new V1alpha3DeviceSelectorBuilder(item);
    if (index < 0 || index >= selectors.size()) {
        _visitables.get("selectors").add(builder);
        selectors.add(builder);
    } else {
        _visitables.get("selectors").add(builder);
        selectors.set(index, builder);
    }
    return (A) this;
  }
  
  public A addToSelectors(V1alpha3DeviceSelector... items) {
    if (this.selectors == null) {
      this.selectors = new ArrayList();
    }
    for (V1alpha3DeviceSelector item : items) {
        V1alpha3DeviceSelectorBuilder builder = new V1alpha3DeviceSelectorBuilder(item);
        _visitables.get("selectors").add(builder);
        this.selectors.add(builder);
    }
    return (A) this;
  }
  
  public A addAllToSelectors(Collection<V1alpha3DeviceSelector> items) {
    if (this.selectors == null) {
      this.selectors = new ArrayList();
    }
    for (V1alpha3DeviceSelector item : items) {
        V1alpha3DeviceSelectorBuilder builder = new V1alpha3DeviceSelectorBuilder(item);
        _visitables.get("selectors").add(builder);
        this.selectors.add(builder);
    }
    return (A) this;
  }
  
  public A removeFromSelectors(V1alpha3DeviceSelector... items) {
    if (this.selectors == null) {
      return (A) this;
    }
    for (V1alpha3DeviceSelector item : items) {
        V1alpha3DeviceSelectorBuilder builder = new V1alpha3DeviceSelectorBuilder(item);
        _visitables.get("selectors").remove(builder);
        this.selectors.remove(builder);
    }
    return (A) this;
  }
  
  public A removeAllFromSelectors(Collection<V1alpha3DeviceSelector> items) {
    if (this.selectors == null) {
      return (A) this;
    }
    for (V1alpha3DeviceSelector item : items) {
        V1alpha3DeviceSelectorBuilder builder = new V1alpha3DeviceSelectorBuilder(item);
        _visitables.get("selectors").remove(builder);
        this.selectors.remove(builder);
    }
    return (A) this;
  }
  
  public A removeMatchingFromSelectors(Predicate<V1alpha3DeviceSelectorBuilder> predicate) {
    if (selectors == null) {
      return (A) this;
    }
    Iterator<V1alpha3DeviceSelectorBuilder> each = selectors.iterator();
    List visitables = _visitables.get("selectors");
    while (each.hasNext()) {
        V1alpha3DeviceSelectorBuilder builder = each.next();
        if (predicate.test(builder)) {
            visitables.remove(builder);
            each.remove();
        }
    }
    return (A) this;
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
  
  public A withSelectors(V1alpha3DeviceSelector... selectors) {
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
    return this.selectors != null && !(this.selectors.isEmpty());
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
  
  public SelectorsNested<A> editMatchingSelector(Predicate<V1alpha3DeviceSelectorBuilder> predicate) {
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
    V1alpha3DeviceTaintSelectorFluent that = (V1alpha3DeviceTaintSelectorFluent) o;
    if (!(Objects.equals(device, that.device))) {
      return false;
    }
    if (!(Objects.equals(deviceClassName, that.deviceClassName))) {
      return false;
    }
    if (!(Objects.equals(driver, that.driver))) {
      return false;
    }
    if (!(Objects.equals(pool, that.pool))) {
      return false;
    }
    if (!(Objects.equals(selectors, that.selectors))) {
      return false;
    }
    return true;
  }
  
  public int hashCode() {
    return Objects.hash(device, deviceClassName, driver, pool, selectors);
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (!(device == null)) {
        sb.append("device:");
        sb.append(device);
        sb.append(",");
    }
    if (!(deviceClassName == null)) {
        sb.append("deviceClassName:");
        sb.append(deviceClassName);
        sb.append(",");
    }
    if (!(driver == null)) {
        sb.append("driver:");
        sb.append(driver);
        sb.append(",");
    }
    if (!(pool == null)) {
        sb.append("pool:");
        sb.append(pool);
        sb.append(",");
    }
    if (!(selectors == null) && !(selectors.isEmpty())) {
        sb.append("selectors:");
        sb.append(selectors);
    }
    sb.append("}");
    return sb.toString();
  }
  public class SelectorsNested<N> extends V1alpha3DeviceSelectorFluent<SelectorsNested<N>> implements Nested<N>{
    SelectorsNested(int index,V1alpha3DeviceSelector item) {
      this.index = index;
      this.builder = new V1alpha3DeviceSelectorBuilder(this, item);
    }
    V1alpha3DeviceSelectorBuilder builder;
    int index;
    
    public N and() {
      return (N) V1alpha3DeviceTaintSelectorFluent.this.setToSelectors(index, builder.build());
    }
    
    public N endSelector() {
      return and();
    }
    
  
  }

}