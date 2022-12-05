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
  public class V1SecretEnvSourceFluentImpl<A extends V1SecretEnvSourceFluent<A>> extends BaseFluent<A> implements V1SecretEnvSourceFluent<A>{
  public V1SecretEnvSourceFluentImpl() {
  }
  public V1SecretEnvSourceFluentImpl(V1SecretEnvSource instance) {
    this.withName(instance.getName());

    this.withOptional(instance.getOptional());

  }
  private String name;
  private Boolean optional;
  public String getName() {
    return this.name;
  }
  public A withName(String name) {
    this.name=name; return (A) this;
  }
  public Boolean hasName() {
    return this.name != null;
  }
  public Boolean getOptional() {
    return this.optional;
  }
  public A withOptional(Boolean optional) {
    this.optional=optional; return (A) this;
  }
  public Boolean hasOptional() {
    return this.optional != null;
  }
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    V1SecretEnvSourceFluentImpl that = (V1SecretEnvSourceFluentImpl) o;
    if (name != null ? !name.equals(that.name) :that.name != null) return false;
    if (optional != null ? !optional.equals(that.optional) :that.optional != null) return false;
    return true;
  }
  public int hashCode() {
    return java.util.Objects.hash(name,  optional,  super.hashCode());
  }
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (name != null) { sb.append("name:"); sb.append(name + ","); }
    if (optional != null) { sb.append("optional:"); sb.append(optional); }
    sb.append("}");
    return sb.toString();
  }
  public A withOptional() {
    return withOptional(true);
  }
  
}