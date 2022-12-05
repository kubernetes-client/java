package io.kubernetes.client.openapi.models;

import java.lang.Integer;
import java.lang.SuppressWarnings;
import io.kubernetes.client.fluent.BaseFluent;
import java.lang.Object;
import java.lang.String;
import java.lang.Boolean;

 /**
  * Generated
  */
  @SuppressWarnings(value = "unchecked")
  public class V1KeyToPathFluentImpl<A extends V1KeyToPathFluent<A>> extends BaseFluent<A> implements V1KeyToPathFluent<A>{
  public V1KeyToPathFluentImpl() {
  }
  public V1KeyToPathFluentImpl(V1KeyToPath instance) {
    this.withKey(instance.getKey());

    this.withMode(instance.getMode());

    this.withPath(instance.getPath());

  }
  private String key;
  private Integer mode;
  private String path;
  public String getKey() {
    return this.key;
  }
  public A withKey(String key) {
    this.key=key; return (A) this;
  }
  public Boolean hasKey() {
    return this.key != null;
  }
  public Integer getMode() {
    return this.mode;
  }
  public A withMode(Integer mode) {
    this.mode=mode; return (A) this;
  }
  public Boolean hasMode() {
    return this.mode != null;
  }
  public String getPath() {
    return this.path;
  }
  public A withPath(String path) {
    this.path=path; return (A) this;
  }
  public Boolean hasPath() {
    return this.path != null;
  }
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    V1KeyToPathFluentImpl that = (V1KeyToPathFluentImpl) o;
    if (key != null ? !key.equals(that.key) :that.key != null) return false;
    if (mode != null ? !mode.equals(that.mode) :that.mode != null) return false;
    if (path != null ? !path.equals(that.path) :that.path != null) return false;
    return true;
  }
  public int hashCode() {
    return java.util.Objects.hash(key,  mode,  path,  super.hashCode());
  }
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (key != null) { sb.append("key:"); sb.append(key + ","); }
    if (mode != null) { sb.append("mode:"); sb.append(mode + ","); }
    if (path != null) { sb.append("path:"); sb.append(path); }
    sb.append("}");
    return sb.toString();
  }
  
}