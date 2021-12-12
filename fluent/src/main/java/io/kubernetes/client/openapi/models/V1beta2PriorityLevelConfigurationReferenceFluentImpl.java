package io.kubernetes.client.openapi.models;

import java.lang.Deprecated;
import io.kubernetes.client.fluent.BaseFluent;
import java.lang.Object;
import java.lang.String;
import java.lang.Boolean;

 /**
  * Generated
  */
public class V1beta2PriorityLevelConfigurationReferenceFluentImpl<A extends io.kubernetes.client.openapi.models.V1beta2PriorityLevelConfigurationReferenceFluent<A>> extends io.kubernetes.client.fluent.BaseFluent<A> implements io.kubernetes.client.openapi.models.V1beta2PriorityLevelConfigurationReferenceFluent<A>{
  public V1beta2PriorityLevelConfigurationReferenceFluentImpl() {
  }
  public V1beta2PriorityLevelConfigurationReferenceFluentImpl(io.kubernetes.client.openapi.models.V1beta2PriorityLevelConfigurationReference instance) {
    this.withName(instance.getName());

  }
  private java.lang.String name;
  public java.lang.String getName() {
    return this.name;
  }
  public A withName(java.lang.String name) {
    this.name=name; return (A) this;
  }
  public java.lang.Boolean hasName() {
    return this.name != null;
  }
  
  /**
   * Method is deprecated. use withName instead.
   */
  @java.lang.Deprecated
  public A withNewName(java.lang.String original) {
    return (A)withName(new String(original));
  }
  public boolean equals(java.lang.Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    V1beta2PriorityLevelConfigurationReferenceFluentImpl that = (V1beta2PriorityLevelConfigurationReferenceFluentImpl) o;
    if (name != null ? !name.equals(that.name) :that.name != null) return false;
    return true;
  }
  public int hashCode() {
    return java.util.Objects.hash(name,  super.hashCode());
  }
  
}