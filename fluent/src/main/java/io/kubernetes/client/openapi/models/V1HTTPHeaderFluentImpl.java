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
  public class V1HTTPHeaderFluentImpl<A extends V1HTTPHeaderFluent<A>> extends BaseFluent<A> implements V1HTTPHeaderFluent<A>{
  public V1HTTPHeaderFluentImpl() {
  }
  public V1HTTPHeaderFluentImpl(V1HTTPHeader instance) {
    this.withName(instance.getName());

    this.withValue(instance.getValue());

  }
  private String name;
  private String value;
  public String getName() {
    return this.name;
  }
  public A withName(String name) {
    this.name=name; return (A) this;
  }
  public Boolean hasName() {
    return this.name != null;
  }
  public String getValue() {
    return this.value;
  }
  public A withValue(String value) {
    this.value=value; return (A) this;
  }
  public Boolean hasValue() {
    return this.value != null;
  }
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    V1HTTPHeaderFluentImpl that = (V1HTTPHeaderFluentImpl) o;
    if (name != null ? !name.equals(that.name) :that.name != null) return false;
    if (value != null ? !value.equals(that.value) :that.value != null) return false;
    return true;
  }
  public int hashCode() {
    return java.util.Objects.hash(name,  value,  super.hashCode());
  }
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (name != null) { sb.append("name:"); sb.append(name + ","); }
    if (value != null) { sb.append("value:"); sb.append(value); }
    sb.append("}");
    return sb.toString();
  }
  
}