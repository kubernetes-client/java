package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.SuppressWarnings;
import io.kubernetes.client.fluent.Nested;
import java.util.ArrayList;
import java.lang.String;
import java.util.function.Predicate;
import io.kubernetes.client.fluent.BaseFluent;
import java.util.Iterator;
import java.util.Collection;
import java.lang.Object;
import java.util.List;

/**
 * Generated
 */
@SuppressWarnings("unchecked")
public class V1beta2DeviceClassSpecFluent<A extends V1beta2DeviceClassSpecFluent<A>> extends BaseFluent<A>{
  public V1beta2DeviceClassSpecFluent() {
  }
  
  public V1beta2DeviceClassSpecFluent(V1beta2DeviceClassSpec instance) {
    this.copyInstance(instance);
  }
  private ArrayList<V1beta2DeviceClassConfigurationBuilder> config;
  private ArrayList<V1beta2DeviceSelectorBuilder> selectors;
  
  protected void copyInstance(V1beta2DeviceClassSpec instance) {
    instance = (instance != null ? instance : new V1beta2DeviceClassSpec());
    if (instance != null) {
          this.withConfig(instance.getConfig());
          this.withSelectors(instance.getSelectors());
        }
  }
  
  public A addToConfig(int index,V1beta2DeviceClassConfiguration item) {
    if (this.config == null) {this.config = new ArrayList<V1beta2DeviceClassConfigurationBuilder>();}
    V1beta2DeviceClassConfigurationBuilder builder = new V1beta2DeviceClassConfigurationBuilder(item);
    if (index < 0 || index >= config.size()) {
        _visitables.get("config").add(builder);
        config.add(builder);
    } else {
        _visitables.get("config").add(builder);
        config.add(index, builder);
    }
    return (A)this;
  }
  
  public A setToConfig(int index,V1beta2DeviceClassConfiguration item) {
    if (this.config == null) {this.config = new ArrayList<V1beta2DeviceClassConfigurationBuilder>();}
    V1beta2DeviceClassConfigurationBuilder builder = new V1beta2DeviceClassConfigurationBuilder(item);
    if (index < 0 || index >= config.size()) {
        _visitables.get("config").add(builder);
        config.add(builder);
    } else {
        _visitables.get("config").add(builder);
        config.set(index, builder);
    }
    return (A)this;
  }
  
  public A addToConfig(io.kubernetes.client.openapi.models.V1beta2DeviceClassConfiguration... items) {
    if (this.config == null) {this.config = new ArrayList<V1beta2DeviceClassConfigurationBuilder>();}
    for (V1beta2DeviceClassConfiguration item : items) {V1beta2DeviceClassConfigurationBuilder builder = new V1beta2DeviceClassConfigurationBuilder(item);_visitables.get("config").add(builder);this.config.add(builder);} return (A)this;
  }
  
  public A addAllToConfig(Collection<V1beta2DeviceClassConfiguration> items) {
    if (this.config == null) {this.config = new ArrayList<V1beta2DeviceClassConfigurationBuilder>();}
    for (V1beta2DeviceClassConfiguration item : items) {V1beta2DeviceClassConfigurationBuilder builder = new V1beta2DeviceClassConfigurationBuilder(item);_visitables.get("config").add(builder);this.config.add(builder);} return (A)this;
  }
  
  public A removeFromConfig(io.kubernetes.client.openapi.models.V1beta2DeviceClassConfiguration... items) {
    if (this.config == null) return (A)this;
    for (V1beta2DeviceClassConfiguration item : items) {V1beta2DeviceClassConfigurationBuilder builder = new V1beta2DeviceClassConfigurationBuilder(item);_visitables.get("config").remove(builder); this.config.remove(builder);} return (A)this;
  }
  
  public A removeAllFromConfig(Collection<V1beta2DeviceClassConfiguration> items) {
    if (this.config == null) return (A)this;
    for (V1beta2DeviceClassConfiguration item : items) {V1beta2DeviceClassConfigurationBuilder builder = new V1beta2DeviceClassConfigurationBuilder(item);_visitables.get("config").remove(builder); this.config.remove(builder);} return (A)this;
  }
  
  public A removeMatchingFromConfig(Predicate<V1beta2DeviceClassConfigurationBuilder> predicate) {
    if (config == null) return (A) this;
    final Iterator<V1beta2DeviceClassConfigurationBuilder> each = config.iterator();
    final List visitables = _visitables.get("config");
    while (each.hasNext()) {
      V1beta2DeviceClassConfigurationBuilder builder = each.next();
      if (predicate.test(builder)) {
        visitables.remove(builder);
        each.remove();
      }
    }
    return (A)this;
  }
  
  public List<V1beta2DeviceClassConfiguration> buildConfig() {
    return this.config != null ? build(config) : null;
  }
  
  public V1beta2DeviceClassConfiguration buildConfig(int index) {
    return this.config.get(index).build();
  }
  
  public V1beta2DeviceClassConfiguration buildFirstConfig() {
    return this.config.get(0).build();
  }
  
  public V1beta2DeviceClassConfiguration buildLastConfig() {
    return this.config.get(config.size() - 1).build();
  }
  
  public V1beta2DeviceClassConfiguration buildMatchingConfig(Predicate<V1beta2DeviceClassConfigurationBuilder> predicate) {
      for (V1beta2DeviceClassConfigurationBuilder item : config) {
        if (predicate.test(item)) {
          return item.build();
        }
      }
      return null;
  }
  
  public boolean hasMatchingConfig(Predicate<V1beta2DeviceClassConfigurationBuilder> predicate) {
      for (V1beta2DeviceClassConfigurationBuilder item : config) {
        if (predicate.test(item)) {
          return true;
        }
      }
      return false;
  }
  
  public A withConfig(List<V1beta2DeviceClassConfiguration> config) {
    if (this.config != null) {
      this._visitables.get("config").clear();
    }
    if (config != null) {
        this.config = new ArrayList();
        for (V1beta2DeviceClassConfiguration item : config) {
          this.addToConfig(item);
        }
    } else {
      this.config = null;
    }
    return (A) this;
  }
  
  public A withConfig(io.kubernetes.client.openapi.models.V1beta2DeviceClassConfiguration... config) {
    if (this.config != null) {
        this.config.clear();
        _visitables.remove("config");
    }
    if (config != null) {
      for (V1beta2DeviceClassConfiguration item : config) {
        this.addToConfig(item);
      }
    }
    return (A) this;
  }
  
  public boolean hasConfig() {
    return this.config != null && !this.config.isEmpty();
  }
  
  public ConfigNested<A> addNewConfig() {
    return new ConfigNested(-1, null);
  }
  
  public ConfigNested<A> addNewConfigLike(V1beta2DeviceClassConfiguration item) {
    return new ConfigNested(-1, item);
  }
  
  public ConfigNested<A> setNewConfigLike(int index,V1beta2DeviceClassConfiguration item) {
    return new ConfigNested(index, item);
  }
  
  public ConfigNested<A> editConfig(int index) {
    if (config.size() <= index) throw new RuntimeException("Can't edit config. Index exceeds size.");
    return setNewConfigLike(index, buildConfig(index));
  }
  
  public ConfigNested<A> editFirstConfig() {
    if (config.size() == 0) throw new RuntimeException("Can't edit first config. The list is empty.");
    return setNewConfigLike(0, buildConfig(0));
  }
  
  public ConfigNested<A> editLastConfig() {
    int index = config.size() - 1;
    if (index < 0) throw new RuntimeException("Can't edit last config. The list is empty.");
    return setNewConfigLike(index, buildConfig(index));
  }
  
  public ConfigNested<A> editMatchingConfig(Predicate<V1beta2DeviceClassConfigurationBuilder> predicate) {
    int index = -1;
    for (int i=0;i<config.size();i++) { 
    if (predicate.test(config.get(i))) {index = i; break;}
    } 
    if (index < 0) throw new RuntimeException("Can't edit matching config. No match found.");
    return setNewConfigLike(index, buildConfig(index));
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
  
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    V1beta2DeviceClassSpecFluent that = (V1beta2DeviceClassSpecFluent) o;
    if (!java.util.Objects.equals(config, that.config)) return false;
    if (!java.util.Objects.equals(selectors, that.selectors)) return false;
    return true;
  }
  
  public int hashCode() {
    return java.util.Objects.hash(config,  selectors,  super.hashCode());
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (config != null && !config.isEmpty()) { sb.append("config:"); sb.append(config + ","); }
    if (selectors != null && !selectors.isEmpty()) { sb.append("selectors:"); sb.append(selectors); }
    sb.append("}");
    return sb.toString();
  }
  public class ConfigNested<N> extends V1beta2DeviceClassConfigurationFluent<ConfigNested<N>> implements Nested<N>{
    ConfigNested(int index,V1beta2DeviceClassConfiguration item) {
      this.index = index;
      this.builder = new V1beta2DeviceClassConfigurationBuilder(this, item);
    }
    V1beta2DeviceClassConfigurationBuilder builder;
    int index;
    
    public N and() {
      return (N) V1beta2DeviceClassSpecFluent.this.setToConfig(index,builder.build());
    }
    
    public N endConfig() {
      return and();
    }
    
  
  }
  public class SelectorsNested<N> extends V1beta2DeviceSelectorFluent<SelectorsNested<N>> implements Nested<N>{
    SelectorsNested(int index,V1beta2DeviceSelector item) {
      this.index = index;
      this.builder = new V1beta2DeviceSelectorBuilder(this, item);
    }
    V1beta2DeviceSelectorBuilder builder;
    int index;
    
    public N and() {
      return (N) V1beta2DeviceClassSpecFluent.this.setToSelectors(index,builder.build());
    }
    
    public N endSelector() {
      return and();
    }
    
  
  }

}