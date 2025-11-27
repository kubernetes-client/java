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
public class V1beta1CapacityRequirementsFluent<A extends io.kubernetes.client.openapi.models.V1beta1CapacityRequirementsFluent<A>> extends BaseFluent<A>{

  private Map<String,Quantity> requests;

  public V1beta1CapacityRequirementsFluent() {
  }
  
  public V1beta1CapacityRequirementsFluent(V1beta1CapacityRequirements instance) {
    this.copyInstance(instance);
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
  
  public A addToRequests(String key,Quantity value) {
    if (this.requests == null && key != null && value != null) {
      this.requests = new LinkedHashMap();
    }
    if (key != null && value != null) {
      this.requests.put(key, value);
    }
    return (A) this;
  }
  
  protected void copyInstance(V1beta1CapacityRequirements instance) {
    instance = instance != null ? instance : new V1beta1CapacityRequirements();
    if (instance != null) {
      this.withRequests(instance.getRequests());
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
    V1beta1CapacityRequirementsFluent that = (V1beta1CapacityRequirementsFluent) o;
    if (!(Objects.equals(requests, that.requests))) {
      return false;
    }
    return true;
  }
  
  public Map<String,Quantity> getRequests() {
    return this.requests;
  }
  
  public boolean hasRequests() {
    return this.requests != null;
  }
  
  public int hashCode() {
    return Objects.hash(requests);
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
  
  public <K,V>A withRequests(Map<String,Quantity> requests) {
    if (requests == null) {
      this.requests = null;
    } else {
      this.requests = new LinkedHashMap(requests);
    }
    return (A) this;
  }
  
}