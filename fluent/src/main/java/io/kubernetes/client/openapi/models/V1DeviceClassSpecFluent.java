package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.BaseFluent;
import io.kubernetes.client.fluent.Nested;
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
import java.util.function.Predicate;

/**
 * Generated
 */
@SuppressWarnings("unchecked")
public class V1DeviceClassSpecFluent<A extends io.kubernetes.client.openapi.models.V1DeviceClassSpecFluent<A>> extends BaseFluent<A>{

  private ArrayList<V1DeviceClassConfigurationBuilder> config;
  private String extendedResourceName;
  private ArrayList<V1DeviceSelectorBuilder> selectors;

  public V1DeviceClassSpecFluent() {
  }
  
  public V1DeviceClassSpecFluent(V1DeviceClassSpec instance) {
    this.copyInstance(instance);
  }

  public A addAllToConfig(Collection<V1DeviceClassConfiguration> items) {
    if (this.config == null) {
      this.config = new ArrayList();
    }
    for (V1DeviceClassConfiguration item : items) {
        V1DeviceClassConfigurationBuilder builder = new V1DeviceClassConfigurationBuilder(item);
        _visitables.get("config").add(builder);
        this.config.add(builder);
    }
    return (A) this;
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
  
  public ConfigNested<A> addNewConfig() {
    return new ConfigNested(-1, null);
  }
  
  public ConfigNested<A> addNewConfigLike(V1DeviceClassConfiguration item) {
    return new ConfigNested(-1, item);
  }
  
  public SelectorsNested<A> addNewSelector() {
    return new SelectorsNested(-1, null);
  }
  
  public SelectorsNested<A> addNewSelectorLike(V1DeviceSelector item) {
    return new SelectorsNested(-1, item);
  }
  
  public A addToConfig(V1DeviceClassConfiguration... items) {
    if (this.config == null) {
      this.config = new ArrayList();
    }
    for (V1DeviceClassConfiguration item : items) {
        V1DeviceClassConfigurationBuilder builder = new V1DeviceClassConfigurationBuilder(item);
        _visitables.get("config").add(builder);
        this.config.add(builder);
    }
    return (A) this;
  }
  
  public A addToConfig(int index,V1DeviceClassConfiguration item) {
    if (this.config == null) {
      this.config = new ArrayList();
    }
    V1DeviceClassConfigurationBuilder builder = new V1DeviceClassConfigurationBuilder(item);
    if (index < 0 || index >= config.size()) {
        _visitables.get("config").add(builder);
        config.add(builder);
    } else {
        _visitables.get("config").add(builder);
        config.add(index, builder);
    }
    return (A) this;
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
  
  public List<V1DeviceClassConfiguration> buildConfig() {
    return this.config != null ? build(config) : null;
  }
  
  public V1DeviceClassConfiguration buildConfig(int index) {
    return this.config.get(index).build();
  }
  
  public V1DeviceClassConfiguration buildFirstConfig() {
    return this.config.get(0).build();
  }
  
  public V1DeviceSelector buildFirstSelector() {
    return this.selectors.get(0).build();
  }
  
  public V1DeviceClassConfiguration buildLastConfig() {
    return this.config.get(config.size() - 1).build();
  }
  
  public V1DeviceSelector buildLastSelector() {
    return this.selectors.get(selectors.size() - 1).build();
  }
  
  public V1DeviceClassConfiguration buildMatchingConfig(Predicate<V1DeviceClassConfigurationBuilder> predicate) {
      for (V1DeviceClassConfigurationBuilder item : config) {
        if (predicate.test(item)) {
          return item.build();
        }
      }
      return null;
  }
  
  public V1DeviceSelector buildMatchingSelector(Predicate<V1DeviceSelectorBuilder> predicate) {
      for (V1DeviceSelectorBuilder item : selectors) {
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
  
  protected void copyInstance(V1DeviceClassSpec instance) {
    instance = instance != null ? instance : new V1DeviceClassSpec();
    if (instance != null) {
        this.withConfig(instance.getConfig());
        this.withExtendedResourceName(instance.getExtendedResourceName());
        this.withSelectors(instance.getSelectors());
    }
  }
  
  public ConfigNested<A> editConfig(int index) {
    if (config.size() <= index) {
      throw new RuntimeException(String.format("Can't edit %s. Index exceeds size.", "config"));
    }
    return this.setNewConfigLike(index, this.buildConfig(index));
  }
  
  public ConfigNested<A> editFirstConfig() {
    if (config.size() == 0) {
      throw new RuntimeException(String.format("Can't edit first %s. The list is empty.", "config"));
    }
    return this.setNewConfigLike(0, this.buildConfig(0));
  }
  
  public SelectorsNested<A> editFirstSelector() {
    if (selectors.size() == 0) {
      throw new RuntimeException(String.format("Can't edit first %s. The list is empty.", "selectors"));
    }
    return this.setNewSelectorLike(0, this.buildSelector(0));
  }
  
  public ConfigNested<A> editLastConfig() {
    int index = config.size() - 1;
    if (index < 0) {
      throw new RuntimeException(String.format("Can't edit last %s. The list is empty.", "config"));
    }
    return this.setNewConfigLike(index, this.buildConfig(index));
  }
  
  public SelectorsNested<A> editLastSelector() {
    int index = selectors.size() - 1;
    if (index < 0) {
      throw new RuntimeException(String.format("Can't edit last %s. The list is empty.", "selectors"));
    }
    return this.setNewSelectorLike(index, this.buildSelector(index));
  }
  
  public ConfigNested<A> editMatchingConfig(Predicate<V1DeviceClassConfigurationBuilder> predicate) {
    int index = -1;
    for (int i = 0;i < config.size();i++) {
      if (predicate.test(config.get(i))) {
          index = i;
          break;
      }
    }
    if (index < 0) {
      throw new RuntimeException(String.format("Can't edit matching %s. No match found.", "config"));
    }
    return this.setNewConfigLike(index, this.buildConfig(index));
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
  
  public SelectorsNested<A> editSelector(int index) {
    if (selectors.size() <= index) {
      throw new RuntimeException(String.format("Can't edit %s. Index exceeds size.", "selectors"));
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
    V1DeviceClassSpecFluent that = (V1DeviceClassSpecFluent) o;
    if (!(Objects.equals(config, that.config))) {
      return false;
    }
    if (!(Objects.equals(extendedResourceName, that.extendedResourceName))) {
      return false;
    }
    if (!(Objects.equals(selectors, that.selectors))) {
      return false;
    }
    return true;
  }
  
  public String getExtendedResourceName() {
    return this.extendedResourceName;
  }
  
  public boolean hasConfig() {
    return this.config != null && !(this.config.isEmpty());
  }
  
  public boolean hasExtendedResourceName() {
    return this.extendedResourceName != null;
  }
  
  public boolean hasMatchingConfig(Predicate<V1DeviceClassConfigurationBuilder> predicate) {
      for (V1DeviceClassConfigurationBuilder item : config) {
        if (predicate.test(item)) {
          return true;
        }
      }
      return false;
  }
  
  public boolean hasMatchingSelector(Predicate<V1DeviceSelectorBuilder> predicate) {
      for (V1DeviceSelectorBuilder item : selectors) {
        if (predicate.test(item)) {
          return true;
        }
      }
      return false;
  }
  
  public boolean hasSelectors() {
    return this.selectors != null && !(this.selectors.isEmpty());
  }
  
  public int hashCode() {
    return Objects.hash(config, extendedResourceName, selectors);
  }
  
  public A removeAllFromConfig(Collection<V1DeviceClassConfiguration> items) {
    if (this.config == null) {
      return (A) this;
    }
    for (V1DeviceClassConfiguration item : items) {
        V1DeviceClassConfigurationBuilder builder = new V1DeviceClassConfigurationBuilder(item);
        _visitables.get("config").remove(builder);
        this.config.remove(builder);
    }
    return (A) this;
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
  
  public A removeFromConfig(V1DeviceClassConfiguration... items) {
    if (this.config == null) {
      return (A) this;
    }
    for (V1DeviceClassConfiguration item : items) {
        V1DeviceClassConfigurationBuilder builder = new V1DeviceClassConfigurationBuilder(item);
        _visitables.get("config").remove(builder);
        this.config.remove(builder);
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
  
  public A removeMatchingFromConfig(Predicate<V1DeviceClassConfigurationBuilder> predicate) {
    if (config == null) {
      return (A) this;
    }
    Iterator<V1DeviceClassConfigurationBuilder> each = config.iterator();
    List visitables = _visitables.get("config");
    while (each.hasNext()) {
        V1DeviceClassConfigurationBuilder builder = each.next();
        if (predicate.test(builder)) {
            visitables.remove(builder);
            each.remove();
        }
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
  
  public ConfigNested<A> setNewConfigLike(int index,V1DeviceClassConfiguration item) {
    return new ConfigNested(index, item);
  }
  
  public SelectorsNested<A> setNewSelectorLike(int index,V1DeviceSelector item) {
    return new SelectorsNested(index, item);
  }
  
  public A setToConfig(int index,V1DeviceClassConfiguration item) {
    if (this.config == null) {
      this.config = new ArrayList();
    }
    V1DeviceClassConfigurationBuilder builder = new V1DeviceClassConfigurationBuilder(item);
    if (index < 0 || index >= config.size()) {
        _visitables.get("config").add(builder);
        config.add(builder);
    } else {
        _visitables.get("config").add(builder);
        config.set(index, builder);
    }
    return (A) this;
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
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (!(config == null) && !(config.isEmpty())) {
        sb.append("config:");
        sb.append(config);
        sb.append(",");
    }
    if (!(extendedResourceName == null)) {
        sb.append("extendedResourceName:");
        sb.append(extendedResourceName);
        sb.append(",");
    }
    if (!(selectors == null) && !(selectors.isEmpty())) {
        sb.append("selectors:");
        sb.append(selectors);
    }
    sb.append("}");
    return sb.toString();
  }
  
  public A withConfig(List<V1DeviceClassConfiguration> config) {
    if (this.config != null) {
      this._visitables.get("config").clear();
    }
    if (config != null) {
        this.config = new ArrayList();
        for (V1DeviceClassConfiguration item : config) {
          this.addToConfig(item);
        }
    } else {
      this.config = null;
    }
    return (A) this;
  }
  
  public A withConfig(V1DeviceClassConfiguration... config) {
    if (this.config != null) {
        this.config.clear();
        _visitables.remove("config");
    }
    if (config != null) {
      for (V1DeviceClassConfiguration item : config) {
        this.addToConfig(item);
      }
    }
    return (A) this;
  }
  
  public A withExtendedResourceName(String extendedResourceName) {
    this.extendedResourceName = extendedResourceName;
    return (A) this;
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
  public class ConfigNested<N> extends V1DeviceClassConfigurationFluent<ConfigNested<N>> implements Nested<N>{
  
    V1DeviceClassConfigurationBuilder builder;
    int index;
  
    ConfigNested(int index,V1DeviceClassConfiguration item) {
      this.index = index;
      this.builder = new V1DeviceClassConfigurationBuilder(this, item);
    }
  
    public N and() {
      return (N) V1DeviceClassSpecFluent.this.setToConfig(index, builder.build());
    }
    
    public N endConfig() {
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
      return (N) V1DeviceClassSpecFluent.this.setToSelectors(index, builder.build());
    }
    
    public N endSelector() {
      return and();
    }
    
  }
}