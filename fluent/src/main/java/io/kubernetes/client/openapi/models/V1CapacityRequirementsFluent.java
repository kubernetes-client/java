package io.kubernetes.client.openapi.models;

import java.lang.StringBuilder;
import java.lang.SuppressWarnings;
import io.kubernetes.client.fluent.BaseFluent;
import java.util.Objects;
import io.kubernetes.client.custom.Quantity;
import java.lang.Object;
import java.lang.String;
import java.util.Map;
import java.util.LinkedHashMap;

/**
 * Generated
 */
@SuppressWarnings("unchecked")
public class V1CapacityRequirementsFluent<A extends io.kubernetes.client.openapi.models.V1CapacityRequirementsFluent<A>> extends BaseFluent<A>{
  public V1CapacityRequirementsFluent() {
  }
  
  public V1CapacityRequirementsFluent(V1CapacityRequirements instance) {
    this.copyInstance(instance);
  }
  private Map<String,Quantity> requests;
  
  protected void copyInstance(V1CapacityRequirements instance) {
    instance = instance != null ? instance : new V1CapacityRequirements();
    if (instance != null) {
      this.withRequests(instance.getRequests());
    }
  }
  
  public A addToRequests(String key,Quantity value) {
    if (this.requests == null && key != null && value != null) {
      this.requests = new LinkedHashMap();
    }
    if (key != null && value != null) {
      this.requests.put(key, value);
    }
    return (A) this;
  }
  
  public A addToRequests(Map<String,Quantity> map) {
    if (this.requests == null && map != null) {
      this.requests = new LinkedHashMap();
    }
    if (map != null) {
      this.requests.putAll(map);
    }
    return (A) this;
  }
  
  public A removeFromRequests(String key) {
    if (this.requests == null) {
      return (A) this;
    }
    if (key != null && this.requests != null) {
      this.requests.remove(key);
    }
    return (A) this;
  }
  
  public A removeFromRequests(Map<String,Quantity> map) {
    if (this.requests == null) {
      return (A) this;
    }
    if (map != null) {
      for (Object key : map.keySet()) {
        if (this.requests != null) {
          this.requests.remove(key);
        }
      }
    }
    return (A) this;
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
    if (this == o) {
      return true;
    }
    if (o == null || this.getClass() != o.getClass()) {
      return false;
    }
    if (!(super.equals(o))) {
      return false;
    }
    V1CapacityRequirementsFluent that = (V1CapacityRequirementsFluent) o;
    if (!(Objects.equals(requests, that.requests))) {
      return false;
    }
    return true;
  }
  
  public int hashCode() {
    return Objects.hash(requests);
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (!(requests == null) && !(requests.isEmpty())) {
        sb.append("requests:");
        sb.append(requests);
    }
    sb.append("}");
    return sb.toString();
  }
  

}