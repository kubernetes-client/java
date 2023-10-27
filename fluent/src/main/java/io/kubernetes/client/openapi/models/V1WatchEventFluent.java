package io.kubernetes.client.openapi.models;

import java.lang.SuppressWarnings;
import io.kubernetes.client.fluent.BaseFluent;
import java.lang.Object;
import java.lang.String;

/**
 * Generated
 */
@SuppressWarnings("unchecked")
public class V1WatchEventFluent<A extends V1WatchEventFluent<A>> extends BaseFluent<A>{
  public V1WatchEventFluent() {
  }
  
  public V1WatchEventFluent(V1WatchEvent instance) {
    this.copyInstance(instance);
  }
  private Object _object;
  private String type;
  
  protected void copyInstance(V1WatchEvent instance) {
    instance = (instance != null ? instance : new V1WatchEvent());
    if (instance != null) {
          this.withObject(instance.getObject());
          this.withType(instance.getType());
        }
  }
  
  public Object getObject() {
    return this._object;
  }
  
  public A withObject(Object _object) {
    this._object = _object;
    return (A) this;
  }
  
  public boolean hasObject() {
    return this._object != null;
  }
  
  public String getType() {
    return this.type;
  }
  
  public A withType(String type) {
    this.type = type;
    return (A) this;
  }
  
  public boolean hasType() {
    return this.type != null;
  }
  
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    V1WatchEventFluent that = (V1WatchEventFluent) o;
    if (!java.util.Objects.equals(_object, that._object)) return false;
    if (!java.util.Objects.equals(type, that.type)) return false;
    return true;
  }
  
  public int hashCode() {
    return java.util.Objects.hash(_object,  type,  super.hashCode());
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (_object != null) { sb.append("_object:"); sb.append(_object + ","); }
    if (type != null) { sb.append("type:"); sb.append(type); }
    sb.append("}");
    return sb.toString();
  }
  

}