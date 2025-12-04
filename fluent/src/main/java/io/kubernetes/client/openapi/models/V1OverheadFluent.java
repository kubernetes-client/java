package io.kubernetes.client.openapi.models;

import io.kubernetes.client.custom.Quantity;
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
public class V1OverheadFluent<A extends io.kubernetes.client.openapi.models.V1OverheadFluent<A>> extends BaseFluent<A>{

  private Map<String,Quantity> podFixed;

  public V1OverheadFluent() {
  }
  
  public V1OverheadFluent(V1Overhead instance) {
    this.copyInstance(instance);
  }

  public A addToPodFixed(Map<String,Quantity> map) {
    if (this.podFixed == null && map != null) {
      this.podFixed = new LinkedHashMap();
    }
    if (map != null) {
      this.podFixed.putAll(map);
    }
    return (A) this;
  }
  
  public A addToPodFixed(String key,Quantity value) {
    if (this.podFixed == null && key != null && value != null) {
      this.podFixed = new LinkedHashMap();
    }
    if (key != null && value != null) {
      this.podFixed.put(key, value);
    }
    return (A) this;
  }
  
  protected void copyInstance(V1Overhead instance) {
    instance = instance != null ? instance : new V1Overhead();
    if (instance != null) {
      this.withPodFixed(instance.getPodFixed());
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
    V1OverheadFluent that = (V1OverheadFluent) o;
    if (!(Objects.equals(podFixed, that.podFixed))) {
      return false;
    }
    return true;
  }
  
  public Map<String,Quantity> getPodFixed() {
    return this.podFixed;
  }
  
  public boolean hasPodFixed() {
    return this.podFixed != null;
  }
  
  public int hashCode() {
    return Objects.hash(podFixed);
  }
  
  public A removeFromPodFixed(String key) {
    if (this.podFixed == null) {
      return (A) this;
    }
    if (key != null && this.podFixed != null) {
      this.podFixed.remove(key);
    }
    return (A) this;
  }
  
  public A removeFromPodFixed(Map<String,Quantity> map) {
    if (this.podFixed == null) {
      return (A) this;
    }
    if (map != null) {
      for (Object key : map.keySet()) {
        if (this.podFixed != null) {
          this.podFixed.remove(key);
        }
      }
    }
    return (A) this;
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (!(podFixed == null) && !(podFixed.isEmpty())) {
        sb.append("podFixed:");
        sb.append(podFixed);
    }
    sb.append("}");
    return sb.toString();
  }
  
  public <K,V>A withPodFixed(Map<String,Quantity> podFixed) {
    if (podFixed == null) {
      this.podFixed = null;
    } else {
      this.podFixed = new LinkedHashMap(podFixed);
    }
    return (A) this;
  }
  
}