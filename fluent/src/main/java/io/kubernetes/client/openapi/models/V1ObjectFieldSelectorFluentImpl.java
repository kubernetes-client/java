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
  public class V1ObjectFieldSelectorFluentImpl<A extends V1ObjectFieldSelectorFluent<A>> extends BaseFluent<A> implements V1ObjectFieldSelectorFluent<A>{
  public V1ObjectFieldSelectorFluentImpl() {
  }
  public V1ObjectFieldSelectorFluentImpl(V1ObjectFieldSelector instance) {
    this.withApiVersion(instance.getApiVersion());

    this.withFieldPath(instance.getFieldPath());

  }
  private String apiVersion;
  private String fieldPath;
  public String getApiVersion() {
    return this.apiVersion;
  }
  public A withApiVersion(String apiVersion) {
    this.apiVersion=apiVersion; return (A) this;
  }
  public Boolean hasApiVersion() {
    return this.apiVersion != null;
  }
  public String getFieldPath() {
    return this.fieldPath;
  }
  public A withFieldPath(String fieldPath) {
    this.fieldPath=fieldPath; return (A) this;
  }
  public Boolean hasFieldPath() {
    return this.fieldPath != null;
  }
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    V1ObjectFieldSelectorFluentImpl that = (V1ObjectFieldSelectorFluentImpl) o;
    if (apiVersion != null ? !apiVersion.equals(that.apiVersion) :that.apiVersion != null) return false;
    if (fieldPath != null ? !fieldPath.equals(that.fieldPath) :that.fieldPath != null) return false;
    return true;
  }
  public int hashCode() {
    return java.util.Objects.hash(apiVersion,  fieldPath,  super.hashCode());
  }
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (apiVersion != null) { sb.append("apiVersion:"); sb.append(apiVersion + ","); }
    if (fieldPath != null) { sb.append("fieldPath:"); sb.append(fieldPath); }
    sb.append("}");
    return sb.toString();
  }
  
}