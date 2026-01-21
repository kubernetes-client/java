package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.BaseFluent;
import java.lang.Object;
import java.lang.String;
import java.lang.StringBuilder;
import java.lang.SuppressWarnings;
import java.util.Objects;

/**
 * Generated
 */
@SuppressWarnings("unchecked")
public class V1WatchEventFluent<A extends io.kubernetes.client.openapi.models.V1WatchEventFluent<A>> extends BaseFluent<A>{

  private Object _object;
  private String type;

  public V1WatchEventFluent() {
  }
  
  public V1WatchEventFluent(V1WatchEvent instance) {
    this.copyInstance(instance);
  }

  protected void copyInstance(V1WatchEvent instance) {
    instance = instance != null ? instance : new V1WatchEvent();
    if (instance != null) {
        this.withObject(instance.getObject());
        this.withType(instance.getType());
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
    V1WatchEventFluent that = (V1WatchEventFluent) o;
    if (!(Objects.equals(_object, that._object))) {
      return false;
    }
    if (!(Objects.equals(type, that.type))) {
      return false;
    }
    return true;
  }
  
  public Object getObject() {
    return this._object;
  }
  
  public String getType() {
    return this.type;
  }
  
  public boolean hasObject() {
    return this._object != null;
  }
  
  public boolean hasType() {
    return this.type != null;
  }
  
  public int hashCode() {
    return Objects.hash(_object, type);
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (!(_object == null)) {
        sb.append("_object:");
        sb.append(_object);
        sb.append(",");
    }
    if (!(type == null)) {
        sb.append("type:");
        sb.append(type);
    }
    sb.append("}");
    return sb.toString();
  }
  
  public A withObject(Object _object) {
    this._object = _object;
    return (A) this;
  }
  
  public A withType(String type) {
    this.type = type;
    return (A) this;
  }
  
}