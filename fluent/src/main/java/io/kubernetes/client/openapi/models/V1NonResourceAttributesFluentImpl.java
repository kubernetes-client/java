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
  public class V1NonResourceAttributesFluentImpl<A extends V1NonResourceAttributesFluent<A>> extends BaseFluent<A> implements V1NonResourceAttributesFluent<A>{
  public V1NonResourceAttributesFluentImpl() {
  }
  public V1NonResourceAttributesFluentImpl(V1NonResourceAttributes instance) {
    this.withPath(instance.getPath());

    this.withVerb(instance.getVerb());

  }
  private String path;
  private String verb;
  public String getPath() {
    return this.path;
  }
  public A withPath(String path) {
    this.path=path; return (A) this;
  }
  public Boolean hasPath() {
    return this.path != null;
  }
  public String getVerb() {
    return this.verb;
  }
  public A withVerb(String verb) {
    this.verb=verb; return (A) this;
  }
  public Boolean hasVerb() {
    return this.verb != null;
  }
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    V1NonResourceAttributesFluentImpl that = (V1NonResourceAttributesFluentImpl) o;
    if (path != null ? !path.equals(that.path) :that.path != null) return false;
    if (verb != null ? !verb.equals(that.verb) :that.verb != null) return false;
    return true;
  }
  public int hashCode() {
    return java.util.Objects.hash(path,  verb,  super.hashCode());
  }
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (path != null) { sb.append("path:"); sb.append(path + ","); }
    if (verb != null) { sb.append("verb:"); sb.append(verb); }
    sb.append("}");
    return sb.toString();
  }
  
}