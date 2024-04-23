package io.kubernetes.client.openapi.models;

import java.lang.SuppressWarnings;
import io.kubernetes.client.fluent.BaseFluent;
import java.lang.Object;
import java.lang.String;

/**
 * Generated
 */
@SuppressWarnings("unchecked")
public class V1PriorityLevelConfigurationReferenceFluent<A extends V1PriorityLevelConfigurationReferenceFluent<A>> extends BaseFluent<A>{
  public V1PriorityLevelConfigurationReferenceFluent() {
  }
  
  public V1PriorityLevelConfigurationReferenceFluent(V1PriorityLevelConfigurationReference instance) {
    this.copyInstance(instance);
  }
  private String name;
  
  protected void copyInstance(V1PriorityLevelConfigurationReference instance) {
    instance = (instance != null ? instance : new V1PriorityLevelConfigurationReference());
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
    V1PriorityLevelConfigurationReferenceFluent that = (V1PriorityLevelConfigurationReferenceFluent) o;
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