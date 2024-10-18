package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.SuppressWarnings;
import io.kubernetes.client.fluent.Nested;
import java.util.ArrayList;
import java.lang.String;
import java.util.function.Predicate;
import io.kubernetes.client.fluent.BaseFluent;
import java.util.Iterator;
import java.util.List;
import java.util.Collection;
import java.lang.Object;

/**
 * Generated
 */
@SuppressWarnings("unchecked")
public class V1alpha3DeviceClassSpecFluent<A extends V1alpha3DeviceClassSpecFluent<A>> extends BaseFluent<A>{
  public V1alpha3DeviceClassSpecFluent() {
  }
  
  public V1alpha3DeviceClassSpecFluent(V1alpha3DeviceClassSpec instance) {
    this.copyInstance(instance);
  }
  private ArrayList<V1alpha3DeviceClassConfigurationBuilder> config;
  private ArrayList<V1alpha3DeviceSelectorBuilder> selectors;
  private V1NodeSelectorBuilder suitableNodes;
  
  protected void copyInstance(V1alpha3DeviceClassSpec instance) {
    instance = (instance != null ? instance : new V1alpha3DeviceClassSpec());
    if (instance != null) {
          this.withConfig(instance.getConfig());
          this.withSelectors(instance.getSelectors());
          this.withSuitableNodes(instance.getSuitableNodes());
        }
  }
  
  public A addToConfig(int index,V1alpha3DeviceClassConfiguration item) {
    if (this.config == null) {this.config = new ArrayList<V1alpha3DeviceClassConfigurationBuilder>();}
    V1alpha3DeviceClassConfigurationBuilder builder = new V1alpha3DeviceClassConfigurationBuilder(item);
    if (index < 0 || index >= config.size()) { _visitables.get("config").add(builder); config.add(builder); } else { _visitables.get("config").add(index, builder); config.add(index, builder);}
    return (A)this;
  }
  
  public A setToConfig(int index,V1alpha3DeviceClassConfiguration item) {
    if (this.config == null) {this.config = new ArrayList<V1alpha3DeviceClassConfigurationBuilder>();}
    V1alpha3DeviceClassConfigurationBuilder builder = new V1alpha3DeviceClassConfigurationBuilder(item);
    if (index < 0 || index >= config.size()) { _visitables.get("config").add(builder); config.add(builder); } else { _visitables.get("config").set(index, builder); config.set(index, builder);}
    return (A)this;
  }
  
  public A addToConfig(io.kubernetes.client.openapi.models.V1alpha3DeviceClassConfiguration... items) {
    if (this.config == null) {this.config = new ArrayList<V1alpha3DeviceClassConfigurationBuilder>();}
    for (V1alpha3DeviceClassConfiguration item : items) {V1alpha3DeviceClassConfigurationBuilder builder = new V1alpha3DeviceClassConfigurationBuilder(item);_visitables.get("config").add(builder);this.config.add(builder);} return (A)this;
  }
  
  public A addAllToConfig(Collection<V1alpha3DeviceClassConfiguration> items) {
    if (this.config == null) {this.config = new ArrayList<V1alpha3DeviceClassConfigurationBuilder>();}
    for (V1alpha3DeviceClassConfiguration item : items) {V1alpha3DeviceClassConfigurationBuilder builder = new V1alpha3DeviceClassConfigurationBuilder(item);_visitables.get("config").add(builder);this.config.add(builder);} return (A)this;
  }
  
  public A removeFromConfig(io.kubernetes.client.openapi.models.V1alpha3DeviceClassConfiguration... items) {
    if (this.config == null) return (A)this;
    for (V1alpha3DeviceClassConfiguration item : items) {V1alpha3DeviceClassConfigurationBuilder builder = new V1alpha3DeviceClassConfigurationBuilder(item);_visitables.get("config").remove(builder); this.config.remove(builder);} return (A)this;
  }
  
  public A removeAllFromConfig(Collection<V1alpha3DeviceClassConfiguration> items) {
    if (this.config == null) return (A)this;
    for (V1alpha3DeviceClassConfiguration item : items) {V1alpha3DeviceClassConfigurationBuilder builder = new V1alpha3DeviceClassConfigurationBuilder(item);_visitables.get("config").remove(builder); this.config.remove(builder);} return (A)this;
  }
  
  public A removeMatchingFromConfig(Predicate<V1alpha3DeviceClassConfigurationBuilder> predicate) {
    if (config == null) return (A) this;
    final Iterator<V1alpha3DeviceClassConfigurationBuilder> each = config.iterator();
    final List visitables = _visitables.get("config");
    while (each.hasNext()) {
      V1alpha3DeviceClassConfigurationBuilder builder = each.next();
      if (predicate.test(builder)) {
        visitables.remove(builder);
        each.remove();
      }
    }
    return (A)this;
  }
  
  public List<V1alpha3DeviceClassConfiguration> buildConfig() {
    return this.config != null ? build(config) : null;
  }
  
  public V1alpha3DeviceClassConfiguration buildConfig(int index) {
    return this.config.get(index).build();
  }
  
  public V1alpha3DeviceClassConfiguration buildFirstConfig() {
    return this.config.get(0).build();
  }
  
  public V1alpha3DeviceClassConfiguration buildLastConfig() {
    return this.config.get(config.size() - 1).build();
  }
  
  public V1alpha3DeviceClassConfiguration buildMatchingConfig(Predicate<V1alpha3DeviceClassConfigurationBuilder> predicate) {
      for (V1alpha3DeviceClassConfigurationBuilder item : config) {
        if (predicate.test(item)) {
          return item.build();
        }
      }
      return null;
  }
  
  public boolean hasMatchingConfig(Predicate<V1alpha3DeviceClassConfigurationBuilder> predicate) {
      for (V1alpha3DeviceClassConfigurationBuilder item : config) {
        if (predicate.test(item)) {
          return true;
        }
      }
      return false;
  }
  
  public A withConfig(List<V1alpha3DeviceClassConfiguration> config) {
    if (this.config != null) {
      this._visitables.get("config").clear();
    }
    if (config != null) {
        this.config = new ArrayList();
        for (V1alpha3DeviceClassConfiguration item : config) {
          this.addToConfig(item);
        }
    } else {
      this.config = null;
    }
    return (A) this;
  }
  
  public A withConfig(io.kubernetes.client.openapi.models.V1alpha3DeviceClassConfiguration... config) {
    if (this.config != null) {
        this.config.clear();
        _visitables.remove("config");
    }
    if (config != null) {
      for (V1alpha3DeviceClassConfiguration item : config) {
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
  
  public ConfigNested<A> addNewConfigLike(V1alpha3DeviceClassConfiguration item) {
    return new ConfigNested(-1, item);
  }
  
  public ConfigNested<A> setNewConfigLike(int index,V1alpha3DeviceClassConfiguration item) {
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
  
  public ConfigNested<A> editMatchingConfig(Predicate<V1alpha3DeviceClassConfigurationBuilder> predicate) {
    int index = -1;
    for (int i=0;i<config.size();i++) { 
    if (predicate.test(config.get(i))) {index = i; break;}
    } 
    if (index < 0) throw new RuntimeException("Can't edit matching config. No match found.");
    return setNewConfigLike(index, buildConfig(index));
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
  
  public V1NodeSelector buildSuitableNodes() {
    return this.suitableNodes != null ? this.suitableNodes.build() : null;
  }
  
  public A withSuitableNodes(V1NodeSelector suitableNodes) {
    this._visitables.remove("suitableNodes");
    if (suitableNodes != null) {
        this.suitableNodes = new V1NodeSelectorBuilder(suitableNodes);
        this._visitables.get("suitableNodes").add(this.suitableNodes);
    } else {
        this.suitableNodes = null;
        this._visitables.get("suitableNodes").remove(this.suitableNodes);
    }
    return (A) this;
  }
  
  public boolean hasSuitableNodes() {
    return this.suitableNodes != null;
  }
  
  public SuitableNodesNested<A> withNewSuitableNodes() {
    return new SuitableNodesNested(null);
  }
  
  public SuitableNodesNested<A> withNewSuitableNodesLike(V1NodeSelector item) {
    return new SuitableNodesNested(item);
  }
  
  public SuitableNodesNested<A> editSuitableNodes() {
    return withNewSuitableNodesLike(java.util.Optional.ofNullable(buildSuitableNodes()).orElse(null));
  }
  
  public SuitableNodesNested<A> editOrNewSuitableNodes() {
    return withNewSuitableNodesLike(java.util.Optional.ofNullable(buildSuitableNodes()).orElse(new V1NodeSelectorBuilder().build()));
  }
  
  public SuitableNodesNested<A> editOrNewSuitableNodesLike(V1NodeSelector item) {
    return withNewSuitableNodesLike(java.util.Optional.ofNullable(buildSuitableNodes()).orElse(item));
  }
  
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    V1alpha3DeviceClassSpecFluent that = (V1alpha3DeviceClassSpecFluent) o;
    if (!java.util.Objects.equals(config, that.config)) return false;
    if (!java.util.Objects.equals(selectors, that.selectors)) return false;
    if (!java.util.Objects.equals(suitableNodes, that.suitableNodes)) return false;
    return true;
  }
  
  public int hashCode() {
    return java.util.Objects.hash(config,  selectors,  suitableNodes,  super.hashCode());
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (config != null && !config.isEmpty()) { sb.append("config:"); sb.append(config + ","); }
    if (selectors != null && !selectors.isEmpty()) { sb.append("selectors:"); sb.append(selectors + ","); }
    if (suitableNodes != null) { sb.append("suitableNodes:"); sb.append(suitableNodes); }
    sb.append("}");
    return sb.toString();
  }
  public class ConfigNested<N> extends V1alpha3DeviceClassConfigurationFluent<ConfigNested<N>> implements Nested<N>{
    ConfigNested(int index,V1alpha3DeviceClassConfiguration item) {
      this.index = index;
      this.builder = new V1alpha3DeviceClassConfigurationBuilder(this, item);
    }
    V1alpha3DeviceClassConfigurationBuilder builder;
    int index;
    
    public N and() {
      return (N) V1alpha3DeviceClassSpecFluent.this.setToConfig(index,builder.build());
    }
    
    public N endConfig() {
      return and();
    }
    
  
  }
  public class SelectorsNested<N> extends V1alpha3DeviceSelectorFluent<SelectorsNested<N>> implements Nested<N>{
    SelectorsNested(int index,V1alpha3DeviceSelector item) {
      this.index = index;
      this.builder = new V1alpha3DeviceSelectorBuilder(this, item);
    }
    V1alpha3DeviceSelectorBuilder builder;
    int index;
    
    public N and() {
      return (N) V1alpha3DeviceClassSpecFluent.this.setToSelectors(index,builder.build());
    }
    
    public N endSelector() {
      return and();
    }
    
  
  }
  public class SuitableNodesNested<N> extends V1NodeSelectorFluent<SuitableNodesNested<N>> implements Nested<N>{
    SuitableNodesNested(V1NodeSelector item) {
      this.builder = new V1NodeSelectorBuilder(this, item);
    }
    V1NodeSelectorBuilder builder;
    
    public N and() {
      return (N) V1alpha3DeviceClassSpecFluent.this.withSuitableNodes(builder.build());
    }
    
    public N endSuitableNodes() {
      return and();
    }
    
  
  }

}