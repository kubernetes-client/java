package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.BaseFluent;
import java.lang.Object;
import java.lang.String;
import java.lang.StringBuilder;
import java.lang.SuppressWarnings;
import java.util.Objects;

/**
 * Generated
 */
@SuppressWarnings("unchecked")
public class V1ResourceHealthFluent<A extends io.kubernetes.client.openapi.models.V1ResourceHealthFluent<A>> extends BaseFluent<A>{

  private String health;
  private String resourceID;

  public V1ResourceHealthFluent() {
  }
  
  public V1ResourceHealthFluent(V1ResourceHealth instance) {
    this.copyInstance(instance);
  }

  protected void copyInstance(V1ResourceHealth instance) {
    instance = instance != null ? instance : new V1ResourceHealth();
    if (instance != null) {
        this.withHealth(instance.getHealth());
        this.withResourceID(instance.getResourceID());
    }
  }
  
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || this.getClass() != o.getClass()) {
      return false;
    }
    if (!(super.equals(o))) {
      return false;
    }
    V1ResourceHealthFluent that = (V1ResourceHealthFluent) o;
    if (!(Objects.equals(health, that.health))) {
      return false;
    }
    if (!(Objects.equals(resourceID, that.resourceID))) {
      return false;
    }
    return true;
  }
  
  public String getHealth() {
    return this.health;
  }
  
  public String getResourceID() {
    return this.resourceID;
  }
  
  public boolean hasHealth() {
    return this.health != null;
  }
  
  public boolean hasResourceID() {
    return this.resourceID != null;
  }
  
  public int hashCode() {
    return Objects.hash(health, resourceID);
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (!(health == null)) {
        sb.append("health:");
        sb.append(health);
        sb.append(",");
    }
    if (!(resourceID == null)) {
        sb.append("resourceID:");
        sb.append(resourceID);
    }
    sb.append("}");
    return sb.toString();
  }
  
  public A withHealth(String health) {
    this.health = health;
    return (A) this;
  }
  
  public A withResourceID(String resourceID) {
    this.resourceID = resourceID;
    return (A) this;
  }
  
}