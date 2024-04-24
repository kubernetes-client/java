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
public class V1VolumeResourceRequirementsFluent<A extends V1VolumeResourceRequirementsFluent<A>> extends BaseFluent<A>{
  public V1VolumeResourceRequirementsFluent() {
  }
  
  public V1VolumeResourceRequirementsFluent(V1VolumeResourceRequirements instance) {
    this.copyInstance(instance);
  }
  private Map<String,Quantity> limits;
  private Map<String,Quantity> requests;
  
  protected void copyInstance(V1VolumeResourceRequirements instance) {
    instance = (instance != null ? instance : new V1VolumeResourceRequirements());
    if (instance != null) {
          this.withLimits(instance.getLimits());
          this.withRequests(instance.getRequests());
        }
  }
  
  public A addToLimits(String key,Quantity value) {
    if(this.limits == null && key != null && value != null) { this.limits = new LinkedHashMap(); }
    if(key != null && value != null) {this.limits.put(key, value);} return (A)this;
  }
  
  public A addToLimits(Map<String,Quantity> map) {
    if(this.limits == null && map != null) { this.limits = new LinkedHashMap(); }
    if(map != null) { this.limits.putAll(map);} return (A)this;
  }
  
  public A removeFromLimits(String key) {
    if(this.limits == null) { return (A) this; }
    if(key != null && this.limits != null) {this.limits.remove(key);} return (A)this;
  }
  
  public A removeFromLimits(Map<String,Quantity> map) {
    if(this.limits == null) { return (A) this; }
    if(map != null) { for(Object key : map.keySet()) {if (this.limits != null){this.limits.remove(key);}}} return (A)this;
  }
  
  public Map<String,Quantity> getLimits() {
    return this.limits;
  }
  
  public <K,V>A withLimits(Map<String,Quantity> limits) {
    if (limits == null) {
      this.limits = null;
    } else {
      this.limits = new LinkedHashMap(limits);
    }
    return (A) this;
  }
  
  public boolean hasLimits() {
    return this.limits != null;
  }
  
  public A addToRequests(String key,Quantity value) {
    if(this.requests == null && key != null && value != null) { this.requests = new LinkedHashMap(); }
    if(key != null && value != null) {this.requests.put(key, value);} return (A)this;
  }
  
  public A addToRequests(Map<String,Quantity> map) {
    if(this.requests == null && map != null) { this.requests = new LinkedHashMap(); }
    if(map != null) { this.requests.putAll(map);} return (A)this;
  }
  
  public A removeFromRequests(String key) {
    if(this.requests == null) { return (A) this; }
    if(key != null && this.requests != null) {this.requests.remove(key);} return (A)this;
  }
  
  public A removeFromRequests(Map<String,Quantity> map) {
    if(this.requests == null) { return (A) this; }
    if(map != null) { for(Object key : map.keySet()) {if (this.requests != null){this.requests.remove(key);}}} return (A)this;
  }
  
  public Map<String,Quantity> getRequests() {
    return this.requests;
  }
  
  public <K,V>A withRequests(Map<String,Quantity> requests) {
    if (requests == null) {
      this.requests = null;
    } else {
      this.requests = new LinkedHashMap(requests);
    }
    return (A) this;
  }
  
  public boolean hasRequests() {
    return this.requests != null;
  }
  
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    V1VolumeResourceRequirementsFluent that = (V1VolumeResourceRequirementsFluent) o;
    if (!java.util.Objects.equals(limits, that.limits)) return false;
    if (!java.util.Objects.equals(requests, that.requests)) return false;
    return true;
  }
  
  public int hashCode() {
    return java.util.Objects.hash(limits,  requests,  super.hashCode());
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (limits != null && !limits.isEmpty()) { sb.append("limits:"); sb.append(limits + ","); }
    if (requests != null && !requests.isEmpty()) { sb.append("requests:"); sb.append(requests); }
    sb.append("}");
    return sb.toString();
  }
  

}