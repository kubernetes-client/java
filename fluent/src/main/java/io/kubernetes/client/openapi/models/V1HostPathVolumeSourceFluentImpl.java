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
  public class V1HostPathVolumeSourceFluentImpl<A extends V1HostPathVolumeSourceFluent<A>> extends BaseFluent<A> implements V1HostPathVolumeSourceFluent<A>{
  public V1HostPathVolumeSourceFluentImpl() {
  }
  public V1HostPathVolumeSourceFluentImpl(V1HostPathVolumeSource instance) {
    if (instance != null) {
      this.withPath(instance.getPath());
      this.withType(instance.getType());
    }
  }
  private String path;
  private String type;
  public String getPath() {
    return this.path;
  }
  public A withPath(String path) {
    this.path=path; return (A) this;
  }
  public Boolean hasPath() {
    return this.path != null;
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
    if (!super.equals(o)) return false;
    V1HostPathVolumeSourceFluentImpl that = (V1HostPathVolumeSourceFluentImpl) o;
    if (!java.util.Objects.equals(path, that.path)) return false;

    if (!java.util.Objects.equals(type, that.type)) return false;

    return true;
  }
  public int hashCode() {
    return java.util.Objects.hash(path,  type,  super.hashCode());
  }
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (path != null) { sb.append("path:"); sb.append(path + ","); }
    if (type != null) { sb.append("type:"); sb.append(type); }
    sb.append("}");
    return sb.toString();
  }
  
}