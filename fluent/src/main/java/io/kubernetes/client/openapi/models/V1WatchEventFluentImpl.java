package io.kubernetes.client.openapi.models;

import java.lang.SuppressWarnings;
import io.kubernetes.client.fluent.BaseFluent;
import java.lang.Object;
import java.lang.String;
import java.lang.Boolean;

 /**
  * Generated
  */
  @SuppressWarnings(value = "unchecked")
  public class V1WatchEventFluentImpl<A extends V1WatchEventFluent<A>> extends BaseFluent<A> implements V1WatchEventFluent<A>{
  public V1WatchEventFluentImpl() {
  }
  public V1WatchEventFluentImpl(V1WatchEvent instance) {
    this.withObject(instance.getObject());

    this.withType(instance.getType());

  }
  private Object _object;
  private String type;
  public Object getObject() {
    return this._object;
  }
  public A withObject(Object _object) {
    this._object=_object; return (A) this;
  }
  public Boolean hasObject() {
    return this._object != null;
  }
  public String getType() {
    return this.type;
  }
  public A withType(String type) {
    this.type=type; return (A) this;
  }
  public Boolean hasType() {
    return this.type != null;
  }
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    V1WatchEventFluentImpl that = (V1WatchEventFluentImpl) o;
    if (_object != null ? !_object.equals(that._object) :that._object != null) return false;
    if (type != null ? !type.equals(that.type) :that.type != null) return false;
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