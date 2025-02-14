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
public class V1beta1DeviceAllocationResultFluent<A extends V1beta1DeviceAllocationResultFluent<A>> extends BaseFluent<A>{
  public V1beta1DeviceAllocationResultFluent() {
  }
  
  public V1beta1DeviceAllocationResultFluent(V1beta1DeviceAllocationResult instance) {
    this.copyInstance(instance);
  }
  private ArrayList<V1beta1DeviceAllocationConfigurationBuilder> config;
  private ArrayList<V1beta1DeviceRequestAllocationResultBuilder> results;
  
  protected void copyInstance(V1beta1DeviceAllocationResult instance) {
    instance = (instance != null ? instance : new V1beta1DeviceAllocationResult());
    if (instance != null) {
          this.withConfig(instance.getConfig());
          this.withResults(instance.getResults());
        }
  }
  
  public A addToConfig(int index,V1beta1DeviceAllocationConfiguration item) {
    if (this.config == null) {this.config = new ArrayList<V1beta1DeviceAllocationConfigurationBuilder>();}
    V1beta1DeviceAllocationConfigurationBuilder builder = new V1beta1DeviceAllocationConfigurationBuilder(item);
    if (index < 0 || index >= config.size()) { _visitables.get("config").add(builder); config.add(builder); } else { _visitables.get("config").add(index, builder); config.add(index, builder);}
    return (A)this;
  }
  
  public A setToConfig(int index,V1beta1DeviceAllocationConfiguration item) {
    if (this.config == null) {this.config = new ArrayList<V1beta1DeviceAllocationConfigurationBuilder>();}
    V1beta1DeviceAllocationConfigurationBuilder builder = new V1beta1DeviceAllocationConfigurationBuilder(item);
    if (index < 0 || index >= config.size()) { _visitables.get("config").add(builder); config.add(builder); } else { _visitables.get("config").set(index, builder); config.set(index, builder);}
    return (A)this;
  }
  
  public A addToConfig(io.kubernetes.client.openapi.models.V1beta1DeviceAllocationConfiguration... items) {
    if (this.config == null) {this.config = new ArrayList<V1beta1DeviceAllocationConfigurationBuilder>();}
    for (V1beta1DeviceAllocationConfiguration item : items) {V1beta1DeviceAllocationConfigurationBuilder builder = new V1beta1DeviceAllocationConfigurationBuilder(item);_visitables.get("config").add(builder);this.config.add(builder);} return (A)this;
  }
  
  public A addAllToConfig(Collection<V1beta1DeviceAllocationConfiguration> items) {
    if (this.config == null) {this.config = new ArrayList<V1beta1DeviceAllocationConfigurationBuilder>();}
    for (V1beta1DeviceAllocationConfiguration item : items) {V1beta1DeviceAllocationConfigurationBuilder builder = new V1beta1DeviceAllocationConfigurationBuilder(item);_visitables.get("config").add(builder);this.config.add(builder);} return (A)this;
  }
  
  public A removeFromConfig(io.kubernetes.client.openapi.models.V1beta1DeviceAllocationConfiguration... items) {
    if (this.config == null) return (A)this;
    for (V1beta1DeviceAllocationConfiguration item : items) {V1beta1DeviceAllocationConfigurationBuilder builder = new V1beta1DeviceAllocationConfigurationBuilder(item);_visitables.get("config").remove(builder); this.config.remove(builder);} return (A)this;
  }
  
  public A removeAllFromConfig(Collection<V1beta1DeviceAllocationConfiguration> items) {
    if (this.config == null) return (A)this;
    for (V1beta1DeviceAllocationConfiguration item : items) {V1beta1DeviceAllocationConfigurationBuilder builder = new V1beta1DeviceAllocationConfigurationBuilder(item);_visitables.get("config").remove(builder); this.config.remove(builder);} return (A)this;
  }
  
  public A removeMatchingFromConfig(Predicate<V1beta1DeviceAllocationConfigurationBuilder> predicate) {
    if (config == null) return (A) this;
    final Iterator<V1beta1DeviceAllocationConfigurationBuilder> each = config.iterator();
    final List visitables = _visitables.get("config");
    while (each.hasNext()) {
      V1beta1DeviceAllocationConfigurationBuilder builder = each.next();
      if (predicate.test(builder)) {
        visitables.remove(builder);
        each.remove();
      }
    }
    return (A)this;
  }
  
  public List<V1beta1DeviceAllocationConfiguration> buildConfig() {
    return this.config != null ? build(config) : null;
  }
  
  public V1beta1DeviceAllocationConfiguration buildConfig(int index) {
    return this.config.get(index).build();
  }
  
  public V1beta1DeviceAllocationConfiguration buildFirstConfig() {
    return this.config.get(0).build();
  }
  
  public V1beta1DeviceAllocationConfiguration buildLastConfig() {
    return this.config.get(config.size() - 1).build();
  }
  
  public V1beta1DeviceAllocationConfiguration buildMatchingConfig(Predicate<V1beta1DeviceAllocationConfigurationBuilder> predicate) {
      for (V1beta1DeviceAllocationConfigurationBuilder item : config) {
        if (predicate.test(item)) {
          return item.build();
        }
      }
      return null;
  }
  
  public boolean hasMatchingConfig(Predicate<V1beta1DeviceAllocationConfigurationBuilder> predicate) {
      for (V1beta1DeviceAllocationConfigurationBuilder item : config) {
        if (predicate.test(item)) {
          return true;
        }
      }
      return false;
  }
  
  public A withConfig(List<V1beta1DeviceAllocationConfiguration> config) {
    if (this.config != null) {
      this._visitables.get("config").clear();
    }
    if (config != null) {
        this.config = new ArrayList();
        for (V1beta1DeviceAllocationConfiguration item : config) {
          this.addToConfig(item);
        }
    } else {
      this.config = null;
    }
    return (A) this;
  }
  
  public A withConfig(io.kubernetes.client.openapi.models.V1beta1DeviceAllocationConfiguration... config) {
    if (this.config != null) {
        this.config.clear();
        _visitables.remove("config");
    }
    if (config != null) {
      for (V1beta1DeviceAllocationConfiguration item : config) {
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
  
  public ConfigNested<A> addNewConfigLike(V1beta1DeviceAllocationConfiguration item) {
    return new ConfigNested(-1, item);
  }
  
  public ConfigNested<A> setNewConfigLike(int index,V1beta1DeviceAllocationConfiguration item) {
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
  
  public ConfigNested<A> editMatchingConfig(Predicate<V1beta1DeviceAllocationConfigurationBuilder> predicate) {
    int index = -1;
    for (int i=0;i<config.size();i++) { 
    if (predicate.test(config.get(i))) {index = i; break;}
    } 
    if (index < 0) throw new RuntimeException("Can't edit matching config. No match found.");
    return setNewConfigLike(index, buildConfig(index));
  }
  
  public A addToResults(int index,V1beta1DeviceRequestAllocationResult item) {
    if (this.results == null) {this.results = new ArrayList<V1beta1DeviceRequestAllocationResultBuilder>();}
    V1beta1DeviceRequestAllocationResultBuilder builder = new V1beta1DeviceRequestAllocationResultBuilder(item);
    if (index < 0 || index >= results.size()) { _visitables.get("results").add(builder); results.add(builder); } else { _visitables.get("results").add(index, builder); results.add(index, builder);}
    return (A)this;
  }
  
  public A setToResults(int index,V1beta1DeviceRequestAllocationResult item) {
    if (this.results == null) {this.results = new ArrayList<V1beta1DeviceRequestAllocationResultBuilder>();}
    V1beta1DeviceRequestAllocationResultBuilder builder = new V1beta1DeviceRequestAllocationResultBuilder(item);
    if (index < 0 || index >= results.size()) { _visitables.get("results").add(builder); results.add(builder); } else { _visitables.get("results").set(index, builder); results.set(index, builder);}
    return (A)this;
  }
  
  public A addToResults(io.kubernetes.client.openapi.models.V1beta1DeviceRequestAllocationResult... items) {
    if (this.results == null) {this.results = new ArrayList<V1beta1DeviceRequestAllocationResultBuilder>();}
    for (V1beta1DeviceRequestAllocationResult item : items) {V1beta1DeviceRequestAllocationResultBuilder builder = new V1beta1DeviceRequestAllocationResultBuilder(item);_visitables.get("results").add(builder);this.results.add(builder);} return (A)this;
  }
  
  public A addAllToResults(Collection<V1beta1DeviceRequestAllocationResult> items) {
    if (this.results == null) {this.results = new ArrayList<V1beta1DeviceRequestAllocationResultBuilder>();}
    for (V1beta1DeviceRequestAllocationResult item : items) {V1beta1DeviceRequestAllocationResultBuilder builder = new V1beta1DeviceRequestAllocationResultBuilder(item);_visitables.get("results").add(builder);this.results.add(builder);} return (A)this;
  }
  
  public A removeFromResults(io.kubernetes.client.openapi.models.V1beta1DeviceRequestAllocationResult... items) {
    if (this.results == null) return (A)this;
    for (V1beta1DeviceRequestAllocationResult item : items) {V1beta1DeviceRequestAllocationResultBuilder builder = new V1beta1DeviceRequestAllocationResultBuilder(item);_visitables.get("results").remove(builder); this.results.remove(builder);} return (A)this;
  }
  
  public A removeAllFromResults(Collection<V1beta1DeviceRequestAllocationResult> items) {
    if (this.results == null) return (A)this;
    for (V1beta1DeviceRequestAllocationResult item : items) {V1beta1DeviceRequestAllocationResultBuilder builder = new V1beta1DeviceRequestAllocationResultBuilder(item);_visitables.get("results").remove(builder); this.results.remove(builder);} return (A)this;
  }
  
  public A removeMatchingFromResults(Predicate<V1beta1DeviceRequestAllocationResultBuilder> predicate) {
    if (results == null) return (A) this;
    final Iterator<V1beta1DeviceRequestAllocationResultBuilder> each = results.iterator();
    final List visitables = _visitables.get("results");
    while (each.hasNext()) {
      V1beta1DeviceRequestAllocationResultBuilder builder = each.next();
      if (predicate.test(builder)) {
        visitables.remove(builder);
        each.remove();
      }
    }
    return (A)this;
  }
  
  public List<V1beta1DeviceRequestAllocationResult> buildResults() {
    return this.results != null ? build(results) : null;
  }
  
  public V1beta1DeviceRequestAllocationResult buildResult(int index) {
    return this.results.get(index).build();
  }
  
  public V1beta1DeviceRequestAllocationResult buildFirstResult() {
    return this.results.get(0).build();
  }
  
  public V1beta1DeviceRequestAllocationResult buildLastResult() {
    return this.results.get(results.size() - 1).build();
  }
  
  public V1beta1DeviceRequestAllocationResult buildMatchingResult(Predicate<V1beta1DeviceRequestAllocationResultBuilder> predicate) {
      for (V1beta1DeviceRequestAllocationResultBuilder item : results) {
        if (predicate.test(item)) {
          return item.build();
        }
      }
      return null;
  }
  
  public boolean hasMatchingResult(Predicate<V1beta1DeviceRequestAllocationResultBuilder> predicate) {
      for (V1beta1DeviceRequestAllocationResultBuilder item : results) {
        if (predicate.test(item)) {
          return true;
        }
      }
      return false;
  }
  
  public A withResults(List<V1beta1DeviceRequestAllocationResult> results) {
    if (this.results != null) {
      this._visitables.get("results").clear();
    }
    if (results != null) {
        this.results = new ArrayList();
        for (V1beta1DeviceRequestAllocationResult item : results) {
          this.addToResults(item);
        }
    } else {
      this.results = null;
    }
    return (A) this;
  }
  
  public A withResults(io.kubernetes.client.openapi.models.V1beta1DeviceRequestAllocationResult... results) {
    if (this.results != null) {
        this.results.clear();
        _visitables.remove("results");
    }
    if (results != null) {
      for (V1beta1DeviceRequestAllocationResult item : results) {
        this.addToResults(item);
      }
    }
    return (A) this;
  }
  
  public boolean hasResults() {
    return this.results != null && !this.results.isEmpty();
  }
  
  public ResultsNested<A> addNewResult() {
    return new ResultsNested(-1, null);
  }
  
  public ResultsNested<A> addNewResultLike(V1beta1DeviceRequestAllocationResult item) {
    return new ResultsNested(-1, item);
  }
  
  public ResultsNested<A> setNewResultLike(int index,V1beta1DeviceRequestAllocationResult item) {
    return new ResultsNested(index, item);
  }
  
  public ResultsNested<A> editResult(int index) {
    if (results.size() <= index) throw new RuntimeException("Can't edit results. Index exceeds size.");
    return setNewResultLike(index, buildResult(index));
  }
  
  public ResultsNested<A> editFirstResult() {
    if (results.size() == 0) throw new RuntimeException("Can't edit first results. The list is empty.");
    return setNewResultLike(0, buildResult(0));
  }
  
  public ResultsNested<A> editLastResult() {
    int index = results.size() - 1;
    if (index < 0) throw new RuntimeException("Can't edit last results. The list is empty.");
    return setNewResultLike(index, buildResult(index));
  }
  
  public ResultsNested<A> editMatchingResult(Predicate<V1beta1DeviceRequestAllocationResultBuilder> predicate) {
    int index = -1;
    for (int i=0;i<results.size();i++) { 
    if (predicate.test(results.get(i))) {index = i; break;}
    } 
    if (index < 0) throw new RuntimeException("Can't edit matching results. No match found.");
    return setNewResultLike(index, buildResult(index));
  }
  
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    V1beta1DeviceAllocationResultFluent that = (V1beta1DeviceAllocationResultFluent) o;
    if (!java.util.Objects.equals(config, that.config)) return false;
    if (!java.util.Objects.equals(results, that.results)) return false;
    return true;
  }
  
  public int hashCode() {
    return java.util.Objects.hash(config,  results,  super.hashCode());
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (config != null && !config.isEmpty()) { sb.append("config:"); sb.append(config + ","); }
    if (results != null && !results.isEmpty()) { sb.append("results:"); sb.append(results); }
    sb.append("}");
    return sb.toString();
  }
  public class ConfigNested<N> extends V1beta1DeviceAllocationConfigurationFluent<ConfigNested<N>> implements Nested<N>{
    ConfigNested(int index,V1beta1DeviceAllocationConfiguration item) {
      this.index = index;
      this.builder = new V1beta1DeviceAllocationConfigurationBuilder(this, item);
    }
    V1beta1DeviceAllocationConfigurationBuilder builder;
    int index;
    
    public N and() {
      return (N) V1beta1DeviceAllocationResultFluent.this.setToConfig(index,builder.build());
    }
    
    public N endConfig() {
      return and();
    }
    
  
  }
  public class ResultsNested<N> extends V1beta1DeviceRequestAllocationResultFluent<ResultsNested<N>> implements Nested<N>{
    ResultsNested(int index,V1beta1DeviceRequestAllocationResult item) {
      this.index = index;
      this.builder = new V1beta1DeviceRequestAllocationResultBuilder(this, item);
    }
    V1beta1DeviceRequestAllocationResultBuilder builder;
    int index;
    
    public N and() {
      return (N) V1beta1DeviceAllocationResultFluent.this.setToResults(index,builder.build());
    }
    
    public N endResult() {
      return and();
    }
    
  
  }

}