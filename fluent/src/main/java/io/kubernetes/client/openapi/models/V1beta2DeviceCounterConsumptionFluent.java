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
public class V1beta2DeviceCounterConsumptionFluent<A extends io.kubernetes.client.openapi.models.V1beta2DeviceCounterConsumptionFluent<A>> extends BaseFluent<A>{

  private String counterSet;
  private Map<String,V1beta2Counter> counters;

  public V1beta2DeviceCounterConsumptionFluent() {
  }
  
  public V1beta2DeviceCounterConsumptionFluent(V1beta2DeviceCounterConsumption instance) {
    this.copyInstance(instance);
  }

  public A addToCounters(Map<String,V1beta2Counter> map) {
    if (this.counters == null && map != null) {
      this.counters = new LinkedHashMap();
    }
    if (map != null) {
      this.counters.putAll(map);
    }
    return (A) this;
  }
  
  public A addToCounters(String key,V1beta2Counter value) {
    if (this.counters == null && key != null && value != null) {
      this.counters = new LinkedHashMap();
    }
    if (key != null && value != null) {
      this.counters.put(key, value);
    }
    return (A) this;
  }
  
  protected void copyInstance(V1beta2DeviceCounterConsumption instance) {
    instance = instance != null ? instance : new V1beta2DeviceCounterConsumption();
    if (instance != null) {
        this.withCounterSet(instance.getCounterSet());
        this.withCounters(instance.getCounters());
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
    V1beta2DeviceCounterConsumptionFluent that = (V1beta2DeviceCounterConsumptionFluent) o;
    if (!(Objects.equals(counterSet, that.counterSet))) {
      return false;
    }
    if (!(Objects.equals(counters, that.counters))) {
      return false;
    }
    return true;
  }
  
  public String getCounterSet() {
    return this.counterSet;
  }
  
  public Map<String,V1beta2Counter> getCounters() {
    return this.counters;
  }
  
  public boolean hasCounterSet() {
    return this.counterSet != null;
  }
  
  public boolean hasCounters() {
    return this.counters != null;
  }
  
  public int hashCode() {
    return Objects.hash(counterSet, counters);
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
  
  public A removeFromCounters(Map<String,V1beta2Counter> map) {
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
  
  public A withCounterSet(String counterSet) {
    this.counterSet = counterSet;
    return (A) this;
  }
  
  public <K,V>A withCounters(Map<String,V1beta2Counter> counters) {
    if (counters == null) {
      this.counters = null;
    } else {
      this.counters = new LinkedHashMap(counters);
    }
    return (A) this;
  }
  
}