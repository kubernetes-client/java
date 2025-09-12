package io.kubernetes.client.openapi.models;

import java.lang.StringBuilder;
import java.lang.SuppressWarnings;
import io.kubernetes.client.fluent.BaseFluent;
import java.util.Objects;
import java.lang.Object;
import java.lang.String;
import java.util.Map;
import java.util.LinkedHashMap;

/**
 * Generated
 */
@SuppressWarnings("unchecked")
public class V1DeviceCounterConsumptionFluent<A extends io.kubernetes.client.openapi.models.V1DeviceCounterConsumptionFluent<A>> extends BaseFluent<A>{
  public V1DeviceCounterConsumptionFluent() {
  }
  
  public V1DeviceCounterConsumptionFluent(V1DeviceCounterConsumption instance) {
    this.copyInstance(instance);
  }
  private String counterSet;
  private Map<String,V1Counter> counters;
  
  protected void copyInstance(V1DeviceCounterConsumption instance) {
    instance = instance != null ? instance : new V1DeviceCounterConsumption();
    if (instance != null) {
        this.withCounterSet(instance.getCounterSet());
        this.withCounters(instance.getCounters());
    }
  }
  
  public String getCounterSet() {
    return this.counterSet;
  }
  
  public A withCounterSet(String counterSet) {
    this.counterSet = counterSet;
    return (A) this;
  }
  
  public boolean hasCounterSet() {
    return this.counterSet != null;
  }
  
  public A addToCounters(String key,V1Counter value) {
    if (this.counters == null && key != null && value != null) {
      this.counters = new LinkedHashMap();
    }
    if (key != null && value != null) {
      this.counters.put(key, value);
    }
    return (A) this;
  }
  
  public A addToCounters(Map<String,V1Counter> map) {
    if (this.counters == null && map != null) {
      this.counters = new LinkedHashMap();
    }
    if (map != null) {
      this.counters.putAll(map);
    }
    return (A) this;
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
  
  public A removeFromCounters(Map<String,V1Counter> map) {
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
  
  public Map<String,V1Counter> getCounters() {
    return this.counters;
  }
  
  public <K,V>A withCounters(Map<String,V1Counter> counters) {
    if (counters == null) {
      this.counters = null;
    } else {
      this.counters = new LinkedHashMap(counters);
    }
    return (A) this;
  }
  
  public boolean hasCounters() {
    return this.counters != null;
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
    V1DeviceCounterConsumptionFluent that = (V1DeviceCounterConsumptionFluent) o;
    if (!(Objects.equals(counterSet, that.counterSet))) {
      return false;
    }
    if (!(Objects.equals(counters, that.counters))) {
      return false;
    }
    return true;
  }
  
  public int hashCode() {
    return Objects.hash(counterSet, counters);
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (!(counterSet == null)) {
        sb.append("counterSet:");
        sb.append(counterSet);
        sb.append(",");
    }
    if (!(counters == null) && !(counters.isEmpty())) {
        sb.append("counters:");
        sb.append(counters);
    }
    sb.append("}");
    return sb.toString();
  }
  

}