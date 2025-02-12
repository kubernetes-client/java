package io.kubernetes.client.openapi.models;

import java.lang.SuppressWarnings;
import io.kubernetes.client.fluent.BaseFluent;
import java.lang.Object;
import java.lang.String;
import java.util.Map;
import java.util.LinkedHashMap;

/**
 * Generated
 */
@SuppressWarnings("unchecked")
public class V1beta1BasicDeviceFluent<A extends V1beta1BasicDeviceFluent<A>> extends BaseFluent<A>{
  public V1beta1BasicDeviceFluent() {
  }
  
  public V1beta1BasicDeviceFluent(V1beta1BasicDevice instance) {
    this.copyInstance(instance);
  }
  private Map<String,V1beta1DeviceAttribute> attributes;
  private Map<String,V1beta1DeviceCapacity> capacity;
  
  protected void copyInstance(V1beta1BasicDevice instance) {
    instance = (instance != null ? instance : new V1beta1BasicDevice());
    if (instance != null) {
          this.withAttributes(instance.getAttributes());
          this.withCapacity(instance.getCapacity());
        }
  }
  
  public A addToAttributes(String key,V1beta1DeviceAttribute value) {
    if(this.attributes == null && key != null && value != null) { this.attributes = new LinkedHashMap(); }
    if(key != null && value != null) {this.attributes.put(key, value);} return (A)this;
  }
  
  public A addToAttributes(Map<String,V1beta1DeviceAttribute> map) {
    if(this.attributes == null && map != null) { this.attributes = new LinkedHashMap(); }
    if(map != null) { this.attributes.putAll(map);} return (A)this;
  }
  
  public A removeFromAttributes(String key) {
    if(this.attributes == null) { return (A) this; }
    if(key != null && this.attributes != null) {this.attributes.remove(key);} return (A)this;
  }
  
  public A removeFromAttributes(Map<String,V1beta1DeviceAttribute> map) {
    if(this.attributes == null) { return (A) this; }
    if(map != null) { for(Object key : map.keySet()) {if (this.attributes != null){this.attributes.remove(key);}}} return (A)this;
  }
  
  public Map<String,V1beta1DeviceAttribute> getAttributes() {
    return this.attributes;
  }
  
  public <K,V>A withAttributes(Map<String,V1beta1DeviceAttribute> attributes) {
    if (attributes == null) {
      this.attributes = null;
    } else {
      this.attributes = new LinkedHashMap(attributes);
    }
    return (A) this;
  }
  
  public boolean hasAttributes() {
    return this.attributes != null;
  }
  
  public A addToCapacity(String key,V1beta1DeviceCapacity value) {
    if(this.capacity == null && key != null && value != null) { this.capacity = new LinkedHashMap(); }
    if(key != null && value != null) {this.capacity.put(key, value);} return (A)this;
  }
  
  public A addToCapacity(Map<String,V1beta1DeviceCapacity> map) {
    if(this.capacity == null && map != null) { this.capacity = new LinkedHashMap(); }
    if(map != null) { this.capacity.putAll(map);} return (A)this;
  }
  
  public A removeFromCapacity(String key) {
    if(this.capacity == null) { return (A) this; }
    if(key != null && this.capacity != null) {this.capacity.remove(key);} return (A)this;
  }
  
  public A removeFromCapacity(Map<String,V1beta1DeviceCapacity> map) {
    if(this.capacity == null) { return (A) this; }
    if(map != null) { for(Object key : map.keySet()) {if (this.capacity != null){this.capacity.remove(key);}}} return (A)this;
  }
  
  public Map<String,V1beta1DeviceCapacity> getCapacity() {
    return this.capacity;
  }
  
  public <K,V>A withCapacity(Map<String,V1beta1DeviceCapacity> capacity) {
    if (capacity == null) {
      this.capacity = null;
    } else {
      this.capacity = new LinkedHashMap(capacity);
    }
    return (A) this;
  }
  
  public boolean hasCapacity() {
    return this.capacity != null;
  }
  
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    V1beta1BasicDeviceFluent that = (V1beta1BasicDeviceFluent) o;
    if (!java.util.Objects.equals(attributes, that.attributes)) return false;
    if (!java.util.Objects.equals(capacity, that.capacity)) return false;
    return true;
  }
  
  public int hashCode() {
    return java.util.Objects.hash(attributes,  capacity,  super.hashCode());
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (attributes != null && !attributes.isEmpty()) { sb.append("attributes:"); sb.append(attributes + ","); }
    if (capacity != null && !capacity.isEmpty()) { sb.append("capacity:"); sb.append(capacity); }
    sb.append("}");
    return sb.toString();
  }
  

}