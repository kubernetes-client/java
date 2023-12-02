package io.kubernetes.client.openapi.models;

import java.lang.SuppressWarnings;
import io.kubernetes.client.fluent.BaseFluent;
import io.kubernetes.client.custom.Quantity;
import java.lang.Object;
import java.lang.String;

/**
 * Generated
 */
@SuppressWarnings("unchecked")
public class V1EmptyDirVolumeSourceFluent<A extends V1EmptyDirVolumeSourceFluent<A>> extends BaseFluent<A>{
  public V1EmptyDirVolumeSourceFluent() {
  }
  
  public V1EmptyDirVolumeSourceFluent(V1EmptyDirVolumeSource instance) {
    this.copyInstance(instance);
  }
  private String medium;
  private Quantity sizeLimit;
  
  protected void copyInstance(V1EmptyDirVolumeSource instance) {
    instance = (instance != null ? instance : new V1EmptyDirVolumeSource());
    if (instance != null) {
          this.withMedium(instance.getMedium());
          this.withSizeLimit(instance.getSizeLimit());
        }
  }
  
  public String getMedium() {
    return this.medium;
  }
  
  public A withMedium(String medium) {
    this.medium = medium;
    return (A) this;
  }
  
  public boolean hasMedium() {
    return this.medium != null;
  }
  
  public Quantity getSizeLimit() {
    return this.sizeLimit;
  }
  
  public A withSizeLimit(Quantity sizeLimit) {
    this.sizeLimit = sizeLimit;
    return (A) this;
  }
  
  public boolean hasSizeLimit() {
    return this.sizeLimit != null;
  }
  
  public A withNewSizeLimit(String value) {
    return (A)withSizeLimit(new Quantity(value));
  }
  
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    V1EmptyDirVolumeSourceFluent that = (V1EmptyDirVolumeSourceFluent) o;
    if (!java.util.Objects.equals(medium, that.medium)) return false;
    if (!java.util.Objects.equals(sizeLimit, that.sizeLimit)) return false;
    return true;
  }
  
  public int hashCode() {
    return java.util.Objects.hash(medium,  sizeLimit,  super.hashCode());
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (medium != null) { sb.append("medium:"); sb.append(medium + ","); }
    if (sizeLimit != null) { sb.append("sizeLimit:"); sb.append(sizeLimit); }
    sb.append("}");
    return sb.toString();
  }
  

}