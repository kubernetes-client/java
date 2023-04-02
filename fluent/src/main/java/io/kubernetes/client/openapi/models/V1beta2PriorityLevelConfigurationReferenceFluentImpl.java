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
  public class V1beta2PriorityLevelConfigurationReferenceFluentImpl<A extends V1beta2PriorityLevelConfigurationReferenceFluent<A>> extends BaseFluent<A> implements V1beta2PriorityLevelConfigurationReferenceFluent<A>{
  public V1beta2PriorityLevelConfigurationReferenceFluentImpl() {
  }
  public V1beta2PriorityLevelConfigurationReferenceFluentImpl(V1beta2PriorityLevelConfigurationReference instance) {
    this.withName(instance.getName());

  }
  private String name;
  public String getName() {
    return this.name;
  }
  public A withName(String name) {
    this.name=name; return (A) this;
  }
  public Boolean hasName() {
    return this.name != null;
  }
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    V1beta2PriorityLevelConfigurationReferenceFluentImpl that = (V1beta2PriorityLevelConfigurationReferenceFluentImpl) o;
    if (name != null ? !name.equals(that.name) :that.name != null) return false;
    return true;
  }
  public int hashCode() {
    return java.util.Objects.hash(name,  super.hashCode());
  }
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (name != null) { sb.append("name:"); sb.append(name); }
    sb.append("}");
    return sb.toString();
  }
  
}