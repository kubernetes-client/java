package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.BaseFluent;
import java.lang.Object;
import java.lang.String;
import java.lang.StringBuilder;
import java.lang.SuppressWarnings;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;

/**
 * Generated
 */
@SuppressWarnings("unchecked")
public class V1beta1CounterSetFluent<A extends io.kubernetes.client.openapi.models.V1beta1CounterSetFluent<A>> extends BaseFluent<A>{

  private Map<String,V1beta1Counter> counters;
  private String name;

  public V1beta1CounterSetFluent() {
  }
  
  public V1beta1CounterSetFluent(V1beta1CounterSet instance) {
    this.copyInstance(instance);
  }

  public A addToCounters(Map<String,V1beta1Counter> map) {
    if (this.counters == null && map != null) {
      this.counters = new LinkedHashMap();
    }
    if (map != null) {
      this.counters.putAll(map);
    }
    return (A) this;
  }
  
  public A addToCounters(String key,V1beta1Counter value) {
    if (this.counters == null && key != null && value != null) {
      this.counters = new LinkedHashMap();
    }
    if (key != null && value != null) {
      this.counters.put(key, value);
    }
    return (A) this;
  }
  
  protected void copyInstance(V1beta1CounterSet instance) {
    instance = instance != null ? instance : new V1beta1CounterSet();
    if (instance != null) {
        this.withCounters(instance.getCounters());
        this.withName(instance.getName());
    }
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
    V1beta1CounterSetFluent that = (V1beta1CounterSetFluent) o;
    if (!(Objects.equals(counters, that.counters))) {
      return false;
    }
    if (!(Objects.equals(name, that.name))) {
      return false;
    }
    return true;
  }
  
  public Map<String,V1beta1Counter> getCounters() {
    return this.counters;
  }
  
  public String getName() {
    return this.name;
  }
  
  public boolean hasCounters() {
    return this.counters != null;
  }
  
  public boolean hasName() {
    return this.name != null;
  }
  
  public int hashCode() {
    return Objects.hash(counters, name);
  }
  
  public A removeFromCounters(String key) {
    if (this.counters == null) {
      return (A) this;
    }
    if (key != null && this.counters != null) {
      this.counters.remove(key);
    }
    return (A) this;
  }
  
  public A removeFromCounters(Map<String,V1beta1Counter> map) {
    if (this.counters == null) {
      return (A) this;
    }
    if (map != null) {
      for (Object key : map.keySet()) {
        if (this.counters != null) {
          this.counters.remove(key);
        }
      }
    }
    return (A) this;
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (!(counters == null) && !(counters.isEmpty())) {
        sb.append("counters:");
        sb.append(counters);
        sb.append(",");
    }
    if (!(name == null)) {
        sb.append("name:");
        sb.append(name);
    }
    sb.append("}");
    return sb.toString();
  }
  
  public <K,V>A withCounters(Map<String,V1beta1Counter> counters) {
    if (counters == null) {
      this.counters = null;
    } else {
      this.counters = new LinkedHashMap(counters);
    }
    return (A) this;
  }
  
  public A withName(String name) {
    this.name = name;
    return (A) this;
  }
  
}