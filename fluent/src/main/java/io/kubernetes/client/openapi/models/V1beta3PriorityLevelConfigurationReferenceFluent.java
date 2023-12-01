package io.kubernetes.client.openapi.models;

import java.lang.SuppressWarnings;
import io.kubernetes.client.fluent.BaseFluent;
import java.lang.Object;
import java.lang.String;

/**
 * Generated
 */
@SuppressWarnings("unchecked")
public class V1beta3PriorityLevelConfigurationReferenceFluent<A extends V1beta3PriorityLevelConfigurationReferenceFluent<A>> extends BaseFluent<A>{
  public V1beta3PriorityLevelConfigurationReferenceFluent() {
  }
  
  public V1beta3PriorityLevelConfigurationReferenceFluent(V1beta3PriorityLevelConfigurationReference instance) {
    this.copyInstance(instance);
  }
  private String name;
  
  protected void copyInstance(V1beta3PriorityLevelConfigurationReference instance) {
    instance = (instance != null ? instance : new V1beta3PriorityLevelConfigurationReference());
    if (instance != null) {
          this.withName(instance.getName());
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
  
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    V1beta3PriorityLevelConfigurationReferenceFluent that = (V1beta3PriorityLevelConfigurationReferenceFluent) o;
    if (!java.util.Objects.equals(name, that.name)) return false;
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