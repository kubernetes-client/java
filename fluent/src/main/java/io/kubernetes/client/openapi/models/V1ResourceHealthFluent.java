package io.kubernetes.client.openapi.models;

import java.lang.SuppressWarnings;
import io.kubernetes.client.fluent.BaseFluent;
import java.lang.Object;
import java.lang.String;

/**
 * Generated
 */
@SuppressWarnings("unchecked")
public class V1ResourceHealthFluent<A extends V1ResourceHealthFluent<A>> extends BaseFluent<A>{
  public V1ResourceHealthFluent() {
  }
  
  public V1ResourceHealthFluent(V1ResourceHealth instance) {
    this.copyInstance(instance);
  }
  private String health;
  private String resourceID;
  
  protected void copyInstance(V1ResourceHealth instance) {
    instance = (instance != null ? instance : new V1ResourceHealth());
    if (instance != null) {
          this.withHealth(instance.getHealth());
          this.withResourceID(instance.getResourceID());
        }
  }
  
  public String getHealth() {
    return this.health;
  }
  
  public A withHealth(String health) {
    this.health = health;
    return (A) this;
  }
  
  public boolean hasHealth() {
    return this.health != null;
  }
  
  public String getResourceID() {
    return this.resourceID;
  }
  
  public A withResourceID(String resourceID) {
    this.resourceID = resourceID;
    return (A) this;
  }
  
  public boolean hasResourceID() {
    return this.resourceID != null;
  }
  
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    V1ResourceHealthFluent that = (V1ResourceHealthFluent) o;
    if (!java.util.Objects.equals(health, that.health)) return false;
    if (!java.util.Objects.equals(resourceID, that.resourceID)) return false;
    return true;
  }
  
  public int hashCode() {
    return java.util.Objects.hash(health,  resourceID,  super.hashCode());
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (health != null) { sb.append("health:"); sb.append(health + ","); }
    if (resourceID != null) { sb.append("resourceID:"); sb.append(resourceID); }
    sb.append("}");
    return sb.toString();
  }
  

}