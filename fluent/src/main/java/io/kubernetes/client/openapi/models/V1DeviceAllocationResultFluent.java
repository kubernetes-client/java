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
import java.util.Objects;
import java.util.Collection;
import java.lang.Object;

/**
 * Generated
 */
@SuppressWarnings("unchecked")
public class V1DeviceAllocationResultFluent<A extends io.kubernetes.client.openapi.models.V1DeviceAllocationResultFluent<A>> extends BaseFluent<A>{
  public V1DeviceAllocationResultFluent() {
  }
  
  public V1DeviceAllocationResultFluent(V1DeviceAllocationResult instance) {
    this.copyInstance(instance);
  }
  private ArrayList<V1DeviceAllocationConfigurationBuilder> config;
  private ArrayList<V1DeviceRequestAllocationResultBuilder> results;
  
  protected void copyInstance(V1DeviceAllocationResult instance) {
    instance = instance != null ? instance : new V1DeviceAllocationResult();
    if (instance != null) {
        this.withConfig(instance.getConfig());
        this.withResults(instance.getResults());
    }
  }
  
  public A addToConfig(int index,V1DeviceAllocationConfiguration item) {
    if (this.config == null) {
      this.config = new ArrayList();
    }
    V1DeviceAllocationConfigurationBuilder builder = new V1DeviceAllocationConfigurationBuilder(item);
    if (index < 0 || index >= config.size()) {
        _visitables.get("config").add(builder);
        config.add(builder);
    } else {
        _visitables.get("config").add(builder);
        config.add(index, builder);
    }
    return (A) this;
  }
  
  public A setToConfig(int index,V1DeviceAllocationConfiguration item) {
    if (this.config == null) {
      this.config = new ArrayList();
    }
    V1DeviceAllocationConfigurationBuilder builder = new V1DeviceAllocationConfigurationBuilder(item);
    if (index < 0 || index >= config.size()) {
        _visitables.get("config").add(builder);
        config.add(builder);
    } else {
        _visitables.get("config").add(builder);
        config.set(index, builder);
    }
    return (A) this;
  }
  
  public A addToConfig(V1DeviceAllocationConfiguration... items) {
    if (this.config == null) {
      this.config = new ArrayList();
    }
    for (V1DeviceAllocationConfiguration item : items) {
        V1DeviceAllocationConfigurationBuilder builder = new V1DeviceAllocationConfigurationBuilder(item);
        _visitables.get("config").add(builder);
        this.config.add(builder);
    }
    return (A) this;
  }
  
  public A addAllToConfig(Collection<V1DeviceAllocationConfiguration> items) {
    if (this.config == null) {
      this.config = new ArrayList();
    }
    for (V1DeviceAllocationConfiguration item : items) {
        V1DeviceAllocationConfigurationBuilder builder = new V1DeviceAllocationConfigurationBuilder(item);
        _visitables.get("config").add(builder);
        this.config.add(builder);
    }
    return (A) this;
  }
  
  public A removeFromConfig(V1DeviceAllocationConfiguration... items) {
    if (this.config == null) {
      return (A) this;
    }
    for (V1DeviceAllocationConfiguration item : items) {
        V1DeviceAllocationConfigurationBuilder builder = new V1DeviceAllocationConfigurationBuilder(item);
        _visitables.get("config").remove(builder);
        this.config.remove(builder);
    }
    return (A) this;
  }
  
  public A removeAllFromConfig(Collection<V1DeviceAllocationConfiguration> items) {
    if (this.config == null) {
      return (A) this;
    }
    for (V1DeviceAllocationConfiguration item : items) {
        V1DeviceAllocationConfigurationBuilder builder = new V1DeviceAllocationConfigurationBuilder(item);
        _visitables.get("config").remove(builder);
        this.config.remove(builder);
    }
    return (A) this;
  }
  
  public A removeMatchingFromConfig(Predicate<V1DeviceAllocationConfigurationBuilder> predicate) {
    if (config == null) {
      return (A) this;
    }
    Iterator<V1DeviceAllocationConfigurationBuilder> each = config.iterator();
    List visitables = _visitables.get("config");
    while (each.hasNext()) {
        V1DeviceAllocationConfigurationBuilder builder = each.next();
        if (predicate.test(builder)) {
            visitables.remove(builder);
            each.remove();
        }
    }
    return (A) this;
  }
  
  public List<V1DeviceAllocationConfiguration> buildConfig() {
    return this.config != null ? build(config) : null;
  }
  
  public V1DeviceAllocationConfiguration buildConfig(int index) {
    return this.config.get(index).build();
  }
  
  public V1DeviceAllocationConfiguration buildFirstConfig() {
    return this.config.get(0).build();
  }
  
  public V1DeviceAllocationConfiguration buildLastConfig() {
    return this.config.get(config.size() - 1).build();
  }
  
  public V1DeviceAllocationConfiguration buildMatchingConfig(Predicate<V1DeviceAllocationConfigurationBuilder> predicate) {
      for (V1DeviceAllocationConfigurationBuilder item : config) {
        if (predicate.test(item)) {
          return item.build();
        }
      }
      return null;
  }
  
  public boolean hasMatchingConfig(Predicate<V1DeviceAllocationConfigurationBuilder> predicate) {
      for (V1DeviceAllocationConfigurationBuilder item : config) {
        if (predicate.test(item)) {
          return true;
        }
      }
      return false;
  }
  
  public A withConfig(List<V1DeviceAllocationConfiguration> config) {
    if (this.config != null) {
      this._visitables.get("config").clear();
    }
    if (config != null) {
        this.config = new ArrayList();
        for (V1DeviceAllocationConfiguration item : config) {
          this.addToConfig(item);
        }
    } else {
      this.config = null;
    }
    return (A) this;
  }
  
  public A withConfig(V1DeviceAllocationConfiguration... config) {
    if (this.config != null) {
        this.config.clear();
        _visitables.remove("config");
    }
    if (config != null) {
      for (V1DeviceAllocationConfiguration item : config) {
        this.addToConfig(item);
      }
    }
    return (A) this;
  }
  
  public boolean hasConfig() {
    return this.config != null && !(this.config.isEmpty());
  }
  
  public ConfigNested<A> addNewConfig() {
    return new ConfigNested(-1, null);
  }
  
  public ConfigNested<A> addNewConfigLike(V1DeviceAllocationConfiguration item) {
    return new ConfigNested(-1, item);
  }
  
  public ConfigNested<A> setNewConfigLike(int index,V1DeviceAllocationConfiguration item) {
    return new ConfigNested(index, item);
  }
  
  public ConfigNested<A> editConfig(int index) {
    if (index <= config.size()) {
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
  
  public ConfigNested<A> editLastConfig() {
    int index = config.size() - 1;
    if (index < 0) {
      throw new RuntimeException(String.format("Can't edit last %s. The list is empty.", "config"));
    }
    return this.setNewConfigLike(index, this.buildConfig(index));
  }
  
  public ConfigNested<A> editMatchingConfig(Predicate<V1DeviceAllocationConfigurationBuilder> predicate) {
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
  
  public A addToResults(int index,V1DeviceRequestAllocationResult item) {
    if (this.results == null) {
      this.results = new ArrayList();
    }
    V1DeviceRequestAllocationResultBuilder builder = new V1DeviceRequestAllocationResultBuilder(item);
    if (index < 0 || index >= results.size()) {
        _visitables.get("results").add(builder);
        results.add(builder);
    } else {
        _visitables.get("results").add(builder);
        results.add(index, builder);
    }
    return (A) this;
  }
  
  public A setToResults(int index,V1DeviceRequestAllocationResult item) {
    if (this.results == null) {
      this.results = new ArrayList();
    }
    V1DeviceRequestAllocationResultBuilder builder = new V1DeviceRequestAllocationResultBuilder(item);
    if (index < 0 || index >= results.size()) {
        _visitables.get("results").add(builder);
        results.add(builder);
    } else {
        _visitables.get("results").add(builder);
        results.set(index, builder);
    }
    return (A) this;
  }
  
  public A addToResults(V1DeviceRequestAllocationResult... items) {
    if (this.results == null) {
      this.results = new ArrayList();
    }
    for (V1DeviceRequestAllocationResult item : items) {
        V1DeviceRequestAllocationResultBuilder builder = new V1DeviceRequestAllocationResultBuilder(item);
        _visitables.get("results").add(builder);
        this.results.add(builder);
    }
    return (A) this;
  }
  
  public A addAllToResults(Collection<V1DeviceRequestAllocationResult> items) {
    if (this.results == null) {
      this.results = new ArrayList();
    }
    for (V1DeviceRequestAllocationResult item : items) {
        V1DeviceRequestAllocationResultBuilder builder = new V1DeviceRequestAllocationResultBuilder(item);
        _visitables.get("results").add(builder);
        this.results.add(builder);
    }
    return (A) this;
  }
  
  public A removeFromResults(V1DeviceRequestAllocationResult... items) {
    if (this.results == null) {
      return (A) this;
    }
    for (V1DeviceRequestAllocationResult item : items) {
        V1DeviceRequestAllocationResultBuilder builder = new V1DeviceRequestAllocationResultBuilder(item);
        _visitables.get("results").remove(builder);
        this.results.remove(builder);
    }
    return (A) this;
  }
  
  public A removeAllFromResults(Collection<V1DeviceRequestAllocationResult> items) {
    if (this.results == null) {
      return (A) this;
    }
    for (V1DeviceRequestAllocationResult item : items) {
        V1DeviceRequestAllocationResultBuilder builder = new V1DeviceRequestAllocationResultBuilder(item);
        _visitables.get("results").remove(builder);
        this.results.remove(builder);
    }
    return (A) this;
  }
  
  public A removeMatchingFromResults(Predicate<V1DeviceRequestAllocationResultBuilder> predicate) {
    if (results == null) {
      return (A) this;
    }
    Iterator<V1DeviceRequestAllocationResultBuilder> each = results.iterator();
    List visitables = _visitables.get("results");
    while (each.hasNext()) {
        V1DeviceRequestAllocationResultBuilder builder = each.next();
        if (predicate.test(builder)) {
            visitables.remove(builder);
            each.remove();
        }
    }
    return (A) this;
  }
  
  public List<V1DeviceRequestAllocationResult> buildResults() {
    return this.results != null ? build(results) : null;
  }
  
  public V1DeviceRequestAllocationResult buildResult(int index) {
    return this.results.get(index).build();
  }
  
  public V1DeviceRequestAllocationResult buildFirstResult() {
    return this.results.get(0).build();
  }
  
  public V1DeviceRequestAllocationResult buildLastResult() {
    return this.results.get(results.size() - 1).build();
  }
  
  public V1DeviceRequestAllocationResult buildMatchingResult(Predicate<V1DeviceRequestAllocationResultBuilder> predicate) {
      for (V1DeviceRequestAllocationResultBuilder item : results) {
        if (predicate.test(item)) {
          return item.build();
        }
      }
      return null;
  }
  
  public boolean hasMatchingResult(Predicate<V1DeviceRequestAllocationResultBuilder> predicate) {
      for (V1DeviceRequestAllocationResultBuilder item : results) {
        if (predicate.test(item)) {
          return true;
        }
      }
      return false;
  }
  
  public A withResults(List<V1DeviceRequestAllocationResult> results) {
    if (this.results != null) {
      this._visitables.get("results").clear();
    }
    if (results != null) {
        this.results = new ArrayList();
        for (V1DeviceRequestAllocationResult item : results) {
          this.addToResults(item);
        }
    } else {
      this.results = null;
    }
    return (A) this;
  }
  
  public A withResults(V1DeviceRequestAllocationResult... results) {
    if (this.results != null) {
        this.results.clear();
        _visitables.remove("results");
    }
    if (results != null) {
      for (V1DeviceRequestAllocationResult item : results) {
        this.addToResults(item);
      }
    }
    return (A) this;
  }
  
  public boolean hasResults() {
    return this.results != null && !(this.results.isEmpty());
  }
  
  public ResultsNested<A> addNewResult() {
    return new ResultsNested(-1, null);
  }
  
  public ResultsNested<A> addNewResultLike(V1DeviceRequestAllocationResult item) {
    return new ResultsNested(-1, item);
  }
  
  public ResultsNested<A> setNewResultLike(int index,V1DeviceRequestAllocationResult item) {
    return new ResultsNested(index, item);
  }
  
  public ResultsNested<A> editResult(int index) {
    if (index <= results.size()) {
      throw new RuntimeException(String.format("Can't edit %s. Index exceeds size.", "results"));
    }
    return this.setNewResultLike(index, this.buildResult(index));
  }
  
  public ResultsNested<A> editFirstResult() {
    if (results.size() == 0) {
      throw new RuntimeException(String.format("Can't edit first %s. The list is empty.", "results"));
    }
    return this.setNewResultLike(0, this.buildResult(0));
  }
  
  public ResultsNested<A> editLastResult() {
    int index = results.size() - 1;
    if (index < 0) {
      throw new RuntimeException(String.format("Can't edit last %s. The list is empty.", "results"));
    }
    return this.setNewResultLike(index, this.buildResult(index));
  }
  
  public ResultsNested<A> editMatchingResult(Predicate<V1DeviceRequestAllocationResultBuilder> predicate) {
    int index = -1;
    for (int i = 0;i < results.size();i++) {
      if (predicate.test(results.get(i))) {
          index = i;
          break;
      }
    }
    if (index < 0) {
      throw new RuntimeException(String.format("Can't edit matching %s. No match found.", "results"));
    }
    return this.setNewResultLike(index, this.buildResult(index));
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
    V1DeviceAllocationResultFluent that = (V1DeviceAllocationResultFluent) o;
    if (!(Objects.equals(config, that.config))) {
      return false;
    }
    if (!(Objects.equals(results, that.results))) {
      return false;
    }
    return true;
  }
  
  public int hashCode() {
    return Objects.hash(config, results);
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (!(config == null) && !(config.isEmpty())) {
        sb.append("config:");
        sb.append(config);
        sb.append(",");
    }
    if (!(results == null) && !(results.isEmpty())) {
        sb.append("results:");
        sb.append(results);
    }
    sb.append("}");
    return sb.toString();
  }
  public class ConfigNested<N> extends V1DeviceAllocationConfigurationFluent<ConfigNested<N>> implements Nested<N>{
    ConfigNested(int index,V1DeviceAllocationConfiguration item) {
      this.index = index;
      this.builder = new V1DeviceAllocationConfigurationBuilder(this, item);
    }
    V1DeviceAllocationConfigurationBuilder builder;
    int index;
    
    public N and() {
      return (N) V1DeviceAllocationResultFluent.this.setToConfig(index, builder.build());
    }
    
    public N endConfig() {
      return and();
    }
    
  
  }
  public class ResultsNested<N> extends V1DeviceRequestAllocationResultFluent<ResultsNested<N>> implements Nested<N>{
    ResultsNested(int index,V1DeviceRequestAllocationResult item) {
      this.index = index;
      this.builder = new V1DeviceRequestAllocationResultBuilder(this, item);
    }
    V1DeviceRequestAllocationResultBuilder builder;
    int index;
    
    public N and() {
      return (N) V1DeviceAllocationResultFluent.this.setToResults(index, builder.build());
    }
    
    public N endResult() {
      return and();
    }
    
  
  }

}