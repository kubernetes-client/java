package io.kubernetes.client.openapi.models;

import java.lang.SuppressWarnings;
import io.kubernetes.client.fluent.BaseFluent;
import java.lang.Object;
import java.lang.String;

/**
 * Generated
 */
@SuppressWarnings("unchecked")
public class V1ServiceAccountSubjectFluent<A extends V1ServiceAccountSubjectFluent<A>> extends BaseFluent<A>{
  public V1ServiceAccountSubjectFluent() {
  }
  
  public V1ServiceAccountSubjectFluent(V1ServiceAccountSubject instance) {
    this.copyInstance(instance);
  }
  private String name;
  private String namespace;
  
  protected void copyInstance(V1ServiceAccountSubject instance) {
    instance = (instance != null ? instance : new V1ServiceAccountSubject());
    if (instance != null) {
          this.withName(instance.getName());
          this.withNamespace(instance.getNamespace());
        }
  }
  
  public String getName() {
    return this.name;
  }
  
  public A withName(String name) {
    this.name = name;
    return (A) this;
  }
  
  public boolean hasName() {
    return this.name != null;
  }
  
  public String getNamespace() {
    return this.namespace;
  }
  
  public A withNamespace(String namespace) {
    this.namespace = namespace;
    return (A) this;
  }
  
  public boolean hasNamespace() {
    return this.namespace != null;
  }
  
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    V1ServiceAccountSubjectFluent that = (V1ServiceAccountSubjectFluent) o;
    if (!java.util.Objects.equals(name, that.name)) return false;
    if (!java.util.Objects.equals(namespace, that.namespace)) return false;
    return true;
  }
  
  public int hashCode() {
    return java.util.Objects.hash(name,  namespace,  super.hashCode());
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (name != null) { sb.append("name:"); sb.append(name + ","); }
    if (namespace != null) { sb.append("namespace:"); sb.append(namespace); }
    sb.append("}");
    return sb.toString();
  }
  

}