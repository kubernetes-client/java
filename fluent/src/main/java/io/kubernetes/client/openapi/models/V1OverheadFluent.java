package io.kubernetes.client.openapi.models;

import java.lang.SuppressWarnings;
import io.kubernetes.client.fluent.BaseFluent;
import io.kubernetes.client.custom.Quantity;
import java.lang.Object;
import java.lang.String;
import java.util.Map;
import java.util.LinkedHashMap;

/**
 * Generated
 */
@SuppressWarnings("unchecked")
public class V1OverheadFluent<A extends V1OverheadFluent<A>> extends BaseFluent<A>{
  public V1OverheadFluent() {
  }
  
  public V1OverheadFluent(V1Overhead instance) {
    this.copyInstance(instance);
  }
  private Map<String,Quantity> podFixed;
  
  protected void copyInstance(V1Overhead instance) {
    instance = (instance != null ? instance : new V1Overhead());
    if (instance != null) {
          this.withPodFixed(instance.getPodFixed());
        }
  }
  
  public A addToPodFixed(String key,Quantity value) {
    if(this.podFixed == null && key != null && value != null) { this.podFixed = new LinkedHashMap(); }
    if(key != null && value != null) {this.podFixed.put(key, value);} return (A)this;
  }
  
  public A addToPodFixed(Map<String,Quantity> map) {
    if(this.podFixed == null && map != null) { this.podFixed = new LinkedHashMap(); }
    if(map != null) { this.podFixed.putAll(map);} return (A)this;
  }
  
  public A removeFromPodFixed(String key) {
    if(this.podFixed == null) { return (A) this; }
    if(key != null && this.podFixed != null) {this.podFixed.remove(key);} return (A)this;
  }
  
  public A removeFromPodFixed(Map<String,Quantity> map) {
    if(this.podFixed == null) { return (A) this; }
    if(map != null) { for(Object key : map.keySet()) {if (this.podFixed != null){this.podFixed.remove(key);}}} return (A)this;
  }
  
  public Map<String,Quantity> getPodFixed() {
    return this.podFixed;
  }
  
  public <K,V>A withPodFixed(Map<String,Quantity> podFixed) {
    if (podFixed == null) {
      this.podFixed = null;
    } else {
      this.podFixed = new LinkedHashMap(podFixed);
    }
    return (A) this;
  }
  
  public boolean hasPodFixed() {
    return this.podFixed != null;
  }
  
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    V1OverheadFluent that = (V1OverheadFluent) o;
    if (!java.util.Objects.equals(podFixed, that.podFixed)) return false;
    return true;
  }
  
  public int hashCode() {
    return java.util.Objects.hash(podFixed,  super.hashCode());
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (podFixed != null && !podFixed.isEmpty()) { sb.append("podFixed:"); sb.append(podFixed); }
    sb.append("}");
    return sb.toString();
  }
  

}